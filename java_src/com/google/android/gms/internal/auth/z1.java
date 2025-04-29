package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private static final x1 f4284a = new y1();

    /* renamed from: b  reason: collision with root package name */
    private static final x1 f4285b;

    static {
        x1 x1Var;
        try {
            x1Var = (x1) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x1Var = null;
        }
        f4285b = x1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x1 a() {
        x1 x1Var = f4285b;
        if (x1Var != null) {
            return x1Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x1 b() {
        return f4284a;
    }
}
