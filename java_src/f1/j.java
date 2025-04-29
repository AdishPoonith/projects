package f1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.v;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8455g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private static j f8456h;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f8457a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f8458b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, Set<Integer>> f8459c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8460d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8461e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8462f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final j c() {
            HashMap e10;
            HashMap e11;
            e10 = t9.g0.e(s9.q.a(2, null), s9.q.a(4, null), s9.q.a(9, null), s9.q.a(17, null), s9.q.a(341, null));
            e11 = t9.g0.e(s9.q.a(102, null), s9.q.a(190, null), s9.q.a(412, null));
            return new j(null, e10, e11, null, null, null);
        }

        private final Map<Integer, Set<Integer>> d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int optInt2 = optJSONArray2.optInt(i12);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return hashMap;
        }

        public final j a(JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            boolean l10;
            boolean l11;
            boolean l12;
            if (jSONArray == null) {
                return null;
            }
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        l10 = ka.p.l(optString, "other", true);
                        if (l10) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = d(optJSONObject);
                        } else {
                            l11 = ka.p.l(optString, "transient", true);
                            if (l11) {
                                str5 = optJSONObject.optString("recovery_message", null);
                                map5 = d(optJSONObject);
                            } else {
                                l12 = ka.p.l(optString, "login_recoverable", true);
                                if (l12) {
                                    str6 = optJSONObject.optString("recovery_message", null);
                                    map6 = d(optJSONObject);
                                }
                            }
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new j(map, map2, map3, str, str2, str3);
        }

        public final synchronized j b() {
            j jVar;
            if (j.f8456h == null) {
                j.f8456h = c();
            }
            jVar = j.f8456h;
            if (jVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return jVar;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8463a;

        static {
            int[] iArr = new int[v.a.valuesCustom().length];
            iArr[v.a.OTHER.ordinal()] = 1;
            iArr[v.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[v.a.TRANSIENT.ordinal()] = 3;
            f8463a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f8457a = map;
        this.f8458b = map2;
        this.f8459c = map3;
        this.f8460d = str;
        this.f8461e = str2;
        this.f8462f = str3;
    }

    public final v.a c(int i10, int i11, boolean z10) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z10) {
            return v.a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f8457a;
        if (map != null && map.containsKey(Integer.valueOf(i10)) && ((set3 = this.f8457a.get(Integer.valueOf(i10))) == null || set3.contains(Integer.valueOf(i11)))) {
            return v.a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f8459c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i10)) && ((set2 = this.f8459c.get(Integer.valueOf(i10))) == null || set2.contains(Integer.valueOf(i11)))) {
            return v.a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f8458b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i10)) && ((set = this.f8458b.get(Integer.valueOf(i10))) == null || set.contains(Integer.valueOf(i11)))) ? v.a.TRANSIENT : v.a.OTHER;
    }

    public final String d(v.a aVar) {
        int i10 = aVar == null ? -1 : b.f8463a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return this.f8461e;
            }
            return this.f8462f;
        }
        return this.f8460d;
    }
}
