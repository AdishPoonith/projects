package j7;

import i7.g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import k7.c;
import l7.b;
/* loaded from: classes.dex */
public final class a implements g {
    private static b b(String str, i7.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == i7.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(k7.a aVar, int i10, int i11) {
        b a10 = aVar.a();
        if (a10 != null) {
            int h10 = a10.h();
            int g10 = a10.g();
            int max = Math.max(i10, h10);
            int max2 = Math.max(i11, g10);
            int min = Math.min(max / h10, max2 / g10);
            int i12 = (max - (h10 * min)) / 2;
            int i13 = (max2 - (g10 * min)) / 2;
            b bVar = new b(max, max2);
            int i14 = 0;
            while (i14 < g10) {
                int i15 = i12;
                int i16 = 0;
                while (i16 < h10) {
                    if (a10.f(i16, i14)) {
                        bVar.j(i15, i13, min, min);
                    }
                    i16++;
                    i15 += min;
                }
                i14++;
                i13 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // i7.g
    public b a(String str, i7.a aVar, int i10, int i11, Map<i7.c, ?> map) {
        Charset charset;
        int i12;
        int i13;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (map != null) {
            i7.c cVar = i7.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charset2 = Charset.forName(map.get(cVar).toString());
            }
            i7.c cVar2 = i7.c.ERROR_CORRECTION;
            int parseInt = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            i7.c cVar3 = i7.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                charset = charset2;
                i12 = parseInt;
                i13 = Integer.parseInt(map.get(cVar3).toString());
                return b(str, aVar, i10, i11, charset, i12, i13);
            }
            charset = charset2;
            i12 = parseInt;
        } else {
            charset = charset2;
            i12 = 33;
        }
        i13 = 0;
        return b(str, aVar, i10, i11, charset, i12, i13);
    }
}
