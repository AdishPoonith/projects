package f1;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f8603a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f8604b;

    private z() {
    }

    public static final String a() {
        return f8604b;
    }

    public static final boolean b() {
        boolean t10;
        String str = f8604b;
        Boolean bool = null;
        if (str != null) {
            t10 = ka.p.t(str, "Unity.", false, 2, null);
            bool = Boolean.valueOf(t10);
        }
        return kotlin.jvm.internal.l.a(bool, Boolean.TRUE);
    }
}
