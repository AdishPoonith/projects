package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6137a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f6138b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f6139c;

    static {
        f6139c = (f6137a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f6138b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f6137a || !(f6138b == null || f6139c);
    }
}
