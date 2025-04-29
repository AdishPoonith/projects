package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yp */
/* loaded from: classes.dex */
public final class yp extends r5 implements x6 {
    private static final yp zzb;
    private bq zzd;

    static {
        yp ypVar = new yp();
        zzb = ypVar;
        r5.m(yp.class, ypVar);
    }

    private yp() {
    }

    public static xp C() {
        return (xp) zzb.v();
    }

    public static yp E(m4 m4Var, e5 e5Var) {
        return (yp) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void G(yp ypVar, bq bqVar) {
        bqVar.getClass();
        ypVar.zzd = bqVar;
    }

    public final bq F() {
        bq bqVar = this.zzd;
        return bqVar == null ? bq.F() : bqVar;
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
                    return new xp(null);
                }
                return new yp();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
