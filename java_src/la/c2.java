package la;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.o;
import la.v1;
import v9.g;
/* loaded from: classes.dex */
public class c2 implements v1, t, k2 {

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f13585j = AtomicReferenceFieldUpdater.newUpdater(c2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> extends m<T> {

        /* renamed from: r  reason: collision with root package name */
        private final c2 f13586r;

        public a(v9.d<? super T> dVar, c2 c2Var) {
            super(dVar, 1);
            this.f13586r = c2Var;
        }

        @Override // la.m
        protected String F() {
            return "AwaitContinuation";
        }

        @Override // la.m
        public Throwable v(v1 v1Var) {
            Throwable e10;
            Object i02 = this.f13586r.i0();
            return (!(i02 instanceof c) || (e10 = ((c) i02).e()) == null) ? i02 instanceof z ? ((z) i02).f13689a : v1Var.O() : e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends b2 {

        /* renamed from: n  reason: collision with root package name */
        private final c2 f13587n;

        /* renamed from: o  reason: collision with root package name */
        private final c f13588o;

        /* renamed from: p  reason: collision with root package name */
        private final s f13589p;

        /* renamed from: q  reason: collision with root package name */
        private final Object f13590q;

        public b(c2 c2Var, c cVar, s sVar, Object obj) {
            this.f13587n = c2Var;
            this.f13588o = cVar;
            this.f13589p = sVar;
            this.f13590q = obj;
        }

        @Override // la.b0
        public void A(Throwable th) {
            this.f13587n.R(this.f13588o, this.f13589p, this.f13590q);
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
            A(th);
            return s9.u.f17878a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements q1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: j  reason: collision with root package name */
        private final h2 f13591j;

        public c(h2 h2Var, boolean z10, Throwable th) {
            this.f13591j = h2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // la.q1
        public boolean a() {
            return e() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(Throwable th) {
            Throwable e10 = e();
            if (e10 == null) {
                m(th);
            } else if (th == e10) {
            } else {
                Object d10 = d();
                if (d10 == null) {
                    l(th);
                } else if (d10 instanceof Throwable) {
                    if (th == d10) {
                        return;
                    }
                    ArrayList<Throwable> c10 = c();
                    c10.add(d10);
                    c10.add(th);
                    l(c10);
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        @Override // la.q1
        public h2 g() {
            return this.f13591j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.b0 b0Var;
            Object d10 = d();
            b0Var = d2.f13605e;
            return d10 == b0Var;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.b0 b0Var;
            Object d10 = d();
            if (d10 == null) {
                arrayList = c();
            } else if (d10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(d10);
                arrayList = c10;
            } else if (!(d10 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + d10).toString());
            } else {
                arrayList = (ArrayList) d10;
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th != null && !kotlin.jvm.internal.l.a(th, e10)) {
                arrayList.add(th);
            }
            b0Var = d2.f13605e;
            l(b0Var);
            return arrayList;
        }

        public final void k(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + g() + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends o.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c2 f13592d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f13593e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.o oVar, c2 c2Var, Object obj) {
            super(oVar);
            this.f13592d = c2Var;
            this.f13593e = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(kotlinx.coroutines.internal.o oVar) {
            if (this.f13592d.i0() == this.f13593e) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements da.p<ja.d<? super v1>, v9.d<? super s9.u>, Object> {

        /* renamed from: k  reason: collision with root package name */
        Object f13594k;

        /* renamed from: l  reason: collision with root package name */
        Object f13595l;

        /* renamed from: m  reason: collision with root package name */
        int f13596m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f13597n;

        e(v9.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // da.p
        /* renamed from: a */
        public final Object invoke(ja.d<? super v1> dVar, v9.d<? super s9.u> dVar2) {
            return ((e) create(dVar, dVar2)).invokeSuspend(s9.u.f17878a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final v9.d<s9.u> create(Object obj, v9.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f13597n = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = w9.b.c()
                int r1 = r7.f13596m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f13595l
                kotlinx.coroutines.internal.o r1 = (kotlinx.coroutines.internal.o) r1
                java.lang.Object r3 = r7.f13594k
                kotlinx.coroutines.internal.m r3 = (kotlinx.coroutines.internal.m) r3
                java.lang.Object r4 = r7.f13597n
                ja.d r4 = (ja.d) r4
                s9.o.b(r8)
                r8 = r7
                goto L7e
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                s9.o.b(r8)
                goto L83
            L2b:
                s9.o.b(r8)
                java.lang.Object r8 = r7.f13597n
                ja.d r8 = (ja.d) r8
                la.c2 r1 = la.c2.this
                java.lang.Object r1 = r1.i0()
                boolean r4 = r1 instanceof la.s
                if (r4 == 0) goto L49
                la.s r1 = (la.s) r1
                la.t r1 = r1.f13663n
                r7.f13596m = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L83
                return r0
            L49:
                boolean r3 = r1 instanceof la.q1
                if (r3 == 0) goto L83
                la.q1 r1 = (la.q1) r1
                la.h2 r1 = r1.g()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.p()
                kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.o) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L60:
                boolean r5 = kotlin.jvm.internal.l.a(r1, r3)
                if (r5 != 0) goto L83
                boolean r5 = r1 instanceof la.s
                if (r5 == 0) goto L7e
                r5 = r1
                la.s r5 = (la.s) r5
                la.t r5 = r5.f13663n
                r8.f13597n = r4
                r8.f13594k = r3
                r8.f13595l = r1
                r8.f13596m = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                kotlinx.coroutines.internal.o r1 = r1.q()
                goto L60
            L83:
                s9.u r8 = s9.u.f17878a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: la.c2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c2(boolean z10) {
        this._state = z10 ? d2.f13607g : d2.f13606f;
        this._parentHandle = null;
    }

    private final void A(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                s9.b.a(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [la.p1] */
    private final void B0(f1 f1Var) {
        h2 h2Var = new h2();
        if (!f1Var.a()) {
            h2Var = new p1(h2Var);
        }
        androidx.concurrent.futures.b.a(f13585j, this, f1Var, h2Var);
    }

    private final void C0(b2 b2Var) {
        b2Var.l(new h2());
        androidx.concurrent.futures.b.a(f13585j, this, b2Var, b2Var.q());
    }

    private final Object E(v9.d<Object> dVar) {
        v9.d b10;
        Object c10;
        b10 = w9.c.b(dVar);
        a aVar = new a(b10, this);
        aVar.z();
        o.a(aVar, b0(new m2(aVar)));
        Object w10 = aVar.w();
        c10 = w9.d.c();
        if (w10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return w10;
    }

    private final int F0(Object obj) {
        f1 f1Var;
        if (!(obj instanceof f1)) {
            if (obj instanceof p1) {
                if (androidx.concurrent.futures.b.a(f13585j, this, obj, ((p1) obj).g())) {
                    A0();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((f1) obj).a()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13585j;
            f1Var = d2.f13607g;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, f1Var)) {
                A0();
                return 1;
            }
            return -1;
        }
    }

    private final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof q1 ? ((q1) obj).a() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException I0(c2 c2Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return c2Var.H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object J(Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        Object M0;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            Object i02 = i0();
            if (!(i02 instanceof q1) || ((i02 instanceof c) && ((c) i02).h())) {
                b0Var = d2.f13601a;
                return b0Var;
            }
            M0 = M0(i02, new z(S(obj), false, 2, null));
            b0Var2 = d2.f13603c;
        } while (M0 == b0Var2);
        return M0;
    }

    private final boolean K(Throwable th) {
        if (n0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        r h02 = h0();
        return (h02 == null || h02 == i2.f13634j) ? z10 : h02.k(th) || z10;
    }

    private final boolean K0(q1 q1Var, Object obj) {
        if (androidx.concurrent.futures.b.a(f13585j, this, q1Var, d2.g(obj))) {
            y0(null);
            z0(obj);
            Q(q1Var, obj);
            return true;
        }
        return false;
    }

    private final boolean L0(q1 q1Var, Throwable th) {
        h2 d02 = d0(q1Var);
        if (d02 == null) {
            return false;
        }
        if (androidx.concurrent.futures.b.a(f13585j, this, q1Var, new c(d02, false, th))) {
            w0(d02, th);
            return true;
        }
        return false;
    }

    private final Object M0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        if (!(obj instanceof q1)) {
            b0Var2 = d2.f13601a;
            return b0Var2;
        } else if ((!(obj instanceof f1) && !(obj instanceof b2)) || (obj instanceof s) || (obj2 instanceof z)) {
            return N0((q1) obj, obj2);
        } else {
            if (K0((q1) obj, obj2)) {
                return obj2;
            }
            b0Var = d2.f13603c;
            return b0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object N0(q1 q1Var, Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        h2 d02 = d0(q1Var);
        if (d02 == null) {
            b0Var3 = d2.f13603c;
            return b0Var3;
        }
        c cVar = q1Var instanceof c ? (c) q1Var : null;
        if (cVar == null) {
            cVar = new c(d02, false, null);
        }
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        synchronized (cVar) {
            if (cVar.h()) {
                b0Var2 = d2.f13601a;
                return b0Var2;
            }
            cVar.k(true);
            if (cVar != q1Var && !androidx.concurrent.futures.b.a(f13585j, this, q1Var, cVar)) {
                b0Var = d2.f13603c;
                return b0Var;
            }
            boolean f10 = cVar.f();
            z zVar = obj instanceof z ? (z) obj : null;
            if (zVar != null) {
                cVar.b(zVar.f13689a);
            }
            ?? e10 = Boolean.valueOf(f10 ? false : true).booleanValue() ? cVar.e() : 0;
            sVar.f12857j = e10;
            s9.u uVar = s9.u.f17878a;
            if (e10 != 0) {
                w0(d02, e10);
            }
            s W = W(q1Var);
            return (W == null || !O0(cVar, W, obj)) ? V(cVar, obj) : d2.f13602b;
        }
    }

    private final boolean O0(c cVar, s sVar, Object obj) {
        while (v1.a.d(sVar.f13663n, false, false, new b(this, cVar, sVar, obj), 1, null) == i2.f13634j) {
            sVar = v0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final void Q(q1 q1Var, Object obj) {
        r h02 = h0();
        if (h02 != null) {
            h02.b();
            E0(i2.f13634j);
        }
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar != null ? zVar.f13689a : null;
        if (!(q1Var instanceof b2)) {
            h2 g10 = q1Var.g();
            if (g10 != null) {
                x0(g10, th);
                return;
            }
            return;
        }
        try {
            ((b2) q1Var).A(th);
        } catch (Throwable th2) {
            k0(new c0("Exception in completion handler " + q1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(c cVar, s sVar, Object obj) {
        s v02 = v0(sVar);
        if (v02 == null || !O0(cVar, v02, obj)) {
            B(V(cVar, obj));
        }
    }

    private final Throwable S(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new w1(M(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((k2) obj).L();
    }

    private final Object V(c cVar, Object obj) {
        boolean f10;
        Throwable Z;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar != null ? zVar.f13689a : null;
        synchronized (cVar) {
            f10 = cVar.f();
            List<Throwable> j10 = cVar.j(th);
            Z = Z(cVar, j10);
            if (Z != null) {
                A(Z, j10);
            }
        }
        boolean z10 = false;
        if (Z != null && Z != th) {
            obj = new z(Z, false, 2, null);
        }
        if (Z != null) {
            if ((K(Z) || j0(Z)) ? true : true) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((z) obj).b();
            }
        }
        if (!f10) {
            y0(Z);
        }
        z0(obj);
        androidx.concurrent.futures.b.a(f13585j, this, cVar, d2.g(obj));
        Q(cVar, obj);
        return obj;
    }

    private final s W(q1 q1Var) {
        s sVar = q1Var instanceof s ? (s) q1Var : null;
        if (sVar == null) {
            h2 g10 = q1Var.g();
            if (g10 != null) {
                return v0(g10);
            }
            return null;
        }
        return sVar;
    }

    private final Throwable Y(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f13689a;
        }
        return null;
    }

    private final Throwable Z(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new w1(M(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof v2) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof v2)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final h2 d0(q1 q1Var) {
        h2 g10 = q1Var.g();
        if (g10 == null) {
            if (q1Var instanceof f1) {
                return new h2();
            }
            if (q1Var instanceof b2) {
                C0((b2) q1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + q1Var).toString());
        }
        return g10;
    }

    private final boolean o0() {
        Object i02;
        do {
            i02 = i0();
            if (!(i02 instanceof q1)) {
                return false;
            }
        } while (F0(i02) < 0);
        return true;
    }

    private final Object p0(v9.d<? super s9.u> dVar) {
        v9.d b10;
        Object c10;
        Object c11;
        b10 = w9.c.b(dVar);
        m mVar = new m(b10, 1);
        mVar.z();
        o.a(mVar, b0(new n2(mVar)));
        Object w10 = mVar.w();
        c10 = w9.d.c();
        if (w10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c11 = w9.d.c();
        return w10 == c11 ? w10 : s9.u.f17878a;
    }

    private final Object q0(Object obj) {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        kotlinx.coroutines.internal.b0 b0Var4;
        kotlinx.coroutines.internal.b0 b0Var5;
        kotlinx.coroutines.internal.b0 b0Var6;
        Throwable th = null;
        while (true) {
            Object i02 = i0();
            if (i02 instanceof c) {
                synchronized (i02) {
                    if (((c) i02).i()) {
                        b0Var2 = d2.f13604d;
                        return b0Var2;
                    }
                    boolean f10 = ((c) i02).f();
                    if (obj != null || !f10) {
                        if (th == null) {
                            th = S(obj);
                        }
                        ((c) i02).b(th);
                    }
                    Throwable e10 = f10 ^ true ? ((c) i02).e() : null;
                    if (e10 != null) {
                        w0(((c) i02).g(), e10);
                    }
                    b0Var = d2.f13601a;
                    return b0Var;
                }
            } else if (!(i02 instanceof q1)) {
                b0Var3 = d2.f13604d;
                return b0Var3;
            } else {
                if (th == null) {
                    th = S(obj);
                }
                q1 q1Var = (q1) i02;
                if (!q1Var.a()) {
                    Object M0 = M0(i02, new z(th, false, 2, null));
                    b0Var5 = d2.f13601a;
                    if (M0 == b0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + i02).toString());
                    }
                    b0Var6 = d2.f13603c;
                    if (M0 != b0Var6) {
                        return M0;
                    }
                } else if (L0(q1Var, th)) {
                    b0Var4 = d2.f13601a;
                    return b0Var4;
                }
            }
        }
    }

    private final b2 t0(da.l<? super Throwable, s9.u> lVar, boolean z10) {
        b2 b2Var;
        if (z10) {
            b2Var = lVar instanceof x1 ? (x1) lVar : null;
            if (b2Var == null) {
                b2Var = new t1(lVar);
            }
        } else {
            b2Var = lVar instanceof b2 ? (b2) lVar : null;
            if (b2Var == null) {
                b2Var = new u1(lVar);
            }
        }
        b2Var.C(this);
        return b2Var;
    }

    private final s v0(kotlinx.coroutines.internal.o oVar) {
        while (oVar.u()) {
            oVar = oVar.r();
        }
        while (true) {
            oVar = oVar.q();
            if (!oVar.u()) {
                if (oVar instanceof s) {
                    return (s) oVar;
                }
                if (oVar instanceof h2) {
                    return null;
                }
            }
        }
    }

    private final void w0(h2 h2Var, Throwable th) {
        y0(th);
        c0 c0Var = null;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) h2Var.p(); !kotlin.jvm.internal.l.a(oVar, h2Var); oVar = oVar.q()) {
            if (oVar instanceof x1) {
                b2 b2Var = (b2) oVar;
                try {
                    b2Var.A(th);
                } catch (Throwable th2) {
                    if (c0Var != null) {
                        s9.b.a(c0Var, th2);
                    } else {
                        c0Var = new c0("Exception in completion handler " + b2Var + " for " + this, th2);
                        s9.u uVar = s9.u.f17878a;
                    }
                }
            }
        }
        if (c0Var != null) {
            k0(c0Var);
        }
        K(th);
    }

    private final void x0(h2 h2Var, Throwable th) {
        c0 c0Var = null;
        for (kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) h2Var.p(); !kotlin.jvm.internal.l.a(oVar, h2Var); oVar = oVar.q()) {
            if (oVar instanceof b2) {
                b2 b2Var = (b2) oVar;
                try {
                    b2Var.A(th);
                } catch (Throwable th2) {
                    if (c0Var != null) {
                        s9.b.a(c0Var, th2);
                    } else {
                        c0Var = new c0("Exception in completion handler " + b2Var + " for " + this, th2);
                        s9.u uVar = s9.u.f17878a;
                    }
                }
            }
        }
        if (c0Var != null) {
            k0(c0Var);
        }
    }

    private final boolean y(Object obj, h2 h2Var, b2 b2Var) {
        int z10;
        d dVar = new d(b2Var, this, obj);
        do {
            z10 = h2Var.r().z(b2Var, h2Var, dVar);
            if (z10 == 1) {
                return true;
            }
        } while (z10 != 2);
        return false;
    }

    protected void A0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(Object obj) {
    }

    public final Object D(v9.d<Object> dVar) {
        Object i02;
        do {
            i02 = i0();
            if (!(i02 instanceof q1)) {
                if (i02 instanceof z) {
                    throw ((z) i02).f13689a;
                }
                return d2.h(i02);
            }
        } while (F0(i02) < 0);
        return E(dVar);
    }

    public final void D0(b2 b2Var) {
        Object i02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var;
        do {
            i02 = i0();
            if (!(i02 instanceof b2)) {
                if (!(i02 instanceof q1) || ((q1) i02).g() == null) {
                    return;
                }
                b2Var.v();
                return;
            } else if (i02 != b2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f13585j;
                f1Var = d2.f13607g;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, i02, f1Var));
    }

    public final void E0(r rVar) {
        this._parentHandle = rVar;
    }

    public final boolean F(Throwable th) {
        return G(th);
    }

    public final boolean G(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        kotlinx.coroutines.internal.b0 b0Var3;
        obj2 = d2.f13601a;
        if (c0() && (obj2 = J(obj)) == d2.f13602b) {
            return true;
        }
        b0Var = d2.f13601a;
        if (obj2 == b0Var) {
            obj2 = q0(obj);
        }
        b0Var2 = d2.f13601a;
        if (obj2 == b0Var2 || obj2 == d2.f13602b) {
            return true;
        }
        b0Var3 = d2.f13604d;
        if (obj2 == b0Var3) {
            return false;
        }
        B(obj2);
        return true;
    }

    @Override // la.v1
    public final Object H(v9.d<? super s9.u> dVar) {
        Object c10;
        if (!o0()) {
            z1.i(dVar.getContext());
            return s9.u.f17878a;
        }
        Object p02 = p0(dVar);
        c10 = w9.d.c();
        return p02 == c10 ? p02 : s9.u.f17878a;
    }

    protected final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = M();
            }
            cancellationException = new w1(str, th, this);
        }
        return cancellationException;
    }

    public void I(Throwable th) {
        G(th);
    }

    public final String J0() {
        return u0() + '{' + G0(i0()) + '}';
    }

    @Override // la.k2
    public CancellationException L() {
        Throwable th;
        Object i02 = i0();
        if (i02 instanceof c) {
            th = ((c) i02).e();
        } else if (i02 instanceof z) {
            th = ((z) i02).f13689a;
        } else if (i02 instanceof q1) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + i02).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new w1("Parent job is " + G0(i02), th, this);
        }
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String M() {
        return "Job was cancelled";
    }

    @Override // v9.g
    public <R> R N(R r10, da.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) v1.a.b(this, r10, pVar);
    }

    @Override // la.v1
    public final CancellationException O() {
        Object i02 = i0();
        if (!(i02 instanceof c)) {
            if (i02 instanceof q1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (i02 instanceof z) {
                return I0(this, ((z) i02).f13689a, null, 1, null);
            } else {
                return new w1(o0.a(this) + " has completed normally", null, this);
            }
        }
        Throwable e10 = ((c) i02).e();
        if (e10 != null) {
            CancellationException H0 = H0(e10, o0.a(this) + " is cancelling");
            if (H0 != null) {
                return H0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return G(th) && a0();
    }

    @Override // la.v1
    public void T(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new w1(M(), null, this);
        }
        I(cancellationException);
    }

    @Override // la.v1
    public final r U(t tVar) {
        return (r) v1.a.d(this, true, false, new s(tVar), 2, null);
    }

    public final Object X() {
        Object i02 = i0();
        if (!(i02 instanceof q1)) {
            if (i02 instanceof z) {
                throw ((z) i02).f13689a;
            }
            return d2.h(i02);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // la.v1
    public boolean a() {
        Object i02 = i0();
        return (i02 instanceof q1) && ((q1) i02).a();
    }

    public boolean a0() {
        return true;
    }

    @Override // v9.g.b, v9.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) v1.a.c(this, cVar);
    }

    @Override // la.v1
    public final c1 b0(da.l<? super Throwable, s9.u> lVar) {
        return v(false, true, lVar);
    }

    public boolean c0() {
        return false;
    }

    @Override // v9.g
    public v9.g f0(g.c<?> cVar) {
        return v1.a.e(this, cVar);
    }

    @Override // v9.g.b
    public final g.c<?> getKey() {
        return v1.f13674g;
    }

    public final r h0() {
        return (r) this._parentHandle;
    }

    public final Object i0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.w)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.w) obj).c(this);
        }
    }

    protected boolean j0(Throwable th) {
        return false;
    }

    public void k0(Throwable th) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l0(v1 v1Var) {
        if (v1Var == null) {
            E0(i2.f13634j);
            return;
        }
        v1Var.start();
        r U = v1Var.U(this);
        E0(U);
        if (m0()) {
            U.b();
            E0(i2.f13634j);
        }
    }

    public final boolean m0() {
        return !(i0() instanceof q1);
    }

    protected boolean n0() {
        return false;
    }

    @Override // la.t
    public final void q(k2 k2Var) {
        G(k2Var);
    }

    @Override // v9.g
    public v9.g r(v9.g gVar) {
        return v1.a.f(this, gVar);
    }

    public final boolean r0(Object obj) {
        Object M0;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            M0 = M0(i0(), obj);
            b0Var = d2.f13601a;
            if (M0 == b0Var) {
                return false;
            }
            if (M0 == d2.f13602b) {
                return true;
            }
            b0Var2 = d2.f13603c;
        } while (M0 == b0Var2);
        B(M0);
        return true;
    }

    public final Object s0(Object obj) {
        Object M0;
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        do {
            M0 = M0(i0(), obj);
            b0Var = d2.f13601a;
            if (M0 == b0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, Y(obj));
            }
            b0Var2 = d2.f13603c;
        } while (M0 == b0Var2);
        return M0;
    }

    @Override // la.v1
    public final boolean start() {
        int F0;
        do {
            F0 = F0(i0());
            if (F0 == 0) {
                return false;
            }
        } while (F0 != 1);
        return true;
    }

    public String toString() {
        return J0() + '@' + o0.b(this);
    }

    public String u0() {
        return o0.a(this);
    }

    @Override // la.v1
    public final c1 v(boolean z10, boolean z11, da.l<? super Throwable, s9.u> lVar) {
        b2 t02 = t0(lVar, z10);
        while (true) {
            Object i02 = i0();
            if (i02 instanceof f1) {
                f1 f1Var = (f1) i02;
                if (!f1Var.a()) {
                    B0(f1Var);
                } else if (androidx.concurrent.futures.b.a(f13585j, this, i02, t02)) {
                    return t02;
                }
            } else {
                if (!(i02 instanceof q1)) {
                    if (z11) {
                        z zVar = i02 instanceof z ? (z) i02 : null;
                        lVar.invoke(zVar != null ? zVar.f13689a : null);
                    }
                    return i2.f13634j;
                }
                h2 g10 = ((q1) i02).g();
                if (g10 == null) {
                    Objects.requireNonNull(i02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    C0((b2) i02);
                } else {
                    c1 c1Var = i2.f13634j;
                    if (z10 && (i02 instanceof c)) {
                        synchronized (i02) {
                            r3 = ((c) i02).e();
                            if (r3 == null || ((lVar instanceof s) && !((c) i02).h())) {
                                if (y(i02, g10, t02)) {
                                    if (r3 == null) {
                                        return t02;
                                    }
                                    c1Var = t02;
                                }
                            }
                            s9.u uVar = s9.u.f17878a;
                        }
                    }
                    if (r3 != null) {
                        if (z11) {
                            lVar.invoke(r3);
                        }
                        return c1Var;
                    } else if (y(i02, g10, t02)) {
                        return t02;
                    }
                }
            }
        }
    }

    @Override // la.v1
    public final ja.b<v1> w() {
        ja.b<v1> b10;
        b10 = ja.f.b(new e(null));
        return b10;
    }

    public final Throwable x() {
        Object i02 = i0();
        if (!(i02 instanceof q1)) {
            return Y(i02);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    protected void y0(Throwable th) {
    }

    protected void z0(Object obj) {
    }
}
