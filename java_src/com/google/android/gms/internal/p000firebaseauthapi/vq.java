package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vq  reason: invalid package */
/* loaded from: classes.dex */
public final class vq extends r5 implements x6 {
    private static final vq zzb;
    private int zzd;
    private br zze;
    private m4 zzf = m4.f4993k;

    static {
        vq vqVar = new vq();
        zzb = vqVar;
        r5.m(vq.class, vqVar);
    }

    private vq() {
    }

    public static uq D() {
        return (uq) zzb.v();
    }

    public static vq F() {
        return zzb;
    }

    public static vq G(m4 m4Var, e5 e5Var) {
        return (vq) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(vq vqVar, br brVar) {
        brVar.getClass();
        vqVar.zze = brVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final br H() {
        br brVar = this.zze;
        return brVar == null ? br.F() : brVar;
    }

    public final m4 I() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new uq(null);
                }
                return new vq();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
