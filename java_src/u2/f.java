package u2;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import s1.y3;
import u2.b0;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public abstract class f<T> extends u2.a {

    /* renamed from: q  reason: collision with root package name */
    private final HashMap<T, b<T>> f18786q = new HashMap<>();

    /* renamed from: r  reason: collision with root package name */
    private Handler f18787r;

    /* renamed from: s  reason: collision with root package name */
    private o3.p0 f18788s;

    /* loaded from: classes.dex */
    private final class a implements b0, w1.w {

        /* renamed from: a  reason: collision with root package name */
        private final T f18789a;

        /* renamed from: b  reason: collision with root package name */
        private b0.a f18790b;

        /* renamed from: c  reason: collision with root package name */
        private w.a f18791c;

        public a(T t10) {
            this.f18790b = f.this.w(null);
            this.f18791c = f.this.t(null);
            this.f18789a = t10;
        }

        private boolean b(int i10, u.b bVar) {
            u.b bVar2;
            if (bVar != null) {
                bVar2 = f.this.G(this.f18789a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I = f.this.I(this.f18789a, i10);
            b0.a aVar = this.f18790b;
            if (aVar.f18764a != I || !p3.n0.c(aVar.f18765b, bVar2)) {
                this.f18790b = f.this.v(I, bVar2, 0L);
            }
            w.a aVar2 = this.f18791c;
            if (aVar2.f19755a == I && p3.n0.c(aVar2.f19756b, bVar2)) {
                return true;
            }
            this.f18791c = f.this.s(I, bVar2);
            return true;
        }

        private q d(q qVar) {
            long H = f.this.H(this.f18789a, qVar.f18952f);
            long H2 = f.this.H(this.f18789a, qVar.f18953g);
            return (H == qVar.f18952f && H2 == qVar.f18953g) ? qVar : new q(qVar.f18947a, qVar.f18948b, qVar.f18949c, qVar.f18950d, qVar.f18951e, H, H2);
        }

        @Override // w1.w
        public void C(int i10, u.b bVar, int i11) {
            if (b(i10, bVar)) {
                this.f18791c.k(i11);
            }
        }

        @Override // w1.w
        public void G(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f18791c.m();
            }
        }

        @Override // w1.w
        public void I(int i10, u.b bVar, Exception exc) {
            if (b(i10, bVar)) {
                this.f18791c.l(exc);
            }
        }

        @Override // w1.w
        public void P(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f18791c.j();
            }
        }

        @Override // u2.b0
        public void Q(int i10, u.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f18790b.E(d(qVar));
            }
        }

        @Override // u2.b0
        public void T(int i10, u.b bVar, q qVar) {
            if (b(i10, bVar)) {
                this.f18790b.j(d(qVar));
            }
        }

        @Override // u2.b0
        public void U(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f18790b.B(nVar, d(qVar));
            }
        }

        @Override // u2.b0
        public void V(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f18790b.v(nVar, d(qVar));
            }
        }

        @Override // u2.b0
        public void Y(int i10, u.b bVar, n nVar, q qVar) {
            if (b(i10, bVar)) {
                this.f18790b.s(nVar, d(qVar));
            }
        }

        @Override // w1.w
        public void a0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f18791c.h();
            }
        }

        @Override // w1.w
        public void f0(int i10, u.b bVar) {
            if (b(i10, bVar)) {
                this.f18791c.i();
            }
        }

        @Override // w1.w
        public /* synthetic */ void k0(int i10, u.b bVar) {
            w1.p.a(this, i10, bVar);
        }

        @Override // u2.b0
        public void m0(int i10, u.b bVar, n nVar, q qVar, IOException iOException, boolean z10) {
            if (b(i10, bVar)) {
                this.f18790b.y(nVar, d(qVar), iOException, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final u f18793a;

        /* renamed from: b  reason: collision with root package name */
        public final u.c f18794b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T>.a f18795c;

        public b(u uVar, u.c cVar, f<T>.a aVar) {
            this.f18793a = uVar;
            this.f18794b = cVar;
            this.f18795c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.a
    public void C(o3.p0 p0Var) {
        this.f18788s = p0Var;
        this.f18787r = p3.n0.w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.a
    public void E() {
        for (b<T> bVar : this.f18786q.values()) {
            bVar.f18793a.c(bVar.f18794b);
            bVar.f18793a.e(bVar.f18795c);
            bVar.f18793a.q(bVar.f18795c);
        }
        this.f18786q.clear();
    }

    protected abstract u.b G(T t10, u.b bVar);

    protected abstract long H(T t10, long j10);

    protected abstract int I(T t10, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public abstract void J(T t10, u uVar, y3 y3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(final T t10, u uVar) {
        p3.a.a(!this.f18786q.containsKey(t10));
        u.c cVar = new u.c() { // from class: u2.e
            @Override // u2.u.c
            public final void a(u uVar2, y3 y3Var) {
                f.this.J(t10, uVar2, y3Var);
            }
        };
        a aVar = new a(t10);
        this.f18786q.put(t10, new b<>(uVar, cVar, aVar));
        uVar.l((Handler) p3.a.e(this.f18787r), aVar);
        uVar.p((Handler) p3.a.e(this.f18787r), aVar);
        uVar.h(cVar, this.f18788s, A());
        if (B()) {
            return;
        }
        uVar.k(cVar);
    }

    @Override // u2.a
    protected void y() {
        for (b<T> bVar : this.f18786q.values()) {
            bVar.f18793a.k(bVar.f18794b);
        }
    }

    @Override // u2.a
    protected void z() {
        for (b<T> bVar : this.f18786q.values()) {
            bVar.f18793a.d(bVar.f18794b);
        }
    }
}
