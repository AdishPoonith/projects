package y6;

import org.json.JSONObject;
/* loaded from: classes.dex */
public class k extends e {

    /* renamed from: n  reason: collision with root package name */
    private final JSONObject f20520n;

    public k(x6.h hVar, w5.f fVar, JSONObject jSONObject) {
        super(hVar, fVar);
        this.f20520n = jSONObject;
        H("X-HTTP-Method-Override", "PATCH");
    }

    @Override // y6.e
    protected String e() {
        return "PUT";
    }

    @Override // y6.e
    protected JSONObject h() {
        return this.f20520n;
    }
}
