package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mt */
/* loaded from: classes.dex */
public final class mt extends r5 implements x6 {
    private static final mt zzb;
    private int zzd;

    static {
        mt mtVar = new mt();
        zzb = mtVar;
        r5.m(mt.class, mtVar);
    }

    private mt() {
    }

    public static mt D() {
        return zzb;
    }

    public static mt E(m4 m4Var, e5 e5Var) {
        return (mt) r5.z(zzb, m4Var, e5Var);
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
                    return new lt(null);
                }
                return new mt();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
