package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.io */
/* loaded from: classes.dex */
public final class io extends r5 implements x6 {
    private static final io zzb;
    private int zzd;

    static {
        io ioVar = new io();
        zzb = ioVar;
        r5.m(io.class, ioVar);
    }

    private io() {
    }

    public static ho D() {
        return (ho) zzb.v();
    }

    public static io F() {
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
                    return new ho(null);
                }
                return new io();
            }
            return r5.j(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
