package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x5  reason: invalid package */
/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f5625a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f5626b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    static final Charset f5627c = Charset.forName("ISO-8859-1");

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5628d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f5629e;

    /* renamed from: f  reason: collision with root package name */
    public static final s4 f5630f;

    static {
        byte[] bArr = new byte[0];
        f5628d = bArr;
        f5629e = ByteBuffer.wrap(bArr);
        int i10 = s4.f5325e;
        f5630f = s4.g(bArr, 0, 0, false);
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object c(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f5626b);
    }
}
