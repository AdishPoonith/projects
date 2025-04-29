package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.br */
/* loaded from: classes.dex */
public final class br extends r5 implements x6 {
    private static final br zzb;
    private int zzd;
    private int zze;

    static {
        br brVar = new br();
        zzb = brVar;
        r5.m(br.class, brVar);
    }

    private br() {
    }

    public static ar D() {
        return (ar) zzb.v();
    }

    public static br F() {
        return zzb;
    }

    public final int C() {
        return this.zze;
    }

    public final int H() {
        int b10 = sq.b(this.zzd);
        if (b10 == 0) {
            return 1;
        }
        return b10;
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
                    return new ar(null);
                }
                return new br();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
