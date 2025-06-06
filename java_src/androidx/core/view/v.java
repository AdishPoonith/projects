package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1946a;

    /* loaded from: classes.dex */
    static class a {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f1946a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
