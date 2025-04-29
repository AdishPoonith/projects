package i9;

import i9.g;
import java.util.List;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object, Object> f9914a = new a();

    /* loaded from: classes.dex */
    class a extends g<Object, Object> {
        a() {
        }

        @Override // i9.g
        public void a(String str, Throwable th) {
        }

        @Override // i9.g
        public void b() {
        }

        @Override // i9.g
        public void c(int i10) {
        }

        @Override // i9.g
        public void d(Object obj) {
        }

        @Override // i9.g
        public void e(g.a<Object> aVar, y0 y0Var) {
        }
    }

    /* loaded from: classes.dex */
    private static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final d f9915a;

        /* renamed from: b  reason: collision with root package name */
        private final h f9916b;

        private b(d dVar, h hVar) {
            this.f9915a = dVar;
            this.f9916b = (h) b5.n.o(hVar, "interceptor");
        }

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        @Override // i9.d
        public String b() {
            return this.f9915a.b();
        }

        @Override // i9.d
        public <ReqT, RespT> g<ReqT, RespT> e(z0<ReqT, RespT> z0Var, c cVar) {
            return this.f9916b.a(z0Var, cVar, this.f9915a);
        }
    }

    public static d a(d dVar, List<? extends h> list) {
        b5.n.o(dVar, "channel");
        for (h hVar : list) {
            dVar = new b(dVar, hVar, null);
        }
        return dVar;
    }
}
