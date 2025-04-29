package com.google.protobuf;
/* loaded from: classes.dex */
final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private static final a1 f7083a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final a1 f7084b = new b1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a1 a() {
        return f7083a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a1 b() {
        return f7084b;
    }

    private static a1 c() {
        try {
            return (a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
