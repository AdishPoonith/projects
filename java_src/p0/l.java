package p0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l implements Parcelable {
    private final Map<String, String> A;
    private final String B;
    private final String C;

    /* renamed from: j  reason: collision with root package name */
    private final String f14949j;

    /* renamed from: k  reason: collision with root package name */
    private final String f14950k;

    /* renamed from: l  reason: collision with root package name */
    private final String f14951l;

    /* renamed from: m  reason: collision with root package name */
    private final String f14952m;

    /* renamed from: n  reason: collision with root package name */
    private final long f14953n;

    /* renamed from: o  reason: collision with root package name */
    private final long f14954o;

    /* renamed from: p  reason: collision with root package name */
    private final String f14955p;

    /* renamed from: q  reason: collision with root package name */
    private final String f14956q;

    /* renamed from: r  reason: collision with root package name */
    private final String f14957r;

    /* renamed from: s  reason: collision with root package name */
    private final String f14958s;

    /* renamed from: t  reason: collision with root package name */
    private final String f14959t;

    /* renamed from: u  reason: collision with root package name */
    private final String f14960u;

    /* renamed from: v  reason: collision with root package name */
    private final String f14961v;

    /* renamed from: w  reason: collision with root package name */
    private final Set<String> f14962w;

    /* renamed from: x  reason: collision with root package name */
    private final String f14963x;

    /* renamed from: y  reason: collision with root package name */
    private final Map<String, Integer> f14964y;

    /* renamed from: z  reason: collision with root package name */
    private final Map<String, String> f14965z;
    public static final b D = new b(null);
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new l(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(JSONObject jSONObject, String name) {
            kotlin.jvm.internal.l.e(jSONObject, "<this>");
            kotlin.jvm.internal.l.e(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    public l(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        String readString = parcel.readString();
        f1.m0 m0Var = f1.m0.f8479a;
        this.f14949j = f1.m0.k(readString, "jti");
        this.f14950k = f1.m0.k(parcel.readString(), "iss");
        this.f14951l = f1.m0.k(parcel.readString(), "aud");
        this.f14952m = f1.m0.k(parcel.readString(), "nonce");
        this.f14953n = parcel.readLong();
        this.f14954o = parcel.readLong();
        this.f14955p = f1.m0.k(parcel.readString(), "sub");
        this.f14956q = parcel.readString();
        this.f14957r = parcel.readString();
        this.f14958s = parcel.readString();
        this.f14959t = parcel.readString();
        this.f14960u = parcel.readString();
        this.f14961v = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f14962w = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f14963x = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(kotlin.jvm.internal.k.f12852a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f14964y = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        HashMap readHashMap2 = parcel.readHashMap(vVar.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f14965z = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(vVar.getClass().getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.A = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.B = parcel.readString();
        this.C = parcel.readString();
    }

    public l(String encodedClaims, String expectedNonce) {
        Set<String> unmodifiableSet;
        Map<String, Integer> unmodifiableMap;
        Map<String, String> unmodifiableMap2;
        kotlin.jvm.internal.l.e(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.l.e(expectedNonce, "expectedNonce");
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.g(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.l.d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, ka.d.f12805b));
        if (!a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        kotlin.jvm.internal.l.d(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f14949j = string;
        String string2 = jSONObject.getString("iss");
        kotlin.jvm.internal.l.d(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f14950k = string2;
        String string3 = jSONObject.getString("aud");
        kotlin.jvm.internal.l.d(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f14951l = string3;
        String string4 = jSONObject.getString("nonce");
        kotlin.jvm.internal.l.d(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f14952m = string4;
        this.f14953n = jSONObject.getLong("exp");
        this.f14954o = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        kotlin.jvm.internal.l.d(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f14955p = string5;
        b bVar = D;
        this.f14956q = bVar.a(jSONObject, "name");
        this.f14957r = bVar.a(jSONObject, "given_name");
        this.f14958s = bVar.a(jSONObject, "middle_name");
        this.f14959t = bVar.a(jSONObject, "family_name");
        this.f14960u = bVar.a(jSONObject, "email");
        this.f14961v = bVar.a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        Map<String, String> map = null;
        if (optJSONArray == null) {
            unmodifiableSet = null;
        } else {
            f1.l0 l0Var = f1.l0.f8470a;
            unmodifiableSet = Collections.unmodifiableSet(f1.l0.a0(optJSONArray));
        }
        this.f14962w = unmodifiableSet;
        this.f14963x = bVar.a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        if (optJSONObject == null) {
            unmodifiableMap = null;
        } else {
            f1.l0 l0Var2 = f1.l0.f8470a;
            unmodifiableMap = Collections.unmodifiableMap(f1.l0.n(optJSONObject));
        }
        this.f14964y = unmodifiableMap;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        if (optJSONObject2 == null) {
            unmodifiableMap2 = null;
        } else {
            f1.l0 l0Var3 = f1.l0.f8470a;
            unmodifiableMap2 = Collections.unmodifiableMap(f1.l0.o(optJSONObject2));
        }
        this.f14965z = unmodifiableMap2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        if (optJSONObject3 != null) {
            f1.l0 l0Var4 = f1.l0.f8470a;
            map = Collections.unmodifiableMap(f1.l0.o(optJSONObject3));
        }
        this.A = map;
        this.B = bVar.a(jSONObject, "user_gender");
        this.C = bVar.a(jSONObject, "user_link");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (kotlin.jvm.internal.l.a(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean a(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "iss"
            r1 = 0
            if (r9 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "jti"
            java.lang.String r3 = r9.optString(r2)
            kotlin.jvm.internal.l.d(r3, r2)
            int r2 = r3.length()
            r3 = 1
            if (r2 != 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r9.optString(r0)     // Catch: java.net.MalformedURLException -> Ldd
            kotlin.jvm.internal.l.d(r2, r0)     // Catch: java.net.MalformedURLException -> Ldd
            int r0 = r2.length()     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto Ldd
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Ldd
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r4 = "facebook.com"
            boolean r0 = kotlin.jvm.internal.l.a(r0, r4)     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L52
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Ldd
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r0 = r0.getHost()     // Catch: java.net.MalformedURLException -> Ldd
            java.lang.String r2 = "www.facebook.com"
            boolean r0 = kotlin.jvm.internal.l.a(r0, r2)     // Catch: java.net.MalformedURLException -> Ldd
            if (r0 != 0) goto L52
            goto Ldd
        L52:
            java.lang.String r0 = "aud"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.l.d(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto Ldd
            p0.f0 r0 = p0.f0.f14852a
            java.lang.String r0 = p0.f0.m()
            boolean r0 = kotlin.jvm.internal.l.a(r2, r0)
            if (r0 != 0) goto L73
            goto Ldd
        L73:
            java.util.Date r0 = new java.util.Date
            java.lang.String r2 = "exp"
            long r4 = r9.optLong(r2)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r2
            long r4 = r4 * r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto L8f
            return r1
        L8f:
            java.lang.String r0 = "iat"
            long r4 = r9.optLong(r0)
            java.util.Date r0 = new java.util.Date
            long r4 = r4 * r6
            r6 = 600000(0x927c0, double:2.964394E-318)
            long r4 = r4 + r6
            r0.<init>(r4)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            boolean r0 = r2.after(r0)
            if (r0 == 0) goto Lac
            return r1
        Lac:
            java.lang.String r0 = "sub"
            java.lang.String r2 = r9.optString(r0)
            kotlin.jvm.internal.l.d(r2, r0)
            int r0 = r2.length()
            if (r0 != 0) goto Lbd
            r0 = 1
            goto Lbe
        Lbd:
            r0 = 0
        Lbe:
            if (r0 == 0) goto Lc1
            return r1
        Lc1:
            java.lang.String r0 = "nonce"
            java.lang.String r9 = r9.optString(r0)
            kotlin.jvm.internal.l.d(r9, r0)
            int r0 = r9.length()
            if (r0 != 0) goto Ld2
            r0 = 1
            goto Ld3
        Ld2:
            r0 = 0
        Ld3:
            if (r0 != 0) goto Ldd
            boolean r9 = kotlin.jvm.internal.l.a(r9, r10)
            if (r9 != 0) goto Ldc
            goto Ldd
        Ldc:
            return r3
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f14949j);
        jSONObject.put("iss", this.f14950k);
        jSONObject.put("aud", this.f14951l);
        jSONObject.put("nonce", this.f14952m);
        jSONObject.put("exp", this.f14953n);
        jSONObject.put("iat", this.f14954o);
        String str = this.f14955p;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f14956q;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f14957r;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f14958s;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f14959t;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f14960u;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f14961v;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f14962w != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f14962w));
        }
        String str8 = this.f14963x;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f14964y != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f14964y));
        }
        if (this.f14965z != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f14965z));
        }
        if (this.A != null) {
            jSONObject.put("user_location", new JSONObject(this.A));
        }
        String str9 = this.B;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.C;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return kotlin.jvm.internal.l.a(this.f14949j, lVar.f14949j) && kotlin.jvm.internal.l.a(this.f14950k, lVar.f14950k) && kotlin.jvm.internal.l.a(this.f14951l, lVar.f14951l) && kotlin.jvm.internal.l.a(this.f14952m, lVar.f14952m) && this.f14953n == lVar.f14953n && this.f14954o == lVar.f14954o && kotlin.jvm.internal.l.a(this.f14955p, lVar.f14955p) && kotlin.jvm.internal.l.a(this.f14956q, lVar.f14956q) && kotlin.jvm.internal.l.a(this.f14957r, lVar.f14957r) && kotlin.jvm.internal.l.a(this.f14958s, lVar.f14958s) && kotlin.jvm.internal.l.a(this.f14959t, lVar.f14959t) && kotlin.jvm.internal.l.a(this.f14960u, lVar.f14960u) && kotlin.jvm.internal.l.a(this.f14961v, lVar.f14961v) && kotlin.jvm.internal.l.a(this.f14962w, lVar.f14962w) && kotlin.jvm.internal.l.a(this.f14963x, lVar.f14963x) && kotlin.jvm.internal.l.a(this.f14964y, lVar.f14964y) && kotlin.jvm.internal.l.a(this.f14965z, lVar.f14965z) && kotlin.jvm.internal.l.a(this.A, lVar.A) && kotlin.jvm.internal.l.a(this.B, lVar.B) && kotlin.jvm.internal.l.a(this.C, lVar.C);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.f14949j.hashCode()) * 31) + this.f14950k.hashCode()) * 31) + this.f14951l.hashCode()) * 31) + this.f14952m.hashCode()) * 31) + k.a(this.f14953n)) * 31) + k.a(this.f14954o)) * 31) + this.f14955p.hashCode()) * 31;
        String str = this.f14956q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14957r;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14958s;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14959t;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f14960u;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14961v;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.f14962w;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f14963x;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.f14964y;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.f14965z;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.A;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.B;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.C;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = b().toString();
        kotlin.jvm.internal.l.d(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f14949j);
        dest.writeString(this.f14950k);
        dest.writeString(this.f14951l);
        dest.writeString(this.f14952m);
        dest.writeLong(this.f14953n);
        dest.writeLong(this.f14954o);
        dest.writeString(this.f14955p);
        dest.writeString(this.f14956q);
        dest.writeString(this.f14957r);
        dest.writeString(this.f14958s);
        dest.writeString(this.f14959t);
        dest.writeString(this.f14960u);
        dest.writeString(this.f14961v);
        dest.writeStringList(this.f14962w == null ? null : new ArrayList(this.f14962w));
        dest.writeString(this.f14963x);
        dest.writeMap(this.f14964y);
        dest.writeMap(this.f14965z);
        dest.writeMap(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
    }
}
