package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s4  reason: invalid package */
/* loaded from: classes.dex */
public abstract class s4 {

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f5324d = 100;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f5325e = 0;

    /* renamed from: a  reason: collision with root package name */
    int f5326a;

    /* renamed from: b  reason: collision with root package name */
    final int f5327b = f5324d;

    /* renamed from: c  reason: collision with root package name */
    t4 f5328c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s4(r4 r4Var) {
    }

    public static int e(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long f(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s4 g(byte[] bArr, int i10, int i11, boolean z10) {
        o4 o4Var = new o4(bArr, 0, i11, z10, null);
        try {
            o4Var.k(i11);
            return o4Var;
        } catch (z5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void A(int i10);

    public abstract void a(int i10);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i10);

    public abstract double h();

    public abstract float i();

    public abstract int j();

    public abstract int k(int i10);

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract m4 x();

    public abstract String y();

    public abstract String z();
}
