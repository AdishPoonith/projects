package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class x2 implements e3 {

    /* renamed from: a  reason: collision with root package name */
    private final e3[] f4274a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x2(e3... e3VarArr) {
        this.f4274a = e3VarArr;
    }

    @Override // com.google.android.gms.internal.auth.e3
    public final d3 zzb(Class cls) {
        e3[] e3VarArr = this.f4274a;
        for (int i10 = 0; i10 < 2; i10++) {
            e3 e3Var = e3VarArr[i10];
            if (e3Var.zzc(cls)) {
                return e3Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.e3
    public final boolean zzc(Class cls) {
        e3[] e3VarArr = this.f4274a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (e3VarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
