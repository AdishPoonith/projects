package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class s1 extends u1 {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4237b;

    /* renamed from: c  reason: collision with root package name */
    private int f4238c;

    /* renamed from: d  reason: collision with root package name */
    private int f4239d;

    /* renamed from: e  reason: collision with root package name */
    private int f4240e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s1(byte[] bArr, int i10, int i11, boolean z10, r1 r1Var) {
        super(null);
        this.f4240e = Integer.MAX_VALUE;
        this.f4237b = bArr;
        this.f4238c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f4240e;
        this.f4240e = 0;
        int i12 = this.f4238c + this.f4239d;
        this.f4238c = i12;
        if (i12 > 0) {
            this.f4239d = i12;
            this.f4238c = i12 - i12;
        } else {
            this.f4239d = 0;
        }
        return i11;
    }
}
