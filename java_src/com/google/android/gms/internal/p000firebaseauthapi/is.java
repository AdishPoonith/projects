package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.is  reason: invalid package */
/* loaded from: classes.dex */
public final class is extends r5 implements x6 {
    private static final is zzb;
    private vr zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        is isVar = new is();
        zzb = isVar;
        r5.m(is.class, isVar);
    }

    private is() {
    }

    public static hs E() {
        return (hs) zzb.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(is isVar, vr vrVar) {
        vrVar.getClass();
        isVar.zzd = vrVar;
    }

    public final int C() {
        return this.zzf;
    }

    public final vr D() {
        vr vrVar = this.zzd;
        return vrVar == null ? vr.F() : vrVar;
    }

    public final ct G() {
        ct b10 = ct.b(this.zzg);
        return b10 == null ? ct.UNRECOGNIZED : b10;
    }

    public final boolean K() {
        return this.zzd != null;
    }

    public final int L() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
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
                    return new hs(null);
                }
                return new is();
            }
            return r5.j(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
