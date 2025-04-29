package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.g0;
import a6.q;
import a6.s1;
import a6.w1;
import a6.y0;
import a6.y1;
import android.app.Activity;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.h;
import com.google.firebase.auth.j;
import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.r0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w5.f;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e  reason: invalid package */
/* loaded from: classes.dex */
public final class e extends m0 {
    public e(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f4978a = new h(fVar, scheduledExecutorService);
        this.f4979b = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w1 r(f fVar, z1 z1Var) {
        s.j(fVar);
        s.j(z1Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s1(z1Var, "firebase"));
        List r10 = z1Var.r();
        if (r10 != null && !r10.isEmpty()) {
            for (int i10 = 0; i10 < r10.size(); i10++) {
                arrayList.add(new s1((o2) r10.get(i10)));
            }
        }
        w1 w1Var = new w1(fVar, arrayList);
        w1Var.m0(new y1(z1Var.b(), z1Var.a()));
        w1Var.l0(z1Var.t());
        w1Var.k0(z1Var.d());
        w1Var.e0(g0.b(z1Var.q()));
        return w1Var;
    }

    public final Task A(f fVar, a0 a0Var, r0 r0Var, String str, f1 f1Var) {
        x0.c();
        ay ayVar = new ay(r0Var, str, null);
        ayVar.e(fVar);
        ayVar.c(f1Var);
        if (a0Var != null) {
            ayVar.f(a0Var);
        }
        return a(ayVar);
    }

    public final Task B(f fVar, a0 a0Var, com.google.firebase.auth.s1 s1Var, String str, f1 f1Var, String str2) {
        ay ayVar = new ay(s1Var, str, str2);
        ayVar.e(fVar);
        ayVar.c(f1Var);
        if (a0Var != null) {
            ayVar.f(a0Var);
        }
        return a(ayVar);
    }

    public final Task C(f fVar, a0 a0Var, String str, y0 y0Var) {
        by byVar = new by(str);
        byVar.e(fVar);
        byVar.f(a0Var);
        byVar.c(y0Var);
        byVar.d(y0Var);
        return a(byVar);
    }

    public final Task D() {
        return a(new cy());
    }

    public final Task E(String str, String str2) {
        return a(new dy(str, "RECAPTCHA_ENTERPRISE"));
    }

    public final Task F(f fVar, a0 a0Var, h hVar, y0 y0Var) {
        s.j(fVar);
        s.j(hVar);
        s.j(a0Var);
        s.j(y0Var);
        List c02 = a0Var.c0();
        if (c02 == null || !c02.contains(hVar.B())) {
            if (hVar instanceof j) {
                j jVar = (j) hVar;
                if (jVar.J()) {
                    hy hyVar = new hy(jVar);
                    hyVar.e(fVar);
                    hyVar.f(a0Var);
                    hyVar.c(y0Var);
                    hyVar.d(y0Var);
                    return a(hyVar);
                }
                ey eyVar = new ey(jVar);
                eyVar.e(fVar);
                eyVar.f(a0Var);
                eyVar.c(y0Var);
                eyVar.d(y0Var);
                return a(eyVar);
            } else if (hVar instanceof o0) {
                x0.c();
                gy gyVar = new gy((o0) hVar);
                gyVar.e(fVar);
                gyVar.f(a0Var);
                gyVar.c(y0Var);
                gyVar.d(y0Var);
                return a(gyVar);
            } else {
                s.j(fVar);
                s.j(hVar);
                s.j(a0Var);
                s.j(y0Var);
                fy fyVar = new fy(hVar);
                fyVar.e(fVar);
                fyVar.f(a0Var);
                fyVar.c(y0Var);
                fyVar.d(y0Var);
                return a(fyVar);
            }
        }
        return Tasks.forException(i.a(new Status(17015)));
    }

    public final Task G(f fVar, a0 a0Var, h hVar, String str, y0 y0Var) {
        iy iyVar = new iy(hVar, str);
        iyVar.e(fVar);
        iyVar.f(a0Var);
        iyVar.c(y0Var);
        iyVar.d(y0Var);
        return a(iyVar);
    }

    public final Task H(f fVar, a0 a0Var, j jVar, String str, y0 y0Var) {
        ky kyVar = new ky(jVar, str);
        kyVar.e(fVar);
        kyVar.f(a0Var);
        kyVar.c(y0Var);
        kyVar.d(y0Var);
        return a(kyVar);
    }

    public final Task I(f fVar, a0 a0Var, String str, String str2, String str3, String str4, y0 y0Var) {
        ly lyVar = new ly(str, str2, str3, str4);
        lyVar.e(fVar);
        lyVar.f(a0Var);
        lyVar.c(y0Var);
        lyVar.d(y0Var);
        return a(lyVar);
    }

    public final Task J(f fVar, a0 a0Var, o0 o0Var, String str, y0 y0Var) {
        x0.c();
        my myVar = new my(o0Var, str);
        myVar.e(fVar);
        myVar.f(a0Var);
        myVar.c(y0Var);
        myVar.d(y0Var);
        return a(myVar);
    }

    public final Task K(f fVar, a0 a0Var, y0 y0Var) {
        ny nyVar = new ny();
        nyVar.e(fVar);
        nyVar.f(a0Var);
        nyVar.c(y0Var);
        nyVar.d(y0Var);
        return a(nyVar);
    }

    public final Task L(f fVar, com.google.firebase.auth.e eVar, String str) {
        oy oyVar = new oy(str, eVar);
        oyVar.e(fVar);
        return a(oyVar);
    }

    public final Task M(f fVar, String str, com.google.firebase.auth.e eVar, String str2, String str3) {
        eVar.O(1);
        py pyVar = new py(str, eVar, str2, str3, "sendPasswordResetEmail");
        pyVar.e(fVar);
        return a(pyVar);
    }

    public final Task N(f fVar, String str, com.google.firebase.auth.e eVar, String str2, String str3) {
        eVar.O(6);
        py pyVar = new py(str, eVar, str2, str3, "sendSignInLinkToEmail");
        pyVar.e(fVar);
        return a(pyVar);
    }

    public final Task b(f fVar, f1 f1Var, String str) {
        qy qyVar = new qy(str);
        qyVar.e(fVar);
        qyVar.c(f1Var);
        return a(qyVar);
    }

    public final Task c(f fVar, h hVar, String str, f1 f1Var) {
        ry ryVar = new ry(hVar, str);
        ryVar.e(fVar);
        ryVar.c(f1Var);
        return a(ryVar);
    }

    public final Task d(f fVar, String str, String str2, f1 f1Var) {
        sy syVar = new sy(str, str2);
        syVar.e(fVar);
        syVar.c(f1Var);
        return a(syVar);
    }

    public final Task e(f fVar, String str, String str2, String str3, String str4, f1 f1Var) {
        ty tyVar = new ty(str, str2, str3, str4);
        tyVar.e(fVar);
        tyVar.c(f1Var);
        return a(tyVar);
    }

    public final Task f(f fVar, j jVar, String str, f1 f1Var) {
        uy uyVar = new uy(jVar, str);
        uyVar.e(fVar);
        uyVar.c(f1Var);
        return a(uyVar);
    }

    public final Task g(f fVar, o0 o0Var, String str, f1 f1Var) {
        x0.c();
        vy vyVar = new vy(o0Var, str);
        vyVar.e(fVar);
        vyVar.c(f1Var);
        return a(vyVar);
    }

    public final Task h(a6.j jVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        wy wyVar = new wy(jVar, str, str2, j10, z10, z11, str3, str4, z12);
        wyVar.g(bVar, activity, executor, str);
        return a(wyVar);
    }

    public final Task i(a6.j jVar, t0 t0Var, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, q0.b bVar, Executor executor, Activity activity) {
        xy xyVar = new xy(t0Var, s.f(jVar.E()), str, j10, z10, z11, str2, str3, z12);
        xyVar.g(bVar, activity, executor, t0Var.a());
        return a(xyVar);
    }

    public final Task j(f fVar, a0 a0Var, String str, String str2, y0 y0Var) {
        yy yyVar = new yy(a0Var.b0(), str, str2);
        yyVar.e(fVar);
        yyVar.f(a0Var);
        yyVar.c(y0Var);
        yyVar.d(y0Var);
        return a(yyVar);
    }

    public final Task k(f fVar, a0 a0Var, String str, y0 y0Var) {
        s.j(fVar);
        s.f(str);
        s.j(a0Var);
        s.j(y0Var);
        List c02 = a0Var.c0();
        if ((c02 == null || c02.contains(str)) && !a0Var.H()) {
            if (((str.hashCode() == 1216985755 && str.equals("password")) ? (char) 0 : (char) 65535) != 0) {
                az azVar = new az(str);
                azVar.e(fVar);
                azVar.f(a0Var);
                azVar.c(y0Var);
                azVar.d(y0Var);
                return a(azVar);
            }
            zy zyVar = new zy();
            zyVar.e(fVar);
            zyVar.f(a0Var);
            zyVar.c(y0Var);
            zyVar.d(y0Var);
            return a(zyVar);
        }
        return Tasks.forException(i.a(new Status(17016, str)));
    }

    public final Task l(f fVar, a0 a0Var, String str, y0 y0Var) {
        bz bzVar = new bz(str);
        bzVar.e(fVar);
        bzVar.f(a0Var);
        bzVar.c(y0Var);
        bzVar.d(y0Var);
        return a(bzVar);
    }

    public final Task m(f fVar, a0 a0Var, String str, y0 y0Var) {
        cz czVar = new cz(str);
        czVar.e(fVar);
        czVar.f(a0Var);
        czVar.c(y0Var);
        czVar.d(y0Var);
        return a(czVar);
    }

    public final Task n(f fVar, a0 a0Var, o0 o0Var, y0 y0Var) {
        x0.c();
        dz dzVar = new dz(o0Var);
        dzVar.e(fVar);
        dzVar.f(a0Var);
        dzVar.c(y0Var);
        dzVar.d(y0Var);
        return a(dzVar);
    }

    public final Task o(f fVar, a0 a0Var, z0 z0Var, y0 y0Var) {
        ez ezVar = new ez(z0Var);
        ezVar.e(fVar);
        ezVar.f(a0Var);
        ezVar.c(y0Var);
        ezVar.d(y0Var);
        return a(ezVar);
    }

    public final Task p(String str, String str2, com.google.firebase.auth.e eVar) {
        eVar.O(7);
        return a(new fz(str, str2, eVar));
    }

    public final Task q(f fVar, String str, String str2) {
        c cVar = new c(str, str2);
        cVar.e(fVar);
        return a(cVar);
    }

    public final void s(f fVar, t2 t2Var, q0.b bVar, Activity activity, Executor executor) {
        d dVar = new d(t2Var);
        dVar.e(fVar);
        dVar.g(bVar, activity, executor, t2Var.c());
        a(dVar);
    }

    public final Task t(f fVar, String str, String str2) {
        tx txVar = new tx(str, str2);
        txVar.e(fVar);
        return a(txVar);
    }

    public final Task u(f fVar, String str, String str2) {
        ux uxVar = new ux(str, str2);
        uxVar.e(fVar);
        return a(uxVar);
    }

    public final Task v(f fVar, String str, String str2, String str3) {
        vx vxVar = new vx(str, str2, str3);
        vxVar.e(fVar);
        return a(vxVar);
    }

    public final Task w(f fVar, String str, String str2, String str3, String str4, f1 f1Var) {
        wx wxVar = new wx(str, str2, str3, str4);
        wxVar.e(fVar);
        wxVar.c(f1Var);
        return a(wxVar);
    }

    public final Task x(a0 a0Var, q qVar) {
        xx xxVar = new xx();
        xxVar.f(a0Var);
        xxVar.c(qVar);
        xxVar.d(qVar);
        return a(xxVar);
    }

    public final Task y(f fVar, String str, String str2) {
        yx yxVar = new yx(str, str2);
        yxVar.e(fVar);
        return a(yxVar);
    }

    public final Task z(f fVar, r0 r0Var, a0 a0Var, String str, f1 f1Var) {
        x0.c();
        zx zxVar = new zx(r0Var, a0Var.b0(), str, null);
        zxVar.e(fVar);
        zxVar.c(f1Var);
        return a(zxVar);
    }
}
