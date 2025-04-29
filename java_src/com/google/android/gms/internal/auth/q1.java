package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class q1 implements Iterable, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final q1 f4223k = new n1(k2.f4146d);

    /* renamed from: l  reason: collision with root package name */
    private static final Comparator f4224l;

    /* renamed from: m  reason: collision with root package name */
    private static final p1 f4225m;

    /* renamed from: j  reason: collision with root package name */
    private int f4226j = 0;

    static {
        int i10 = c1.f4028a;
        f4225m = new p1(null);
        f4224l = new h1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i10, int i11, int i12) {
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

    public static q1 t(byte[] bArr, int i10, int i11) {
        r(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new n1(bArr2);
    }

    public static q1 u(String str) {
        return new n1(str.getBytes(k2.f4144b));
    }

    public abstract byte b(int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f4226j;
        if (i10 == 0) {
            int k10 = k();
            i10 = l(k10, 0, k10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f4226j = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new g1(this);
    }

    public abstract int k();

    protected abstract int l(int i10, int i11, int i12);

    public abstract q1 m(int i10, int i11);

    protected abstract String p(Charset charset);

    public abstract boolean q();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int s() {
        return this.f4226j;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(k());
        objArr[2] = k() <= 50 ? h4.a(this) : h4.a(m(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String v(Charset charset) {
        return k() == 0 ? "" : p(charset);
    }
}
