package io.grpc.internal;

import i9.l;
import io.grpc.internal.k2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
/* loaded from: classes.dex */
public class l1 implements Closeable, y {

    /* renamed from: j  reason: collision with root package name */
    private b f11415j;

    /* renamed from: k  reason: collision with root package name */
    private int f11416k;

    /* renamed from: l  reason: collision with root package name */
    private final i2 f11417l;

    /* renamed from: m  reason: collision with root package name */
    private final o2 f11418m;

    /* renamed from: n  reason: collision with root package name */
    private i9.u f11419n;

    /* renamed from: o  reason: collision with root package name */
    private s0 f11420o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f11421p;

    /* renamed from: q  reason: collision with root package name */
    private int f11422q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11425t;

    /* renamed from: u  reason: collision with root package name */
    private u f11426u;

    /* renamed from: w  reason: collision with root package name */
    private long f11428w;

    /* renamed from: z  reason: collision with root package name */
    private int f11431z;

    /* renamed from: r  reason: collision with root package name */
    private e f11423r = e.HEADER;

    /* renamed from: s  reason: collision with root package name */
    private int f11424s = 5;

    /* renamed from: v  reason: collision with root package name */
    private u f11427v = new u();

    /* renamed from: x  reason: collision with root package name */
    private boolean f11429x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f11430y = -1;
    private boolean A = false;
    private volatile boolean B = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11432a;

