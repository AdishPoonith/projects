package la;
/* loaded from: classes.dex */
final class v0 extends RuntimeException {

    /* renamed from: j  reason: collision with root package name */
    private final v9.g f13673j;

    public v0(v9.g gVar) {
        this.f13673j = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f13673j.toString();
    }
}
