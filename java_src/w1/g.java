package w1;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.g0;
import t1.t1;
import w1.g0;
import w1.m;
import w1.o;
import w1.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: a  reason: collision with root package name */
    public final List<m.b> f19623a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f19624b;

    /* renamed from: c  reason: collision with root package name */
    private final a f19625c;

    /* renamed from: d  reason: collision with root package name */
    private final b f19626d;

    /* renamed from: e  reason: collision with root package name */
    private final int f19627e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f19628f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f19629g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f19630h;

    /* renamed from: i  reason: collision with root package name */
    private final p3.i<w.a> f19631i;

    /* renamed from: j  reason: collision with root package name */
    private final o3.g0 f19632j;

    /* renamed from: k  reason: collision with root package name */
    private final t1 f19633k;

    /* renamed from: l  reason: collision with root package name */
    private final n0 f19634l;

    /* renamed from: m  reason: collision with root package name */
    private final UUID f19635m;

    /* renamed from: n  reason: collision with root package name */
    private final Looper f19636n;

    /* renamed from: o  reason: collision with root package name */
    private final e f19637o;

    /* renamed from: p  reason: collision with root package name */
    private int f19638p;

    /* renamed from: q  reason: collision with root package name */
    private int f19639q;

    /* renamed from: r  reason: collision with root package name */
    private HandlerThread f19640r;

    /* renamed from: s  reason: collision with root package name */
    private c f19641s;

    /* renamed from: t  reason: collision with root package name */
    private v1.b f19642t;

    /* renamed from: u  reason: collision with root package name */
    private o.a f19643u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f19644v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f19645w;

    /* renamed from: x  reason: collision with root package name */
    private g0.a f19646x;

    /* renamed from: y  reason: collision with root package name */
    private g0.d f19647y;

    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);

        void b();

        void c(Exception exc, boolean z10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(g gVar, int i10);

        void b(g gVar, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f19648a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, o0 o0Var) {
            d dVar = (d) message.obj;
            if (dVar.f19651b) {
                int i10 = dVar.f19654e + 1;
                dVar.f19654e = i10;
                if (i10 > g.this.f19632j.d(3)) {
                    return false;
                }
                long b10 = g.this.f19632j.b(new g0.c(new u2.n(dVar.f19650a, o0Var.f19736j, o0Var.f19737k, o0Var.f19738l, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f19652c, o0Var.f19739m), new u2.q(3), o0Var.getCause() instanceof IOException ? (IOException) o0Var.getCause() : new f(o0Var.getCause()), dVar.f19654e));
                if (b10 == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    if (this.f19648a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b10);
                    return true;
                }
            }
            return false;
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(u2.n.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f19648a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    bArr = g.this.f19634l.b(g.this.f19635m, (g0.d) dVar.f19653d);
                } else if (i10 != 1) {
                    throw new RuntimeException();
                } else {
                    bArr = g.this.f19634l.a(g.this.f19635m, (g0.a) dVar.f19653d);
                }
            } catch (o0 e10) {
                boolean a10 = a(message, e10);
                bArr = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                p3.r.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                bArr = e11;
            }
            g.this.f19632j.a(dVar.f19650a);
            synchronized (this) {
                if (!this.f19648a) {
                    g.this.f19637o.obtainMessage(message.what, Pair.create(dVar.f19653d, bArr)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f19650a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19651b;

        /* renamed from: c  reason: collision with root package name */
        public final long f19652c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f19653d;

        /* renamed from: e  reason: collision with root package name */
        public int f19654e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f19650a = j10;
            this.f19651b = z10;
            this.f19652c = j11;
            this.f19653d = obj;
        }
    }

    /* loaded from: classes.dex */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                g.this.E(obj, obj2);
            } else if (i10 != 1) {
            } else {
                g.this.y(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public g(UUID uuid, g0 g0Var, a aVar, b bVar, List<m.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, n0 n0Var, Looper looper, o3.g0 g0Var2, t1 t1Var) {
        List<m.b> unmodifiableList;
        if (i10 == 1 || i10 == 3) {
            p3.a.e(bArr);
        }
        this.f19635m = uuid;
        this.f19625c = aVar;
        this.f19626d = bVar;
        this.f19624b = g0Var;
        this.f19627e = i10;
        this.f19628f = z10;
        this.f19629g = z11;
        if (bArr != null) {
            this.f19645w = bArr;
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList((List) p3.a.e(list));
        }
        this.f19623a = unmodifiableList;
        this.f19630h = hashMap;
        this.f19634l = n0Var;
        this.f19631i = new p3.i<>();
        this.f19632j = g0Var2;
        this.f19633k = t1Var;
        this.f19638p = 2;
        this.f19636n = looper;
        this.f19637o = new e(looper);
    }

    private void A() {
        if (this.f19627e == 0 && this.f19638p == 4) {
            p3.n0.j(this.f19644v);
            r(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Object obj, Object obj2) {
        if (obj == this.f19647y) {
            if (this.f19638p == 2 || u()) {
                this.f19647y = null;
                if (obj2 instanceof Exception) {
                    this.f19625c.c((Exception) obj2, false);
                    return;
                }
                try {
                    this.f19624b.i((byte[]) obj2);
                    this.f19625c.b();
                } catch (Exception e10) {
                    this.f19625c.c(e10, true);
                }
            }
        }
    }

    private boolean F() {
        if (u()) {
            return true;
        }
        try {
            byte[] n10 = this.f19624b.n();
            this.f19644v = n10;
            this.f19624b.f(n10, this.f19633k);
            this.f19642t = this.f19624b.m(this.f19644v);
            this.f19638p = 3;
            q(new p3.h() { // from class: w1.b
                @Override // p3.h
                public final void accept(Object obj) {
                    ((w.a) obj).k(r1);
                }
            });
            p3.a.e(this.f19644v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f19625c.a(this);
            return false;
        } catch (Exception e10) {
            x(e10, 1);
            return false;
        }
    }

    private void G(byte[] bArr, int i10, boolean z10) {
        try {
            this.f19646x = this.f19624b.j(bArr, this.f19623a, i10, this.f19630h);
            ((c) p3.n0.j(this.f19641s)).b(1, p3.a.e(this.f19646x), z10);
        } catch (Exception e10) {
            z(e10, true);
        }
    }

    private boolean I() {
        try {
            this.f19624b.c(this.f19644v, this.f19645w);
            return true;
        } catch (Exception e10) {
            x(e10, 1);
            return false;
        }
    }

    private void J() {
        if (Thread.currentThread() != this.f19636n.getThread()) {
            p3.r.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f19636n.getThread().getName(), new IllegalStateException());
        }
    }

    private void q(p3.h<w.a> hVar) {
        for (w.a aVar : this.f19631i.i()) {
            hVar.accept(aVar);
        }
    }

    private void r(boolean z10) {
        if (this.f19629g) {
            return;
        }
        byte[] bArr = (byte[]) p3.n0.j(this.f19644v);
        int i10 = this.f19627e;
        if (i10 == 0 || i10 == 1) {
            if (this.f19645w == null) {
                G(bArr, 1, z10);
                return;
            } else if (this.f19638p != 4 && !I()) {
                return;
            } else {
                long s10 = s();
                if (this.f19627e != 0 || s10 > 60) {
                    if (s10 <= 0) {
                        x(new m0(), 2);
                        return;
                    }
                    this.f19638p = 4;
                    q(new p3.h() { // from class: w1.f
                        @Override // p3.h
                        public final void accept(Object obj) {
                            ((w.a) obj).j();
                        }
                    });
                    return;
                }
                p3.r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + s10);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            p3.a.e(this.f19645w);
            p3.a.e(this.f19644v);
            G(this.f19645w, 3, z10);
            return;
        } else if (this.f19645w != null && !I()) {
            return;
        }
        G(bArr, 2, z10);
    }

    private long s() {
        if (s1.i.f17254d.equals(this.f19635m)) {
            Pair pair = (Pair) p3.a.e(q0.b(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    private boolean u() {
        int i10 = this.f19638p;
        return i10 == 3 || i10 == 4;
    }

    private void x(final Exception exc, int i10) {
        this.f19643u = new o.a(exc, c0.a(exc, i10));
        p3.r.d("DefaultDrmSession", "DRM session error", exc);
        q(new p3.h() { // from class: w1.c
            @Override // p3.h
            public final void accept(Object obj) {
                ((w.a) obj).l(exc);
            }
        });
        if (this.f19638p != 4) {
            this.f19638p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Object obj, Object obj2) {
        p3.h<w.a> hVar;
        if (obj == this.f19646x && u()) {
            this.f19646x = null;
            if (obj2 instanceof Exception) {
                z((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f19627e == 3) {
                    this.f19624b.g((byte[]) p3.n0.j(this.f19645w), bArr);
                    hVar = new p3.h() { // from class: w1.e
                        @Override // p3.h
                        public final void accept(Object obj3) {
                            ((w.a) obj3).i();
                        }
                    };
                } else {
                    byte[] g10 = this.f19624b.g(this.f19644v, bArr);
                    int i10 = this.f19627e;
                    if ((i10 == 2 || (i10 == 0 && this.f19645w != null)) && g10 != null && g10.length != 0) {
                        this.f19645w = g10;
                    }
                    this.f19638p = 4;
                    hVar = new p3.h() { // from class: w1.d
                        @Override // p3.h
                        public final void accept(Object obj3) {
                            ((w.a) obj3).h();
                        }
                    };
                }
                q(hVar);
            } catch (Exception e10) {
                z(e10, true);
            }
        }
    }

    private void z(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f19625c.a(this);
        } else {
            x(exc, z10 ? 1 : 2);
        }
    }

    public void B(int i10) {
        if (i10 != 2) {
            return;
        }
        A();
    }

    public void C() {
        if (F()) {
            r(true);
        }
    }

    public void D(Exception exc, boolean z10) {
        x(exc, z10 ? 1 : 3);
    }

    public void H() {
        this.f19647y = this.f19624b.h();
        ((c) p3.n0.j(this.f19641s)).b(0, p3.a.e(this.f19647y), true);
    }

    @Override // w1.o
    public final o.a a() {
        J();
        if (this.f19638p == 1) {
            return this.f19643u;
        }
        return null;
    }

    @Override // w1.o
    public boolean b() {
        J();
        return this.f19628f;
    }

    @Override // w1.o
    public Map<String, String> c() {
        J();
        byte[] bArr = this.f19644v;
        if (bArr == null) {
            return null;
        }
        return this.f19624b.d(bArr);
    }

    @Override // w1.o
    public void d(w.a aVar) {
        J();
        int i10 = this.f19639q;
        if (i10 <= 0) {
            p3.r.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f19639q = i11;
        if (i11 == 0) {
            this.f19638p = 0;
            ((e) p3.n0.j(this.f19637o)).removeCallbacksAndMessages(null);
            ((c) p3.n0.j(this.f19641s)).c();
            this.f19641s = null;
            ((HandlerThread) p3.n0.j(this.f19640r)).quit();
            this.f19640r = null;
            this.f19642t = null;
            this.f19643u = null;
            this.f19646x = null;
            this.f19647y = null;
            byte[] bArr = this.f19644v;
            if (bArr != null) {
                this.f19624b.e(bArr);
                this.f19644v = null;
            }
        }
        if (aVar != null) {
            this.f19631i.k(aVar);
            if (this.f19631i.e(aVar) == 0) {
                aVar.m();
            }
        }
        this.f19626d.a(this, this.f19639q);
    }

    @Override // w1.o
    public final UUID e() {
        J();
        return this.f19635m;
    }

    @Override // w1.o
    public void f(w.a aVar) {
        J();
        if (this.f19639q < 0) {
            p3.r.c("DefaultDrmSession", "Session reference count less than zero: " + this.f19639q);
            this.f19639q = 0;
        }
        if (aVar != null) {
            this.f19631i.b(aVar);
        }
        int i10 = this.f19639q + 1;
        this.f19639q = i10;
        if (i10 == 1) {
            p3.a.f(this.f19638p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f19640r = handlerThread;
            handlerThread.start();
            this.f19641s = new c(this.f19640r.getLooper());
            if (F()) {
                r(true);
            }
        } else if (aVar != null && u() && this.f19631i.e(aVar) == 1) {
            aVar.k(this.f19638p);
        }
        this.f19626d.b(this, this.f19639q);
    }

    @Override // w1.o
    public boolean g(String str) {
        J();
        return this.f19624b.b((byte[]) p3.a.h(this.f19644v), str);
    }

    @Override // w1.o
    public final int getState() {
        J();
        return this.f19638p;
    }

    @Override // w1.o
    public final v1.b h() {
        J();
        return this.f19642t;
    }

    public boolean t(byte[] bArr) {
        J();
        return Arrays.equals(this.f19644v, bArr);
    }
}
