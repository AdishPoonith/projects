package y0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p0.f0;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f20347c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f20348a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20349b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a() {
            f0 f0Var = f0.f14852a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(f0.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final o b() {
            f0 f0Var = f0.f14852a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f0.l());
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), null);
            }
            return null;
        }
    }

    private o(String str, boolean z10) {
        this.f20348a = str;
        this.f20349b = z10;
    }

    public /* synthetic */ o(String str, boolean z10, kotlin.jvm.internal.g gVar) {
        this(str, z10);
    }

    public final void a() {
        f0 f0Var = f0.f14852a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(f0.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f20348a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f20349b);
        edit.apply();
    }

    public String toString() {
        String str = this.f20349b ? "Applink" : "Unclassified";
        if (this.f20348a != null) {
            return str + '(' + ((Object) this.f20348a) + ')';
        }
        return str;
    }
}
