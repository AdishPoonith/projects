package h0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f9059a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f9060b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f9061c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f9062d;

    public static void a(String str, int i10) {
        try {
            if (f9061c == null) {
                c.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        try {
            if (f9061c == null) {
                f9061c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f9061c.invoke(null, Long.valueOf(f9059a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(str);
    }

    public static void d(String str, int i10) {
        try {
            if (f9062d == null) {
                c.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        try {
            if (f9062d == null) {
                f9062d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f9062d.invoke(null, Long.valueOf(f9059a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        try {
            if (f9060b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f9060b == null) {
                f9059a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9060b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9060b.invoke(null, Long.valueOf(f9059a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }
}
