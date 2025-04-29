package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v4  reason: invalid package */
/* loaded from: classes.dex */
public final class v4 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f5505e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5506f;

    /* renamed from: g  reason: collision with root package name */
    private int f5507g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v4(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f5505e = bArr;
        this.f5507g = 0;
        this.f5506f = i11;
    }

    public final void D(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f5505e, this.f5507g, i11);
            this.f5507g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), Integer.valueOf(i11)), e10);
        }
    }

    public final void E(String str) {
        int i10 = this.f5507g;
        try {
            int b10 = z4.b(str.length() * 3);
            int b11 = z4.b(str.length());
            if (b11 != b10) {
                w(t8.c(str));
                byte[] bArr = this.f5505e;
                int i11 = this.f5507g;
                this.f5507g = t8.b(str, bArr, i11, this.f5506f - i11);
                return;
            }
            int i12 = i10 + b11;
            this.f5507g = i12;
            int b12 = t8.b(str, this.f5505e, i12, this.f5506f - i12);
            this.f5507g = i10;
            w((b12 - i10) - b11);
            this.f5507g = b12;
        } catch (s8 e10) {
            this.f5507g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new w4(e11);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4, com.google.android.gms.internal.p000firebaseauthapi.b4
    public final void a(byte[] bArr, int i10, int i11) {
        D(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void h() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void i(byte b10) {
        try {
            byte[] bArr = this.f5505e;
            int i10 = this.f5507g;
            this.f5507g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void j(int i10, boolean z10) {
        w(i10 << 3);
        i(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void k(int i10, m4 m4Var) {
        w((i10 << 3) | 2);
        w(m4Var.k());
        m4Var.s(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final int l() {
        return this.f5506f - this.f5507g;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void m(int i10, int i11) {
        w((i10 << 3) | 5);
        n(i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void n(int i10) {
        try {
            byte[] bArr = this.f5505e;
            int i11 = this.f5507g;
            int i12 = i11 + 1;
            this.f5507g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f5507g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f5507g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f5507g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void o(int i10, long j10) {
        w((i10 << 3) | 1);
        p(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void p(long j10) {
        try {
            byte[] bArr = this.f5505e;
            int i10 = this.f5507g;
            int i11 = i10 + 1;
            this.f5507g = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.f5507g = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.f5507g = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.f5507g = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.f5507g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f5507g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f5507g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f5507g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void q(int i10, int i11) {
        w(i10 << 3);
        r(i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void r(int i10) {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void s(int i10, w6 w6Var, j7 j7Var) {
        w((i10 << 3) | 2);
        w(((v3) w6Var).b(j7Var));
        j7Var.b(w6Var, this.f5753a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void t(int i10, String str) {
        w((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void u(int i10, int i11) {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void v(int i10, int i11) {
        w(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void w(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f5505e;
                int i11 = this.f5507g;
                this.f5507g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), 1), e10);
            }
        }
        byte[] bArr2 = this.f5505e;
        int i12 = this.f5507g;
        this.f5507g = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void x(int i10, long j10) {
        w(i10 << 3);
        y(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void y(long j10) {
        boolean z10;
        z10 = z4.f5751c;
        if (z10 && this.f5506f - this.f5507g >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f5505e;
                int i10 = this.f5507g;
                this.f5507g = i10 + 1;
                o8.s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f5505e;
            int i11 = this.f5507g;
            this.f5507g = i11 + 1;
            o8.s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f5505e;
                int i12 = this.f5507g;
                this.f5507g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new w4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5507g), Integer.valueOf(this.f5506f), 1), e10);
            }
        }
        byte[] bArr4 = this.f5505e;
        int i13 = this.f5507g;
        this.f5507g = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
