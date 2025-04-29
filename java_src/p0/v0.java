package p0;

import android.content.Intent;
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15053d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static volatile v0 f15054e;

    /* renamed from: a  reason: collision with root package name */
    private final e0.a f15055a;

    /* renamed from: b  reason: collision with root package name */
    private final u0 f15056b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f15057c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized v0 a() {
            v0 v0Var;
            if (v0.f15054e == null) {
                f0 f0Var = f0.f14852a;
                e0.a b10 = e0.a.b(f0.l());
                kotlin.jvm.internal.l.d(b10, "getInstance(applicationContext)");
                v0.f15054e = new v0(b10, new u0());
            }
            v0Var = v0.f15054e;
            if (v0Var == null) {
                kotlin.jvm.internal.l.p("instance");
                throw null;
            }
            return v0Var;
        }
    }

    public v0(e0.a localBroadcastManager, u0 profileCache) {
        kotlin.jvm.internal.l.e(localBroadcastManager, "localBroadcastManager");
        kotlin.jvm.internal.l.e(profileCache, "profileCache");
        this.f15055a = localBroadcastManager;
        this.f15056b = profileCache;
    }

    private final void e(t0 t0Var, t0 t0Var2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", t0Var);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", t0Var2);
        this.f15055a.d(intent);
    }

    private final void g(t0 t0Var, boolean z10) {
        t0 t0Var2 = this.f15057c;
        this.f15057c = t0Var;
        if (z10) {
            u0 u0Var = this.f15056b;
            if (t0Var != null) {
                u0Var.c(t0Var);
            } else {
                u0Var.a();
            }
        }
        f1.l0 l0Var = f1.l0.f8470a;
        if (f1.l0.e(t0Var2, t0Var)) {
            return;
        }
        e(t0Var2, t0Var);
    }

    public final t0 c() {
        return this.f15057c;
    }

    public final boolean d() {
        t0 b10 = this.f15056b.b();
        if (b10 != null) {
            g(b10, false);
            return true;
        }
        return false;
    }

    public final void f(t0 t0Var) {
        g(t0Var, true);
    }
}
