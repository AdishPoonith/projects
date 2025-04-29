package w4;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final r4.v f19864a;

    public e(r4.v vVar) {
        this.f19864a = (r4.v) c4.s.j(vVar);
    }

    public String a() {
        try {
            return this.f19864a.zzl();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f19864a.zzn();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(LatLng latLng) {
        try {
            c4.s.k(latLng, "center must not be null.");
            this.f19864a.g1(latLng);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(boolean z10) {
        try {
            this.f19864a.L(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(int i10) {
        try {
            this.f19864a.g(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            try {
                return this.f19864a.c1(((e) obj).f19864a);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        }
        return false;
    }

    public void f(double d10) {
        try {
            this.f19864a.r0(d10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f19864a.q1(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f19864a.B2(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f19864a.zzi();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(boolean z10) {
        try {
            this.f19864a.B1(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f19864a.A(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
