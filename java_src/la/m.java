package la;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import la.v1;
/* loaded from: classes.dex */
public class m<T> extends x0<T> implements l<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13638p = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13639q = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: m  reason: collision with root package name */
    private final v9.d<T> f13640m;

    /* renamed from: n  reason: collision with root package name */
    private final v9.g f13641n;

    /* renamed from: o  reason: collision with root package name */
    private c1 f13642o;

    /* JADX WARN: Multi-variable type inference failed */
    public m(v9.d<? super T> dVar, int i10) {
        super(i10);
        this.f13640m = dVar;
        this.f13641n = dVar.getContext();
        this._decision = 0;
        this._state = d.f13599j;
    }

    private final c1 A() {
        v1 v1Var = (v1) getContext().b(v1.f13674g);
        if (v1Var == null) {
            return null;
        }
        c1 d10 = v1.a.d(v1Var, true, false, new q(this), 2, null);
        this.f13642o = d10;
        return d10;
    }

    private final boolean C() {
        return y0.c(this.f13680l) && ((kotlinx.coroutines.internal.f) this.f13640m).q();
    }

    private final j D(da.l<? super Throwable, s9.u> lVar) {
        return lVar instanceof j ? (j) lVar : new s1(lVar);
    }

    private final void E(da.l<? super Throwable, s9.u> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void H() {
        Throwable t10;
        v9.d<T> dVar = this.f13640m;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        if (fVar == null || (t10 = fVar.t(this)) == null) {
            return;
        }
        s();
        g(t10);
    }

    private final void J(Object obj, int i10, da.l<? super Throwable, s9.u> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof j2)) {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar != null) {
                            q(lVar, pVar.f13689a);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new s9.e();
            }
        } while (!androidx.concurrent.futures.b.a(f13639q, this, obj2, L((j2) obj2, obj, i10, lVar, null)));
        t();
        u(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void K(m mVar, Object obj, int i10, da.l lVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        mVar.J(obj, i10, lVar);
    }

    private final Object L(j2 j2Var, Object obj, int i10, da.l<? super Throwable, s9.u> lVar, Object obj2) {
        if (obj instanceof z) {
            return obj;
        }
        if (y0.b(i10) || obj2 != null) {
            if (lVar != null || (((j2Var instanceof j) && !(j2Var instanceof f)) || obj2 != null)) {
                return new y(obj, j2Var instanceof j ? (j) j2Var : null, lVar, obj2, null, 16, null);
            }
            return obj;
        }
        return obj;
    }

    private final boolean M() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f13638p.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.b0 N(Object obj, Object obj2, da.l<? super Throwable, s9.u> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof j2)) {
                if ((obj3 instanceof y) && obj2 != null && ((y) obj3).f13684d == obj2) {
                    return n.f13652a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f13639q, this, obj3, L((j2) obj3, obj, this.f13680l, lVar, obj2)));
        t();
        return n.f13652a;
    }

    private final boolean O() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f13638p.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void m(da.l<? super Throwable, s9.u> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            v9.g context = getContext();
            j0.a(context, new c0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean r(Throwable th) {
        if (C()) {
            return ((kotlinx.coroutines.internal.f) this.f13640m).r(th);
        }
        return false;
    }

    private final void t() {
        if (C()) {
            return;
        }
        s();
    }

    private final void u(int i10) {
        if (M()) {
            return;
        }
        y0.a(this, i10);
    }

    private final String y() {
        Object x10 = x();
        return x10 instanceof j2 ? "Active" : x10 instanceof p ? "Cancelled" : "Completed";
    }

    public boolean B() {
        return !(x() instanceof j2);
    }

    protected String F() {
        return "CancellableContinuation";
    }

    public final void G(Throwable th) {
        if (r(th)) {
            return;
        }
        g(th);
        t();
    }

    public final boolean I() {
        Object obj = this._state;
        if ((obj instanceof y) && ((y) obj).f13684d != null) {
            s();
            return false;
        }
        this._decision = 0;
        this._state = d.f13599j;
        return true;
    }

    @Override // la.x0
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof j2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof z) {
                return;
            }
            if (obj2 instanceof y) {
                y yVar = (y) obj2;
                if (!(!yVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f13639q, this, obj2, y.b(yVar, null, null, null, null, th, 15, null))) {
                    yVar.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f13639q, this, obj2, new y(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // la.x0
    public final v9.d<T> b() {
        return this.f13640m;
    }

    @Override // la.l
    public Object c(T t10, Object obj) {
        return N(t10, obj, null);
    }

    @Override // la.l
    public Object d(T t10, Object obj, da.l<? super Throwable, s9.u> lVar) {
        return N(t10, obj, lVar);
    }

    @Override // la.x0
    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    @Override // la.l
    public void f(T t10, da.l<? super Throwable, s9.u> lVar) {
        J(t10, this.f13680l, lVar);
    }

    @Override // la.l
    public boolean g(Throwable th) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof j2)) {
                return false;
            }
            z10 = obj instanceof j;
        } while (!androidx.concurrent.futures.b.a(f13639q, this, obj, new p(this, th, z10)));
        j jVar = z10 ? (j) obj : null;
        if (jVar != null) {
            n(jVar, th);
        }
        t();
        u(this.f13680l);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        v9.d<T> dVar = this.f13640m;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // v9.d
    public v9.g getContext() {
        return this.f13641n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // la.x0
    public <T> T h(Object obj) {
        return obj instanceof y ? (T) ((y) obj).f13681a : obj;
    }

    @Override // la.l
    public void j(da.l<? super Throwable, s9.u> lVar) {
        j D = D(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.concurrent.futures.b.a(f13639q, this, obj, D)) {
                    return;
                }
            } else if (obj instanceof j) {
                E(lVar, obj);
            } else {
                boolean z10 = obj instanceof z;
                if (z10) {
                    z zVar = (z) obj;
                    if (!zVar.b()) {
                        E(lVar, obj);
                    }
                    if (obj instanceof p) {
                        if (!z10) {
                            zVar = null;
                        }
                        m(lVar, zVar != null ? zVar.f13689a : null);
                        return;
                    }
                    return;
                } else if (obj instanceof y) {
                    y yVar = (y) obj;
                    if (yVar.f13682b != null) {
                        E(lVar, obj);
                    }
                    if (D instanceof f) {
                        return;
                    }
                    if (yVar.c()) {
                        m(lVar, yVar.f13685e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f13639q, this, obj, y.b(yVar, null, D, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else if (D instanceof f) {
                    return;
                } else {
                    if (androidx.concurrent.futures.b.a(f13639q, this, obj, new y(obj, D, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // la.x0
    public Object k() {
        return x();
    }

    public final void n(j jVar, Throwable th) {
        try {
            jVar.a(th);
        } catch (Throwable th2) {
            v9.g context = getContext();
            j0.a(context, new c0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // la.l
    public Object o(Throwable th) {
        return N(new z(th, false, 2, null), null, null);
    }

    @Override // la.l
    public void p(Object obj) {
        u(this.f13680l);
    }

    public final void q(da.l<? super Throwable, s9.u> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            v9.g context = getContext();
            j0.a(context, new c0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // v9.d
    public void resumeWith(Object obj) {
        K(this, d0.c(obj, this), this.f13680l, null, 4, null);
    }

    public final void s() {
        c1 c1Var = this.f13642o;
        if (c1Var == null) {
            return;
        }
        c1Var.b();
        this.f13642o = i2.f13634j;
    }

    public String toString() {
        return F() + '(' + o0.c(this.f13640m) + "){" + y() + "}@" + o0.b(this);
    }

    public Throwable v(v1 v1Var) {
        return v1Var.O();
    }

    public final Object w() {
        v1 v1Var;
        Object c10;
        boolean C = C();
        if (O()) {
            if (this.f13642o == null) {
                A();
            }
            if (C) {
                H();
            }
            c10 = w9.d.c();
            return c10;
        }
        if (C) {
            H();
        }
        Object x10 = x();
        if (x10 instanceof z) {
            throw ((z) x10).f13689a;
        }
        if (!y0.b(this.f13680l) || (v1Var = (v1) getContext().b(v1.f13674g)) == null || v1Var.a()) {
            return h(x10);
        }
        CancellationException O = v1Var.O();
        a(x10, O);
        throw O;
    }

    public final Object x() {
        return this._state;
    }

    public void z() {
        c1 A = A();
        if (A != null && B()) {
            A.b();
            this.f13642o = i2.f13634j;
        }
    }
}
