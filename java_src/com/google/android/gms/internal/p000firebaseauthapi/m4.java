package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m4  reason: invalid package */
/* loaded from: classes.dex */
public abstract class m4 implements Iterable, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final m4 f4993k = new j4(x5.f5628d);

    /* renamed from: l  reason: collision with root package name */
    private static final Comparator f4994l;

    /* renamed from: m  reason: collision with root package name */
    private static final l4 f4995m;

    /* renamed from: j  reason: collision with root package name */
    private int f4996j = 0;

    static {
        int i10 = x3.f5623a;
        f4995m = new l4(null);
        f4994l = new d4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static m4 w(byte[] bArr, int i10, int i11) {
        u(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new j4(bArr2);
    }

    public abstract byte b(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f4996j;
        if (i10 == 0) {
            int k10 = k();
            i10 = m(k10, 0, k10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f4996j = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new c4(this);
    }

    public abstract int k();

    protected abstract void l(byte[] bArr, int i10, int i11, int i12);

    protected abstract int m(int i10, int i11, int i12);

    public abstract m4 p(int i10, int i11);

    public abstract s4 q();

    protected abstract String r(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(b4 b4Var);

    public abstract boolean t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(k());
        objArr[2] = k() <= 50 ? y7.a(this) : y7.a(p(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int v() {
        return this.f4996j;
    }

    public final String x(Charset charset) {
        return k() == 0 ? "" : r(charset);
    }

    public final boolean y() {
        return k() == 0;
    }

    public final byte[] z() {
        int k10 = k();
        if (k10 == 0) {
            return x5.f5628d;
        }
        byte[] bArr = new byte[k10];
        l(bArr, 0, 0, k10);
        return bArr;
    }
}
