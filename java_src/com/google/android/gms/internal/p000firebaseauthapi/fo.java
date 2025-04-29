package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fo */
/* loaded from: classes.dex */
public final class fo extends r5 implements x6 {
    private static final fo zzb;
    private io zzd;
    private int zze;

    static {
        fo foVar = new fo();
        zzb = foVar;
        r5.m(fo.class, foVar);
    }

    private fo() {
    }

    public static eo D() {
        return (eo) zzb.v();
    }

    public static fo F() {
        return zzb;
    }

    public static fo G(m4 m4Var, e5 e5Var) {
        return (fo) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void I(fo foVar, io ioVar) {
        ioVar.getClass();
        foVar.zzd = ioVar;
    }

    public final int C() {
        return this.zze;
    }

    public final io H() {
        io ioVar = this.zzd;
        return ioVar == null ? io.F() : ioVar;
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
                    return new eo(null);
                }
                return new fo();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
