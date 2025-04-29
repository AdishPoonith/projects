package com.google.protobuf;

import java.io.OutputStream;
/* loaded from: classes.dex */
public interface v0 extends w0 {

    /* loaded from: classes.dex */
    public interface a extends w0, Cloneable {
        v0 b();

        v0 e();

        a m(v0 v0Var);

        a q(j jVar, q qVar);
    }

    int a();

    a d();

    byte[] f();

    a g();

    i h();

    f1<? extends v0> i();

    void n(OutputStream outputStream);

    void p(l lVar);
}
