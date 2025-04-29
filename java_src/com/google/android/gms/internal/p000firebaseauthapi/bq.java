package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bq  reason: invalid package */
/* loaded from: classes.dex */
public final class bq extends r5 implements x6 {
    private static final bq zzb;
    private lq zzd;
    private vp zze;
    private int zzf;

    static {
        bq bqVar = new bq();
        zzb = bqVar;
        r5.m(bq.class, bqVar);
    }

    private bq() {
    }

    public static aq D() {
        return (aq) zzb.v();
    }

    public static bq F() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(bq bqVar, lq lqVar) {
        lqVar.getClass();
        bqVar.zzd = lqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(bq bqVar, vp vpVar) {
        vpVar.getClass();
        bqVar.zze = vpVar;
    }

    public final vp C() {
        vp vpVar = this.zze;
        return vpVar == null ? vp.E() : vpVar;
    }

    public final lq G() {
        lq lqVar = this.zzd;
        return lqVar == null ? lq.E() : lqVar;
    }

    public final int J() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
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
                    return new aq(null);
                }
                return new bq();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
