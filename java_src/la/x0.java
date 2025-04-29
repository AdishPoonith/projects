package la;

import java.util.concurrent.CancellationException;
import s9.n;
/* loaded from: classes.dex */
public abstract class x0<T> extends kotlinx.coroutines.scheduling.h {

    /* renamed from: l  reason: collision with root package name */
    public int f13680l;

    public x0(int i10) {
        this.f13680l = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract v9.d<T> b();

    public Throwable e(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f13689a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            s9.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l.b(th);
        j0.a(b().getContext(), new n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object b10;
        Object b11;
        Object b12;
        kotlinx.coroutines.scheduling.i iVar = this.f12964k;
        try {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) b();
            v9.d<T> dVar = fVar.f12875n;
            Object obj = fVar.f12877p;
            v9.g context = dVar.getContext();
            Object c10 = kotlinx.coroutines.internal.f0.c(context, obj);
            z2<?> g10 = c10 != kotlinx.coroutines.internal.f0.f12878a ? f0.g(dVar, context, c10) : null;
            v9.g context2 = dVar.getContext();
            Object k10 = k();
            Throwable e10 = e(k10);
            v1 v1Var = (e10 == null && y0.b(this.f13680l)) ? (v1) context2.b(v1.f13674g) : null;
            if (v1Var != null && !v1Var.a()) {
                CancellationException O = v1Var.O();
                a(k10, O);
                n.a aVar = s9.n.f17870k;
                b11 = s9.n.b(s9.o.a(O));
            } else if (e10 != null) {
                n.a aVar2 = s9.n.f17870k;
                b11 = s9.n.b(s9.o.a(e10));
            } else {
                n.a aVar3 = s9.n.f17870k;
                b11 = s9.n.b(h(k10));
            }
            dVar.resumeWith(b11);
            s9.u uVar = s9.u.f17878a;
            if (g10 == null || g10.U0()) {
                kotlinx.coroutines.internal.f0.a(context, c10);
            }
            try {
                n.a aVar4 = s9.n.f17870k;
                iVar.a();
                b12 = s9.n.b(uVar);
            } catch (Throwable th) {
                n.a aVar5 = s9.n.f17870k;
                b12 = s9.n.b(s9.o.a(th));
            }
            i(null, s9.n.d(b12));
        } catch (Throwable th2) {
            try {
                n.a aVar6 = s9.n.f17870k;
                iVar.a();
                b10 = s9.n.b(s9.u.f17878a);
            } catch (Throwable th3) {
                n.a aVar7 = s9.n.f17870k;
                b10 = s9.n.b(s9.o.a(th3));
            }
            i(th2, s9.n.d(b10));
        }
    }
}
