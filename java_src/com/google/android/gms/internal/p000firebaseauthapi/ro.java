package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ro */
/* loaded from: classes.dex */
public final class ro extends r5 implements x6 {
    private static final ro zzb;
    private int zzd;

    static {
        ro roVar = new ro();
        zzb = roVar;
        r5.m(ro.class, roVar);
    }

    private ro() {
    }

    public static qo D() {
        return (qo) zzb.v();
    }

    public static ro F() {
        return zzb;
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
                    return new qo(null);
                }
                return new ro();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
