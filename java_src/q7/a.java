package q7;

import i7.c;
import i7.g;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import l7.b;
import r7.d;
import r7.e;
/* loaded from: classes.dex */
public final class a implements g {
    private static b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        b bVar = new b(bArr[0].length + i11, bArr.length + i11);
        bVar.c();
        int g10 = (bVar.g() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.i(i13 + i10, g10);
                }
            }
            i12++;
            g10--;
        }
        return bVar;
    }

    private static b c(e eVar, String str, int i10, int i11, int i12, int i13) {
        boolean z10;
        eVar.e(str, i10);
        byte[][] b10 = eVar.f().b(1, 4);
        if ((i12 > i11) != (b10[0].length < b10.length)) {
            b10 = d(b10);
            z10 = true;
        } else {
            z10 = false;
        }
        int length = i11 / b10[0].length;
        int length2 = i12 / b10.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] b11 = eVar.f().b(length, length << 2);
            if (z10) {
                b11 = d(b11);
            }
            return b(b11, i13);
        }
        return b(b10, i13);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    @Override // i7.g
    public b a(String str, i7.a aVar, int i10, int i11, Map<c, ?> map) {
        int i12;
        int i13;
        if (aVar == i7.a.PDF_417) {
            e eVar = new e();
            if (map != null) {
                c cVar = c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                c cVar2 = c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.i(r7.c.valueOf(map.get(cVar2).toString()));
                }
                c cVar3 = c.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    d dVar = (d) map.get(cVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                c cVar4 = c.MARGIN;
                int parseInt = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
                c cVar5 = c.ERROR_CORRECTION;
                int parseInt2 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
                c cVar6 = c.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.k(Charset.forName(map.get(cVar6).toString()));
                }
                i13 = parseInt;
                i12 = parseInt2;
            } else {
                i12 = 2;
                i13 = 30;
            }
            return c(eVar, str, i12, i10, i11, i13);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
