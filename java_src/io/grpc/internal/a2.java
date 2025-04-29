package io.grpc.internal;

import i9.j1;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    final int f11004a;

    /* renamed from: b  reason: collision with root package name */
    final long f11005b;

    /* renamed from: c  reason: collision with root package name */
    final long f11006c;

    /* renamed from: d  reason: collision with root package name */
    final double f11007d;

    /* renamed from: e  reason: collision with root package name */
    final Long f11008e;

    /* renamed from: f  reason: collision with root package name */
    final Set<j1.b> f11009f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(int i10, long j10, long j11, double d10, Long l10, Set<j1.b> set) {
        this.f11004a = i10;
        this.f11005b = j10;
        this.f11006c = j11;
        this.f11007d = d10;
        this.f11008e = l10;
        this.f11009f = com.google.common.collect.s.t(set);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            return this.f11004a == a2Var.f11004a && this.f11005b == a2Var.f11005b && this.f11006c == a2Var.f11006c && Double.compare(this.f11007d, a2Var.f11007d) == 0 && b5.j.a(this.f11008e, a2Var.f11008e) && b5.j.a(this.f11009f, a2Var.f11009f);
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(Integer.valueOf(this.f11004a), Long.valueOf(this.f11005b), Long.valueOf(this.f11006c), Double.valueOf(this.f11007d), this.f11008e, this.f11009f);
    }

    public String toString() {
        return b5.h.c(this).b("maxAttempts", this.f11004a).c("initialBackoffNanos", this.f11005b).c("maxBackoffNanos", this.f11006c).a("backoffMultiplier", this.f11007d).d("perAttemptRecvTimeoutNanos", this.f11008e).d("retryableStatusCodes", this.f11009f).toString();
    }
}
