package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yq */
/* loaded from: classes.dex */
public final class yq extends r5 implements x6 {
    private static final yq zzb;
    private br zzd;
    private int zze;
    private int zzf;

    static {
        yq yqVar = new yq();
        zzb = yqVar;
        r5.m(yq.class, yqVar);
    }

    private yq() {
    }

    public static xq D() {
        return (xq) zzb.v();
    }

    public static yq F() {
        return zzb;
    }

    public static yq G(m4 m4Var, e5 e5Var) {
        return (yq) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void I(yq yqVar, br brVar) {
        brVar.getClass();
        yqVar.zzd = brVar;
    }

    public final int C() {
        return this.zze;
    }

    public final br H() {
        br brVar = this.zzd;
        return brVar == null ? br.F() : brVar;
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
                    return new xq(null);
                }
                return new yq();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
