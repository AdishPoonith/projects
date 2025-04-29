package q0;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f15961a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15962b = n.class.getName();

    private n() {
    }

    public static final synchronized void a(a accessTokenAppIdPair, e0 appEvents) {
        synchronized (n.class) {
            if (k1.a.d(n.class)) {
                return;
            }
            kotlin.jvm.internal.l.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.l.e(appEvents, "appEvents");
            y0.g gVar = y0.g.f20314a;
            y0.g.b();
            f fVar = f.f15932a;
            d0 a10 = f.a();
            a10.a(accessTokenAppIdPair, appEvents.d());
            f.b(a10);
        }
    }

    public static final synchronized void b(e eventsToPersist) {
        synchronized (n.class) {
            if (k1.a.d(n.class)) {
                return;
            }
            kotlin.jvm.internal.l.e(eventsToPersist, "eventsToPersist");
            y0.g gVar = y0.g.f20314a;
            y0.g.b();
            f fVar = f.f15932a;
            d0 a10 = f.a();
            for (a aVar : eventsToPersist.f()) {
                e0 c10 = eventsToPersist.c(aVar);
                if (c10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                a10.a(aVar, c10.d());
            }
            f fVar2 = f.f15932a;
            f.b(a10);
        }
    }
}
