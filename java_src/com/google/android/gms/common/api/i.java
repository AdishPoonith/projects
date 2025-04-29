package com.google.android.gms.common.api;
/* loaded from: classes.dex */
public final class i {
    public static <R extends m> h<R> a(R r10, f fVar) {
        c4.s.k(r10, "Result must not be null");
        c4.s.b(!r10.p().G(), "Status code must not be SUCCESS");
        r rVar = new r(fVar, r10);
        rVar.f(r10);
        return rVar;
    }

    public static <R extends m> g<R> b(R r10, f fVar) {
        c4.s.k(r10, "Result must not be null");
        s sVar = new s(fVar);
        sVar.f(r10);
        return new com.google.android.gms.common.api.internal.n(sVar);
    }

    public static h<Status> c(Status status, f fVar) {
        c4.s.k(status, "Result must not be null");
        com.google.android.gms.common.api.internal.t tVar = new com.google.android.gms.common.api.internal.t(fVar);
        tVar.f(status);
        return tVar;
    }
}
