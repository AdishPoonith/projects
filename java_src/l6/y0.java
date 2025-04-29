package l6;

import java.util.HashMap;
import java.util.Map;
import l6.o0;
/* loaded from: classes.dex */
public final class y0 extends e1 {

    /* renamed from: i  reason: collision with root package name */
    private i1 f13389i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13390j;

    /* renamed from: c  reason: collision with root package name */
    private final Map<h6.j, w0> f13383c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final t0 f13385e = new t0();

    /* renamed from: f  reason: collision with root package name */
    private final a1 f13386f = new a1(this);

    /* renamed from: g  reason: collision with root package name */
    private final q0 f13387g = new q0();

    /* renamed from: h  reason: collision with root package name */
    private final z0 f13388h = new z0();

    /* renamed from: d  reason: collision with root package name */
    private final Map<h6.j, r0> f13384d = new HashMap();

    private y0() {
    }

    public static y0 n() {
        y0 y0Var = new y0();
        y0Var.t(new s0(y0Var));
        return y0Var;
    }

    public static y0 o(o0.b bVar, o oVar) {
        y0 y0Var = new y0();
        y0Var.t(new v0(y0Var, bVar, oVar));
        return y0Var;
    }

    private void t(i1 i1Var) {
        this.f13389i = i1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public a a() {
        return this.f13387g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public b b(h6.j jVar) {
        r0 r0Var = this.f13384d.get(jVar);
        if (r0Var == null) {
            r0 r0Var2 = new r0();
            this.f13384d.put(jVar, r0Var2);
            return r0Var2;
        }
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public b1 d(h6.j jVar, l lVar) {
        w0 w0Var = this.f13383c.get(jVar);
        if (w0Var == null) {
            w0 w0Var2 = new w0(this, jVar);
            this.f13383c.put(jVar, w0Var2);
            return w0Var2;
        }
        return w0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public c1 e() {
        return new x0();
    }

    @Override // l6.e1
    public i1 f() {
        return this.f13389i;
    }

    @Override // l6.e1
    public boolean i() {
        return this.f13390j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public <T> T j(String str, q6.y<T> yVar) {
        this.f13389i.j();
        try {
            return yVar.get();
        } finally {
            this.f13389i.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public void k(String str, Runnable runnable) {
        this.f13389i.j();
        try {
            runnable.run();
        } finally {
            this.f13389i.g();
        }
    }

    @Override // l6.e1
    public void l() {
        q6.b.d(this.f13390j, "MemoryPersistence shutdown without start", new Object[0]);
        this.f13390j = false;
    }

    @Override // l6.e1
    public void m() {
        q6.b.d(!this.f13390j, "MemoryPersistence double-started!", new Object[0]);
        this.f13390j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    /* renamed from: p */
    public t0 c(h6.j jVar) {
        return this.f13385e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterable<w0> q() {
        return this.f13383c.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    /* renamed from: r */
    public z0 g() {
        return this.f13388h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    /* renamed from: s */
    public a1 h() {
        return this.f13386f;
    }
}
