package w4;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final r4.e f19901a;

    public o(r4.e eVar) {
        this.f19901a = (r4.e) c4.s.j(eVar);
    }

    public String a() {
        try {
            return this.f19901a.zzk();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f19901a.zzo();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(boolean z10) {
        try {
            this.f19901a.L(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f19901a.g(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(boolean z10) {
        try {
            this.f19901a.t(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            try {
                return this.f19901a.U0(((o) obj).f19901a);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        }
        return false;
    }

    public void f(List<? extends List<LatLng>> list) {
        try {
            this.f19901a.b1(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(List<LatLng> list) {
        try {
            c4.s.k(list, "points must not be null.");
            this.f19901a.k0(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(int i10) {
        try {
            this.f19901a.K(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19901a.zzi();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f19901a.A(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f19901a.q(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f19901a.E(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
