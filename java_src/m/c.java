package m;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f13694c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f13695d = new Executor() { // from class: m.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g(runnable);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f13696e = new Executor() { // from class: m.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.h(runnable);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private e f13697a;

    /* renamed from: b  reason: collision with root package name */
    private final e f13698b;

    private c() {
        d dVar = new d();
        this.f13698b = dVar;
        this.f13697a = dVar;
    }

    public static c f() {
        if (f13694c != null) {
            return f13694c;
        }
        synchronized (c.class) {
            if (f13694c == null) {
                f13694c = new c();
            }
        }
        return f13694c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // m.e
    public void a(Runnable runnable) {
        this.f13697a.a(runnable);
    }

    @Override // m.e
    public boolean b() {
        return this.f13697a.b();
    }

    @Override // m.e
    public void c(Runnable runnable) {
        this.f13697a.c(runnable);
    }
}
