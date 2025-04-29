package io.grpc.internal;

import i9.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class m1 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f11450a;

    /* renamed from: c  reason: collision with root package name */
    private p2 f11452c;

    /* renamed from: h  reason: collision with root package name */
    private final q2 f11457h;

    /* renamed from: i  reason: collision with root package name */
    private final i2 f11458i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11459j;

    /* renamed from: k  reason: collision with root package name */
    private int f11460k;

    /* renamed from: m  reason: collision with root package name */
    private long f11462m;

    /* renamed from: b  reason: collision with root package name */
    private int f11451b = -1;

    /* renamed from: d  reason: collision with root package name */
    private i9.n f11453d = l.b.f9973a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11454e = true;

    /* renamed from: f  reason: collision with root package name */
    private final c f11455f = new c();

    /* renamed from: g  reason: collision with root package name */
    private final ByteBuffer f11456g = ByteBuffer.allocate(5);

    /* renamed from: l  reason: collision with root package name */
    private int f11461l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends OutputStream {

        /* renamed from: j  reason: collision with root package name */
        private final List<p2> f11463j;

        /* renamed from: k  reason: collision with root package name */
        private p2 f11464k;

        private b() {
            this.f11463j = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            int i10 = 0;
            for (p2 p2Var : this.f11463j) {
                i10 += p2Var.c();
            }
            return i10;
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            p2 p2Var = this.f11464k;
            if (p2Var == null || p2Var.d() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f11464k.e((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f11464k == null) {
                p2 a10 = m1.this.f11457h.a(i11);
                this.f11464k = a10;
                this.f11463j.add(a10);
            }
            while (i11 > 0) {
                int min = Math.min(i11, this.f11464k.d());
                if (min == 0) {
                    p2 a11 = m1.this.f11457h.a(Math.max(i11, this.f11464k.c() * 2));
                    this.f11464k = a11;
                    this.f11463j.add(a11);
                } else {
                    this.f11464k.b(bArr, i10, min);
                    i10 += min;
                    i11 -= min;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            m1.this.o(bArr, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void o(p2 p2Var, boolean z10, boolean z11, int i10);
    }

    public m1(d dVar, q2 q2Var, i2 i2Var) {
        this.f11450a = (d) b5.n.o(dVar, "sink");
        this.f11457h = (q2) b5.n.o(q2Var, "bufferAllocator");
        this.f11458i = (i2) b5.n.o(i2Var, "statsTraceCtx");
    }

    private void g(boolean z10, boolean z11) {
        p2 p2Var = this.f11452c;
        this.f11452c = null;
        this.f11450a.o(p2Var, z10, z11, this.f11460k);
        this.f11460k = 0;
    }

    private int h(InputStream inputStream) {
        if ((inputStream instanceof i9.q0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void i() {
        p2 p2Var = this.f11452c;
        if (p2Var != null) {
            p2Var.a();
            this.f11452c = null;
        }
    }

    private void k() {
        if (d()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void l(b bVar, boolean z10) {
        int c10 = bVar.c();
        this.f11456g.clear();
        this.f11456g.put(z10 ? (byte) 1 : (byte) 0).putInt(c10);
        p2 a10 = this.f11457h.a(5);
        a10.b(this.f11456g.array(), 0, this.f11456g.position());
        if (c10 == 0) {
            this.f11452c = a10;
            return;
        }
        this.f11450a.o(a10, false, false, this.f11460k - 1);
        this.f11460k = 1;
        List list = bVar.f11463j;
        for (int i10 = 0; i10 < list.size() - 1; i10++) {
            this.f11450a.o((p2) list.get(i10), false, false, 0);
        }
        this.f11452c = (p2) list.get(list.size() - 1);
        this.f11462m = c10;
    }

    private int m(InputStream inputStream, int i10) {
        b bVar = new b();
        OutputStream c10 = this.f11453d.c(bVar);
        try {
            int p10 = p(inputStream, c10);
            c10.close();
            int i11 = this.f11451b;
            if (i11 < 0 || p10 <= i11) {
                l(bVar, true);
                return p10;
            }
            throw i9.j1.f9932o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(p10), Integer.valueOf(this.f11451b))).d();
        } catch (Throwable th) {
            c10.close();
            throw th;
        }
    }

    private int n(InputStream inputStream, int i10) {
        int i11 = this.f11451b;
        if (i11 < 0 || i10 <= i11) {
            this.f11456g.clear();
            this.f11456g.put((byte) 0).putInt(i10);
            if (this.f11452c == null) {
                this.f11452c = this.f11457h.a(this.f11456g.position() + i10);
            }
            o(this.f11456g.array(), 0, this.f11456g.position());
            return p(inputStream, this.f11455f);
        }
        throw i9.j1.f9932o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f11451b))).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            p2 p2Var = this.f11452c;
            if (p2Var != null && p2Var.d() == 0) {
                g(false, false);
            }
            if (this.f11452c == null) {
                this.f11452c = this.f11457h.a(i11);
            }
            int min = Math.min(i11, this.f11452c.d());
            this.f11452c.b(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    private static int p(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof i9.w) {
            return ((i9.w) inputStream).a(outputStream);
        }
        long b10 = c5.b.b(inputStream, outputStream);
        b5.n.i(b10 <= 2147483647L, "Message size overflow: %s", b10);
        return (int) b10;
    }

    private int q(InputStream inputStream, int i10) {
        if (i10 != -1) {
            this.f11462m = i10;
            return n(inputStream, i10);
        }
        b bVar = new b();
        int p10 = p(inputStream, bVar);
        int i11 = this.f11451b;
        if (i11 < 0 || p10 <= i11) {
            l(bVar, false);
            return p10;
        }
        throw i9.j1.f9932o.q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(p10), Integer.valueOf(this.f11451b))).d();
    }

    @Override // io.grpc.internal.p0
    public void close() {
        if (d()) {
            return;
        }
        this.f11459j = true;
        p2 p2Var = this.f11452c;
        if (p2Var != null && p2Var.c() == 0) {
            i();
        }
        g(true, true);
    }

    @Override // io.grpc.internal.p0
    public boolean d() {
        return this.f11459j;
    }

    @Override // io.grpc.internal.p0
    public void e(InputStream inputStream) {
        k();
        this.f11460k++;
        int i10 = this.f11461l + 1;
        this.f11461l = i10;
        this.f11462m = 0L;
        this.f11458i.i(i10);
        boolean z10 = this.f11454e && this.f11453d != l.b.f9973a;
        try {
            int h10 = h(inputStream);
            int q10 = (h10 == 0 || !z10) ? q(inputStream, h10) : m(inputStream, h10);
            if (h10 != -1 && q10 != h10) {
                throw i9.j1.f9937t.q(String.format("Message length inaccurate %s != %s", Integer.valueOf(q10), Integer.valueOf(h10))).d();
            }
            long j10 = q10;
            this.f11458i.k(j10);
            this.f11458i.l(this.f11462m);
            this.f11458i.j(this.f11461l, this.f11462m, j10);
        } catch (IOException e10) {
            throw i9.j1.f9937t.q("Failed to frame message").p(e10).d();
        } catch (RuntimeException e11) {
            throw i9.j1.f9937t.q("Failed to frame message").p(e11).d();
        }
    }

    @Override // io.grpc.internal.p0
    public void f(int i10) {
        b5.n.u(this.f11451b == -1, "max size already set");
        this.f11451b = i10;
    }

    @Override // io.grpc.internal.p0
    public void flush() {
        p2 p2Var = this.f11452c;
        if (p2Var == null || p2Var.c() <= 0) {
            return;
        }
        g(false, true);
    }

    @Override // io.grpc.internal.p0
    /* renamed from: j */
    public m1 c(i9.n nVar) {
        this.f11453d = (i9.n) b5.n.o(nVar, "Can't pass an empty compressor");
        return this;
    }
}
