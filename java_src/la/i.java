package la;

import v9.e;
/* loaded from: classes.dex */
public final /* synthetic */ class i {
    public static final <T> r0<T> a(k0 k0Var, v9.g gVar, m0 m0Var, da.p<? super k0, ? super v9.d<? super T>, ? extends Object> pVar) {
        v9.g d10 = f0.d(k0Var, gVar);
        s0 e2Var = m0Var.h() ? new e2(d10, pVar) : new s0(d10, true);
        ((a) e2Var).S0(m0Var, e2Var, pVar);
        return e2Var;
    }

    public static /* synthetic */ r0 b(k0 k0Var, v9.g gVar, m0 m0Var, da.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = v9.h.f19537j;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return h.a(k0Var, gVar, m0Var, pVar);
    }

    public static final v1 c(k0 k0Var, v9.g gVar, m0 m0Var, da.p<? super k0, ? super v9.d<? super s9.u>, ? extends Object> pVar) {
        v9.g d10 = f0.d(k0Var, gVar);
        a f2Var = m0Var.h() ? new f2(d10, pVar) : new o2(d10, true);
        f2Var.S0(m0Var, f2Var, pVar);
        return f2Var;
    }

    public static /* synthetic */ v1 d(k0 k0Var, v9.g gVar, m0 m0Var, da.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = v9.h.f19537j;
        }
        if ((i10 & 2) != 0) {
            m0Var = m0.DEFAULT;
        }
        return h.c(k0Var, gVar, m0Var, pVar);
    }

    public static final <T> Object e(v9.g gVar, da.p<? super k0, ? super v9.d<? super T>, ? extends Object> pVar, v9.d<? super T> dVar) {
        Object U0;
        Object c10;
        v9.g context = dVar.getContext();
        v9.g e10 = f0.e(context, gVar);
        z1.i(e10);
        if (e10 == context) {
            kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(e10, dVar);
            U0 = qa.b.b(zVar, zVar, pVar);
        } else {
            e.b bVar = v9.e.f19534h;
            if (kotlin.jvm.internal.l.a(e10.b(bVar), context.b(bVar))) {
                z2 z2Var = new z2(e10, dVar);
                Object c11 = kotlinx.coroutines.internal.f0.c(e10, null);
                try {
                    Object b10 = qa.b.b(z2Var, z2Var, pVar);
                    kotlinx.coroutines.internal.f0.a(e10, c11);
                    U0 = b10;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.f0.a(e10, c11);
                    throw th;
                }
            } else {
                w0 w0Var = new w0(e10, dVar);
                qa.a.d(pVar, w0Var, w0Var, null, 4, null);
                U0 = w0Var.U0();
            }
        }
        c10 = w9.d.c();
        if (U0 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return U0;
    }
}
