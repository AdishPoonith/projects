package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oo */
/* loaded from: classes.dex */
public final class oo extends r5 implements x6 {
    private static final oo zzb;
    private ro zzd;
    private int zze;

    static {
        oo ooVar = new oo();
        zzb = ooVar;
        r5.m(oo.class, ooVar);
    }

    private oo() {
    }

    public static no D() {
        return (no) zzb.v();
    }

    public static oo F(m4 m4Var, e5 e5Var) {
        return (oo) r5.z(zzb, m4Var, e5Var);
    }

    public static /* synthetic */ void H(oo ooVar, ro roVar) {
        roVar.getClass();
        ooVar.zzd = roVar;
    }

    public final int C() {
        return this.zze;
    }

    public final ro G() {
        ro roVar = this.zzd;
        return roVar == null ? ro.F() : roVar;
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
                    return new no(null);
                }
                return new oo();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
