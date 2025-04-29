package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a7  reason: invalid package */
/* loaded from: classes.dex */
final class a7 implements j7 {

    /* renamed from: a  reason: collision with root package name */
    private final w6 f4336a;

    /* renamed from: b  reason: collision with root package name */
    private final d8 f4337b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4338c;

    /* renamed from: d  reason: collision with root package name */
    private final f5 f4339d;

    private a7(d8 d8Var, f5 f5Var, w6 w6Var) {
        this.f4337b = d8Var;
        this.f4338c = f5Var.h(w6Var);
        this.f4339d = f5Var;
        this.f4336a = w6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a7 f(d8 d8Var, f5 f5Var, w6 w6Var) {
        return new a7(d8Var, f5Var, w6Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void a(Object obj, byte[] bArr, int i10, int i11, y3 y3Var) {
        r5 r5Var = (r5) obj;
        if (r5Var.zzc == e8.c()) {
            r5Var.zzc = e8.f();
        }
        p5 p5Var = (p5) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void b(Object obj, a5 a5Var) {
        this.f4339d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void c(Object obj, i7 i7Var, e5 e5Var) {
        boolean zzO;
        d8 d8Var = this.f4337b;
        f5 f5Var = this.f4339d;
        Object c10 = d8Var.c(obj);
        k5 b10 = f5Var.b(obj);
        while (i7Var.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = i7Var.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object c11 = f5Var.c(e5Var, this.f4336a, zzd >>> 3);
                        if (c11 != null) {
                            f5Var.f(i7Var, c11, e5Var, b10);
                        } else {
                            zzO = d8Var.p(c10, i7Var);
                        }
                    } else {
                        zzO = i7Var.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i10 = 0;
                    Object obj2 = null;
                    m4 m4Var = null;
                    while (i7Var.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = i7Var.zzd();
                        if (zzd2 == 16) {
                            i10 = i7Var.zzj();
                            obj2 = f5Var.c(e5Var, this.f4336a, i10);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                f5Var.f(i7Var, obj2, e5Var, b10);
                            } else {
                                m4Var = i7Var.zzp();
                            }
                        } else if (!i7Var.zzO()) {
                            break;
                        }
                    }
                    if (i7Var.zzd() != 12) {
                        throw z5.b();
                    } else if (m4Var != null) {
                        if (obj2 != null) {
                            f5Var.g(m4Var, obj2, e5Var, b10);
                        } else {
                            d8Var.k(c10, i10, m4Var);
                        }
                    }
                }
            } finally {
                d8Var.n(obj, c10);
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final boolean d(Object obj, Object obj2) {
        if (this.f4337b.d(obj).equals(this.f4337b.d(obj2))) {
            if (this.f4338c) {
                this.f4339d.a(obj);
                this.f4339d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final boolean e(Object obj) {
        this.f4339d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final int zza(Object obj) {
        d8 d8Var = this.f4337b;
        int b10 = d8Var.b(d8Var.d(obj));
        if (this.f4338c) {
            this.f4339d.a(obj);
            throw null;
        }
        return b10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final int zzb(Object obj) {
        int hashCode = this.f4337b.d(obj).hashCode();
        if (this.f4338c) {
            this.f4339d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final Object zze() {
        w6 w6Var = this.f4336a;
        return w6Var instanceof r5 ? ((r5) w6Var).y() : w6Var.c().zzk();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void zzf(Object obj) {
        this.f4337b.m(obj);
        this.f4339d.e(obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j7
    public final void zzg(Object obj, Object obj2) {
        l7.c(this.f4337b, obj, obj2);
        if (this.f4338c) {
            this.f4339d.a(obj2);
            throw null;
        }
    }
}
