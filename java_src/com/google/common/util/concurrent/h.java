package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
/* loaded from: classes.dex */
public final class h<V> extends a.j<V> {
    private h() {
    }

    public static <V> h<V> D() {
        return new h<>();
    }

    @Override // com.google.common.util.concurrent.a
    public boolean B(V v10) {
        return super.B(v10);
    }

    @Override // com.google.common.util.concurrent.a
    public boolean C(Throwable th) {
        return super.C(th);
    }

    @Override // com.google.common.util.concurrent.a.j, com.google.common.util.concurrent.a, java.util.concurrent.Future
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }
}
