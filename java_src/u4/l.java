package u4;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import v4.d0;
/* loaded from: classes.dex */
final class l implements k4.c {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f19052a;

    /* renamed from: b  reason: collision with root package name */
    private final v4.c f19053b;

    /* renamed from: c  reason: collision with root package name */
    private View f19054c;

    public l(ViewGroup viewGroup, v4.c cVar) {
        this.f19053b = (v4.c) c4.s.j(cVar);
        this.f19052a = (ViewGroup) c4.s.j(viewGroup);
    }

    @Override // k4.c
    public final void H() {
        try {
            this.f19053b.H();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    @Override // k4.c
    public final void I(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.f19053b.I(bundle2);
            d0.b(bundle2, bundle);
            this.f19054c = (View) k4.d.M(this.f19053b.w());
            this.f19052a.removeAllViews();
            this.f19052a.addView(this.f19054c);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    @Override // k4.c
    public final void a(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.f19053b.a(bundle2);
            d0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void b(f fVar) {
        try {
            this.f19053b.P0(new k(this, fVar));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    @Override // k4.c
    public final void c() {
        try {
            this.f19053b.c();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    @Override // k4.c
    public final void d() {
        try {
            this.f19053b.d();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    @Override // k4.c
    public final void r() {
        try {
            this.f19053b.r();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }
}
