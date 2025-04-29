package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.iq  reason: invalid package */
/* loaded from: classes.dex */
public final class iq extends r5 implements x6 {
    private static final iq zzb;
    private int zzd;
    private bq zze;
    private m4 zzf;
    private m4 zzg;

    static {
        iq iqVar = new iq();
        zzb = iqVar;
        r5.m(iq.class, iqVar);
    }

    private iq() {
        m4 m4Var = m4.f4993k;
        this.zzf = m4Var;
        this.zzg = m4Var;
    }

    public static hq E() {
        return (hq) zzb.v();
    }

    public static iq G() {
        return zzb;
    }

    public static iq H(m4 m4Var, e5 e5Var) {
        return (iq) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void L(iq iqVar, bq bqVar) {
        bqVar.getClass();
        iqVar.zze = bqVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final bq D() {
        bq bqVar = this.zze;
        return bqVar == null ? bq.F() : bqVar;
    }

    public final m4 I() {
        return this.zzf;
    }

    public final m4 J() {
        return this.zzg;
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
                    return new hq(null);
                }
                return new iq();
            }
            return r5.j(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
