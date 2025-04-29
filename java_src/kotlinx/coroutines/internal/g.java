package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import la.g1;
import la.s2;
import la.v1;
import la.z2;
import s9.n;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private static final b0 f12885a = new b0("UNDEFINED");

    /* renamed from: b */
    public static final b0 f12886b = new b0("REUSABLE_CLAIMED");

    public static final <T> void b(v9.d<? super T> dVar, Object obj, da.l<? super Throwable, s9.u> lVar) {
        boolean z10;
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Object b10 = la.d0.b(obj, lVar);
        if (fVar.f12874m.i0(fVar.getContext())) {
            fVar.f12876o = b10;
            fVar.f13680l = 1;
            fVar.f12874m.h0(fVar.getContext(), fVar);
            return;
        }
        g1 a10 = s2.f13665a.a();
        if (a10.q0()) {
            fVar.f12876o = b10;
            fVar.f13680l = 1;
            a10.m0(fVar);
            return;
        }
        a10.o0(true);
        try {
            v1 v1Var = (v1) fVar.getContext().b(v1.f13674g);
            if (v1Var == null || v1Var.a()) {
                z10 = false;
            } else {
                CancellationException O = v1Var.O();
                fVar.a(b10, O);
                n.a aVar = s9.n.f17870k;
                fVar.resumeWith(s9.n.b(s9.o.a(O)));
                z10 = true;
            }
            if (!z10) {
                v9.d<T> dVar2 = fVar.f12875n;
                Object obj2 = fVar.f12877p;
                v9.g context = dVar2.getContext();
                Object c10 = f0.c(context, obj2);
                z2<?> g10 = c10 != f0.f12878a ? la.f0.g(dVar2, context, c10) : null;
                fVar.f12875n.resumeWith(obj);
                s9.u uVar = s9.u.f17878a;
                if (g10 == null || g10.U0()) {
                    f0.a(context, c10);
                }
            }
            do {
            } while (a10.s0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(v9.d dVar, Object obj, da.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
