package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nr  reason: invalid package */
/* loaded from: classes.dex */
public final class nr extends r5 implements x6 {
    private static final nr zzb;
    private int zzd;
    private qr zze;
    private m4 zzf = m4.f4993k;

    static {
        nr nrVar = new nr();
        zzb = nrVar;
        r5.m(nr.class, nrVar);
    }

    private nr() {
    }

    public static mr D() {
        return (mr) zzb.v();
    }

    public static nr F(m4 m4Var, e5 e5Var) {
        return (nr) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(nr nrVar, qr qrVar) {
        qrVar.getClass();
        nrVar.zze = qrVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final qr G() {
        qr qrVar = this.zze;
        return qrVar == null ? qr.G() : qrVar;
    }

    public final m4 H() {
        return this.zzf;
    }

    public final boolean L() {
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
                    return new mr(null);
                }
                return new nr();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
