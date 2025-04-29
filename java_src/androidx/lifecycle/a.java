package androidx.lifecycle;

import androidx.lifecycle.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
final class a {

    /* renamed from: c  reason: collision with root package name */
    static a f2519c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C0038a> f2520a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2521b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038a {

        /* renamed from: a  reason: collision with root package name */
        final Map<e.a, List<b>> f2522a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, e.a> f2523b;

        C0038a(Map<b, e.a> map) {
            this.f2523b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f2522a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f2522a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<b> list, i iVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(iVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(i iVar, e.a aVar, Object obj) {
            b(this.f2522a.get(aVar), iVar, aVar, obj);
            b(this.f2522a.get(e.a.ON_ANY), iVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f2524a;

        /* renamed from: b  reason: collision with root package name */
        final Method f2525b;

        b(int i10, Method method) {
            this.f2524a = i10;
            this.f2525b = method;
            method.setAccessible(true);
        }

        void a(i iVar, e.a aVar, Object obj) {
            try {
                int i10 = this.f2524a;
                if (i10 == 0) {
                    this.f2525b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f2525b.invoke(obj, iVar);
                } else if (i10 != 2) {
                } else {
                    this.f2525b.invoke(obj, iVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f2524a == bVar.f2524a && this.f2525b.getName().equals(bVar.f2525b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f2524a * 31) + this.f2525b.getName().hashCode();
        }
    }

    a() {
    }

    private C0038a a(Class<?> cls, Method[] methodArr) {
        int i10;
        C0038a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f2523b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : c(cls2).f2523b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            p pVar = (p) method.getAnnotation(p.class);
            if (pVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!i.class.isAssignableFrom(parameterTypes[0])) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                e.a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!e.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        C0038a c0038a = new C0038a(hashMap);
        this.f2520a.put(cls, c0038a);
        this.f2521b.put(cls, Boolean.valueOf(z10));
        return c0038a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, e.a> map, b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f2525b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0038a c(Class<?> cls) {
        C0038a c0038a = this.f2520a.get(cls);
        return c0038a != null ? c0038a : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f2521b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((p) method.getAnnotation(p.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f2521b.put(cls, Boolean.FALSE);
        return false;
    }
}
