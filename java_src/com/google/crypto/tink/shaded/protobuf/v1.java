package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface v1 {

    /* loaded from: classes.dex */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, String str);

    void B(int i10, List<Integer> list, boolean z10);

    void C(int i10, long j10);

    void D(int i10, int i11);

    void E(int i10, List<Long> list, boolean z10);

    void F(int i10, List<Integer> list, boolean z10);

    void G(int i10, List<Double> list, boolean z10);

    void H(int i10, int i11);

    void I(int i10, List<i> list);

    @Deprecated
    void J(int i10, List<?> list, h1 h1Var);

    void K(int i10, List<?> list, h1 h1Var);

    void L(int i10, Object obj, h1 h1Var);

    void M(int i10, i iVar);

    <K, V> void N(int i10, l0.a<K, V> aVar, Map<K, V> map);

    @Deprecated
    void O(int i10, Object obj, h1 h1Var);

    void a(int i10, List<Integer> list, boolean z10);

    void b(int i10, List<Float> list, boolean z10);

    void c(int i10, long j10);

    void d(int i10, boolean z10);

    void e(int i10, int i11);

    void f(int i10, Object obj);

    void g(int i10, int i11);

    @Deprecated
    void h(int i10);

    void i(int i10, int i11);

    void j(int i10, List<Long> list, boolean z10);

    void k(int i10, List<Integer> list, boolean z10);

    void l(int i10, int i11);

    void m(int i10, double d10);

    void n(int i10, long j10);

    void o(int i10, List<Long> list, boolean z10);

    void p(int i10, List<Integer> list, boolean z10);

    void q(int i10, List<Long> list, boolean z10);

    void r(int i10, List<Boolean> list, boolean z10);

    void s(int i10, List<Integer> list, boolean z10);

    void t(int i10, List<Long> list, boolean z10);

    void u(int i10, long j10);

    a v();

    void w(int i10, long j10);

    void x(int i10, float f10);

    void y(int i10, List<String> list);

    @Deprecated
    void z(int i10);
}
