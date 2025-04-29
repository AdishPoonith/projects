package o3;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import s1.u2;
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private p f14470e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f14471f;

    /* renamed from: g  reason: collision with root package name */
    private int f14472g;

    /* renamed from: h  reason: collision with root package name */
    private int f14473h;

    public j() {
        super(false);
    }

    @Override // o3.l
    public void close() {
        if (this.f14471f != null) {
            this.f14471f = null;
            r();
        }
        this.f14470e = null;
    }

    @Override // o3.l
    public Uri j() {
        p pVar = this.f14470e;
        if (pVar != null) {
            return pVar.f14512a;
        }
        return null;
    }

    @Override // o3.l
    public long m(p pVar) {
        s(pVar);
        this.f14470e = pVar;
        Uri uri = pVar.f14512a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        p3.a.b(equals, "Unsupported scheme: " + scheme);
        String[] Q0 = p3.n0.Q0(uri.getSchemeSpecificPart(), ",");
        if (Q0.length != 2) {
            throw u2.b("Unexpected URI format: " + uri, null);
        }
        String str = Q0[1];
        if (Q0[0].contains(";base64")) {
            try {
                this.f14471f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw u2.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f14471f = p3.n0.l0(URLDecoder.decode(str, b5.d.f2948a.name()));
        }
        long j10 = pVar.f14518g;
        byte[] bArr = this.f14471f;
        if (j10 > bArr.length) {
            this.f14471f = null;
            throw new m(2008);
        }
        int i10 = (int) j10;
        this.f14472g = i10;
        int length = bArr.length - i10;
        this.f14473h = length;
        long j11 = pVar.f14519h;
        if (j11 != -1) {
            this.f14473h = (int) Math.min(length, j11);
        }
        t(pVar);
        long j12 = pVar.f14519h;
        return j12 != -1 ? j12 : this.f14473h;
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f14473h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(p3.n0.j(this.f14471f), this.f14472g, bArr, i10, min);
        this.f14472g += min;
        this.f14473h -= min;
        q(min);
        return min;
    }
}
