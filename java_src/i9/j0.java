package i9;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f9917d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final String f9918a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9919b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9920c;

    j0(String str, String str2, long j10) {
        b5.n.o(str, "typeName");
        b5.n.e(!str.isEmpty(), "empty type");
        this.f9918a = str;
        this.f9919b = str2;
        this.f9920c = j10;
    }

    public static j0 a(Class<?> cls, String str) {
        return b(c(cls), str);
    }

    public static j0 b(String str, String str2) {
        return new j0(str, str2, e());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) b5.n.o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f9917d.incrementAndGet();
    }

    public long d() {
        return this.f9920c;
    }

    public String f() {
        return this.f9918a + "<" + this.f9920c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        if (this.f9919b != null) {
            sb.append(": (");
            sb.append(this.f9919b);
            sb.append(')');
        }
        return sb.toString();
    }
}
