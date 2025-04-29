package com.google.android.gms.internal.p000firebaseauthapi;
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ft */
/* loaded from: classes.dex */
public final class ft extends r5 implements x6 {
    private static final ft zzb;
    private String zzd = "";
    private w5 zze = r5.g();

    static {
        ft ftVar = new ft();
        zzb = ftVar;
        r5.m(ft.class, ftVar);
    }

    private ft() {
    }

    public static ft D() {
        return zzb;
    }

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
                    return new et(null);
                }
                return new ft();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", ds.class});
        }
        return (byte) 1;
    }
}
