package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mn  reason: invalid package */
/* loaded from: classes.dex */
public final class mn extends r5 implements x6 {
    private static final mn zzb;
    private int zzd;
    private m4 zze = m4.f4993k;
    private sn zzf;

    static {
        mn mnVar = new mn();
        zzb = mnVar;
        r5.m(mn.class, mnVar);
    }

    private mn() {
    }

    public static ln D() {
        return (ln) zzb.v();
    }

    public static mn F(m4 m4Var, e5 e5Var) {
        return (mn) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void K(mn mnVar, sn snVar) {
        snVar.getClass();
        mnVar.zzf = snVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final sn G() {
        sn snVar = this.zzf;
        return snVar == null ? sn.F() : snVar;
    }

    public final m4 H() {
        return this.zze;
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
                    return new ln(null);
                }
                return new mn();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
