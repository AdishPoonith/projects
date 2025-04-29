package u2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s1.y3;
import t1.t1;
import u2.b0;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public abstract class a implements u {

    /* renamed from: j  reason: collision with root package name */
    private final ArrayList<u.c> f18753j = new ArrayList<>(1);

    /* renamed from: k  reason: collision with root package name */
    private final HashSet<u.c> f18754k = new HashSet<>(1);

    /* renamed from: l  reason: collision with root package name */
    private final b0.a f18755l = new b0.a();

    /* renamed from: m  reason: collision with root package name */
    private final w.a f18756m = new w.a();

    /* renamed from: n  reason: collision with root package name */
    private Looper f18757n;

    /* renamed from: o  reason: collision with root package name */
    private y3 f18758o;

    /* renamed from: p  reason: collision with root package name */
    private t1 f18759p;

    /* JADX INFO: Access modifiers changed from: protected */
    public final t1 A() {
        return (t1) p3.a.h(this.f18759p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        return !this.f18754k.isEmpty();
    }

    protected abstract void C(o3.p0 p0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(y3 y3Var) {
        this.f18758o = y3Var;
        Iterator<u.c> it = this.f18753j.iterator();
        while (it.hasNext()) {
            it.next().a(this, y3Var);
        }
    }

    protected abstract void E();

    @Override // u2.u
    public final void c(u.c cVar) {
        this.f18753j.remove(cVar);
        if (!this.f18753j.isEmpty()) {
            k(cVar);
            return;
        }
        this.f18757n = null;
        this.f18758o = null;
        this.f18759p = null;
        this.f18754k.clear();
        E();
    }

    @Override // u2.u
    public final void d(u.c cVar) {
        p3.a.e(this.f18757n);
        boolean isEmpty = this.f18754k.isEmpty();
        this.f18754k.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    @Override // u2.u
    public final void e(b0 b0Var) {
        this.f18755l.C(b0Var);
    }

    @Override // u2.u
    public /* synthetic */ boolean g() {
        return t.b(this);
    }

    @Override // u2.u
    public final void h(u.c cVar, o3.p0 p0Var, t1 t1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f18757n;
        p3.a.a(looper == null || looper == myLooper);
        this.f18759p = t1Var;
        y3 y3Var = this.f18758o;
        this.f18753j.add(cVar);
        if (this.f18757n == null) {
            this.f18757n = myLooper;
            this.f18754k.add(cVar);
            C(p0Var);
        } else if (y3Var != null) {
            d(cVar);
            cVar.a(this, y3Var);
        }
    }

    @Override // u2.u
    public /* synthetic */ y3 j() {
        return t.a(this);
    }

    @Override // u2.u
    public final void k(u.c cVar) {
        boolean z10 = !this.f18754k.isEmpty();
        this.f18754k.remove(cVar);
        if (z10 && this.f18754k.isEmpty()) {
            y();
        }
    }

    @Override // u2.u
    public final void l(Handler handler, b0 b0Var) {
        p3.a.e(handler);
        p3.a.e(b0Var);
        this.f18755l.g(handler, b0Var);
    }

    @Override // u2.u
    public final void p(Handler handler, w1.w wVar) {
        p3.a.e(handler);
        p3.a.e(wVar);
        this.f18756m.g(handler, wVar);
    }

    @Override // u2.u
    public final void q(w1.w wVar) {
        this.f18756m.t(wVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w.a s(int i10, u.b bVar) {
        return this.f18756m.u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final w.a t(u.b bVar) {
        return this.f18756m.u(0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a v(int i10, u.b bVar, long j10) {
        return this.f18755l.F(i10, bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a w(u.b bVar) {
        return this.f18755l.F(0, bVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b0.a x(u.b bVar, long j10) {
        p3.a.e(bVar);
        return this.f18755l.F(0, bVar, j10);
    }

    protected void y() {
    }

    protected void z() {
    }
}
