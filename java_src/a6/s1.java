package a6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.iv;
import com.google.android.gms.internal.p000firebaseauthapi.o2;
import com.google.android.gms.internal.p000firebaseauthapi.z1;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s1 extends d4.a implements com.google.firebase.auth.y0 {
    public static final Parcelable.Creator<s1> CREATOR = new t1();

    /* renamed from: j  reason: collision with root package name */
    private final String f286j;

    /* renamed from: k  reason: collision with root package name */
    private final String f287k;

    /* renamed from: l  reason: collision with root package name */
    private final String f288l;

    /* renamed from: m  reason: collision with root package name */
    private String f289m;

    /* renamed from: n  reason: collision with root package name */
    private Uri f290n;

    /* renamed from: o  reason: collision with root package name */
    private final String f291o;

    /* renamed from: p  reason: collision with root package name */
    private final String f292p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f293q;

    /* renamed from: r  reason: collision with root package name */
    private final String f294r;

    public s1(o2 o2Var) {
        c4.s.j(o2Var);
        this.f286j = o2Var.d();
        this.f287k = c4.s.f(o2Var.f());
        this.f288l = o2Var.b();
        Uri a10 = o2Var.a();
        if (a10 != null) {
            this.f289m = a10.toString();
            this.f290n = a10;
        }
        this.f291o = o2Var.c();
        this.f292p = o2Var.e();
        this.f293q = false;
        this.f294r = o2Var.g();
    }

    public s1(z1 z1Var, String str) {
        c4.s.j(z1Var);
        c4.s.f("firebase");
        this.f286j = c4.s.f(z1Var.o());
        this.f287k = "firebase";
        this.f291o = z1Var.n();
        this.f288l = z1Var.m();
        Uri c10 = z1Var.c();
        if (c10 != null) {
            this.f289m = c10.toString();
            this.f290n = c10;
        }
        this.f293q = z1Var.s();
        this.f294r = null;
        this.f292p = z1Var.p();
    }

    public s1(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f286j = str;
        this.f287k = str2;
        this.f291o = str3;
        this.f292p = str4;
        this.f288l = str5;
        this.f289m = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f290n = Uri.parse(this.f289m);
        }
        this.f293q = z10;
        this.f294r = str7;
    }

    public final String B() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f286j);
            jSONObject.putOpt("providerId", this.f287k);
            jSONObject.putOpt("displayName", this.f288l);
            jSONObject.putOpt("photoUrl", this.f289m);
            jSONObject.putOpt("email", this.f291o);
            jSONObject.putOpt("phoneNumber", this.f292p);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f293q));
            jSONObject.putOpt("rawUserInfo", this.f294r);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new iv(e10);
        }
    }

    @Override // com.google.firebase.auth.y0
    public final String a() {
        return this.f286j;
    }

    @Override // com.google.firebase.auth.y0
    public final Uri c() {
        if (!TextUtils.isEmpty(this.f289m) && this.f290n == null) {
            this.f290n = Uri.parse(this.f289m);
        }
        return this.f290n;
    }

    @Override // com.google.firebase.auth.y0
    public final boolean f() {
        return this.f293q;
    }

    @Override // com.google.firebase.auth.y0
    public final String g() {
        return this.f287k;
    }

    @Override // com.google.firebase.auth.y0
    public final String j() {
        return this.f292p;
    }

    @Override // com.google.firebase.auth.y0
    public final String s() {
        return this.f291o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f286j, false);
        d4.c.s(parcel, 2, this.f287k, false);
        d4.c.s(parcel, 3, this.f288l, false);
        d4.c.s(parcel, 4, this.f289m, false);
        d4.c.s(parcel, 5, this.f291o, false);
        d4.c.s(parcel, 6, this.f292p, false);
        d4.c.c(parcel, 7, this.f293q);
        d4.c.s(parcel, 8, this.f294r, false);
        d4.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.y0
    public final String x() {
        return this.f288l;
    }

    public final String zza() {
        return this.f294r;
    }
}
