package y6;

import android.net.Uri;
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: n  reason: collision with root package name */
    private final Uri f20510n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f20511o;

    /* renamed from: p  reason: collision with root package name */
    private final long f20512p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f20513q;

    /* renamed from: r  reason: collision with root package name */
    private final int f20514r;

    public g(x6.h hVar, w5.f fVar, Uri uri, byte[] bArr, long j10, int i10, boolean z10) {
        super(hVar, fVar);
        if (bArr == null && i10 != -1) {
            this.f20500a = new IllegalArgumentException("contentType is null or empty");
        }
        if (j10 < 0) {
            this.f20500a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f20514r = i10;
        this.f20510n = uri;
        this.f20511o = i10 <= 0 ? null : bArr;
        this.f20512p = j10;
        this.f20513q = z10;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", (!z10 || i10 <= 0) ? z10 ? "finalize" : "upload" : "upload, finalize");
        super.H("X-Goog-Upload-Offset", Long.toString(j10));
    }

    @Override // y6.e
    protected String e() {
        return "POST";
    }

    @Override // y6.e
    protected byte[] i() {
        return this.f20511o;
    }

    @Override // y6.e
    protected int j() {
        int i10 = this.f20514r;
        if (i10 > 0) {
            return i10;
        }
        return 0;
    }

    @Override // y6.e
    public Uri v() {
        return this.f20510n;
    }
}
