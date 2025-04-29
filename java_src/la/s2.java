package la;
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public static final s2 f13665a = new s2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<g1> f13666b = new ThreadLocal<>();

    private s2() {
    }

    public final g1 a() {
        ThreadLocal<g1> threadLocal = f13666b;
        g1 g1Var = threadLocal.get();
        if (g1Var == null) {
            g1 a10 = j1.a();
            threadLocal.set(a10);
            return a10;
        }
        return g1Var;
    }

    public final void b() {
        f13666b.set(null);
    }

    public final void c(g1 g1Var) {
        f13666b.set(g1Var);
    }
}
