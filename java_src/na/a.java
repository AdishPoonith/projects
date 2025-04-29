package na;

import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import la.l;
import la.o0;
import s9.n;
import s9.u;
/* loaded from: classes.dex */
public abstract class a<E> extends na.c<E> implements f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0211a<E> implements g<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f14347a;

        /* renamed from: b  reason: collision with root package name */
        private Object f14348b = na.b.f14357d;

        public C0211a(a<E> aVar) {
            this.f14347a = aVar;
        }

        private final boolean b(Object obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (jVar.f14380m == null) {
                    return false;
                }
                throw a0.a(jVar.G());
            }
            return true;
        }

        private final Object c(v9.d<? super Boolean> dVar) {
            v9.d b10;
            Object c10;
            Object a10;
            b10 = w9.c.b(dVar);
            la.m b11 = la.o.b(b10);
            b bVar = new b(this, b11);
            while (true) {
                if (this.f14347a.p(bVar)) {
                    this.f14347a.w(b11, bVar);
                    break;
                }
                Object v10 = this.f14347a.v();
                d(v10);
                if (v10 instanceof j) {
                    j jVar = (j) v10;
                    if (jVar.f14380m == null) {
                        n.a aVar = s9.n.f17870k;
                        a10 = kotlin.coroutines.jvm.internal.b.a(false);
                    } else {
                        n.a aVar2 = s9.n.f17870k;
                        a10 = s9.o.a(jVar.G());
                    }
                    b11.resumeWith(s9.n.b(a10));
                } else if (v10 != na.b.f14357d) {
                    Boolean a11 = kotlin.coroutines.jvm.internal.b.a(true);
                    da.l<E, u> lVar = this.f14347a.f14361b;
                    b11.f(a11, lVar != null ? v.a(lVar, v10, b11.getContext()) : null);
                }
            }
            Object w10 = b11.w();
            c10 = w9.d.c();
            if (w10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return w10;
        }

        @Override // na.g
        public Object a(v9.d<? super Boolean> dVar) {
            Object obj = this.f14348b;
            b0 b0Var = na.b.f14357d;
            if (obj == b0Var) {
                obj = this.f14347a.v();
                this.f14348b = obj;
                if (obj == b0Var) {
                    return c(dVar);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(b(obj));
        }

        public final void d(Object obj) {
            this.f14348b = obj;
        }

        @Override // na.g
        public E next() {
            E e10 = (E) this.f14348b;
            if (e10 instanceof j) {
                throw a0.a(((j) e10).G());
            }
            b0 b0Var = na.b.f14357d;
            if (e10 != b0Var) {
                this.f14348b = b0Var;
                return e10;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<E> extends o<E> {

        /* renamed from: m  reason: collision with root package name */
        public final C0211a<E> f14349m;

        /* renamed from: n  reason: collision with root package name */
        public final la.l<Boolean> f14350n;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0211a<E> c0211a, la.l<? super Boolean> lVar) {
            this.f14349m = c0211a;
            this.f14350n = lVar;
        }

        @Override // na.o
        public void B(j<?> jVar) {
            Object a10 = jVar.f14380m == null ? l.a.a(this.f14350n, Boolean.FALSE, null, 2, null) : this.f14350n.o(jVar.G());
            if (a10 != null) {
                this.f14349m.d(jVar);
                this.f14350n.p(a10);
            }
        }

        public da.l<Throwable, u> C(E e10) {
            da.l<E, u> lVar = this.f14349m.f14347a.f14361b;
            if (lVar != null) {
                return v.a(lVar, e10, this.f14350n.getContext());
            }
            return null;
        }

        @Override // na.q
        public void c(E e10) {
            this.f14349m.d(e10);
            this.f14350n.p(la.n.f13652a);
        }

        @Override // na.q
        public b0 f(E e10, o.b bVar) {
            if (this.f14350n.d(Boolean.TRUE, null, C(e10)) == null) {
                return null;
            }
            return la.n.f13652a;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "ReceiveHasNext@" + o0.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends la.f {

        /* renamed from: j  reason: collision with root package name */
        private final o<?> f14351j;

        public c(o<?> oVar) {
            this.f14351j = oVar;
        }

        @Override // la.k
        public void a(Throwable th) {
            if (this.f14351j.v()) {
                a.this.t();
            }
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ u invoke(Throwable th) {
            a(th);
            return u.f17878a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f14351j + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends o.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f14353d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.o oVar, a aVar) {
            super(oVar);
            this.f14353d = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f14353d.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    public a(da.l<? super E, u> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q10 = q(oVar);
        if (q10) {
            u();
        }
        return q10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(la.l<?> lVar, o<?> oVar) {
        lVar.j(new c(oVar));
    }

    @Override // na.p
    public final g<E> iterator() {
        return new C0211a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.c
    public q<E> l() {
        q<E> l10 = super.l();
        if (l10 != null && !(l10 instanceof j)) {
            t();
        }
        return l10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        int z10;
        kotlinx.coroutines.internal.o r10;
        if (!r()) {
            kotlinx.coroutines.internal.o e10 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.o r11 = e10.r();
                if (!(!(r11 instanceof s))) {
                    return false;
                }
                z10 = r11.z(oVar, e10, dVar);
                if (z10 != 1) {
                }
            } while (z10 != 2);
            return false;
        }
        kotlinx.coroutines.internal.o e11 = e();
        do {
            r10 = e11.r();
            if (!(!(r10 instanceof s))) {
                return false;
            }
        } while (!r10.j(oVar, e11));
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m10 = m();
            if (m10 == null) {
                return na.b.f14357d;
            }
            if (m10.C(null) != null) {
                m10.A();
                return m10.B();
            }
            m10.D();
        }
    }
}
