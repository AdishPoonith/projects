package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
final class i implements e1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f11364a = new AtomicLong();

    @Override // io.grpc.internal.e1
    public void a(long j10) {
        this.f11364a.getAndAdd(j10);
    }
}
