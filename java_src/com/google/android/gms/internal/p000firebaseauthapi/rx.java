package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.a2;
import com.google.firebase.auth.e;
import com.google.firebase.auth.j;
import com.google.firebase.auth.z0;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rx  reason: invalid package */
/* loaded from: classes.dex */
public final class rx {

    /* renamed from: a  reason: collision with root package name */
    private final p0 f5309a;

    public rx(p0 p0Var) {
        this.f5309a = (p0) s.j(p0Var);
    }

    private final void o(String str, o0 o0Var) {
        s.j(o0Var);
        s.f(str);
        j2 D = j2.D(str);
        if (D.J()) {
            o0Var.zzb(D);
            return;
        }
        this.f5309a.d(new w1(D.F()), new qx(this, o0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(p1 p1Var, g gVar) {
        s.j(p1Var);
        s.j(gVar);
        this.f5309a.c(p1Var, new aw(this, gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(j2 j2Var, String str, String str2, Boolean bool, a2 a2Var, g gVar, n0 n0Var) {
        s.j(j2Var);
        s.j(n0Var);
        s.j(gVar);
        this.f5309a.e(new x1(j2Var.E()), new dw(this, n0Var, str2, str, bool, a2Var, gVar, j2Var));
    }

    private final void r(b2 b2Var, g gVar) {
        s.j(b2Var);
        s.j(gVar);
        this.f5309a.f(b2Var, new ix(this, gVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void v(rx rxVar, k3 k3Var, g gVar, n0 n0Var) {
        if (!k3Var.o()) {
            rxVar.q(new j2(k3Var.i(), k3Var.e(), Long.valueOf(k3Var.a()), "Bearer"), k3Var.h(), k3Var.g(), Boolean.valueOf(k3Var.n()), k3Var.b(), gVar, n0Var);
            return;
        }
        gVar.e(new vv(k3Var.m() ? new Status(17012) : l.a(k3Var.d()), k3Var.b(), k3Var.c(), k3Var.j()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void w(rx rxVar, g gVar, j2 j2Var, v2 v2Var, n0 n0Var) {
        s.j(gVar);
        s.j(j2Var);
        s.j(v2Var);
        s.j(n0Var);
        rxVar.f5309a.e(new x1(j2Var.E()), new bw(rxVar, n0Var, gVar, j2Var, v2Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void x(rx rxVar, g gVar, j2 j2Var, z1 z1Var, v2 v2Var, n0 n0Var) {
        s.j(gVar);
        s.j(j2Var);
        s.j(z1Var);
        s.j(v2Var);
        s.j(n0Var);
        rxVar.f5309a.k(v2Var, new cw(rxVar, v2Var, z1Var, gVar, j2Var, n0Var));
    }

    public final void A(String str, String str2, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        o(str, new ox(this, str2, gVar));
    }

    public final void B(String str, String str2, g gVar) {
        s.f(str);
        s.j(gVar);
        this.f5309a.i(new r2(str, null, str2), new gw(this, gVar));
    }

    public final void C(String str, String str2, String str3, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        this.f5309a.i(new r2(str, str2, str3), new iw(this, gVar));
    }

    public final void D(String str, String str2, String str3, String str4, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        this.f5309a.l(new x2(str, str2, null, str3, str4), new xv(this, gVar));
    }

    public final void E(String str, g gVar) {
        s.f(str);
        s.j(gVar);
        o(str, new hx(this, gVar));
    }

    public final void F(String str, g gVar) {
        s.f(str);
        s.j(gVar);
        this.f5309a.d(new w1(str), new hw(this, gVar));
    }

    public final void G(d2 d2Var, g gVar) {
        s.j(d2Var);
        s.j(gVar);
        this.f5309a.g(d2Var, new dx(this, gVar));
    }

    public final void H(String str, String str2, g gVar) {
        s.f(str);
        s.j(gVar);
        this.f5309a.a(new m1(str, str2), new ew(this, gVar));
    }

    public final void I(h2 h2Var, g gVar) {
        s.j(h2Var);
        s.j(gVar);
        this.f5309a.h(h2Var, new cx(this, gVar));
    }

    public final void J(String str, String str2, String str3, g gVar) {
        s.f(str);
        s.f(str2);
        s.f(str3);
        s.j(gVar);
        o(str3, new mw(this, str, str2, gVar));
    }

    public final void K(String str, i3 i3Var, g gVar) {
        s.f(str);
        s.j(i3Var);
        s.j(gVar);
        o(str, new qw(this, i3Var, gVar));
    }

    public final void L(String str, p3 p3Var, g gVar) {
        s.f(str);
        s.j(p3Var);
        s.j(gVar);
        o(str, new ow(this, p3Var, gVar));
    }

    public final void M(String str, g gVar) {
        s.f(str);
        s.j(gVar);
        o(str, new fx(this, gVar));
    }

    public final void N(String str, e eVar, g gVar) {
        s.f(str);
        s.j(gVar);
        b2 b2Var = new b2(4);
        b2Var.g(str);
        if (eVar != null) {
            b2Var.c(eVar);
        }
        r(b2Var, gVar);
    }

    public final void O(String str, e eVar, String str2, String str3, g gVar) {
        s.f(str);
        s.j(gVar);
        b2 b2Var = new b2(eVar.I());
        b2Var.e(str);
        b2Var.c(eVar);
        b2Var.f(str2);
        b2Var.d(str3);
        this.f5309a.f(b2Var, new fw(this, gVar));
    }

    public final void P(t2 t2Var, g gVar) {
        s.f(t2Var.c());
        s.j(gVar);
        this.f5309a.j(t2Var, new kw(this, gVar));
    }

    public final void Q(String str, g gVar) {
        s.j(gVar);
        this.f5309a.l(new x2(str), new lx(this, gVar));
    }

    public final void a(i3 i3Var, g gVar) {
        s.j(i3Var);
        s.j(gVar);
        i3Var.D(true);
        this.f5309a.n(i3Var, new kx(this, gVar));
    }

    public final void b(l3 l3Var, g gVar) {
        s.j(l3Var);
        s.j(gVar);
        this.f5309a.o(l3Var, new xw(this, gVar));
    }

    public final void c(String str, String str2, String str3, String str4, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        this.f5309a.p(new n3(str, str2, str3, str4), new yv(this, gVar));
    }

    public final void d(j jVar, String str, g gVar) {
        s.j(jVar);
        s.j(gVar);
        if (jVar.K()) {
            o(jVar.F(), new zv(this, jVar, str, gVar));
        } else {
            p(new p1(jVar, null, str), gVar);
        }
    }

    public final void e(p3 p3Var, g gVar) {
        s.j(p3Var);
        s.j(gVar);
        this.f5309a.q(p3Var, new lw(this, gVar));
    }

    public final void f(a3 a3Var, g gVar) {
        s.j(a3Var);
        s.j(gVar);
        this.f5309a.m(a3Var, new bx(this, gVar));
    }

    public final void g(String str, String str2, String str3, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        o(str, new vw(this, str2, str3, gVar));
    }

    public final void h(String str, g gVar) {
        s.f(str);
        s.j(gVar);
        o(str, new rw(this, gVar));
    }

    public final void i(String str, String str2, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        o(str2, new tw(this, str, gVar));
    }

    public final void j(String str, z0 z0Var, g gVar) {
        s.f(str);
        s.j(z0Var);
        s.j(gVar);
        o(str, new mx(this, z0Var, gVar));
    }

    public final void k(b2 b2Var, g gVar) {
        r(b2Var, gVar);
    }

    public final void l(t1 t1Var, String str, g gVar) {
        s.j(t1Var);
        s.j(gVar);
        o(str, new zw(this, t1Var, gVar));
    }

    public final void m(c3 c3Var, g gVar) {
        s.j(c3Var);
        s.j(gVar);
        this.f5309a.t(c3Var, new ww(this, gVar));
    }

    public final void n(u1 u1Var, g gVar) {
        s.j(u1Var);
        s.j(gVar);
        this.f5309a.u(u1Var, new ax(this, gVar));
    }

    public final void y(String str, String str2, g gVar) {
        s.f(str);
        s.j(gVar);
        v2 v2Var = new v2();
        v2Var.e(str);
        v2Var.h(str2);
        this.f5309a.k(v2Var, new px(this, gVar));
    }

    public final void z(String str, String str2, g gVar) {
        s.f(str);
        s.f(str2);
        s.j(gVar);
        o(str, new nx(this, str2, gVar));
    }
}
