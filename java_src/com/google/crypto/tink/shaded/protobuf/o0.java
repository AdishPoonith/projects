package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.util.Map;
/* loaded from: classes.dex */
class o0 implements n0 {
    private static <K, V> int i(int i10, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int i11 = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : m0Var.entrySet()) {
            i11 += l0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> m0<K, V> j(Object obj, Object obj2) {
        m0<K, V> m0Var = (m0) obj;
        m0<K, V> m0Var2 = (m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.j()) {
                m0Var = m0Var.p();
            }
            m0Var.o(m0Var2);
        }
        return m0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object b(Object obj) {
        return m0.f().p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public int c(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public boolean d(Object obj) {
        return !((m0) obj).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object e(Object obj) {
        ((m0) obj).n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public l0.a<?, ?> f(Object obj) {
        ((l0) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Map<?, ?> g(Object obj) {
        return (m0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Map<?, ?> h(Object obj) {
        return (m0) obj;
    }
}
