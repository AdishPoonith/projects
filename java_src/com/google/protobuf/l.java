package com.google.protobuf;

import com.google.protobuf.a2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class l extends h {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f7227c = Logger.getLogger(l.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f7228d = z1.I();

    /* renamed from: a  reason: collision with root package name */
    m f7229a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7230b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class b extends l {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f7231e;

        /* renamed from: f  reason: collision with root package name */
        final int f7232f;

        /* renamed from: g  reason: collision with root package name */
        int f7233g;

        /* renamed from: h  reason: collision with root package name */
        int f7234h;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f7231e = bArr;
            this.f7232f = bArr.length;
        }

        final void b1(byte b10) {
            byte[] bArr = this.f7231e;
            int i10 = this.f7233g;
            this.f7233g = i10 + 1;
            bArr[i10] = b10;
            this.f7234h++;
        }

        final void c1(int i10) {
            byte[] bArr = this.f7231e;
            int i11 = this.f7233g;
            int i12 = i11 + 1;
            this.f7233g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f7233g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f7233g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7233g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f7234h += 4;
        }

        final void d1(long j10) {
            byte[] bArr = this.f7231e;
            int i10 = this.f7233g;
            int i11 = i10 + 1;
            this.f7233g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            this.f7233g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            this.f7233g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            this.f7233g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            this.f7233g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f7233g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f7233g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f7233g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f7234h += 8;
        }

        final void e1(int i10) {
            if (i10 >= 0) {
                g1(i10);
            } else {
                h1(i10);
            }
        }

        final void f1(int i10, int i11) {
            g1(b2.c(i10, i11));
        }

        final void g1(int i10) {
            if (!l.f7228d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f7231e;
                    int i11 = this.f7233g;
                    this.f7233g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f7234h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f7231e;
                int i12 = this.f7233g;
                this.f7233g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f7234h++;
                return;
            }
            long j10 = this.f7233g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f7231e;
                int i13 = this.f7233g;
                this.f7233g = i13 + 1;
                z1.O(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f7231e;
            int i14 = this.f7233g;
            this.f7233g = i14 + 1;
            z1.O(bArr4, i14, (byte) i10);
            this.f7234h += (int) (this.f7233g - j10);
        }

        final void h1(long j10) {
            if (!l.f7228d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f7231e;
                    int i10 = this.f7233g;
                    this.f7233g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f7234h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f7231e;
                int i11 = this.f7233g;
                this.f7233g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f7234h++;
                return;
            }
            long j11 = this.f7233g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f7231e;
                int i12 = this.f7233g;
                this.f7233g = i12 + 1;
                z1.O(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f7231e;
            int i13 = this.f7233g;
            this.f7233g = i13 + 1;
            z1.O(bArr4, i13, (byte) j10);
            this.f7234h += (int) (this.f7233g - j11);
        }

        @Override // com.google.protobuf.l
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends l {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f7235e;

        /* renamed from: f  reason: collision with root package name */
        private final int f7236f;

        /* renamed from: g  reason: collision with root package name */
        private final int f7237g;

        /* renamed from: h  reason: collision with root package name */
        private int f7238h;

        c(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f7235e = bArr;
            this.f7236f = i10;
            this.f7238h = i10;
            this.f7237g = i12;
        }

        @Override // com.google.protobuf.l
        public final void E0(int i10, int i11) {
            W0(i10, 0);
            F0(i11);
        }

        @Override // com.google.protobuf.l
        public final void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // com.google.protobuf.l
        final void I0(int i10, v0 v0Var, n1 n1Var) {
            W0(i10, 2);
            Y0(((com.google.protobuf.a) v0Var).r(n1Var));
            n1Var.h(v0Var, this.f7229a);
        }

        @Override // com.google.protobuf.l
        public final void J0(v0 v0Var) {
            Y0(v0Var.a());
            v0Var.p(this);
        }

        @Override // com.google.protobuf.l
        public final void K0(int i10, v0 v0Var) {
            W0(1, 3);
            X0(2, i10);
            d1(3, v0Var);
            W0(1, 4);
        }

        @Override // com.google.protobuf.l
        public final void L0(int i10, i iVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, iVar);
            W0(1, 4);
        }

        @Override // com.google.protobuf.l
        public final void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        @Override // com.google.protobuf.l
        public final void V0(String str) {
            int i10;
            int i11 = this.f7238h;
            try {
                int X = l.X(str.length() * 3);
                int X2 = l.X(str.length());
                if (X2 == X) {
                    int i12 = i11 + X2;
                    this.f7238h = i12;
                    i10 = a2.i(str, this.f7235e, i12, i0());
                    this.f7238h = i11;
                    Y0((i10 - i11) - X2);
                } else {
                    Y0(a2.j(str));
                    i10 = a2.i(str, this.f7235e, this.f7238h, i0());
                }
                this.f7238h = i10;
            } catch (a2.d e10) {
                this.f7238h = i11;
                d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.l
        public final void W0(int i10, int i11) {
            Y0(b2.c(i10, i11));
        }

        @Override // com.google.protobuf.l
        public final void X0(int i10, int i11) {
            W0(i10, 0);
            Y0(i11);
        }

        @Override // com.google.protobuf.l
        public final void Y0(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f7235e;
                    int i11 = this.f7238h;
                    this.f7238h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), 1), e10);
                }
            }
            byte[] bArr2 = this.f7235e;
            int i12 = this.f7238h;
            this.f7238h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.l
        public final void Z0(int i10, long j10) {
            W0(i10, 0);
            a1(j10);
        }

        @Override // com.google.protobuf.h
        public final void a(ByteBuffer byteBuffer) {
            b1(byteBuffer);
        }

        @Override // com.google.protobuf.l
        public final void a1(long j10) {
            if (l.f7228d && i0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f7235e;
                    int i10 = this.f7238h;
                    this.f7238h = i10 + 1;
                    z1.O(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f7235e;
                int i11 = this.f7238h;
                this.f7238h = i11 + 1;
                z1.O(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f7235e;
                    int i12 = this.f7238h;
                    this.f7238h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), 1), e10);
                }
            }
            byte[] bArr4 = this.f7235e;
            int i13 = this.f7238h;
            this.f7238h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.l, com.google.protobuf.h
        public final void b(byte[] bArr, int i10, int i11) {
            c1(bArr, i10, i11);
        }

        public final void b1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f7235e, this.f7238h, remaining);
                this.f7238h += remaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), Integer.valueOf(remaining)), e10);
            }
        }

        @Override // com.google.protobuf.l
        public void c0() {
        }

        public final void c1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f7235e, this.f7238h, i11);
                this.f7238h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), Integer.valueOf(i11)), e10);
            }
        }

        public final void d1(int i10, v0 v0Var) {
            W0(i10, 2);
            J0(v0Var);
        }

        @Override // com.google.protobuf.l
        public final int i0() {
            return this.f7237g - this.f7238h;
        }

        @Override // com.google.protobuf.l
        public final void j0(byte b10) {
            try {
                byte[] bArr = this.f7235e;
                int i10 = this.f7238h;
                this.f7238h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), 1), e10);
            }
        }

        @Override // com.google.protobuf.l
        public final void k0(int i10, boolean z10) {
            W0(i10, 0);
            j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.l
        public final void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            c1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.l
        public final void o0(int i10, i iVar) {
            W0(i10, 2);
            p0(iVar);
        }

        @Override // com.google.protobuf.l
        public final void p0(i iVar) {
            Y0(iVar.size());
            iVar.U(this);
        }

        @Override // com.google.protobuf.l
        public final void u0(int i10, int i11) {
            W0(i10, 5);
            v0(i11);
        }

        @Override // com.google.protobuf.l
        public final void v0(int i10) {
            try {
                byte[] bArr = this.f7235e;
                int i11 = this.f7238h;
                int i12 = i11 + 1;
                this.f7238h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f7238h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f7238h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f7238h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), 1), e10);
            }
        }

        @Override // com.google.protobuf.l
        public final void w0(int i10, long j10) {
            W0(i10, 1);
            x0(j10);
        }

        @Override // com.google.protobuf.l
        public final void x0(long j10) {
            try {
                byte[] bArr = this.f7235e;
                int i10 = this.f7238h;
                int i11 = i10 + 1;
                this.f7238h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f7238h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f7238h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f7238h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f7238h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f7238h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f7238h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f7238h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7238h), Integer.valueOf(this.f7237g), 1), e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f7239i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            Objects.requireNonNull(outputStream, "out");
            this.f7239i = outputStream;
        }

        private void i1() {
            this.f7239i.write(this.f7231e, 0, this.f7233g);
            this.f7233g = 0;
        }

        private void j1(int i10) {
            if (this.f7232f - this.f7233g < i10) {
                i1();
            }
        }

        @Override // com.google.protobuf.l
        public void E0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            e1(i11);
        }

        @Override // com.google.protobuf.l
        public void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1(i10);
            }
        }

        @Override // com.google.protobuf.l
        void I0(int i10, v0 v0Var, n1 n1Var) {
            W0(i10, 2);
            n1(v0Var, n1Var);
        }

        @Override // com.google.protobuf.l
        public void J0(v0 v0Var) {
            Y0(v0Var.a());
            v0Var.p(this);
        }

        @Override // com.google.protobuf.l
        public void K0(int i10, v0 v0Var) {
            W0(1, 3);
            X0(2, i10);
            m1(3, v0Var);
            W0(1, 4);
        }

        @Override // com.google.protobuf.l
        public void L0(int i10, i iVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, iVar);
            W0(1, 4);
        }

        @Override // com.google.protobuf.l
        public void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        @Override // com.google.protobuf.l
        public void V0(String str) {
            int j10;
            try {
                int length = str.length() * 3;
                int X = l.X(length);
                int i10 = X + length;
                int i11 = this.f7232f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = a2.i(str, bArr, 0, length);
                    Y0(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f7233g) {
                    i1();
                }
                int X2 = l.X(str.length());
                int i13 = this.f7233g;
                try {
                    if (X2 == X) {
                        int i14 = i13 + X2;
                        this.f7233g = i14;
                        int i15 = a2.i(str, this.f7231e, i14, this.f7232f - i14);
                        this.f7233g = i13;
                        j10 = (i15 - i13) - X2;
                        g1(j10);
                        this.f7233g = i15;
                    } else {
                        j10 = a2.j(str);
                        g1(j10);
                        this.f7233g = a2.i(str, this.f7231e, this.f7233g, j10);
                    }
                    this.f7234h += j10;
                } catch (a2.d e10) {
                    this.f7234h -= this.f7233g - i13;
                    this.f7233g = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (a2.d e12) {
                d0(str, e12);
            }
        }

        @Override // com.google.protobuf.l
        public void W0(int i10, int i11) {
            Y0(b2.c(i10, i11));
        }

        @Override // com.google.protobuf.l
        public void X0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            g1(i11);
        }

        @Override // com.google.protobuf.l
        public void Y0(int i10) {
            j1(5);
            g1(i10);
        }

        @Override // com.google.protobuf.l
        public void Z0(int i10, long j10) {
            j1(20);
            f1(i10, 0);
            h1(j10);
        }

        @Override // com.google.protobuf.h
        public void a(ByteBuffer byteBuffer) {
            k1(byteBuffer);
        }

        @Override // com.google.protobuf.l
        public void a1(long j10) {
            j1(10);
            h1(j10);
        }

        @Override // com.google.protobuf.l, com.google.protobuf.h
        public void b(byte[] bArr, int i10, int i11) {
            l1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.l
        public void c0() {
            if (this.f7233g > 0) {
                i1();
            }
        }

        @Override // com.google.protobuf.l
        public void j0(byte b10) {
            if (this.f7233g == this.f7232f) {
                i1();
            }
            b1(b10);
        }

        @Override // com.google.protobuf.l
        public void k0(int i10, boolean z10) {
            j1(11);
            f1(i10, 0);
            b1(z10 ? (byte) 1 : (byte) 0);
        }

        public void k1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i10 = this.f7232f;
            int i11 = this.f7233g;
            if (i10 - i11 >= remaining) {
                byteBuffer.get(this.f7231e, i11, remaining);
                this.f7233g += remaining;
            } else {
                int i12 = i10 - i11;
                byteBuffer.get(this.f7231e, i11, i12);
                remaining -= i12;
                this.f7233g = this.f7232f;
                this.f7234h += i12;
                i1();
                while (true) {
                    int i13 = this.f7232f;
                    if (remaining <= i13) {
                        break;
                    }
                    byteBuffer.get(this.f7231e, 0, i13);
                    this.f7239i.write(this.f7231e, 0, this.f7232f);
                    int i14 = this.f7232f;
                    remaining -= i14;
                    this.f7234h += i14;
                }
                byteBuffer.get(this.f7231e, 0, remaining);
                this.f7233g = remaining;
            }
            this.f7234h += remaining;
        }

        public void l1(byte[] bArr, int i10, int i11) {
            int i12 = this.f7232f;
            int i13 = this.f7233g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f7231e, i13, i11);
                this.f7233g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f7231e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f7233g = this.f7232f;
                this.f7234h += i14;
                i1();
                if (i11 <= this.f7232f) {
                    System.arraycopy(bArr, i15, this.f7231e, 0, i11);
                    this.f7233g = i11;
                } else {
                    this.f7239i.write(bArr, i15, i11);
                }
            }
            this.f7234h += i11;
        }

        public void m1(int i10, v0 v0Var) {
            W0(i10, 2);
            J0(v0Var);
        }

        @Override // com.google.protobuf.l
        public void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            l1(bArr, i10, i11);
        }

        void n1(v0 v0Var, n1 n1Var) {
            Y0(((com.google.protobuf.a) v0Var).r(n1Var));
            n1Var.h(v0Var, this.f7229a);
        }

        @Override // com.google.protobuf.l
        public void o0(int i10, i iVar) {
            W0(i10, 2);
            p0(iVar);
        }

        @Override // com.google.protobuf.l
        public void p0(i iVar) {
            Y0(iVar.size());
            iVar.U(this);
        }

        @Override // com.google.protobuf.l
        public void u0(int i10, int i11) {
            j1(14);
            f1(i10, 5);
            c1(i11);
        }

        @Override // com.google.protobuf.l
        public void v0(int i10) {
            j1(4);
            c1(i10);
        }

        @Override // com.google.protobuf.l
        public void w0(int i10, long j10) {
            j1(18);
            f1(i10, 1);
            d1(j10);
        }

        @Override // com.google.protobuf.l
        public void x0(long j10) {
            j1(8);
            d1(j10);
        }
    }

    private l() {
    }

    public static int A(int i10, i0 i0Var) {
        return (V(1) * 2) + W(2, i10) + B(3, i0Var);
    }

    public static int B(int i10, i0 i0Var) {
        return V(i10) + C(i0Var);
    }

    public static int C(i0 i0Var) {
        return D(i0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i10) {
        return X(i10) + i10;
    }

    public static int E(int i10, v0 v0Var) {
        return (V(1) * 2) + W(2, i10) + F(3, v0Var);
    }

    public static int F(int i10, v0 v0Var) {
        return V(i10) + H(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i10, v0 v0Var, n1 n1Var) {
        return V(i10) + I(v0Var, n1Var);
    }

    public static int H(v0 v0Var) {
        return D(v0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(v0 v0Var, n1 n1Var) {
        return D(((com.google.protobuf.a) v0Var).r(n1Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int K(int i10, i iVar) {
        return (V(1) * 2) + W(2, i10) + h(3, iVar);
    }

    public static int L(int i10, int i11) {
        return V(i10) + M(i11);
    }

    public static int M(int i10) {
        return 4;
    }

    public static int N(int i10, long j10) {
        return V(i10) + O(j10);
    }

    public static int O(long j10) {
        return 8;
    }

    public static int P(int i10, int i11) {
        return V(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return X(a0(i10));
    }

    public static int R(int i10, long j10) {
        return V(i10) + S(j10);
    }

    public static int S(long j10) {
        return Z(b0(j10));
    }

    public static int T(int i10, String str) {
        return V(i10) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = a2.j(str);
        } catch (a2.d unused) {
            length = str.getBytes(d0.f7092b).length;
        }
        return D(length);
    }

    public static int V(int i10) {
        return X(b2.c(i10, 0));
    }

    public static int W(int i10, int i11) {
        return V(i10) + X(i11);
    }

    public static int X(int i10) {
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

    public static int Y(int i10, long j10) {
        return V(i10) + Z(j10);
    }

    public static int Z(long j10) {
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
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10, boolean z10) {
        return V(i10) + f(z10);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static l f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static l g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(int i10, i iVar) {
        return V(i10) + i(iVar);
    }

    public static l h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int i(i iVar) {
        return D(iVar.size());
    }

    public static int j(int i10, double d10) {
        return V(i10) + k(d10);
    }

    public static int k(double d10) {
        return 8;
    }

    public static int l(int i10, int i11) {
        return V(i10) + m(i11);
    }

    public static int m(int i10) {
        return x(i10);
    }

    public static int n(int i10, int i11) {
        return V(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return V(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return V(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int t(int i10, v0 v0Var, n1 n1Var) {
        return (V(i10) * 2) + v(v0Var, n1Var);
    }

    @Deprecated
    public static int u(v0 v0Var) {
        return v0Var.a();
    }

    @Deprecated
    static int v(v0 v0Var, n1 n1Var) {
        return ((com.google.protobuf.a) v0Var).r(n1Var);
    }

    public static int w(int i10, int i11) {
        return V(i10) + x(i11);
    }

    public static int x(int i10) {
        if (i10 >= 0) {
            return X(i10);
        }
        return 10;
    }

    public static int y(int i10, long j10) {
        return V(i10) + z(j10);
    }

    public static int z(long j10) {
        return Z(j10);
    }

    @Deprecated
    public final void A0(int i10, v0 v0Var) {
        W0(i10, 3);
        C0(v0Var);
        W0(i10, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void B0(int i10, v0 v0Var, n1 n1Var) {
        W0(i10, 3);
        D0(v0Var, n1Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void C0(v0 v0Var) {
        v0Var.p(this);
    }

    @Deprecated
    final void D0(v0 v0Var, n1 n1Var) {
        n1Var.h(v0Var, this.f7229a);
    }

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public final void G0(int i10, long j10) {
        Z0(i10, j10);
    }

    public final void H0(long j10) {
        a1(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void I0(int i10, v0 v0Var, n1 n1Var);

    public abstract void J0(v0 v0Var);

    public abstract void K0(int i10, v0 v0Var);

    public abstract void L0(int i10, i iVar);

    public final void M0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void N0(int i10) {
        v0(i10);
    }

    public final void O0(int i10, long j10) {
        w0(i10, j10);
    }

    public final void P0(long j10) {
        x0(j10);
    }

    public final void Q0(int i10, int i11) {
        X0(i10, a0(i11));
    }

    public final void R0(int i10) {
        Y0(a0(i10));
    }

    public final void S0(int i10, long j10) {
        Z0(i10, b0(j10));
    }

    public final void T0(long j10) {
        a1(b0(j10));
    }

    public abstract void U0(int i10, String str);

    public abstract void V0(String str);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10, int i11);

    public abstract void Y0(int i10);

    public abstract void Z0(int i10, long j10);

    public abstract void a1(long j10);

    @Override // com.google.protobuf.h
    public abstract void b(byte[] bArr, int i10, int i11);

    public abstract void c0();

    public final void d() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d0(String str, a2.d dVar) {
        f7227c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(d0.f7092b);
        try {
            Y0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e0() {
        return this.f7230b;
    }

    public abstract int i0();

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z10);

    public final void l0(boolean z10) {
        j0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i10, int i11);

    public abstract void o0(int i10, i iVar);

    public abstract void p0(i iVar);

    public final void q0(int i10, double d10) {
        w0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r0(double d10) {
        x0(Double.doubleToRawLongBits(d10));
    }

    public final void s0(int i10, int i11) {
        E0(i10, i11);
    }

    public final void t0(int i10) {
        F0(i10);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, long j10);

    public abstract void x0(long j10);

    public final void y0(int i10, float f10) {
        u0(i10, Float.floatToRawIntBits(f10));
    }

    public final void z0(float f10) {
        v0(Float.floatToRawIntBits(f10));
    }
}
