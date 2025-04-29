package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fq */
/* loaded from: classes.dex */
public final class fq extends r5 implements x6 {
    private static final fq zzb;
    private int zzd;
    private iq zze;
    private m4 zzf = m4.f4993k;

    static {
        fq fqVar = new fq();
        zzb = fqVar;
        r5.m(fq.class, fqVar);
    }

    private fq() {
    }

    public static dq D() {
        return (dq) zzb.v();
    }

    public static fq F(m4 m4Var, e5 e5Var) {
        return (fq) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void J(fq fqVar, iq iqVar) {
        iqVar.getClass();
        fqVar.zze = iqVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final iq G() {
        iq iqVar = this.zze;
        return iqVar == null ? iq.G() : iqVar;
    }

    public final m4 H() {
        return this.zzf;
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
                    return new dq(null);
                }
                return new fq();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
