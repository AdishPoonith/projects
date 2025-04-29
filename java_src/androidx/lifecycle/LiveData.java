package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f2493k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f2494a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private n.b<o<? super T>, LiveData<T>.c> f2495b = new n.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f2496c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2497d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f2498e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f2499f;

    /* renamed from: g  reason: collision with root package name */
    private int f2500g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2501h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2502i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f2503j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.c implements g {

        /* renamed from: n  reason: collision with root package name */
        final i f2504n;

        LifecycleBoundObserver(i iVar, o<? super T> oVar) {
            super(oVar);
            this.f2504n = iVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f2504n.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean c(i iVar) {
            return this.f2504n == iVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return this.f2504n.a().b().g(e.b.STARTED);
        }

        @Override // androidx.lifecycle.g
        public void q(i iVar, e.a aVar) {
            e.b b10 = this.f2504n.a().b();
            if (b10 == e.b.DESTROYED) {
                LiveData.this.m(this.f2508j);
                return;
            }
            e.b bVar = null;
            while (bVar != b10) {
                a(d());
                bVar = b10;
                b10 = this.f2504n.a().b();
            }
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2494a) {
                obj = LiveData.this.f2499f;
                LiveData.this.f2499f = LiveData.f2493k;
            }
            LiveData.this.n(obj);
        }
    }

    /* loaded from: classes.dex */
    private class b extends LiveData<T>.c {
        b(o<? super T> oVar) {
            super(oVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean d() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: j  reason: collision with root package name */
        final o<? super T> f2508j;

        /* renamed from: k  reason: collision with root package name */
        boolean f2509k;

        /* renamed from: l  reason: collision with root package name */
        int f2510l = -1;

        c(o<? super T> oVar) {
            this.f2508j = oVar;
        }

        void a(boolean z10) {
            if (z10 == this.f2509k) {
                return;
            }
            this.f2509k = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f2509k) {
                LiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean c(i iVar) {
            return false;
        }

        abstract boolean d();
    }

    public LiveData() {
        Object obj = f2493k;
        this.f2499f = obj;
        this.f2503j = new a();
        this.f2498e = obj;
        this.f2500g = -1;
    }

    static void b(String str) {
        if (m.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f2509k) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f2510l;
            int i11 = this.f2500g;
            if (i10 >= i11) {
                return;
            }
            cVar.f2510l = i11;
            cVar.f2508j.a((Object) this.f2498e);
        }
    }

    void c(int i10) {
        int i11 = this.f2496c;
        this.f2496c = i10 + i11;
        if (this.f2497d) {
            return;
        }
        this.f2497d = true;
        while (true) {
            try {
                int i12 = this.f2496c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } finally {
                this.f2497d = false;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f2501h) {
            this.f2502i = true;
            return;
        }
        this.f2501h = true;
        do {
            this.f2502i = false;
            if (cVar == null) {
                n.b<o<? super T>, LiveData<T>.c>.d k10 = this.f2495b.k();
                while (k10.hasNext()) {
                    d((c) k10.next().getValue());
                    if (this.f2502i) {
                        break;
                    }
                }
            } else {
                d(cVar);
                cVar = null;
            }
        } while (this.f2502i);
        this.f2501h = false;
    }

    public T f() {
        T t10 = (T) this.f2498e;
        if (t10 != f2493k) {
            return t10;
        }
        return null;
    }

    public boolean g() {
        return this.f2496c > 0;
    }

    public void h(i iVar, o<? super T> oVar) {
        b("observe");
        if (iVar.a().b() == e.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
        LiveData<T>.c p10 = this.f2495b.p(oVar, lifecycleBoundObserver);
        if (p10 != null && !p10.c(iVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (p10 != null) {
            return;
        }
        iVar.a().a(lifecycleBoundObserver);
    }

    public void i(o<? super T> oVar) {
        b("observeForever");
        b bVar = new b(oVar);
        LiveData<T>.c p10 = this.f2495b.p(oVar, bVar);
        if (p10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (p10 != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(T t10) {
        boolean z10;
        synchronized (this.f2494a) {
            z10 = this.f2499f == f2493k;
            this.f2499f = t10;
        }
        if (z10) {
            m.c.f().c(this.f2503j);
        }
    }

    public void m(o<? super T> oVar) {
        b("removeObserver");
        LiveData<T>.c q10 = this.f2495b.q(oVar);
        if (q10 == null) {
            return;
        }
        q10.b();
        q10.a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(T t10) {
        b("setValue");
        this.f2500g++;
        this.f2498e = t10;
        e(null);
    }
}
