package y6;

import android.net.Uri;
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: o  reason: collision with root package name */
    public static boolean f20515o = false;

    /* renamed from: n  reason: collision with root package name */
    private final Uri f20516n;

    public h(x6.h hVar, w5.f fVar, Uri uri) {
        super(hVar, fVar);
        f20515o = true;
        this.f20516n = uri;
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "cancel");
    }

    @Override // y6.e
    protected String e() {
        return "POST";
    }

    @Override // y6.e
    public Uri v() {
        return this.f20516n;
    }
}
