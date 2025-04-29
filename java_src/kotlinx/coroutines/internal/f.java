package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import la.g1;
import la.o0;
import la.s2;
import la.x0;
/* loaded from: classes.dex */
public final class f<T> extends x0<T> implements kotlin.coroutines.jvm.internal.e, v9.d<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12873q = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: m  reason: collision with root package name */
    public final la.g0 f12874m;

    /* renamed from: n  reason: collision with root package name */
    public final v9.d<T> f12875n;

    /* renamed from: o  reason: collision with root package name */
    public Object f12876o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f12877p;

    /* JADX WARN: Multi-variable type inference failed */
    public f(la.g0 g0Var, v9.d<? super T> dVar) {
        super(-1);
        this.f12874m = g0Var;
        this.f12875n = dVar;
        this.f12876o = g.a();
        this.f12877p = f0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final la.m<?> n() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof la.m) {
            return (la.m) obj;
        }
        return null;
    }

    @Override // la.x0
    public void a(Object obj, Throwable th) {
        if (obj instanceof la.a0) {
            ((la.a0) obj).f13575b.invoke(th);
        }
    }

    @Override // la.x0
    public v9.d<T> b() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        v9.d<T> dVar = this.f12875n;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // v9.d
    public v9.g getContext() {
        return this.f12875n.getContext();
    }

    @Override // la.x0
    public Object k() {
        Object obj = this.f12876o;
        this.f12876o = g.a();
        return obj;
    }

    public final void l() {
        do {
        } while (this._reusableCancellableContinuation == g.f12886b);
    }

    public final la.m<T> m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f12886b;
                return null;
            } else if (obj instanceof la.m) {
                if (androidx.concurrent.futures.b.a(f12873q, this, obj, g.f12886b)) {
                    return (la.m) obj;
                }
            } else if (obj != g.f12886b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean q() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean r(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            b0 b0Var = g.f12886b;
            if (kotlin.jvm.internal.l.a(obj, b0Var)) {
                if (androidx.concurrent.futures.b.a(f12873q, this, b0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.b.a(f12873q, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // v9.d
    public void resumeWith(Object obj) {
        v9.g context = this.f12875n.getContext();
        Object d10 = la.d0.d(obj, null, 1, null);
        if (this.f12874m.i0(context)) {
            this.f12876o = d10;
            this.f13680l = 0;
            this.f12874m.h0(context, this);
            return;
        }
        g1 a10 = s2.f13665a.a();
        if (a10.q0()) {
            this.f12876o = d10;
            this.f13680l = 0;
            a10.m0(this);
            return;
        }
        a10.o0(true);
        try {
            v9.g context2 = getContext();
            Object c10 = f0.c(context2, this.f12877p);
            this.f12875n.resumeWith(obj);
            s9.u uVar = s9.u.f17878a;
            f0.a(context2, c10);
            do {
            } while (a10.s0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void s() {
        l();
        la.m<?> n10 = n();
        if (n10 != null) {
            n10.s();
        }
    }

    public final Throwable t(la.l<?> lVar) {
        b0 b0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            b0Var = g.f12886b;
            if (obj != b0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f12873q, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f12873q, this, b0Var, lVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f12874m + ", " + o0.c(this.f12875n) + ']';
    }
}
