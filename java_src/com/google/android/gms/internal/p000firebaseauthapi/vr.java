package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vr  reason: invalid package */
/* loaded from: classes.dex */
public final class vr extends r5 implements x6 {
    private static final vr zzb;
    private String zzd = "";
    private m4 zze = m4.f4993k;
    private int zzf;

    static {
        vr vrVar = new vr();
        zzb = vrVar;
        r5.m(vr.class, vrVar);
    }

    private vr() {
    }

    public static sr C() {
        return (sr) zzb.v();
    }

    public static vr F() {
        return zzb;
    }

    public final ur D() {
        int i10 = this.zzf;
        ur urVar = ur.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            urVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : ur.REMOTE : ur.ASYMMETRIC_PUBLIC : ur.ASYMMETRIC_PRIVATE : ur.SYMMETRIC;
        }
        return urVar == null ? ur.UNRECOGNIZED : urVar;
    }

    public final m4 G() {
        return this.zze;
    }

    public final String H() {
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
                    return new sr(null);
                }
                return new vr();
            }
            return r5.j(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
