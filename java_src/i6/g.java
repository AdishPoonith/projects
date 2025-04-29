package i6;

import android.util.Base64;
import com.google.protobuf.e1;
import com.google.protobuf.t1;
import d7.b;
import d7.b0;
import d7.s;
import j6.a1;
import j6.b1;
import j6.q;
import j6.r;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import m6.l;
import m6.t;
import m6.u;
import m6.w;
import m6.y;
import org.json.JSONArray;
import org.json.JSONObject;
import p6.l0;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f9743a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f9744b;

    public g(l0 l0Var) {
        this.f9744b = l0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f9743a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void A(List<r> list, JSONObject jSONObject) {
        q.b bVar;
        b0 b0Var;
        m6.r j10 = j(jSONObject.getJSONObject("field"));
        String string = jSONObject.getString("op");
        string.hashCode();
        char c10 = 65535;
        switch (string.hashCode()) {
            case -2125479834:
                if (string.equals("IS_NAN")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1465346180:
                if (string.equals("IS_NULL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -244195494:
                if (string.equals("IS_NOT_NAN")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1019893512:
                if (string.equals("IS_NOT_NULL")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar = q.b.EQUAL;
                b0Var = y.f13848a;
                list.add(q.f(j10, bVar, b0Var));
                return;
            case 1:
                bVar = q.b.EQUAL;
                b0Var = y.f13849b;
                list.add(q.f(j10, bVar, b0Var));
                return;
            case 2:
                bVar = q.b.NOT_EQUAL;
                b0Var = y.f13848a;
                list.add(q.f(j10, bVar, b0Var));
                return;
            case 3:
                bVar = q.b.NOT_EQUAL;
                b0Var = y.f13849b;
                list.add(q.f(j10, bVar, b0Var));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    private b0 B(JSONObject jSONObject) {
        b0.b C0 = b0.C0();
        if (jSONObject.has("nullValue")) {
            C0.R(e1.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            C0.K(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            C0.O(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            C0.M(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            y(C0, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            C0.T(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            C0.L(com.google.protobuf.i.u(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            C0.S(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            l(C0, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            a(C0, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else if (!jSONObject.has("mapValue")) {
            throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
        } else {
            o(C0, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return C0.b();
    }

    private List<r> C(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            k(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int D(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            i10 *= 10;
            if (i11 < str.length()) {
                if (str.charAt(i11) < '0' || str.charAt(i11) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                i10 += str.charAt(i11) - '0';
            }
        }
        return i10;
    }

    private void E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void F(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    private void a(b0.b bVar, JSONArray jSONArray) {
        b.C0121b o02 = d7.b.o0();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                o02.I(B(jSONArray.getJSONObject(i10)));
            }
        }
        bVar.I(o02);
    }

    private i d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        G(jSONObject2);
        u p10 = p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        boolean optBoolean = jSONObject3.optBoolean("allDescendants", false);
        String string = jSONObject3.getString("collectionId");
        if (!optBoolean) {
            p10 = p10.b(string);
            string = null;
        }
        List<r> C = C(jSONObject2.optJSONObject("where"));
        List<a1> r10 = r(jSONObject2.optJSONArray("orderBy"));
        j6.i u10 = u(jSONObject2.optJSONObject("startAt"));
        j6.i g10 = g(jSONObject2.optJSONObject("endAt"));
        F(jSONObject2);
        int m10 = m(jSONObject2);
        return new i(new b1(p10, string, C, r10, m10, b1.a.LIMIT_TO_FIRST, u10, g10).D(), n(jSONObject));
    }

    private void e(List<r> list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                k(list, optJSONArray.getJSONObject(i10));
            }
        }
    }

    private j6.i g(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new j6.i(s(jSONObject), !jSONObject.optBoolean("before", false));
        }
        return null;
    }

    private void h(List<r> list, JSONObject jSONObject) {
        list.add(q.f(j(jSONObject.getJSONObject("field")), i(jSONObject.getString("op")), B(jSONObject.getJSONObject("value"))));
    }

    private q.b i(String str) {
        return q.b.valueOf(str);
    }

    private m6.r j(JSONObject jSONObject) {
        return m6.r.v(jSONObject.getString("fieldPath"));
    }

    private void k(List<r> list, JSONObject jSONObject) {
        if (jSONObject.has("compositeFilter")) {
            e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void l(b0.b bVar, JSONObject jSONObject) {
        bVar.N(h7.a.k0().H(jSONObject.optDouble("latitude")).I(jSONObject.optDouble("longitude")));
    }

    private int m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        return optJSONObject != null ? optJSONObject.optInt("value", -1) : jSONObject.optInt("limit", -1);
    }

    private b1.a n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return b1.a.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return b1.a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    private void o(b0.b bVar, JSONObject jSONObject) {
        s.b o02 = s.o0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                o02.J(next, B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.P(o02);
    }

    private u p(String str) {
        u v10 = u.v(str);
        if (this.f9744b.c0(v10)) {
            return v10.r(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List<a1> r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                arrayList.add(a1.d(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? a1.a.ASCENDING : a1.a.DESCENDING, j(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List<b0> s(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(B(optJSONArray.getJSONObject(i10)));
            }
        }
        return arrayList;
    }

    private w t(Object obj) {
        return new w(v(obj));
    }

    private j6.i u(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new j6.i(s(jSONObject), jSONObject.optBoolean("before", false));
        }
        return null;
    }

    private w5.q v(Object obj) {
        if (obj instanceof String) {
            return w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private w5.q w(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            int i10 = 0;
            String substring = str.substring(0, indexOf2);
            String str2 = "";
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            }
            long time = this.f9743a.parse(substring).getTime() / 1000;
            if (!str2.isEmpty()) {
                i10 = D(str2);
            }
            if (str.charAt(indexOf2) != 'Z') {
                long z10 = z(str.substring(indexOf2 + 1));
                time = str.charAt(indexOf2) == '+' ? time - z10 : time + z10;
            } else if (str.length() != indexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
            }
            return new w5.q(time, i10);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private w5.q x(JSONObject jSONObject) {
        return new w5.q(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private void y(b0.b bVar, Object obj) {
        w5.q v10 = v(obj);
        bVar.U(t1.k0().I(v10.l()).H(v10.k()));
    }

    private static long z(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    public e b(JSONObject jSONObject) {
        return new e(jSONObject.getString("id"), jSONObject.getInt("version"), t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public h c(JSONObject jSONObject) {
        l l10 = l.l(p(jSONObject.getString("name")));
        w t10 = t(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
        return new h(l10, t10, optBoolean, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f(JSONObject jSONObject) {
        l l10 = l.l(p(jSONObject.getString("name")));
        w t10 = t(jSONObject.get("updateTime"));
        b0.b C0 = b0.C0();
        o(C0, jSONObject.getJSONObject("fields"));
        return new b(m6.s.p(l10, t10, t.i(C0.H().i0())));
    }

    public j q(JSONObject jSONObject) {
        return new j(jSONObject.getString("name"), d(jSONObject.getJSONObject("bundledQuery")), t(jSONObject.get("readTime")));
    }
}
