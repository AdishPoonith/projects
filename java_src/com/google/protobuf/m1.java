package com.google.protobuf;

import com.google.protobuf.i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 extends i {

    /* renamed from: s  reason: collision with root package name */
    static final int[] f7248s = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: n  reason: collision with root package name */
    private final int f7249n;

    /* renamed from: o  reason: collision with root package name */
    private final i f7250o;

    /* renamed from: p  reason: collision with root package name */
    private final i f7251p;

    /* renamed from: q  reason: collision with root package name */
    private final int f7252q;

    /* renamed from: r  reason: collision with root package name */
    private final int f7253r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends i.c {

        /* renamed from: j  reason: collision with root package name */
        final c f7254j;

        /* renamed from: k  reason: collision with root package name */
        i.g f7255k = c();

        a() {
            this.f7254j = new c(m1.this, null);
        }

        private i.g c() {
            if (this.f7254j.hasNext()) {
                return this.f7254j.next().iterator();
            }
            return null;
        }

        @Override // com.google.protobuf.i.g
        public byte b() {
            i.g gVar = this.f7255k;
            if (gVar != null) {
                byte b10 = gVar.b();
                if (!this.f7255k.hasNext()) {
                    this.f7255k = c();
                }
                return b10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7255k != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<i> f7257a;

        private b() {
            this.f7257a = new ArrayDeque<>();
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i b(i iVar, i iVar2) {
            c(iVar);
            c(iVar2);
            i pop = this.f7257a.pop();
            while (!this.f7257a.isEmpty()) {
                pop = new m1(this.f7257a.pop(), pop, null);
            }
            return pop;
        }

        private void c(i iVar) {
            if (iVar.B()) {
                e(iVar);
            } else if (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                c(m1Var.f7250o);
                c(m1Var.f7251p);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + iVar.getClass());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(m1.f7248s, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(i iVar) {
            int d10 = d(iVar.size());
            int b02 = m1.b0(d10 + 1);
            if (this.f7257a.isEmpty() || this.f7257a.peek().size() >= b02) {
                this.f7257a.push(iVar);
                return;
            }
            int b03 = m1.b0(d10);
            i pop = this.f7257a.pop();
            while (!this.f7257a.isEmpty() && this.f7257a.peek().size() < b03) {
                pop = new m1(this.f7257a.pop(), pop, null);
            }
            m1 m1Var = new m1(pop, iVar, null);
            while (!this.f7257a.isEmpty()) {
                if (this.f7257a.peek().size() >= m1.b0(d(m1Var.size()) + 1)) {
                    break;
                }
                m1Var = new m1(this.f7257a.pop(), m1Var, null);
            }
            this.f7257a.push(m1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<i.AbstractC0105i> {

        /* renamed from: j  reason: collision with root package name */
        private final ArrayDeque<m1> f7258j;

        /* renamed from: k  reason: collision with root package name */
        private i.AbstractC0105i f7259k;

        private c(i iVar) {
            i.AbstractC0105i abstractC0105i;
            if (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                ArrayDeque<m1> arrayDeque = new ArrayDeque<>(m1Var.z());
                this.f7258j = arrayDeque;
                arrayDeque.push(m1Var);
                abstractC0105i = a(m1Var.f7250o);
            } else {
                this.f7258j = null;
                abstractC0105i = (i.AbstractC0105i) iVar;
            }
            this.f7259k = abstractC0105i;
        }

        /* synthetic */ c(i iVar, a aVar) {
            this(iVar);
        }

        private i.AbstractC0105i a(i iVar) {
            while (iVar instanceof m1) {
                m1 m1Var = (m1) iVar;
                this.f7258j.push(m1Var);
                iVar = m1Var.f7250o;
            }
            return (i.AbstractC0105i) iVar;
        }

        private i.AbstractC0105i c() {
            i.AbstractC0105i a10;
            do {
                ArrayDeque<m1> arrayDeque = this.f7258j;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                a10 = a(this.f7258j.pop().f7251p);
            } while (a10.isEmpty());
            return a10;
        }

        @Override // java.util.Iterator
        /* renamed from: d */
        public i.AbstractC0105i next() {
            i.AbstractC0105i abstractC0105i = this.f7259k;
            if (abstractC0105i != null) {
                this.f7259k = c();
                return abstractC0105i;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7259k != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private m1(i iVar, i iVar2) {
        this.f7250o = iVar;
        this.f7251p = iVar2;
        int size = iVar.size();
        this.f7252q = size;
        this.f7249n = size + iVar2.size();
        this.f7253r = Math.max(iVar.z(), iVar2.z()) + 1;
    }

    /* synthetic */ m1(i iVar, i iVar2, a aVar) {
        this(iVar, iVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i Y(i iVar, i iVar2) {
        if (iVar2.size() == 0) {
            return iVar;
        }
        if (iVar.size() == 0) {
            return iVar2;
        }
        int size = iVar.size() + iVar2.size();
        if (size < 128) {
            return Z(iVar, iVar2);
        }
        if (iVar instanceof m1) {
            m1 m1Var = (m1) iVar;
            if (m1Var.f7251p.size() + iVar2.size() < 128) {
                return new m1(m1Var.f7250o, Z(m1Var.f7251p, iVar2));
            } else if (m1Var.f7250o.z() > m1Var.f7251p.z() && m1Var.z() > iVar2.z()) {
                return new m1(m1Var.f7250o, new m1(m1Var.f7251p, iVar2));
            }
        }
        return size >= b0(Math.max(iVar.z(), iVar2.z()) + 1) ? new m1(iVar, iVar2) : new b(null).b(iVar, iVar2);
    }

    private static i Z(i iVar, i iVar2) {
        int size = iVar.size();
        int size2 = iVar2.size();
        byte[] bArr = new byte[size + size2];
        iVar.x(bArr, 0, 0, size);
        iVar2.x(bArr, 0, size, size2);
        return i.S(bArr);
    }

    private boolean a0(i iVar) {
        c cVar = new c(this, null);
        i.AbstractC0105i next = cVar.next();
        c cVar2 = new c(iVar, null);
        i.AbstractC0105i next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int min = Math.min(size, size2);
            if (!(i10 == 0 ? next.V(next2, i11, min) : next2.V(next, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f7249n;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i10 = 0;
                next = cVar.next();
            } else {
                i10 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    static int b0(int i10) {
        int[] iArr = f7248s;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i
    public byte A(int i10) {
        int i11 = this.f7252q;
        return i10 < i11 ? this.f7250o.A(i10) : this.f7251p.A(i10 - i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public boolean B() {
        return this.f7249n >= b0(this.f7253r);
    }

    @Override // com.google.protobuf.i
    public boolean C() {
        int H = this.f7250o.H(0, 0, this.f7252q);
        i iVar = this.f7251p;
        return iVar.H(H, 0, iVar.size()) == 0;
    }

    @Override // com.google.protobuf.i, java.lang.Iterable
    /* renamed from: D */
    public i.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.i
    public j F() {
        return j.h(X(), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public int G(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f7252q;
        if (i13 <= i14) {
            return this.f7250o.G(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f7251p.G(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f7251p.G(this.f7250o.G(i10, i11, i15), 0, i12 - i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public int H(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f7252q;
        if (i13 <= i14) {
            return this.f7250o.H(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f7251p.H(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f7251p.H(this.f7250o.H(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.i
    public i K(int i10, int i11) {
        int p10 = i.p(i10, i11, this.f7249n);
        if (p10 == 0) {
            return i.f7143k;
        }
        if (p10 == this.f7249n) {
            return this;
        }
        int i12 = this.f7252q;
        return i11 <= i12 ? this.f7250o.K(i10, i11) : i10 >= i12 ? this.f7251p.K(i10 - i12, i11 - i12) : new m1(this.f7250o.J(i10), this.f7251p.K(0, i11 - this.f7252q));
    }

    @Override // com.google.protobuf.i
    protected String O(Charset charset) {
        return new String(L(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.i
    public void U(h hVar) {
        this.f7250o.U(hVar);
        this.f7251p.U(hVar);
    }

    public List<ByteBuffer> X() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().e());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.i
    public ByteBuffer e() {
        return ByteBuffer.wrap(L()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f7249n != iVar.size()) {
                return false;
            }
            if (this.f7249n == 0) {
                return true;
            }
            int I = I();
            int I2 = iVar.I();
            if (I == 0 || I2 == 0 || I == I2) {
                return a0(iVar);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.protobuf.i
    public byte l(int i10) {
        i.m(i10, this.f7249n);
        return A(i10);
    }

    @Override // com.google.protobuf.i
    public int size() {
        return this.f7249n;
    }

    Object writeReplace() {
        return i.S(L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public void y(byte[] bArr, int i10, int i11, int i12) {
        i iVar;
        int i13 = i10 + i12;
        int i14 = this.f7252q;
        if (i13 <= i14) {
            iVar = this.f7250o;
        } else if (i10 < i14) {
            int i15 = i14 - i10;
            this.f7250o.y(bArr, i10, i11, i15);
            this.f7251p.y(bArr, 0, i11 + i15, i12 - i15);
            return;
        } else {
            iVar = this.f7251p;
            i10 -= i14;
        }
        iVar.y(bArr, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.i
    public int z() {
        return this.f7253r;
    }
}
