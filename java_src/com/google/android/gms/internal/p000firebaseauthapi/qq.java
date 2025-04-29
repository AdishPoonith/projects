package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.InputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qq  reason: invalid package */
/* loaded from: classes.dex */
public final class qq extends r5 implements x6 {
    private static final qq zzb;
    private m4 zzd = m4.f4993k;
    private os zze;

    static {
        qq qqVar = new qq();
        zzb = qqVar;
        r5.m(qq.class, qqVar);
    }

    private qq() {
    }

    public static pq C() {
        return (pq) zzb.v();
    }

    public static qq E(InputStream inputStream, e5 e5Var) {
        return (qq) r5.A(zzb, inputStream, e5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void H(qq qqVar, os osVar) {
        osVar.getClass();
        qqVar.zze = osVar;
    }

    public final m4 F() {
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
                    return new pq(null);
                }
                return new qq();
            }
            return r5.j(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
