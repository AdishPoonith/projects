package q3;

import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.w;
import s1.u2;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f16050a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16051b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16052c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16053d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16054e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16055f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16056g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16057h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16058i;

    private f(List<byte[]> list, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.f16050a = list;
        this.f16051b = i10;
        this.f16052c = i11;
        this.f16053d = i12;
        this.f16054e = f10;
        this.f16058i = str;
        this.f16055f = i13;
        this.f16056g = i14;
        this.f16057h = i15;
    }

    public static f a(a0 a0Var) {
        int i10;
        int i11;
        try {
            a0Var.U(21);
            int G = a0Var.G() & 3;
            int G2 = a0Var.G();
            int f10 = a0Var.f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < G2; i14++) {
                a0Var.U(1);
                int M = a0Var.M();
                for (int i15 = 0; i15 < M; i15++) {
                    int M2 = a0Var.M();
                    i13 += M2 + 4;
                    a0Var.U(M2);
                }
            }
            a0Var.T(f10);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            float f11 = 1.0f;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            while (i16 < G2) {
                int G3 = a0Var.G() & 63;
                int M3 = a0Var.M();
                int i23 = 0;
                while (i23 < M3) {
                    int M4 = a0Var.M();
                    byte[] bArr2 = p3.w.f15443a;
                    int i24 = G2;
                    System.arraycopy(bArr2, i12, bArr, i17, bArr2.length);
                    int length = i17 + bArr2.length;
                    System.arraycopy(a0Var.e(), a0Var.f(), bArr, length, M4);
                    if (G3 == 33 && i23 == 0) {
                        w.a h10 = p3.w.h(bArr, length, length + M4);
                        int i25 = h10.f15454h;
                        i19 = h10.f15455i;
                        int i26 = h10.f15457k;
                        int i27 = h10.f15458l;
                        int i28 = h10.f15459m;
                        float f12 = h10.f15456j;
                        i10 = G3;
                        i11 = M3;
                        i18 = i25;
                        i22 = i28;
                        str = p3.e.c(h10.f15447a, h10.f15448b, h10.f15449c, h10.f15450d, h10.f15451e, h10.f15452f);
                        i21 = i27;
                        f11 = f12;
                        i20 = i26;
                    } else {
                        i10 = G3;
                        i11 = M3;
                    }
                    i17 = length + M4;
                    a0Var.U(M4);
                    i23++;
                    G2 = i24;
                    G3 = i10;
                    M3 = i11;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), G + 1, i18, i19, f11, str, i20, i21, i22);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw u2.a("Error parsing HEVC config", e10);
        }
    }
}
