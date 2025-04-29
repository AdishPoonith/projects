package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final i f7143k = new j(d0.f7094d);

    /* renamed from: l  reason: collision with root package name */
    private static final f f7144l;

    /* renamed from: m  reason: collision with root package name */
    private static final Comparator<i> f7145m;

    /* renamed from: j  reason: collision with root package name */
    private int f7146j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: j  reason: collision with root package name */
        private int f7147j = 0;

        /* renamed from: k  reason: collision with root package name */
        private final int f7148k;

        a() {
            this.f7148k = i.this.size();
        }

        @Override // com.google.protobuf.i.g
        public byte b() {
            int i10 = this.f7147j;
            if (i10 < this.f7148k) {
                this.f7147j = i10 + 1;
                return i.this.A(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7147j < this.f7148k;
        }
    }

    /* loaded from: classes.dex */
    static class b implements Comparator<i> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            g it = iVar.iterator();
            g it2 = iVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compareTo = Integer.valueOf(i.M(it.b())).compareTo(Integer.valueOf(i.M(it2.b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(iVar.size()).compareTo(Integer.valueOf(iVar2.size()));
        }
    }

    /* loaded from: classes.dex */
    static abstract class c implements g {
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

        @Override // com.google.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: o  reason: collision with root package name */
        private final int f7150o;

        /* renamed from: p  reason: collision with root package name */
        private final int f7151p;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            i.p(i10, i10 + i11, bArr.length);
            this.f7150o = i10;
            this.f7151p = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        byte A(int i10) {
            return this.f7154n[this.f7150o + i10];
        }

        @Override // com.google.protobuf.i.j
        protected int W() {
            return this.f7150o;
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        public byte l(int i10) {
            i.m(i10, size());
            return this.f7154n[this.f7150o + i10];
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        public int size() {
            return this.f7151p;
        }

        Object writeReplace() {
            return i.S(L());
        }

        @Override // com.google.protobuf.i.j, com.google.protobuf.i
        protected void y(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7154n, W() + i10, bArr, i11, i12);
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
        private final l f7152a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f7153b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f7153b = bArr;
            this.f7152a = l.g0(bArr);
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public i a() {
            this.f7152a.d();
            return new j(this.f7153b);
        }

        public l b() {
            return this.f7152a;
        }
    }

    /* renamed from: com.google.protobuf.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static abstract class AbstractC0105i extends i {
        @Override // com.google.protobuf.i
        protected final boolean B() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean V(i iVar, int i10, int i11);

        @Override // com.google.protobuf.i, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        @Override // com.google.protobuf.i
        protected final int z() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends AbstractC0105i {

        /* renamed from: n  reason: collision with root package name */
        protected final byte[] f7154n;

        j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f7154n = bArr;
        }

        @Override // com.google.protobuf.i
        byte A(int i10) {
            return this.f7154n[i10];
        }

        @Override // com.google.protobuf.i
        public final boolean C() {
            int W = W();
            return a2.t(this.f7154n, W, size() + W);
        }

        @Override // com.google.protobuf.i
        public final com.google.protobuf.j F() {
            return com.google.protobuf.j.l(this.f7154n, W(), size(), true);
        }

        @Override // com.google.protobuf.i
        protected final int G(int i10, int i11, int i12) {
            return d0.i(i10, this.f7154n, W() + i11, i12);
        }

        @Override // com.google.protobuf.i
        protected final int H(int i10, int i11, int i12) {
            int W = W() + i11;
            return a2.v(i10, this.f7154n, W, i12 + W);
        }

        @Override // com.google.protobuf.i
        public final i K(int i10, int i11) {
            int p10 = i.p(i10, i11, size());
            return p10 == 0 ? i.f7143k : new e(this.f7154n, W() + i10, p10);
        }

        @Override // com.google.protobuf.i
        protected final String O(Charset charset) {
            return new String(this.f7154n, W(), size(), charset);
        }

        @Override // com.google.protobuf.i
        final void U(com.google.protobuf.h hVar) {
            hVar.b(this.f7154n, W(), size());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.protobuf.i.AbstractC0105i
        public final boolean V(i iVar, int i10, int i11) {
            if (i11 > iVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > iVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + iVar.size());
            } else if (iVar instanceof j) {
                j jVar = (j) iVar;
                byte[] bArr = this.f7154n;
                byte[] bArr2 = jVar.f7154n;
                int W = W() + i11;
                int W2 = W();
                int W3 = jVar.W() + i10;
                while (W2 < W) {
                    if (bArr[W2] != bArr2[W3]) {
                        return false;
                    }
                    W2++;
                    W3++;
                }
                return true;
            } else {
                return iVar.K(i10, i12).equals(K(0, i11));
            }
        }

        protected int W() {
            return 0;
        }

        @Override // com.google.protobuf.i
        public final ByteBuffer e() {
            return ByteBuffer.wrap(this.f7154n, W(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.i
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
                    int I = I();
                    int I2 = jVar.I();
                    if (I == 0 || I2 == 0 || I == I2) {
                        return V(jVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.protobuf.i
        public byte l(int i10) {
            return this.f7154n[i10];
        }

        @Override // com.google.protobuf.i
        public int size() {
            return this.f7154n.length;
        }

        @Override // com.google.protobuf.i
        protected void y(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f7154n, i10, bArr, i11, i12);
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.i.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f7144l = com.google.protobuf.d.c() ? new k(null) : new d(null);
        f7145m = new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h E(int i10) {
        return new h(i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(byte b10) {
        return b10 & 255;
    }

    private String Q() {
        if (size() <= 50) {
            return s1.a(this);
        }
        return s1.a(K(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i R(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return T(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new d1(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i S(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i T(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    private static i k(Iterator<i> it, int i10) {
        if (i10 >= 1) {
            if (i10 == 1) {
                return it.next();
            }
            int i11 = i10 >>> 1;
            return k(it, i11).q(k(it, i10 - i11));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10, int i11, int i12) {
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

    public static i r(Iterable<i> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            size = 0;
            Iterator<i> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f7143k : k(iterable.iterator(), size);
    }

    public static i s(ByteBuffer byteBuffer) {
        return t(byteBuffer, byteBuffer.remaining());
    }

    public static i t(ByteBuffer byteBuffer, int i10) {
        p(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static i u(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static i v(byte[] bArr, int i10, int i11) {
        p(i10, i10 + i11, bArr.length);
        return new j(f7144l.a(bArr, i10, i11));
    }

    public static i w(String str) {
        return new j(str.getBytes(d0.f7092b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte A(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean B();

    public abstract boolean C();

    @Override // java.lang.Iterable
    /* renamed from: D */
    public g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.j F();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int G(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int H(int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int I() {
        return this.f7146j;
    }

    public final i J(int i10) {
        return K(i10, size());
    }

    public abstract i K(int i10, int i11);

    public final byte[] L() {
        int size = size();
        if (size == 0) {
            return d0.f7094d;
        }
        byte[] bArr = new byte[size];
        y(bArr, 0, 0, size);
        return bArr;
    }

    public final String N(Charset charset) {
        return size() == 0 ? "" : O(charset);
    }

    protected abstract String O(Charset charset);

    public final String P() {
        return N(d0.f7092b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void U(com.google.protobuf.h hVar);

    public abstract ByteBuffer e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f7146j;
        if (i10 == 0) {
            int size = size();
            i10 = G(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7146j = i10;
        }
        return i10;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract byte l(int i10);

    public final i q(i iVar) {
        if (Integer.MAX_VALUE - size() >= iVar.size()) {
            return m1.Y(this, iVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + iVar.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), Q());
    }

    @Deprecated
    public final void x(byte[] bArr, int i10, int i11, int i12) {
        p(i10, i10 + i12, size());
        p(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            y(bArr, i10, i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void y(byte[] bArr, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int z();
}
