package a6;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.iv;
import com.google.android.gms.internal.p000firebaseauthapi.wh;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f4.a f218a = new f4.a("JSONParser", new String[0]);

    static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        c4.s.f(str);
        List d10 = com.google.android.gms.internal.p000firebaseauthapi.c0.b(wh.b('.')).d(str);
        if (d10.size() < 2) {
            f218a.c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c10 = c(new String(h4.c.b((String) d10.get(1)), "UTF-8"));
            return c10 == null ? new HashMap() : c10;
        } catch (UnsupportedEncodingException e10) {
            f218a.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new iv(e10);
        }
    }

    static Map d(JSONObject jSONObject) {
        s.a aVar = new s.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
