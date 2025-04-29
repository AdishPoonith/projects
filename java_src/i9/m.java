package i9;

import i9.b;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class m extends i9.b {

    /* renamed from: a  reason: collision with root package name */
    private final i9.b f9977a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.b f9978b;

    /* loaded from: classes.dex */
    private static final class a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f9979a;

        /* renamed from: b  reason: collision with root package name */
        private final y0 f9980b;

        public a(b.a aVar, y0 y0Var) {
            this.f9979a = aVar;
            this.f9980b = y0Var;
        }

        @Override // i9.b.a
        public void a(y0 y0Var) {
            b5.n.o(y0Var, "headers");
            y0 y0Var2 = new y0();
            y0Var2.m(this.f9980b);
            y0Var2.m(y0Var);
            this.f9979a.a(y0Var2);
        }

        @Override // i9.b.a
        public void b(j1 j1Var) {
            this.f9979a.b(j1Var);
        }
    }

    /* loaded from: classes.dex */
    private final class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.AbstractC0161b f9981a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f9982b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f9983c;

        /* renamed from: d  reason: collision with root package name */
        private final r f9984d;

        public b(b.AbstractC0161b abstractC0161b, Executor executor, b.a aVar, r rVar) {
            this.f9981a = abstractC0161b;
            this.f9982b = executor;
            this.f9983c = (b.a) b5.n.o(aVar, "delegate");
            this.f9984d = (r) b5.n.o(rVar, "context");
        }

        @Override // i9.b.a
        public void a(y0 y0Var) {
            b5.n.o(y0Var, "headers");
            r b10 = this.f9984d.b();
            try {
                m.this.f9978b.a(this.f9981a, this.f9982b, new a(this.f9983c, y0Var));
            } finally {
                this.f9984d.f(b10);
            }
        }

        @Override // i9.b.a
        public void b(j1 j1Var) {
            this.f9983c.b(j1Var);
        }
    }

    public m(i9.b bVar, i9.b bVar2) {
        this.f9977a = (i9.b) b5.n.o(bVar, "creds1");
        this.f9978b = (i9.b) b5.n.o(bVar2, "creds2");
    }

    @Override // i9.b
    public void a(b.AbstractC0161b abstractC0161b, Executor executor, b.a aVar) {
        this.f9977a.a(abstractC0161b, executor, new b(abstractC0161b, executor, aVar, r.e()));
    }
}
