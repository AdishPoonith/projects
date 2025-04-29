package okio;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f14749l = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: j  reason: collision with root package name */
    j f14750j;

    /* renamed from: k  reason: collision with root package name */
    long f14751k;

    /* loaded from: classes.dex */
    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            c.this.D((byte) i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            c.this.i0(bArr, i10, i11);
        }
    }

    @Override // okio.e
    public c A() {
        return this;
    }

    @Override // okio.e
    public boolean B() {
        return this.f14751k == 0;
    }

    public void C(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
    }

    @Override // okio.e
    public byte[] G(long j10) {
        p.b(this.f14751k, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            C(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public String H(long j10, Charset charset) {
        p.b(this.f14751k, 0L, j10);
        if (charset != null) {
            if (j10 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
            } else if (j10 == 0) {
                return "";
            } else {
                j jVar = this.f14750j;
                int i10 = jVar.f14771b;
                if (i10 + j10 > jVar.f14772c) {
                    return new String(G(j10), charset);
                }
                String str = new String(jVar.f14770a, i10, (int) j10, charset);
                int i11 = (int) (jVar.f14771b + j10);
                jVar.f14771b = i11;
                this.f14751k -= j10;
                if (i11 == jVar.f14772c) {
                    this.f14750j = jVar.b();
                    k.a(jVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String L() {
        try {
            return H(this.f14751k, p.f14785a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public String N(long j10) {
        return H(j10, p.f14785a);
    }

    String O(long j10) {
        String N;
        long j11 = 1;
        if (j10 > 0) {
            long j12 = j10 - 1;
            if (v(j12) == 13) {
                N = N(j12);
                j11 = 2;
                skip(j11);
                return N;
            }
        }
        N = N(j10);
        skip(j11);
        return N;
    }

    @Override // okio.n
    public long Q(c cVar, long j10) {
        if (cVar != null) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            long j11 = this.f14751k;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.j(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public String T() {
        return U(Long.MAX_VALUE);
    }

    public String U(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long w10 = w((byte) 10, 0L, j11);
        if (w10 != -1) {
            return O(w10);
        }
        if (j11 < b0() && v(j11 - 1) == 13 && v(j11) == 10) {
            return O(j11);
        }
        c cVar = new c();
        t(cVar, 0L, Math.min(32L, b0()));
        throw new EOFException("\\n not found: limit=" + Math.min(b0(), j10) + " content=" + cVar.z().l() + (char) 8230);
    }

    @Override // okio.e
    public void Y(long j10) {
        if (this.f14751k < j10) {
            throw new EOFException();
        }
    }

    public c a() {
        return this;
    }

    public final long b0() {
        return this.f14751k;
    }

    public final f c0() {
        long j10 = this.f14751k;
        if (j10 <= 2147483647L) {
            return e0((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f14751k);
    }

    @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final f e0(int i10) {
        return i10 == 0 ? f.f14754n : new l(this, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            long j10 = this.f14751k;
            if (j10 != cVar.f14751k) {
                return false;
            }
            long j11 = 0;
            if (j10 == 0) {
                return true;
            }
            j jVar = this.f14750j;
            j jVar2 = cVar.f14750j;
            int i10 = jVar.f14771b;
            int i11 = jVar2.f14771b;
            while (j11 < this.f14751k) {
                long min = Math.min(jVar.f14772c - i10, jVar2.f14772c - i11);
                int i12 = 0;
                while (i12 < min) {
                    int i13 = i10 + 1;
                    int i14 = i11 + 1;
                    if (jVar.f14770a[i10] != jVar2.f14770a[i11]) {
                        return false;
                    }
                    i12++;
                    i10 = i13;
                    i11 = i14;
                }
                if (i10 == jVar.f14772c) {
                    jVar = jVar.f14775f;
                    i10 = jVar.f14771b;
                }
                if (i11 == jVar2.f14772c) {
                    jVar2 = jVar2.f14775f;
                    i11 = jVar2.f14771b;
                }
                j11 += min;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j f0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        j jVar = this.f14750j;
        if (jVar != null) {
            j jVar2 = jVar.f14776g;
            return (jVar2.f14772c + i10 > 8192 || !jVar2.f14774e) ? jVar2.c(k.b()) : jVar2;
        }
        j b10 = k.b();
        this.f14750j = b10;
        b10.f14776g = b10;
        b10.f14775f = b10;
        return b10;
    }

    @Override // okio.d, okio.m, java.io.Flushable
    public void flush() {
    }

    public c g0(f fVar) {
        if (fVar != null) {
            fVar.x(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final void h() {
        try {
            skip(this.f14751k);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // okio.d
    /* renamed from: h0 */
    public c J(byte[] bArr) {
        if (bArr != null) {
            return i0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public int hashCode() {
        j jVar = this.f14750j;
        if (jVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = jVar.f14772c;
            for (int i12 = jVar.f14771b; i12 < i11; i12++) {
                i10 = (i10 * 31) + jVar.f14770a[i12];
            }
            jVar = jVar.f14775f;
        } while (jVar != this.f14750j);
        return i10;
    }

    /* renamed from: i */
    public c clone() {
        c cVar = new c();
        if (this.f14751k == 0) {
            return cVar;
        }
        j d10 = this.f14750j.d();
        cVar.f14750j = d10;
        d10.f14776g = d10;
        d10.f14775f = d10;
        j jVar = this.f14750j;
        while (true) {
            jVar = jVar.f14775f;
            if (jVar == this.f14750j) {
                cVar.f14751k = this.f14751k;
                return cVar;
            }
            cVar.f14750j.f14776g.c(jVar.d());
        }
    }

    public c i0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            p.b(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                j f02 = f0(1);
                int min = Math.min(i12 - i10, 8192 - f02.f14772c);
                System.arraycopy(bArr, i10, f02.f14770a, f02.f14772c, min);
                i10 += min;
                f02.f14772c += min;
            }
            this.f14751k += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.m
    public void j(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        p.b(cVar.f14751k, 0L, j10);
        while (j10 > 0) {
            j jVar = cVar.f14750j;
            if (j10 < jVar.f14772c - jVar.f14771b) {
                j jVar2 = this.f14750j;
                j jVar3 = jVar2 != null ? jVar2.f14776g : null;
                if (jVar3 != null && jVar3.f14774e) {
                    if ((jVar3.f14772c + j10) - (jVar3.f14773d ? 0 : jVar3.f14771b) <= 8192) {
                        jVar.f(jVar3, (int) j10);
                        cVar.f14751k -= j10;
                        this.f14751k += j10;
                        return;
                    }
                }
                cVar.f14750j = jVar.e((int) j10);
            }
            j jVar4 = cVar.f14750j;
            long j11 = jVar4.f14772c - jVar4.f14771b;
            cVar.f14750j = jVar4.b();
            j jVar5 = this.f14750j;
            if (jVar5 == null) {
                this.f14750j = jVar4;
                jVar4.f14776g = jVar4;
                jVar4.f14775f = jVar4;
            } else {
                jVar5.f14776g.c(jVar4).a();
            }
            cVar.f14751k -= j11;
            this.f14751k += j11;
            j10 -= j11;
        }
    }

    @Override // okio.d
    /* renamed from: j0 */
    public c D(int i10) {
        j f02 = f0(1);
        byte[] bArr = f02.f14770a;
        int i11 = f02.f14772c;
        f02.f14772c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f14751k++;
        return this;
    }

    public c k0(long j10) {
        if (j10 == 0) {
            return D(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        j f02 = f0(numberOfTrailingZeros);
        byte[] bArr = f02.f14770a;
        int i10 = f02.f14772c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f14749l[(int) (15 & j10)];
            j10 >>>= 4;
        }
        f02.f14772c += numberOfTrailingZeros;
        this.f14751k += numberOfTrailingZeros;
        return this;
    }

    @Override // okio.d
    /* renamed from: l0 */
    public c s(int i10) {
        j f02 = f0(4);
        byte[] bArr = f02.f14770a;
        int i11 = f02.f14772c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        f02.f14772c = i14 + 1;
        this.f14751k += 4;
        return this;
    }

    @Override // okio.d
    /* renamed from: m0 */
    public c p(int i10) {
        j f02 = f0(2);
        byte[] bArr = f02.f14770a;
        int i11 = f02.f14772c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        f02.f14772c = i12 + 1;
        this.f14751k += 2;
        return this;
    }

    @Override // okio.e
    public f n(long j10) {
        return new f(G(j10));
    }

    public final c n0(OutputStream outputStream, long j10) {
        if (outputStream != null) {
            p.b(this.f14751k, 0L, j10);
            j jVar = this.f14750j;
            while (j10 > 0) {
                int min = (int) Math.min(j10, jVar.f14772c - jVar.f14771b);
                outputStream.write(jVar.f14770a, jVar.f14771b, min);
                int i10 = jVar.f14771b + min;
                jVar.f14771b = i10;
                long j11 = min;
                this.f14751k -= j11;
                j10 -= j11;
                if (i10 == jVar.f14772c) {
                    j b10 = jVar.b();
                    this.f14750j = b10;
                    k.a(jVar);
                    jVar = b10;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // okio.d
    /* renamed from: o0 */
    public c a0(String str) {
        return p0(str, 0, str.length());
    }

    public c p0(String str, int i10, int i11) {
        int i12;
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i10);
            } else if (i11 < i10) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            } else if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            } else {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j f02 = f0(1);
                        byte[] bArr = f02.f14770a;
                        int i13 = f02.f14772c - i10;
                        int min = Math.min(i11, 8192 - i13);
                        int i14 = i10 + 1;
                        bArr[i10 + i13] = (byte) charAt;
                        while (i14 < min) {
                            char charAt2 = str.charAt(i14);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i14 + i13] = (byte) charAt2;
                            i14++;
                        }
                        int i15 = f02.f14772c;
                        int i16 = (i13 + i14) - i15;
                        f02.f14772c = i15 + i16;
                        this.f14751k += i16;
                        i10 = i14;
                    } else {
                        if (charAt < 2048) {
                            i12 = (charAt >> 6) | 192;
                        } else if (charAt < 55296 || charAt > 57343) {
                            D((charAt >> '\f') | 224);
                            i12 = ((charAt >> 6) & 63) | 128;
                        } else {
                            int i17 = i10 + 1;
                            char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                            if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                D(63);
                                i10 = i17;
                            } else {
                                int i18 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                D((i18 >> 18) | 240);
                                D(((i18 >> 12) & 63) | 128);
                                D(((i18 >> 6) & 63) | 128);
                                D((i18 & 63) | 128);
                                i10 += 2;
                            }
                        }
                        D(i12);
                        D((charAt & '?') | 128);
                        i10++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c q0(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i12 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 >= 55296 && i10 <= 57343) {
                        D(63);
                        return this;
                    }
                    i11 = (i10 >> 12) | 224;
                } else if (i10 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
                } else {
                    D((i10 >> 18) | 240);
                    i11 = ((i10 >> 12) & 63) | 128;
                }
                D(i11);
                i12 = ((i10 >> 6) & 63) | 128;
            }
            D(i12);
            i10 = (i10 & 63) | 128;
        }
        D(i10);
        return this;
    }

    public final long r() {
        long j10 = this.f14751k;
        if (j10 == 0) {
            return 0L;
        }
        j jVar = this.f14750j.f14776g;
        int i10 = jVar.f14772c;
        return (i10 >= 8192 || !jVar.f14774e) ? j10 : j10 - (i10 - jVar.f14771b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        j jVar = this.f14750j;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jVar.f14772c - jVar.f14771b);
        byteBuffer.put(jVar.f14770a, jVar.f14771b, min);
        int i10 = jVar.f14771b + min;
        jVar.f14771b = i10;
        this.f14751k -= min;
        if (i10 == jVar.f14772c) {
            this.f14750j = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    public int read(byte[] bArr, int i10, int i11) {
        p.b(bArr.length, i10, i11);
        j jVar = this.f14750j;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i11, jVar.f14772c - jVar.f14771b);
        System.arraycopy(jVar.f14770a, jVar.f14771b, bArr, i10, min);
        int i12 = jVar.f14771b + min;
        jVar.f14771b = i12;
        this.f14751k -= min;
        if (i12 == jVar.f14772c) {
            this.f14750j = jVar.b();
            k.a(jVar);
        }
        return min;
    }

    @Override // okio.e
    public byte readByte() {
        long j10 = this.f14751k;
        if (j10 != 0) {
            j jVar = this.f14750j;
            int i10 = jVar.f14771b;
            int i11 = jVar.f14772c;
            int i12 = i10 + 1;
            byte b10 = jVar.f14770a[i10];
            this.f14751k = j10 - 1;
            if (i12 == i11) {
                this.f14750j = jVar.b();
                k.a(jVar);
            } else {
                jVar.f14771b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // okio.e
    public int readInt() {
        long j10 = this.f14751k;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f14751k);
        }
        j jVar = this.f14750j;
        int i10 = jVar.f14771b;
        int i11 = jVar.f14772c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = jVar.f14770a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f14751k = j10 - 4;
        if (i17 == i11) {
            this.f14750j = jVar.b();
            k.a(jVar);
        } else {
            jVar.f14771b = i17;
        }
        return i18;
    }

    @Override // okio.e
    public short readShort() {
        long j10 = this.f14751k;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f14751k);
        }
        j jVar = this.f14750j;
        int i10 = jVar.f14771b;
        int i11 = jVar.f14772c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = jVar.f14770a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f14751k = j10 - 2;
        if (i13 == i11) {
            this.f14750j = jVar.b();
            k.a(jVar);
        } else {
            jVar.f14771b = i13;
        }
        return (short) i14;
    }

    @Override // okio.e
    public void skip(long j10) {
        j jVar;
        while (j10 > 0) {
            if (this.f14750j == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, jVar.f14772c - jVar.f14771b);
            long j11 = min;
            this.f14751k -= j11;
            j10 -= j11;
            j jVar2 = this.f14750j;
            int i10 = jVar2.f14771b + min;
            jVar2.f14771b = i10;
            if (i10 == jVar2.f14772c) {
                this.f14750j = jVar2.b();
                k.a(jVar2);
            }
        }
    }

    public final c t(c cVar, long j10, long j11) {
        if (cVar != null) {
            p.b(this.f14751k, j10, j11);
            if (j11 == 0) {
                return this;
            }
            cVar.f14751k += j11;
            j jVar = this.f14750j;
            while (true) {
                int i10 = jVar.f14772c;
                int i11 = jVar.f14771b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                jVar = jVar.f14775f;
            }
            while (j11 > 0) {
                j d10 = jVar.d();
                int i12 = (int) (d10.f14771b + j10);
                d10.f14771b = i12;
                d10.f14772c = Math.min(i12 + ((int) j11), d10.f14772c);
                j jVar2 = cVar.f14750j;
                if (jVar2 == null) {
                    d10.f14776g = d10;
                    d10.f14775f = d10;
                    cVar.f14750j = d10;
                } else {
                    jVar2.f14776g.c(d10);
                }
                j11 -= d10.f14772c - d10.f14771b;
                jVar = jVar.f14775f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public String toString() {
        return c0().toString();
    }

    public final byte v(long j10) {
        int i10;
        p.b(this.f14751k, j10, 1L);
        long j11 = this.f14751k;
        if (j11 - j10 <= j10) {
            long j12 = j10 - j11;
            j jVar = this.f14750j;
            do {
                jVar = jVar.f14776g;
                int i11 = jVar.f14772c;
                i10 = jVar.f14771b;
                j12 += i11 - i10;
            } while (j12 < 0);
            return jVar.f14770a[i10 + ((int) j12)];
        }
        j jVar2 = this.f14750j;
        while (true) {
            int i12 = jVar2.f14772c;
            int i13 = jVar2.f14771b;
            long j13 = i12 - i13;
            if (j10 < j13) {
                return jVar2.f14770a[i13 + ((int) j10)];
            }
            j10 -= j13;
            jVar2 = jVar2.f14775f;
        }
    }

    public long w(byte b10, long j10, long j11) {
        j jVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f14751k), Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j13 = this.f14751k;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (jVar = this.f14750j) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                jVar = jVar.f14776g;
                j13 -= jVar.f14772c - jVar.f14771b;
            }
        } else {
            while (true) {
                long j15 = (jVar.f14772c - jVar.f14771b) + j12;
                if (j15 >= j10) {
                    break;
                }
                jVar = jVar.f14775f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = jVar.f14770a;
            int min = (int) Math.min(jVar.f14772c, (jVar.f14771b + j14) - j13);
            for (int i10 = (int) ((jVar.f14771b + j16) - j13); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return (i10 - jVar.f14771b) + j13;
                }
            }
            j13 += jVar.f14772c - jVar.f14771b;
            jVar = jVar.f14775f;
            j16 = j13;
        }
        return -1L;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                j f02 = f0(1);
                int min = Math.min(i10, 8192 - f02.f14772c);
                byteBuffer.get(f02.f14770a, f02.f14772c, min);
                i10 -= min;
                f02.f14772c += min;
            }
            this.f14751k += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public OutputStream x() {
        return new a();
    }

    public byte[] y() {
        try {
            return G(this.f14751k);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f z() {
        return new f(y());
    }
}
