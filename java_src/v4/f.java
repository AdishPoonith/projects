package v4;
/* loaded from: classes.dex */
public final class f {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean b(byte b10) {
        if (b10 != 0) {
            if (b10 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
