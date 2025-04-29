package kotlinx.coroutines.scheduling;
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: r  reason: collision with root package name */
    public static final c f12956r = new c();

    private c() {
        super(l.f12968b, l.f12969c, l.f12970d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // la.g0
    public String toString() {
        return "Dispatchers.Default";
    }
}
