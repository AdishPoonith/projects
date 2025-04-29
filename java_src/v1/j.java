package v1;

import java.util.ArrayDeque;
import v1.f;
import v1.g;
import v1.h;
/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f19379a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19380b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f19381c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f19382d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f19383e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f19384f;

    /* renamed from: g  reason: collision with root package name */
    private int f19385g;

    /* renamed from: h  reason: collision with root package name */
    private int f19386h;

    /* renamed from: i  reason: collision with root package name */
    private I f19387i;

    /* renamed from: j  reason: collision with root package name */
    private E f19388j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f19389k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f19390l;

    /* renamed from: m  reason: collision with root package name */
    private int f19391m;

    /* loaded from: classes.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(I[] iArr, O[] oArr) {
        this.f19383e = iArr;
        this.f19385g = iArr.length;
        for (int i10 = 0; i10 < this.f19385g; i10++) {
            this.f19383e[i10] = h();
        }
        this.f19384f = oArr;
        this.f19386h = oArr.length;
        for (int i11 = 0; i11 < this.f19386h; i11++) {
            this.f19384f[i11] = i();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f19379a = aVar;
        aVar.start();
    }

    private boolean g() {
        return !this.f19381c.isEmpty() && this.f19386h > 0;
    }

    private boolean l() {
        E j10;
        synchronized (this.f19380b) {
            while (!this.f19390l && !g()) {
                this.f19380b.wait();
            }
            if (this.f19390l) {
                return false;
            }
            I removeFirst = this.f19381c.removeFirst();
            O[] oArr = this.f19384f;
            int i10 = this.f19386h - 1;
            this.f19386h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f19389k;
            this.f19389k = false;
            if (removeFirst.r()) {
                o10.k(4);
            } else {
                if (removeFirst.q()) {
                    o10.k(Integer.MIN_VALUE);
                }
                if (removeFirst.s()) {
                    o10.k(134217728);
                }
                try {
                    j10 = k(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    j10 = j(e10);
                }
                if (j10 != null) {
                    synchronized (this.f19380b) {
                        this.f19388j = j10;
                    }
                    return false;
                }
            }
            synchronized (this.f19380b) {
                if (!this.f19389k) {
                    if (o10.q()) {
                        this.f19391m++;
                    } else {
                        o10.f19373l = this.f19391m;
                        this.f19391m = 0;
                        this.f19382d.addLast(o10);
                        r(removeFirst);
                    }
                }
                o10.w();
                r(removeFirst);
            }
            return true;
        }
    }

    private void o() {
        if (g()) {
            this.f19380b.notify();
        }
    }

    private void p() {
        E e10 = this.f19388j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void r(I i10) {
        i10.l();
        I[] iArr = this.f19383e;
        int i11 = this.f19385g;
        this.f19385g = i11 + 1;
        iArr[i11] = i10;
    }

    private void t(O o10) {
        o10.l();
        O[] oArr = this.f19384f;
        int i10 = this.f19386h;
        this.f19386h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (l());
    }

    @Override // v1.d
    public void a() {
        synchronized (this.f19380b) {
            this.f19390l = true;
            this.f19380b.notify();
        }
        try {
            this.f19379a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // v1.d
    public final void flush() {
        synchronized (this.f19380b) {
            this.f19389k = true;
            this.f19391m = 0;
            I i10 = this.f19387i;
            if (i10 != null) {
                r(i10);
                this.f19387i = null;
            }
            while (!this.f19381c.isEmpty()) {
                r(this.f19381c.removeFirst());
            }
            while (!this.f19382d.isEmpty()) {
                this.f19382d.removeFirst().w();
            }
        }
    }

    protected abstract I h();

    protected abstract O i();

    protected abstract E j(Throwable th);

    protected abstract E k(I i10, O o10, boolean z10);

    @Override // v1.d
    /* renamed from: m */
    public final I e() {
        I i10;
        synchronized (this.f19380b) {
            p();
            p3.a.f(this.f19387i == null);
            int i11 = this.f19385g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f19383e;
                int i12 = i11 - 1;
                this.f19385g = i12;
                i10 = iArr[i12];
            }
            this.f19387i = i10;
        }
        return i10;
    }

    @Override // v1.d
    /* renamed from: n */
    public final O d() {
        synchronized (this.f19380b) {
            p();
            if (this.f19382d.isEmpty()) {
                return null;
            }
            return this.f19382d.removeFirst();
        }
    }

    @Override // v1.d
    /* renamed from: q */
    public final void c(I i10) {
        synchronized (this.f19380b) {
            p();
            p3.a.a(i10 == this.f19387i);
            this.f19381c.addLast(i10);
            o();
            this.f19387i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(O o10) {
        synchronized (this.f19380b) {
            t(o10);
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i10) {
        p3.a.f(this.f19385g == this.f19383e.length);
        for (I i11 : this.f19383e) {
            i11.x(i10);
        }
    }
}
