package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class s2 extends u2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s2(r2 r2Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.u2
    public final void a(Object obj, long j10) {
        ((j2) u4.f(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.u2
    public final void b(Object obj, Object obj2, long j10) {
        j2 j2Var = (j2) u4.f(obj, j10);
        j2 j2Var2 = (j2) u4.f(obj2, j10);
        int size = j2Var.size();
        int size2 = j2Var2.size();
        if (size > 0 && size2 > 0) {
            if (!j2Var.zzc()) {
                j2Var = j2Var.zzd(size2 + size);
            }
            j2Var.addAll(j2Var2);
        }
        if (size > 0) {
            j2Var2 = j2Var;
        }
        u4.p(obj, j10, j2Var2);
    }
}
