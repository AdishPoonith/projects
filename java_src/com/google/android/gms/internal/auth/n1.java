package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n1 extends m1 {

    /* renamed from: n  reason: collision with root package name */
    protected final byte[] f4191n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f4191n = bArr;
    }

    @Override // com.google.android.gms.internal.auth.q1
    public byte b(int i10) {
        return this.f4191n[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.q1
    public byte e(int i10) {
        return this.f4191n[i10];
    }

    @Override // com.google.android.gms.internal.auth.q1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof q1) && k() == ((q1) obj).k()) {
            if (k() == 0) {
                return true;
            }
            if (obj instanceof n1) {
                n1 n1Var = (n1) obj;
                int s10 = s();
                int s11 = n1Var.s();
                if (s10 == 0 || s11 == 0 || s10 == s11) {
                    int k10 = k();
                    if (k10 > n1Var.k()) {
                        int k11 = k();
                        throw new IllegalArgumentException("Length too large: " + k10 + k11);
                    } else if (k10 > n1Var.k()) {
                        int k12 = n1Var.k();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + k10 + ", " + k12);
                    } else {
                        byte[] bArr = this.f4191n;
                        byte[] bArr2 = n1Var.f4191n;
                        n1Var.w();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < k10) {
                            if (bArr[i10] != bArr2[i11]) {
                                return false;
                            }
                            i10++;
                            i11++;
                        }
                        return true;
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.q1
    public int k() {
        return this.f4191n.length;
    }

    @Override // com.google.android.gms.internal.auth.q1
    protected final int l(int i10, int i11, int i12) {
        return k2.d(i10, this.f4191n, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.q1
    public final q1 m(int i10, int i11) {
        int r10 = q1.r(0, i11, k());
        return r10 == 0 ? q1.f4223k : new j1(this.f4191n, 0, r10);
    }

    @Override // com.google.android.gms.internal.auth.q1
    protected final String p(Charset charset) {
        return new String(this.f4191n, 0, k(), charset);
    }

    @Override // com.google.android.gms.internal.auth.q1
    public final boolean q() {
        return y4.d(this.f4191n, 0, k());
    }

    protected int w() {
        return 0;
    }
}
