package p0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final String f14968j;

    /* renamed from: k  reason: collision with root package name */
    private final String f14969k;

    /* renamed from: l  reason: collision with root package name */
    private final String f14970l;

    /* renamed from: m  reason: collision with root package name */
    public static final b f14967m = new b(null);
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new m(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public m(Parcel parcel) {
        kotlin.jvm.internal.l.e(parcel, "parcel");
        String readString = parcel.readString();
        f1.m0 m0Var = f1.m0.f8479a;
        this.f14968j = f1.m0.k(readString, "alg");
        this.f14969k = f1.m0.k(parcel.readString(), "typ");
        this.f14970l = f1.m0.k(parcel.readString(), "kid");
    }

    public m(String encodedHeaderString) {
        kotlin.jvm.internal.l.e(encodedHeaderString, "encodedHeaderString");
        if (!b(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.l.d(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, ka.d.f12805b));
        String string = jSONObject.getString("alg");
        kotlin.jvm.internal.l.d(string, "jsonObj.getString(\"alg\")");
        this.f14968j = string;
        String string2 = jSONObject.getString("typ");
        kotlin.jvm.internal.l.d(string2, "jsonObj.getString(\"typ\")");
        this.f14969k = string2;
        String string3 = jSONObject.getString("kid");
        kotlin.jvm.internal.l.d(string3, "jsonObj.getString(\"kid\")");
        this.f14970l = string3;
    }

    private final boolean b(String str) {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.g(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        kotlin.jvm.internal.l.d(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, ka.d.f12805b));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.l.d(alg, "alg");
            boolean z10 = (alg.length() > 0) && kotlin.jvm.internal.l.a(alg, "RS256");
            String optString = jSONObject.optString("kid");
            kotlin.jvm.internal.l.d(optString, "jsonObj.optString(\"kid\")");
            boolean z11 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.l.d(optString2, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (optString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final String a() {
        return this.f14970l;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f14968j);
        jSONObject.put("typ", this.f14969k);
        jSONObject.put("kid", this.f14970l);
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
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.l.a(this.f14968j, mVar.f14968j) && kotlin.jvm.internal.l.a(this.f14969k, mVar.f14969k) && kotlin.jvm.internal.l.a(this.f14970l, mVar.f14970l);
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f14968j.hashCode()) * 31) + this.f14969k.hashCode()) * 31) + this.f14970l.hashCode();
    }

    public String toString() {
        String jSONObject = c().toString();
        kotlin.jvm.internal.l.d(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(this.f14968j);
        dest.writeString(this.f14969k);
        dest.writeString(this.f14970l);
    }
}
