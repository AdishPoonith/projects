package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vn */
/* loaded from: classes.dex */
public final class vn extends r5 implements x6 {
    private static final vn zzb;
    private int zzd;
    private bo zze;
    private vq zzf;

    static {
        vn vnVar = new vn();
        zzb = vnVar;
        r5.m(vn.class, vnVar);
    }

    private vn() {
    }

    public static un D() {
        return (un) zzb.v();
    }

    public static vn F(m4 m4Var, e5 e5Var) {
        return (vn) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void J(vn vnVar, bo boVar) {
        boVar.getClass();
        vnVar.zze = boVar;
    }

    public static /* synthetic */ void K(vn vnVar, vq vqVar) {
        vqVar.getClass();
        vnVar.zzf = vqVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final bo G() {
        bo boVar = this.zze;
        return boVar == null ? bo.F() : boVar;
    }

    public final vq H() {
        vq vqVar = this.zzf;
        return vqVar == null ? vq.F() : vqVar;
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
                    return new un(null);
                }
                return new vn();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
