package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qp */
/* loaded from: classes.dex */
public final class qp extends r5 implements x6 {
    private static final qp zzb;

    static {
        qp qpVar = new qp();
        zzb = qpVar;
        r5.m(qp.class, qpVar);
    }

    private qp() {
    }

    public static qp D() {
        return zzb;
    }

    public static qp E(m4 m4Var, e5 e5Var) {
        return (qp) r5.z(zzb, m4Var, e5Var);
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
                    return new pp(null);
                }
                return new qp();
            }
            return r5.j(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
