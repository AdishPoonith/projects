package y6;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: n  reason: collision with root package name */
    private final Integer f20495n;

    /* renamed from: o  reason: collision with root package name */
    private final String f20496o;

    public d(x6.h hVar, w5.f fVar, Integer num, String str) {
        super(hVar, fVar);
        this.f20495n = num;
        this.f20496o = str;
    }

    @Override // y6.e
    protected String e() {
        return "GET";
    }

    @Override // y6.e
    protected Map<String, String> m() {
        HashMap hashMap = new HashMap();
        String k10 = k();
        if (!k10.isEmpty()) {
            hashMap.put("prefix", k10 + "/");
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f20495n;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        if (!TextUtils.isEmpty(this.f20496o)) {
            hashMap.put("pageToken", this.f20496o);
        }
        return hashMap;
    }

    @Override // y6.e
    public Uri v() {
        String authority = t().a().getAuthority();
        return Uri.parse(t().b() + "/b/" + authority + "/o");
    }
}
