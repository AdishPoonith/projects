package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lo  reason: invalid package */
/* loaded from: classes.dex */
public final class lo extends r5 implements x6 {
    private static final lo zzb;
    private int zzd;
    private ro zze;
    private m4 zzf = m4.f4993k;

    static {
        lo loVar = new lo();
        zzb = loVar;
        r5.m(lo.class, loVar);
    }

    private lo() {
    }

    public static ko D() {
        return (ko) zzb.v();
    }

    public static lo F(m4 m4Var, e5 e5Var) {
        return (lo) r5.z(zzb, m4Var, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void J(lo loVar, ro roVar) {
        roVar.getClass();
        loVar.zze = roVar;
    }

    public final int C() {
        return this.zzd;
    }

    public final ro G() {
        ro roVar = this.zze;
        return roVar == null ? ro.F() : roVar;
    }

    public final m4 H() {
        return this.zzf;
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
                    return new ko(null);
                }
                return new lo();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
