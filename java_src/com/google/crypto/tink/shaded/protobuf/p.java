package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f6277a = c();

    public static q a() {
        q b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : q.f6288d;
    }

    private static final q b(String str) {
        Class<?> cls = f6277a;
        if (cls == null) {
            return null;
        }
        try {
            return (q) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
