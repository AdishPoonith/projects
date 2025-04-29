package p0;

import android.content.SharedPreferences;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14916b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14917a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j() {
        /*
            r3 = this;
            p0.f0 r0 = p0.f0.f14852a
            android.content.Context r0 = p0.f0.l()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.l.d(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.j.<init>():void");
    }

    public j(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.l.e(sharedPreferences, "sharedPreferences");
        this.f14917a = sharedPreferences;
    }

    public final void a() {
        this.f14917a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(i authenticationToken) {
        kotlin.jvm.internal.l.e(authenticationToken, "authenticationToken");
        try {
            this.f14917a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
