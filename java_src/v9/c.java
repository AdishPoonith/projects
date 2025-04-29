package v9;

import da.p;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import s9.u;
import v9.g;
/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: j  reason: collision with root package name */
    private final g f19527j;

    /* renamed from: k  reason: collision with root package name */
    private final g.b f19528k;

    /* loaded from: classes.dex */
    private static final class a implements Serializable {

        /* renamed from: k  reason: collision with root package name */
        public static final C0277a f19529k = new C0277a(null);

        /* renamed from: j  reason: collision with root package name */
        private final g[] f19530j;

        /* renamed from: v9.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0277a {
            private C0277a() {
            }

            public /* synthetic */ C0277a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(g[] elements) {
            l.e(elements, "elements");
            this.f19530j = elements;
        }

        private final Object readResolve() {
            g[] gVarArr = this.f19530j;
            g gVar = h.f19537j;
            for (g gVar2 : gVarArr) {
                gVar = gVar.r(gVar2);
            }
            return gVar;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends m implements p<String, g.b, String> {

        /* renamed from: j  reason: collision with root package name */
        public static final b f19531j = new b();

        b() {
            super(2);
        }

        @Override // da.p
        /* renamed from: a */
        public final String invoke(String acc, g.b element) {
            l.e(acc, "acc");
            l.e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* renamed from: v9.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0278c extends m implements p<u, g.b, u> {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g[] f19532j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ r f19533k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0278c(g[] gVarArr, r rVar) {
            super(2);
            this.f19532j = gVarArr;
            this.f19533k = rVar;
        }

        public final void a(u uVar, g.b element) {
            l.e(uVar, "<anonymous parameter 0>");
            l.e(element, "element");
            g[] gVarArr = this.f19532j;
            r rVar = this.f19533k;
            int i10 = rVar.f12856j;
            rVar.f12856j = i10 + 1;
            gVarArr[i10] = element;
        }

        @Override // da.p
        public /* bridge */ /* synthetic */ u invoke(u uVar, g.b bVar) {
            a(uVar, bVar);
            return u.f17878a;
        }
    }

    public c(g left, g.b element) {
        l.e(left, "left");
        l.e(element, "element");
        this.f19527j = left;
        this.f19528k = element;
    }

    private final boolean c(g.b bVar) {
        return l.a(b(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f19528k)) {
            g gVar = cVar.f19527j;
            if (!(gVar instanceof c)) {
                l.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int f() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f19527j;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    private final Object writeReplace() {
        int f10 = f();
        g[] gVarArr = new g[f10];
        r rVar = new r();
        N(u.f17878a, new C0278c(gVarArr, rVar));
        if (rVar.f12856j == f10) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // v9.g
    public <R> R N(R r10, p<? super R, ? super g.b, ? extends R> operation) {
        l.e(operation, "operation");
        return operation.invoke((Object) this.f19527j.N(r10, operation), this.f19528k);
    }

    @Override // v9.g
    public <E extends g.b> E b(g.c<E> key) {
        l.e(key, "key");
        c cVar = this;
        while (true) {
            E e10 = (E) cVar.f19528k.b(key);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar.f19527j;
            if (!(gVar instanceof c)) {
                return (E) gVar.b(key);
            }
            cVar = (c) gVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f() != f() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // v9.g
    public g f0(g.c<?> key) {
        l.e(key, "key");
        if (this.f19528k.b(key) != null) {
            return this.f19527j;
        }
        g f02 = this.f19527j.f0(key);
        return f02 == this.f19527j ? this : f02 == h.f19537j ? this.f19528k : new c(f02, this.f19528k);
    }

    public int hashCode() {
        return this.f19527j.hashCode() + this.f19528k.hashCode();
    }

    @Override // v9.g
    public g r(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) N("", b.f19531j)) + ']';
    }
}
