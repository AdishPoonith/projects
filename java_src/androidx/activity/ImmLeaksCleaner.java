package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.g {

    /* renamed from: k  reason: collision with root package name */
    private static int f491k;

    /* renamed from: l  reason: collision with root package name */
    private static Field f492l;

    /* renamed from: m  reason: collision with root package name */
    private static Field f493m;

    /* renamed from: n  reason: collision with root package name */
    private static Field f494n;

    /* renamed from: j  reason: collision with root package name */
    private Activity f495j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f495j = activity;
    }

    private static void a() {
        try {
            f491k = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f493m = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f494n = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f492l = declaredField3;
            declaredField3.setAccessible(true);
            f491k = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void q(androidx.lifecycle.i iVar, e.a aVar) {
        if (aVar != e.a.ON_DESTROY) {
            return;
        }
        if (f491k == 0) {
            a();
        }
        if (f491k == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f495j.getSystemService("input_method");
            try {
                Object obj = f492l.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f493m.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f494n.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
