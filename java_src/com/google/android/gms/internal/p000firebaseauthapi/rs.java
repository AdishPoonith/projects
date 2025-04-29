package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rs  reason: invalid package */
/* loaded from: classes.dex */
public final class rs extends r5 implements x6 {
    private static final rs zzb;
    private int zzd;
    private us zze;

    static {
        rs rsVar = new rs();
        zzb = rsVar;
        r5.m(rs.class, rsVar);
    }

    private rs() {
    }

    public static qs D() {
        return (qs) zzb.v();
    }

    public static rs F(m4 m4Var, e5 e5Var) {
        return (rs) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(rs rsVar, us usVar) {
        usVar.getClass();
        rsVar.zze = usVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final us G() {
        us usVar = this.zze;
        return usVar == null ? us.D() : usVar;
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
                    return new qs(null);
                }
                return new rs();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
