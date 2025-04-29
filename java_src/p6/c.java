package p6;

import i9.j1;
import i9.y0;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p6.c;
import p6.r0;
import q6.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c<ReqT, RespT, CallbackT extends r0> {

    /* renamed from: n  reason: collision with root package name */
    private static final long f15533n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f15534o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f15535p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f15536q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f15537r;

    /* renamed from: a  reason: collision with root package name */
    private g.b f15538a;

    /* renamed from: b  reason: collision with root package name */
    private g.b f15539b;

    /* renamed from: c  reason: collision with root package name */
    private final w f15540c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.z0<ReqT, RespT> f15541d;

    /* renamed from: f  reason: collision with root package name */
    private final q6.g f15543f;

    /* renamed from: g  reason: collision with root package name */
    private final g.d f15544g;

    /* renamed from: h  reason: collision with root package name */
    private final g.d f15545h;

    /* renamed from: k  reason: collision with root package name */
    private i9.g<ReqT, RespT> f15548k;

    /* renamed from: l  reason: collision with root package name */
    final q6.r f15549l;

    /* renamed from: m  reason: collision with root package name */
    final CallbackT f15550m;

    /* renamed from: i  reason: collision with root package name */
    private q0 f15546i = q0.Initial;

    /* renamed from: j  reason: collision with root package name */
    private long f15547j = 0;

    /* renamed from: e  reason: collision with root package name */
    private final c<ReqT, RespT, CallbackT>.b f15542e = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f15551a;

        a(long j10) {
            this.f15551a = j10;
        }

        void a(Runnable runnable) {
            c.this.f15543f.w();
            if (c.this.f15547j == this.f15551a) {
                runnable.run();
            } else {
                q6.v.a(c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0226c implements h0<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final c<ReqT, RespT, CallbackT>.a f15554a;

        C0226c(c<ReqT, RespT, CallbackT>.a aVar) {
            this.f15554a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(j1 j1Var) {
            if (j1Var.o()) {
                q6.v.a(c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(c.this)));
            } else {
                q6.v.e(c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(c.this)), j1Var);
            }
            c.this.k(j1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(i9.y0 y0Var) {
            if (q6.v.c()) {
                HashMap hashMap = new HashMap();
                for (String str : y0Var.j()) {
                    if (o.f15628e.contains(str.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(str, (String) y0Var.g(y0.g.e(str, i9.y0.f10075e)));
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                q6.v.a(c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(c.this)), hashMap);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Object obj) {
            if (q6.v.c()) {
                q6.v.a(c.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(c.this)), obj);
            }
            c.this.r(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            q6.v.a(c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(c.this)));
            c.this.s();
        }

        @Override // p6.h0
        public void a(final j1 j1Var) {
            this.f15554a.a(new Runnable() { // from class: p6.f
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0226c.this.i(j1Var);
                }
            });
        }

        @Override // p6.h0
        public void b() {
            this.f15554a.a(new Runnable() { // from class: p6.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0226c.this.l();
                }
            });
        }

        @Override // p6.h0
        public void c(final i9.y0 y0Var) {
            this.f15554a.a(new Runnable() { // from class: p6.e
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0226c.this.j(y0Var);
                }
            });
        }

        @Override // p6.h0
        public void d(final RespT respt) {
            this.f15554a.a(new Runnable() { // from class: p6.g
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0226c.this.k(respt);
                }
            });
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f15533n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f15534o = timeUnit2.toMillis(1L);
        f15535p = timeUnit2.toMillis(1L);
        f15536q = timeUnit.toMillis(10L);
        f15537r = timeUnit.toMillis(10L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(w wVar, i9.z0<ReqT, RespT> z0Var, q6.g gVar, g.d dVar, g.d dVar2, g.d dVar3, CallbackT callbackt) {
        this.f15540c = wVar;
        this.f15541d = z0Var;
        this.f15543f = gVar;
        this.f15544g = dVar2;
        this.f15545h = dVar3;
        this.f15550m = callbackt;
        this.f15549l = new q6.r(gVar, dVar, f15533n, 1.5d, f15534o);
    }

    private void g() {
        g.b bVar = this.f15538a;
        if (bVar != null) {
            bVar.c();
            this.f15538a = null;
        }
    }

    private void h() {
        g.b bVar = this.f15539b;
        if (bVar != null) {
            bVar.c();
            this.f15539b = null;
        }
    }

    private void i(q0 q0Var, j1 j1Var) {
        q6.b.d(n(), "Only started streams should be closed.", new Object[0]);
        q0 q0Var2 = q0.Error;
        q6.b.d(q0Var == q0Var2 || j1Var.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f15543f.w();
        if (o.i(j1Var)) {
            q6.g0.p(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", j1Var.l()));
        }
        h();
        g();
        this.f15549l.c();
        this.f15547j++;
        j1.b m10 = j1Var.m();
        if (m10 == j1.b.OK) {
            this.f15549l.f();
        } else if (m10 == j1.b.RESOURCE_EXHAUSTED) {
            q6.v.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f15549l.g();
        } else if (m10 == j1.b.UNAUTHENTICATED && this.f15546i != q0.Healthy) {
            this.f15540c.h();
        } else if (m10 == j1.b.UNAVAILABLE && ((j1Var.l() instanceof UnknownHostException) || (j1Var.l() instanceof ConnectException))) {
            this.f15549l.h(f15537r);
        }
        if (q0Var != q0Var2) {
            q6.v.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            w();
        }
        if (this.f15548k != null) {
            if (j1Var.o()) {
                q6.v.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f15548k.b();
            }
            this.f15548k = null;
        }
        this.f15546i = q0Var;
        this.f15550m.a(j1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (m()) {
            i(q0.Initial, j1.f9923f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (m()) {
            this.f15546i = q0.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        q0 q0Var = this.f15546i;
        q6.b.d(q0Var == q0.Backoff, "State should still be backoff but was %s", q0Var);
        this.f15546i = q0.Initial;
        u();
        q6.b.d(n(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.f15546i = q0.Open;
        this.f15550m.b();
        if (this.f15538a == null) {
            this.f15538a = this.f15543f.k(this.f15545h, f15536q, new Runnable() { // from class: p6.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.o();
                }
            });
        }
    }

    private void t() {
        q6.b.d(this.f15546i == q0.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f15546i = q0.Backoff;
        this.f15549l.b(new Runnable() { // from class: p6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.p();
            }
        });
    }

    void k(j1 j1Var) {
        q6.b.d(n(), "Can't handle server close on non-started stream!", new Object[0]);
        i(q0.Error, j1Var);
    }

    public void l() {
        q6.b.d(!n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f15543f.w();
        this.f15546i = q0.Initial;
        this.f15549l.f();
    }

    public boolean m() {
        this.f15543f.w();
        q0 q0Var = this.f15546i;
        return q0Var == q0.Open || q0Var == q0.Healthy;
    }

    public boolean n() {
        this.f15543f.w();
        q0 q0Var = this.f15546i;
        return q0Var == q0.Starting || q0Var == q0.Backoff || m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        if (m() && this.f15539b == null) {
            this.f15539b = this.f15543f.k(this.f15544g, f15535p, this.f15542e);
        }
    }

    public abstract void r(RespT respt);

    public void u() {
        this.f15543f.w();
        q6.b.d(this.f15548k == null, "Last call still set", new Object[0]);
        q6.b.d(this.f15539b == null, "Idle timer still set", new Object[0]);
        q0 q0Var = this.f15546i;
        if (q0Var == q0.Error) {
            t();
            return;
        }
        q6.b.d(q0Var == q0.Initial, "Already started", new Object[0]);
        this.f15548k = this.f15540c.m(this.f15541d, new C0226c(new a(this.f15547j)));
        this.f15546i = q0.Starting;
    }

    public void v() {
        if (n()) {
            i(q0.Initial, j1.f9923f);
        }
    }

    protected void w() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(ReqT reqt) {
        this.f15543f.w();
        q6.v.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        h();
        this.f15548k.d(reqt);
    }
}
