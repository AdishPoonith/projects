package io.grpc.internal;
/* loaded from: classes.dex */
public interface r extends k2 {

    /* loaded from: classes.dex */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void c(i9.j1 j1Var, a aVar, i9.y0 y0Var);

    void d(i9.y0 y0Var);
}
