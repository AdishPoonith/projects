package q3;

import java.util.ArrayList;
import java.util.List;
import p3.a0;
import p3.w;
import s1.u2;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f16015a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16016b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16017c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16018d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16019e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16020f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f16015a = list;
        this.f16016b = i10;
        this.f16017c = i11;
        this.f16018d = i12;
        this.f16019e = f10;
        this.f16020f = str;
    }

    private static byte[] a(a0 a0Var) {
        int M = a0Var.M();
        int f10 = a0Var.f();
        a0Var.U(M);
        return p3.e.d(a0Var.e(), f10, M);
    }

    public static a b(a0 a0Var) {
        String str;
        int i10;
        float f10;
        try {
            a0Var.U(4);
            int G = (a0Var.G() & 3) + 1;
            if (G != 3) {
                ArrayList arrayList = new ArrayList();
                int G2 = a0Var.G() & 31;
                for (int i11 = 0; i11 < G2; i11++) {
                    arrayList.add(a(a0Var));
                }
                int G3 = a0Var.G();
                for (int i12 = 0; i12 < G3; i12++) {
                    arrayList.add(a(a0Var));
                }
                int i13 = -1;
                if (G2 > 0) {
                    w.c l10 = p3.w.l((byte[]) arrayList.get(0), G, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f15468f;
                    int i15 = l10.f15469g;
                    float f11 = l10.f15470h;
                    str = p3.e.a(l10.f15463a, l10.f15464b, l10.f15465c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, G, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw u2.a("Error parsing AVC config", e10);
        }
    }
}
