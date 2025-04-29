package p0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.q0;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: u  reason: collision with root package name */
    public static final c f14786u = new c(null);

    /* renamed from: v  reason: collision with root package name */
    private static final Date f14787v;

    /* renamed from: w  reason: collision with root package name */
    private static final Date f14788w;

    /* renamed from: x  reason: collision with root package name */
    private static final Date f14789x;

    /* renamed from: y  reason: collision with root package name */
    private static final h f14790y;

    /* renamed from: j  reason: collision with root package name */
    private final Date f14791j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<String> f14792k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<String> f14793l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<String> f14794m;

    /* renamed from: n  reason: collision with root package name */
    private final String f14795n;

    /* renamed from: o  reason: collision with root package name */
    private final h f14796o;

    /* renamed from: p  reason: collision with root package name */
    private final Date f14797p;

    /* renamed from: q  reason: collision with root package name */
    private final String f14798q;

    /* renamed from: r  reason: collision with root package name */
    private final String f14799r;

    /* renamed from: s  reason: collision with root package name */
    private final Date f14800s;

    /* renamed from: t  reason: collision with root package name */
    private final String f14801t;

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0221a {
        void a(a aVar);

        void b(s sVar);
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new a(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(a current) {
            kotlin.jvm.internal.l.e(current, "current");
            return new a(current.s(), current.c(), current.x(), current.p(), current.f(), current.j(), current.q(), new Date(), new Date(), current.e(), null, 1024, null);
        }

        public final a b(JSONObject jsonObject) {
            kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") <= 1) {
                String token = jsonObject.getString("token");
                Date date = new Date(jsonObject.getLong("expires_at"));
                JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
                JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jsonObject.getLong("last_refresh"));
                String string = jsonObject.getString("source");
                kotlin.jvm.internal.l.d(string, "jsonObject.getString(SOURCE_KEY)");
                h valueOf = h.valueOf(string);
                String applicationId = jsonObject.getString("application_id");
                String userId = jsonObject.getString("user_id");
                Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
                String optString = jsonObject.optString("graph_domain", null);
                kotlin.jvm.internal.l.d(token, "token");
                kotlin.jvm.internal.l.d(applicationId, "applicationId");
                kotlin.jvm.internal.l.d(userId, "userId");
                f1.l0 l0Var = f1.l0.f8470a;
                kotlin.jvm.internal.l.d(permissionsArray, "permissionsArray");
                List<String> b02 = f1.l0.b0(permissionsArray);
                kotlin.jvm.internal.l.d(declinedPermissionsArray, "declinedPermissionsArray");
                return new a(token, applicationId, userId, b02, f1.l0.b0(declinedPermissionsArray), optJSONArray == null ? new ArrayList() : f1.l0.b0(optJSONArray), valueOf, date, date2, date3, optString);
            }
            throw new s("Unknown AccessToken serialization format.");
        }

        public final a c(Bundle bundle) {
            String string;
            kotlin.jvm.internal.l.e(bundle, "bundle");
            List<String> f10 = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> f11 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> f12 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            q0.a aVar = q0.f15003c;
            String a10 = aVar.a(bundle);
            f1.l0 l0Var = f1.l0.f8470a;
            if (f1.l0.X(a10)) {
                f0 f0Var = f0.f14852a;
                a10 = f0.m();
            }
            String str = a10;
            String f13 = aVar.f(bundle);
            if (f13 == null) {
                return null;
            }
            JSONObject f14 = f1.l0.f(f13);
            if (f14 == null) {
                string = null;
            } else {
                try {
                    string = f14.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new a(f13, str, string, f10, f11, f12, aVar.e(bundle), aVar.c(bundle), aVar.d(bundle), null, null, 1024, null);
        }

        public final void d() {
            a i10 = g.f14876f.e().i();
            if (i10 != null) {
                h(a(i10));
            }
        }

        public final a e() {
            return g.f14876f.e().i();
        }

        public final List<String> f(Bundle bundle, String str) {
            List<String> e10;
            kotlin.jvm.internal.l.e(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                e10 = t9.p.e();
                return e10;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            kotlin.jvm.internal.l.d(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            a i10 = g.f14876f.e().i();
            return (i10 == null || i10.z()) ? false : true;
        }

        public final void h(a aVar) {
            g.f14876f.e().r(aVar);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14802a;

        static {
            int[] iArr = new int[h.valuesCustom().length];
            iArr[h.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[h.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[h.WEB_VIEW.ordinal()] = 3;
            f14802a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f14787v = date;
        f14788w = date;
        f14789x = new Date();
        f14790y = h.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public a(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        this.f14791j = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.l.d(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f14792k = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.l.d(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f14793l = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.l.d(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f14794m = unmodifiableSet3;
        String readString = parcel.readString();
        f1.m0 m0Var = f1.m0.f8479a;
        this.f14795n = f1.m0.k(readString, "token");
        String readString2 = parcel.readString();
        this.f14796o = readString2 != null ? h.valueOf(readString2) : f14790y;
        this.f14797p = new Date(parcel.readLong());
        this.f14798q = f1.m0.k(parcel.readString(), "applicationId");
        this.f14799r = f1.m0.k(parcel.readString(), "userId");
        this.f14800s = new Date(parcel.readLong());
        this.f14801t = parcel.readString();
    }

    public a(String accessToken, String applicationId, String userId, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, h hVar, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        kotlin.jvm.internal.l.e(userId, "userId");
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.g(accessToken, "accessToken");
        f1.m0.g(applicationId, "applicationId");
        f1.m0.g(userId, "userId");
        this.f14791j = date == null ? f14788w : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.l.d(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f14792k = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.l.d(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f14793l = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.l.d(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f14794m = unmodifiableSet3;
        this.f14795n = accessToken;
        this.f14796o = b(hVar == null ? f14790y : hVar, str);
        this.f14797p = date2 == null ? f14789x : date2;
        this.f14798q = applicationId;
        this.f14799r = userId;
        this.f14800s = (date3 == null || date3.getTime() == 0) ? f14788w : date3;
        this.f14801t = str == null ? "facebook" : str;
    }

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3, String str4, int i10, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3, (i10 & 1024) != 0 ? "facebook" : str4);
    }

    private final String C() {
        f0 f0Var = f0.f14852a;
        return f0.H(r0.INCLUDE_ACCESS_TOKENS) ? this.f14795n : "ACCESS_TOKEN_REMOVED";
    }

    private final void a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f14792k));
        sb.append("]");
    }

    private final h b(h hVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return hVar;
        }
        int i10 = d.f14802a[hVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? hVar : h.INSTAGRAM_WEB_VIEW : h.INSTAGRAM_CUSTOM_CHROME_TAB : h.INSTAGRAM_APPLICATION_WEB;
    }

    public static final a d() {
        return f14786u.e();
    }

    public final JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f14795n);
        jSONObject.put("expires_at", this.f14791j.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f14792k));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f14793l));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f14794m));
        jSONObject.put("last_refresh", this.f14797p.getTime());
        jSONObject.put("source", this.f14796o.name());
        jSONObject.put("application_id", this.f14798q);
        jSONObject.put("user_id", this.f14799r);
        jSONObject.put("data_access_expiration_time", this.f14800s.getTime());
        String str = this.f14801t;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final String c() {
        return this.f14798q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Date e() {
        return this.f14800s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.l.a(this.f14791j, aVar.f14791j) && kotlin.jvm.internal.l.a(this.f14792k, aVar.f14792k) && kotlin.jvm.internal.l.a(this.f14793l, aVar.f14793l) && kotlin.jvm.internal.l.a(this.f14794m, aVar.f14794m) && kotlin.jvm.internal.l.a(this.f14795n, aVar.f14795n) && this.f14796o == aVar.f14796o && kotlin.jvm.internal.l.a(this.f14797p, aVar.f14797p) && kotlin.jvm.internal.l.a(this.f14798q, aVar.f14798q) && kotlin.jvm.internal.l.a(this.f14799r, aVar.f14799r) && kotlin.jvm.internal.l.a(this.f14800s, aVar.f14800s)) {
                String str = this.f14801t;
                String str2 = aVar.f14801t;
                if (str == null ? str2 == null : kotlin.jvm.internal.l.a(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final Set<String> f() {
        return this.f14793l;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((((527 + this.f14791j.hashCode()) * 31) + this.f14792k.hashCode()) * 31) + this.f14793l.hashCode()) * 31) + this.f14794m.hashCode()) * 31) + this.f14795n.hashCode()) * 31) + this.f14796o.hashCode()) * 31) + this.f14797p.hashCode()) * 31) + this.f14798q.hashCode()) * 31) + this.f14799r.hashCode()) * 31) + this.f14800s.hashCode()) * 31;
        String str = this.f14801t;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Set<String> j() {
        return this.f14794m;
    }

    public final Date k() {
        return this.f14791j;
    }

    public final String l() {
        return this.f14801t;
    }

    public final Date m() {
        return this.f14797p;
    }

    public final Set<String> p() {
        return this.f14792k;
    }

    public final h q() {
        return this.f14796o;
    }

    public final String s() {
        return this.f14795n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(C());
        a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.d(sb2, "builder.toString()");
        return sb2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeLong(this.f14791j.getTime());
        dest.writeStringList(new ArrayList(this.f14792k));
        dest.writeStringList(new ArrayList(this.f14793l));
        dest.writeStringList(new ArrayList(this.f14794m));
        dest.writeString(this.f14795n);
        dest.writeString(this.f14796o.name());
        dest.writeLong(this.f14797p.getTime());
        dest.writeString(this.f14798q);
        dest.writeString(this.f14799r);
        dest.writeLong(this.f14800s.getTime());
        dest.writeString(this.f14801t);
    }

    public final String x() {
        return this.f14799r;
    }

    public final boolean z() {
        return new Date().after(this.f14791j);
    }
}
