package com.google.protobuf;
/* loaded from: classes.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final r<?> f7316a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final r<?> f7317b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> a() {
        r<?> rVar = f7317b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> b() {
        return f7316a;
    }

    private static r<?> c() {
        try {
            return (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