        static {
            int[] iArr = new int[e.values().length];
            f11432a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11432a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(k2.a aVar);

        void b(Throwable th);

        void e(boolean z10);

        void f(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements k2.a {

        /* renamed from: j  reason: collision with root package name */
        private InputStream f11433j;

        private c(InputStream inputStream) {
            this.f11433j = inputStream;
        }

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.k2.a
        public InputStream next() {
            InputStream inputStream = this.f11433j;
            this.f11433j = null;
            return inputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends FilterInputStream {

        /* renamed from: j  reason: collision with root package name */
        private final int f11434j;

        /* renamed from: k  reason: collision with root package name */
        private final i2 f11435k;

        /* renamed from: l  reason: collision with root package name */
        private long f11436l;

        /* renamed from: m  reason: collision with root package name */
        private long f11437m;

        /* renamed from: n  reason: collision with root package name */
        private long f11438n;

        d(InputStream inputStream, int i10, i2 i2Var) {
            super(inputStream);
            this.f11438n = -1L;
            this.f11434j = i10;
            this.f11435k = i2Var;
        }

        private void a() {
            long j10 = this.f11437m;
            long j11 = this.f11436l;
            if (j10 > j11) {
                this.f11435k.f(j10 - j11);
                this.f11436l = this.f11437m;
            }
        }

        private void b() {
            if (this.f11437m <= this.f11434j) {
                return;
            }
            i9.j1 j1Var = i9.j1.f9932o;
            throw j1Var.q("Decompressed gRPC message exceeds maximum size " + this.f11434j).d();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f11438n = this.f11437m;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f11437m++;
            }
            b();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (read != -1) {
                this.f11437m += read;
            }
            b();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f11438n == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f11437m = this.f11438n;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(j10);
            this.f11437m += skip;
            b();
            a();
            return skip;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum e {
        HEADER,
        BODY
    }

    public l1(b bVar, i9.u uVar, int i10, i2 i2Var, o2 o2Var) {
        this.f11415j = (b) b5.n.o(bVar, "sink");
        this.f11419n = (i9.u) b5.n.o(uVar, "decompressor");
        this.f11416k = i10;
        this.f11417l = (i2) b5.n.o(i2Var, "statsTraceCtx");
        this.f11418m = (o2) b5.n.o(o2Var, "transportTracer");
    }

    private void a() {
        if (this.f11429x) {
            return;
        }
        this.f11429x = true;
        while (true) {
            try {
                if (this.B || this.f11428w <= 0 || !x()) {
                    break;
                }
                int i10 = a.f11432a[this.f11423r.ordinal()];
                if (i10 == 1) {
                    w();
                } else if (i10 != 2) {
                    throw new AssertionError("Invalid state: " + this.f11423r);
                } else {
                    v();
                    this.f11428w--;
                }
            } finally {
                this.f11429x = false;
            }
        }
        if (this.B) {
            close();
            return;
        }
        if (this.A && t()) {
            close();
        }
    }

    private InputStream l() {
        i9.u uVar = this.f11419n;
        if (uVar != l.b.f9973a) {
            try {
                return new d(uVar.b(w1.c(this.f11426u, true)), this.f11416k, this.f11417l);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw i9.j1.f9937t.q("Can't decode compressed gRPC message as compression not configured").d();
    }

    private InputStream m() {
        this.f11417l.f(this.f11426u.c());
        return w1.c(this.f11426u, true);
    }

    private boolean r() {
        return q() || this.A;
    }

    private boolean t() {
        s0 s0Var = this.f11420o;
        return s0Var != null ? s0Var.z() : this.f11427v.c() == 0;
    }

    private void v() {
        this.f11417l.e(this.f11430y, this.f11431z, -1L);
        this.f11431z = 0;
        InputStream l10 = this.f11425t ? l() : m();
        this.f11426u = null;
        this.f11415j.a(new c(l10, null));
        this.f11423r = e.HEADER;
        this.f11424s = 5;
    }

    private void w() {
        int readUnsignedByte = this.f11426u.readUnsignedByte();
        if ((readUnsignedByte & 254) != 0) {
            throw i9.j1.f9937t.q("gRPC frame header malformed: reserved bits not zero").d();
        }
        this.f11425t = (readUnsignedByte & 1) != 0;
        int readInt = this.f11426u.readInt();
        this.f11424s = readInt;
        if (readInt < 0 || readInt > this.f11416k) {
            throw i9.j1.f9932o.q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f11416k), Integer.valueOf(this.f11424s))).d();
        }
        int i10 = this.f11430y + 1;
        this.f11430y = i10;
        this.f11417l.d(i10);
        this.f11418m.d();
        this.f11423r = e.BODY;
    }

    private boolean x() {
        int i10;
        int i11 = 0;
        try {
            if (this.f11426u == null) {
                this.f11426u = new u();
            }
            int i12 = 0;
            i10 = 0;
            while (true) {
                try {
                    int c10 = this.f11424s - this.f11426u.c();
                    if (c10 <= 0) {
                        if (i12 > 0) {
                            this.f11415j.f(i12);
                            if (this.f11423r == e.BODY) {
                                if (this.f11420o != null) {
                                    this.f11417l.g(i10);
                                    this.f11431z += i10;
                                } else {
                                    this.f11417l.g(i12);
                                    this.f11431z += i12;
                                }
                            }
                        }
                        return true;
                    } else if (this.f11420o != null) {
                        try {
                            byte[] bArr = this.f11421p;
                            if (bArr == null || this.f11422q == bArr.length) {
                                this.f11421p = new byte[Math.min(c10, 2097152)];
                                this.f11422q = 0;
                            }
                            int x10 = this.f11420o.x(this.f11421p, this.f11422q, Math.min(c10, this.f11421p.length - this.f11422q));
                            i12 += this.f11420o.r();
                            i10 += this.f11420o.t();
                            if (x10 == 0) {
                                if (i12 > 0) {
                                    this.f11415j.f(i12);
                                    if (this.f11423r == e.BODY) {
                                        if (this.f11420o != null) {
                                            this.f11417l.g(i10);
                                            this.f11431z += i10;
                                        } else {
                                            this.f11417l.g(i12);
                                            this.f11431z += i12;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f11426u.b(w1.f(this.f11421p, this.f11422q, x10));
                            this.f11422q += x10;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else if (this.f11427v.c() == 0) {
                        if (i12 > 0) {
                            this.f11415j.f(i12);
                            if (this.f11423r == e.BODY) {
                                if (this.f11420o != null) {
                                    this.f11417l.g(i10);
                                    this.f11431z += i10;
                                } else {
                                    this.f11417l.g(i12);
                                    this.f11431z += i12;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(c10, this.f11427v.c());
                        i12 += min;
                        this.f11426u.b(this.f11427v.u(min));
                    }
                } catch (Throwable th) {
                    int i13 = i12;
                    th = th;
                    i11 = i13;
                    if (i11 > 0) {
                        this.f11415j.f(i11);
                        if (this.f11423r == e.BODY) {
                            if (this.f11420o != null) {
                                this.f11417l.g(i10);
                                this.f11431z += i10;
                            } else {
                                this.f11417l.g(i11);
                                this.f11431z += i11;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        this.B = true;
    }

    @Override // io.grpc.internal.y
    public void b(int i10) {
        b5.n.e(i10 > 0, "numMessages must be > 0");
        if (q()) {
            return;
        }
        this.f11428w += i10;
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.y
    public void close() {
        if (q()) {
            return;
        }
        u uVar = this.f11426u;
        boolean z10 = true;
        boolean z11 = uVar != null && uVar.c() > 0;
        try {
            s0 s0Var = this.f11420o;
            if (s0Var != null) {
                if (!z11 && !s0Var.v()) {
                    z10 = false;
                }
                this.f11420o.close();
                z11 = z10;
            }
            u uVar2 = this.f11427v;
            if (uVar2 != null) {
                uVar2.close();
            }
            u uVar3 = this.f11426u;
            if (uVar3 != null) {
                uVar3.close();
            }
            this.f11420o = null;
            this.f11427v = null;
            this.f11426u = null;
            this.f11415j.e(z11);
        } catch (Throwable th) {
            this.f11420o = null;
            this.f11427v = null;
            this.f11426u = null;
            throw th;
        }
    }

    @Override // io.grpc.internal.y
    public void e(int i10) {
        this.f11416k = i10;
    }

    @Override // io.grpc.internal.y
    public void h(i9.u uVar) {
        b5.n.u(this.f11420o == null, "Already set full stream decompressor");
        this.f11419n = (i9.u) b5.n.o(uVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.y
    public void i() {
        if (q()) {
            return;
        }
        if (t()) {
            close();
        } else {
            this.A = true;
        }
    }

    @Override // io.grpc.internal.y
    public void k(v1 v1Var) {
        b5.n.o(v1Var, "data");
        boolean z10 = true;
        try {
            if (!r()) {
                s0 s0Var = this.f11420o;
                if (s0Var != null) {
                    s0Var.m(v1Var);
                } else {
                    this.f11427v.b(v1Var);
                }
                z10 = false;
                a();
            }
        } finally {
            if (z10) {
                v1Var.close();
            }
        }
    }

    public boolean q() {
        return this.f11427v == null && this.f11420o == null;
    }

    public void y(s0 s0Var) {
        b5.n.u(this.f11419n == l.b.f9973a, "per-message decompressor already set");
        b5.n.u(this.f11420o == null, "full stream decompressor already set");
        this.f11420o = (s0) b5.n.o(s0Var, "Can't pass a null full stream decompressor");
        this.f11427v = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(b bVar) {
        this.f11415j = bVar;
    }
}
