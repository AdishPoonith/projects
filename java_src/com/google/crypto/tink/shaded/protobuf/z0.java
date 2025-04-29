package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final x0 f6454a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final x0 f6455b = new y0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 a() {
        return f6454a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 b() {
        return f6455b;
    }

    private static x0 c() {
        try {
            return (x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
