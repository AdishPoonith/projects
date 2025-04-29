package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final r<?> f6323a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final r<?> f6324b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> a() {
        r<?> rVar = f6324b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> b() {
        return f6323a;
    }

    private static r<?> c() {
        try {
            return (r) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
