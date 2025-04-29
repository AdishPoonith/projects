package u0;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f18449a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f18450b = e.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f18451c;

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class<?> b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        l.d(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f18451c == null) {
                f18451c = f18449a.b();
            }
            Class<?> cls = f18451c;
            if (cls == null) {
                l.p("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls2 = f18451c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                l.p("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f18450b, "Failed to send message to Unity", e10);
        }
    }
}
