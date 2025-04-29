package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.np  reason: invalid package */
/* loaded from: classes.dex */
public final class np extends r5 implements x6 {
    private static final np zzb;
    private int zzd;
    private m4 zze = m4.f4993k;

    static {
        np npVar = new np();
        zzb = npVar;
        r5.m(np.class, npVar);
    }

    private np() {
    }

    public static mp D() {
        return (mp) zzb.v();
    }

    public static np F(m4 m4Var, e5 e5Var) {
        return (np) r5.z(zzb, m4Var, e5Var);
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
                    return new mp(null);
                }
                return new np();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
