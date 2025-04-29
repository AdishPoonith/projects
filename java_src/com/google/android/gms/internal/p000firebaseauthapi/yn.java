package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yn */
/* loaded from: classes.dex */
public final class yn extends r5 implements x6 {
    private static final yn zzb;
    private fo zzd;
    private yq zze;

    static {
        yn ynVar = new yn();
        zzb = ynVar;
        r5.m(yn.class, ynVar);
    }

    private yn() {
    }

    public static xn C() {
        return (xn) zzb.v();
    }

    public static yn E(m4 m4Var, e5 e5Var) {
        return (yn) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void H(yn ynVar, fo foVar) {
        foVar.getClass();
        ynVar.zzd = foVar;
    }

    public static /* synthetic */ void I(yn ynVar, yq yqVar) {
        yqVar.getClass();
        ynVar.zze = yqVar;
    }

    public final fo F() {
        fo foVar = this.zzd;
        return foVar == null ? fo.F() : foVar;
    }

    public final yq G() {
        yq yqVar = this.zze;
        return yqVar == null ? yq.F() : yqVar;
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
                    return new xn(null);
                }
                return new yn();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
