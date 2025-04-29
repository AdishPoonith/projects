package k9;

import io.grpc.internal.v1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
class l extends io.grpc.internal.c {

    /* renamed from: j  reason: collision with root package name */
    private final okio.c f12785j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(okio.c cVar) {
        this.f12785j = cVar;
    }

    private void b() {
    }

    @Override // io.grpc.internal.v1
    public void P(OutputStream outputStream, int i10) {
        this.f12785j.n0(outputStream, i10);
    }

    @Override // io.grpc.internal.v1
    public void Z(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.v1
    public int c() {
        return (int) this.f12785j.b0();
    }

    @Override // io.grpc.internal.c, io.grpc.internal.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12785j.h();
    }

    @Override // io.grpc.internal.v1
    public void d0(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f12785j.read(bArr, i10, i11);
            if (read == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
            i11 -= read;
            i10 += read;
        }
    }

    @Override // io.grpc.internal.v1
    public int readUnsignedByte() {
        try {
            b();
            return this.f12785j.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.v1
    public void skipBytes(int i10) {
        try {
            this.f12785j.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.v1
    public v1 u(int i10) {
        okio.c cVar = new okio.c();
        cVar.j(this.f12785j, i10);
        return new l(cVar);
    }
}
