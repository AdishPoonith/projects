package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uo  reason: invalid package */
/* loaded from: classes.dex */
public final class uo extends r5 implements x6 {
    private static final uo zzb;
    private int zzd;
    private m4 zze = m4.f4993k;

    static {
        uo uoVar = new uo();
        zzb = uoVar;
        r5.m(uo.class, uoVar);
    }

    private uo() {
    }

    public static to D() {
        return (to) zzb.v();
    }

    public static uo F(m4 m4Var, e5 e5Var) {
        return (uo) r5.z(zzb, m4Var, e5Var);
    }

    public final int C() {
        return this.zzd;
    }

    public final m4 G() {
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
                    return new to(null);
                }
                return new uo();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
