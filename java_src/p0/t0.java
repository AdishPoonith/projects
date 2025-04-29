package p0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import f1.l0;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;
/* loaded from: classes.dex */
public final class t0 implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final String f15021j;

    /* renamed from: k  reason: collision with root package name */
    private final String f15022k;

    /* renamed from: l  reason: collision with root package name */
    private final String f15023l;

    /* renamed from: m  reason: collision with root package name */
    private final String f15024m;

    /* renamed from: n  reason: collision with root package name */
    private final String f15025n;

    /* renamed from: o  reason: collision with root package name */
    private final Uri f15026o;

    /* renamed from: p  reason: collision with root package name */
    private final Uri f15027p;

    /* renamed from: q  reason: collision with root package name */
    public static final b f15019q = new b(null);

    /* renamed from: r  reason: collision with root package name */
    private static final String f15020r = t0.class.getSimpleName();
    public static final Parcelable.Creator<t0> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<t0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public t0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new t0(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public t0[] newArray(int i10) {
            return new t0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a implements l0.a {
            a() {
            }

            @Override // f1.l0.a
            public void a(JSONObject jSONObject) {
                String optString = jSONObject == null ? null : jSONObject.optString("id");
                if (optString == null) {
                    Log.w(t0.f15020r, "No user ID returned on Me request");
                    return;
                }
                String optString2 = jSONObject.optString("link");
                String optString3 = jSONObject.optString("profile_picture", null);
                t0.f15019q.c(new t0(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
            }

            @Override // f1.l0.a
            public void b(s sVar) {
                Log.e(t0.f15020r, kotlin.jvm.internal.l.k("Got unexpected exception: ", sVar));
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            a.c cVar = p0.a.f14786u;
            p0.a e10 = cVar.e();
            if (e10 == null) {
                return;
            }
            if (!cVar.g()) {
                c(null);
                return;
            }
            f1.l0 l0Var = f1.l0.f8470a;
            f1.l0.D(e10.s(), new a());
        }

        public final t0 b() {
            return v0.f15053d.a().c();
        }

        public final void c(t0 t0Var) {
            v0.f15053d.a().f(t0Var);
        }
    }

    private t0(Parcel parcel) {
        this.f15021j = parcel.readString();
        this.f15022k = parcel.readString();
        this.f15023l = parcel.readString();
        this.f15024m = parcel.readString();
        this.f15025n = parcel.readString();
        String readString = parcel.readString();
        this.f15026o = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f15027p = readString2 != null ? Uri.parse(readString2) : null;
    }

    public /* synthetic */ t0(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public t0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.k(str, "id");
        this.f15021j = str;
        this.f15022k = str2;
        this.f15023l = str3;
        this.f15024m = str4;
        this.f15025n = str5;
        this.f15026o = uri;
        this.f15027p = uri2;
    }

    public t0(JSONObject jsonObject) {
        kotlin.jvm.internal.l.e(jsonObject, "jsonObject");
        this.f15021j = jsonObject.optString("id", null);
        this.f15022k = jsonObject.optString("first_name", null);
        this.f15023l = jsonObject.optString("middle_name", null);
        this.f15024m = jsonObject.optString("last_name", null);
        this.f15025n = jsonObject.optString("name", null);
        String optString = jsonObject.optString("link_uri", null);
        this.f15026o = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f15027p = optString2 != null ? Uri.parse(optString2) : null;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f15021j);
            jSONObject.put("first_name", this.f15022k);
            jSONObject.put("middle_name", this.f15023l);
            jSONObject.put("last_name", this.f15024m);
            jSONObject.put("name", this.f15025n);
            Uri uri = this.f15026o;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f15027p;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            String str5 = this.f15021j;
            return ((str5 == null && ((t0) obj).f15021j == null) || kotlin.jvm.internal.l.a(str5, ((t0) obj).f15021j)) && (((str = this.f15022k) == null && ((t0) obj).f15022k == null) || kotlin.jvm.internal.l.a(str, ((t0) obj).f15022k)) && ((((str2 = this.f15023l) == null && ((t0) obj).f15023l == null) || kotlin.jvm.internal.l.a(str2, ((t0) obj).f15023l)) && ((((str3 = this.f15024m) == null && ((t0) obj).f15024m == null) || kotlin.jvm.internal.l.a(str3, ((t0) obj).f15024m)) && ((((str4 = this.f15025n) == null && ((t0) obj).f15025n == null) || kotlin.jvm.internal.l.a(str4, ((t0) obj).f15025n)) && ((((uri = this.f15026o) == null && ((t0) obj).f15026o == null) || kotlin.jvm.internal.l.a(uri, ((t0) obj).f15026o)) && (((uri2 = this.f15027p) == null && ((t0) obj).f15027p == null) || kotlin.jvm.internal.l.a(uri2, ((t0) obj).f15027p))))));
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15021j;
        int hashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f15022k;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f15023l;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.f15024m;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.f15025n;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f15026o;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f15027p;
        return uri2 != null ? (hashCode * 31) + uri2.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f15021j);
        dest.writeString(this.f15022k);
        dest.writeString(this.f15023l);
        dest.writeString(this.f15024m);
        dest.writeString(this.f15025n);
        Uri uri = this.f15026o;
        dest.writeString(uri == null ? null : uri.toString());
        Uri uri2 = this.f15027p;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }
}
