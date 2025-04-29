package y6;

import android.net.Uri;
/* loaded from: classes.dex */
public class i extends f {

    /* renamed from: n  reason: collision with root package name */
    private final Uri f20517n;

    public i(x6.h hVar, w5.f fVar, Uri uri) {
        super(hVar, fVar);
        this.f20517n = uri;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "query");
    }

    @Override // y6.e
    protected String e() {
        return "POST";
    }

    @Override // y6.e
    public Uri v() {
        return this.f20517n;
    }
}
