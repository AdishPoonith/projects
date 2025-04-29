package o3;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class n extends InputStream {

    /* renamed from: j  reason: collision with root package name */
    private final l f14490j;

    /* renamed from: k  reason: collision with root package name */
    private final p f14491k;

    /* renamed from: o  reason: collision with root package name */
    private long f14495o;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14493m = false;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14494n = false;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f14492l = new byte[1];

    public n(l lVar, p pVar) {
        this.f14490j = lVar;
        this.f14491k = pVar;
    }

    private void a() {
        if (this.f14493m) {
            return;
        }
        this.f14490j.m(this.f14491k);
        this.f14493m = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14494n) {
            return;
        }
        this.f14490j.close();
        this.f14494n = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f14492l) == -1) {
            return -1;
        }
        return this.f14492l[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        p3.a.f(!this.f14494n);
        a();
        int read = this.f14490j.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f14495o += read;
        return read;
    }
}
