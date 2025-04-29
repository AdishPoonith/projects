package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hp  reason: invalid package */
/* loaded from: classes.dex */
public final class hp extends r5 implements x6 {
    private static final hp zzb;
    private int zzd;
    private m4 zze = m4.f4993k;

    static {
        hp hpVar = new hp();
        zzb = hpVar;
        r5.m(hp.class, hpVar);
    }

    private hp() {
    }

    public static gp D() {
        return (gp) zzb.v();
    }

    public static hp F(m4 m4Var, e5 e5Var) {
        return (hp) r5.z(zzb, m4Var, e5Var);
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
                    return new gp(null);
                }
                return new hp();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
