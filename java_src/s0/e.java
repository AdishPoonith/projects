package s0;

import f1.c0;
import f1.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.r0;
import s0.a;
import s9.q;
import s9.u;
import t9.g0;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f16884a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<s0.b, c> f16885b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<m, b> f16886c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, j> f16887d;

    /* loaded from: classes.dex */
    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");
        

        /* renamed from: k  reason: collision with root package name */
        public static final C0251a f16888k = new C0251a(null);

        /* renamed from: j  reason: collision with root package name */
        private final String f16893j;

        /* renamed from: s0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0251a {
            private C0251a() {
            }

            public /* synthetic */ C0251a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(String rawValue) {
                a[] valuesCustom;
                kotlin.jvm.internal.l.e(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (kotlin.jvm.internal.l.a(aVar.g(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        a(String str) {
            this.f16893j = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String g() {
            return this.f16893j;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private k f16894a;

        /* renamed from: b  reason: collision with root package name */
        private i f16895b;

        public b(k kVar, i field) {
            kotlin.jvm.internal.l.e(field, "field");
            this.f16894a = kVar;
            this.f16895b = field;
        }

        public final i a() {
            return this.f16895b;
        }

        public final k b() {
            return this.f16894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f16894a == bVar.f16894a && this.f16895b == bVar.f16895b;
            }
            return false;
        }

        public int hashCode() {
            k kVar = this.f16894a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f16895b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f16894a + ", field=" + this.f16895b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private k f16896a;

        /* renamed from: b  reason: collision with root package name */
        private l f16897b;

        public c(k section, l lVar) {
            kotlin.jvm.internal.l.e(section, "section");
            this.f16896a = section;
            this.f16897b = lVar;
        }

        public final l a() {
            return this.f16897b;
        }

        public final k b() {
            return this.f16896a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f16896a == cVar.f16896a && this.f16897b == cVar.f16897b;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f16896a.hashCode() * 31;
            l lVar = this.f16897b;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f16896a + ", field=" + this.f16897b + ')';
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        ARRAY,
        BOOL,
        INT;
        

        /* renamed from: j  reason: collision with root package name */
        public static final a f16898j = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final d a(String rawValue) {
                kotlin.jvm.internal.l.e(rawValue, "rawValue");
                if (kotlin.jvm.internal.l.a(rawValue, s0.b.EXT_INFO.g()) || kotlin.jvm.internal.l.a(rawValue, s0.b.URL_SCHEMES.g()) || kotlin.jvm.internal.l.a(rawValue, m.CONTENT_IDS.g()) || kotlin.jvm.internal.l.a(rawValue, m.CONTENTS.g()) || kotlin.jvm.internal.l.a(rawValue, a.OPTIONS.g())) {
                    return d.ARRAY;
                }
                if (kotlin.jvm.internal.l.a(rawValue, s0.b.ADV_TE.g()) || kotlin.jvm.internal.l.a(rawValue, s0.b.APP_TE.g())) {
                    return d.BOOL;
                }
                if (kotlin.jvm.internal.l.a(rawValue, m.EVENT_TIME.g())) {
                    return d.INT;
                }
                return null;
            }
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: s0.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0252e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16903a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16904b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f16905c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f16903a = iArr;
            int[] iArr2 = new int[k.valuesCustom().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            f16904b = iArr2;
            int[] iArr3 = new int[s0.a.valuesCustom().length];
            iArr3[s0.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[s0.a.CUSTOM.ordinal()] = 2;
            f16905c = iArr3;
        }
    }

    static {
        Map<s0.b, c> f10;
        Map<m, b> f11;
        Map<String, j> f12;
        s0.b bVar = s0.b.ANON_ID;
        k kVar = k.USER_DATA;
        s0.b bVar2 = s0.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f10 = g0.f(q.a(bVar, new c(kVar, l.ANON_ID)), q.a(s0.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID)), q.a(s0.b.ADVERTISER_ID, new c(kVar, l.MAD_ID)), q.a(s0.b.PAGE_ID, new c(kVar, l.PAGE_ID)), q.a(s0.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID)), q.a(bVar2, new c(kVar2, l.ADV_TE)), q.a(s0.b.APP_TE, new c(kVar2, l.APP_TE)), q.a(s0.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), q.a(s0.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), q.a(s0.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), q.a(s0.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), q.a(s0.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), q.a(s0.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), q.a(s0.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), q.a(s0.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), q.a(s0.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), q.a(s0.b.USER_DATA, new c(kVar, null)));
        f16885b = f10;
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f11 = g0.f(q.a(m.EVENT_TIME, new b(null, i.EVENT_TIME)), q.a(m.EVENT_NAME, new b(null, i.EVENT_NAME)), q.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), q.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), q.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), q.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), q.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), q.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), q.a(m.LEVEL, new b(kVar3, i.LEVEL)), q.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), q.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), q.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), q.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), q.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), q.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), q.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), q.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f16886c = f11;
        f12 = g0.f(q.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), q.a("fb_mobile_activate_app", j.ACTIVATED_APP), q.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), q.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), q.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), q.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), q.a("fb_mobile_content_view", j.VIEWED_CONTENT), q.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), q.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), q.a("fb_mobile_purchase", j.PURCHASED), q.a("fb_mobile_rate", j.RATED), q.a("fb_mobile_search", j.SEARCHED), q.a("fb_mobile_spent_credits", j.SPENT_CREDITS), q.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
        f16887d = f12;
    }

    private e() {
    }

    private final List<Map<String, Object>> b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll((Map) it.next());
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private final List<Map<String, Object>> c(Map<String, ? extends Object> map, Object obj) {
        List<Map<String, Object>> b10;
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.g(), n.MOBILE_APP_INSTALL.g());
        linkedHashMap.put(i.EVENT_TIME.g(), obj);
        b10 = t9.o.b(linkedHashMap);
        return b10;
    }

    private final s0.a f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(n.EVENT.g());
        a.C0250a c0250a = s0.a.f16858j;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        s0.a a10 = c0250a.a((String) obj);
        if (a10 == s0.a.OTHER) {
            return a10;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            s0.b a11 = s0.b.f16863k.a(key);
            if (a11 != null) {
                f16884a.g(map2, map3, a11, value);
            } else {
                boolean a12 = kotlin.jvm.internal.l.a(key, k.CUSTOM_EVENTS.g());
                boolean z10 = value instanceof String;
                if (a10 == s0.a.CUSTOM && a12 && z10) {
                    ArrayList<Map<String, Object>> k10 = k((String) value);
                    if (k10 != null) {
                        arrayList.addAll(k10);
                    }
                } else if (a.f16888k.a(key) != null) {
                    map4.put(key, value);
                }
            }
        }
        return a10;
    }

    private final void h(Map<String, Object> map, s0.b bVar, Object obj) {
        c cVar = f16885b.get(bVar);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.g(), obj);
    }

    private final void i(Map<String, Object> map, s0.b bVar, Object obj) {
        if (bVar == s0.b.USER_DATA) {
            try {
                l0 l0Var = l0.f8470a;
                map.putAll(l0.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e10) {
                c0.f8388e.c(r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e10);
                return;
            }
        }
        c cVar = f16885b.get(bVar);
        l a10 = cVar == null ? null : cVar.a();
        if (a10 == null) {
            return;
        }
        map.put(a10.g(), obj);
    }

    private final String j(String str) {
        Map<String, j> map = f16887d;
        if (map.containsKey(str)) {
            j jVar = map.get(str);
            return jVar == null ? "" : jVar.g();
        }
        return str;
    }

    public static final ArrayList<Map<String, Object>> k(String appEvents) {
        String b10;
        Object l10;
        kotlin.jvm.internal.l.e(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            l0 l0Var = l0.f8470a;
            for (String str : l0.m(new JSONArray(appEvents))) {
                l0 l0Var2 = l0.f8470a;
                arrayList.add(l0.n(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a10 = m.f16975k.a(str2);
                    b bVar = f16886c.get(a10);
                    if (a10 != null && bVar != null) {
                        k b11 = bVar.b();
                        if (b11 == null) {
                            try {
                                String g10 = bVar.a().g();
                                if (a10 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f16884a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    l10 = eVar.j((String) obj);
                                } else if (a10 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    l10 = l(str2, obj2);
                                    if (l10 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                linkedHashMap2.put(g10, l10);
                            } catch (ClassCastException e10) {
                                c0.a aVar = c0.f8388e;
                                r0 r0Var = r0.APP_EVENTS;
                                b10 = s9.b.b(e10);
                                aVar.c(r0Var, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", b10);
                            }
                        } else if (b11 == k.CUSTOM_DATA) {
                            String g11 = bVar.a().g();
                            Object obj3 = map.get(str2);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object l11 = l(str2, obj3);
                            Objects.requireNonNull(l11, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(g11, l11);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.g(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e11) {
            c0.f8388e.c(r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e11);
            return null;
        }
    }

    public static final Object l(String field, Object value) {
        String str;
        Object m10;
        Integer f10;
        Integer f11;
        kotlin.jvm.internal.l.e(field, "field");
        kotlin.jvm.internal.l.e(value, "value");
        d a10 = d.f16898j.a(field);
        String str2 = value instanceof String ? (String) value : null;
        if (a10 == null || str2 == null) {
            return value;
        }
        int i10 = C0252e.f16903a[a10.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    f11 = ka.o.f(value.toString());
                    return f11;
                }
                throw new s9.l();
            }
            f10 = ka.o.f(str2);
            if (f10 != null) {
                return Boolean.valueOf(f10.intValue() != 0);
            }
            return null;
        }
        try {
            l0 l0Var = l0.f8470a;
            List<String> m11 = l0.m(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (String str3 : m11) {
                try {
                    try {
                        l0 l0Var2 = l0.f8470a;
                        m10 = l0.n(new JSONObject(str3));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    l0 l0Var3 = l0.f8470a;
                    m10 = l0.m(new JSONArray(str));
                }
                arrayList.add(m10);
            }
            return arrayList;
        } catch (JSONException e10) {
            c0.f8388e.c(r0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e10);
            return u.f17878a;
        }
    }

    public final List<Map<String, Object>> a(s0.a eventType, Map<String, Object> userData, Map<String, Object> appData, Map<String, Object> restOfData, List<? extends Map<String, ? extends Object>> customEvents, Object obj) {
        kotlin.jvm.internal.l.e(eventType, "eventType");
        kotlin.jvm.internal.l.e(userData, "userData");
        kotlin.jvm.internal.l.e(appData, "appData");
        kotlin.jvm.internal.l.e(restOfData, "restOfData");
        kotlin.jvm.internal.l.e(customEvents, "customEvents");
        Map<String, Object> d10 = d(userData, appData, restOfData);
        int i10 = C0252e.f16905c[eventType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return b(d10, customEvents);
        }
        return c(d10, obj);
    }

    public final Map<String, Object> d(Map<String, ? extends Object> userData, Map<String, ? extends Object> appData, Map<String, ? extends Object> restOfData) {
        kotlin.jvm.internal.l.e(userData, "userData");
        kotlin.jvm.internal.l.e(appData, "appData");
        kotlin.jvm.internal.l.e(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.g(), n.APP.g());
        linkedHashMap.put(k.USER_DATA.g(), userData);
        linkedHashMap.put(k.APP_DATA.g(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List<Map<String, Object>> e(Map<String, ? extends Object> parameters) {
        kotlin.jvm.internal.l.e(parameters, "parameters");
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        Map<String, Object> linkedHashMap2 = new LinkedHashMap<>();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        Map<String, Object> linkedHashMap3 = new LinkedHashMap<>();
        s0.a f10 = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f10 == s0.a.OTHER) {
            return null;
        }
        return a(f10, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.g()));
    }

    public final void g(Map<String, Object> userData, Map<String, Object> appData, s0.b field, Object value) {
        kotlin.jvm.internal.l.e(userData, "userData");
        kotlin.jvm.internal.l.e(appData, "appData");
        kotlin.jvm.internal.l.e(field, "field");
        kotlin.jvm.internal.l.e(value, "value");
        c cVar = f16885b.get(field);
        if (cVar == null) {
            return;
        }
        int i10 = C0252e.f16904b[cVar.b().ordinal()];
        if (i10 == 1) {
            h(appData, field, value);
        } else if (i10 != 2) {
        } else {
            i(userData, field, value);
        }
    }
}
