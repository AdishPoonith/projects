package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j4  reason: invalid package */
/* loaded from: classes.dex */
public class j4 extends i4 {

    /* renamed from: n  reason: collision with root package name */
    protected final byte[] f4803n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j4(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f4803n = bArr;
    }

    protected int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public byte b(int i10) {
        return this.f4803n[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public byte e(int i10) {
        return this.f4803n[i10];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m4) && k() == ((m4) obj).k()) {
            if (k() == 0) {
                return true;
            }
            if (obj instanceof j4) {
                j4 j4Var = (j4) obj;
                int v10 = v();
                int v11 = j4Var.v();
                if (v10 == 0 || v11 == 0 || v10 == v11) {
                    int k10 = k();
                    if (k10 > j4Var.k()) {
                        int k11 = k();
                        throw new IllegalArgumentException("Length too large: " + k10 + k11);
                    } else if (k10 > j4Var.k()) {
                        int k12 = j4Var.k();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + k10 + ", " + k12);
                    } else {
                        byte[] bArr = this.f4803n;
                        byte[] bArr2 = j4Var.f4803n;
                        j4Var.A();
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

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public int k() {
        return this.f4803n.length;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f4803n, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    protected final int m(int i10, int i11, int i12) {
        return x5.b(i10, this.f4803n, 0, i12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public final m4 p(int i10, int i11) {
        int u10 = m4.u(0, i11, k());
        return u10 == 0 ? m4.f4993k : new f4(this.f4803n, 0, u10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public final s4 q() {
        return s4.g(this.f4803n, 0, k(), true);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    protected final String r(Charset charset) {
        return new String(this.f4803n, 0, k(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public final void s(b4 b4Var) {
        b4Var.a(this.f4803n, 0, k());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m4
    public final boolean t() {
        return t8.f(this.f4803n, 0, k());
    }
}
