package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.as  reason: invalid package */
/* loaded from: classes.dex */
public final class as extends r5 implements x6 {
    private static final as zzb;
    private String zzd = "";
    private m4 zze = m4.f4993k;
    private int zzf;

    static {
        as asVar = new as();
        zzb = asVar;
        r5.m(as.class, asVar);
    }

    private as() {
    }

    public static zr C() {
        return (zr) zzb.v();
    }

    public static as E() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void I(as asVar, String str) {
        str.getClass();
        asVar.zzd = str;
    }

    public final ct F() {
        ct b10 = ct.b(this.zzf);
        return b10 == null ? ct.UNRECOGNIZED : b10;
    }

    public final m4 G() {
        return this.zze;
    }

    public final String H() {
        return this.zzd;
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
                    return new zr(null);
                }
                return new as();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
