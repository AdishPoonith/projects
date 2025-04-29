package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vf  reason: invalid package */
/* loaded from: classes.dex */
public final class vf extends wf {
    public vf(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wf
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.wf
    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            rf.b(iArr2, this.f5597a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
