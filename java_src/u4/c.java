package u4;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import w4.a0;
import w4.z;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final v4.b f19038a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f19039b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private u4.i f19040c;

    /* loaded from: classes.dex */
    public interface a {
        void V();
    }

    /* loaded from: classes.dex */
    public interface b {
        void z();
    }

    /* renamed from: u4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0272c {
        void l(int i10);
    }

    /* loaded from: classes.dex */
    public interface d {
        void t(w4.e eVar);
    }

    /* loaded from: classes.dex */
    public interface e {
        void c(w4.l lVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void T(LatLng latLng);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes.dex */
    public interface h {
        void P(LatLng latLng);
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean R(w4.l lVar);
    }

    /* loaded from: classes.dex */
    public interface j {
        void U(w4.l lVar);

        void p(w4.l lVar);

        void y(w4.l lVar);
    }

    /* loaded from: classes.dex */
    public interface k {
        void E(w4.o oVar);
    }

    /* loaded from: classes.dex */
    public interface l {
        void h(w4.q qVar);
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(Bitmap bitmap);
    }

    public c(v4.b bVar) {
        this.f19038a = (v4.b) c4.s.j(bVar);
    }

    public final void A(d dVar) {
        try {
            if (dVar == null) {
                this.f19038a.w0(null);
            } else {
                this.f19038a.w0(new q(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void B(e eVar) {
        try {
            if (eVar == null) {
                this.f19038a.A1(null);
            } else {
                this.f19038a.A1(new o(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void C(f fVar) {
        try {
            if (fVar == null) {
                this.f19038a.u2(null);
            } else {
                this.f19038a.u2(new x(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public void D(g gVar) {
        try {
            if (gVar == null) {
                this.f19038a.l2(null);
            } else {
                this.f19038a.l2(new p(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void E(h hVar) {
        try {
            if (hVar == null) {
                this.f19038a.H0(null);
            } else {
                this.f19038a.H0(new y(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void F(i iVar) {
        try {
            if (iVar == null) {
                this.f19038a.p0(null);
            } else {
                this.f19038a.p0(new u4.j(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void G(j jVar) {
        try {
            if (jVar == null) {
                this.f19038a.N0(null);
            } else {
                this.f19038a.N0(new n(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void H(k kVar) {
        try {
            if (kVar == null) {
                this.f19038a.c0(null);
            } else {
                this.f19038a.c0(new r(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void I(l lVar) {
        try {
            if (lVar == null) {
                this.f19038a.t2(null);
            } else {
                this.f19038a.t2(new s(this, lVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void J(int i10, int i11, int i12, int i13) {
        try {
            this.f19038a.W0(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void K(boolean z10) {
        try {
            this.f19038a.G(z10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void L(m mVar) {
        c4.s.k(mVar, "Callback must not be null.");
        M(mVar, null);
    }

    public final void M(m mVar, Bitmap bitmap) {
        c4.s.k(mVar, "Callback must not be null.");
        try {
            this.f19038a.i0(new t(this, mVar), (k4.d) (bitmap != null ? k4.d.H2(bitmap) : null));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final w4.e a(w4.f fVar) {
        try {
            c4.s.k(fVar, "CircleOptions must not be null.");
            return new w4.e(this.f19038a.E0(fVar));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final w4.l b(w4.m mVar) {
        try {
            c4.s.k(mVar, "MarkerOptions must not be null.");
            r4.b o02 = this.f19038a.o0(mVar);
            if (o02 != null) {
                return new w4.l(o02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final w4.o c(w4.p pVar) {
        try {
            c4.s.k(pVar, "PolygonOptions must not be null");
            return new w4.o(this.f19038a.J1(pVar));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final w4.q d(w4.r rVar) {
        try {
            c4.s.k(rVar, "PolylineOptions must not be null");
            return new w4.q(this.f19038a.r1(rVar));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final z e(a0 a0Var) {
        try {
            c4.s.k(a0Var, "TileOverlayOptions must not be null.");
            r4.k h12 = this.f19038a.h1(a0Var);
            if (h12 != null) {
                return new z(h12);
            }
            return null;
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void f(u4.a aVar) {
        try {
            c4.s.k(aVar, "CameraUpdate must not be null.");
            this.f19038a.X1(aVar.a());
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final CameraPosition g() {
        try {
            return this.f19038a.s1();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final float h() {
        try {
            return this.f19038a.Q1();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final float i() {
        try {
            return this.f19038a.Y();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final u4.h j() {
        try {
            return new u4.h(this.f19038a.X0());
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final u4.i k() {
        try {
            if (this.f19040c == null) {
                this.f19040c = new u4.i(this.f19038a.s0());
            }
            return this.f19040c;
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final boolean l() {
        try {
            return this.f19038a.G0();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final boolean m() {
        try {
            return this.f19038a.f2();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void n(u4.a aVar) {
        try {
            c4.s.k(aVar, "CameraUpdate must not be null.");
            this.f19038a.f0(aVar.a());
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public void o() {
        try {
            this.f19038a.U();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void p(boolean z10) {
        try {
            this.f19038a.f(z10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final boolean q(boolean z10) {
        try {
            return this.f19038a.k(z10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f19038a.z0(latLngBounds);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public boolean s(w4.k kVar) {
        try {
            return this.f19038a.j2(kVar);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void t(int i10) {
        try {
            this.f19038a.e(i10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public void u(float f10) {
        try {
            this.f19038a.o2(f10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public void v(float f10) {
        try {
            this.f19038a.A2(f10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void w(boolean z10) {
        try {
            this.f19038a.C(z10);
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void x(a aVar) {
        try {
            if (aVar == null) {
                this.f19038a.G1(null);
            } else {
                this.f19038a.G1(new w(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void y(b bVar) {
        try {
            if (bVar == null) {
                this.f19038a.E1(null);
            } else {
                this.f19038a.E1(new v(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public final void z(InterfaceC0272c interfaceC0272c) {
        try {
            if (interfaceC0272c == null) {
                this.f19038a.g2(null);
            } else {
                this.f19038a.g2(new u(this, interfaceC0272c));
            }
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }
}
