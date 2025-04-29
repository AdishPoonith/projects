package androidx.lifecycle;

import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: j  reason: collision with root package name */
    private final b[] f2484j;

    public CompositeGeneratedAdaptersObserver(b[] generatedAdapters) {
        kotlin.jvm.internal.l.e(generatedAdapters, "generatedAdapters");
        this.f2484j = generatedAdapters;
    }

    @Override // androidx.lifecycle.g
    public void q(i source, e.a event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        m mVar = new m();
        for (b bVar : this.f2484j) {
            bVar.a(source, event, false, mVar);
        }
        for (b bVar2 : this.f2484j) {
            bVar2.a(source, event, true, mVar);
        }
    }
}
