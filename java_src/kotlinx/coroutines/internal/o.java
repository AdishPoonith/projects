package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import la.o0;
/* loaded from: classes.dex */
public class o {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f12901j = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f12902k = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev");

    /* renamed from: l  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12903l = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.c<o> {

        /* renamed from: b  reason: collision with root package name */
        public final o f12904b;

        /* renamed from: c  reason: collision with root package name */
        public o f12905c;

        public a(o oVar) {
            this.f12904b = oVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h */
        public void d(o oVar, Object obj) {
            boolean z10 = obj == null;
            o oVar2 = z10 ? this.f12904b : this.f12905c;
            if (oVar2 != null && androidx.concurrent.futures.b.a(o.f12901j, oVar, this, oVar2) && z10) {
                o oVar3 = this.f12904b;
                o oVar4 = this.f12905c;
                kotlin.jvm.internal.l.b(oVar4);
                oVar3.o(oVar4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends w {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (androidx.concurrent.futures.b.a(kotlinx.coroutines.internal.o.f12901j, r3, r2, ((kotlinx.coroutines.internal.x) r4).f12925a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.o m(kotlinx.coroutines.internal.w r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.o) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.o.f12902k
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.u()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.w
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.w r0 = (kotlinx.coroutines.internal.w) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.w) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.x
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.o.f12901j
            kotlinx.coroutines.internal.x r4 = (kotlinx.coroutines.internal.x) r4
            kotlinx.coroutines.internal.o r4 = r4.f12925a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.o) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.m(kotlinx.coroutines.internal.w):kotlinx.coroutines.internal.o");
    }

    private final o n(o oVar) {
        while (oVar.u()) {
            oVar = (o) oVar._prev;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(o oVar) {
        o oVar2;
        do {
            oVar2 = (o) oVar._prev;
            if (p() != oVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f12902k, oVar, oVar2, this));
        if (u()) {
            oVar.m(null);
        }
    }

    private final x y() {
        x xVar = (x) this._removedRef;
        if (xVar == null) {
            x xVar2 = new x(this);
            f12903l.lazySet(this, xVar2);
            return xVar2;
        }
        return xVar;
    }

    public final void i(o oVar) {
        do {
        } while (!r().j(oVar, this));
    }

    public final boolean j(o oVar, o oVar2) {
        f12902k.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12901j;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, oVar2, oVar)) {
            oVar.o(oVar2);
            return true;
        }
        return false;
    }

    public final boolean l(o oVar) {
        f12902k.lazySet(oVar, this);
        f12901j.lazySet(oVar, this);
        while (p() == this) {
            if (androidx.concurrent.futures.b.a(f12901j, this, this, oVar)) {
                oVar.o(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof w)) {
                return obj;
            }
            ((w) obj).c(this);
        }
    }

    public final o q() {
        return n.b(p());
    }

    public final o r() {
        o m10 = m(null);
        return m10 == null ? n((o) this._prev) : m10;
    }

    public final void s() {
        ((x) p()).f12925a.t();
    }

    public final void t() {
        o oVar = this;
        while (true) {
            Object p10 = oVar.p();
            if (!(p10 instanceof x)) {
                oVar.m(null);
                return;
            }
            oVar = ((x) p10).f12925a;
        }
    }

    public String toString() {
        return new kotlin.jvm.internal.p(this) { // from class: kotlinx.coroutines.internal.o.c
            @Override // ia.f
            public Object get() {
                return o0.a(this.receiver);
            }
        } + '@' + o0.b(this);
    }

    public boolean u() {
        return p() instanceof x;
    }

    public boolean v() {
        return x() == null;
    }

    public final o w() {
        while (true) {
            o oVar = (o) p();
            if (oVar == this) {
                return null;
            }
            if (oVar.v()) {
                return oVar;
            }
            oVar.s();
        }
    }

    public final o x() {
        Object p10;
        o oVar;
        do {
            p10 = p();
            if (p10 instanceof x) {
                return ((x) p10).f12925a;
            }
            if (p10 == this) {
                return (o) p10;
            }
            oVar = (o) p10;
        } while (!androidx.concurrent.futures.b.a(f12901j, this, p10, oVar.y()));
        oVar.m(null);
        return null;
    }

    public final int z(o oVar, o oVar2, a aVar) {
        f12902k.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12901j;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        aVar.f12905c = oVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, oVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
