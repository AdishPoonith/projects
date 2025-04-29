package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.at */
/* loaded from: classes.dex */
public final class at extends r5 implements x6 {
    private static final at zzb;
    private String zzd = "";
    private as zze;

    static {
        at atVar = new at();
        zzb = atVar;
        r5.m(at.class, atVar);
    }

    private at() {
    }

    public static at E() {
        return zzb;
    }

    public static at F(m4 m4Var, e5 e5Var) {
        return (at) r5.z(zzb, m4Var, e5Var);
    }

    public final as C() {
        as asVar = this.zze;
        return asVar == null ? as.E() : asVar;
    }

    public final String G() {
        return this.zzd;
    }

    public final boolean H() {
        return this.zze != null;
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
                    return new zs(null);
                }
                return new at();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
