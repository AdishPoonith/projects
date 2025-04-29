package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class b extends androidx.core.content.a {

    /* renamed from: c  reason: collision with root package name */
    private static g f1509c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String[] f1510j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Activity f1511k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f1512l;

        a(String[] strArr, Activity activity, int i10) {
            this.f1510j = strArr;
            this.f1511k = activity;
            this.f1512l = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1510j.length];
            PackageManager packageManager = this.f1511k.getPackageManager();
            String packageName = this.f1511k.getPackageName();
            int length = this.f1510j.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f1510j[i10], packageName);
            }
            ((f) this.f1511k).onRequestPermissionsResult(this.f1512l, this.f1510j, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0019b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    /* loaded from: classes.dex */
    public interface h {
        void b(int i10);
    }

    public static void k(Activity activity) {
        C0019b.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void m(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.l(activity);
                }
            });
        }
    }

    public static void n(Activity activity, String[] strArr, int i10) {
        g gVar = f1509c;
        if (gVar == null || !gVar.a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.a.c() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof h) {
                    ((h) activity).b(i10);
                }
                c.b(activity, strArr, i10);
            } else if (activity instanceof f) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    public static boolean o(Activity activity, String str) {
        if (androidx.core.os.a.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 32) {
                return e.a(activity, str);
            }
            if (i10 == 31) {
                return d.b(activity, str);
            }
            if (i10 >= 23) {
                return c.c(activity, str);
            }
            return false;
        }
        return false;
    }

    public static void p(Activity activity, Intent intent, int i10, Bundle bundle) {
        C0019b.b(activity, intent, i10, bundle);
    }

    public static void q(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C0019b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
