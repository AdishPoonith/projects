package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n6  reason: invalid package */
/* loaded from: classes.dex */
final class n6 implements u6 {

    /* renamed from: a  reason: collision with root package name */
    private final u6[] f5057a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n6(u6... u6VarArr) {
        this.f5057a = u6VarArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u6
    public final t6 zzb(Class cls) {
        u6[] u6VarArr = this.f5057a;
        for (int i10 = 0; i10 < 2; i10++) {
            u6 u6Var = u6VarArr[i10];
            if (u6Var.zzc(cls)) {
                return u6Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u6
    public final boolean zzc(Class cls) {
        u6[] u6VarArr = this.f5057a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (u6VarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
