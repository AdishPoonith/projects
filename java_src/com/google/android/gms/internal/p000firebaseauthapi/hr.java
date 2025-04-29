package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hr */
/* loaded from: classes.dex */
public final class hr extends r5 implements x6 {
    private static final hr zzb;
    private kr zzd;

    static {
        hr hrVar = new hr();
        zzb = hrVar;
        r5.m(hr.class, hrVar);
    }

    private hr() {
    }

    public static gr C() {
        return (gr) zzb.v();
    }

    public static hr E(m4 m4Var, e5 e5Var) {
        return (hr) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void G(hr hrVar, kr krVar) {
        krVar.getClass();
        hrVar.zzd = krVar;
    }

    public final kr F() {
        kr krVar = this.zzd;
        return krVar == null ? kr.E() : krVar;
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
                    return new gr(null);
                }
                return new hr();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
