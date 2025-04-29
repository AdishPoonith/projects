package io.grpc.internal;
/* loaded from: classes.dex */
public abstract class c implements v1 {
    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i10) {
        if (c() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.v1
    public boolean markSupported() {
        return false;
    }

    @Override // io.grpc.internal.v1
    public void o() {
    }

    public final int readInt() {
        a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.v1
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
