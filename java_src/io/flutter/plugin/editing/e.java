package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f10386a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f10387b;

    /* renamed from: c  reason: collision with root package name */
    private int f10388c;

    /* renamed from: d  reason: collision with root package name */
    private int f10389d;

    /* renamed from: e  reason: collision with root package name */
    private int f10390e;

    /* renamed from: f  reason: collision with root package name */
    private int f10391f;

    /* renamed from: g  reason: collision with root package name */
    private int f10392g;

    /* renamed from: h  reason: collision with root package name */
    private int f10393h;

    public e(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.f10390e = i10;
        this.f10391f = i11;
        this.f10392g = i12;
        this.f10393h = i13;
        a(charSequence, "", -1, -1);
    }

    public e(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.f10390e = i12;
        this.f10391f = i13;
        this.f10392g = i14;
        this.f10393h = i15;
        a(charSequence, charSequence2.toString(), i10, i11);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.f10386a = charSequence;
        this.f10387b = charSequence2;
        this.f10388c = i10;
        this.f10389d = i11;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f10386a.toString());
            jSONObject.put("deltaText", this.f10387b.toString());
            jSONObject.put("deltaStart", this.f10388c);
            jSONObject.put("deltaEnd", this.f10389d);
            jSONObject.put("selectionBase", this.f10390e);
            jSONObject.put("selectionExtent", this.f10391f);
            jSONObject.put("composingBase", this.f10392g);
            jSONObject.put("composingExtent", this.f10393h);
        } catch (JSONException e10) {
            d8.b.b("TextEditingDelta", "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }
}
