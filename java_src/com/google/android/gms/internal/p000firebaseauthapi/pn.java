package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pn */
/* loaded from: classes.dex */
public final class pn extends r5 implements x6 {
    private static final pn zzb;
    private int zzd;
    private sn zze;

    static {
        pn pnVar = new pn();
        zzb = pnVar;
        r5.m(pn.class, pnVar);
    }

    private pn() {
    }

    public static on D() {
        return (on) zzb.v();
    }

    public static pn F(m4 m4Var, e5 e5Var) {
        return (pn) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void I(pn pnVar, sn snVar) {
        snVar.getClass();
        pnVar.zze = snVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final sn G() {
        sn snVar = this.zze;
        return snVar == null ? sn.F() : snVar;
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
                    return new on(null);
                }
                return new pn();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
