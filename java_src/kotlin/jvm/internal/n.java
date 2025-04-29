package kotlin.jvm.internal;
/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: j  reason: collision with root package name */
    private final Class<?> f12853j;

    /* renamed from: k  reason: collision with root package name */
    private final String f12854k;

    public n(Class<?> jClass, String moduleName) {
        l.e(jClass, "jClass");
        l.e(moduleName, "moduleName");
        this.f12853j = jClass;
        this.f12854k = moduleName;
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> b() {
        return this.f12853j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(b(), ((n) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
