package io.grpc.internal;

import i9.v0;
/* loaded from: classes.dex */
public abstract class b<T extends i9.v0<T>> extends i9.v0<T> {

    /* renamed from: a  reason: collision with root package name */
    protected int f11010a = 4194304;

    @Override // i9.v0
    public i9.u0 a() {
        return e().a();
    }

    protected abstract i9.v0<?> e();

    public String toString() {
        return b5.h.c(this).d("delegate", e()).toString();
    }
}
