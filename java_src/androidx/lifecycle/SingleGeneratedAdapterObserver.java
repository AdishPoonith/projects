package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements g {

    /* renamed from: j  reason: collision with root package name */
    private final b f2518j;

    public SingleGeneratedAdapterObserver(b generatedAdapter) {
        kotlin.jvm.internal.l.e(generatedAdapter, "generatedAdapter");
        this.f2518j = generatedAdapter;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        this.f2518j.a(source, event, false, null);
        this.f2518j.a(source, event, true, null);
    }
}
