package io.grpc.internal;

import i9.j1;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    final int f11656a;

    /* renamed from: b  reason: collision with root package name */
    final long f11657b;

    /* renamed from: c  reason: collision with root package name */
    final Set<j1.b> f11658c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(int i10, long j10, Set<j1.b> set) {
        this.f11656a = i10;
        this.f11657b = j10;
        this.f11658c = com.google.common.collect.s.t(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f11656a == t0Var.f11656a && this.f11657b == t0Var.f11657b && b5.j.a(this.f11658c, t0Var.f11658c);
    }

    public int hashCode() {
        return b5.j.b(Integer.valueOf(this.f11656a), Long.valueOf(this.f11657b), this.f11658c);
    }

    public String toString() {
        return b5.h.c(this).b("maxAttempts", this.f11656a).c("hedgingDelayNanos", this.f11657b).d("nonFatalStatusCodes", this.f11658c).toString();
    }
}
