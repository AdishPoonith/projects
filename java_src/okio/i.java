package okio;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
final class i implements e {

    /* renamed from: j  reason: collision with root package name */
    public final c f14767j = new c();

    /* renamed from: k  reason: collision with root package name */
    public final n f14768k;

    /* renamed from: l  reason: collision with root package name */
    boolean f14769l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(n nVar) {
        Objects.requireNonNull(nVar, "source == null");
        this.f14768k = nVar;
    }

    @Override // okio.e
    public c A() {
        return this.f14767j;
    }

    @Override // okio.e
    public boolean B() {
        if (this.f14769l) {
            throw new IllegalStateException("closed");
        }
        return this.f14767j.B() && this.f14768k.Q(this.f14767j, 8192L) == -1;
    }

    @Override // okio.e
    public byte[] G(long j10) {
        Y(j10);
        return this.f14767j.G(j10);
    }

    @Override // okio.n
    public long Q(c cVar, long j10) {
        if (cVar != null) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f14769l) {
                throw new IllegalStateException("closed");
            } else {
                c cVar2 = this.f14767j;
                if (cVar2.f14751k == 0 && this.f14768k.Q(cVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.f14767j.Q(cVar, Math.min(j10, this.f14767j.f14751k));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public void Y(long j10) {
        if (!a(j10)) {
            throw new EOFException();
        }
    }

    public boolean a(long j10) {
        c cVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (this.f14769l) {
            throw new IllegalStateException("closed");
        } else {
            do {
                cVar = this.f14767j;
                if (cVar.f14751k >= j10) {
                    return true;
                }
            } while (this.f14768k.Q(cVar, 8192L) != -1);
            return false;
        }
    }

    @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14769l) {
            return;
        }
        this.f14769l = true;
        this.f14768k.close();
        this.f14767j.h();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f14769l;
    }

    @Override // okio.e
    public f n(long j10) {
        Y(j10);
        return this.f14767j.n(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f14767j;
        if (cVar.f14751k == 0 && this.f14768k.Q(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f14767j.read(byteBuffer);
    }

    @Override // okio.e
    public byte readByte() {
        Y(1L);
        return this.f14767j.readByte();
    }

    @Override // okio.e
    public int readInt() {
        Y(4L);
        return this.f14767j.readInt();
    }

    @Override // okio.e
    public short readShort() {
        Y(2L);
        return this.f14767j.readShort();
    }

    @Override // okio.e
    public void skip(long j10) {
        if (this.f14769l) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            c cVar = this.f14767j;
            if (cVar.f14751k == 0 && this.f14768k.Q(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f14767j.b0());
            this.f14767j.skip(min);
            j10 -= min;
        }
    }

    public String toString() {
        return "buffer(" + this.f14768k + ")";
    }
}
