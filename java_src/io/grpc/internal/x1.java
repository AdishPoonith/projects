package io.grpc.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class x1 implements e1 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f11707b = Logger.getLogger(x1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<?> f11708c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f11709d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f11710e;

    /* renamed from: f  reason: collision with root package name */
    private static final RuntimeException f11711f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object[] f11712g;

    /* renamed from: a  reason: collision with root package name */
    private final Object f11713a;

    static {
        Method method;
        Method method2;
        Constructor<?> constructor;
        RuntimeException runtimeException = null;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                method2 = cls.getMethod("sum", new Class[0]);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i10];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        }
                        i10++;
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    f11707b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    constructor = null;
                    if (th == null) {
                    }
                    f11708c = null;
                    f11709d = null;
                    f11710e = null;
                    runtimeException = new RuntimeException(th);
                    f11711f = runtimeException;
                    f11712g = new Object[]{1L};
                }
            } catch (Throwable th2) {
                th = th2;
                method2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
            method2 = null;
        }
        if (th == null || constructor == null) {
            f11708c = null;
            f11709d = null;
            f11710e = null;
            runtimeException = new RuntimeException(th);
        } else {
            f11708c = constructor;
            f11709d = method;
            f11710e = method2;
        }
        f11711f = runtimeException;
        f11712g = new Object[]{1L};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1() {
        RuntimeException runtimeException = f11711f;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f11713a = f11708c.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return f11711f == null;
    }

    @Override // io.grpc.internal.e1
    public void a(long j10) {
        try {
            f11709d.invoke(this.f11713a, j10 == 1 ? f11712g : new Object[]{Long.valueOf(j10)});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
