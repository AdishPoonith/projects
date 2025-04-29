package p0;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14807d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14808a;

    /* renamed from: b  reason: collision with root package name */
    private final C0222b f14809b;

    /* renamed from: c  reason: collision with root package name */
    private q0 f14810c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: p0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0222b {
        public final q0 a() {
            f0 f0Var = f0.f14852a;
            return new q0(f0.l(), null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r3 = this;
            p0.f0 r0 = p0.f0.f14852a
            android.content.Context r0 = p0.f0.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.l.d(r0, r1)
            p0.b$b r1 = new p0.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.<init>():void");
    }

    public b(SharedPreferences sharedPreferences, C0222b tokenCachingStrategyFactory) {
        kotlin.jvm.internal.l.e(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.l.e(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.f14808a = sharedPreferences;
        this.f14809b = tokenCachingStrategyFactory;
    }

    private final p0.a b() {
        String string = this.f14808a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return p0.a.f14786u.b(new JSONObject(string));
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    private final p0.a c() {
        Bundle c10 = d().c();
        if (c10 == null || !q0.f15003c.g(c10)) {
            return null;
        }
        return p0.a.f14786u.c(c10);
    }

    private final q0 d() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            if (this.f14810c == null) {
                synchronized (this) {
                    if (this.f14810c == null) {
                        this.f14810c = this.f14809b.a();
                    }
                    s9.u uVar = s9.u.f17878a;
                }
            }
            q0 q0Var = this.f14810c;
            if (q0Var != null) {
                return q0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f14808a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        f0 f0Var = f0.f14852a;
        return f0.G();
    }

    public final void a() {
        this.f14808a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final p0.a f() {
        if (e()) {
            return b();
        }
        if (h()) {
            p0.a c10 = c();
            if (c10 != null) {
                g(c10);
                d().a();
                return c10;
            }
            return c10;
        }
        return null;
    }

    public final void g(p0.a accessToken) {
        kotlin.jvm.internal.l.e(accessToken, "accessToken");
        try {
            this.f14808a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.B().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
