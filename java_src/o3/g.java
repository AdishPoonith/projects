package o3;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14430a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<p0> f14431b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f14432c;

    /* renamed from: d  reason: collision with root package name */
    private p f14433d;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(boolean z10) {
        this.f14430a = z10;
    }

    @Override // o3.l
    public /* synthetic */ Map e() {
        return k.a(this);
    }

    @Override // o3.l
    public final void h(p0 p0Var) {
        p3.a.e(p0Var);
        if (this.f14431b.contains(p0Var)) {
            return;
        }
        this.f14431b.add(p0Var);
        this.f14432c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(int i10) {
        p pVar = (p) p3.n0.j(this.f14433d);
        for (int i11 = 0; i11 < this.f14432c; i11++) {
            this.f14431b.get(i11).e(this, pVar, this.f14430a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        p pVar = (p) p3.n0.j(this.f14433d);
        for (int i10 = 0; i10 < this.f14432c; i10++) {
            this.f14431b.get(i10).c(this, pVar, this.f14430a);
        }
        this.f14433d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(p pVar) {
        for (int i10 = 0; i10 < this.f14432c; i10++) {
            this.f14431b.get(i10).b(this, pVar, this.f14430a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(p pVar) {
        this.f14433d = pVar;
        for (int i10 = 0; i10 < this.f14432c; i10++) {
            this.f14431b.get(i10).h(this, pVar, this.f14430a);
        }
    }
}
