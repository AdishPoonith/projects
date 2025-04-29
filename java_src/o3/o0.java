package o3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f14508a;

    /* renamed from: b  reason: collision with root package name */
    private long f14509b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f14510c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f14511d = Collections.emptyMap();

    public o0(l lVar) {
        this.f14508a = (l) p3.a.e(lVar);
    }

    @Override // o3.l
    public void close() {
        this.f14508a.close();
    }

    @Override // o3.l
    public Map<String, List<String>> e() {
        return this.f14508a.e();
    }

    @Override // o3.l
    public void h(p0 p0Var) {
        p3.a.e(p0Var);
        this.f14508a.h(p0Var);
    }

    @Override // o3.l
    public Uri j() {
        return this.f14508a.j();
    }

    @Override // o3.l
    public long m(p pVar) {
        this.f14510c = pVar.f14512a;
        this.f14511d = Collections.emptyMap();
        long m10 = this.f14508a.m(pVar);
        this.f14510c = (Uri) p3.a.e(j());
        this.f14511d = e();
        return m10;
    }

    public long q() {
        return this.f14509b;
    }

    public Uri r() {
        return this.f14510c;
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f14508a.read(bArr, i10, i11);
        if (read != -1) {
            this.f14509b += read;
        }
        return read;
    }

    public Map<String, List<String>> s() {
        return this.f14511d;
    }

    public void t() {
        this.f14509b = 0L;
    }
}
