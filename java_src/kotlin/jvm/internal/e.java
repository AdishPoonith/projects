package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t9.f0;
import t9.g0;
/* loaded from: classes.dex */
public final class e implements ia.c<Object>, d {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12844k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    private static final Map<Class<? extends s9.c<?>>, Integer> f12845l;

    /* renamed from: m  reason: collision with root package name */
    private static final HashMap<String, String> f12846m;

    /* renamed from: n  reason: collision with root package name */
    private static final HashMap<String, String> f12847n;

    /* renamed from: o  reason: collision with root package name */
    private static final HashMap<String, String> f12848o;

    /* renamed from: p  reason: collision with root package name */
    private static final Map<String, String> f12849p;

    /* renamed from: j  reason: collision with root package name */
    private final Class<?> f12850j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> jClass) {
            String str;
            Method enclosingMethod;
            String h02;
            String i02;
            String i03;
            l.e(jClass, "jClass");
            String str2 = null;
            if (!jClass.isAnonymousClass()) {
                if (jClass.isLocalClass()) {
                    String name = jClass.getSimpleName();
                    if (jClass.getEnclosingMethod() != null) {
                        l.d(name, "name");
                        i03 = ka.q.i0(name, enclosingMethod.getName() + '$', null, 2, null);
                        if (i03 != null) {
                            return i03;
                        }
                    }
                    Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
                    l.d(name, "name");
                    if (enclosingConstructor == null) {
                        h02 = ka.q.h0(name, '$', null, 2, null);
                        return h02;
                    }
                    i02 = ka.q.i0(name, enclosingConstructor.getName() + '$', null, 2, null);
                    return i02;
                } else if (!jClass.isArray()) {
                    String str3 = (String) e.f12849p.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                } else {
                    Class<?> componentType = jClass.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f12849p.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List g10;
        int j10;
        Map<Class<? extends s9.c<?>>, Integer> k10;
        int a10;
        String k02;
        String k03;
        int i10 = 0;
        g10 = t9.p.g(da.a.class, da.l.class, da.p.class, da.q.class, da.r.class, da.s.class, da.t.class, da.u.class, da.v.class, da.w.class, da.b.class, da.c.class, da.d.class, da.e.class, da.f.class, da.g.class, da.h.class, da.i.class, da.j.class, da.k.class, da.m.class, da.n.class, da.o.class);
        j10 = t9.q.j(g10, 10);
        ArrayList arrayList = new ArrayList(j10);
        for (Object obj : g10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                t9.p.i();
            }
            arrayList.add(s9.q.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        k10 = g0.k(arrayList);
        f12845l = k10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f12846m = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f12847n = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.d(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.d(kotlinName, "kotlinName");
            k03 = ka.q.k0(kotlinName, '.', null, 2, null);
            sb.append(k03);
            sb.append("CompanionObject");
            s9.m a11 = s9.q.a(sb.toString(), kotlinName + ".Companion");
            hashMap3.put(a11.c(), a11.d());
        }
        for (Map.Entry<Class<? extends s9.c<?>>, Integer> entry : f12845l.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f12848o = hashMap3;
        a10 = f0.a(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            k02 = ka.q.k0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, k02);
        }
        f12849p = linkedHashMap;
    }

    public e(Class<?> jClass) {
        l.e(jClass, "jClass");
        this.f12850j = jClass;
    }

    @Override // ia.c
    public String a() {
        return f12844k.a(b());
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> b() {
        return this.f12850j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(ca.a.b(this), ca.a.b((ia.c) obj));
    }

    public int hashCode() {
        return ca.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
