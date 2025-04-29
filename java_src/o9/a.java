package o9;

import com.google.protobuf.f1;
import com.google.protobuf.l;
import com.google.protobuf.v0;
import i9.q0;
import i9.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
final class a extends InputStream implements w, q0 {

    /* renamed from: j  reason: collision with root package name */
    private v0 f14725j;

    /* renamed from: k  reason: collision with root package name */
    private final f1<?> f14726k;

    /* renamed from: l  reason: collision with root package name */
    private ByteArrayInputStream f14727l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(v0 v0Var, f1<?> f1Var) {
        this.f14725j = v0Var;
        this.f14726k = f1Var;
    }

    @Override // i9.w
    public int a(OutputStream outputStream) {
        v0 v0Var = this.f14725j;
        if (v0Var != null) {
            int a10 = v0Var.a();
            this.f14725j.n(outputStream);
            this.f14725j = null;
            return a10;
        }
        ByteArrayInputStream byteArrayInputStream = this.f14727l;
        if (byteArrayInputStream != null) {
            int a11 = (int) b.a(byteArrayInputStream, outputStream);
            this.f14727l = null;
            return a11;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        v0 v0Var = this.f14725j;
        if (v0Var != null) {
            return v0Var.a();
        }
        ByteArrayInputStream byteArrayInputStream = this.f14727l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0 b() {
        v0 v0Var = this.f14725j;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("message not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1<?> e() {
        return this.f14726k;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f14725j != null) {
            this.f14727l = new ByteArrayInputStream(this.f14725j.f());
            this.f14725j = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f14727l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        v0 v0Var = this.f14725j;
        if (v0Var != null) {
            int a10 = v0Var.a();
            if (a10 == 0) {
                this.f14725j = null;
                this.f14727l = null;
                return -1;
            } else if (i11 >= a10) {
                l h02 = l.h0(bArr, i10, a10);
                this.f14725j.p(h02);
                h02.c0();
                h02.d();
                this.f14725j = null;
                this.f14727l = null;
                return a10;
            } else {
                this.f14727l = new ByteArrayInputStream(this.f14725j.f());
                this.f14725j = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f14727l;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
