package s7;

import i7.c;
import i7.g;
import java.util.Map;
import l7.b;
import u7.f;
/* loaded from: classes.dex */
public final class a implements g {
    private static b b(f fVar, int i10, int i11, int i12) {
        u7.b a10 = fVar.a();
        if (a10 != null) {
            int e10 = a10.e();
            int d10 = a10.d();
            int i13 = i12 << 1;
            int i14 = e10 + i13;
            int i15 = i13 + d10;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (e10 * min)) / 2;
            int i17 = (max2 - (d10 * min)) / 2;
            b bVar = new b(max, max2);
            int i18 = 0;
            while (i18 < d10) {
                int i19 = i16;
                int i20 = 0;
                while (i20 < e10) {
                    if (a10.b(i20, i18) == 1) {
                        bVar.j(i19, i17, min, min);
                    }
                    i20++;
                    i19 += min;
                }
                i18++;
                i17 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // i7.g
    public b a(String str, i7.a aVar, int i10, int i11, Map<c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar == i7.a.QR_CODE) {
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
            }
            t7.a aVar2 = t7.a.L;
            int i12 = 4;
            if (map != null) {
                c cVar = c.ERROR_CORRECTION;
                if (map.containsKey(cVar)) {
                    aVar2 = t7.a.valueOf(map.get(cVar).toString());
                }
                c cVar2 = c.MARGIN;
                if (map.containsKey(cVar2)) {
                    i12 = Integer.parseInt(map.get(cVar2).toString());
                }
            }
            return b(u7.c.n(str, aVar2, map), i10, i11, i12);
        }
        throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
    }
}
