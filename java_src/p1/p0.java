package p1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f1.q0;
import java.util.Objects;
import p1.u;
/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: o  reason: collision with root package name */
    private q0 f15183o;

    /* renamed from: p  reason: collision with root package name */
    private String f15184p;

    /* renamed from: q  reason: collision with root package name */
    private final String f15185q;

    /* renamed from: r  reason: collision with root package name */
    private final p0.h f15186r;

    /* renamed from: s  reason: collision with root package name */
    public static final c f15182s = new c(null);
    public static final Parcelable.Creator<p0> CREATOR = new b();

    /* loaded from: classes.dex */
    public final class a extends q0.a {

        /* renamed from: h  reason: collision with root package name */
        private String f15187h;

        /* renamed from: i  reason: collision with root package name */
        private t f15188i;

        /* renamed from: j  reason: collision with root package name */
        private i0 f15189j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f15190k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f15191l;

        /* renamed from: m  reason: collision with root package name */
        public String f15192m;

        /* renamed from: n  reason: collision with root package name */
        public String f15193n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p0 f15194o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0 this$0, Context context, String applicationId, Bundle parameters) {
            super(context, applicationId, "oauth", parameters);
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            kotlin.jvm.internal.l.e(parameters, "parameters");
            this.f15194o = this$0;
            this.f15187h = "fbconnect://success";
            this.f15188i = t.NATIVE_WITH_FALLBACK;
            this.f15189j = i0.FACEBOOK;
        }

        @Override // f1.q0.a
        public q0 a() {
            Bundle f10 = f();
            Objects.requireNonNull(f10, "null cannot be cast to non-null type android.os.Bundle");
            f10.putString("redirect_uri", this.f15187h);
            f10.putString("client_id", c());
            f10.putString("e2e", j());
            f10.putString("response_type", this.f15189j == i0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
            f10.putString("return_scopes", "true");
            f10.putString("auth_type", i());
            f10.putString("login_behavior", this.f15188i.name());
            if (this.f15190k) {
                f10.putString("fx_app", this.f15189j.toString());
            }
            if (this.f15191l) {
                f10.putString("skip_dedupe", "true");
            }
            q0.b bVar = q0.f8518v;
            Context d10 = d();
            Objects.requireNonNull(d10, "null cannot be cast to non-null type android.content.Context");
            return bVar.d(d10, "oauth", f10, g(), this.f15189j, e());
        }

        public final String i() {
            String str = this.f15193n;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.l.p("authType");
            throw null;
        }

        public final String j() {
            String str = this.f15192m;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.l.p("e2e");
            throw null;
        }

        public final a k(String authType) {
            kotlin.jvm.internal.l.e(authType, "authType");
            l(authType);
            return this;
        }

        public final void l(String str) {
            kotlin.jvm.internal.l.e(str, "<set-?>");
            this.f15193n = str;
        }

        public final a m(String e2e) {
            kotlin.jvm.internal.l.e(e2e, "e2e");
            n(e2e);
            return this;
        }

        public final void n(String str) {
            kotlin.jvm.internal.l.e(str, "<set-?>");
            this.f15192m = str;
        }

        public final a o(boolean z10) {
            this.f15190k = z10;
            return this;
        }

        public final a p(boolean z10) {
            this.f15187h = z10 ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a q(t loginBehavior) {
            kotlin.jvm.internal.l.e(loginBehavior, "loginBehavior");
            this.f15188i = loginBehavior;
            return this;
        }

        public final a r(i0 targetApp) {
            kotlin.jvm.internal.l.e(targetApp, "targetApp");
            this.f15189j = targetApp;
            return this;
        }

        public final a s(boolean z10) {
            this.f15191l = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<p0> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.e(source, "source");
            return new p0(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p0[] newArray(int i10) {
            return new p0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q0.e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u.e f15196b;

        d(u.e eVar) {
            this.f15196b = eVar;
        }

        @Override // f1.q0.e
        public void a(Bundle bundle, p0.s sVar) {
            p0.this.I(this.f15196b, bundle, sVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
        this.f15185q = "web_view";
        this.f15186r = p0.h.WEB_VIEW;
        this.f15184p = source.readString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
        this.f15185q = "web_view";
        this.f15186r = p0.h.WEB_VIEW;
    }

    @Override // p1.o0
    public p0.h E() {
        return this.f15186r;
    }

    public final void I(u.e request, Bundle bundle, p0.s sVar) {
        kotlin.jvm.internal.l.e(request, "request");
        super.G(request, bundle, sVar);
    }

    @Override // p1.f0
    public void b() {
        q0 q0Var = this.f15183o;
        if (q0Var != null) {
            if (q0Var != null) {
                q0Var.cancel();
            }
            this.f15183o = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p1.f0
    public String f() {
        return this.f15185q;
    }

    @Override // p1.f0
    public boolean l() {
        return true;
    }

    @Override // p1.f0, android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.l.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f15184p);
    }

    @Override // p1.f0
    public int z(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        Bundle C = C(request);
        d dVar = new d(request);
        String a10 = u.f15222v.a();
        this.f15184p = a10;
        a("e2e", a10);
        androidx.fragment.app.e l10 = d().l();
        if (l10 == null) {
            return 0;
        }
        f1.l0 l0Var = f1.l0.f8470a;
        boolean R = f1.l0.R(l10);
        a aVar = new a(this, l10, request.a(), C);
        String str = this.f15184p;
        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
        this.f15183o = aVar.m(str).p(R).k(request.c()).q(request.m()).r(request.p()).o(request.C()).s(request.L()).h(dVar).a();
        f1.i iVar = new f1.i();
        iVar.E1(true);
        iVar.c2(this.f15183o);
        iVar.U1(l10.F(), "FacebookDialogFragment");
        return 1;
    }
}
