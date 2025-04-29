package q8;

import r8.t;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<String> f16335a;

    public e(e8.a aVar) {
        this.f16335a = new r8.a<>(aVar, "flutter/lifecycle", t.f16795b);
    }

    public void a() {
        d8.b.f("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f16335a.c("AppLifecycleState.detached");
    }

    public void b() {
        d8.b.f("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f16335a.c("AppLifecycleState.inactive");
    }

    public void c() {
        d8.b.f("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f16335a.c("AppLifecycleState.paused");
    }

    public void d() {
        d8.b.f("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f16335a.c("AppLifecycleState.resumed");
    }
}
