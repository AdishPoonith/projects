package c4;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class h1 extends v0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f3326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, null);
        this.f3326g = cVar;
    }

    @Override // c4.v0
    protected final void f(b4.b bVar) {
        if (this.f3326g.s() && c.f0(this.f3326g)) {
            c.b0(this.f3326g, 16);
            return;
        }
        this.f3326g.f3266y.a(bVar);
        this.f3326g.K(bVar);
    }

    @Override // c4.v0
    protected final boolean g() {
        this.f3326g.f3266y.a(b4.b.f2893n);
        return true;
    }
}
