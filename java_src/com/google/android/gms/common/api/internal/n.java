package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n<R extends com.google.android.gms.common.api.m> extends com.google.android.gms.common.api.g<R> {

    /* renamed from: a  reason: collision with root package name */
    private final BasePendingResult f3885a;

    public n(com.google.android.gms.common.api.h hVar) {
        this.f3885a = (BasePendingResult) hVar;
    }

    @Override // com.google.android.gms.common.api.h
    public final void a(h.a aVar) {
        this.f3885a.a(aVar);
    }

    @Override // com.google.android.gms.common.api.h
    public final R b(long j10, TimeUnit timeUnit) {
        return (R) this.f3885a.b(j10, timeUnit);
    }
}
