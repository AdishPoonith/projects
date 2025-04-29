package w4;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final r4.h f19913a;

    public q(r4.h hVar) {
        this.f19913a = (r4.h) c4.s.j(hVar);
    }

    public String a() {
        try {
            return this.f19913a.zzl();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f19913a.zzp();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f19913a.j(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f19913a.D0(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(d dVar) {
        c4.s.k(dVar, "endCap must not be null");
        try {
            this.f19913a.N(dVar);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            try {
                return this.f19913a.C1(((q) obj).f19913a);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        }
        return false;
    }

    public void f(boolean z10) {
        try {
            this.f19913a.s2(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f19913a.K(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(List<n> list) {
        try {
            this.f19913a.zzv(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19913a.zzh();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(List<LatLng> list) {
        c4.s.k(list, "points must not be null");
        try {
            this.f19913a.zzw(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(d dVar) {
        c4.s.k(dVar, "startCap must not be null");
        try {
            this.f19913a.z1(dVar);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(boolean z10) {
        try {
            this.f19913a.q2(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f19913a.R(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f19913a.t0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
