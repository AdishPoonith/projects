package io.grpc.internal;

import i9.c;
import i9.f0;
import i9.j1;
import i9.r0;
import io.grpc.internal.z1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f11386a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f11387b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b> f11388c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.c0 f11389d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f11390e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, ?> f11391f;

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: g  reason: collision with root package name */
        static final c.C0162c<b> f11392g = c.C0162c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a  reason: collision with root package name */
        final Long f11393a;

        /* renamed from: b  reason: collision with root package name */
        final Boolean f11394b;

        /* renamed from: c  reason: collision with root package name */
        final Integer f11395c;

        /* renamed from: d  reason: collision with root package name */
        final Integer f11396d;

        /* renamed from: e  reason: collision with root package name */
        final a2 f11397e;

        /* renamed from: f  reason: collision with root package name */
        final t0 f11398f;

        b(Map<String, ?> map, boolean z10, int i10, int i11) {
            this.f11393a = e2.w(map);
            this.f11394b = e2.x(map);
            Integer l10 = e2.l(map);
            this.f11395c = l10;
            if (l10 != null) {
                b5.n.j(l10.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l10);
            }
            Integer k10 = e2.k(map);
            this.f11396d = k10;
            if (k10 != null) {
                b5.n.j(k10.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", k10);
            }
            Map<String, ?> r10 = z10 ? e2.r(map) : null;
            this.f11397e = r10 == null ? null : b(r10, i10);
            Map<String, ?> d10 = z10 ? e2.d(map) : null;
            this.f11398f = d10 != null ? a(d10, i11) : null;
        }

        private static t0 a(Map<String, ?> map, int i10) {
            int intValue = ((Integer) b5.n.o(e2.h(map), "maxAttempts cannot be empty")).intValue();
            b5.n.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) b5.n.o(e2.c(map), "hedgingDelay cannot be empty")).longValue();
            b5.n.i(longValue >= 0, "hedgingDelay must not be negative: %s", longValue);
            return new t0(min, longValue, e2.p(map));
        }

        private static a2 b(Map<String, ?> map, int i10) {
            int intValue = ((Integer) b5.n.o(e2.i(map), "maxAttempts cannot be empty")).intValue();
            boolean z10 = true;
            b5.n.h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i10);
            long longValue = ((Long) b5.n.o(e2.e(map), "initialBackoff cannot be empty")).longValue();
            b5.n.i(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) b5.n.o(e2.j(map), "maxBackoff cannot be empty")).longValue();
            b5.n.i(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) b5.n.o(e2.a(map), "backoffMultiplier cannot be empty")).doubleValue();
            b5.n.j(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q10 = e2.q(map);
            b5.n.j(q10 == null || q10.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q10);
            Set<j1.b> s10 = e2.s(map);
            if (q10 == null && s10.isEmpty()) {
                z10 = false;
            }
            b5.n.e(z10, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new a2(min, longValue, longValue2, doubleValue, q10, s10);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return b5.j.a(this.f11393a, bVar.f11393a) && b5.j.a(this.f11394b, bVar.f11394b) && b5.j.a(this.f11395c, bVar.f11395c) && b5.j.a(this.f11396d, bVar.f11396d) && b5.j.a(this.f11397e, bVar.f11397e) && b5.j.a(this.f11398f, bVar.f11398f);
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(this.f11393a, this.f11394b, this.f11395c, this.f11396d, this.f11397e, this.f11398f);
        }

        public String toString() {
            return b5.h.c(this).d("timeoutNanos", this.f11393a).d("waitForReady", this.f11394b).d("maxInboundMessageSize", this.f11395c).d("maxOutboundMessageSize", this.f11396d).d("retryPolicy", this.f11397e).d("hedgingPolicy", this.f11398f).toString();
        }
    }

    /* loaded from: classes.dex */
    static final class c extends i9.f0 {

        /* renamed from: b  reason: collision with root package name */
        final j1 f11399b;

        private c(j1 j1Var) {
            this.f11399b = j1Var;
        }

        @Override // i9.f0
        public f0.b a(r0.f fVar) {
            return f0.b.d().b(this.f11399b).a();
        }
    }

    j1(b bVar, Map<String, b> map, Map<String, b> map2, z1.c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f11386a = bVar;
        this.f11387b = Collections.unmodifiableMap(new HashMap(map));
        this.f11388c = Collections.unmodifiableMap(new HashMap(map2));
        this.f11389d = c0Var;
        this.f11390e = obj;
        this.f11391f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j1 a() {
        return new j1(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j1 b(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        z1.c0 v10 = z10 ? e2.v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b10 = e2.b(map);
        List<Map<String, ?>> m10 = e2.m(map);
        if (m10 == null) {
            return new j1(null, hashMap, hashMap2, v10, obj, b10);
        }
        b bVar = null;
        for (Map<String, ?> map2 : m10) {
            b bVar2 = new b(map2, z10, i10, i11);
            List<Map<String, ?>> o10 = e2.o(map2);
            if (o10 != null && !o10.isEmpty()) {
                for (Map<String, ?> map3 : o10) {
                    String t10 = e2.t(map3);
                    String n10 = e2.n(map3);
                    if (b5.s.b(t10)) {
                        b5.n.j(b5.s.b(n10), "missing service name for method %s", n10);
                        b5.n.j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (b5.s.b(n10)) {
                        b5.n.j(!hashMap2.containsKey(t10), "Duplicate service %s", t10);
                        hashMap2.put(t10, bVar2);
                    } else {
                        String b11 = i9.z0.b(t10, n10);
                        b5.n.j(!hashMap.containsKey(b11), "Duplicate method name %s", b11);
                        hashMap.put(b11, bVar2);
                    }
                }
            }
        }
        return new j1(bVar, hashMap, hashMap2, v10, obj, b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.f0 c() {
        if (this.f11388c.isEmpty() && this.f11387b.isEmpty() && this.f11386a == null) {
            return null;
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, ?> d() {
        return this.f11391f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object e() {
        return this.f11390e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return b5.j.a(this.f11386a, j1Var.f11386a) && b5.j.a(this.f11387b, j1Var.f11387b) && b5.j.a(this.f11388c, j1Var.f11388c) && b5.j.a(this.f11389d, j1Var.f11389d) && b5.j.a(this.f11390e, j1Var.f11390e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f(i9.z0<?, ?> z0Var) {
        b bVar = this.f11387b.get(z0Var.c());
        if (bVar == null) {
            bVar = this.f11388c.get(z0Var.d());
        }
        return bVar == null ? this.f11386a : bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1.c0 g() {
        return this.f11389d;
    }

    public int hashCode() {
        return b5.j.b(this.f11386a, this.f11387b, this.f11388c, this.f11389d, this.f11390e);
    }

    public String toString() {
        return b5.h.c(this).d("defaultMethodConfig", this.f11386a).d("serviceMethodMap", this.f11387b).d("serviceMap", this.f11388c).d("retryThrottling", this.f11389d).d("loadBalancingConfig", this.f11390e).toString();
    }
}
