package androidx.profileinstaller;
/* loaded from: classes.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: j  reason: collision with root package name */
    private final long f2639j;

    f(long j10) {
        this.f2639j = j10;
    }

    public long g() {
        return this.f2639j;
    }
}
