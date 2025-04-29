package j6;

import android.content.Context;
import l6.f4;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private l6.e1 f12209a;

    /* renamed from: b  reason: collision with root package name */
    private l6.i0 f12210b;

    /* renamed from: c  reason: collision with root package name */
    private f1 f12211c;

    /* renamed from: d  reason: collision with root package name */
    private p6.p0 f12212d;

    /* renamed from: e  reason: collision with root package name */
    private p f12213e;

    /* renamed from: f  reason: collision with root package name */
    private p6.l f12214f;

    /* renamed from: g  reason: collision with root package name */
    private l6.k f12215g;

    /* renamed from: h  reason: collision with root package name */
    private f4 f12216h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f12217a;

        /* renamed from: b  reason: collision with root package name */
        private final q6.g f12218b;

        /* renamed from: c  reason: collision with root package name */
        private final m f12219c;

        /* renamed from: d  reason: collision with root package name */
        private final p6.o f12220d;

        /* renamed from: e  reason: collision with root package name */
        private final h6.j f12221e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12222f;

        /* renamed from: g  reason: collision with root package name */
        private final com.google.firebase.firestore.a0 f12223g;

        public a(Context context, q6.g gVar, m mVar, p6.o oVar, h6.j jVar, int i10, com.google.firebase.firestore.a0 a0Var) {
            this.f12217a = context;
            this.f12218b = gVar;
            this.f12219c = mVar;
            this.f12220d = oVar;
            this.f12221e = jVar;
            this.f12222f = i10;
            this.f12223g = a0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public q6.g a() {
            return this.f12218b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Context b() {
            return this.f12217a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public m c() {
            return this.f12219c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public p6.o d() {
            return this.f12220d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public h6.j e() {
            return this.f12221e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int f() {
            return this.f12222f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public com.google.firebase.firestore.a0 g() {
            return this.f12223g;
        }
    }

    protected abstract p6.l a(a aVar);

    protected abstract p b(a aVar);

    protected abstract f4 c(a aVar);

    protected abstract l6.k d(a aVar);

    protected abstract l6.i0 e(a aVar);

    protected abstract l6.e1 f(a aVar);

    protected abstract p6.p0 g(a aVar);

    protected abstract f1 h(a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public p6.l i() {
        return (p6.l) q6.b.e(this.f12214f, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public p j() {
        return (p) q6.b.e(this.f12213e, "eventManager not initialized yet", new Object[0]);
    }

    public f4 k() {
        return this.f12216h;
    }

    public l6.k l() {
        return this.f12215g;
    }

    public l6.i0 m() {
        return (l6.i0) q6.b.e(this.f12210b, "localStore not initialized yet", new Object[0]);
    }

    public l6.e1 n() {
        return (l6.e1) q6.b.e(this.f12209a, "persistence not initialized yet", new Object[0]);
    }

    public p6.p0 o() {
        return (p6.p0) q6.b.e(this.f12212d, "remoteStore not initialized yet", new Object[0]);
    }

    public f1 p() {
        return (f1) q6.b.e(this.f12211c, "syncEngine not initialized yet", new Object[0]);
    }

    public void q(a aVar) {
        l6.e1 f10 = f(aVar);
        this.f12209a = f10;
        f10.m();
        this.f12210b = e(aVar);
        this.f12214f = a(aVar);
        this.f12212d = g(aVar);
        this.f12211c = h(aVar);
        this.f12213e = b(aVar);
        this.f12210b.m0();
        this.f12212d.P();
        this.f12216h = c(aVar);
        this.f12215g = d(aVar);
    }
}
