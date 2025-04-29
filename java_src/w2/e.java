package w2;

import android.util.SparseArray;
import java.util.List;
import p3.n0;
import p3.v;
import s1.n1;
import t1.t1;
import w2.g;
import x1.a0;
import x1.b0;
import x1.d0;
import x1.e0;
/* loaded from: classes.dex */
public final class e implements x1.n, g {

    /* renamed from: s  reason: collision with root package name */
    public static final g.a f19774s = new g.a() { // from class: w2.d
        @Override // w2.g.a
        public final g a(int i10, n1 n1Var, boolean z10, List list, e0 e0Var, t1 t1Var) {
            g h10;
            h10 = e.h(i10, n1Var, z10, list, e0Var, t1Var);
            return h10;
        }
    };

    /* renamed from: t  reason: collision with root package name */
    private static final a0 f19775t = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final x1.l f19776j;

    /* renamed from: k  reason: collision with root package name */
    private final int f19777k;

    /* renamed from: l  reason: collision with root package name */
    private final n1 f19778l;

    /* renamed from: m  reason: collision with root package name */
    private final SparseArray<a> f19779m = new SparseArray<>();

    /* renamed from: n  reason: collision with root package name */
    private boolean f19780n;

    /* renamed from: o  reason: collision with root package name */
    private g.b f19781o;

    /* renamed from: p  reason: collision with root package name */
    private long f19782p;

    /* renamed from: q  reason: collision with root package name */
    private b0 f19783q;

    /* renamed from: r  reason: collision with root package name */
    private n1[] f19784r;

    /* loaded from: classes.dex */
    private static final class a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f19785a;

        /* renamed from: b  reason: collision with root package name */
        private final int f19786b;

        /* renamed from: c  reason: collision with root package name */
        private final n1 f19787c;

        /* renamed from: d  reason: collision with root package name */
        private final x1.k f19788d = new x1.k();

        /* renamed from: e  reason: collision with root package name */
        public n1 f19789e;

        /* renamed from: f  reason: collision with root package name */
        private e0 f19790f;

        /* renamed from: g  reason: collision with root package name */
        private long f19791g;

        public a(int i10, int i11, n1 n1Var) {
            this.f19785a = i10;
            this.f19786b = i11;
            this.f19787c = n1Var;
        }

        @Override // x1.e0
        public int a(o3.i iVar, int i10, boolean z10, int i11) {
            return ((e0) n0.j(this.f19790f)).f(iVar, i10, z10);
        }

        @Override // x1.e0
        public void b(p3.a0 a0Var, int i10, int i11) {
            ((e0) n0.j(this.f19790f)).d(a0Var, i10);
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            long j11 = this.f19791g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f19790f = this.f19788d;
            }
            ((e0) n0.j(this.f19790f)).c(j10, i10, i11, i12, aVar);
        }

        @Override // x1.e0
        public /* synthetic */ void d(p3.a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(n1 n1Var) {
            n1 n1Var2 = this.f19787c;
            if (n1Var2 != null) {
                n1Var = n1Var.j(n1Var2);
            }
            this.f19789e = n1Var;
            ((e0) n0.j(this.f19790f)).e(this.f19789e);
        }

        @Override // x1.e0
        public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f19790f = this.f19788d;
                return;
            }
            this.f19791g = j10;
            e0 d10 = bVar.d(this.f19785a, this.f19786b);
            this.f19790f = d10;
            n1 n1Var = this.f19789e;
            if (n1Var != null) {
                d10.e(n1Var);
            }
        }
    }

    public e(x1.l lVar, int i10, n1 n1Var) {
        this.f19776j = lVar;
        this.f19777k = i10;
        this.f19778l = n1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g h(int i10, n1 n1Var, boolean z10, List list, e0 e0Var, t1 t1Var) {
        x1.l gVar;
        String str = n1Var.f17418t;
        if (v.r(str)) {
            return null;
        }
        if (v.q(str)) {
            gVar = new d2.e(1);
        } else {
            gVar = new f2.g(z10 ? 4 : 0, null, null, list, e0Var);
        }
        return new e(gVar, i10, n1Var);
    }

    @Override // w2.g
    public void a() {
        this.f19776j.a();
    }

    @Override // w2.g
    public boolean b(x1.m mVar) {
        int i10 = this.f19776j.i(mVar, f19775t);
        p3.a.f(i10 != 1);
        return i10 == 0;
    }

    @Override // w2.g
    public void c(g.b bVar, long j10, long j11) {
        this.f19781o = bVar;
        this.f19782p = j11;
        if (!this.f19780n) {
            this.f19776j.c(this);
            if (j10 != -9223372036854775807L) {
                this.f19776j.b(0L, j10);
            }
            this.f19780n = true;
            return;
        }
        x1.l lVar = this.f19776j;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        lVar.b(0L, j10);
        for (int i10 = 0; i10 < this.f19779m.size(); i10++) {
            this.f19779m.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // x1.n
    public e0 d(int i10, int i11) {
        a aVar = this.f19779m.get(i10);
        if (aVar == null) {
            p3.a.f(this.f19784r == null);
            aVar = new a(i10, i11, i11 == this.f19777k ? this.f19778l : null);
            aVar.g(this.f19781o, this.f19782p);
            this.f19779m.put(i10, aVar);
        }
        return aVar;
    }

    @Override // w2.g
    public x1.d e() {
        b0 b0Var = this.f19783q;
        if (b0Var instanceof x1.d) {
            return (x1.d) b0Var;
        }
        return null;
    }

    @Override // w2.g
    public n1[] f() {
        return this.f19784r;
    }

    @Override // x1.n
    public void k() {
        n1[] n1VarArr = new n1[this.f19779m.size()];
        for (int i10 = 0; i10 < this.f19779m.size(); i10++) {
            n1VarArr[i10] = (n1) p3.a.h(this.f19779m.valueAt(i10).f19789e);
        }
        this.f19784r = n1VarArr;
    }

    @Override // x1.n
    public void t(b0 b0Var) {
        this.f19783q = b0Var;
    }
}
