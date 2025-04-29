package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f2547a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f2548b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends b>>> f2549c = new HashMap();

    private l() {
    }

    private final b a(Constructor<? extends b> constructor, Object obj) {
        try {
            b newInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.l.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends b> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            kotlin.jvm.internal.l.d(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.l.d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.l.d(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.l.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(name);
            if (!(fullPackage.length() == 0)) {
                c10 = fullPackage + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            kotlin.jvm.internal.l.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        String r10;
        kotlin.jvm.internal.l.e(className, "className");
        StringBuilder sb = new StringBuilder();
        r10 = ka.p.r(className, ".", "_", false, 4, null);
        sb.append(r10);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f2548b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && h.class.isAssignableFrom(cls);
    }

    public static final g f(Object object) {
        kotlin.jvm.internal.l.e(object, "object");
        boolean z10 = object instanceof g;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (g) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (g) object;
        }
        Class<?> cls = object.getClass();
        l lVar = f2547a;
        if (lVar.d(cls) == 2) {
            List<Constructor<? extends b>> list = f2549c.get(cls);
            kotlin.jvm.internal.l.b(list);
            List<Constructor<? extends b>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lVar.a(list2.get(0), object));
            }
            int size = list2.size();
            b[] bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = f2547a.a(list2.get(i10), object);
            }
            return new CompositeGeneratedAdaptersObserver(bVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int g(Class<?> cls) {
        List<Constructor<? extends b>> b10;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends b> b11 = b(cls);
        if (b11 != null) {
            Map<Class<?>, List<Constructor<? extends b>>> map = f2549c;
            b10 = t9.o.b(b11);
            map.put(cls, b10);
            return 2;
        } else if (a.f2519c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                kotlin.jvm.internal.l.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends b>> list = f2549c.get(superclass);
                kotlin.jvm.internal.l.b(list);
                arrayList = new ArrayList(list);
            }
            Class<?>[] interfaces = cls.getInterfaces();
            kotlin.jvm.internal.l.d(interfaces, "klass.interfaces");
            for (Class<?> intrface : interfaces) {
                if (e(intrface)) {
                    kotlin.jvm.internal.l.d(intrface, "intrface");
                    if (d(intrface) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends b>> list2 = f2549c.get(intrface);
                    kotlin.jvm.internal.l.b(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList != null) {
                f2549c.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
