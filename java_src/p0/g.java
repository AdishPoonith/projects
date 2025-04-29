package p0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.a;
import p0.g;
import p0.j0;
import p0.n0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f14876f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static g f14877g;

    /* renamed from: a  reason: collision with root package name */
    private final e0.a f14878a;

    /* renamed from: b  reason: collision with root package name */
    private final p0.b f14879b;

    /* renamed from: c  reason: collision with root package name */
    private p0.a f14880c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f14881d;

    /* renamed from: e  reason: collision with root package name */
    private Date f14882e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j0 c(p0.a aVar, j0.b bVar) {
            e f10 = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f10.b());
            bundle.putString("client_id", aVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            j0 x10 = j0.f14918n.x(aVar, f10.a(), bVar);
            x10.H(bundle);
            x10.G(p0.GET);
            return x10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j0 d(p0.a aVar, j0.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            j0 x10 = j0.f14918n.x(aVar, "me/permissions", bVar);
            x10.H(bundle);
            x10.G(p0.GET);
            return x10;
        }

        private final e f(p0.a aVar) {
            String l10 = aVar.l();
            if (l10 == null) {
                l10 = "facebook";
            }
            return kotlin.jvm.internal.l.a(l10, "instagram") ? new c() : new b();
        }

        public final g e() {
            g gVar;
            g gVar2 = g.f14877g;
            if (gVar2 == null) {
                synchronized (this) {
                    gVar = g.f14877g;
                    if (gVar == null) {
                        f0 f0Var = f0.f14852a;
                        e0.a b10 = e0.a.b(f0.l());
                        kotlin.jvm.internal.l.d(b10, "getInstance(applicationContext)");
                        g gVar3 = new g(b10, new p0.b());
                        a aVar = g.f14876f;
                        g.f14877g = gVar3;
                        gVar = gVar3;
                    }
                }
                return gVar;
            }
            return gVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f14883a = "oauth/access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f14884b = "fb_extend_sso_token";

        @Override // p0.g.e
        public String a() {
            return this.f14883a;
        }

        @Override // p0.g.e
        public String b() {
            return this.f14884b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f14885a = "refresh_access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f14886b = "ig_refresh_token";

        @Override // p0.g.e
        public String a() {
            return this.f14885a;
        }

        @Override // p0.g.e
        public String b() {
            return this.f14886b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f14887a;

        /* renamed from: b  reason: collision with root package name */
        private int f14888b;

        /* renamed from: c  reason: collision with root package name */
        private int f14889c;

        /* renamed from: d  reason: collision with root package name */
        private Long f14890d;

        /* renamed from: e  reason: collision with root package name */
        private String f14891e;

        public final String a() {
            return this.f14887a;
        }

        public final Long b() {
            return this.f14890d;
        }

        public final int c() {
            return this.f14888b;
        }

        public final int d() {
            return this.f14889c;
        }

        public final String e() {
            return this.f14891e;
        }

        public final void f(String str) {
            this.f14887a = str;
        }

        public final void g(Long l10) {
            this.f14890d = l10;
        }

        public final void h(int i10) {
            this.f14888b = i10;
        }

        public final void i(int i10) {
            this.f14889c = i10;
        }

        public final void j(String str) {
            this.f14891e = str;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        String a();

        String b();
    }

    public g(e0.a localBroadcastManager, p0.b accessTokenCache) {
        kotlin.jvm.internal.l.e(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.l.e(accessTokenCache, "accessTokenCache");
        this.f14878a = localBroadcastManager;
        this.f14879b = accessTokenCache;
        this.f14881d = new AtomicBoolean(false);
        this.f14882e = new Date(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(g this$0, a.InterfaceC0221a interfaceC0221a) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.m(interfaceC0221a);
    }

    private final void m(final a.InterfaceC0221a interfaceC0221a) {
        final p0.a i10 = i();
        if (i10 == null) {
            if (interfaceC0221a == null) {
                return;
            }
            interfaceC0221a.b(new s("No current access token to refresh"));
        } else if (!this.f14881d.compareAndSet(false, true)) {
            if (interfaceC0221a == null) {
                return;
            }
            interfaceC0221a.b(new s("Refresh already in progress"));
        } else {
            this.f14882e = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final d dVar = new d();
            a aVar = f14876f;
            n0 n0Var = new n0(aVar.d(i10, new j0.b() { // from class: p0.d
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    g.n(atomicBoolean, hashSet, hashSet2, hashSet3, o0Var);
                }
            }), aVar.c(i10, new j0.b() { // from class: p0.e
                @Override // p0.j0.b
                public final void b(o0 o0Var) {
                    g.o(g.d.this, o0Var);
                }
            }));
            n0Var.k(new n0.a() { // from class: p0.f
                @Override // p0.n0.a
                public final void b(n0 n0Var2) {
                    g.p(g.d.this, i10, interfaceC0221a, atomicBoolean, hashSet, hashSet2, hashSet3, this, n0Var2);
                }
            });
            n0Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, o0 response) {
        JSONArray optJSONArray;
        kotlin.jvm.internal.l.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.l.e(permissions, "$permissions");
        kotlin.jvm.internal.l.e(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.l.e(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.l.e(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null || (optJSONArray = d10.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int i10 = 0;
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString("status");
                f1.l0 l0Var = f1.l0.f8470a;
                if (!f1.l0.X(optString) && !f1.l0.X(status)) {
                    kotlin.jvm.internal.l.d(status, "status");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.l.d(US, "US");
                    String status2 = status.toLowerCase(US);
                    kotlin.jvm.internal.l.d(status2, "(this as java.lang.String).toLowerCase(locale)");
                    kotlin.jvm.internal.l.d(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode == -1309235419) {
                        if (status2.equals("expired")) {
                            expiredPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.l.k("Unexpected status: ", status2));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && status2.equals("declined")) {
                            declinedPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.l.k("Unexpected status: ", status2));
                    } else {
                        if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                        Log.w("AccessTokenManager", kotlin.jvm.internal.l.k("Unexpected status: ", status2));
                    }
                }
            }
            if (i11 >= length) {
                return;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(d refreshResult, o0 response) {
        kotlin.jvm.internal.l.e(refreshResult, "$refreshResult");
        kotlin.jvm.internal.l.e(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null) {
            return;
        }
        refreshResult.f(d10.optString("access_token"));
        refreshResult.h(d10.optInt("expires_at"));
        refreshResult.i(d10.optInt("expires_in"));
        refreshResult.g(Long.valueOf(d10.optLong("data_access_expiration_time")));
        refreshResult.j(d10.optString("graph_domain", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d refreshResult, p0.a aVar, a.InterfaceC0221a interfaceC0221a, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, g this$0, n0 it) {
        p0.a aVar2;
        kotlin.jvm.internal.l.e(refreshResult, "$refreshResult");
        kotlin.jvm.internal.l.e(permissionsCallSucceeded, "$permissionsCallSucceeded");
        kotlin.jvm.internal.l.e(permissions, "$permissions");
        kotlin.jvm.internal.l.e(declinedPermissions, "$declinedPermissions");
        kotlin.jvm.internal.l.e(expiredPermissions, "$expiredPermissions");
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(it, "it");
        String a10 = refreshResult.a();
        int c10 = refreshResult.c();
        Long b10 = refreshResult.b();
        String e10 = refreshResult.e();
        try {
            a aVar3 = f14876f;
            if (aVar3.e().i() != null) {
                p0.a i10 = aVar3.e().i();
                if ((i10 == null ? null : i10.x()) == aVar.x()) {
                    if (!permissionsCallSucceeded.get() && a10 == null && c10 == 0) {
                        if (interfaceC0221a != null) {
                            interfaceC0221a.b(new s("Failed to refresh access token"));
                        }
                        this$0.f14881d.set(false);
                        return;
                    }
                    Date k10 = aVar.k();
                    if (refreshResult.c() != 0) {
                        k10 = new Date(refreshResult.c() * 1000);
                    } else if (refreshResult.d() != 0) {
                        k10 = new Date((refreshResult.d() * 1000) + new Date().getTime());
                    }
                    Date date = k10;
                    if (a10 == null) {
                        a10 = aVar.s();
                    }
                    String str = a10;
                    String c11 = aVar.c();
                    String x10 = aVar.x();
                    Set<String> p10 = permissionsCallSucceeded.get() ? permissions : aVar.p();
                    Set<String> f10 = permissionsCallSucceeded.get() ? declinedPermissions : aVar.f();
                    Set<String> j10 = permissionsCallSucceeded.get() ? expiredPermissions : aVar.j();
                    h q10 = aVar.q();
                    Date date2 = new Date();
                    Date date3 = b10 != null ? new Date(b10.longValue() * 1000) : aVar.e();
                    if (e10 == null) {
                        e10 = aVar.l();
                    }
                    p0.a aVar4 = new p0.a(str, c11, x10, p10, f10, j10, q10, date, date2, date3, e10);
                    try {
                        aVar3.e().r(aVar4);
                        this$0.f14881d.set(false);
                        if (interfaceC0221a != null) {
                            interfaceC0221a.a(aVar4);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar4;
                        this$0.f14881d.set(false);
                        if (interfaceC0221a != null && aVar2 != null) {
                            interfaceC0221a.a(aVar2);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC0221a != null) {
                interfaceC0221a.b(new s("No current access token to refresh"));
            }
            this$0.f14881d.set(false);
        } catch (Throwable th2) {
            th = th2;
            aVar2 = null;
        }
    }

    private final void q(p0.a aVar, p0.a aVar2) {
        f0 f0Var = f0.f14852a;
        Intent intent = new Intent(f0.l(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f14878a.d(intent);
    }

    private final void s(p0.a aVar, boolean z10) {
        p0.a aVar2 = this.f14880c;
        this.f14880c = aVar;
        this.f14881d.set(false);
        this.f14882e = new Date(0L);
        if (z10) {
            p0.b bVar = this.f14879b;
            if (aVar != null) {
                bVar.g(aVar);
            } else {
                bVar.a();
                f1.l0 l0Var = f1.l0.f8470a;
                f0 f0Var = f0.f14852a;
                f1.l0.i(f0.l());
            }
        }
        f1.l0 l0Var2 = f1.l0.f8470a;
        if (f1.l0.e(aVar2, aVar)) {
            return;
        }
        q(aVar2, aVar);
        t();
    }

    private final void t() {
        f0 f0Var = f0.f14852a;
        Context l10 = f0.l();
        a.c cVar = p0.a.f14786u;
        p0.a e10 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l10.getSystemService("alarm");
        if (cVar.g()) {
            if ((e10 == null ? null : e10.k()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(l10, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, e10.k().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(l10, 0, intent, 67108864) : PendingIntent.getBroadcast(l10, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean u() {
        p0.a i10 = i();
        if (i10 == null) {
            return false;
        }
        long time = new Date().getTime();
        return i10.q().g() && time - this.f14882e.getTime() > 3600000 && time - i10.m().getTime() > 86400000;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final p0.a i() {
        return this.f14880c;
    }

    public final boolean j() {
        p0.a f10 = this.f14879b.f();
        if (f10 != null) {
            s(f10, false);
            return true;
        }
        return false;
    }

    public final void k(final a.InterfaceC0221a interfaceC0221a) {
        if (kotlin.jvm.internal.l.a(Looper.getMainLooper(), Looper.myLooper())) {
            m(interfaceC0221a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: p0.c
                @Override // java.lang.Runnable
                public final void run() {
                    g.l(g.this, interfaceC0221a);
                }
            });
        }
    }

    public final void r(p0.a aVar) {
        s(aVar, true);
    }
}
