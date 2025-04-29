package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public final class o0 extends c0 {

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.gms.common.api.e f3897c;

    public o0(com.google.android.gms.common.api.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f3897c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends com.google.android.gms.common.api.m, T extends d<R, A>> T a(T t10) {
        return (T) this.f3897c.j(t10);
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.m, A>> T b(T t10) {
        return (T) this.f3897c.n(t10);
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper d() {
        return this.f3897c.t();
    }
}
