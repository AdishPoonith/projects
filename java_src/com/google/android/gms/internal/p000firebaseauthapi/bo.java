package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bo  reason: invalid package */
/* loaded from: classes.dex */
public final class bo extends r5 implements x6 {
    private static final bo zzb;
    private int zzd;
    private io zze;
    private m4 zzf = m4.f4993k;

    static {
        bo boVar = new bo();
        zzb = boVar;
        r5.m(bo.class, boVar);
    }

    private bo() {
    }

    public static ao D() {
        return (ao) zzb.v();
    }

    public static bo F() {
        return zzb;
    }

    public static bo G(m4 m4Var, e5 e5Var) {
        return (bo) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(bo boVar, io ioVar) {
        ioVar.getClass();
        boVar.zze = ioVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final io H() {
        io ioVar = this.zze;
        return ioVar == null ? io.F() : ioVar;
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
                    return new ao(null);
                }
                return new bo();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
