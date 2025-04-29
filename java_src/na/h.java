package na;

import s9.u;
/* loaded from: classes.dex */
public final class h {
    public static final <E> f<E> a(int i10, e eVar, da.l<? super E, u> lVar) {
        if (i10 == -2) {
            return new d(eVar == e.SUSPEND ? f.f14374a.a() : 1, eVar, lVar);
        } else if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? (i10 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(i10, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        } else {
            if ((eVar != e.SUSPEND ? 0 : 1) != 0) {
                return new m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ f b(int i10, e eVar, da.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, eVar, lVar);
    }
}
