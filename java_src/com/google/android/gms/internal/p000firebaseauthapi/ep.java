package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ep */
/* loaded from: classes.dex */
public final class ep extends r5 implements x6 {
    private static final ep zzb;
    private int zzd;
    private int zze;

    static {
        ep epVar = new ep();
        zzb = epVar;
        r5.m(ep.class, epVar);
    }

    private ep() {
    }

    public static cp D() {
        return (cp) zzb.v();
    }

    public static ep F(m4 m4Var, e5 e5Var) {
        return (ep) r5.z(zzb, m4Var, e5Var);
    }

    public final int C() {
        return this.zzd;
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
                    return new cp(null);
                }
                return new ep();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }
}
