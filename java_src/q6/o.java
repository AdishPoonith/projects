package q6;

import android.net.Uri;
import com.google.firebase.firestore.b1;
import com.google.firebase.firestore.q0;
import com.google.firebase.firestore.x0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, a<?>> f16284a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f16285a;

        /* renamed from: b  reason: collision with root package name */
        private final Constructor<T> f16286b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f16287c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f16288d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<String, String> f16289e = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        private final Map<String, Method> f16291g = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, Method> f16290f = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final Map<String, Field> f16292h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private final HashSet<String> f16293i = new HashSet<>();

        /* renamed from: j  reason: collision with root package name */
        private final HashSet<String> f16294j = new HashSet<>();

        a(Class<T> cls) {
            Constructor<T> constructor;
            Method[] methods;
            Field[] fields;
            Method[] declaredMethods;
            Field[] declaredFields;
            this.f16285a = cls;
            this.f16287c = cls.isAnnotationPresent(b1.class);
            this.f16288d = !cls.isAnnotationPresent(com.google.firebase.firestore.e0.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.f16286b = constructor;
            for (Method method : cls.getMethods()) {
                if (n(method)) {
                    String j10 = j(method);
                    b(j10);
                    method.setAccessible(true);
                    if (this.f16290f.containsKey(j10)) {
                        throw new RuntimeException("Found conflicting getters for name " + method.getName() + " on class " + cls.getName());
                    }
                    this.f16290f.put(j10, method);
                    e(method);
                }
            }
            for (Field field : cls.getFields()) {
                if (m(field)) {
                    b(i(field));
                    d(field);
                }
            }
            Class<? super T> cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (o(method2)) {
                        String j11 = j(method2);
                        String str = this.f16289e.get(j11.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else if (!str.equals(j11)) {
                            throw new RuntimeException("Found setter on " + cls2.getName() + " with invalid case-sensitive name: " + method2.getName());
                        } else {
                            Method method3 = this.f16291g.get(j11);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f16291g.put(j11, method2);
                                f(method2);
                            } else if (!h(method2, method3)) {
                                if (cls2 == cls) {
                                    throw new RuntimeException("Class " + cls.getName() + " has multiple setter overloads with name " + method2.getName());
                                }
                                throw new RuntimeException("Found conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String i10 = i(field2);
                    if (this.f16289e.containsKey(i10.toLowerCase(Locale.US)) && !this.f16292h.containsKey(i10)) {
                        field2.setAccessible(true);
                        this.f16292h.put(i10, field2);
                        d(field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f16289e.isEmpty()) {
                throw new RuntimeException("No properties to serialize found on class " + cls.getName());
            }
            Iterator<String> it = this.f16294j.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f16291g.containsKey(next) && !this.f16292h.containsKey(next)) {
                    throw new RuntimeException("@DocumentId is annotated on property " + next + " of class " + cls.getName() + " but no field or public setter was found");
                }
            }
        }

        private void b(String str) {
            Map<String, String> map = this.f16289e;
            Locale locale = Locale.US;
            String put = map.put(str.toLowerCase(locale), str);
            if (put == null || str.equals(put)) {
                return;
            }
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        private static String c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(q0.class)) {
                return ((q0) accessibleObject.getAnnotation(q0.class)).value();
            }
            return null;
        }

        private void d(Field field) {
            if (field.isAnnotationPresent(x0.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != w5.q.class) {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
                this.f16293i.add(i(field));
            }
            if (field.isAnnotationPresent(com.google.firebase.firestore.i.class)) {
                g("Field", "is", field.getType());
                this.f16294j.add(i(field));
            }
        }

        private void e(Method method) {
            if (method.isAnnotationPresent(x0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType != Date.class && returnType != w5.q.class) {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
                this.f16293i.add(j(method));
            }
            if (method.isAnnotationPresent(com.google.firebase.firestore.i.class)) {
                g("Method", "returns", method.getReturnType());
                this.f16294j.add(j(method));
            }
        }

        private void f(Method method) {
            if (method.isAnnotationPresent(x0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            } else if (method.isAnnotationPresent(com.google.firebase.firestore.i.class)) {
                g("Method", "accepts", method.getParameterTypes()[0]);
                this.f16294j.add(j(method));
            }
        }

        private void g(String str, String str2, Type type) {
            if (type == String.class || type == com.google.firebase.firestore.m.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
        }

        private static boolean h(Method method, Method method2) {
            o.d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            o.d(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            o.d(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            o.d(parameterTypes.length == 1, "Expected exactly one parameter");
            o.d(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String i(Field field) {
            String c10 = c(field);
            return c10 != null ? c10 : field.getName();
        }

        private static String j(Method method) {
            String c10 = c(method);
            return c10 != null ? c10 : l(method.getName());
        }

        private static String l(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i10 = 0; i10 < 3; i10++) {
                String str3 = strArr[i10];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i11 = 0; i11 < charArray.length && Character.isUpperCase(charArray[i11]); i11++) {
                charArray[i11] = Character.toLowerCase(charArray[i11]);
            }
            return new String(charArray);
        }

        private static boolean m(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(com.google.firebase.firestore.p.class)) ? false : true;
        }

        private static boolean n(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(com.google.firebase.firestore.p.class)) ? false : true;
        }

        private static boolean o(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(com.google.firebase.firestore.p.class);
        }

        Map<String, Object> k(T t10, b bVar) {
            Object obj;
            if (!this.f16285a.isAssignableFrom(t10.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + t10.getClass() + " with BeanMapper for class " + this.f16285a);
            }
            HashMap hashMap = new HashMap();
            for (String str : this.f16289e.values()) {
                if (!this.f16294j.contains(str)) {
                    if (this.f16290f.containsKey(str)) {
                        obj = q6.a.a(this.f16290f.get(str), t10, new Object[0]);
                    } else {
                        Field field = this.f16292h.get(str);
                        if (field == null) {
                            throw new IllegalStateException("Bean property without field or getter: " + str);
                        }
                        try {
                            obj = field.get(t10);
                        } catch (IllegalAccessException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    hashMap.put(str, (this.f16293i.contains(str) && obj == null) ? com.google.firebase.firestore.r.g() : o.g(obj, bVar.a(str)));
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: d  reason: collision with root package name */
        static final b f16295d = new b(null, null, 0);

        /* renamed from: a  reason: collision with root package name */
        private final int f16296a;

        /* renamed from: b  reason: collision with root package name */
        private final b f16297b;

        /* renamed from: c  reason: collision with root package name */
        private final String f16298c;

        b(b bVar, String str, int i10) {
            this.f16297b = bVar;
            this.f16298c = str;
            this.f16296a = i10;
        }

        b a(String str) {
            return new b(this, str, this.f16296a + 1);
        }

        int b() {
            return this.f16296a;
        }

        public String toString() {
            int i10 = this.f16296a;
            if (i10 == 0) {
                return "";
            }
            if (i10 == 1) {
                return this.f16298c;
            }
            return this.f16297b.toString() + "." + this.f16298c;
        }
    }

    public static Object c(Object obj) {
        return f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new RuntimeException("Hard assert failed: " + str);
    }

    private static <T> a<T> e(Class<T> cls) {
        ConcurrentMap<Class<?>, a<?>> concurrentMap = f16284a;
        a<?> aVar = concurrentMap.get(cls);
        if (aVar == null) {
            a<T> aVar2 = new a<>(cls);
            concurrentMap.put(cls, aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static <T> Object f(T t10) {
        return g(t10, b.f16295d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Object g(T t10, b bVar) {
        if (bVar.b() <= 500) {
            if (t10 == null) {
                return null;
            }
            if (t10 instanceof Number) {
                if ((t10 instanceof Long) || (t10 instanceof Integer) || (t10 instanceof Double) || (t10 instanceof Float)) {
                    return t10;
                }
                throw h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", t10.getClass().getSimpleName()));
            } else if ((t10 instanceof String) || (t10 instanceof Boolean)) {
                return t10;
            } else {
                if (t10 instanceof Character) {
                    throw h(bVar, "Characters are not supported, please use Strings");
                }
                if (t10 instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t10).entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            throw h(bVar, "Maps with non-string keys are not supported");
                        }
                        String str = (String) key;
                        hashMap.put(str, g(entry.getValue(), bVar.a(str)));
                    }
                    return hashMap;
                } else if (!(t10 instanceof Collection)) {
                    if (t10.getClass().isArray()) {
                        throw h(bVar, "Serializing Arrays is not supported, please use Lists instead");
                    }
                    if (!(t10 instanceof Enum)) {
                        return ((t10 instanceof Date) || (t10 instanceof w5.q) || (t10 instanceof com.google.firebase.firestore.d0) || (t10 instanceof com.google.firebase.firestore.f) || (t10 instanceof com.google.firebase.firestore.m) || (t10 instanceof com.google.firebase.firestore.r)) ? t10 : ((t10 instanceof Uri) || (t10 instanceof URI) || (t10 instanceof URL)) ? t10.toString() : e(t10.getClass()).k(t10, bVar);
                    }
                    String name = ((Enum) t10).name();
                    try {
                        return a.i(t10.getClass().getField(name));
                    } catch (NoSuchFieldException unused) {
                        return name;
                    }
                } else if (t10 instanceof List) {
                    List list = (List) t10;
                    ArrayList arrayList = new ArrayList(list.size());
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Object obj = list.get(i10);
                        arrayList.add(g(obj, bVar.a("[" + i10 + "]")));
                    }
                    return arrayList;
                } else {
                    throw h(bVar, "Serializing Collections is not supported, please use Lists instead");
                }
            }
        }
        throw h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
    }

    private static IllegalArgumentException h(b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
