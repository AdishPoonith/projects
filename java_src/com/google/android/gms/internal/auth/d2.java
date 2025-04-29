package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class d2 implements e3 {

    /* renamed from: a  reason: collision with root package name */
    private static final d2 f4039a = new d2();

    private d2() {
    }

    public static d2 a() {
        return f4039a;
    }

    @Override // com.google.android.gms.internal.auth.e3
    public final d3 zzb(Class cls) {
        if (g2.class.isAssignableFrom(cls)) {
            try {
                return (d3) g2.a(cls.asSubclass(g2.class)).g(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.e3
    public final boolean zzc(Class cls) {
        return g2.class.isAssignableFrom(cls);
    }
}
