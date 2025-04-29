package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u4  reason: invalid package */
/* loaded from: classes.dex */
abstract class u4 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    final byte[] f5417e;

    /* renamed from: f  reason: collision with root package name */
    final int f5418f;

    /* renamed from: g  reason: collision with root package name */
    int f5419g;

    /* renamed from: h  reason: collision with root package name */
    int f5420h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u4(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f5417e = bArr;
        this.f5418f = bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(byte b10) {
        byte[] bArr = this.f5417e;
        int i10 = this.f5419g;
        this.f5419g = i10 + 1;
        bArr[i10] = b10;
        this.f5420h++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(int i10) {
        byte[] bArr = this.f5417e;
        int i11 = this.f5419g;
        int i12 = i11 + 1;
        this.f5419g = i12;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i12 + 1;
        this.f5419g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i13 + 1;
        this.f5419g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f5419g = i14 + 1;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
        this.f5420h += 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(long j10) {
        byte[] bArr = this.f5417e;
        int i10 = this.f5419g;
        int i11 = i10 + 1;
        this.f5419g = i11;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i11 + 1;
        this.f5419g = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i12 + 1;
        this.f5419g = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i13 + 1;
        this.f5419g = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i14 + 1;
        this.f5419g = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i15 + 1;
        this.f5419g = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i16 + 1;
        this.f5419g = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f5419g = i17 + 1;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.f5420h += 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(int i10) {
        boolean z10;
        int i11;
        z10 = z4.f5751c;
        if (z10) {
            long j10 = this.f5419g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f5417e;
                int i12 = this.f5419g;
                this.f5419g = i12 + 1;
                o8.s(bArr, i12, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f5417e;
            int i13 = this.f5419g;
            this.f5419g = i13 + 1;
            o8.s(bArr2, i13, (byte) i10);
            i11 = this.f5420h + ((int) (this.f5419g - j10));
        } else {
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f5417e;
                int i14 = this.f5419g;
                this.f5419g = i14 + 1;
                bArr3[i14] = (byte) ((i10 & 127) | 128);
                this.f5420h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f5417e;
            int i15 = this.f5419g;
            this.f5419g = i15 + 1;
            bArr4[i15] = (byte) i10;
            i11 = this.f5420h + 1;
        }
        this.f5420h = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(long j10) {
        boolean z10;
        z10 = z4.f5751c;
        if (z10) {
            long j11 = this.f5419g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f5417e;
                int i10 = this.f5419g;
                this.f5419g = i10 + 1;
                o8.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f5417e;
            int i11 = this.f5419g;
            this.f5419g = i11 + 1;
            o8.s(bArr2, i11, (byte) j10);
            this.f5420h += (int) (this.f5419g - j11);
            return;
        }
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.f5417e;
            int i12 = this.f5419g;
            this.f5419g = i12 + 1;
            bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
            this.f5420h++;
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f5417e;
        int i13 = this.f5419g;
        this.f5419g = i13 + 1;
        bArr4[i13] = (byte) j10;
        this.f5420h++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final int l() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
