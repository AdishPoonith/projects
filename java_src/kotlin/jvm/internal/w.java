package kotlin.jvm.internal;

import java.util.List;
/* loaded from: classes.dex */
public class w {
    public static List a(Object obj) {
        if ((obj instanceof ea.a) && !(obj instanceof ea.b)) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i10) {
        if (obj != null && !e(obj, i10)) {
            h(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw g(e10);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof da.a) {
            return 0;
        }
        if (obj instanceof da.l) {
            return 1;
        }
        if (obj instanceof da.p) {
            return 2;
        }
        if (obj instanceof da.q) {
            return 3;
        }
        if (obj instanceof da.r) {
            return 4;
        }
        if (obj instanceof da.s) {
            return 5;
        }
        if (obj instanceof da.t) {
            return 6;
        }
        if (obj instanceof da.u) {
            return 7;
        }
        if (obj instanceof da.v) {
            return 8;
        }
        if (obj instanceof da.w) {
            return 9;
        }
        if (obj instanceof da.b) {
            return 10;
        }
        if (obj instanceof da.c) {
            return 11;
        }
        if (obj instanceof da.d) {
            return 12;
        }
        if (obj instanceof da.e) {
            return 13;
        }
        if (obj instanceof da.f) {
            return 14;
        }
        if (obj instanceof da.g) {
            return 15;
        }
        if (obj instanceof da.h) {
            return 16;
        }
        if (obj instanceof da.i) {
            return 17;
        }
        if (obj instanceof da.j) {
            return 18;
        }
        if (obj instanceof da.k) {
            return 19;
        }
        if (obj instanceof da.m) {
            return 20;
        }
        if (obj instanceof da.n) {
            return 21;
        }
        return obj instanceof da.o ? 22 : -1;
    }

    public static boolean e(Object obj, int i10) {
        return (obj instanceof s9.c) && d(obj) == i10;
    }

    private static <T extends Throwable> T f(T t10) {
        return (T) l.j(t10, w.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        i(name + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
