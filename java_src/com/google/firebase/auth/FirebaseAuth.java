package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.q0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public abstract class FirebaseAuth implements a6.b {

    /* renamed from: a  reason: collision with root package name */
    private final w5.f f6456a;

    /* renamed from: b  reason: collision with root package name */
    private final List f6457b;

    /* renamed from: c  reason: collision with root package name */
    private final List f6458c;

    /* renamed from: d  reason: collision with root package name */
    private final List f6459d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.gms.internal.p000firebaseauthapi.e f6460e;

    /* renamed from: f  reason: collision with root package name */
    private a0 f6461f;

    /* renamed from: g  reason: collision with root package name */
    private final a6.v1 f6462g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f6463h;

    /* renamed from: i  reason: collision with root package name */
    private String f6464i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f6465j;

    /* renamed from: k  reason: collision with root package name */
    private String f6466k;

    /* renamed from: l  reason: collision with root package name */
    private a6.t0 f6467l;

    /* renamed from: m  reason: collision with root package name */
    private final RecaptchaAction f6468m;

    /* renamed from: n  reason: collision with root package name */
    private final RecaptchaAction f6469n;

    /* renamed from: o  reason: collision with root package name */
    private final RecaptchaAction f6470o;

    /* renamed from: p  reason: collision with root package name */
    private final a6.v0 f6471p;

    /* renamed from: q  reason: collision with root package name */
    private final a6.a1 f6472q;

    /* renamed from: r  reason: collision with root package name */
    private final a6.e1 f6473r;

    /* renamed from: s  reason: collision with root package name */
    private final s6.b f6474s;

    /* renamed from: t  reason: collision with root package name */
    private final s6.b f6475t;

    /* renamed from: u  reason: collision with root package name */
    private a6.x0 f6476u;

    /* renamed from: v  reason: collision with root package name */
    private final Executor f6477v;

    /* renamed from: w  reason: collision with root package name */
    private final Executor f6478w;

    /* renamed from: x  reason: collision with root package name */
    private final Executor f6479x;

    /* loaded from: classes.dex */
    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(w5.f fVar, s6.b bVar, s6.b bVar2, @x5.a Executor executor, @x5.b Executor executor2, @x5.c Executor executor3, @x5.c ScheduledExecutorService scheduledExecutorService, @x5.d Executor executor4) {
        com.google.android.gms.internal.p000firebaseauthapi.j2 b10;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar = new com.google.android.gms.internal.p000firebaseauthapi.e(fVar, executor2, scheduledExecutorService);
        a6.v0 v0Var = new a6.v0(fVar.m(), fVar.s());
        a6.a1 b11 = a6.a1.b();
        a6.e1 b12 = a6.e1.b();
        this.f6457b = new CopyOnWriteArrayList();
        this.f6458c = new CopyOnWriteArrayList();
        this.f6459d = new CopyOnWriteArrayList();
        this.f6463h = new Object();
        this.f6465j = new Object();
        this.f6468m = RecaptchaAction.custom("getOobCode");
        this.f6469n = RecaptchaAction.custom("signInWithPassword");
        this.f6470o = RecaptchaAction.custom("signUpPassword");
        this.f6456a = (w5.f) c4.s.j(fVar);
        this.f6460e = (com.google.android.gms.internal.p000firebaseauthapi.e) c4.s.j(eVar);
        a6.v0 v0Var2 = (a6.v0) c4.s.j(v0Var);
        this.f6471p = v0Var2;
        this.f6462g = new a6.v1();
        a6.a1 a1Var = (a6.a1) c4.s.j(b11);
        this.f6472q = a1Var;
        this.f6473r = (a6.e1) c4.s.j(b12);
        this.f6474s = bVar;
        this.f6475t = bVar2;
        this.f6477v = executor2;
        this.f6478w = executor3;
        this.f6479x = executor4;
        a0 a10 = v0Var2.a();
        this.f6461f = a10;
        if (a10 != null && (b10 = v0Var2.b(a10)) != null) {
            Z(this, this.f6461f, b10, false, false);
        }
        a1Var.d(this);
    }

    public static a6.x0 J(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f6476u == null) {
            firebaseAuth.f6476u = new a6.x0((w5.f) c4.s.j(firebaseAuth.f6456a));
        }
        return firebaseAuth.f6476u;
    }

    public static void X(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying auth state listeners about user ( " + a0Var.a() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f6479x.execute(new r2(firebaseAuth));
    }

    public static void Y(FirebaseAuth firebaseAuth, a0 a0Var) {
        String str;
        if (a0Var != null) {
            str = "Notifying id token listeners about user ( " + a0Var.a() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f6479x.execute(new q2(firebaseAuth, new t6.b(a0Var != null ? a0Var.a0() : null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Z(FirebaseAuth firebaseAuth, a0 a0Var, com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var, boolean z10, boolean z11) {
        boolean z12;
        c4.s.j(a0Var);
        c4.s.j(j2Var);
        boolean z13 = false;
        boolean z14 = true;
        boolean z15 = firebaseAuth.f6461f != null && a0Var.a().equals(firebaseAuth.f6461f.a());
        if (z15 || !z11) {
            a0 a0Var2 = firebaseAuth.f6461f;
            if (a0Var2 == null) {
                z12 = true;
            } else {
                z13 = (!z15 || (a0Var2.Z().E().equals(j2Var.E()) ^ true)) ? true : true;
                z12 = true ^ z15;
                z14 = z13;
            }
            c4.s.j(a0Var);
            if (firebaseAuth.f6461f == null || !a0Var.a().equals(firebaseAuth.a())) {
                firebaseAuth.f6461f = a0Var;
            } else {
                firebaseAuth.f6461f.Y(a0Var.F());
                if (!a0Var.H()) {
                    firebaseAuth.f6461f.X();
                }
                firebaseAuth.f6461f.e0(a0Var.E().b());
            }
            if (z10) {
                firebaseAuth.f6471p.d(firebaseAuth.f6461f);
            }
            if (z14) {
                a0 a0Var3 = firebaseAuth.f6461f;
                if (a0Var3 != null) {
                    a0Var3.d0(j2Var);
                }
                Y(firebaseAuth, firebaseAuth.f6461f);
            }
            if (z12) {
                X(firebaseAuth, firebaseAuth.f6461f);
            }
            if (z10) {
                firebaseAuth.f6471p.e(a0Var, j2Var);
            }
            a0 a0Var4 = firebaseAuth.f6461f;
            if (a0Var4 != null) {
                J(firebaseAuth).e(a0Var4.Z());
            }
        }
    }

    public static final void d0(final t tVar, p0 p0Var, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback with MissingActivity exception for phone number/uid - ".concat(String.valueOf(str)));
        final q0.b a10 = com.google.android.gms.internal.p000firebaseauthapi.x0.a(str, p0Var.e(), null);
        p0Var.i().execute(new Runnable() { // from class: com.google.firebase.auth.e2
            @Override // java.lang.Runnable
            public final void run() {
                q0.b.this.d(tVar);
            }
        });
    }

    private final Task e0(String str, String str2, String str3, a0 a0Var, boolean z10) {
        return new t2(this, str, z10, a0Var, str2, str3).b(this, str3, this.f6469n);
    }

    private final Task f0(j jVar, a0 a0Var, boolean z10) {
        return new u2(this, z10, a0Var, jVar).b(this, this.f6466k, this.f6468m);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) w5.f.o().k(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(w5.f fVar) {
        return (FirebaseAuth) fVar.k(FirebaseAuth.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0.b h0(String str, q0.b bVar) {
        a6.v1 v1Var = this.f6462g;
        return (v1Var.g() && str != null && str.equals(v1Var.d())) ? new h2(this, bVar) : bVar;
    }

    private final boolean i0(String str) {
        f c10 = f.c(str);
        return (c10 == null || TextUtils.equals(this.f6466k, c10.d())) ? false : true;
    }

    public Task<i> A(String str, String str2) {
        c4.s.f(str);
        c4.s.f(str2);
        return e0(str, str2, this.f6466k, null, false);
    }

    public final Task A0(String str, String str2, e eVar) {
        c4.s.f(str);
        c4.s.f(str2);
        if (eVar == null) {
            eVar = e.J();
        }
        String str3 = this.f6464i;
        if (str3 != null) {
            eVar.N(str3);
        }
        return this.f6460e.p(str, str2, eVar);
    }

    public Task<i> B(String str, String str2) {
        return y(k.b(str, str2));
    }

    public void C() {
        U();
        a6.x0 x0Var = this.f6476u;
        if (x0Var != null) {
            x0Var.c();
        }
    }

    public Task<i> D(Activity activity, n nVar) {
        c4.s.j(nVar);
        c4.s.j(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (this.f6472q.h(activity, taskCompletionSource, this)) {
            this.f6472q.f(activity.getApplicationContext(), this);
            nVar.c(activity);
            return taskCompletionSource.getTask();
        }
        return Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17057)));
    }

    public void E() {
        synchronized (this.f6463h) {
            this.f6464i = com.google.android.gms.internal.p000firebaseauthapi.x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q0.b E0(p0 p0Var, q0.b bVar) {
        return p0Var.k() ? bVar : new i2(this, p0Var, bVar);
    }

    public void F(String str, int i10) {
        c4.s.f(str);
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 65535) {
            z10 = true;
        }
        c4.s.b(z10, "Port number must be in the range 0-65535");
        com.google.android.gms.internal.p000firebaseauthapi.i1.f(this.f6456a, str, i10);
    }

    public Task<String> G(String str) {
        c4.s.f(str);
        return this.f6460e.q(this.f6456a, str, this.f6466k);
    }

    public final synchronized a6.t0 H() {
        return this.f6467l;
    }

    public final synchronized a6.x0 I() {
        return J(this);
    }

    public final s6.b K() {
        return this.f6474s;
    }

    public final s6.b L() {
        return this.f6475t;
    }

    public final Executor R() {
        return this.f6477v;
    }

    public final Executor S() {
        return this.f6478w;
    }

    public final Executor T() {
        return this.f6479x;
    }

    public final void U() {
        c4.s.j(this.f6471p);
        a0 a0Var = this.f6461f;
        if (a0Var != null) {
            a6.v0 v0Var = this.f6471p;
            c4.s.j(a0Var);
            v0Var.c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.a()));
            this.f6461f = null;
        }
        this.f6471p.c("com.google.firebase.auth.FIREBASE_USER");
        Y(this, null);
        X(this, null);
    }

    public final synchronized void V(a6.t0 t0Var) {
        this.f6467l = t0Var;
    }

    public final void W(a0 a0Var, com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var, boolean z10) {
        Z(this, a0Var, j2Var, true, false);
    }

    @Override // a6.b
    public final String a() {
        a0 a0Var = this.f6461f;
        if (a0Var == null) {
            return null;
        }
        return a0Var.a();
    }

    public final void a0(p0 p0Var) {
        String j10;
        String str;
        if (!p0Var.m()) {
            FirebaseAuth b10 = p0Var.b();
            String f10 = c4.s.f(p0Var.h());
            if (p0Var.d() == null && com.google.android.gms.internal.p000firebaseauthapi.x0.d(f10, p0Var.e(), p0Var.a(), p0Var.i())) {
                return;
            }
            b10.f6473r.a(b10, f10, p0Var.a(), b10.c0(), p0Var.k()).addOnCompleteListener(new f2(b10, p0Var, f10));
            return;
        }
        FirebaseAuth b11 = p0Var.b();
        if (((a6.j) c4.s.j(p0Var.c())).F()) {
            j10 = c4.s.f(p0Var.h());
            str = j10;
        } else {
            t0 t0Var = (t0) c4.s.j(p0Var.f());
            String f11 = c4.s.f(t0Var.a());
            j10 = t0Var.j();
            str = f11;
        }
        if (p0Var.d() == null || !com.google.android.gms.internal.p000firebaseauthapi.x0.d(str, p0Var.e(), p0Var.a(), p0Var.i())) {
            b11.f6473r.a(b11, j10, p0Var.a(), b11.c0(), p0Var.k()).addOnCompleteListener(new g2(b11, p0Var, str));
        }
    }

    @Override // a6.b
    public void b(a6.a aVar) {
        c4.s.j(aVar);
        this.f6458c.remove(aVar);
        I().d(this.f6458c.size());
    }

    public final void b0(p0 p0Var, String str, String str2) {
        long longValue = p0Var.g().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String f10 = c4.s.f(p0Var.h());
        com.google.android.gms.internal.p000firebaseauthapi.t2 t2Var = new com.google.android.gms.internal.p000firebaseauthapi.t2(f10, longValue, p0Var.d() != null, this.f6464i, this.f6466k, str, str2, c0());
        q0.b h02 = h0(f10, p0Var.e());
        this.f6460e.s(this.f6456a, t2Var, TextUtils.isEmpty(str) ? E0(p0Var, h02) : h02, p0Var.a(), p0Var.i());
    }

    @Override // a6.b
    public void c(a6.a aVar) {
        c4.s.j(aVar);
        this.f6458c.add(aVar);
        I().d(this.f6458c.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0() {
        return com.google.android.gms.internal.p000firebaseauthapi.n.a(l().m());
    }

    @Override // a6.b
    public final Task d(boolean z10) {
        return k0(this.f6461f, z10);
    }

    public void e(a aVar) {
        this.f6459d.add(aVar);
        this.f6479x.execute(new p2(this, aVar));
    }

    public void f(b bVar) {
        this.f6457b.add(bVar);
        this.f6479x.execute(new o2(this, bVar));
    }

    public Task<Void> g(String str) {
        c4.s.f(str);
        return this.f6460e.t(this.f6456a, str, this.f6466k);
    }

    public final Task g0(a0 a0Var) {
        c4.s.j(a0Var);
        return this.f6460e.x(a0Var, new n2(this, a0Var));
    }

    public Task<d> h(String str) {
        c4.s.f(str);
        return this.f6460e.u(this.f6456a, str, this.f6466k);
    }

    public Task<Void> i(String str, String str2) {
        c4.s.f(str);
        c4.s.f(str2);
        return this.f6460e.v(this.f6456a, str, str2, this.f6466k);
    }

    public Task<i> j(String str, String str2) {
        c4.s.f(str);
        c4.s.f(str2);
        return new j2(this, str, str2).b(this, this.f6466k, this.f6470o);
    }

    public final Task j0(a0 a0Var, i0 i0Var, String str) {
        c4.s.j(a0Var);
        c4.s.j(i0Var);
        return i0Var instanceof r0 ? this.f6460e.z(this.f6456a, (r0) i0Var, a0Var, str, new b1(this)) : Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17499)));
    }

    public Task<v0> k(String str) {
        c4.s.f(str);
        return this.f6460e.y(this.f6456a, str, this.f6466k);
    }

    public final Task k0(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            return Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17495)));
        }
        com.google.android.gms.internal.p000firebaseauthapi.j2 Z = a0Var.Z();
        return (!Z.J() || z10) ? this.f6460e.C(this.f6456a, a0Var, Z.F(), new s2(this)) : Tasks.forResult(a6.e0.a(Z.E()));
    }

    public w5.f l() {
        return this.f6456a;
    }

    public final Task l0() {
        return this.f6460e.D();
    }

    public a0 m() {
        return this.f6461f;
    }

    public final Task m0(String str) {
        return this.f6460e.E(this.f6466k, "RECAPTCHA_ENTERPRISE");
    }

    public w n() {
        return this.f6462g;
    }

    public final Task n0(a0 a0Var, h hVar) {
        c4.s.j(hVar);
        c4.s.j(a0Var);
        return this.f6460e.F(this.f6456a, a0Var, hVar.D(), new c1(this));
    }

    public String o() {
        String str;
        synchronized (this.f6463h) {
            str = this.f6464i;
        }
        return str;
    }

    public final Task o0(a0 a0Var, h hVar) {
        c4.s.j(a0Var);
        c4.s.j(hVar);
        h D = hVar.D();
        if (!(D instanceof j)) {
            return D instanceof o0 ? this.f6460e.J(this.f6456a, a0Var, (o0) D, this.f6466k, new c1(this)) : this.f6460e.G(this.f6456a, a0Var, D, a0Var.G(), new c1(this));
        }
        j jVar = (j) D;
        return "password".equals(jVar.C()) ? e0(jVar.G(), c4.s.f(jVar.H()), a0Var.G(), a0Var, true) : i0(c4.s.f(jVar.I())) ? Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17072))) : f0(jVar, a0Var, true);
    }

    public String p() {
        String str;
        synchronized (this.f6465j) {
            str = this.f6466k;
        }
        return str;
    }

    public final Task p0(a0 a0Var, a6.y0 y0Var) {
        c4.s.j(a0Var);
        return this.f6460e.K(this.f6456a, a0Var, y0Var);
    }

    public void q(a aVar) {
        this.f6459d.remove(aVar);
    }

    public final Task q0(i0 i0Var, a6.j jVar, a0 a0Var) {
        c4.s.j(i0Var);
        c4.s.j(jVar);
        if (i0Var instanceof r0) {
            return this.f6460e.A(this.f6456a, a0Var, (r0) i0Var, c4.s.f(jVar.E()), new b1(this));
        }
        if (i0Var instanceof s1) {
            return this.f6460e.B(this.f6456a, a0Var, (s1) i0Var, c4.s.f(jVar.E()), new b1(this), this.f6466k);
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public void r(b bVar) {
        this.f6457b.remove(bVar);
    }

    public final Task r0(e eVar, String str) {
        c4.s.f(str);
        if (this.f6464i != null) {
            if (eVar == null) {
                eVar = e.J();
            }
            eVar.N(this.f6464i);
        }
        return this.f6460e.L(this.f6456a, eVar, str);
    }

    public Task<Void> s(String str) {
        c4.s.f(str);
        return t(str, null);
    }

    public final Task s0(Activity activity, n nVar, a0 a0Var) {
        c4.s.j(activity);
        c4.s.j(nVar);
        c4.s.j(a0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (this.f6472q.i(activity, taskCompletionSource, this, a0Var)) {
            this.f6472q.g(activity.getApplicationContext(), this, a0Var);
            nVar.a(activity);
            return taskCompletionSource.getTask();
        }
        return Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17057)));
    }

    public Task<Void> t(String str, e eVar) {
        c4.s.f(str);
        if (eVar == null) {
            eVar = e.J();
        }
        String str2 = this.f6464i;
        if (str2 != null) {
            eVar.N(str2);
        }
        eVar.O(1);
        return new k2(this, str, eVar).b(this, this.f6466k, this.f6468m);
    }

    public final Task t0(Activity activity, n nVar, a0 a0Var) {
        c4.s.j(activity);
        c4.s.j(nVar);
        c4.s.j(a0Var);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (this.f6472q.i(activity, taskCompletionSource, this, a0Var)) {
            this.f6472q.g(activity.getApplicationContext(), this, a0Var);
            nVar.b(activity);
            return taskCompletionSource.getTask();
        }
        return Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17057)));
    }

    public Task<Void> u(String str, e eVar) {
        c4.s.f(str);
        c4.s.j(eVar);
        if (eVar.B()) {
            String str2 = this.f6464i;
            if (str2 != null) {
                eVar.N(str2);
            }
            return new l2(this, str, eVar).b(this, this.f6466k, this.f6468m);
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public final Task u0(a0 a0Var, String str) {
        c4.s.j(a0Var);
        c4.s.f(str);
        return this.f6460e.j(this.f6456a, a0Var, str, this.f6466k, new c1(this)).continueWithTask(new m2(this));
    }

    public void v(String str) {
        c4.s.f(str);
        synchronized (this.f6463h) {
            this.f6464i = str;
        }
    }

    public final Task v0(a0 a0Var, String str) {
        c4.s.f(str);
        c4.s.j(a0Var);
        return this.f6460e.k(this.f6456a, a0Var, str, new c1(this));
    }

    public void w(String str) {
        c4.s.f(str);
        synchronized (this.f6465j) {
            this.f6466k = str;
        }
    }

    public final Task w0(a0 a0Var, String str) {
        c4.s.j(a0Var);
        c4.s.f(str);
        return this.f6460e.l(this.f6456a, a0Var, str, new c1(this));
    }

    public Task<i> x() {
        a0 a0Var = this.f6461f;
        if (a0Var == null || !a0Var.H()) {
            return this.f6460e.b(this.f6456a, new b1(this), this.f6466k);
        }
        a6.w1 w1Var = (a6.w1) this.f6461f;
        w1Var.l0(false);
        return Tasks.forResult(new a6.q1(w1Var));
    }

    public final Task x0(a0 a0Var, String str) {
        c4.s.j(a0Var);
        c4.s.f(str);
        return this.f6460e.m(this.f6456a, a0Var, str, new c1(this));
    }

    public Task<i> y(h hVar) {
        c4.s.j(hVar);
        h D = hVar.D();
        if (D instanceof j) {
            j jVar = (j) D;
            return !jVar.J() ? e0(jVar.G(), (String) c4.s.j(jVar.H()), this.f6466k, null, false) : i0(c4.s.f(jVar.I())) ? Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17072))) : f0(jVar, null, false);
        } else if (D instanceof o0) {
            return this.f6460e.g(this.f6456a, (o0) D, this.f6466k, new b1(this));
        } else {
            return this.f6460e.c(this.f6456a, D, this.f6466k, new b1(this));
        }
    }

    public final Task y0(a0 a0Var, o0 o0Var) {
        c4.s.j(a0Var);
        c4.s.j(o0Var);
        return this.f6460e.n(this.f6456a, a0Var, o0Var.clone(), new c1(this));
    }

    public Task<i> z(String str) {
        c4.s.f(str);
        return this.f6460e.d(this.f6456a, str, this.f6466k, new b1(this));
    }

    public final Task z0(a0 a0Var, z0 z0Var) {
        c4.s.j(a0Var);
        c4.s.j(z0Var);
        return this.f6460e.o(this.f6456a, a0Var, z0Var, new c1(this));
    }
}
