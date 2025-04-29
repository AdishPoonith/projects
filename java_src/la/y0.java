package la;

import s9.n;
/* loaded from: classes.dex */
public final class y0 {
    public static final <T> void a(x0<? super T> x0Var, int i10) {
        v9.d<? super T> b10 = x0Var.b();
        boolean z10 = i10 == 4;
        if (z10 || !(b10 instanceof kotlinx.coroutines.internal.f) || b(i10) != b(x0Var.f13680l)) {
            d(x0Var, b10, z10);
            return;
        }
        g0 g0Var = ((kotlinx.coroutines.internal.f) b10).f12874m;
        v9.g context = b10.getContext();
        if (g0Var.i0(context)) {
            g0Var.h0(context, x0Var);
        } else {
            e(x0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(x0<? super T> x0Var, v9.d<? super T> dVar, boolean z10) {
        Object h10;
        Object k10 = x0Var.k();
        Throwable e10 = x0Var.e(k10);
        if (e10 != null) {
            n.a aVar = s9.n.f17870k;
            h10 = s9.o.a(e10);
        } else {
            n.a aVar2 = s9.n.f17870k;
            h10 = x0Var.h(k10);
        }
        Object b10 = s9.n.b(h10);
        if (!z10) {
            dVar.resumeWith(b10);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
        v9.d<T> dVar2 = fVar.f12875n;
        Object obj = fVar.f12877p;
        v9.g context = dVar2.getContext();
        Object c10 = kotlinx.coroutines.internal.f0.c(context, obj);
        z2<?> g10 = c10 != kotlinx.coroutines.internal.f0.f12878a ? f0.g(dVar2, context, c10) : null;
        try {
            fVar.f12875n.resumeWith(b10);
            s9.u uVar = s9.u.f17878a;
        } finally {
            if (g10 == null || g10.U0()) {
                kotlinx.coroutines.internal.f0.a(context, c10);
            }
        }
    }

    private static final void e(x0<?> x0Var) {
        g1 a10 = s2.f13665a.a();
        if (a10.q0()) {
            a10.m0(x0Var);
            return;
        }
        a10.o0(true);
        try {
            d(x0Var, x0Var.b(), true);
            do {
            } while (a10.s0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
