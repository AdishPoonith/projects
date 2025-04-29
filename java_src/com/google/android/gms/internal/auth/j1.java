package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class j1 extends n1 {

    /* renamed from: o  reason: collision with root package name */
    private final int f4126o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(byte[] bArr, int i10, int i11) {
        super(bArr);
        q1.r(0, i11, bArr.length);
        this.f4126o = i11;
    }

    @Override // com.google.android.gms.internal.auth.n1, com.google.android.gms.internal.auth.q1
    public final byte b(int i10) {
        int i11 = this.f4126o;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.f4191n[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.n1, com.google.android.gms.internal.auth.q1
    public final byte e(int i10) {
        return this.f4191n[i10];
    }

    @Override // com.google.android.gms.internal.auth.n1, com.google.android.gms.internal.auth.q1
    public final int k() {
        return this.f4126o;
    }

    @Override // com.google.android.gms.internal.auth.n1
    protected final int w() {
        return 0;
    }
}
