package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final n0 f6278a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final n0 f6279b = new o0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n0 a() {
        return f6278a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n0 b() {
        return f6279b;
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
