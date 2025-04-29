package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2  reason: invalid package */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a  reason: collision with root package name */
    private final List f5164a;

    public p2() {
        this.f5164a = new ArrayList();
    }

    public p2(List list) {
        this.f5164a = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static p2 a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new p2(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new o2() : new o2(l.a(jSONObject.optString("federatedId", null)), l.a(jSONObject.optString("displayName", null)), l.a(jSONObject.optString("photoUrl", null)), l.a(jSONObject.optString("providerId", null)), null, l.a(jSONObject.optString("phoneNumber", null)), l.a(jSONObject.optString("email", null))));
        }
        return new p2(arrayList);
    }

    public static p2 b(p2 p2Var) {
        List list = p2Var.f5164a;
        p2 p2Var2 = new p2();
        if (list != null) {
            p2Var2.f5164a.addAll(list);
        }
        return p2Var2;
    }

    public final List c() {
        return this.f5164a;
    }
}
