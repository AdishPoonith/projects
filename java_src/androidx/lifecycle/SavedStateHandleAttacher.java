package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements g {

    /* renamed from: j  reason: collision with root package name */
    private final u f2514j;

    public SavedStateHandleAttacher(u provider) {
        kotlin.jvm.internal.l.e(provider, "provider");
        this.f2514j = provider;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (event == e.a.ON_CREATE) {
            source.a().c(this);
            this.f2514j.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
