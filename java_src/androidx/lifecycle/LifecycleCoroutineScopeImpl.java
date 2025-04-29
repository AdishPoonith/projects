package androidx.lifecycle;

import androidx.lifecycle.e;
import la.a2;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends f implements g {

    /* renamed from: j  reason: collision with root package name */
    private final e f2491j;

    /* renamed from: k  reason: collision with root package name */
    private final v9.g f2492k;

    public e a() {
        return this.f2491j;
    }

    @Override // la.k0
    public v9.g n() {
        return this.f2492k;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (a().b().compareTo(e.b.DESTROYED) <= 0) {
            a().c(this);
            a2.d(n(), null, 1, null);
        }
    }
}
