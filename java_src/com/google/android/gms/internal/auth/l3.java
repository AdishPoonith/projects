package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class l3 implements s3 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f4167a;

    /* renamed from: b  reason: collision with root package name */
    private final j4 f4168b;

    /* renamed from: c  reason: collision with root package name */
    private final x1 f4169c;

    private l3(j4 j4Var, x1 x1Var, g3 g3Var) {
        this.f4168b = j4Var;
        this.f4169c = x1Var;
        this.f4167a = g3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l3 f(j4 j4Var, x1 x1Var, g3 g3Var) {
        return new l3(j4Var, x1Var, g3Var);
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void a(Object obj, byte[] bArr, int i10, int i11, d1 d1Var) {
        g2 g2Var = (g2) obj;
        if (g2Var.zzc == k4.a()) {
            g2Var.zzc = k4.c();
        }
        f2 f2Var = (f2) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void b(Object obj) {
        this.f4168b.e(obj);
        this.f4169c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final boolean c(Object obj) {
        this.f4169c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final boolean d(Object obj, Object obj2) {
        return this.f4168b.a(obj).equals(this.f4168b.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final void e(Object obj, Object obj2) {
        u3.f(this.f4168b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final int zza(Object obj) {
        return this.f4168b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.s3
    public final Object zzd() {
        return ((e2) ((g2) this.f4167a).g(5, null, null)).zzg();
    }
}
