package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z4  reason: invalid package */
/* loaded from: classes.dex */
public abstract class z4 extends b4 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f5750b = Logger.getLogger(z4.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f5751c = o8.C();

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f5752d = 0;

    /* renamed from: a  reason: collision with root package name */
    a5 f5753a;

    private z4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ z4(y4 y4Var) {
    }

    public static int A(int i10) {
        if (i10 >= 0) {
            return b(i10);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(w6 w6Var, j7 j7Var) {
        int b10 = ((v3) w6Var).b(j7Var);
        return b(b10) + b10;
    }

    public static int C(String str) {
        int length;
        try {
            length = t8.c(str);
        } catch (s8 unused) {
            length = str.getBytes(x5.f5626b).length;
        }
        return b(length) + length;
    }

    public static int b(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int c(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static z4 d(byte[] bArr, int i10, int i11) {
        return new v4(bArr, 0, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int z(int i10, w6 w6Var, j7 j7Var) {
        int b10 = ((v3) w6Var).b(j7Var);
        int b11 = b(i10 << 3);
        return b11 + b11 + b10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.b4
    public abstract void a(byte[] bArr, int i10, int i11);

    public final void e() {
        if (l() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str, s8 s8Var) {
        f5750b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) s8Var);
        byte[] bytes = str.getBytes(x5.f5626b);
        try {
            int length = bytes.length;
            w(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new w4(e10);
        }
    }

    public abstract void h();

    public abstract void i(byte b10);

    public abstract void j(int i10, boolean z10);

    public abstract void k(int i10, m4 m4Var);

    public abstract int l();

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(int i10, long j10);

    public abstract void p(long j10);

    public abstract void q(int i10, int i11);

    public abstract void r(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(int i10, w6 w6Var, j7 j7Var);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
