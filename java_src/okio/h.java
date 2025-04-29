package okio;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
final class h implements d {

    /* renamed from: j  reason: collision with root package name */
    public final c f14764j = new c();

    /* renamed from: k  reason: collision with root package name */
    public final m f14765k;

    /* renamed from: l  reason: collision with root package name */
    boolean f14766l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(m mVar) {
        Objects.requireNonNull(mVar, "sink == null");
        this.f14765k = mVar;
    }

    @Override // okio.d
    public d D(int i10) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.D(i10);
        return a();
    }

    @Override // okio.d
    public d J(byte[] bArr) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.J(bArr);
        return a();
    }

    public d a() {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        long r10 = this.f14764j.r();
        if (r10 > 0) {
            this.f14765k.j(this.f14764j, r10);
        }
        return this;
    }

    @Override // okio.d
    public d a0(String str) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.a0(str);
        return a();
    }

    @Override // okio.m, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14766l) {
            return;
        }
        Throwable th = null;
        try {
            c cVar = this.f14764j;
            long j10 = cVar.f14751k;
            if (j10 > 0) {
                this.f14765k.j(cVar, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f14765k.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f14766l = true;
        if (th != null) {
            p.c(th);
        }
    }

    @Override // okio.d, okio.m, java.io.Flushable
    public void flush() {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f14764j;
        long j10 = cVar.f14751k;
        if (j10 > 0) {
            this.f14765k.j(cVar, j10);
        }
        this.f14765k.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f14766l;
    }

    @Override // okio.m
    public void j(c cVar, long j10) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.j(cVar, j10);
        a();
    }

    @Override // okio.d
    public d p(int i10) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.p(i10);
        return a();
    }

    @Override // okio.d
    public d s(int i10) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        this.f14764j.s(i10);
        return a();
    }

    public String toString() {
        return "buffer(" + this.f14765k + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f14766l) {
            throw new IllegalStateException("closed");
        }
        int write = this.f14764j.write(byteBuffer);
        a();
        return write;
    }
}
