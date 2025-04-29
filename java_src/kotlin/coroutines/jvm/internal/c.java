package kotlin.coroutines.jvm.internal;
/* loaded from: classes.dex */
public final class c implements v9.d<Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final c f12833j = new c();

    private c() {
    }

    @Override // v9.d
    public v9.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // v9.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
