package s1;

import android.util.Pair;
import s1.y3;
/* loaded from: classes.dex */
public abstract class a extends y3 {

    /* renamed from: o  reason: collision with root package name */
    private final int f17005o;

    /* renamed from: p  reason: collision with root package name */
    private final u2.p0 f17006p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f17007q;

    public a(boolean z10, u2.p0 p0Var) {
        this.f17007q = z10;
        this.f17006p = p0Var;
        this.f17005o = p0Var.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int F(int i10, boolean z10) {
        if (z10) {
            return this.f17006p.c(i10);
        }
        if (i10 < this.f17005o - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f17006p.f(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object z(Object obj) {
        return ((Pair) obj).second;
    }

    protected abstract Object B(int i10);

    protected abstract int D(int i10);

    protected abstract int E(int i10);

    protected abstract y3 H(int i10);

    @Override // s1.y3
    public int e(boolean z10) {
        if (this.f17005o == 0) {
            return -1;
        }
        if (this.f17007q) {
            z10 = false;
        }
        int e10 = z10 ? this.f17006p.e() : 0;
        while (H(e10).u()) {
            e10 = F(e10, z10);
            if (e10 == -1) {
                return -1;
            }
        }
        return E(e10) + H(e10).e(z10);
    }

    @Override // s1.y3
    public final int f(Object obj) {
        int f10;
        if (obj instanceof Pair) {
            Object A = A(obj);
            Object z10 = z(obj);
            int w10 = w(A);
            if (w10 == -1 || (f10 = H(w10).f(z10)) == -1) {
                return -1;
            }
            return D(w10) + f10;
        }
        return -1;
    }

    @Override // s1.y3
    public int g(boolean z10) {
        int i10 = this.f17005o;
        if (i10 == 0) {
            return -1;
        }
        if (this.f17007q) {
            z10 = false;
        }
        int g10 = z10 ? this.f17006p.g() : i10 - 1;
        while (H(g10).u()) {
            g10 = G(g10, z10);
            if (g10 == -1) {
                return -1;
            }
        }
        return E(g10) + H(g10).g(z10);
    }

    @Override // s1.y3
    public int i(int i10, int i11, boolean z10) {
        if (this.f17007q) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int y10 = y(i10);
        int E = E(y10);
        int i12 = H(y10).i(i10 - E, i11 != 2 ? i11 : 0, z10);
        if (i12 != -1) {
            return E + i12;
        }
        int F = F(y10, z10);
        while (F != -1 && H(F).u()) {
            F = F(F, z10);
        }
        if (F != -1) {
            return E(F) + H(F).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    @Override // s1.y3
    public final y3.b k(int i10, y3.b bVar, boolean z10) {
        int x10 = x(i10);
        int E = E(x10);
        H(x10).k(i10 - D(x10), bVar, z10);
        bVar.f17805l += E;
        if (z10) {
            bVar.f17804k = C(B(x10), p3.a.e(bVar.f17804k));
        }
        return bVar;
    }

    @Override // s1.y3
    public final y3.b l(Object obj, y3.b bVar) {
        Object A = A(obj);
        Object z10 = z(obj);
        int w10 = w(A);
        int E = E(w10);
        H(w10).l(z10, bVar);
        bVar.f17805l += E;
        bVar.f17804k = obj;
        return bVar;
    }

    @Override // s1.y3
    public int p(int i10, int i11, boolean z10) {
        if (this.f17007q) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int y10 = y(i10);
        int E = E(y10);
        int p10 = H(y10).p(i10 - E, i11 != 2 ? i11 : 0, z10);
        if (p10 != -1) {
            return E + p10;
        }
        int G = G(y10, z10);
        while (G != -1 && H(G).u()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return E(G) + H(G).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    @Override // s1.y3
    public final Object q(int i10) {
        int x10 = x(i10);
        return C(B(x10), H(x10).q(i10 - D(x10)));
    }

    @Override // s1.y3
    public final y3.d s(int i10, y3.d dVar, long j10) {
        int y10 = y(i10);
        int E = E(y10);
        int D = D(y10);
        H(y10).s(i10 - E, dVar, j10);
        Object B = B(y10);
        if (!y3.d.A.equals(dVar.f17814j)) {
            B = C(B, dVar.f17814j);
        }
        dVar.f17814j = B;
        dVar.f17828x += D;
        dVar.f17829y += D;
        return dVar;
    }

    protected abstract int w(Object obj);

    protected abstract int x(int i10);

    protected abstract int y(int i10);
}
