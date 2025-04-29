package io.grpc.internal;

import i9.a1;
import i9.r0;
import java.util.Map;
/* loaded from: classes.dex */
public final class s1 extends i9.s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11651b = 0;

    @Override // i9.r0.c
    public i9.r0 a(r0.d dVar) {
        return new r1(dVar);
    }

    @Override // i9.s0
    public String b() {
        return "pick_first";
    }

    @Override // i9.s0
    public int c() {
        return 5;
    }

    @Override // i9.s0
    public boolean d() {
        return true;
    }

    @Override // i9.s0
    public a1.c e(Map<String, ?> map) {
        return a1.c.a("no service config");
    }
}
