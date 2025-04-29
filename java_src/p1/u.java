package p1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import f1.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class u implements Parcelable {

    /* renamed from: j  reason: collision with root package name */
    private f0[] f15223j;

    /* renamed from: k  reason: collision with root package name */
    private int f15224k;

    /* renamed from: l  reason: collision with root package name */
    private Fragment f15225l;

    /* renamed from: m  reason: collision with root package name */
    private d f15226m;

    /* renamed from: n  reason: collision with root package name */
    private a f15227n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15228o;

    /* renamed from: p  reason: collision with root package name */
    private e f15229p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, String> f15230q;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f15231r;

    /* renamed from: s  reason: collision with root package name */
    private a0 f15232s;

    /* renamed from: t  reason: collision with root package name */
    private int f15233t;

    /* renamed from: u  reason: collision with root package name */
    private int f15234u;

    /* renamed from: v  reason: collision with root package name */
    public static final c f15222v = new c(null);
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<u> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public u createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new u(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.l.d(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int b() {
            return d.c.Login.g();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(f fVar);
    }

    /* loaded from: classes.dex */
    public static final class e implements Parcelable {
        public static final b B = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new a();
        private final p1.a A;

        /* renamed from: j  reason: collision with root package name */
        private final t f15235j;

        /* renamed from: k  reason: collision with root package name */
        private Set<String> f15236k;

        /* renamed from: l  reason: collision with root package name */
        private final p1.e f15237l;

        /* renamed from: m  reason: collision with root package name */
        private final String f15238m;

        /* renamed from: n  reason: collision with root package name */
        private String f15239n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f15240o;

        /* renamed from: p  reason: collision with root package name */
        private String f15241p;

        /* renamed from: q  reason: collision with root package name */
        private String f15242q;

        /* renamed from: r  reason: collision with root package name */
        private String f15243r;

        /* renamed from: s  reason: collision with root package name */
        private String f15244s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f15245t;

        /* renamed from: u  reason: collision with root package name */
        private final i0 f15246u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f15247v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f15248w;

        /* renamed from: x  reason: collision with root package name */
        private final String f15249x;

        /* renamed from: y  reason: collision with root package name */
        private final String f15250y;

        /* renamed from: z  reason: collision with root package name */
        private final String f15251z;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel source) {
                kotlin.jvm.internal.l.e(source, "source");
                return new e(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
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

        private e(Parcel parcel) {
            f1.m0 m0Var = f1.m0.f8479a;
            this.f15235j = t.valueOf(f1.m0.k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f15236k = new HashSet(arrayList);
            String readString = parcel.readString();
            this.f15237l = readString != null ? p1.e.valueOf(readString) : p1.e.NONE;
            this.f15238m = f1.m0.k(parcel.readString(), "applicationId");
            this.f15239n = f1.m0.k(parcel.readString(), "authId");
            this.f15240o = parcel.readByte() != 0;
            this.f15241p = parcel.readString();
            this.f15242q = f1.m0.k(parcel.readString(), "authType");
            this.f15243r = parcel.readString();
            this.f15244s = parcel.readString();
            this.f15245t = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            this.f15246u = readString2 != null ? i0.valueOf(readString2) : i0.FACEBOOK;
            this.f15247v = parcel.readByte() != 0;
            this.f15248w = parcel.readByte() != 0;
            this.f15249x = f1.m0.k(parcel.readString(), "nonce");
            this.f15250y = parcel.readString();
            this.f15251z = parcel.readString();
            String readString3 = parcel.readString();
            this.A = readString3 == null ? null : p1.a.valueOf(readString3);
        }

        public /* synthetic */ e(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public e(t loginBehavior, Set<String> set, p1.e defaultAudience, String authType, String applicationId, String authId, i0 i0Var, String str, String str2, String str3, p1.a aVar) {
            kotlin.jvm.internal.l.e(loginBehavior, "loginBehavior");
            kotlin.jvm.internal.l.e(defaultAudience, "defaultAudience");
            kotlin.jvm.internal.l.e(authType, "authType");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            kotlin.jvm.internal.l.e(authId, "authId");
            this.f15235j = loginBehavior;
            this.f15236k = set == null ? new HashSet<>() : set;
            this.f15237l = defaultAudience;
            this.f15242q = authType;
            this.f15238m = applicationId;
            this.f15239n = authId;
            this.f15246u = i0Var == null ? i0.FACEBOOK : i0Var;
            if (str != null) {
                if (!(str.length() == 0)) {
                    this.f15249x = str;
                    this.f15250y = str2;
                    this.f15251z = str3;
                    this.A = aVar;
                }
            }
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.l.d(uuid, "randomUUID().toString()");
            this.f15249x = uuid;
            this.f15250y = str2;
            this.f15251z = str3;
            this.A = aVar;
        }

        public final boolean B() {
            for (String str : this.f15236k) {
                if (e0.f15111j.g(str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean C() {
            return this.f15247v;
        }

        public final boolean D() {
            return this.f15246u == i0.INSTAGRAM;
        }

        public final boolean E() {
            return this.f15240o;
        }

        public final void F(boolean z10) {
            this.f15247v = z10;
        }

        public final void G(String str) {
            this.f15244s = str;
        }

        public final void H(Set<String> set) {
            kotlin.jvm.internal.l.e(set, "<set-?>");
            this.f15236k = set;
        }

        public final void I(boolean z10) {
            this.f15240o = z10;
        }

        public final void J(boolean z10) {
            this.f15245t = z10;
        }

        public final void K(boolean z10) {
            this.f15248w = z10;
        }

        public final boolean L() {
            return this.f15248w;
        }

        public final String a() {
            return this.f15238m;
        }

        public final String b() {
            return this.f15239n;
        }

        public final String c() {
            return this.f15242q;
        }

        public final String d() {
            return this.f15251z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final p1.a e() {
            return this.A;
        }

        public final String f() {
            return this.f15250y;
        }

        public final p1.e j() {
            return this.f15237l;
        }

        public final String k() {
            return this.f15243r;
        }

        public final String l() {
            return this.f15241p;
        }

        public final t m() {
            return this.f15235j;
        }

        public final i0 p() {
            return this.f15246u;
        }

        public final String q() {
            return this.f15244s;
        }

        public final String s() {
            return this.f15249x;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.l.e(dest, "dest");
            dest.writeString(this.f15235j.name());
            dest.writeStringList(new ArrayList(this.f15236k));
            dest.writeString(this.f15237l.name());
            dest.writeString(this.f15238m);
            dest.writeString(this.f15239n);
            dest.writeByte(this.f15240o ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15241p);
            dest.writeString(this.f15242q);
            dest.writeString(this.f15243r);
            dest.writeString(this.f15244s);
            dest.writeByte(this.f15245t ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15246u.name());
            dest.writeByte(this.f15247v ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f15248w ? (byte) 1 : (byte) 0);
            dest.writeString(this.f15249x);
            dest.writeString(this.f15250y);
            dest.writeString(this.f15251z);
            p1.a aVar = this.A;
            dest.writeString(aVar == null ? null : aVar.name());
        }

        public final Set<String> x() {
            return this.f15236k;
        }

        public final boolean z() {
            return this.f15245t;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Parcelable {

        /* renamed from: j  reason: collision with root package name */
        public final a f15253j;

        /* renamed from: k  reason: collision with root package name */
        public final p0.a f15254k;

        /* renamed from: l  reason: collision with root package name */
        public final p0.i f15255l;

        /* renamed from: m  reason: collision with root package name */
        public final String f15256m;

        /* renamed from: n  reason: collision with root package name */
        public final String f15257n;

        /* renamed from: o  reason: collision with root package name */
        public final e f15258o;

        /* renamed from: p  reason: collision with root package name */
        public Map<String, String> f15259p;

        /* renamed from: q  reason: collision with root package name */
        public Map<String, String> f15260q;

        /* renamed from: r  reason: collision with root package name */
        public static final c f15252r = new c(null);
        public static final Parcelable.Creator<f> CREATOR = new b();

        /* loaded from: classes.dex */
        public enum a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: j  reason: collision with root package name */
            private final String f15265j;

            a(String str) {
                this.f15265j = str;
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static a[] valuesCustom() {
                a[] valuesCustom = values();
                return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            public final String g() {
                return this.f15265j;
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements Parcelable.Creator<f> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel source) {
                kotlin.jvm.internal.l.e(source, "source");
                return new f(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class c {
            private c() {
            }

            public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
                this();
            }

            public static /* synthetic */ f d(c cVar, e eVar, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return cVar.c(eVar, str, str2, str3);
            }

            public final f a(e eVar, String str) {
                return new f(eVar, a.CANCEL, null, str, null);
            }

            public final f b(e eVar, p0.a aVar, p0.i iVar) {
                return new f(eVar, a.SUCCESS, aVar, iVar, null, null);
            }

            public final f c(e eVar, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new f(eVar, a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            public final f e(e eVar, p0.a token) {
                kotlin.jvm.internal.l.e(token, "token");
                return new f(eVar, a.SUCCESS, token, null, null);
            }
        }

        private f(Parcel parcel) {
            String readString = parcel.readString();
            this.f15253j = a.valueOf(readString == null ? "error" : readString);
            this.f15254k = (p0.a) parcel.readParcelable(p0.a.class.getClassLoader());
            this.f15255l = (p0.i) parcel.readParcelable(p0.i.class.getClassLoader());
            this.f15256m = parcel.readString();
            this.f15257n = parcel.readString();
            this.f15258o = (e) parcel.readParcelable(e.class.getClassLoader());
            f1.l0 l0Var = f1.l0.f8470a;
            this.f15259p = f1.l0.m0(parcel);
            this.f15260q = f1.l0.m0(parcel);
        }

        public /* synthetic */ f(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(e eVar, a code, p0.a aVar, String str, String str2) {
            this(eVar, code, aVar, null, str, str2);
            kotlin.jvm.internal.l.e(code, "code");
        }

        public f(e eVar, a code, p0.a aVar, p0.i iVar, String str, String str2) {
            kotlin.jvm.internal.l.e(code, "code");
            this.f15258o = eVar;
            this.f15254k = aVar;
            this.f15255l = iVar;
            this.f15256m = str;
            this.f15253j = code;
            this.f15257n = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.l.e(dest, "dest");
            dest.writeString(this.f15253j.name());
            dest.writeParcelable(this.f15254k, i10);
            dest.writeParcelable(this.f15255l, i10);
            dest.writeString(this.f15256m);
            dest.writeString(this.f15257n);
            dest.writeParcelable(this.f15258o, i10);
            f1.l0 l0Var = f1.l0.f8470a;
            f1.l0.B0(dest, this.f15259p);
            f1.l0.B0(dest, this.f15260q);
        }
    }

    public u(Parcel source) {
        kotlin.jvm.internal.l.e(source, "source");
        this.f15224k = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(f0.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i10];
            f0 f0Var = parcelable instanceof f0 ? (f0) parcelable : null;
            if (f0Var != null) {
                f0Var.s(this);
            }
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new f0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.f15223j = (f0[]) array;
        this.f15224k = source.readInt();
        this.f15229p = (e) source.readParcelable(e.class.getClassLoader());
        f1.l0 l0Var = f1.l0.f8470a;
        Map<String, String> m02 = f1.l0.m0(source);
        this.f15230q = m02 == null ? null : t9.g0.o(m02);
        Map<String, String> m03 = f1.l0.m0(source);
        this.f15231r = m03 != null ? t9.g0.o(m03) : null;
    }

    public u(Fragment fragment) {
        kotlin.jvm.internal.l.e(fragment, "fragment");
        this.f15224k = -1;
        I(fragment);
    }

    private final void B(String str, String str2, String str3, String str4, Map<String, String> map) {
        e eVar = this.f15229p;
        if (eVar == null) {
            x().n("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            x().c(eVar.b(), str, str2, str3, str4, map, eVar.C() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    private final void C(String str, f fVar, Map<String, String> map) {
        B(str, fVar.f15253j.g(), fVar.f15256m, fVar.f15257n, map);
    }

    private final void F(f fVar) {
        d dVar = this.f15226m;
        if (dVar == null) {
            return;
        }
        dVar.a(fVar);
    }

    private final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.f15230q;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.f15230q == null) {
            this.f15230q = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void k() {
        f(f.c.d(f.f15252r, this.f15229p, "Login attempt failed.", null, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (kotlin.jvm.internal.l.a(r1, r2 == null ? null : r2.a()) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p1.a0 x() {
        /*
            r3 = this;
            p1.a0 r0 = r3.f15232s
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.b()
            p1.u$e r2 = r3.f15229p
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.a()
        L12:
            boolean r1 = kotlin.jvm.internal.l.a(r1, r2)
            if (r1 != 0) goto L3a
        L18:
            p1.a0 r0 = new p1.a0
            androidx.fragment.app.e r1 = r3.l()
            if (r1 != 0) goto L26
            p0.f0 r1 = p0.f0.f14852a
            android.content.Context r1 = p0.f0.l()
        L26:
            p1.u$e r2 = r3.f15229p
            if (r2 != 0) goto L31
            p0.f0 r2 = p0.f0.f14852a
            java.lang.String r2 = p0.f0.m()
            goto L35
        L31:
            java.lang.String r2 = r2.a()
        L35:
            r0.<init>(r1, r2)
            r3.f15232s = r0
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.u.x():p1.a0");
    }

    public final void D() {
        a aVar = this.f15227n;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void E() {
        a aVar = this.f15227n;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final boolean G(int i10, int i11, Intent intent) {
        this.f15233t++;
        if (this.f15229p != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f3493s, false)) {
                M();
                return false;
            }
            f0 m10 = m();
            if (m10 != null && (!m10.x() || intent != null || this.f15233t >= this.f15234u)) {
                return m10.m(i10, i11, intent);
            }
        }
        return false;
    }

    public final void H(a aVar) {
        this.f15227n = aVar;
    }

    public final void I(Fragment fragment) {
        if (this.f15225l != null) {
            throw new p0.s("Can't set fragment once it is already set.");
        }
        this.f15225l = fragment;
    }

    public final void J(d dVar) {
        this.f15226m = dVar;
    }

    public final void K(e eVar) {
        if (s()) {
            return;
        }
        b(eVar);
    }

    public final boolean L() {
        f0 m10 = m();
        if (m10 == null) {
            return false;
        }
        if (m10.l() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        e eVar = this.f15229p;
        if (eVar == null) {
            return false;
        }
        int z10 = m10.z(eVar);
        this.f15233t = 0;
        a0 x10 = x();
        String b10 = eVar.b();
        if (z10 > 0) {
            x10.e(b10, m10.f(), eVar.C() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f15234u = z10;
        } else {
            x10.d(b10, m10.f(), eVar.C() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            a("not_tried", m10.f(), true);
        }
        return z10 > 0;
    }

    public final void M() {
        f0 m10 = m();
        if (m10 != null) {
            B(m10.f(), "skipped", null, null, m10.e());
        }
        f0[] f0VarArr = this.f15223j;
        while (f0VarArr != null) {
            int i10 = this.f15224k;
            if (i10 >= f0VarArr.length - 1) {
                break;
            }
            this.f15224k = i10 + 1;
            if (L()) {
                return;
            }
        }
        if (this.f15229p != null) {
            k();
        }
    }

    public final void N(f pendingResult) {
        f b10;
        kotlin.jvm.internal.l.e(pendingResult, "pendingResult");
        if (pendingResult.f15254k == null) {
            throw new p0.s("Can't validate without a token");
        }
        p0.a e10 = p0.a.f14786u.e();
        p0.a aVar = pendingResult.f15254k;
        if (e10 != null) {
            try {
                if (kotlin.jvm.internal.l.a(e10.x(), aVar.x())) {
                    b10 = f.f15252r.b(this.f15229p, pendingResult.f15254k, pendingResult.f15255l);
                    f(b10);
                }
            } catch (Exception e11) {
                f(f.c.d(f.f15252r, this.f15229p, "Caught exception", e11.getMessage(), null, 8, null));
                return;
            }
        }
        b10 = f.c.d(f.f15252r, this.f15229p, "User logged in as different Facebook user.", null, null, 8, null);
        f(b10);
    }

    public final void b(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f15229p != null) {
            throw new p0.s("Attempted to authorize while a request is pending.");
        }
        if (!p0.a.f14786u.g() || d()) {
            this.f15229p = eVar;
            this.f15223j = q(eVar);
            M();
        }
    }

    public final void c() {
        f0 m10 = m();
        if (m10 == null) {
            return;
        }
        m10.b();
    }

    public final boolean d() {
        if (this.f15228o) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.f15228o = true;
            return true;
        }
        androidx.fragment.app.e l10 = l();
        f(f.c.d(f.f15252r, this.f15229p, l10 == null ? null : l10.getString(d1.d.com_facebook_internet_permission_error_title), l10 != null ? l10.getString(d1.d.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e(String permission) {
        kotlin.jvm.internal.l.e(permission, "permission");
        androidx.fragment.app.e l10 = l();
        if (l10 == null) {
            return -1;
        }
        return l10.checkCallingOrSelfPermission(permission);
    }

    public final void f(f outcome) {
        kotlin.jvm.internal.l.e(outcome, "outcome");
        f0 m10 = m();
        if (m10 != null) {
            C(m10.f(), outcome, m10.e());
        }
        Map<String, String> map = this.f15230q;
        if (map != null) {
            outcome.f15259p = map;
        }
        Map<String, String> map2 = this.f15231r;
        if (map2 != null) {
            outcome.f15260q = map2;
        }
        this.f15223j = null;
        this.f15224k = -1;
        this.f15229p = null;
        this.f15230q = null;
        this.f15233t = 0;
        this.f15234u = 0;
        F(outcome);
    }

    public final void j(f outcome) {
        kotlin.jvm.internal.l.e(outcome, "outcome");
        if (outcome.f15254k == null || !p0.a.f14786u.g()) {
            f(outcome);
        } else {
            N(outcome);
        }
    }

    public final androidx.fragment.app.e l() {
        Fragment fragment = this.f15225l;
        if (fragment == null) {
            return null;
        }
        return fragment.n();
    }

    public final f0 m() {
        f0[] f0VarArr;
        int i10 = this.f15224k;
        if (i10 < 0 || (f0VarArr = this.f15223j) == null) {
            return null;
        }
        return f0VarArr[i10];
    }

    public final Fragment p() {
        return this.f15225l;
    }

    public f0[] q(e request) {
        Parcelable sVar;
        kotlin.jvm.internal.l.e(request, "request");
        ArrayList arrayList = new ArrayList();
        t m10 = request.m();
        if (!request.D()) {
            if (m10.i()) {
                arrayList.add(new q(this));
            }
            if (!p0.f0.f14870s && m10.l()) {
                sVar = new s(this);
                arrayList.add(sVar);
            }
        } else if (!p0.f0.f14870s && m10.k()) {
            sVar = new r(this);
            arrayList.add(sVar);
        }
        if (m10.g()) {
            arrayList.add(new p1.c(this));
        }
        if (m10.n()) {
            arrayList.add(new p0(this));
        }
        if (!request.D() && m10.h()) {
            arrayList.add(new n(this));
        }
        Object[] array = arrayList.toArray(new f0[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (f0[]) array;
    }

    public final boolean s() {
        return this.f15229p != null && this.f15224k >= 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeParcelableArray(this.f15223j, i10);
        dest.writeInt(this.f15224k);
        dest.writeParcelable(this.f15229p, i10);
        f1.l0 l0Var = f1.l0.f8470a;
        f1.l0.B0(dest, this.f15230q);
        f1.l0.B0(dest, this.f15231r);
    }

    public final e z() {
        return this.f15229p;
    }
}
