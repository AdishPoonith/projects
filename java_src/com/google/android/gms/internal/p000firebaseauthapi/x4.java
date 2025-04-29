package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x4  reason: invalid package */
/* loaded from: classes.dex */
public final class x4 extends u4 {

    /* renamed from: i  reason: collision with root package name */
    private final OutputStream f5624i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x4(OutputStream outputStream, int i10) {
        super(i10);
        this.f5624i = outputStream;
    }

    private final void I() {
        this.f5624i.write(this.f5417e, 0, this.f5419g);
        this.f5419g = 0;
    }

    private final void J(int i10) {
        if (this.f5418f - this.f5419g < i10) {
            I();
        }
    }

    public final void K(byte[] bArr, int i10, int i11) {
        int i12 = this.f5418f;
        int i13 = this.f5419g;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.f5417e, i13, i11);
            this.f5419g += i11;
        } else {
            System.arraycopy(bArr, 0, this.f5417e, i13, i14);
            this.f5419g = this.f5418f;
            this.f5420h += i14;
            I();
            i11 -= i14;
            if (i11 <= this.f5418f) {
                System.arraycopy(bArr, i14, this.f5417e, 0, i11);
                this.f5419g = i11;
            } else {
                this.f5624i.write(bArr, i14, i11);
            }
        }
        this.f5420h += i11;
    }

    public final void L(String str) {
        int c10;
        try {
            int length = str.length() * 3;
            int b10 = z4.b(length);
            int i10 = b10 + length;
            int i11 = this.f5418f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int b11 = t8.b(str, bArr, 0, length);
                w(b11);
                K(bArr, 0, b11);
                return;
            }
            if (i10 > i11 - this.f5419g) {
                I();
            }
            int b12 = z4.b(str.length());
            int i12 = this.f5419g;
            try {
                if (b12 == b10) {
                    int i13 = i12 + b12;
                    this.f5419g = i13;
                    int b13 = t8.b(str, this.f5417e, i13, this.f5418f - i13);
                    this.f5419g = i12;
                    c10 = (b13 - i12) - b12;
                    G(c10);
                    this.f5419g = b13;
                } else {
                    c10 = t8.c(str);
                    G(c10);
                    this.f5419g = t8.b(str, this.f5417e, this.f5419g, c10);
                }
                this.f5420h += c10;
            } catch (s8 e10) {
                this.f5420h -= this.f5419g - i12;
                this.f5419g = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new w4(e11);
            }
        } catch (s8 e12) {
            f(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4, com.google.android.gms.internal.p000firebaseauthapi.b4
    public final void a(byte[] bArr, int i10, int i11) {
        K(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void h() {
        if (this.f5419g > 0) {
            I();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void i(byte b10) {
        if (this.f5419g == this.f5418f) {
            I();
        }
        D(b10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void j(int i10, boolean z10) {
        J(11);
        G(i10 << 3);
        D(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void k(int i10, m4 m4Var) {
        w((i10 << 3) | 2);
        w(m4Var.k());
        m4Var.s(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void m(int i10, int i11) {
        J(14);
        G((i10 << 3) | 5);
        E(i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void n(int i10) {
        J(4);
        E(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void o(int i10, long j10) {
        J(18);
        G((i10 << 3) | 1);
        F(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void p(long j10) {
        J(8);
        F(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void q(int i10, int i11) {
        J(20);
        G(i10 << 3);
        if (i11 >= 0) {
            G(i11);
        } else {
            H(i11);
        }
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
        L(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void u(int i10, int i11) {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void v(int i10, int i11) {
        J(20);
        G(i10 << 3);
        G(i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void w(int i10) {
        J(5);
        G(i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void x(int i10, long j10) {
        J(20);
        G(i10 << 3);
        H(j10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z4
    public final void y(long j10) {
        J(10);
        H(j10);
    }
}
