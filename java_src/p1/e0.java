package p1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookActivity;
import f1.d;
import f1.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p0.s0;
import p0.t0;
import p1.u;
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: j  reason: collision with root package name */
    public static final b f15111j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<String> f15112k;

    /* renamed from: l  reason: collision with root package name */
    private static final String f15113l;

    /* renamed from: m  reason: collision with root package name */
    private static volatile e0 f15114m;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f15117c;

    /* renamed from: e  reason: collision with root package name */
    private String f15119e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15120f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15122h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15123i;

    /* renamed from: a  reason: collision with root package name */
    private t f15115a = t.NATIVE_WITH_FALLBACK;

    /* renamed from: b  reason: collision with root package name */
    private e f15116b = e.FRIENDS;

    /* renamed from: d  reason: collision with root package name */
    private String f15118d = "rerequest";

    /* renamed from: g  reason: collision with root package name */
    private i0 f15121g = i0.FACEBOOK;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements n0 {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f15124a;

        public a(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            this.f15124a = activity;
        }

        @Override // p1.n0
        public Activity a() {
            return this.f15124a;
        }

        @Override // p1.n0
        public void startActivityForResult(Intent intent, int i10) {
            kotlin.jvm.internal.l.e(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> e() {
            Set<String> f10;
            f10 = t9.m0.f("ads_management", "create_event", "rsvp_event");
            return f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str, String str2, String str3, a0 a0Var, s0 s0Var) {
            p0.s sVar = new p0.s(str + ": " + ((Object) str2));
            a0Var.i(str3, sVar);
            s0Var.b(sVar);
        }

        public final g0 c(u.e request, p0.a newToken, p0.i iVar) {
            List q10;
            Set S;
            List q11;
            Set S2;
            kotlin.jvm.internal.l.e(request, "request");
            kotlin.jvm.internal.l.e(newToken, "newToken");
            Set<String> x10 = request.x();
            q10 = t9.x.q(newToken.p());
            S = t9.x.S(q10);
            if (request.E()) {
                S.retainAll(x10);
            }
            q11 = t9.x.q(x10);
            S2 = t9.x.S(q11);
            S2.removeAll(S);
            return new g0(newToken, iVar, S, S2);
        }

        public e0 d() {
            if (e0.f15114m == null) {
                synchronized (this) {
                    b bVar = e0.f15111j;
                    e0.f15114m = new e0();
                    s9.u uVar = s9.u.f17878a;
                }
            }
            e0 e0Var = e0.f15114m;
            if (e0Var != null) {
                return e0Var;
            }
            kotlin.jvm.internal.l.p("instance");
            throw null;
        }

        public final boolean g(String str) {
            boolean t10;
            boolean t11;
            if (str != null) {
                t10 = ka.p.t(str, "publish", false, 2, null);
                if (!t10) {
                    t11 = ka.p.t(str, "manage", false, 2, null);
                    if (!t11 && !e0.f15112k.contains(str)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f15125a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static a0 f15126b;

        private c() {
        }

        public final synchronized a0 a(Context context) {
            if (context == null) {
                p0.f0 f0Var = p0.f0.f14852a;
                context = p0.f0.l();
            }
            if (context == null) {
                return null;
            }
            if (f15126b == null) {
                p0.f0 f0Var2 = p0.f0.f14852a;
                f15126b = new a0(context, p0.f0.m());
            }
            return f15126b;
        }
    }

    static {
        b bVar = new b(null);
        f15111j = bVar;
        f15112k = bVar.e();
        String cls = e0.class.toString();
        kotlin.jvm.internal.l.d(cls, "LoginManager::class.java.toString()");
        f15113l = cls;
    }

    public e0() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        p0.f0 f0Var = p0.f0.f14852a;
        SharedPreferences sharedPreferences = p0.f0.l().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.l.d(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f15117c = sharedPreferences;
        if (p0.f0.f14868q) {
            f1.f fVar = f1.f.f8428a;
            if (f1.f.a() != null) {
                q.c.a(p0.f0.l(), "com.android.chrome", new d());
                q.c.b(p0.f0.l(), p0.f0.l().getPackageName());
            }
        }
    }

    private final void B(n0 n0Var, u.e eVar) {
        p(n0Var.a(), eVar);
        f1.d.f8394b.c(d.c.Login.g(), new d.a() { // from class: p1.b0
            @Override // f1.d.a
            public final boolean a(int i10, Intent intent) {
                boolean C;
                C = e0.C(e0.this, i10, intent);
                return C;
            }
        });
        if (D(n0Var, eVar)) {
            return;
        }
        p0.s sVar = new p0.s("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        l(n0Var.a(), u.f.a.ERROR, null, sVar, false, eVar);
        throw sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(e0 this$0, int i10, Intent intent) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        return r(this$0, i10, intent, null, 4, null);
    }

    private final boolean D(n0 n0Var, u.e eVar) {
        Intent i10 = i(eVar);
        if (u(i10)) {
            try {
                n0Var.startActivityForResult(i10, u.f15222v.b());
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    private final void h(p0.a aVar, p0.i iVar, u.e eVar, p0.s sVar, boolean z10, p0.p<g0> pVar) {
        if (aVar != null) {
            p0.a.f14786u.h(aVar);
            t0.f15019q.a();
        }
        if (iVar != null) {
            p0.i.f14909o.a(iVar);
        }
        if (pVar != null) {
            g0 c10 = (aVar == null || eVar == null) ? null : f15111j.c(eVar, aVar, iVar);
            if (z10 || (c10 != null && c10.b().isEmpty())) {
                pVar.a();
            } else if (sVar != null) {
                pVar.c(sVar);
            } else if (aVar == null || c10 == null) {
            } else {
                z(true);
                pVar.onSuccess(c10);
            }
        }
    }

    public static e0 j() {
        return f15111j.d();
    }

    private final boolean k() {
        return this.f15117c.getBoolean("express_login_allowed", true);
    }

    private final void l(Context context, u.f.a aVar, Map<String, String> map, Exception exc, boolean z10, u.e eVar) {
        a0 a10 = c.f15125a.a(context);
        if (a10 == null) {
            return;
        }
        if (eVar == null) {
            a0.o(a10, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z10 ? "1" : "0");
        a10.f(eVar.b(), hashMap, aVar, map, exc, eVar.C() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    private final void p(Context context, u.e eVar) {
        a0 a10 = c.f15125a.a(context);
        if (a10 == null || eVar == null) {
            return;
        }
        a10.m(eVar, eVar.C() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean r(e0 e0Var, int i10, Intent intent, p0.p pVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                pVar = null;
            }
            return e0Var.q(i10, intent, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(e0 this$0, p0.p pVar, int i10, Intent intent) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        return this$0.q(i10, intent, pVar);
    }

    private final boolean u(Intent intent) {
        p0.f0 f0Var = p0.f0.f14852a;
        return p0.f0.l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private final void x(Context context, final s0 s0Var, long j10) {
        p0.f0 f0Var = p0.f0.f14852a;
        final String m10 = p0.f0.m();
        final String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.d(uuid, "randomUUID().toString()");
        final a0 a0Var = new a0(context == null ? p0.f0.l() : context, m10);
        if (!k()) {
            a0Var.j(uuid);
            s0Var.a();
            return;
        }
        h0 a10 = h0.f15142w.a(context, m10, uuid, p0.f0.w(), j10, null);
        a10.g(new f0.b() { // from class: p1.d0
            @Override // f1.f0.b
            public final void a(Bundle bundle) {
                e0.y(uuid, a0Var, s0Var, m10, bundle);
            }
        });
        a0Var.k(uuid);
        if (a10.h()) {
            return;
        }
        a0Var.j(uuid);
        s0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(String loggerRef, a0 logger, s0 responseCallback, String applicationId, Bundle bundle) {
        kotlin.jvm.internal.l.e(loggerRef, "$loggerRef");
        kotlin.jvm.internal.l.e(logger, "$logger");
        kotlin.jvm.internal.l.e(responseCallback, "$responseCallback");
        kotlin.jvm.internal.l.e(applicationId, "$applicationId");
        if (bundle != null) {
            String string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            String string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            if (string != null) {
                f15111j.f(string, string2, loggerRef, logger, responseCallback);
                return;
            }
            String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            f1.l0 l0Var = f1.l0.f8470a;
            Date w10 = f1.l0.w(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string4 = bundle.getString("signed request");
            String string5 = bundle.getString("graph_domain");
            Date w11 = f1.l0.w(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            boolean z10 = false;
            String e10 = string4 == null || string4.length() == 0 ? null : f0.f15128l.e(string4);
            if (!(string3 == null || string3.length() == 0)) {
                if (!(stringArrayList == null || stringArrayList.isEmpty())) {
                    if (!((e10 == null || e10.length() == 0) ? true : true)) {
                        p0.a aVar = new p0.a(string3, applicationId, e10, stringArrayList, null, null, null, w10, null, w11, string5);
                        p0.a.f14786u.h(aVar);
                        t0.f15019q.a();
                        logger.l(loggerRef);
                        responseCallback.c(aVar);
                        return;
                    }
                }
            }
        }
        logger.j(loggerRef);
        responseCallback.a();
    }

    private final void z(boolean z10) {
        SharedPreferences.Editor edit = this.f15117c.edit();
        edit.putBoolean("express_login_allowed", z10);
        edit.apply();
    }

    public final e0 A(t loginBehavior) {
        kotlin.jvm.internal.l.e(loginBehavior, "loginBehavior");
        this.f15115a = loginBehavior;
        return this;
    }

    protected u.e g(v loginConfig) {
        String a10;
        Set T;
        kotlin.jvm.internal.l.e(loginConfig, "loginConfig");
        p1.a aVar = p1.a.S256;
        try {
            m0 m0Var = m0.f15174a;
            a10 = m0.b(loginConfig.a(), aVar);
        } catch (p0.s unused) {
            aVar = p1.a.PLAIN;
            a10 = loginConfig.a();
        }
        String str = a10;
        t tVar = this.f15115a;
        T = t9.x.T(loginConfig.c());
        e eVar = this.f15116b;
        String str2 = this.f15118d;
        p0.f0 f0Var = p0.f0.f14852a;
        String m10 = p0.f0.m();
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.d(uuid, "randomUUID().toString()");
        u.e eVar2 = new u.e(tVar, T, eVar, str2, m10, uuid, this.f15121g, loginConfig.b(), loginConfig.a(), str, aVar);
        eVar2.I(p0.a.f14786u.g());
        eVar2.G(this.f15119e);
        eVar2.J(this.f15120f);
        eVar2.F(this.f15122h);
        eVar2.K(this.f15123i);
        return eVar2;
    }

    protected Intent i(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        Intent intent = new Intent();
        p0.f0 f0Var = p0.f0.f14852a;
        intent.setClass(p0.f0.l(), FacebookActivity.class);
        intent.setAction(request.m().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void m(Activity activity, Collection<String> collection) {
        kotlin.jvm.internal.l.e(activity, "activity");
        n(activity, new v(collection, null, 2, null));
    }

    public final void n(Activity activity, v loginConfig) {
        kotlin.jvm.internal.l.e(activity, "activity");
        kotlin.jvm.internal.l.e(loginConfig, "loginConfig");
        if (activity instanceof androidx.activity.result.d) {
            Log.w(f15113l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        B(new a(activity), g(loginConfig));
    }

    public void o() {
        p0.a.f14786u.h(null);
        p0.i.f14909o.a(null);
        t0.f15019q.c(null);
        z(false);
    }

    public boolean q(int i10, Intent intent, p0.p<g0> pVar) {
        u.f.a aVar;
        p0.a aVar2;
        p0.i iVar;
        u.e eVar;
        Map<String, String> map;
        boolean z10;
        p0.i iVar2;
        u.f.a aVar3 = u.f.a.ERROR;
        p0.s sVar = null;
        boolean z11 = false;
        if (intent != null) {
            intent.setExtrasClassLoader(u.f.class.getClassLoader());
            u.f fVar = (u.f) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (fVar != null) {
                eVar = fVar.f15258o;
                u.f.a aVar4 = fVar.f15253j;
                if (i10 != -1) {
                    if (i10 != 0) {
                        aVar2 = null;
                        iVar2 = null;
                    } else {
                        aVar2 = null;
                        iVar2 = null;
                        z11 = true;
                    }
                } else if (aVar4 == u.f.a.SUCCESS) {
                    aVar2 = fVar.f15254k;
                    iVar2 = fVar.f15255l;
                } else {
                    iVar2 = null;
                    sVar = new p0.o(fVar.f15256m);
                    aVar2 = null;
                }
                map = fVar.f15259p;
                z10 = z11;
                iVar = iVar2;
                aVar = aVar4;
            }
            aVar = aVar3;
            aVar2 = null;
            iVar = null;
            eVar = null;
            map = null;
            z10 = false;
        } else {
            if (i10 == 0) {
                aVar = u.f.a.CANCEL;
                aVar2 = null;
                iVar = null;
                eVar = null;
                map = null;
                z10 = true;
            }
            aVar = aVar3;
            aVar2 = null;
            iVar = null;
            eVar = null;
            map = null;
            z10 = false;
        }
        if (sVar == null && aVar2 == null && !z10) {
            sVar = new p0.s("Unexpected call to LoginManager.onActivityResult");
        }
        p0.s sVar2 = sVar;
        u.e eVar2 = eVar;
        l(null, aVar, map, sVar2, true, eVar2);
        h(aVar2, iVar, eVar2, sVar2, z10, pVar);
        return true;
    }

    public final void s(p0.n nVar, final p0.p<g0> pVar) {
        if (!(nVar instanceof f1.d)) {
            throw new p0.s("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((f1.d) nVar).c(d.c.Login.g(), new d.a() { // from class: p1.c0
            @Override // f1.d.a
            public final boolean a(int i10, Intent intent) {
                boolean t10;
                t10 = e0.t(e0.this, pVar, i10, intent);
                return t10;
            }
        });
    }

    public final void v(Context context, long j10, s0 responseCallback) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(responseCallback, "responseCallback");
        x(context, responseCallback, j10);
    }

    public final void w(Context context, s0 responseCallback) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(responseCallback, "responseCallback");
        v(context, 5000L, responseCallback);
    }
}
