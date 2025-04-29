package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qr  reason: invalid package */
/* loaded from: classes.dex */
public final class qr extends r5 implements x6 {
    private static final qr zzb;
    private int zzd;
    private kr zze;
    private m4 zzf = m4.f4993k;

    static {
        qr qrVar = new qr();
        zzb = qrVar;
        r5.m(qr.class, qrVar);
    }

    private qr() {
    }

    public static pr E() {
        return (pr) zzb.v();
    }

    public static qr G() {
        return zzb;
    }

    public static qr H(m4 m4Var, e5 e5Var) {
        return (qr) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(qr qrVar, kr krVar) {
        krVar.getClass();
        qrVar.zze = krVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final kr D() {
        kr krVar = this.zze;
        return krVar == null ? kr.E() : krVar;
    }

    public final m4 I() {
        return this.zzf;
    }

    public final boolean M() {
        return this.zze != null;
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
                    return new pr(null);
                }
                return new qr();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
