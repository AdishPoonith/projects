package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i5  reason: invalid package */
/* loaded from: classes.dex */
final class i5 {

    /* renamed from: a  reason: collision with root package name */
    private static final f5 f4733a = new g5();

    /* renamed from: b  reason: collision with root package name */
    private static final f5 f4734b;

    static {
        f5 f5Var;
        try {
            f5Var = (f5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f5Var = null;
        }
        f4734b = f5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f5 a() {
        f5 f5Var = f4734b;
        if (f5Var != null) {
            return f5Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f5 b() {
        return f4733a;
    }
}
