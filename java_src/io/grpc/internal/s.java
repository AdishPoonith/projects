package io.grpc.internal;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface s extends i9.i0<Object> {

    /* loaded from: classes.dex */
    public interface a {
        void a(Throwable th);

        void b(long j10);
    }

    q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr);

    void h(a aVar, Executor executor);
}
