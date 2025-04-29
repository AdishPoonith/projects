package p0;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15029b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f15030a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public u0() {
        f0 f0Var = f0.f14852a;
        SharedPreferences sharedPreferences = f0.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.l.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f15030a = sharedPreferences;
    }

    public final void a() {
        this.f15030a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final t0 b() {
        String string = this.f15030a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new t0(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(t0 profile) {
        kotlin.jvm.internal.l.e(profile, "profile");
        JSONObject b10 = profile.b();
        if (b10 != null) {
            this.f15030a.edit().putString("com.facebook.ProfileManager.CachedProfile", b10.toString()).apply();
        }
    }
}
