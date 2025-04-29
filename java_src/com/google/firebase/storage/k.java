package com.google.firebase.storage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private String f6948a;

    /* renamed from: b  reason: collision with root package name */
    private d f6949b;

    /* renamed from: c  reason: collision with root package name */
    private l f6950c;

    /* renamed from: d  reason: collision with root package name */
    private String f6951d;

    /* renamed from: e  reason: collision with root package name */
    private String f6952e;

    /* renamed from: f  reason: collision with root package name */
    private c<String> f6953f;

    /* renamed from: g  reason: collision with root package name */
    private String f6954g;

    /* renamed from: h  reason: collision with root package name */
    private String f6955h;

    /* renamed from: i  reason: collision with root package name */
    private String f6956i;

    /* renamed from: j  reason: collision with root package name */
    private long f6957j;

    /* renamed from: k  reason: collision with root package name */
    private String f6958k;

    /* renamed from: l  reason: collision with root package name */
    private c<String> f6959l;

    /* renamed from: m  reason: collision with root package name */
    private c<String> f6960m;

    /* renamed from: n  reason: collision with root package name */
    private c<String> f6961n;

    /* renamed from: o  reason: collision with root package name */
    private c<String> f6962o;

    /* renamed from: p  reason: collision with root package name */
    private c<Map<String, String>> f6963p;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        k f6964a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6965b;

        public b() {
            this.f6964a = new k();
        }

        b(JSONObject jSONObject) {
            this.f6964a = new k();
            if (jSONObject != null) {
                c(jSONObject);
                this.f6965b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(JSONObject jSONObject, l lVar) {
            this(jSONObject);
            this.f6964a.f6950c = lVar;
        }

        private String b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        private void c(JSONObject jSONObject) {
            this.f6964a.f6952e = jSONObject.optString("generation");
            this.f6964a.f6948a = jSONObject.optString("name");
            this.f6964a.f6951d = jSONObject.optString("bucket");
            this.f6964a.f6954g = jSONObject.optString("metageneration");
            this.f6964a.f6955h = jSONObject.optString("timeCreated");
            this.f6964a.f6956i = jSONObject.optString("updated");
            this.f6964a.f6957j = jSONObject.optLong("size");
            this.f6964a.f6958k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    i(next, jSONObject2.getString(next));
                }
            }
            String b10 = b(jSONObject, "contentType");
            if (b10 != null) {
                h(b10);
            }
            String b11 = b(jSONObject, "cacheControl");
            if (b11 != null) {
                d(b11);
            }
            String b12 = b(jSONObject, "contentDisposition");
            if (b12 != null) {
                e(b12);
            }
            String b13 = b(jSONObject, "contentEncoding");
            if (b13 != null) {
                f(b13);
            }
            String b14 = b(jSONObject, "contentLanguage");
            if (b14 != null) {
                g(b14);
            }
        }

        public k a() {
            return new k(this.f6965b);
        }

        public b d(String str) {
            this.f6964a.f6959l = c.d(str);
            return this;
        }

        public b e(String str) {
            this.f6964a.f6960m = c.d(str);
            return this;
        }

        public b f(String str) {
            this.f6964a.f6961n = c.d(str);
            return this;
        }

        public b g(String str) {
            this.f6964a.f6962o = c.d(str);
            return this;
        }

        public b h(String str) {
            this.f6964a.f6953f = c.d(str);
            return this;
        }

        public b i(String str, String str2) {
            if (!this.f6964a.f6963p.b()) {
                this.f6964a.f6963p = c.d(new HashMap());
            }
            ((Map) this.f6964a.f6963p.a()).put(str, str2);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f6966a;

        /* renamed from: b  reason: collision with root package name */
        private final T f6967b;

        c(T t10, boolean z10) {
            this.f6966a = z10;
            this.f6967b = t10;
        }

        static <T> c<T> c(T t10) {
            return new c<>(t10, false);
        }

        static <T> c<T> d(T t10) {
            return new c<>(t10, true);
        }

        T a() {
            return this.f6967b;
        }

        boolean b() {
            return this.f6966a;
        }
    }

    public k() {
        this.f6948a = null;
        this.f6949b = null;
        this.f6950c = null;
        this.f6951d = null;
        this.f6952e = null;
        this.f6953f = c.c("");
        this.f6954g = null;
        this.f6955h = null;
        this.f6956i = null;
        this.f6958k = null;
        this.f6959l = c.c("");
        this.f6960m = c.c("");
        this.f6961n = c.c("");
        this.f6962o = c.c("");
        this.f6963p = c.c(Collections.emptyMap());
    }

    private k(k kVar, boolean z10) {
        this.f6948a = null;
        this.f6949b = null;
        this.f6950c = null;
        this.f6951d = null;
        this.f6952e = null;
        this.f6953f = c.c("");
        this.f6954g = null;
        this.f6955h = null;
        this.f6956i = null;
        this.f6958k = null;
        this.f6959l = c.c("");
        this.f6960m = c.c("");
        this.f6961n = c.c("");
        this.f6962o = c.c("");
        this.f6963p = c.c(Collections.emptyMap());
        c4.s.j(kVar);
        this.f6948a = kVar.f6948a;
        this.f6949b = kVar.f6949b;
        this.f6950c = kVar.f6950c;
        this.f6951d = kVar.f6951d;
        this.f6953f = kVar.f6953f;
        this.f6959l = kVar.f6959l;
        this.f6960m = kVar.f6960m;
        this.f6961n = kVar.f6961n;
        this.f6962o = kVar.f6962o;
        this.f6963p = kVar.f6963p;
        if (z10) {
            this.f6958k = kVar.f6958k;
            this.f6957j = kVar.f6957j;
            this.f6956i = kVar.f6956i;
            this.f6955h = kVar.f6955h;
            this.f6954g = kVar.f6954g;
            this.f6952e = kVar.f6952e;
        }
    }

    public String A() {
        return this.f6952e;
    }

    public String B() {
        return this.f6958k;
    }

    public String C() {
        return this.f6954g;
    }

    public String D() {
        String E = E();
        if (TextUtils.isEmpty(E)) {
            return null;
        }
        int lastIndexOf = E.lastIndexOf(47);
        return lastIndexOf != -1 ? E.substring(lastIndexOf + 1) : E;
    }

    public String E() {
        String str = this.f6948a;
        return str != null ? str : "";
    }

    public long F() {
        return this.f6957j;
    }

    public long G() {
        return x6.i.e(this.f6956i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject q() {
        HashMap hashMap = new HashMap();
        if (this.f6953f.b()) {
            hashMap.put("contentType", w());
        }
        if (this.f6963p.b()) {
            hashMap.put("metadata", new JSONObject(this.f6963p.a()));
        }
        if (this.f6959l.b()) {
            hashMap.put("cacheControl", s());
        }
        if (this.f6960m.b()) {
            hashMap.put("contentDisposition", t());
        }
        if (this.f6961n.b()) {
            hashMap.put("contentEncoding", u());
        }
        if (this.f6962o.b()) {
            hashMap.put("contentLanguage", v());
        }
        return new JSONObject(hashMap);
    }

    public String r() {
        return this.f6951d;
    }

    public String s() {
        return this.f6959l.a();
    }

    public String t() {
        return this.f6960m.a();
    }

    public String u() {
        return this.f6961n.a();
    }

    public String v() {
        return this.f6962o.a();
    }

    public String w() {
        return this.f6953f.a();
    }

    public long x() {
        return x6.i.e(this.f6955h);
    }

    public String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f6963p.a().get(str);
    }

    public Set<String> z() {
        return this.f6963p.a().keySet();
    }
}
