package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ns */
/* loaded from: classes.dex */
public final class ns extends r5 implements x6 {
    private static final ns zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ns nsVar = new ns();
        zzb = nsVar;
        r5.m(ns.class, nsVar);
    }

    private ns() {
    }

    public static ms D() {
        return (ms) zzb.v();
    }

    public static /* synthetic */ void F(ns nsVar, String str) {
        str.getClass();
        nsVar.zzd = str;
    }

    public final int C() {
        return this.zzf;
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
                    return new ms(null);
                }
                return new ns();
            }
            return r5.j(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
