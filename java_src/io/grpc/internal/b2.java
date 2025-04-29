package io.grpc.internal;

import i9.a1;
import java.util.Map;
/* loaded from: classes.dex */
public final class b2 extends a1.h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11057a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11058b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11059c;

    /* renamed from: d  reason: collision with root package name */
    private final j f11060d;

    public b2(boolean z10, int i10, int i11, j jVar) {
        this.f11057a = z10;
        this.f11058b = i10;
        this.f11059c = i11;
        this.f11060d = (j) b5.n.o(jVar, "autoLoadBalancerFactory");
    }

    @Override // i9.a1.h
    public a1.c a(Map<String, ?> map) {
        Object c10;
        try {
            a1.c f10 = this.f11060d.f(map);
            if (f10 == null) {
                c10 = null;
            } else if (f10.d() != null) {
                return a1.c.b(f10.d());
            } else {
                c10 = f10.c();
            }
            return a1.c.a(j1.b(map, this.f11057a, this.f11058b, this.f11059c, c10));
        } catch (RuntimeException e10) {
            return a1.c.b(i9.j1.f9925h.q("failed to parse service config").p(e10));
        }
    }
}
