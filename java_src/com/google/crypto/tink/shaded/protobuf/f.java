package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
abstract class f implements g1 {

    /* loaded from: classes.dex */
    private static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f6168a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f6169b;

        /* renamed from: c  reason: collision with root package name */
        private int f6170c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6171d;

        /* renamed from: e  reason: collision with root package name */
        private int f6172e;

        /* renamed from: f  reason: collision with root package name */
        private int f6173f;

        /* renamed from: g  reason: collision with root package name */
        private int f6174g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f6168a = z10;
            this.f6169b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f6170c = arrayOffset;
            this.f6171d = arrayOffset;
            this.f6172e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f6170c == this.f6172e;
        }

        private byte S() {
            int i10 = this.f6170c;
            if (i10 != this.f6172e) {
                byte[] bArr = this.f6169b;
                this.f6170c = i10 + 1;
                return bArr[i10];
            }
            throw c0.k();
        }

        private <T> T T(h1<T> h1Var, q qVar) {
            int i10 = this.f6174g;
            this.f6174g = u1.c(u1.a(this.f6173f), 4);
            try {
                T f10 = h1Var.f();
                h1Var.j(f10, this, qVar);
                h1Var.b(f10);
                if (this.f6173f == this.f6174g) {
                    return f10;
                }
                throw c0.h();
            } finally {
                this.f6174g = i10;
            }
        }

        private int U() {
            e0(4);
            return V();
        }

        private int V() {
            int i10 = this.f6170c;
            byte[] bArr = this.f6169b;
            this.f6170c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long W() {
            e0(8);
            return X();
        }

        private long X() {
            int i10 = this.f6170c;
            byte[] bArr = this.f6169b;
            this.f6170c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        private <T> T Y(h1<T> h1Var, q qVar) {
            int b02 = b0();
            e0(b02);
            int i10 = this.f6172e;
            int i11 = this.f6170c + b02;
            this.f6172e = i11;
            try {
                T f10 = h1Var.f();
                h1Var.j(f10, this, qVar);
                h1Var.b(f10);
                if (this.f6170c == i11) {
                    return f10;
                }
                throw c0.h();
            } finally {
                this.f6172e = i10;
            }
        }

        private int b0() {
            int i10;
            int i11 = this.f6170c;
            int i12 = this.f6172e;
            if (i12 != i11) {
                byte[] bArr = this.f6169b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f6170c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw c0.f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f6170c = i14;
                    return i10;
                }
            }
            throw c0.k();
        }

        private long d0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte S = S();
                j10 |= (S & Byte.MAX_VALUE) << i10;
                if ((S & 128) == 0) {
                    return j10;
                }
            }
            throw c0.f();
        }

        private void e0(int i10) {
            if (i10 < 0 || i10 > this.f6172e - this.f6170c) {
                throw c0.k();
            }
        }

        private void f0(int i10) {
            if (this.f6170c != i10) {
                throw c0.k();
            }
        }

        private void g0(int i10) {
            if (u1.b(this.f6173f) != i10) {
                throw c0.e();
            }
        }

        private void h0(int i10) {
            e0(i10);
            this.f6170c += i10;
        }

        private void i0() {
            int i10 = this.f6174g;
            this.f6174g = u1.c(u1.a(this.f6173f), 4);
            while (p() != Integer.MAX_VALUE && y()) {
            }
            if (this.f6173f != this.f6174g) {
                throw c0.h();
            }
            this.f6174g = i10;
        }

        private void j0() {
            int i10 = this.f6172e;
            int i11 = this.f6170c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f6169b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f6170c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            k0();
        }

        private void k0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw c0.f();
        }

        private void l0(int i10) {
            e0(i10);
            if ((i10 & 3) != 0) {
                throw c0.h();
            }
        }

        private void m0(int i10) {
            e0(i10);
            if ((i10 & 7) != 0) {
                throw c0.h();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void A(List<i> list) {
            int i10;
            if (u1.b(this.f6173f) != 2) {
                throw c0.e();
            }
            do {
                list.add(u());
                if (R()) {
                    return;
                }
                i10 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void B(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof n)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(X())));
                    }
                    return;
                }
            }
            n nVar = (n) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 1) {
                do {
                    nVar.l(readDouble());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    nVar.l(Double.longBitsToDouble(X()));
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void C(List<Long> list) {
            int i10;
            int b02;
            int i11;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f6173f);
                if (b10 == 0) {
                    do {
                        j0Var.m(E());
                        if (R()) {
                            return;
                        }
                        i11 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        j0Var.m(c0());
                    }
                }
            } else {
                int b11 = u1.b(this.f6173f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(E()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                }
            }
            f0(b02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void D(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(r()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 1) {
                do {
                    j0Var.m(r());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    j0Var.m(X());
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long E() {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public String F() {
            return Z(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void G(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    int b02 = b0();
                    m0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 1) {
                do {
                    j0Var.m(f());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                int b03 = b0();
                m0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    j0Var.m(X());
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void H(List<Integer> list) {
            int i10;
            int b02;
            int i11;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b10 = u1.b(this.f6173f);
                if (b10 == 0) {
                    do {
                        a0Var.l(x());
                        if (R()) {
                            return;
                        }
                        i11 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        a0Var.l(b0());
                    }
                }
            } else {
                int b11 = u1.b(this.f6173f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(x()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                }
            }
            f0(b02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void I(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(b()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int b03 = this.f6170c + b0();
                while (this.f6170c < b03) {
                    a0Var.l(b0());
                }
                return;
            }
            do {
                a0Var.l(b());
                if (R()) {
                    return;
                }
                i11 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T J(h1<T> h1Var, q qVar) {
            g0(3);
            return (T) T(h1Var, qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T K(h1<T> h1Var, q qVar) {
            g0(2);
            return (T) Y(h1Var, qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T L(Class<T> cls, q qVar) {
            g0(3);
            return (T) T(d1.a().d(cls), qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> void M(List<T> list, h1<T> h1Var, q qVar) {
            int i10;
            if (u1.b(this.f6173f) != 2) {
                throw c0.e();
            }
            int i11 = this.f6173f;
            do {
                list.add(Y(h1Var, qVar));
                if (R()) {
                    return;
                }
                i10 = this.f6170c;
            } while (b0() == i11);
            this.f6170c = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> T N(Class<T> cls, q qVar) {
            g0(2);
            return (T) Y(d1.a().d(cls), qVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <K, V> void O(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
            g0(2);
            int b02 = b0();
            e0(b02);
            int i10 = this.f6172e;
            this.f6172e = this.f6170c + b02;
            try {
                throw null;
            } catch (Throwable th) {
                this.f6172e = i10;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public <T> void P(List<T> list, h1<T> h1Var, q qVar) {
            int i10;
            if (u1.b(this.f6173f) != 3) {
                throw c0.e();
            }
            int i11 = this.f6173f;
            do {
                list.add(T(h1Var, qVar));
                if (R()) {
                    return;
                }
                i10 = this.f6170c;
            } while (b0() == i11);
            this.f6170c = i10;
        }

        public String Z(boolean z10) {
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return "";
            }
            e0(b02);
            if (z10) {
                byte[] bArr = this.f6169b;
                int i10 = this.f6170c;
                if (!t1.n(bArr, i10, i10 + b02)) {
                    throw c0.d();
                }
            }
            String str = new String(this.f6169b, this.f6170c, b02, b0.f6126b);
            this.f6170c += b02;
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void a(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Integer.valueOf(j.b(b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int b03 = this.f6170c + b0();
                while (this.f6170c < b03) {
                    a0Var.l(j.b(b0()));
                }
                return;
            }
            do {
                a0Var.l(h());
                if (R()) {
                    return;
                }
                i11 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i11;
        }

        public void a0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (u1.b(this.f6173f) != 2) {
                throw c0.e();
            }
            if (!(list instanceof h0) || z10) {
                do {
                    list.add(Z(z10));
                    if (R()) {
                        return;
                    }
                    i10 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i10;
                return;
            }
            h0 h0Var = (h0) list;
            do {
                h0Var.o(u());
                if (R()) {
                    return;
                }
                i11 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int b() {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int c() {
            return this.f6173f;
        }

        public long c0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f6170c;
            int i12 = this.f6172e;
            if (i12 != i11) {
                byte[] bArr = this.f6169b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f6170c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return d0();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw c0.f();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f6170c = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f6170c = i14;
                    return j10;
                }
            }
            throw c0.k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long d() {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void e(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Integer.valueOf(n()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                }
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    a0Var.l(V());
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    a0Var.l(n());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long f() {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void g(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Integer.valueOf(z()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                }
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    a0Var.l(V());
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    a0Var.l(z());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int h() {
            g0(0);
            return j.b(b0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void i(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof j0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Long.valueOf(j.c(c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(j()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i10;
                return;
            }
            j0 j0Var = (j0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int b03 = this.f6170c + b0();
                while (this.f6170c < b03) {
                    j0Var.m(j.c(c0()));
                }
                return;
            }
            do {
                j0Var.m(j());
                if (R()) {
                    return;
                }
                i11 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long j() {
            g0(0);
            return j.c(c0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void k(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof a0)) {
                int b10 = u1.b(this.f6173f);
                if (b10 != 0) {
                    if (b10 != 2) {
                        throw c0.e();
                    }
                    int b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(w()));
                    if (R()) {
                        return;
                    }
                    i10 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i10;
                return;
            }
            a0 a0Var = (a0) list;
            int b11 = u1.b(this.f6173f);
            if (b11 != 0) {
                if (b11 != 2) {
                    throw c0.e();
                }
                int b03 = this.f6170c + b0();
                while (this.f6170c < b03) {
                    a0Var.l(b0());
                }
                return;
            }
            do {
                a0Var.l(w());
                if (R()) {
                    return;
                }
                i11 = this.f6170c;
            } while (b0() == this.f6173f);
            this.f6170c = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void l(List<Boolean> list) {
            int i10;
            int b02;
            int i11;
            if (list instanceof g) {
                g gVar = (g) list;
                int b10 = u1.b(this.f6173f);
                if (b10 == 0) {
                    do {
                        gVar.m(o());
                        if (R()) {
                            return;
                        }
                        i11 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        gVar.m(b0() != 0);
                    }
                }
            } else {
                int b11 = u1.b(this.f6173f);
                if (b11 == 0) {
                    do {
                        list.add(Boolean.valueOf(o()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                }
            }
            f0(b02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public String m() {
            return Z(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int n() {
            g0(5);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public boolean o() {
            g0(0);
            return b0() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int p() {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int b02 = b0();
            this.f6173f = b02;
            if (b02 == this.f6174g) {
                return Integer.MAX_VALUE;
            }
            return u1.a(b02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void q(List<String> list) {
            a0(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public long r() {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public double readDouble() {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public float readFloat() {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void s(List<Long> list) {
            int i10;
            int b02;
            int i11;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b10 = u1.b(this.f6173f);
                if (b10 == 0) {
                    do {
                        j0Var.m(d());
                        if (R()) {
                            return;
                        }
                        i11 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i11;
                    return;
                } else if (b10 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        j0Var.m(c0());
                    }
                }
            } else {
                int b11 = u1.b(this.f6173f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                } else if (b11 != 2) {
                    throw c0.e();
                } else {
                    b02 = this.f6170c + b0();
                    while (this.f6170c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                }
            }
            f0(b02);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void t(List<String> list) {
            a0(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public i u() {
            g0(2);
            int b02 = b0();
            if (b02 == 0) {
                return i.f6190k;
            }
            e0(b02);
            i H = this.f6168a ? i.H(this.f6169b, this.f6170c, b02) : i.p(this.f6169b, this.f6170c, b02);
            this.f6170c += b02;
            return H;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public void v(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof x)) {
                int b10 = u1.b(this.f6173f);
                if (b10 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i12 = this.f6170c + b02;
                    while (this.f6170c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(V())));
                    }
                    return;
                } else if (b10 != 5) {
                    throw c0.e();
                } else {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (R()) {
                            return;
                        }
                        i10 = this.f6170c;
                    } while (b0() == this.f6173f);
                    this.f6170c = i10;
                    return;
                }
            }
            x xVar = (x) list;
            int b11 = u1.b(this.f6173f);
            if (b11 == 2) {
                int b03 = b0();
                l0(b03);
                int i13 = this.f6170c + b03;
                while (this.f6170c < i13) {
                    xVar.l(Float.intBitsToFloat(V()));
                }
            } else if (b11 != 5) {
                throw c0.e();
            } else {
                do {
                    xVar.l(readFloat());
                    if (R()) {
                        return;
                    }
                    i11 = this.f6170c;
                } while (b0() == this.f6173f);
                this.f6170c = i11;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int w() {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int x() {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public boolean y() {
            int i10;
            int i11;
            if (R() || (i10 = this.f6173f) == this.f6174g) {
                return false;
            }
            int b10 = u1.b(i10);
            if (b10 == 0) {
                j0();
                return true;
            }
            if (b10 == 1) {
                i11 = 8;
            } else if (b10 == 2) {
                i11 = b0();
            } else if (b10 == 3) {
                i0();
                return true;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                i11 = 4;
            }
            h0(i11);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g1
        public int z() {
            g0(5);
            return U();
        }
    }

    private f() {
    }

    public static f Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
