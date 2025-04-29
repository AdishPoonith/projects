package com.google.android.gms.internal.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y2 implements t3 {

    /* renamed from: b  reason: collision with root package name */
    private static final e3 f4278b = new w2();

    /* renamed from: a  reason: collision with root package name */
    private final e3 f4279a;

    public y2() {
        e3 e3Var;
        e3[] e3VarArr = new e3[2];
        e3VarArr[0] = d2.a();
        try {
            e3Var = (e3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            e3Var = f4278b;
        }
        e3VarArr[1] = e3Var;
        x2 x2Var = new x2(e3VarArr);
        k2.f(x2Var, "messageInfoFactory");
        this.f4279a = x2Var;
    }

    private static boolean a(d3 d3Var) {
        return d3Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.auth.t3
    public final s3 zza(Class cls) {
        m3 a10;
        u2 c10;
        j4 b10;
        x1 x1Var;
        b3 a11;
        j4 a12;
        x1 a13;
        u3.g(cls);
        d3 zzb = this.f4279a.zzb(cls);
        if (zzb.zzb()) {
            if (g2.class.isAssignableFrom(cls)) {
                a12 = u3.c();
                a13 = z1.b();
            } else {
                a12 = u3.a();
                a13 = z1.a();
            }
            return l3.f(a12, a13, zzb.zza());
        }
        if (g2.class.isAssignableFrom(cls)) {
            boolean a14 = a(zzb);
            a10 = n3.b();
            c10 = u2.d();
            b10 = u3.c();
            x1Var = a14 ? z1.b() : null;
            a11 = c3.b();
        } else {
            boolean a15 = a(zzb);
            a10 = n3.a();
            c10 = u2.c();
            if (a15) {
                b10 = u3.a();
                x1Var = z1.a();
            } else {
                b10 = u3.b();
                x1Var = null;
            }
            a11 = c3.a();
        }
        return j3.r(cls, zzb, a10, c10, b10, x1Var, a11);
    }
}
