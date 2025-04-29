package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c4.s;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInOptions extends d4.a implements a.d, ReflectedParcelable {
    public static final Scope A;
    private static Comparator B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: u  reason: collision with root package name */
    public static final GoogleSignInOptions f3695u;

    /* renamed from: v  reason: collision with root package name */
    public static final GoogleSignInOptions f3696v;

    /* renamed from: w  reason: collision with root package name */
    public static final Scope f3697w = new Scope("profile");

    /* renamed from: x  reason: collision with root package name */
    public static final Scope f3698x = new Scope("email");

    /* renamed from: y  reason: collision with root package name */
    public static final Scope f3699y = new Scope("openid");

    /* renamed from: z  reason: collision with root package name */
    public static final Scope f3700z;

    /* renamed from: j  reason: collision with root package name */
    final int f3701j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList f3702k;

    /* renamed from: l  reason: collision with root package name */
    private Account f3703l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3704m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f3705n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f3706o;

    /* renamed from: p  reason: collision with root package name */
    private String f3707p;

    /* renamed from: q  reason: collision with root package name */
    private String f3708q;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList f3709r;

    /* renamed from: s  reason: collision with root package name */
    private String f3710s;

    /* renamed from: t  reason: collision with root package name */
    private Map f3711t;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Set f3712a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3713b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3714c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3715d;

        /* renamed from: e  reason: collision with root package name */
        private String f3716e;

        /* renamed from: f  reason: collision with root package name */
        private Account f3717f;

        /* renamed from: g  reason: collision with root package name */
        private String f3718g;

        /* renamed from: h  reason: collision with root package name */
        private Map f3719h;

        /* renamed from: i  reason: collision with root package name */
        private String f3720i;

        public a() {
            this.f3712a = new HashSet();
            this.f3719h = new HashMap();
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f3712a = new HashSet();
            this.f3719h = new HashMap();
            s.j(googleSignInOptions);
            this.f3712a = new HashSet(googleSignInOptions.f3702k);
            this.f3713b = googleSignInOptions.f3705n;
            this.f3714c = googleSignInOptions.f3706o;
            this.f3715d = googleSignInOptions.f3704m;
            this.f3716e = googleSignInOptions.f3707p;
            this.f3717f = googleSignInOptions.f3703l;
            this.f3718g = googleSignInOptions.f3708q;
            this.f3719h = GoogleSignInOptions.U(googleSignInOptions.f3709r);
            this.f3720i = googleSignInOptions.f3710s;
        }

        private final String k(String str) {
            s.f(str);
            String str2 = this.f3716e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f3712a.contains(GoogleSignInOptions.A)) {
                Set set = this.f3712a;
                Scope scope = GoogleSignInOptions.f3700z;
                if (set.contains(scope)) {
                    this.f3712a.remove(scope);
                }
            }
            if (this.f3715d && (this.f3717f == null || !this.f3712a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f3712a), this.f3717f, this.f3715d, this.f3713b, this.f3714c, this.f3716e, this.f3718g, this.f3719h, this.f3720i);
        }

        public a b() {
            this.f3712a.add(GoogleSignInOptions.f3698x);
            return this;
        }

        public a c() {
            this.f3712a.add(GoogleSignInOptions.f3699y);
            return this;
        }

        public a d(String str) {
            this.f3715d = true;
            k(str);
            this.f3716e = str;
            return this;
        }

        public a e() {
            this.f3712a.add(GoogleSignInOptions.f3697w);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f3712a.add(scope);
            this.f3712a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str, boolean z10) {
            this.f3713b = true;
            k(str);
            this.f3716e = str;
            this.f3714c = z10;
            return this;
        }

        public a h(String str) {
            this.f3717f = new Account(s.f(str), "com.google");
            return this;
        }

        public a i(String str) {
            this.f3718g = s.f(str);
            return this;
        }

        public a j(String str) {
            this.f3720i = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f3700z = scope;
        A = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f3695u = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f3696v = aVar2.a();
        CREATOR = new e();
        B = new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, U(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f3701j = i10;
        this.f3702k = arrayList;
        this.f3703l = account;
        this.f3704m = z10;
        this.f3705n = z11;
        this.f3706o = z12;
        this.f3707p = str;
        this.f3708q = str2;
        this.f3709r = new ArrayList(map.values());
        this.f3711t = map;
        this.f3710s = str3;
    }

    public static GoogleSignInOptions J(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map U(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z3.a aVar = (z3.a) it.next();
            hashMap.put(Integer.valueOf(aVar.B()), aVar);
        }
        return hashMap;
    }

    public ArrayList<z3.a> B() {
        return this.f3709r;
    }

    public String C() {
        return this.f3710s;
    }

    public ArrayList<Scope> D() {
        return new ArrayList<>(this.f3702k);
    }

    public String E() {
        return this.f3707p;
    }

    public boolean F() {
        return this.f3706o;
    }

    public boolean G() {
        return this.f3704m;
    }

    public boolean H() {
        return this.f3705n;
    }

    public final String N() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f3702k, B);
            Iterator it = this.f3702k.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).B());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f3703l;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f3704m);
            jSONObject.put("forceCodeForRefreshToken", this.f3706o);
            jSONObject.put("serverAuthRequested", this.f3705n);
            if (!TextUtils.isEmpty(this.f3707p)) {
                jSONObject.put("serverClientId", this.f3707p);
            }
            if (!TextUtils.isEmpty(this.f3708q)) {
                jSONObject.put("hostedDomain", this.f3708q);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Account d() {
        return this.f3703l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.equals(r4.d()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f3709r     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList r1 = r4.f3709r     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f3702k     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.D()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f3702k     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.D()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f3703l     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.d()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.d()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f3707p     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.E()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f3707p     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.E()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f3706o     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.F()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f3704m     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.G()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f3705n     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.H()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f3710s     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.C()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f3702k;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).B());
        }
        Collections.sort(arrayList);
        z3.b bVar = new z3.b();
        bVar.a(arrayList);
        bVar.a(this.f3703l);
        bVar.a(this.f3707p);
        bVar.c(this.f3706o);
        bVar.c(this.f3704m);
        bVar.c(this.f3705n);
        bVar.a(this.f3710s);
        return bVar.b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f3701j);
        d4.c.v(parcel, 2, D(), false);
        d4.c.r(parcel, 3, d(), i10, false);
        d4.c.c(parcel, 4, G());
        d4.c.c(parcel, 5, H());
        d4.c.c(parcel, 6, F());
        d4.c.s(parcel, 7, E(), false);
        d4.c.s(parcel, 8, this.f3708q, false);
        d4.c.v(parcel, 9, B(), false);
        d4.c.s(parcel, 10, C(), false);
        d4.c.b(parcel, a10);
    }
}
