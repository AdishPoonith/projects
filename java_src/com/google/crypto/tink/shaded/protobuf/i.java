package com.google.crypto.tink.shaded.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final i f6190k = new j(b0.f6128d);

    /* renamed from: l  reason: collision with root package name */
    private static final f f6191l;

    /* renamed from: m  reason: collision with root package name */
    private static final Comparator<i> f6192m;

    /* renamed from: j  reason: collision with root package name */
    private int f6193j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: j  reason: collision with root package name */
        private int f6194j = 0;

        /* renamed from: k  reason: collision with root package name */
        private final int f6195k;

        a() {
            this.f6195k = i.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.g
        public byte b() {
            int i10 = this.f6194j;
            if (i10 < this.f6195k) {
                this.f6194j = i10 + 1;
                return i.this.s(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6194j < this.f6195k;
        }
    }

    /* loaded from: classes.dex */
    class b implements Comparator<i> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            g it = iVar.iterator();
            g it2 = iVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(i.B(it.b()), i.B(it2.b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(iVar.size(), iVar2.size());
        }
    }

    /* loaded from: classes.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: o  reason: collision with root package name */
        private final int f6197o;

        /* renamed from: p  reason: collision with root package name */
        private final int f6198p;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.l(i10, i10 + i11, bArr.length);
            this.f6197o = i10;
            this.f6198p = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j
        protected int K() {
            return this.f6197o;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public byte e(int i10) {
            i.k(i10, size());
            return this.f6201n[this.f6197o + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        protected void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f6201n, K() + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        byte s(int i10) {
            return this.f6201n[this.f6197o + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.j, com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.f6198p;
        }

        Object writeReplace() {
            return i.G(A());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface g extends Iterator<Byte> {
        byte b();
    }

    /* loaded from: classes.dex */
    static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final l f6199a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f6200b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f6200b = bArr;
            this.f6199a = l.d0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public i a() {
            this.f6199a.c();
            return new j(this.f6200b);
        }

        public l b() {
            return this.f6199a;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static abstract class AbstractC0100i extends i {
        AbstractC0100i() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends AbstractC0100i {

        /* renamed from: n  reason: collision with root package name */
        protected final byte[] f6201n;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f6201n = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final String D(Charset charset) {
            return new String(this.f6201n, K(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        final void I(com.google.crypto.tink.shaded.protobuf.h hVar) {
            hVar.a(this.f6201n, K(), size());
        }

        final boolean J(i iVar, int i10, int i11) {
            if (i11 > iVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > iVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
            } else if (iVar instanceof j) {
                j jVar = (j) iVar;
                byte[] bArr = this.f6201n;
                byte[] bArr2 = jVar.f6201n;
                int K = K() + i11;
                int K2 = K();
                int K3 = jVar.K() + i10;
                while (K2 < K) {
                    if (bArr[K2] != bArr2[K3]) {
                        return false;
                    }
                    K2++;
                    K3++;
                }
                return true;
            } else {
                return iVar.z(i10, i12).equals(z(0, i11));
            }
        }

        protected int K() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public byte e(int i10) {
            return this.f6201n[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof i) && size() == ((i) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    int y10 = y();
                    int y11 = jVar.y();
                    if (y10 == 0 || y11 == 0 || y10 == y11) {
                        return J(jVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected void r(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f6201n, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        byte s(int i10) {
            return this.f6201n[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int size() {
            return this.f6201n.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final boolean t() {
            int K = K();
            return t1.n(this.f6201n, K, size() + K);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final com.google.crypto.tink.shaded.protobuf.j w() {
            return com.google.crypto.tink.shaded.protobuf.j.h(this.f6201n, K(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        protected final int x(int i10, int i11, int i12) {
            return b0.i(i10, this.f6201n, K() + i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public final i z(int i10, int i11) {
            int l10 = i.l(i10, i11, size());
            return l10 == 0 ? i.f6190k : new e(this.f6201n, K() + i10, l10);
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f6191l = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(null) : new d(null);
        f6192m = new b();
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int B(byte b10) {
        return b10 & 255;
    }

    private String F() {
        if (size() <= 50) {
            return m1.a(this);
        }
        return m1.a(z(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i G(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i H(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void k(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int l(int i10, int i11, int i12) {
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

    public static i m(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static i p(byte[] bArr, int i10, int i11) {
        l(i10, i10 + i11, bArr.length);
        return new j(f6191l.a(bArr, i10, i11));
    }

    public static i q(String str) {
        return new j(str.getBytes(b0.f6126b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h v(int i10) {
        return new h(i10, null);
    }

    public final byte[] A() {
        int size = size();
        if (size == 0) {
            return b0.f6128d;
        }
        byte[] bArr = new byte[size];
        r(bArr, 0, 0, size);
        return bArr;
    }

    public final String C(Charset charset) {
        return size() == 0 ? "" : D(charset);
    }

    protected abstract String D(Charset charset);

    public final String E() {
        return C(b0.f6126b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void I(com.google.crypto.tink.shaded.protobuf.h hVar);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f6193j;
        if (i10 == 0) {
            int size = size();
            i10 = x(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f6193j = i10;
        }
        return i10;
    }

    protected abstract void r(byte[] bArr, int i10, int i11, int i12);

    abstract byte s(int i10);

    public abstract int size();

    public abstract boolean t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), F());
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public g iterator() {
        return new a();
    }

    public abstract com.google.crypto.tink.shaded.protobuf.j w();

    protected abstract int x(int i10, int i11, int i12);

    protected final int y() {
        return this.f6193j;
    }

    public abstract i z(int i10, int i11);
}
