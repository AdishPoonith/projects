package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class u3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f4246a;

    /* renamed from: b  reason: collision with root package name */
    private static final j4 f4247b;

    /* renamed from: c  reason: collision with root package name */
    private static final j4 f4248c;

    /* renamed from: d  reason: collision with root package name */
    private static final j4 f4249d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4246a = cls;
        f4247b = j(false);
        f4248c = j(true);
        f4249d = new m4();
    }

    public static j4 a() {
        return f4247b;
    }

    public static j4 b() {
        return f4248c;
    }

    public static j4 c() {
        return f4249d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object d(int i10, List list, i2 i2Var, Object obj, j4 j4Var) {
        if (i2Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (i2Var.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = e(i10, intValue, obj, j4Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!i2Var.zza()) {
                    obj = e(i10, intValue2, obj, j4Var);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object e(int i10, int i11, Object obj, j4 j4Var) {
        if (obj == null) {
            obj = j4Var.c();
        }
        j4Var.d(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(j4 j4Var, Object obj, Object obj2) {
        j4Var.f(obj, j4Var.b(j4Var.a(obj), j4Var.a(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!g2.class.isAssignableFrom(cls) && (cls2 = f4246a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(b3 b3Var, Object obj, Object obj2, long j10) {
        u4.p(obj, j10, b3.a(u4.f(obj, j10), u4.f(obj2, j10)));
    }

    private static j4 j(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (j4) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
