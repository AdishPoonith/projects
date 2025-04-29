package p1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import p1.f0;
import p1.u;
/* loaded from: classes.dex */
public abstract class o0 extends f0 {

    /* renamed from: n  reason: collision with root package name */
    public static final a f15178n = new a(null);

    /* renamed from: m  reason: collision with root package name */
    private String f15179m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Parcel source) {
        super(source);
        kotlin.jvm.internal.l.e(source, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u loginClient) {
        super(loginClient);
        kotlin.jvm.internal.l.e(loginClient, "loginClient");
    }

    private final String F() {
        Context l10 = d().l();
        if (l10 == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            l10 = p0.f0.l();
        }
        return l10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private final void H(String str) {
        Context l10 = d().l();
        if (l10 == null) {
            p0.f0 f0Var = p0.f0.f14852a;
            l10 = p0.f0.l();
        }
        l10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle B(Bundle parameters, u.e request) {
        String a10;
        String str;
        String str2;
        kotlin.jvm.internal.l.e(parameters, "parameters");
        kotlin.jvm.internal.l.e(request, "request");
        parameters.putString("redirect_uri", j());
        if (request.D()) {
            a10 = request.a();
            str = "app_id";
        } else {
            a10 = request.a();
            str = "client_id";
        }
        parameters.putString(str, a10);
        parameters.putString("e2e", u.f15222v.a());
        if (request.D()) {
            str2 = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (request.x().contains("openid")) {
                parameters.putString("nonce", request.s());
            }
            str2 = "id_token,token,signed_request,graph_domain";
        }
        parameters.putString("response_type", str2);
        parameters.putString("code_challenge", request.d());
        p1.a e10 = request.e();
        parameters.putString("code_challenge_method", e10 == null ? null : e10.name());
        parameters.putString("return_scopes", "true");
        parameters.putString("auth_type", request.c());
        parameters.putString("login_behavior", request.m().name());
        p0.f0 f0Var = p0.f0.f14852a;
        parameters.putString("sdk", kotlin.jvm.internal.l.k("android-", p0.f0.B()));
        if (D() != null) {
            parameters.putString("sso", D());
        }
        parameters.putString("cct_prefetching", p0.f0.f14868q ? "1" : "0");
        if (request.C()) {
            parameters.putString("fx_app", request.p().toString());
        }
        if (request.L()) {
            parameters.putString("skip_dedupe", "true");
        }
        if (request.q() != null) {
            parameters.putString("messenger_page_id", request.q());
            parameters.putString("reset_messenger_state", request.z() ? "1" : "0");
        }
        return parameters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle C(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        Bundle bundle = new Bundle();
        f1.l0 l0Var = f1.l0.f8470a;
        if (!f1.l0.Y(request.x())) {
            String join = TextUtils.join(",", request.x());
            bundle.putString("scope", join);
            a("scope", join);
        }
        e j10 = request.j();
        if (j10 == null) {
            j10 = e.NONE;
        }
        bundle.putString("default_audience", j10.g());
        bundle.putString("state", c(request.b()));
        p0.a e10 = p0.a.f14786u.e();
        String s10 = e10 == null ? null : e10.s();
        if (s10 == null || !kotlin.jvm.internal.l.a(s10, F())) {
            androidx.fragment.app.e l10 = d().l();
            if (l10 != null) {
                f1.l0.i(l10);
            }
            a("access_token", "0");
        } else {
            bundle.putString("access_token", s10);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        p0.f0 f0Var = p0.f0.f14852a;
        bundle.putString("ies", p0.f0.p() ? "1" : "0");
        return bundle;
    }

    protected String D() {
        return null;
    }

    public abstract p0.h E();

    public void G(u.e request, Bundle bundle, p0.s sVar) {
        String str;
        u.f c10;
        kotlin.jvm.internal.l.e(request, "request");
        u d10 = d();
        this.f15179m = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f15179m = bundle.getString("e2e");
            }
            try {
                f0.a aVar = f0.f15128l;
                p0.a b10 = aVar.b(request.x(), bundle, E(), request.a());
                c10 = u.f.f15252r.b(d10.z(), b10, aVar.d(bundle, request.s()));
                if (d10.l() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.l()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        H(b10.s());
                    }
                }
            } catch (p0.s e10) {
                c10 = u.f.c.d(u.f.f15252r, d10.z(), null, e10.getMessage(), null, 8, null);
            }
        } else if (sVar instanceof p0.u) {
            c10 = u.f.f15252r.a(d10.z(), "User canceled log in.");
        } else {
            this.f15179m = null;
            String message = sVar == null ? null : sVar.getMessage();
            if (sVar instanceof p0.h0) {
                p0.v c11 = ((p0.h0) sVar).c();
                str = String.valueOf(c11.b());
                message = c11.toString();
            } else {
                str = null;
            }
            c10 = u.f.f15252r.c(d10.z(), null, message, str);
        }
        f1.l0 l0Var = f1.l0.f8470a;
        if (!f1.l0.X(this.f15179m)) {
            k(this.f15179m);
        }
        d10.j(c10);
    }
}
