package w4;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final r4.k f19942a;

    public z(r4.k kVar) {
        this.f19942a = (r4.k) c4.s.j(kVar);
    }

    public void a() {
        try {
            this.f19942a.zzh();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean b() {
        try {
            return this.f19942a.zzo();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public String c() {
        try {
            return this.f19942a.zzg();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public float d() {
        try {
            return this.f19942a.zzd();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public float e() {
        try {
            return this.f19942a.zze();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            try {
                return this.f19942a.l0(((z) obj).f19942a);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        }
        return false;
    }

    public boolean f() {
        try {
            return this.f19942a.zzp();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g() {
        try {
            this.f19942a.zzi();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(boolean z10) {
        try {
            this.f19942a.l1(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f19942a.zzf();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f19942a.v1(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(boolean z10) {
        try {
            this.f19942a.Q(z10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f19942a.a0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
