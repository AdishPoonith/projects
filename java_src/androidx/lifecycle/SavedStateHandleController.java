package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class SavedStateHandleController implements g {

    /* renamed from: j  reason: collision with root package name */
    private final String f2515j;

    /* renamed from: k  reason: collision with root package name */
    private final s f2516k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2517l;

    public final void a(androidx.savedstate.a registry, e lifecycle) {
        kotlin.jvm.internal.l.e(registry, "registry");
        kotlin.jvm.internal.l.e(lifecycle, "lifecycle");
        if (!(!this.f2517l)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f2517l = true;
        lifecycle.a(this);
        registry.h(this.f2515j, this.f2516k.c());
    }

    public final boolean b() {
        return this.f2517l;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (event == e.a.ON_DESTROY) {
            this.f2517l = false;
            source.a().c(this);
        }
    }
}
