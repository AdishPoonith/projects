package io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static final v1 f11699a = new c(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends o0 {
        a(v1 v1Var) {
            super(v1Var);
        }

        @Override // io.grpc.internal.v1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends InputStream implements i9.q0 {

        /* renamed from: j  reason: collision with root package name */
        private v1 f11700j;

        public b(v1 v1Var) {
            this.f11700j = (v1) b5.n.o(v1Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f11700j.c();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11700j.close();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f11700j.o();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f11700j.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f11700j.c() == 0) {
                return -1;
            }
            return this.f11700j.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f11700j.c() == 0) {
                return -1;
            }
            int min = Math.min(this.f11700j.c(), i11);
            this.f11700j.d0(bArr, i10, min);
            return min;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f11700j.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int min = (int) Math.min(this.f11700j.c(), j10);
            this.f11700j.skipBytes(min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends io.grpc.internal.c {

        /* renamed from: j  reason: collision with root package name */
        int f11701j;

        /* renamed from: k  reason: collision with root package name */
        final int f11702k;

        /* renamed from: l  reason: collision with root package name */
        final byte[] f11703l;

        /* renamed from: m  reason: collision with root package name */
        int f11704m;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        c(byte[] bArr, int i10, int i11) {
            this.f11704m = -1;
            b5.n.e(i10 >= 0, "offset must be >= 0");
            b5.n.e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            b5.n.e(i12 <= bArr.length, "offset + length exceeds array boundary");
            this.f11703l = (byte[]) b5.n.o(bArr, "bytes");
            this.f11701j = i10;
            this.f11702k = i12;
        }

        @Override // io.grpc.internal.v1
        public void P(OutputStream outputStream, int i10) {
            a(i10);
            outputStream.write(this.f11703l, this.f11701j, i10);
            this.f11701j += i10;
        }

        @Override // io.grpc.internal.v1
        public void Z(ByteBuffer byteBuffer) {
            b5.n.o(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            a(remaining);
            byteBuffer.put(this.f11703l, this.f11701j, remaining);
            this.f11701j += remaining;
        }

        @Override // io.grpc.internal.v1
        /* renamed from: b */
        public c u(int i10) {
            a(i10);
            int i11 = this.f11701j;
            this.f11701j = i11 + i10;
            return new c(this.f11703l, i11, i10);
        }

        @Override // io.grpc.internal.v1
        public int c() {
            return this.f11702k - this.f11701j;
        }

        @Override // io.grpc.internal.v1
        public void d0(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f11703l, this.f11701j, bArr, i10, i11);
            this.f11701j += i11;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.v1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.v1
        public void o() {
            this.f11704m = this.f11701j;
        }

        @Override // io.grpc.internal.v1
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f11703l;
            int i10 = this.f11701j;
            this.f11701j = i10 + 1;
            return bArr[i10] & 255;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.v1
        public void reset() {
            int i10 = this.f11704m;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f11701j = i10;
        }

        @Override // io.grpc.internal.v1
        public void skipBytes(int i10) {
            a(i10);
            this.f11701j += i10;
        }
    }

    public static v1 a() {
        return f11699a;
    }

    public static v1 b(v1 v1Var) {
        return new a(v1Var);
    }

    public static InputStream c(v1 v1Var, boolean z10) {
        if (!z10) {
            v1Var = b(v1Var);
        }
        return new b(v1Var);
    }

    public static byte[] d(v1 v1Var) {
        b5.n.o(v1Var, "buffer");
        int c10 = v1Var.c();
        byte[] bArr = new byte[c10];
        v1Var.d0(bArr, 0, c10);
        return bArr;
    }

    public static String e(v1 v1Var, Charset charset) {
        b5.n.o(charset, "charset");
        return new String(d(v1Var), charset);
    }

    public static v1 f(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }
}
