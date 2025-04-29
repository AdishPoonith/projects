package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n5  reason: invalid package */
/* loaded from: classes.dex */
final class n5 implements u6 {

    /* renamed from: a  reason: collision with root package name */
    private static final n5 f5056a = new n5();

    private n5() {
    }

    public static n5 a() {
        return f5056a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u6
    public final t6 zzb(Class cls) {
        if (r5.class.isAssignableFrom(cls)) {
            try {
                return (t6) r5.x(cls.asSubclass(r5.class)).t(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u6
    public final boolean zzc(Class cls) {
        return r5.class.isAssignableFrom(cls);
    }
}
