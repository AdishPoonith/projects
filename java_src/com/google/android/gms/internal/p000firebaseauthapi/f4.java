package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f4  reason: invalid package */
/* loaded from: classes.dex */
final class f4 extends j4 {

    /* renamed from: o  reason: collision with root package name */
    private final int f4567o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f4(byte[] bArr, int i10, int i11) {
        super(bArr);
        m4.u(0, i11, bArr.length);
        this.f4567o = i11;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j4
    protected final int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j4, com.google.android.gms.internal.p000firebaseauthapi.m4
    public final byte b(int i10) {
        int i11 = this.f4567o;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.f4803n[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.j4, com.google.android.gms.internal.p000firebaseauthapi.m4
    public final byte e(int i10) {
        return this.f4803n[i10];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j4, com.google.android.gms.internal.p000firebaseauthapi.m4
    public final int k() {
        return this.f4567o;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j4, com.google.android.gms.internal.p000firebaseauthapi.m4
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f4803n, 0, bArr, 0, i12);
    }
}
