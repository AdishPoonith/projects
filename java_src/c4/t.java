package c4;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    private static t f3390b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f3391c = new u(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private u f3392a;

    private t() {
    }

    public static synchronized t b() {
        t tVar;
        synchronized (t.class) {
            if (f3390b == null) {
                f3390b = new t();
            }
            tVar = f3390b;
        }
        return tVar;
    }

    public u a() {
        return this.f3392a;
    }

    public final synchronized void c(u uVar) {
        if (uVar == null) {
            this.f3392a = f3391c;
            return;
        }
        u uVar2 = this.f3392a;
        if (uVar2 == null || uVar2.F() < uVar.F()) {
            this.f3392a = uVar;
        }
    }
}
