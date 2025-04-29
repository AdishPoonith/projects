package na;

import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import la.o0;
/* loaded from: classes.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: m  reason: collision with root package name */
    public final Throwable f14380m;

    @Override // na.s
    public void A() {
    }

    @Override // na.s
    public b0 C(o.b bVar) {
        return la.n.f13652a;
    }

    @Override // na.q
    /* renamed from: E */
    public j<E> d() {
        return this;
    }

    @Override // na.s
    /* renamed from: F */
    public j<E> B() {
        return this;
    }

    public final Throwable G() {
        Throwable th = this.f14380m;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable H() {
        Throwable th = this.f14380m;
        return th == null ? new l("Channel was closed") : th;
    }

    @Override // na.q
    public void c(E e10) {
    }

    @Override // na.q
    public b0 f(E e10, o.b bVar) {
        return la.n.f13652a;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return "Closed@" + o0.b(this) + '[' + this.f14380m + ']';
    }
}
