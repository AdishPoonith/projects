package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i6  reason: invalid package */
/* loaded from: classes.dex */
final class i6 extends k6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i6(h6 h6Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final List a(Object obj, long j10) {
        w5 w5Var = (w5) o8.k(obj, j10);
        if (w5Var.zzc()) {
            return w5Var;
        }
        int size = w5Var.size();
        w5 zzd = w5Var.zzd(size == 0 ? 10 : size + size);
        o8.x(obj, j10, zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final void b(Object obj, long j10) {
        ((w5) o8.k(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.k6
    public final void c(Object obj, Object obj2, long j10) {
        w5 w5Var = (w5) o8.k(obj, j10);
        w5 w5Var2 = (w5) o8.k(obj2, j10);
        int size = w5Var.size();
        int size2 = w5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!w5Var.zzc()) {
                w5Var = w5Var.zzd(size2 + size);
            }
            w5Var.addAll(w5Var2);
        }
        if (size > 0) {
            w5Var2 = w5Var;
        }
        o8.x(obj, j10, w5Var2);
    }
}
