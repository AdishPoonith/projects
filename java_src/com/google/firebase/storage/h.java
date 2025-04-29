package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<l> f6937a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l> f6938b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6939c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<l> list, List<l> list2, String str) {
        this.f6937a = list;
        this.f6938b = list2;
        this.f6939c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(d dVar, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(dVar.o(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(dVar.o(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new h(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }

    public List<l> b() {
        return this.f6938b;
    }

    public String c() {
        return this.f6939c;
    }

    public List<l> d() {
        return this.f6937a;
    }
}
