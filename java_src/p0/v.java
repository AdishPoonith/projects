package p0;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private final int f15033j;

    /* renamed from: k  reason: collision with root package name */
    private final int f15034k;

    /* renamed from: l  reason: collision with root package name */
    private final int f15035l;

    /* renamed from: m  reason: collision with root package name */
    private final String f15036m;

    /* renamed from: n  reason: collision with root package name */
    private final String f15037n;

    /* renamed from: o  reason: collision with root package name */
    private final String f15038o;

    /* renamed from: p  reason: collision with root package name */
    private final JSONObject f15039p;

    /* renamed from: q  reason: collision with root package name */
    private final JSONObject f15040q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f15041r;

    /* renamed from: s  reason: collision with root package name */
    private final HttpURLConnection f15042s;

    /* renamed from: t  reason: collision with root package name */
    private final String f15043t;

    /* renamed from: u  reason: collision with root package name */
    private s f15044u;

    /* renamed from: v  reason: collision with root package name */
    private final a f15045v;

    /* renamed from: w  reason: collision with root package name */
    private final String f15046w;

    /* renamed from: x  reason: collision with root package name */
    public static final c f15031x = new c(null);

    /* renamed from: y  reason: collision with root package name */
    private static final d f15032y = new d(200, 299);
    public static final Parcelable.Creator<v> CREATOR = new b();

    /* loaded from: classes.dex */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<v> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.e(parcel, "parcel");
            return new v(parcel, (kotlin.jvm.internal.g) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public v[] newArray(int i10) {
            return new v[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[Catch: JSONException -> 0x012f, TryCatch #0 {JSONException -> 0x012f, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0024, B:9:0x0028, B:12:0x0036, B:47:0x00d1, B:33:0x0079, B:30:0x0070, B:27:0x0066, B:24:0x005e, B:21:0x0057, B:18:0x004d, B:15:0x0043, B:35:0x0085, B:38:0x0092, B:40:0x009b, B:44:0x00ac, B:49:0x00f2, B:51:0x00fc, B:53:0x010a, B:55:0x0113), top: B:59:0x0012 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p0.v a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.v.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):p0.v");
        }

        public final synchronized f1.j b() {
            f1.v vVar = f1.v.f8582a;
            f0 f0Var = f0.f14852a;
            f1.r f10 = f1.v.f(f0.m());
            if (f10 == null) {
                return f1.j.f8455g.b();
            }
            return f10.c();
        }

        public final d c() {
            return v.f15032y;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f15051a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15052b;

        public d(int i10, int i11) {
            this.f15051a = i10;
            this.f15052b = i11;
        }

        public final boolean a(int i10) {
            return i10 <= this.f15052b && this.f15051a <= i10;
        }
    }

    private v(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, s sVar, boolean z10) {
        boolean z11;
        this.f15033j = i10;
        this.f15034k = i11;
        this.f15035l = i12;
        this.f15036m = str;
        this.f15037n = str3;
        this.f15038o = str4;
        this.f15039p = jSONObject;
        this.f15040q = jSONObject2;
        this.f15041r = obj;
        this.f15042s = httpURLConnection;
        this.f15043t = str2;
        if (sVar != null) {
            this.f15044u = sVar;
            z11 = true;
        } else {
            this.f15044u = new h0(this, c());
            z11 = false;
        }
        a c10 = z11 ? a.OTHER : f15031x.b().c(i11, i12, z10);
        this.f15045v = c10;
        this.f15046w = f15031x.b().d(c10);
    }

    public /* synthetic */ v(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, s sVar, boolean z10, kotlin.jvm.internal.g gVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, sVar, z10);
    }

    public v(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private v(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }

    public /* synthetic */ v(Parcel parcel, kotlin.jvm.internal.g gVar) {
        this(parcel);
    }

    public v(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof s ? (s) exc : new s(exc), false);
    }

    public final int b() {
        return this.f15034k;
    }

    public final String c() {
        String str = this.f15043t;
        if (str == null) {
            s sVar = this.f15044u;
            if (sVar == null) {
                return null;
            }
            return sVar.getLocalizedMessage();
        }
        return str;
    }

    public final String d() {
        return this.f15036m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final s e() {
        return this.f15044u;
    }

    public final int f() {
        return this.f15033j;
    }

    public final int j() {
        return this.f15035l;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f15033j + ", errorCode: " + this.f15034k + ", subErrorCode: " + this.f15035l + ", errorType: " + this.f15036m + ", errorMessage: " + c() + "}";
        kotlin.jvm.internal.l.d(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        kotlin.jvm.internal.l.e(out, "out");
        out.writeInt(this.f15033j);
        out.writeInt(this.f15034k);
        out.writeInt(this.f15035l);
        out.writeString(this.f15036m);
        out.writeString(c());
        out.writeString(this.f15037n);
        out.writeString(this.f15038o);
    }
}
