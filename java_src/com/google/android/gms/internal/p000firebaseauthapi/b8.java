package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b8  reason: invalid package */
/* loaded from: classes.dex */
public final class b8 extends r5 implements x6 {
    private static final b8 zzb;
    private long zzd;
    private int zze;

    static {
        b8 b8Var = new b8();
        zzb = b8Var;
        r5.m(b8.class, b8Var);
    }

    private b8() {
    }

    public static a8 E() {
        return (a8) zzb.v();
    }

    public final int C() {
        return this.zze;
    }

    public final long D() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r5
    protected final Object t(int i10, Object obj, Object obj2) {
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
                    return new a8(null);
                }
                return new b8();
            }
            return new g7(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
