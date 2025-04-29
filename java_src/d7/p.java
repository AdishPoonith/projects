package d7;

import i9.z0;
import p9.b;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile z0<d, e> f7846a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile z0<f, g> f7847b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile z0<u, v> f7848c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile z0<d0, e0> f7849d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile z0<q, r> f7850e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.a<b> {
        a() {
        }

        @Override // p9.b.a
        /* renamed from: b */
        public b a(i9.d dVar, i9.c cVar) {
            return new b(dVar, cVar, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends p9.a<b> {
        private b(i9.d dVar, i9.c cVar) {
            super(dVar, cVar);
        }

        /* synthetic */ b(i9.d dVar, i9.c cVar, a aVar) {
            this(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p9.b
        /* renamed from: g */
        public b a(i9.d dVar, i9.c cVar) {
            return new b(dVar, cVar);
        }
    }

    private p() {
    }

    public static z0<d, e> a() {
        z0<d, e> z0Var = f7846a;
        if (z0Var == null) {
            synchronized (p.class) {
                z0Var = f7846a;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.SERVER_STREAMING).b(z0.b("google.firestore.v1.Firestore", "BatchGetDocuments")).e(true).c(o9.b.b(d.j0())).d(o9.b.b(e.f0())).a();
                    f7846a = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<f, g> b() {
        z0<f, g> z0Var = f7847b;
        if (z0Var == null) {
            synchronized (p.class) {
                z0Var = f7847b;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.UNARY).b(z0.b("google.firestore.v1.Firestore", "Commit")).e(true).c(o9.b.b(f.j0())).d(o9.b.b(g.g0())).a();
                    f7847b = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<q, r> c() {
        z0<q, r> z0Var = f7850e;
        if (z0Var == null) {
            synchronized (p.class) {
                z0Var = f7850e;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.BIDI_STREAMING).b(z0.b("google.firestore.v1.Firestore", "Listen")).e(true).c(o9.b.b(q.j0())).d(o9.b.b(r.f0())).a();
                    f7850e = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<u, v> d() {
        z0<u, v> z0Var = f7848c;
        if (z0Var == null) {
            synchronized (p.class) {
                z0Var = f7848c;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.SERVER_STREAMING).b(z0.b("google.firestore.v1.Firestore", "RunAggregationQuery")).e(true).c(o9.b.b(u.h0())).d(o9.b.b(v.f0())).a();
                    f7848c = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static z0<d0, e0> e() {
        z0<d0, e0> z0Var = f7849d;
        if (z0Var == null) {
            synchronized (p.class) {
                z0Var = f7849d;
                if (z0Var == null) {
                    z0Var = z0.g().f(z0.d.BIDI_STREAMING).b(z0.b("google.firestore.v1.Firestore", "Write")).e(true).c(o9.b.b(d0.k0())).d(o9.b.b(e0.g0())).a();
                    f7849d = z0Var;
                }
            }
        }
        return z0Var;
    }

    public static b f(i9.d dVar) {
        return (b) p9.a.e(new a(), dVar);
    }
}
