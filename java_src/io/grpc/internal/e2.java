package io.grpc.internal;

import i9.a1;
import i9.j1;
import io.grpc.internal.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class e2 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f11149a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, ?> f11150b;

        public a(String str, Map<String, ?> map) {
            this.f11149a = (String) b5.n.o(str, "policyName");
            this.f11150b = (Map) b5.n.o(map, "rawConfigValue");
        }

        public String a() {
            return this.f11149a;
        }

        public Map<String, ?> b() {
            return this.f11150b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f11149a.equals(aVar.f11149a) && this.f11150b.equals(aVar.f11150b);
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(this.f11149a, this.f11150b);
        }

        public String toString() {
            return b5.h.c(this).d("policyName", this.f11149a).d("rawConfigValue", this.f11150b).toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final i9.s0 f11151a;

        /* renamed from: b  reason: collision with root package name */
        final Object f11152b;

        public b(i9.s0 s0Var, Object obj) {
            this.f11151a = (i9.s0) b5.n.o(s0Var, "provider");
            this.f11152b = obj;
        }

        public Object a() {
            return this.f11152b;
        }

        public i9.s0 b() {
            return this.f11151a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return b5.j.a(this.f11151a, bVar.f11151a) && b5.j.a(this.f11152b, bVar.f11152b);
        }

        public int hashCode() {
            return b5.j.b(this.f11151a, this.f11152b);
        }

        public String toString() {
            return b5.h.c(this).d("provider", this.f11151a).d("config", this.f11152b).toString();
        }
    }

    private e2() {
    }

    public static List<a> A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            arrayList.add(z(map));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Double a(Map<String, ?> map) {
        return b1.h(map, "backoffMultiplier");
    }

    public static Map<String, ?> b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return b1.j(map, "healthCheckConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long c(Map<String, ?> map) {
        return b1.l(map, "hedgingDelay");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> d(Map<String, ?> map) {
        return b1.j(map, "hedgingPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long e(Map<String, ?> map) {
        return b1.l(map, "initialBackoff");
    }

    private static Set<j1.b> f(Map<String, ?> map, String str) {
        List<?> e10 = b1.e(map, str);
        if (e10 == null) {
            return null;
        }
        return u(e10);
    }

    public static List<Map<String, ?>> g(Map<String, ?> map) {
        String k10;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(b1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k10 = b1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k10.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer h(Map<String, ?> map) {
        return b1.i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer i(Map<String, ?> map) {
        return b1.i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long j(Map<String, ?> map) {
        return b1.l(map, "maxBackoff");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer k(Map<String, ?> map) {
        return b1.i(map, "maxRequestMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Integer l(Map<String, ?> map) {
        return b1.i(map, "maxResponseMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Map<String, ?>> m(Map<String, ?> map) {
        return b1.f(map, "methodConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(Map<String, ?> map) {
        return b1.k(map, "method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Map<String, ?>> o(Map<String, ?> map) {
        return b1.f(map, "name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<j1.b> p(Map<String, ?> map) {
        Set<j1.b> f10 = f(map, "nonFatalStatusCodes");
        if (f10 == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(j1.b.class));
        }
        b5.w.a(!f10.contains(j1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long q(Map<String, ?> map) {
        return b1.l(map, "perAttemptRecvTimeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, ?> r(Map<String, ?> map) {
        return b1.j(map, "retryPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<j1.b> s(Map<String, ?> map) {
        Set<j1.b> f10 = f(map, "retryableStatusCodes");
        b5.w.a(f10 != null, "%s is required in retry policy", "retryableStatusCodes");
        b5.w.a(true ^ f10.contains(j1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String t(Map<String, ?> map) {
        return b1.k(map, "service");
    }

    private static Set<j1.b> u(List<?> list) {
        j1.b valueOf;
        EnumSet noneOf = EnumSet.noneOf(j1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int intValue = d10.intValue();
                b5.w.a(((double) intValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                valueOf = i9.j1.h(intValue).m();
                b5.w.a(valueOf.h() == d10.intValue(), "Status code %s is not valid", obj);
            } else if (!(obj instanceof String)) {
                throw new b5.x("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            } else {
                try {
                    valueOf = j1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new b5.x("Status code " + obj + " is not valid", e10);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z1.c0 v(Map<String, ?> map) {
        Map<String, ?> j10;
        if (map == null || (j10 = b1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = b1.h(j10, "maxTokens").floatValue();
        float floatValue2 = b1.h(j10, "tokenRatio").floatValue();
        b5.n.u(floatValue > 0.0f, "maxToken should be greater than zero");
        b5.n.u(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new z1.c0(floatValue, floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Long w(Map<String, ?> map) {
        return b1.l(map, "timeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean x(Map<String, ?> map) {
        return b1.d(map, "waitForReady");
    }

    public static a1.c y(List<a> list, i9.t0 t0Var) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String a10 = aVar.a();
            i9.s0 d10 = t0Var.d(a10);
            if (d10 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(e2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                a1.c e10 = d10.e(aVar.b());
                return e10.d() != null ? e10 : a1.c.a(new b(d10, e10.c()));
            }
            arrayList.add(a10);
        }
        i9.j1 j1Var = i9.j1.f9925h;
        return a1.c.b(j1Var.q("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new a(key, b1.j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
