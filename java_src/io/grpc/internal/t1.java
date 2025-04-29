package io.grpc.internal;

import i9.r0;
/* loaded from: classes.dex */
public final class t1 extends r0.f {

    /* renamed from: a  reason: collision with root package name */
    private final i9.c f11659a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.y0 f11660b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.z0<?, ?> f11661c;

    public t1(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar) {
        this.f11661c = (i9.z0) b5.n.o(z0Var, "method");
        this.f11660b = (i9.y0) b5.n.o(y0Var, "headers");
        this.f11659a = (i9.c) b5.n.o(cVar, "callOptions");
    }

    @Override // i9.r0.f
    public i9.c a() {
        return this.f11659a;
    }

    @Override // i9.r0.f
    public i9.y0 b() {
        return this.f11660b;
    }

    @Override // i9.r0.f
    public i9.z0<?, ?> c() {
        return this.f11661c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1.class != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return b5.j.a(this.f11659a, t1Var.f11659a) && b5.j.a(this.f11660b, t1Var.f11660b) && b5.j.a(this.f11661c, t1Var.f11661c);
    }

    public int hashCode() {
        return b5.j.b(this.f11659a, this.f11660b, this.f11661c);
    }

    public final String toString() {
        return "[method=" + this.f11661c + " headers=" + this.f11660b + " callOptions=" + this.f11659a + "]";
    }
}
