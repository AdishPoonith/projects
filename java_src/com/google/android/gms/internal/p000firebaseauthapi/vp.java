package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vp */
/* loaded from: classes.dex */
public final class vp extends r5 implements x6 {
    private static final vp zzb;
    private as zzd;

    static {
        vp vpVar = new vp();
        zzb = vpVar;
        r5.m(vp.class, vpVar);
    }

    private vp() {
    }

    public static up C() {
        return (up) zzb.v();
    }

    public static vp E() {
        return zzb;
    }

    public static /* synthetic */ void G(vp vpVar, as asVar) {
        asVar.getClass();
        vpVar.zzd = asVar;
    }

    public final as F() {
        as asVar = this.zzd;
        return asVar == null ? as.E() : asVar;
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
                    return new up(null);
                }
                return new vp();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
