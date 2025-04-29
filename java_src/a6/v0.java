package a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.iv;
import com.google.android.gms.internal.p000firebaseauthapi.j2;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f306a;

    /* renamed from: b  reason: collision with root package name */
    private final String f307b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f308c;

    /* renamed from: d  reason: collision with root package name */
    private final f4.a f309d;

    public v0(Context context, String str) {
        c4.s.j(context);
        String f10 = c4.s.f(str);
        this.f307b = f10;
        Context applicationContext = context.getApplicationContext();
        this.f306a = applicationContext;
        this.f308c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", f10), 0);
        this.f309d = new f4.a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[Catch: iv -> 0x017b, IllegalArgumentException -> 0x017d, ArrayIndexOutOfBoundsException -> 0x017f, JSONException -> 0x0181, TRY_ENTER, TryCatch #0 {JSONException -> 0x0181, blocks: (B:3:0x0007, B:6:0x0024, B:10:0x003a, B:12:0x0078, B:14:0x007f, B:15:0x008b, B:16:0x008c, B:18:0x009b, B:20:0x00a4, B:21:0x00a7, B:23:0x00b0, B:28:0x00cd, B:29:0x00d0, B:31:0x00d6, B:33:0x00dc, B:34:0x00e2, B:36:0x00e8, B:39:0x0103, B:41:0x010b, B:56:0x0160, B:42:0x0122, B:43:0x0129, B:47:0x0130, B:51:0x0139, B:53:0x0141, B:55:0x014d, B:57:0x0167, B:58:0x016e, B:59:0x016f, B:60:0x0176, B:61:0x0177), top: B:73:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final a6.w1 f(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.v0.f(org.json.JSONObject):a6.w1");
    }

    public final com.google.firebase.auth.a0 a() {
        String string = this.f308c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final j2 b(com.google.firebase.auth.a0 a0Var) {
        c4.s.j(a0Var);
        String string = this.f308c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.a()), null);
        if (string != null) {
            return j2.D(string);
        }
        return null;
    }

    public final void c(String str) {
        this.f308c.edit().remove(str).apply();
    }

    public final void d(com.google.firebase.auth.a0 a0Var) {
        String str;
        c4.s.j(a0Var);
        JSONObject jSONObject = new JSONObject();
        if (w1.class.isAssignableFrom(a0Var.getClass())) {
            w1 w1Var = (w1) a0Var;
            try {
                jSONObject.put("cachedTokenState", w1Var.b0());
                jSONObject.put("applicationName", w1Var.W().q());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (w1Var.j0() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List j02 = w1Var.j0();
                    int size = j02.size();
                    if (j02.size() > 30) {
                        this.f309d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(j02.size()));
                        size = 30;
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        jSONArray.put(((s1) j02.get(i10)).B());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", w1Var.H());
                jSONObject.put("version", "2");
                if (w1Var.D() != null) {
                    jSONObject.put("userMetadata", ((y1) w1Var.D()).a());
                }
                List<com.google.firebase.auth.j0> b10 = new f(w1Var).b();
                if (!b10.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i11 = 0; i11 < b10.size(); i11++) {
                        jSONArray2.put(b10.get(i11).D());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e10) {
                this.f309d.i("Failed to turn object into JSON", e10, new Object[0]);
                throw new iv(e10);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f308c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
    }

    public final void e(com.google.firebase.auth.a0 a0Var, j2 j2Var) {
        c4.s.j(a0Var);
        c4.s.j(j2Var);
        this.f308c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.a()), j2Var.H()).apply();
    }
}
