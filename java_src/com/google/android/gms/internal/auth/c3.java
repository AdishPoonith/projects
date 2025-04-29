package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class c3 {

    /* renamed from: a  reason: collision with root package name */
    private static final b3 f4032a;

    /* renamed from: b  reason: collision with root package name */
    private static final b3 f4033b;

    static {
        b3 b3Var;
        try {
            b3Var = (b3) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            b3Var = null;
        }
        f4032a = b3Var;
        f4033b = new b3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b3 a() {
        return f4032a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b3 b() {
        return f4033b;
    }
}
