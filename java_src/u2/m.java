package u2;

import android.net.Uri;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class m implements o3.l {

    /* renamed from: a  reason: collision with root package name */
    private final o3.l f18882a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18883b;

    /* renamed from: c  reason: collision with root package name */
    private final a f18884c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f18885d;

    /* renamed from: e  reason: collision with root package name */
    private int f18886e;

    /* loaded from: classes.dex */
    public interface a {
        void a(p3.a0 a0Var);
    }

    public m(o3.l lVar, int i10, a aVar) {
        p3.a.a(i10 > 0);
        this.f18882a = lVar;
        this.f18883b = i10;
        this.f18884c = aVar;
        this.f18885d = new byte[1];
        this.f18886e = i10;
    }

    private boolean q() {
        if (this.f18882a.read(this.f18885d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f18885d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f18882a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f18884c.a(new p3.a0(bArr, i10));
        }
        return true;
    }

    @Override // o3.l
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // o3.l
    public Map<String, List<String>> e() {
        return this.f18882a.e();
    }

    @Override // o3.l
    public void h(o3.p0 p0Var) {
        p3.a.e(p0Var);
        this.f18882a.h(p0Var);
    }

    @Override // o3.l
    public Uri j() {
        return this.f18882a.j();
    }

    @Override // o3.l
    public long m(o3.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f18886e == 0) {
            if (!q()) {
                return -1;
            }
            this.f18886e = this.f18883b;
        }
        int read = this.f18882a.read(bArr, i10, Math.min(this.f18886e, i11));
        if (read != -1) {
            this.f18886e -= read;
        }
        return read;
    }
}
