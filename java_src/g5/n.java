package g5;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import t5.a0;
import t5.c0;
import t5.i0;
import t5.z;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final c0.b f8992a;

    private n(c0.b bVar) {
        this.f8992a = bVar;
    }

    private synchronized c0.c c(t5.y yVar, i0 i0Var) {
        int g10;
        g10 = g();
        if (i0Var == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return c0.c.X().B(yVar).C(g10).E(z.ENABLED).D(i0Var).b();
    }

    private synchronized boolean e(int i10) {
        boolean z10;
        Iterator<c0.c> it = this.f8992a.E().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (it.next().T() == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private synchronized c0.c f(a0 a0Var) {
        return c(w.j(a0Var), a0Var.S());
    }

    private synchronized int g() {
        int b10;
        do {
            b10 = o5.q.b();
        } while (e(b10));
        return b10;
    }

    public static n i() {
        return new n(c0.W());
    }

    public static n j(m mVar) {
        return new n(mVar.f().d());
    }

    public synchronized n a(k kVar) {
        b(kVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(a0 a0Var, boolean z10) {
        c0.c f10;
        f10 = f(a0Var);
        this.f8992a.B(f10);
        if (z10) {
            this.f8992a.F(f10.T());
        }
        return f10.T();
    }

    public synchronized m d() {
        return m.e(this.f8992a.b());
    }

    public synchronized n h(int i10) {
        for (int i11 = 0; i11 < this.f8992a.D(); i11++) {
            c0.c C = this.f8992a.C(i11);
            if (C.T() == i10) {
                if (!C.V().equals(z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                } else {
                    this.f8992a.F(i10);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
