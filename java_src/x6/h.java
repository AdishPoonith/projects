package x6;

import android.net.Uri;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f20256a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f20257b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f20258c;

    public h(Uri uri, f6.a aVar) {
        Uri parse;
        this.f20258c = uri;
        if (aVar == null) {
            parse = y6.e.f20497k;
        } else {
            parse = Uri.parse("http://" + aVar.a() + ":" + aVar.b() + "/v0");
        }
        this.f20256a = parse;
        Uri.Builder appendEncodedPath = parse.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String a10 = d.a(uri.getPath());
        if (a10.length() > 0 && !"/".equals(a10)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(a10);
        }
        this.f20257b = appendEncodedPath.build();
    }

    public Uri a() {
        return this.f20258c;
    }

    public Uri b() {
        return this.f20256a;
    }

    public Uri c() {
        return this.f20257b;
    }
}
