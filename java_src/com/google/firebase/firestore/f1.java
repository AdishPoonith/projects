package com.google.firebase.firestore;

import com.google.firebase.firestore.r;
import com.google.protobuf.t1;
import d7.b;
import d7.b0;
import d7.s;
import j6.q1;
import j6.r1;
import j6.s1;
import j6.u1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n6.a;
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private final m6.f f6751a;

    public f1(m6.f fVar) {
        this.f6751a = fVar;
    }

    private m6.t a(Object obj, r1 r1Var) {
        if (obj.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        d7.b0 d10 = d(q6.o.c(obj), r1Var);
        if (d10.B0() == b0.c.MAP_VALUE) {
            return new m6.t(d10);
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was of type: " + q6.g0.B(obj));
    }

    private List<d7.b0> c(List<Object> list) {
        q1 q1Var = new q1(u1.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(b(list.get(i10), q1Var.f().c(i10)));
        }
        return arrayList;
    }

    private d7.b0 d(Object obj, r1 r1Var) {
        if (obj instanceof Map) {
            return f((Map) obj, r1Var);
        }
        if (obj instanceof r) {
            k((r) obj, r1Var);
            return null;
        }
        if (r1Var.h() != null) {
            r1Var.a(r1Var.h());
        }
        if (obj instanceof List) {
            if (!r1Var.i() || r1Var.g() == u1.ArrayArgument) {
                return e((List) obj, r1Var);
            }
            throw r1Var.f("Nested arrays are not supported");
        }
        return j(obj, r1Var);
    }

    private <T> d7.b0 e(List<T> list, r1 r1Var) {
        b.C0121b o02 = d7.b.o0();
        int i10 = 0;
        for (T t10 : list) {
            d7.b0 d10 = d(t10, r1Var.c(i10));
            if (d10 == null) {
                d10 = d7.b0.C0().R(com.google.protobuf.e1.NULL_VALUE).b();
            }
            o02.I(d10);
            i10++;
        }
        return d7.b0.C0().I(o02).b();
    }

    private <K, V> d7.b0 f(Map<K, V> map, r1 r1Var) {
        b0.b P;
        if (map.isEmpty()) {
            if (r1Var.h() != null && !r1Var.h().o()) {
                r1Var.a(r1Var.h());
            }
            P = d7.b0.C0().Q(d7.s.g0());
        } else {
            s.b o02 = d7.s.o0();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw r1Var.f(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                }
                String str = (String) entry.getKey();
                d7.b0 d10 = d(entry.getValue(), r1Var.d(str));
                if (d10 != null) {
                    o02.J(str, d10);
                }
            }
            P = d7.b0.C0().P(o02);
        }
        return P.b();
    }

    private d7.b0 j(Object obj, r1 r1Var) {
        if (obj == null) {
            return d7.b0.C0().R(com.google.protobuf.e1.NULL_VALUE).b();
        }
        if (obj instanceof Integer) {
            return d7.b0.C0().O(((Integer) obj).intValue()).b();
        }
        if (obj instanceof Long) {
            return d7.b0.C0().O(((Long) obj).longValue()).b();
        }
        if (obj instanceof Float) {
            return d7.b0.C0().M(((Float) obj).doubleValue()).b();
        }
        if (obj instanceof Double) {
            return d7.b0.C0().M(((Double) obj).doubleValue()).b();
        }
        if (obj instanceof Boolean) {
            return d7.b0.C0().K(((Boolean) obj).booleanValue()).b();
        }
        if (obj instanceof String) {
            return d7.b0.C0().T((String) obj).b();
        }
        if (obj instanceof Date) {
            return m(new w5.q((Date) obj));
        }
        if (obj instanceof w5.q) {
            return m((w5.q) obj);
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return d7.b0.C0().N(h7.a.k0().H(d0Var.g()).I(d0Var.h())).b();
        } else if (obj instanceof f) {
            return d7.b0.C0().L(((f) obj).i()).b();
        } else {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (mVar.k() != null) {
                    m6.f t10 = mVar.k().t();
                    if (!t10.equals(this.f6751a)) {
                        throw r1Var.f(String.format("Document reference is for database %s/%s but should be for database %s/%s", t10.k(), t10.i(), this.f6751a.k(), this.f6751a.i()));
                    }
                }
                return d7.b0.C0().S(String.format("projects/%s/databases/%s/documents/%s", this.f6751a.k(), this.f6751a.i(), mVar.m())).b();
            } else if (obj.getClass().isArray()) {
                throw r1Var.f("Arrays are not supported; use a List instead");
            } else {
                throw r1Var.f("Unsupported type: " + q6.g0.B(obj));
            }
        }
    }

    private void k(r rVar, r1 r1Var) {
        n6.p jVar;
        m6.r h10;
        if (!r1Var.j()) {
            throw r1Var.f(String.format("%s() can only be used with set() and update()", rVar.d()));
        }
        if (r1Var.h() == null) {
            throw r1Var.f(String.format("%s() is not currently supported inside arrays", rVar.d()));
        }
        if (rVar instanceof r.c) {
            if (r1Var.g() == u1.MergeSet) {
                r1Var.a(r1Var.h());
                return;
            } else if (r1Var.g() != u1.Update) {
                throw r1Var.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
            } else {
                q6.b.d(r1Var.h().q() > 0, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw r1Var.f("FieldValue.delete() can only appear at the top level of your update data");
            }
        }
        if (rVar instanceof r.e) {
            h10 = r1Var.h();
            jVar = n6.n.d();
        } else {
            if (rVar instanceof r.b) {
                jVar = new a.b(c(((r.b) rVar).h()));
            } else if (rVar instanceof r.a) {
                jVar = new a.C0208a(c(((r.a) rVar).h()));
            } else if (!(rVar instanceof r.d)) {
                throw q6.b.a("Unknown FieldValue type: %s", q6.g0.B(rVar));
            } else {
                jVar = new n6.j(h(((r.d) rVar).h()));
            }
            h10 = r1Var.h();
        }
        r1Var.b(h10, jVar);
    }

    private d7.b0 m(w5.q qVar) {
        return d7.b0.C0().U(t1.k0().I(qVar.l()).H((qVar.k() / 1000) * 1000)).b();
    }

    public d7.b0 b(Object obj, r1 r1Var) {
        return d(q6.o.c(obj), r1Var);
    }

    public s1 g(Object obj, n6.d dVar) {
        q1 q1Var = new q1(u1.MergeSet);
        m6.t a10 = a(obj, q1Var.f());
        if (dVar != null) {
            for (m6.r rVar : dVar.c()) {
                if (!q1Var.d(rVar)) {
                    throw new IllegalArgumentException("Field '" + rVar.toString() + "' is specified in your field mask but not in your input data.");
                }
            }
            return q1Var.h(a10, dVar);
        }
        return q1Var.g(a10);
    }

    public d7.b0 h(Object obj) {
        return i(obj, false);
    }

    public d7.b0 i(Object obj, boolean z10) {
        q1 q1Var = new q1(z10 ? u1.ArrayArgument : u1.Argument);
        d7.b0 b10 = b(obj, q1Var.f());
        q6.b.d(b10 != null, "Parsed data should not be null.", new Object[0]);
        q6.b.d(q1Var.e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return b10;
    }

    public s1 l(Object obj) {
        q1 q1Var = new q1(u1.Set);
        return q1Var.i(a(obj, q1Var.f()));
    }

    public j6.t1 n(List<Object> list) {
        q6.b.d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        q1 q1Var = new q1(u1.Update);
        r1 f10 = q1Var.f();
        m6.t tVar = new m6.t();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z10 = next instanceof String;
            q6.b.d(z10 || (next instanceof q), "Expected argument to be String or FieldPath.", new Object[0]);
            m6.r c10 = (z10 ? q.b((String) next) : (q) next).c();
            if (next2 instanceof r.c) {
                f10.a(c10);
            } else {
                d7.b0 b10 = b(next2, f10.e(c10));
                if (b10 != null) {
                    f10.a(c10);
                    tVar.p(c10, b10);
                }
            }
        }
        return q1Var.j(tVar);
    }

    public j6.t1 o(Map<String, Object> map) {
        q6.x.c(map, "Provided update data must not be null.");
        q1 q1Var = new q1(u1.Update);
        r1 f10 = q1Var.f();
        m6.t tVar = new m6.t();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m6.r c10 = q.b(entry.getKey()).c();
            Object value = entry.getValue();
            if (value instanceof r.c) {
                f10.a(c10);
            } else {
                d7.b0 b10 = b(value, f10.e(c10));
                if (b10 != null) {
                    f10.a(c10);
                    tVar.p(c10, b10);
                }
            }
        }
        return q1Var.j(tVar);
    }
}
