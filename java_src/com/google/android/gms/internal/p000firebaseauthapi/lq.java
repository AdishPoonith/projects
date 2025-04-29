package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lq  reason: invalid package */
/* loaded from: classes.dex */
public final class lq extends r5 implements x6 {
    private static final lq zzb;
    private int zzd;
    private int zze;
    private m4 zzf = m4.f4993k;

    static {
        lq lqVar = new lq();
        zzb = lqVar;
        r5.m(lq.class, lqVar);
    }

    private lq() {
    }

    public static kq C() {
        return (kq) zzb.v();
    }

    public static lq E() {
        return zzb;
    }

    public final m4 F() {
        return this.zzf;
    }

    public final int H() {
        int i10 = this.zzd;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int I() {
        int b10 = sq.b(this.zze);
        if (b10 == 0) {
            return 1;
        }
        return b10;
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
                    return new kq(null);
                }
                return new lq();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
