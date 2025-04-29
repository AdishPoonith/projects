package w0;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f19616a = new m();

    private m() {
    }

    public static final Class<?> a(String className) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final Class<?> b(Context context, String className) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final Method c(Class<?> clazz, String methodName, Class<?>... args) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(clazz, "clazz");
            kotlin.jvm.internal.l.e(methodName, "methodName");
            kotlin.jvm.internal.l.e(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final Method d(Class<?> clazz, String methodName, Class<?>... args) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(clazz, "clazz");
            kotlin.jvm.internal.l.e(methodName, "methodName");
            kotlin.jvm.internal.l.e(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }

    public static final Object e(Class<?> clazz, Method method, Object obj, Object... args) {
        if (k1.a.d(m.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.l.e(clazz, "clazz");
            kotlin.jvm.internal.l.e(method, "method");
            kotlin.jvm.internal.l.e(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            k1.a.b(th, m.class);
            return null;
        }
    }
}
