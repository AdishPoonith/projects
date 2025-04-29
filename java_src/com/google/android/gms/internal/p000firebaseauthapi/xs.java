package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xs  reason: invalid package */
/* loaded from: classes.dex */
public final class xs extends r5 implements x6 {
    private static final xs zzb;
    private int zzd;
    private at zze;

    static {
        xs xsVar = new xs();
        zzb = xsVar;
        r5.m(xs.class, xsVar);
    }

    private xs() {
    }

    public static ws D() {
        return (ws) zzb.v();
    }

    public static xs F(m4 m4Var, e5 e5Var) {
        return (xs) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(xs xsVar, at atVar) {
        atVar.getClass();
        xsVar.zze = atVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final at G() {
        at atVar = this.zze;
        return atVar == null ? at.E() : atVar;
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
                    return new ws(null);
                }
                return new xs();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
