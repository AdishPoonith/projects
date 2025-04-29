package com.google.protobuf;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f7088a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f7089b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f7090c;

    static {
        f7090c = (f7088a || a("org.robolectric.Robolectric") == null) ? false : true;
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
        return f7089b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return f7088a || !(f7089b == null || f7090c);
    }
}
