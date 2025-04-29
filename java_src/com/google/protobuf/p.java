package com.google.protobuf;
/* loaded from: classes.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f7273a = c();

    public static q a() {
        q b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : q.f7282d;
    }

    private static final q b(String str) {
        Class<?> cls = f7273a;
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
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
