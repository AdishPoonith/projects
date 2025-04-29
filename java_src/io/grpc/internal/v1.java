package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface v1 extends Closeable {
    void P(OutputStream outputStream, int i10);

    void Z(ByteBuffer byteBuffer);

    int c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d0(byte[] bArr, int i10, int i11);

    boolean markSupported();

    void o();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    v1 u(int i10);
}
