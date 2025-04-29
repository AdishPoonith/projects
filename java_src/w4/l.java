package w4;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final r4.b f19883a;

    public l(r4.b bVar) {
        this.f19883a = (r4.b) c4.s.j(bVar);
    }

    public String a() {
        try {
            return this.f19883a.zzj();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f19883a.zzi();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c() {
        try {
            this.f19883a.zzm();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean d() {
        try {
            return this.f19883a.g0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e() {
        try {
            this.f19883a.zzn();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            try {
                return this.f19883a.p2(((l) obj).f19883a);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        }
        return false;
    }

    public void f(float f10) {
        try {
            this.f19883a.n1(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(float f10, float f11) {
        try {
            this.f19883a.b2(f10, f11);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(boolean z10) {
        try {
            this.f19883a.j(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19883a.zzg();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f19883a.t(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(a aVar) {
        try {
            if (aVar == null) {
                this.f19883a.N1(null);
                return;
            }
            this.f19883a.N1(aVar.a());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(float f10, float f11) {
        try {
            this.f19883a.U1(f10, f11);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void l(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f19883a.d2(latLng);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f19883a.x0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void n(String str) {
        try {
            this.f19883a.K1(str);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void o(String str) {
        try {
            this.f19883a.m0(str);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void p(boolean z10) {
        try {
            this.f19883a.q(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void q(float f10) {
        try {
            this.f19883a.E(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void r() {
        try {
            this.f19883a.q0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
