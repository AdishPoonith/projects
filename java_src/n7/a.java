package n7;

import i7.c;
import i7.g;
import java.util.Map;
import l7.b;
import o7.e;
import o7.i;
import o7.j;
import o7.k;
import o7.l;
/* loaded from: classes.dex */
public final class a implements g {
    private static b b(u7.b bVar, int i10, int i11) {
        b bVar2;
        int e10 = bVar.e();
        int d10 = bVar.d();
        int max = Math.max(i10, e10);
        int max2 = Math.max(i11, d10);
        int min = Math.min(max / e10, max2 / d10);
        int i12 = (max - (e10 * min)) / 2;
        int i13 = (max2 - (d10 * min)) / 2;
        if (i11 < d10 || i10 < e10) {
            bVar2 = new b(e10, d10);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new b(i10, i11);
        }
        bVar2.c();
        int i14 = 0;
        while (i14 < d10) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < e10) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.j(i15, i13, min, min);
                }
                i16++;
                i15 += min;
            }
            i14++;
            i13 += min;
        }
        return bVar2;
    }

    private static b c(e eVar, k kVar, int i10, int i11) {
        int h10 = kVar.h();
        int g10 = kVar.g();
        u7.b bVar = new u7.b(kVar.j(), kVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < g10; i13++) {
            if (i13 % kVar.f14717e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < kVar.j(); i15++) {
                    bVar.g(i14, i12, i15 % 2 == 0);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < h10; i17++) {
                if (i17 % kVar.f14716d == 0) {
                    bVar.g(i16, i12, true);
                    i16++;
                }
                bVar.g(i16, i12, eVar.e(i17, i13));
                i16++;
                int i18 = kVar.f14716d;
                if (i17 % i18 == i18 - 1) {
                    bVar.g(i16, i12, i13 % 2 == 0);
                    i16++;
                }
            }
            i12++;
            int i19 = kVar.f14717e;
            if (i13 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < kVar.j(); i21++) {
                    bVar.g(i20, i12, true);
                    i20++;
                }
                i12++;
            }
        }
        return b(bVar, i10, i11);
    }

    @Override // i7.g
    public b a(String str, i7.a aVar, int i10, int i11, Map<c, ?> map) {
        i7.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar == i7.a.DATA_MATRIX) {
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
            }
            l lVar = l.FORCE_NONE;
            i7.b bVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                i7.b bVar3 = (i7.b) map.get(c.MIN_SIZE);
                if (bVar3 == null) {
                    bVar3 = null;
                }
                bVar = (i7.b) map.get(c.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                bVar2 = bVar3;
            } else {
                bVar = null;
            }
            String b10 = j.b(str, lVar, bVar2, bVar);
            k l10 = k.l(b10.length(), lVar, bVar2, bVar, true);
            e eVar = new e(i.c(b10, l10), l10.h(), l10.g());
            eVar.h();
            return c(eVar, l10, i10, i11);
        }
        throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
    }
}
