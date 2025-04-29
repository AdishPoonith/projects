package com.google.protobuf;

import com.google.protobuf.o0;
import java.util.Map;
/* loaded from: classes.dex */
class r0 implements q0 {
    private static <K, V> int i(int i10, Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        o0 o0Var = (o0) obj2;
        int i11 = 0;
        if (p0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : p0Var.entrySet()) {
            i11 += o0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> p0<K, V> j(Object obj, Object obj2) {
        p0<K, V> p0Var = (p0) obj;
        p0<K, V> p0Var2 = (p0) obj2;
        if (!p0Var2.isEmpty()) {
            if (!p0Var.j()) {
                p0Var = p0Var.p();
            }
            p0Var.o(p0Var2);
        }
        return p0Var;
    }

    @Override // com.google.protobuf.q0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.q0
    public Object b(Object obj) {
        return p0.f().p();
    }

    @Override // com.google.protobuf.q0
    public int c(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.q0
    public boolean d(Object obj) {
        return !((p0) obj).j();
    }

    @Override // com.google.protobuf.q0
    public Object e(Object obj) {
        ((p0) obj).n();
        return obj;
    }

    @Override // com.google.protobuf.q0
    public o0.a<?, ?> f(Object obj) {
        return ((o0) obj).c();
    }

    @Override // com.google.protobuf.q0
    public Map<?, ?> g(Object obj) {
        return (p0) obj;
    }

    @Override // com.google.protobuf.q0
    public Map<?, ?> h(Object obj) {
        return (p0) obj;
    }
}
