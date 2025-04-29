package com.google.android.gms.internal.p000firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o6  reason: invalid package */
/* loaded from: classes.dex */
public final class o6 implements k7 {

    /* renamed from: b  reason: collision with root package name */
    private static final u6 f5116b = new m6();

    /* renamed from: a  reason: collision with root package name */
    private final u6 f5117a;

    public o6() {
        u6 u6Var;
        u6[] u6VarArr = new u6[2];
        u6VarArr[0] = n5.a();
        try {
            u6Var = (u6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            u6Var = f5116b;
        }
        u6VarArr[1] = u6Var;
        n6 n6Var = new n6(u6VarArr);
        byte[] bArr = x5.f5628d;
        this.f5117a = n6Var;
    }

    private static boolean a(t6 t6Var) {
        return t6Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.k7
    public final j7 zza(Class cls) {
        b7 a10;
        k6 d10;
        d8 V;
        f5 a11;
        r6 a12;
        d8 V2;
        f5 a13;
        l7.d(cls);
        t6 zzb = this.f5117a.zzb(cls);
        if (zzb.zzb()) {
            if (r5.class.isAssignableFrom(cls)) {
                V2 = l7.W();
                a13 = i5.b();
            } else {
                V2 = l7.V();
                a13 = i5.a();
            }
            return a7.f(V2, a13, zzb.zza());
        }
        if (r5.class.isAssignableFrom(cls)) {
            boolean a14 = a(zzb);
            a10 = c7.b();
            d10 = k6.e();
            V = l7.W();
            a11 = a14 ? i5.b() : null;
            a12 = s6.b();
        } else {
            boolean a15 = a(zzb);
            a10 = c7.a();
            d10 = k6.d();
            V = l7.V();
            a11 = a15 ? i5.a() : null;
            a12 = s6.a();
        }
        return z6.H(cls, zzb, a10, d10, V, a11, a12);
    }
}
