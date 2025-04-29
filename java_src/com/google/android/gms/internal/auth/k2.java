package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f4143a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f4144b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    static final Charset f4145c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4146d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f4147e;

    /* renamed from: f  reason: collision with root package name */
    public static final u1 f4148f;

    static {
        byte[] bArr = new byte[0];
        f4146d = bArr;
        f4147e = ByteBuffer.wrap(bArr);
        int i10 = u1.f4243a;
        s1 s1Var = new s1(bArr, 0, 0, false, null);
        try {
            s1Var.c(0);
            f4148f = s1Var;
        } catch (m2 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d10 = d(length, bArr, 0, length);
        if (d10 == 0) {
            return 1;
        }
        return d10;
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Object obj, Object obj2) {
        return ((g3) obj).zzd().l((g3) obj2).zzg();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f4144b);
    }

    public static boolean i(byte[] bArr) {
        return y4.c(bArr);
    }
}
