package kotlinx.coroutines.internal;

import la.k0;
/* loaded from: classes.dex */
public final class e implements k0 {

    /* renamed from: j  reason: collision with root package name */
    private final v9.g f12872j;

    public e(v9.g gVar) {
        this.f12872j = gVar;
    }

    @Override // la.k0
    public v9.g n() {
        return this.f12872j;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + n() + ')';
    }
}
