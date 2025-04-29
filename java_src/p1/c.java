package p1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import org.json.JSONException;
import org.json.JSONObject;
import p1.d;
import p1.u;
/* loaded from: classes.dex */
public final class c extends o0 {

    /* renamed from: u  reason: collision with root package name */
    public static boolean f15089u;

    /* renamed from: o  reason: collision with root package name */
    private String f15090o;

    /* renamed from: p  reason: collision with root package name */
    private String f15091p;

    /* renamed from: q  reason: collision with root package name */
    private String f15092q;

    /* renamed from: r  reason: collision with root package name */
    private final String f15093r;

    /* renamed from: s  reason: collision with root package name */
    private final p0.h f15094s;

    /* renamed from: t  reason: collision with root package name */
    public static final b f15088t = new b(null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new c(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15093r = "custom_tab";
        this.f15094s = p0.h.CHROME_CUSTOM_TAB;
        this.f15091p = source.readString();
        f1.f fVar = f1.f.f8428a;
        this.f15092q = f1.f.c(K());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15093r = "custom_tab";
        this.f15094s = p0.h.CHROME_CUSTOM_TAB;
        f1.l0 l0Var = f1.l0.f8470a;
        this.f15091p = f1.l0.s(20);
        f15089u = false;
        f1.f fVar = f1.f.f8428a;
        this.f15092q = f1.f.c(K());
    }

    private final String J() {
        String str = this.f15090o;
        if (str != null) {
            return str;
        }
        f1.f fVar = f1.f.f8428a;
        String a10 = f1.f.a();
        this.f15090o = a10;
        return a10;
    }

    private final String K() {
        return super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(java.lang.String r7, final p1.u.e r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lcf
            java.lang.String r0 = "fbconnect://cct."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = ka.g.t(r7, r0, r1, r2, r3)
            if (r0 != 0) goto L17
            java.lang.String r0 = super.j()
            boolean r0 = ka.g.t(r7, r0, r1, r2, r3)
            if (r0 == 0) goto Lcf
        L17:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            f1.l0 r0 = f1.l0.f8470a
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = f1.l0.j0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = f1.l0.j0(r7)
            r0.putAll(r7)
            boolean r7 = r6.N(r0)
            if (r7 != 0) goto L41
            p0.s r7 = new p0.s
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.G(r8, r3, r7)
            return
        L41:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L4f
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L4f:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r0.getString(r1)
        L5d:
            if (r1 != 0) goto L65
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r0.getString(r1)
        L65:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = r0.getString(r2)
            r4 = -1
            if (r2 != 0) goto L6f
            goto L74
        L6f:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r2 = -1
        L75:
            f1.l0 r5 = f1.l0.f8470a
            boolean r5 = f1.l0.X(r7)
            if (r5 == 0) goto La0
            boolean r5 = f1.l0.X(r1)
            if (r5 == 0) goto La0
            if (r2 != r4) goto La0
            java.lang.String r7 = "access_token"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L91
            super.G(r8, r0, r3)
            return
        L91:
            p0.f0 r7 = p0.f0.f14852a
            java.util.concurrent.Executor r7 = p0.f0.t()
            p1.b r1 = new p1.b
            r1.<init>()
            r7.execute(r1)
            goto Lcf
        La0:
            if (r7 == 0) goto Lb8
            java.lang.String r0 = "access_denied"
            boolean r0 = kotlin.jvm.internal.l.a(r7, r0)
            if (r0 != 0) goto Lb2
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = kotlin.jvm.internal.l.a(r7, r0)
            if (r0 == 0) goto Lb8
        Lb2:
            p0.u r7 = new p0.u
            r7.<init>()
            goto Lcc
        Lb8:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r2 != r0) goto Lc2
            p0.u r7 = new p0.u
            r7.<init>()
            goto Lcc
        Lc2:
            p0.v r0 = new p0.v
            r0.<init>(r2, r7, r1)
            p0.h0 r7 = new p0.h0
            r7.<init>(r0, r1)
        Lcc:
            super.G(r8, r3, r7)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.L(java.lang.String, p1.u$e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(c this$0, u.e request, Bundle values) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(request, "$request");
        kotlin.jvm.internal.l.e(values, "$values");
        try {
            this$0.G(request, this$0.p(request, values), null);
        } catch (p0.s e10) {
            this$0.G(request, null, e10);
        }
    }

    private final boolean N(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return kotlin.jvm.internal.l.a(new JSONObject(string).getString("7_challenge"), this.f15091p);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // p1.o0
    protected String D() {
        return "chrome_custom_tab";
    }

    @Override // p1.o0
    public p0.h E() {
        return this.f15094s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15093r;
    }

    @Override // p1.f0
    protected String j() {
        return this.f15092q;
    }

    @Override // p1.f0
    public boolean m(int i10, int i11, Intent intent) {
        if ((intent == null || !intent.getBooleanExtra(CustomTabMainActivity.f3493s, false)) && i10 == 1) {
            u.e z10 = d().z();
            if (z10 == null) {
                return false;
            }
            if (i11 == -1) {
                L(intent != null ? intent.getStringExtra(CustomTabMainActivity.f3490p) : null, z10);
                return true;
            }
            super.G(z10, null, new p0.u());
            return false;
        }
        return super.m(i10, i11, intent);
    }

    @Override // p1.f0
    public void q(JSONObject param) {
        kotlin.jvm.internal.l.e(param, "param");
        param.put("7_challenge", this.f15091p);
    }

    @Override // p1.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f15091p);
    }

    @Override // p1.f0
    public int z(u.e request) {
        d.a aVar;
        Uri a10;
        kotlin.jvm.internal.l.e(request, "request");
        u d10 = d();
        if (j().length() == 0) {
            return 0;
        }
        Bundle B = B(C(request), request);
        if (f15089u) {
            B.putString("cct_over_app_switch", "1");
        }
        if (p0.f0.f14868q) {
            if (request.D()) {
                aVar = d.f15097k;
                a10 = f1.x.f8599c.a("oauth", B);
            } else {
                aVar = d.f15097k;
                a10 = f1.e.f8415b.a("oauth", B);
            }
            aVar.c(a10);
        }
        androidx.fragment.app.e l10 = d10.l();
        if (l10 == null) {
            return 0;
        }
        Intent intent = new Intent(l10, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f3487m, "oauth");
        intent.putExtra(CustomTabMainActivity.f3488n, B);
        intent.putExtra(CustomTabMainActivity.f3489o, J());
        intent.putExtra(CustomTabMainActivity.f3491q, request.p().toString());
        Fragment p10 = d10.p();
        if (p10 != null) {
            p10.startActivityForResult(intent, 1);
        }
        return 1;
    }
}
