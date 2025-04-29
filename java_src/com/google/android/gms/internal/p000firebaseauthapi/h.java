package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import c4.s;
import com.google.firebase.auth.i0;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.s1;
import com.google.firebase.auth.z0;
import f4.a;
import java.util.concurrent.ScheduledExecutorService;
import w5.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h  reason: invalid package */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    private static final a f4666c = new a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a  reason: collision with root package name */
    private final rx f4667a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f4668b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar, ScheduledExecutorService scheduledExecutorService) {
        s.j(fVar);
        Context m10 = fVar.m();
        s.j(m10);
        this.f4667a = new rx(new v(fVar, u.a(), null, null, null));
        this.f4668b = new e1(m10, scheduledExecutorService);
    }

    private static boolean i(long j10, boolean z10) {
        if (j10 <= 0 || !z10) {
            f4666c.h("App hash will not be appended to the request.", new Object[0]);
            return false;
        }
        return true;
    }

    public final void A(ov ovVar, f fVar) {
        s.j(ovVar);
        s.f(ovVar.b());
        s.j(fVar);
        this.f4667a.N(ovVar.b(), ovVar.a(), new g(fVar, f4666c));
    }

    public final void B(pv pvVar, f fVar) {
        s.j(pvVar);
        s.f(pvVar.c());
        s.j(fVar);
        this.f4667a.O(pvVar.c(), pvVar.a(), pvVar.d(), pvVar.b(), new g(fVar, f4666c));
    }

    public final void C(qv qvVar, f fVar) {
        s.j(fVar);
        s.j(qvVar);
        t2 t2Var = (t2) s.j(qvVar.a());
        String c10 = t2Var.c();
        g gVar = new g(fVar, f4666c);
        if (this.f4668b.k(c10)) {
            if (!t2Var.e()) {
                this.f4668b.h(gVar, c10);
                return;
            }
            this.f4668b.i(c10);
        }
        long a10 = t2Var.a();
        boolean f10 = t2Var.f();
        if (i(a10, f10)) {
            t2Var.d(new j1(this.f4668b.b()));
        }
        this.f4668b.j(c10, gVar, a10, f10);
        this.f4667a.P(t2Var, new a1(this.f4668b, gVar, c10));
    }

    public final void D(String str, f fVar) {
        s.j(fVar);
        this.f4667a.Q(str, new g(fVar, f4666c));
    }

    public final void E(i3 i3Var, f fVar) {
        s.j(i3Var);
        s.j(fVar);
        this.f4667a.a(i3Var, new g(fVar, f4666c));
    }

    public final void F(l3 l3Var, f fVar) {
        s.j(l3Var);
        s.j(fVar);
        this.f4667a.b(l3Var, new g(fVar, f4666c));
    }

    public final void G(String str, String str2, String str3, String str4, f fVar) {
        s.f(str);
        s.f(str2);
        s.j(fVar);
        s.j(fVar);
        this.f4667a.c(str, str2, str3, str4, new g(fVar, f4666c));
    }

    public final void H(rv rvVar, f fVar) {
        s.j(rvVar);
        s.j(rvVar.a());
        s.j(fVar);
        this.f4667a.d(rvVar.a(), rvVar.b(), new g(fVar, f4666c));
    }

    public final void a(sv svVar, f fVar) {
        s.j(fVar);
        s.j(svVar);
        this.f4667a.e(t0.a((o0) s.j(svVar.a())), new g(fVar, f4666c));
    }

    public final void b(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, f fVar) {
        s.g(str, "idToken should not be empty.");
        s.j(fVar);
        g gVar = new g(fVar, f4666c);
        if (this.f4668b.k(str2)) {
            e1 e1Var = this.f4668b;
            if (!z10) {
                e1Var.h(gVar, str2);
                return;
            }
            e1Var.i(str2);
        }
        c3 a10 = c3.a(str, str2, str3, str4, str5, null);
        if (i(j10, z12)) {
            a10.c(new j1(this.f4668b.b()));
        }
        this.f4668b.j(str2, gVar, j10, z12);
        this.f4667a.m(a10, new a1(this.f4668b, gVar, str2));
    }

    public final void c(tv tvVar, f fVar) {
        s.j(tvVar);
        s.j(fVar);
        String j10 = tvVar.b().j();
        g gVar = new g(fVar, f4666c);
        if (this.f4668b.k(j10)) {
            if (!tvVar.g()) {
                this.f4668b.h(gVar, j10);
                return;
            }
            this.f4668b.i(j10);
        }
        long a10 = tvVar.a();
        boolean h10 = tvVar.h();
        a3 a11 = a3.a(tvVar.d(), tvVar.b().a(), tvVar.b().j(), tvVar.c(), tvVar.f(), tvVar.e());
        if (i(a10, h10)) {
            a11.c(new j1(this.f4668b.b()));
        }
        this.f4668b.j(j10, gVar, a10, h10);
        this.f4667a.f(a11, new a1(this.f4668b, gVar, j10));
    }

    public final void d(String str, String str2, String str3, f fVar) {
        s.g(str, "cachedTokenState should not be empty.");
        s.g(str2, "uid should not be empty.");
        s.j(fVar);
        this.f4667a.g(str, str2, str3, new g(fVar, f4666c));
    }

    public final void e(String str, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.h(str, new g(fVar, f4666c));
    }

    public final void f(String str, String str2, f fVar) {
        s.f(str);
        s.f(str2);
        s.j(fVar);
        this.f4667a.i(str, str2, new g(fVar, f4666c));
    }

    public final void g(String str, z0 z0Var, f fVar) {
        s.f(str);
        s.j(z0Var);
        s.j(fVar);
        this.f4667a.j(str, z0Var, new g(fVar, f4666c));
    }

    public final void h(uv uvVar, f fVar) {
        s.j(uvVar);
        this.f4667a.k(b2.b(uvVar.a(), uvVar.b(), uvVar.c()), new g(fVar, f4666c));
    }

    public final void j(String str, String str2, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.y(str, str2, new g(fVar, f4666c));
    }

    public final void k(String str, String str2, f fVar) {
        s.f(str);
        s.f(str2);
        s.j(fVar);
        this.f4667a.z(str, str2, new g(fVar, f4666c));
    }

    public final void l(String str, String str2, f fVar) {
        s.f(str);
        s.f(str2);
        s.j(fVar);
        this.f4667a.A(str, str2, new g(fVar, f4666c));
    }

    public final void m(String str, String str2, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.B(str, str2, new g(fVar, f4666c));
    }

    public final void n(kv kvVar, f fVar) {
        s.j(kvVar);
        s.f(kvVar.a());
        s.f(kvVar.b());
        s.j(fVar);
        this.f4667a.C(kvVar.a(), kvVar.b(), kvVar.c(), new g(fVar, f4666c));
    }

    public final void o(String str, String str2, String str3, String str4, f fVar) {
        s.f(str);
        s.f(str2);
        s.j(fVar);
        this.f4667a.D(str, str2, str3, str4, new g(fVar, f4666c));
    }

    public final void p(String str, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.E(str, new g(fVar, f4666c));
    }

    public final void q(i0 i0Var, String str, String str2, String str3, f fVar) {
        s.j(i0Var);
        s.g(str, "cachedTokenState should not be empty.");
        s.j(fVar);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            this.f4667a.l(t1.a(str, (String) s.j(a10.K()), (String) s.j(a10.E()), str2, null), str, new g(fVar, f4666c));
        } else if (!(i0Var instanceof s1)) {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        } else {
            throw new IllegalArgumentException("Not implemented");
        }
    }

    public final void r(String str, i0 i0Var, String str2, f fVar) {
        s.f(str);
        s.j(i0Var);
        s.j(fVar);
        if (i0Var instanceof r0) {
            o0 a10 = ((r0) i0Var).a();
            this.f4667a.n(u1.a(str, (String) s.j(a10.K()), (String) s.j(a10.E()), str2), new g(fVar, f4666c));
        } else if (!(i0Var instanceof s1)) {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        } else {
            s1 s1Var = (s1) i0Var;
            throw null;
        }
    }

    public final void s(String str, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.F(str, new g(fVar, f4666c));
    }

    public final void t(lv lvVar, f fVar) {
        s.j(lvVar);
        this.f4667a.G(d2.a(), new g(fVar, f4666c));
    }

    public final void u(String str, String str2, f fVar) {
        s.f(str);
        this.f4667a.H(str, str2, new g(fVar, f4666c));
    }

    public final void v(mv mvVar, f fVar) {
        s.j(mvVar);
        this.f4667a.I(h2.a(mvVar.b(), mvVar.a()), new g(fVar, f4666c));
    }

    public final void w(String str, String str2, String str3, f fVar) {
        s.f(str);
        s.f(str2);
        s.f(str3);
        s.j(fVar);
        this.f4667a.J(str, str2, str3, new g(fVar, f4666c));
    }

    public final void x(String str, i3 i3Var, f fVar) {
        s.f(str);
        s.j(i3Var);
        s.j(fVar);
        this.f4667a.K(str, i3Var, new g(fVar, f4666c));
    }

    public final void y(nv nvVar, f fVar) {
        s.j(fVar);
        s.j(nvVar);
        this.f4667a.L(s.f(nvVar.b()), t0.a((o0) s.j(nvVar.a())), new g(fVar, f4666c));
    }

    public final void z(String str, f fVar) {
        s.f(str);
        s.j(fVar);
        this.f4667a.M(str, new g(fVar, f4666c));
    }
}
