package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.us  reason: invalid package */
/* loaded from: classes.dex */
public final class us extends r5 implements x6 {
    private static final us zzb;
    private String zzd = "";

    static {
        us usVar = new us();
        zzb = usVar;
        r5.m(us.class, usVar);
    }

    private us() {
    }

    public static us D() {
        return zzb;
    }

    public static us E(m4 m4Var, e5 e5Var) {
        return (us) r5.z(zzb, m4Var, e5Var);
    }

    public final String F() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.r5
    public final Object t(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ts(null);
                }
                return new us();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
