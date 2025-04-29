package m6;

import d7.b0;
import d7.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class t implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    private b0 f13839j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f13840k;

    public t() {
        this(b0.C0().Q(d7.s.g0()).b());
    }

    public t(b0 b0Var) {
        this.f13840k = new HashMap();
        q6.b.d(b0Var.B0() == b0.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        q6.b.d(!v.c(b0Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f13839j = b0Var;
    }

    private d7.s a(r rVar, Map<String, Object> map) {
        b0 h10 = h(this.f13839j, rVar);
        s.b d10 = y.w(h10) ? h10.x0().d() : d7.s.o0();
        boolean z10 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                d7.s a10 = a(rVar.b(key), (Map) value);
                if (a10 != null) {
                    d10.J(key, b0.C0().Q(a10).b());
                    z10 = true;
                }
            } else {
                if (value instanceof b0) {
                    d10.J(key, (b0) value);
                } else if (d10.H(key)) {
                    q6.b.d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                    d10.K(key);
                }
                z10 = true;
            }
        }
        if (z10) {
            return d10.b();
        }
        return null;
    }

    private b0 c() {
        synchronized (this.f13840k) {
            d7.s a10 = a(r.f13823l, this.f13840k);
            if (a10 != null) {
                this.f13839j = b0.C0().Q(a10).b();
                this.f13840k.clear();
            }
        }
        return this.f13839j;
    }

    private n6.d g(d7.s sVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, b0> entry : sVar.i0().entrySet()) {
            r w10 = r.w(entry.getKey());
            if (y.w(entry.getValue())) {
                Set<r> c10 = g(entry.getValue().x0()).c();
                if (!c10.isEmpty()) {
                    for (r rVar : c10) {
                        hashSet.add(w10.g(rVar));
                    }
                }
            }
            hashSet.add(w10);
        }
        return n6.d.b(hashSet);
    }

    private b0 h(b0 b0Var, r rVar) {
        if (rVar.o()) {
            return b0Var;
        }
        int i10 = 0;
        while (true) {
            int q10 = rVar.q() - 1;
            d7.s x02 = b0Var.x0();
            if (i10 >= q10) {
                return x02.j0(rVar.l(), null);
            }
            b0Var = x02.j0(rVar.n(i10), null);
            if (!y.w(b0Var)) {
                return null;
            }
            i10++;
        }
    }

    public static t i(Map<String, b0> map) {
        return new t(b0.C0().P(d7.s.o0().I(map)).b());
    }

    private void s(r rVar, b0 b0Var) {
        Object hashMap;
        HashMap hashMap2 = this.f13840k;
        for (int i10 = 0; i10 < rVar.q() - 1; i10++) {
            String n10 = rVar.n(i10);
            Object obj = hashMap2.get(n10);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof b0) {
                    b0 b0Var2 = (b0) obj;
                    if (b0Var2.B0() == b0.c.MAP_VALUE) {
                        HashMap hashMap3 = new HashMap(b0Var2.x0().i0());
                        hashMap2.put(n10, hashMap3);
                        hashMap2 = hashMap3;
                    }
                }
                hashMap = new HashMap();
                hashMap2.put(n10, hashMap);
            }
            hashMap2 = hashMap;
        }
        hashMap2.put(rVar.l(), b0Var);
    }

    /* renamed from: d */
    public t clone() {
        return new t(c());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return y.q(c(), ((t) obj).c());
        }
        return false;
    }

    public void f(r rVar) {
        q6.b.d(!rVar.o(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        s(rVar, null);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public b0 j(r rVar) {
        return h(c(), rVar);
    }

    public n6.d n() {
        return g(c().x0());
    }

    public Map<String, b0> o() {
        return c().x0().i0();
    }

    public void p(r rVar, b0 b0Var) {
        q6.b.d(!rVar.o(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        s(rVar, b0Var);
    }

    public void r(Map<r, b0> map) {
        for (Map.Entry<r, b0> entry : map.entrySet()) {
            r key = entry.getKey();
            if (entry.getValue() == null) {
                f(key);
            } else {
                p(key, entry.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + y.b(c()) + '}';
    }
}
