package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c4.s;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends d4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: w  reason: collision with root package name */
    public static h4.d f3681w = h4.f.c();

    /* renamed from: j  reason: collision with root package name */
    final int f3682j;

    /* renamed from: k  reason: collision with root package name */
    private String f3683k;

    /* renamed from: l  reason: collision with root package name */
    private String f3684l;

    /* renamed from: m  reason: collision with root package name */
    private String f3685m;

    /* renamed from: n  reason: collision with root package name */
    private String f3686n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f3687o;

    /* renamed from: p  reason: collision with root package name */
    private String f3688p;

    /* renamed from: q  reason: collision with root package name */
    private long f3689q;

    /* renamed from: r  reason: collision with root package name */
    private String f3690r;

    /* renamed from: s  reason: collision with root package name */
    List f3691s;

    /* renamed from: t  reason: collision with root package name */
    private String f3692t;

    /* renamed from: u  reason: collision with root package name */
    private String f3693u;

    /* renamed from: v  reason: collision with root package name */
    private Set f3694v = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f3682j = i10;
        this.f3683k = str;
        this.f3684l = str2;
        this.f3685m = str3;
        this.f3686n = str4;
        this.f3687o = uri;
        this.f3688p = str5;
        this.f3689q = j10;
        this.f3690r = str6;
        this.f3691s = list;
        this.f3692t = str7;
        this.f3693u = str8;
    }

    public static GoogleSignInAccount J(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), s.f(str7), new ArrayList((Collection) s.j(set)), str5, str6);
    }

    public static GoogleSignInAccount K(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount J = J(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        J.f3688p = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return J;
    }

    public String B() {
        return this.f3693u;
    }

    public String C() {
        return this.f3692t;
    }

    public Set<Scope> D() {
        return new HashSet(this.f3691s);
    }

    public String E() {
        return this.f3683k;
    }

    public String F() {
        return this.f3684l;
    }

    public Set<Scope> G() {
        HashSet hashSet = new HashSet(this.f3691s);
        hashSet.addAll(this.f3694v);
        return hashSet;
    }

    public String H() {
        return this.f3688p;
    }

    public boolean I() {
        return f3681w.b() / 1000 >= this.f3689q + (-300);
    }

    public final String L() {
        return this.f3690r;
    }

    public final String M() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (E() != null) {
                jSONObject.put("id", E());
            }
            if (F() != null) {
                jSONObject.put("tokenId", F());
            }
            if (s() != null) {
                jSONObject.put("email", s());
            }
            if (x() != null) {
                jSONObject.put("displayName", x());
            }
            if (C() != null) {
                jSONObject.put("givenName", C());
            }
            if (B() != null) {
                jSONObject.put("familyName", B());
            }
            Uri c10 = c();
            if (c10 != null) {
                jSONObject.put("photoUrl", c10.toString());
            }
            if (H() != null) {
                jSONObject.put("serverAuthCode", H());
            }
            jSONObject.put("expirationTime", this.f3689q);
            jSONObject.put("obfuscatedIdentifier", this.f3690r);
            JSONArray jSONArray = new JSONArray();
            List list = this.f3691s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: y3.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).B().compareTo(((Scope) obj2).B());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.B());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Uri c() {
        return this.f3687o;
    }

    public Account d() {
        String str = this.f3685m;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f3690r.equals(this.f3690r) && googleSignInAccount.G().equals(G());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3690r.hashCode() + 527) * 31) + G().hashCode();
    }

    public String s() {
        return this.f3685m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3682j);
        d4.c.s(parcel, 2, E(), false);
        d4.c.s(parcel, 3, F(), false);
        d4.c.s(parcel, 4, s(), false);
        d4.c.s(parcel, 5, x(), false);
        d4.c.r(parcel, 6, c(), i10, false);
        d4.c.s(parcel, 7, H(), false);
        d4.c.p(parcel, 8, this.f3689q);
        d4.c.s(parcel, 9, this.f3690r, false);
        d4.c.v(parcel, 10, this.f3691s, false);
        d4.c.s(parcel, 11, C(), false);
        d4.c.s(parcel, 12, B(), false);
        d4.c.b(parcel, a10);
    }

    public String x() {
        return this.f3686n;
    }
}
