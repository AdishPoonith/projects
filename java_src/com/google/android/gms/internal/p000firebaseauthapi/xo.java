package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xo */
/* loaded from: classes.dex */
public final class xo extends r5 implements x6 {
    private static final xo zzb;
    private int zzd;
    private int zze;

    static {
        xo xoVar = new xo();
        zzb = xoVar;
        r5.m(xo.class, xoVar);
    }

    private xo() {
    }

    public static wo D() {
        return (wo) zzb.v();
    }

    public static xo F(m4 m4Var, e5 e5Var) {
        return (xo) r5.z(zzb, m4Var, e5Var);
    }

    public final int C() {
        return this.zzd;
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
                    return new wo(null);
                }
                return new xo();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
