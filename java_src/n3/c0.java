package n3;

import s1.n3;
import s1.y3;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private a f14151a;

    /* renamed from: b  reason: collision with root package name */
    private o3.f f14152b;

    /* loaded from: classes.dex */
    public interface a {
        void d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o3.f a() {
        return (o3.f) p3.a.h(this.f14152b);
    }

    public void b(a aVar, o3.f fVar) {
        this.f14151a = aVar;
        this.f14152b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f14151a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public void f() {
        this.f14151a = null;
        this.f14152b = null;
    }

    public abstract d0 g(n3[] n3VarArr, v0 v0Var, u.b bVar, y3 y3Var);

    public void h(u1.e eVar) {
    }
}
