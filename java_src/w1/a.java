package w1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return p3.n0.f15397a >= 27 ? bArr : p3.n0.l0(c(p3.n0.D(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (p3.n0.f15397a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(p3.n0.D(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb.append("{\"k\":\"");
                sb.append(d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return p3.n0.l0(sb.toString());
        } catch (JSONException e10) {
            p3.r.d("ClearKeyUtil", "Failed to adjust response data: " + p3.n0.D(bArr), e10);
            return bArr;
        }
    }

    private static String c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
