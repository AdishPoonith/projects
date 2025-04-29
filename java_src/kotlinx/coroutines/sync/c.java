package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.w;
import la.c1;
import la.l;
import la.n;
import s9.u;
/* loaded from: classes.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f12981a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a extends b {

        /* renamed from: p  reason: collision with root package name */
        private final l<u> f12982p;

        /* renamed from: kotlinx.coroutines.sync.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0190a extends m implements da.l<Throwable, u> {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ c f12984j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ a f12985k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0190a(c cVar, a aVar) {
                super(1);
                this.f12984j = cVar;
                this.f12985k = aVar;
            }

            public final void a(Throwable th) {
                this.f12984j.a(this.f12985k.f12987m);
            }

            @Override // da.l
            public /* bridge */ /* synthetic */ u invoke(Throwable th) {
                a(th);
                return u.f17878a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, l<? super u> lVar) {
            super(obj);
            this.f12982p = lVar;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public void A() {
            this.f12982p.p(n.f13652a);
        }

        @Override // kotlinx.coroutines.sync.c.b
        public boolean C() {
            return B() && this.f12982p.d(u.f17878a, null, new C0190a(c.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "LockCont[" + this.f12987m + ", " + this.f12982p + "] for " + c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class b extends o implements c1 {

        /* renamed from: o  reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f12986o = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: m  reason: collision with root package name */
        public final Object f12987m;

        public b(Object obj) {
            this.f12987m = obj;
        }

        public abstract void A();

        public final boolean B() {
            return f12986o.compareAndSet(this, 0, 1);
        }

        public abstract boolean C();

        @Override // la.c1
        public final void b() {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.sync.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0191c extends kotlinx.coroutines.internal.m {
        public volatile Object owner;

        public C0191c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends kotlinx.coroutines.internal.c<c> {

        /* renamed from: b  reason: collision with root package name */
        public final C0191c f12989b;

        public d(C0191c c0191c) {
            this.f12989b = c0191c;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h */
        public void d(c cVar, Object obj) {
            androidx.concurrent.futures.b.a(c.f12981a, cVar, this, obj == null ? kotlinx.coroutines.sync.d.f12997f : this.f12989b);
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i */
        public Object g(c cVar) {
            b0 b0Var;
            if (this.f12989b.A()) {
                return null;
            }
            b0Var = kotlinx.coroutines.sync.d.f12993b;
            return b0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends m implements da.l<Throwable, u> {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f12991k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.f12991k = obj;
        }

        public final void a(Throwable th) {
            c.this.a(this.f12991k);
        }

        @Override // da.l
        public /* bridge */ /* synthetic */ u invoke(Throwable th) {
            a(th);
            return u.f17878a;
        }
    }

    public c(boolean z10) {
        this._state = z10 ? kotlinx.coroutines.sync.d.f12996e : kotlinx.coroutines.sync.d.f12997f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        la.o.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r7, v9.d<? super s9.u> r8) {
        /*
            r6 = this;
            v9.d r0 = w9.b.b(r8)
            la.m r0 = la.o.b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
            java.lang.Object r4 = r3.f12980a
            kotlinx.coroutines.internal.b0 r5 = kotlinx.coroutines.sync.d.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f12981a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f12980a
            r5.<init>(r3)
            androidx.concurrent.futures.b.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.d.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f12981a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            s9.u r1 = s9.u.f17878a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.f(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.c.C0191c
            if (r3 == 0) goto La3
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.c.C0191c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.i(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.B()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            la.o.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.w()
            java.lang.Object r0 = w9.b.c()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.h.c(r8)
        L7e:
            java.lang.Object r8 = w9.b.c()
            if (r7 != r8) goto L85
            return r7
        L85:
            s9.u r7 = s9.u.f17878a
            return r7
        L88:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.w
            if (r3 == 0) goto Lae
            kotlinx.coroutines.internal.w r2 = (kotlinx.coroutines.internal.w) r2
            r2.c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.c(java.lang.Object, v9.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.b
    public void a(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        b0 b0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) obj2;
                if (obj == null) {
                    Object obj3 = aVar2.f12980a;
                    b0Var = kotlinx.coroutines.sync.d.f12995d;
                    if (!(obj3 != b0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (!(aVar2.f12980a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar2.f12980a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12981a;
                aVar = kotlinx.coroutines.sync.d.f12997f;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, aVar)) {
                    return;
                }
            } else if (obj2 instanceof w) {
                ((w) obj2).c(this);
            } else if (!(obj2 instanceof C0191c)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                if (obj != null) {
                    C0191c c0191c = (C0191c) obj2;
                    if (!(c0191c.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0191c.owner + " but expected " + obj).toString());
                    }
                }
                C0191c c0191c2 = (C0191c) obj2;
                o w10 = c0191c2.w();
                if (w10 == null) {
                    d dVar = new d(c0191c2);
                    if (androidx.concurrent.futures.b.a(f12981a, this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) w10;
                    if (bVar.C()) {
                        Object obj4 = bVar.f12987m;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.d.f12994c;
                        }
                        c0191c2.owner = obj4;
                        bVar.A();
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.b
    public Object b(Object obj, v9.d<? super u> dVar) {
        Object c10;
        if (d(obj)) {
            return u.f17878a;
        }
        Object c11 = c(obj, dVar);
        c10 = w9.d.c();
        return c11 == c10 ? c11 : u.f17878a;
    }

    public boolean d(Object obj) {
        b0 b0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f12980a;
                b0Var = kotlinx.coroutines.sync.d.f12995d;
                if (obj3 != b0Var) {
                    return false;
                }
                if (androidx.concurrent.futures.b.a(f12981a, this, obj2, obj == null ? kotlinx.coroutines.sync.d.f12996e : new kotlinx.coroutines.sync.a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0191c) {
                if (((C0191c) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof w)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((w) obj2).c(this);
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((kotlinx.coroutines.sync.a) obj2).f12980a;
                break;
            } else if (obj2 instanceof w) {
                ((w) obj2).c(this);
            } else if (!(obj2 instanceof C0191c)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((C0191c) obj2).owner;
            }
        }
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
