package y6;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class j extends f {

    /* renamed from: n  reason: collision with root package name */
    private final JSONObject f20518n;

    /* renamed from: o  reason: collision with root package name */
    private final String f20519o;

    public j(x6.h hVar, w5.f fVar, JSONObject jSONObject, String str) {
        super(hVar, fVar);
        this.f20518n = jSONObject;
        this.f20519o = str;
        if (TextUtils.isEmpty(str)) {
            this.f20500a = new IllegalArgumentException("mContentType is null or empty");
        }
        super.H("X-Goog-Upload-Protocol", "resumable");
        super.H("X-Goog-Upload-Command", "start");
        super.H("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // y6.e
    protected String e() {
        return "POST";
    }

    @Override // y6.e
    protected JSONObject h() {
        return this.f20518n;
    }

    @Override // y6.e
    protected Map<String, String> m() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", k());
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // y6.e
    public Uri v() {
        String authority = t().a().getAuthority();
        Uri.Builder buildUpon = t().b().buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
