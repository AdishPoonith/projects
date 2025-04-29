package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class o0 implements v1 {

    /* renamed from: j  reason: collision with root package name */
    private final v1 f11493j;

    /* JADX INFO: Access modifiers changed from: protected */
    public o0(v1 v1Var) {
        this.f11493j = (v1) b5.n.o(v1Var, "buf");
    }

    @Override // io.grpc.internal.v1
    public void P(OutputStream outputStream, int i10) {
        this.f11493j.P(outputStream, i10);
    }

    @Override // io.grpc.internal.v1
    public void Z(ByteBuffer byteBuffer) {
        this.f11493j.Z(byteBuffer);
    }

    @Override // io.grpc.internal.v1
    public int c() {
        return this.f11493j.c();
    }

    @Override // io.grpc.internal.v1
    public void d0(byte[] bArr, int i10, int i11) {
        this.f11493j.d0(bArr, i10, i11);
    }

    @Override // io.grpc.internal.v1
    public boolean markSupported() {
        return this.f11493j.markSupported();
    }

    @Override // io.grpc.internal.v1
    public void o() {
        this.f11493j.o();
    }

    @Override // io.grpc.internal.v1
    public int readUnsignedByte() {
        return this.f11493j.readUnsignedByte();
    }

    @Override // io.grpc.internal.v1
    public void reset() {
        this.f11493j.reset();
    }

    @Override // io.grpc.internal.v1
    public void skipBytes(int i10) {
        this.f11493j.skipBytes(i10);
    }

    public String toString() {
        return b5.h.c(this).d("delegate", this.f11493j).toString();
    }

    @Override // io.grpc.internal.v1
    public v1 u(int i10) {
        return this.f11493j.u(i10);
    }
}
