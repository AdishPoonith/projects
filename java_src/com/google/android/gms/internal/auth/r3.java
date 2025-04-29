package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class r3 implements d3 {

    /* renamed from: a  reason: collision with root package name */
    private final g3 f4232a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4233b = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4234c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4235d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r3(g3 g3Var, String str, Object[] objArr) {
        this.f4232a = g3Var;
        this.f4234c = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.f4235d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i12);
            if (charAt2 < 55296) {
                this.f4235d = (charAt2 << i11) | i10;
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.f4233b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] b() {
        return this.f4234c;
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final g3 zza() {
        return this.f4232a;
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final boolean zzb() {
        return (this.f4235d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.auth.d3
    public final int zzc() {
        return (this.f4235d & 1) == 1 ? 1 : 2;
    }
}
