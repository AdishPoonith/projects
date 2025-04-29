package p3;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static int f15430b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f15431c = true;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15429a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static a f15432d = a.f15433a;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15433a = new C0224a();

        /* renamed from: p3.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0224a implements a {
            C0224a() {
            }

            @Override // p3.r.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // p3.r.a
            public void b(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // p3.r.a
            public void c(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // p3.r.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f15429a) {
            if (f15430b == 0) {
                f15432d.d(str, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f15429a) {
            if (f15430b <= 3) {
                f15432d.c(str, str2);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        synchronized (f15429a) {
            if (th == null) {
                return null;
            }
            if (h(th)) {
                return "UnknownHostException (no network)";
            }
            if (f15431c) {
                return Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    public static void f(String str, String str2) {
        synchronized (f15429a) {
            if (f15430b <= 1) {
                f15432d.b(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    private static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f15429a) {
            if (f15430b <= 2) {
                f15432d.a(str, str2);
            }
        }
    }

    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
