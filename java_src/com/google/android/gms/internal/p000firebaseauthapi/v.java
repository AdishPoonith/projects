package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import c4.s;
import w5.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v  reason: invalid package */
/* loaded from: classes.dex */
final class v extends p0 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private p f5483a;

    /* renamed from: b  reason: collision with root package name */
    private q f5484b;

    /* renamed from: c  reason: collision with root package name */
    private u0 f5485c;

    /* renamed from: d  reason: collision with root package name */
    private final u f5486d;

    /* renamed from: e  reason: collision with root package name */
    private final f f5487e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5488f;

    /* renamed from: g  reason: collision with root package name */
    w f5489g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(f fVar, u uVar, u0 u0Var, p pVar, q qVar) {
        this.f5487e = fVar;
        String b10 = fVar.r().b();
        this.f5488f = b10;
        this.f5486d = (u) s.j(uVar);
        w(null, null, null);
        i1.e(b10, this);
    }

    private final w v() {
        if (this.f5489g == null) {
            f fVar = this.f5487e;
            this.f5489g = new w(fVar.m(), fVar, this.f5486d.b());
        }
        return this.f5489g;
    }

    private final void w(u0 u0Var, p pVar, q qVar) {
        this.f5485c = null;
        this.f5483a = null;
        this.f5484b = null;
        String a10 = f1.a("firebear.secureToken");
        if (TextUtils.isEmpty(a10)) {
            a10 = i1.d(this.f5488f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(a10)));
        }
        if (this.f5485c == null) {
            this.f5485c = new u0(a10, v());
        }
        String a11 = f1.a("firebear.identityToolkit");
        if (TextUtils.isEmpty(a11)) {
            a11 = i1.b(this.f5488f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(a11)));
        }
        if (this.f5483a == null) {
            this.f5483a = new p(a11, v());
        }
        String a12 = f1.a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(a12)) {
            a12 = i1.c(this.f5488f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(a12)));
        }
        if (this.f5484b == null) {
            this.f5484b = new q(a12, v());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void a(m1 m1Var, o0 o0Var) {
        s.j(m1Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/createAuthUri", this.f5488f), m1Var, o0Var, n1.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void b(o1 o1Var, o0 o0Var) {
        s.j(o1Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/deleteAccount", this.f5488f), o1Var, o0Var, Void.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void c(p1 p1Var, o0 o0Var) {
        s.j(p1Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/emailLinkSignin", this.f5488f), p1Var, o0Var, q1.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void d(w1 w1Var, o0 o0Var) {
        s.j(w1Var);
        s.j(o0Var);
        u0 u0Var = this.f5485c;
        r0.b(u0Var.a("/token", this.f5488f), w1Var, o0Var, j2.class, u0Var.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void e(x1 x1Var, o0 o0Var) {
        s.j(x1Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/getAccountInfo", this.f5488f), x1Var, o0Var, y1.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void f(b2 b2Var, o0 o0Var) {
        s.j(b2Var);
        s.j(o0Var);
        if (b2Var.a() != null) {
            v().b(b2Var.a().M());
        }
        p pVar = this.f5483a;
        r0.b(pVar.a("/getOobConfirmationCode", this.f5488f), b2Var, o0Var, c2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void g(d2 d2Var, o0 o0Var) {
        s.j(d2Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.a(pVar.a("/getRecaptchaParam", this.f5488f), o0Var, f2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void h(h2 h2Var, o0 o0Var) {
        s.j(h2Var);
        s.j(o0Var);
        q qVar = this.f5484b;
        String a10 = qVar.a("/recaptchaConfig", this.f5488f);
        String b10 = h2Var.b();
        String c10 = h2Var.c();
        r0.a(a10 + "&clientType=" + b10 + "&version=" + c10, o0Var, i2.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void i(r2 r2Var, o0 o0Var) {
        s.j(r2Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/resetPassword", this.f5488f), r2Var, o0Var, s2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void j(t2 t2Var, o0 o0Var) {
        s.j(t2Var);
        s.j(o0Var);
        if (!TextUtils.isEmpty(t2Var.b())) {
            v().b(t2Var.b());
        }
        p pVar = this.f5483a;
        r0.b(pVar.a("/sendVerificationCode", this.f5488f), t2Var, o0Var, u2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void k(v2 v2Var, o0 o0Var) {
        s.j(v2Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/setAccountInfo", this.f5488f), v2Var, o0Var, w2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void l(x2 x2Var, o0 o0Var) {
        s.j(x2Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/signupNewUser", this.f5488f), x2Var, o0Var, y2.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void m(a3 a3Var, o0 o0Var) {
        s.j(a3Var);
        s.j(o0Var);
        if (!TextUtils.isEmpty(a3Var.b())) {
            v().b(a3Var.b());
        }
        q qVar = this.f5484b;
        r0.b(qVar.a("/accounts/mfaSignIn:start", this.f5488f), a3Var, o0Var, b3.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void n(i3 i3Var, o0 o0Var) {
        s.j(i3Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/verifyAssertion", this.f5488f), i3Var, o0Var, k3.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void o(l3 l3Var, o0 o0Var) {
        s.j(l3Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/verifyCustomToken", this.f5488f), l3Var, o0Var, m3.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void p(n3 n3Var, o0 o0Var) {
        s.j(n3Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/verifyPassword", this.f5488f), n3Var, o0Var, o3.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void q(p3 p3Var, o0 o0Var) {
        s.j(p3Var);
        s.j(o0Var);
        p pVar = this.f5483a;
        r0.b(pVar.a("/verifyPhoneNumber", this.f5488f), p3Var, o0Var, q3.class, pVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void r(r3 r3Var, o0 o0Var) {
        s.j(r3Var);
        s.j(o0Var);
        q qVar = this.f5484b;
        r0.b(qVar.a("/accounts/mfaEnrollment:withdraw", this.f5488f), r3Var, o0Var, s3.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void s(t1 t1Var, o0 o0Var) {
        s.j(t1Var);
        s.j(o0Var);
        q qVar = this.f5484b;
        r0.b(qVar.a("/accounts/mfaEnrollment:finalize", this.f5488f), t1Var, o0Var, r1.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void t(c3 c3Var, o0 o0Var) {
        s.j(c3Var);
        s.j(o0Var);
        if (!TextUtils.isEmpty(c3Var.b())) {
            v().b(c3Var.b());
        }
        q qVar = this.f5484b;
        r0.b(qVar.a("/accounts/mfaEnrollment:start", this.f5488f), c3Var, o0Var, z2.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p0
    public final void u(u1 u1Var, o0 o0Var) {
        s.j(u1Var);
        s.j(o0Var);
        q qVar = this.f5484b;
        r0.b(qVar.a("/accounts/mfaSignIn:finalize", this.f5488f), u1Var, o0Var, s1.class, qVar.f5089b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.h1
    public final void zzi() {
        w(null, null, null);
    }
}
