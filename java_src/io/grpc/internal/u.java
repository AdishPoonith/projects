package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes.dex */
public class u extends io.grpc.internal.c {

    /* renamed from: n  reason: collision with root package name */
    private static final f<Void> f11662n = new a();

    /* renamed from: o  reason: collision with root package name */
    private static final f<Void> f11663o = new b();

    /* renamed from: p  reason: collision with root package name */
    private static final f<byte[]> f11664p = new c();

    /* renamed from: q  reason: collision with root package name */
    private static final f<ByteBuffer> f11665q = new d();

    /* renamed from: r  reason: collision with root package name */
    private static final g<OutputStream> f11666r = new e();

    /* renamed from: j  reason: collision with root package name */
    private final Deque<v1> f11667j;

    /* renamed from: k  reason: collision with root package name */
    private Deque<v1> f11668k;

    /* renamed from: l  reason: collision with root package name */
    private int f11669l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11670m;

    /* loaded from: classes.dex */
    class a implements f<Void> {
        a() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(v1 v1Var, int i10, Void r32, int i11) {
            return v1Var.readUnsignedByte();
        }
    }

    /* loaded from: classes.dex */
    class b implements f<Void> {
        b() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(v1 v1Var, int i10, Void r32, int i11) {
            v1Var.skipBytes(i10);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    class c implements f<byte[]> {
        c() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(v1 v1Var, int i10, byte[] bArr, int i11) {
            v1Var.d0(bArr, i11, i10);
            return i11 + i10;
        }
    }

    /* loaded from: classes.dex */
    class d implements f<ByteBuffer> {
        d() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(v1 v1Var, int i10, ByteBuffer byteBuffer, int i11) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            v1Var.Z(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    class e implements g<OutputStream> {
        e() {
        }

        @Override // io.grpc.internal.u.g
        /* renamed from: b */
        public int a(v1 v1Var, int i10, OutputStream outputStream, int i11) {
            v1Var.P(outputStream, i10);
            return 0;
        }
    }

    /* loaded from: classes.dex */
    private interface f<T> extends g<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g<T> {
        int a(v1 v1Var, int i10, T t10, int i11);
    }

    public u() {
        this.f11667j = new ArrayDeque();
    }

    public u(int i10) {
        this.f11667j = new ArrayDeque(i10);
    }

    private void e() {
        if (!this.f11670m) {
            this.f11667j.remove().close();
            return;
        }
        this.f11668k.add(this.f11667j.remove());
        v1 peek = this.f11667j.peek();
        if (peek != null) {
            peek.o();
        }
    }

    private void h() {
        if (this.f11667j.peek().c() == 0) {
            e();
        }
    }

    private void i(v1 v1Var) {
        if (!(v1Var instanceof u)) {
            this.f11667j.add(v1Var);
            this.f11669l += v1Var.c();
            return;
        }
        u uVar = (u) v1Var;
        while (!uVar.f11667j.isEmpty()) {
            this.f11667j.add(uVar.f11667j.remove());
        }
        this.f11669l += uVar.f11669l;
        uVar.f11669l = 0;
        uVar.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r4 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        throw new java.lang.AssertionError("Failed executing read operation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.f11667j.isEmpty() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r4 <= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r2.f11667j.isEmpty() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r2.f11667j.peek();
        r1 = java.lang.Math.min(r4, r0.c());
        r6 = r3.a(r0, r1, r5, r6);
        r4 = r4 - r1;
        r2.f11669l -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        h();
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0030 -> B:5:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> int k(io.grpc.internal.u.g<T> r3, int r4, T r5, int r6) {
        /*
            r2 = this;
            r2.a(r4)
            java.util.Deque<io.grpc.internal.v1> r0 = r2.f11667j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            goto L30
        Lc:
            if (r4 <= 0) goto L34
            java.util.Deque<io.grpc.internal.v1> r0 = r2.f11667j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            java.util.Deque<io.grpc.internal.v1> r0 = r2.f11667j
            java.lang.Object r0 = r0.peek()
            io.grpc.internal.v1 r0 = (io.grpc.internal.v1) r0
            int r1 = r0.c()
            int r1 = java.lang.Math.min(r4, r1)
            int r6 = r3.a(r0, r1, r5, r6)
            int r4 = r4 - r1
            int r0 = r2.f11669l
            int r0 = r0 - r1
            r2.f11669l = r0
        L30:
            r2.h()
            goto Lc
        L34:
            if (r4 > 0) goto L37
            return r6
        L37:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "Failed executing read operation"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.u.k(io.grpc.internal.u$g, int, java.lang.Object, int):int");
    }

    private <T> int l(f<T> fVar, int i10, T t10, int i11) {
        try {
            return k(fVar, i10, t10, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.v1
    public void P(OutputStream outputStream, int i10) {
        k(f11666r, i10, outputStream, 0);
    }

    @Override // io.grpc.internal.v1
    public void Z(ByteBuffer byteBuffer) {
        l(f11665q, byteBuffer.remaining(), byteBuffer, 0);
    }

    public void b(v1 v1Var) {
        boolean z10 = this.f11670m && this.f11667j.isEmpty();
        i(v1Var);
        if (z10) {
            this.f11667j.peek().o();
        }
    }

    @Override // io.grpc.internal.v1
    public int c() {
        return this.f11669l;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f11667j.isEmpty()) {
            this.f11667j.remove().close();
        }
        if (this.f11668k != null) {
            while (!this.f11668k.isEmpty()) {
                this.f11668k.remove().close();
            }
        }
    }

    @Override // io.grpc.internal.v1
    public void d0(byte[] bArr, int i10, int i11) {
        l(f11664p, i11, bArr, i10);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.v1
    public boolean markSupported() {
        for (v1 v1Var : this.f11667j) {
            if (!v1Var.markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.c, io.grpc.internal.v1
    public void o() {
        if (this.f11668k == null) {
            this.f11668k = new ArrayDeque(Math.min(this.f11667j.size(), 16));
        }
        while (!this.f11668k.isEmpty()) {
            this.f11668k.remove().close();
        }
        this.f11670m = true;
        v1 peek = this.f11667j.peek();
        if (peek != null) {
            peek.o();
        }
    }

    @Override // io.grpc.internal.v1
    public int readUnsignedByte() {
        return l(f11662n, 1, null, 0);
    }

    @Override // io.grpc.internal.c, io.grpc.internal.v1
    public void reset() {
        if (!this.f11670m) {
            throw new InvalidMarkException();
        }
        v1 peek = this.f11667j.peek();
        if (peek != null) {
            int c10 = peek.c();
            peek.reset();
            this.f11669l += peek.c() - c10;
        }
        while (true) {
            v1 pollLast = this.f11668k.pollLast();
            if (pollLast == null) {
                return;
            }
            pollLast.reset();
            this.f11667j.addFirst(pollLast);
            this.f11669l += pollLast.c();
        }
    }

    @Override // io.grpc.internal.v1
    public void skipBytes(int i10) {
        l(f11663o, i10, null, 0);
    }

    @Override // io.grpc.internal.v1
    public v1 u(int i10) {
        v1 poll;
        int i11;
        v1 v1Var;
        if (i10 <= 0) {
            return w1.a();
        }
        a(i10);
        this.f11669l -= i10;
        u uVar = null;
        u uVar2 = null;
        while (true) {
            v1 peek = this.f11667j.peek();
            int c10 = peek.c();
            if (c10 > i10) {
                v1Var = peek.u(i10);
                i11 = 0;
            } else {
                if (this.f11670m) {
                    poll = peek.u(c10);
                    e();
                } else {
                    poll = this.f11667j.poll();
                }
                v1 v1Var2 = poll;
                i11 = i10 - c10;
                v1Var = v1Var2;
            }
            if (uVar == null) {
                uVar = v1Var;
            } else {
                if (uVar2 == null) {
                    uVar2 = new u(i11 != 0 ? Math.min(this.f11667j.size() + 2, 16) : 2);
                    uVar2.b(uVar);
                    uVar = uVar2;
                }
                uVar2.b(v1Var);
            }
            if (i11 <= 0) {
                return uVar;
            }
            i10 = i11;
        }
    }
}
