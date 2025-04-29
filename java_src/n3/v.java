package n3;

import android.util.Pair;
import java.util.Arrays;
import p3.n0;
import s1.m3;
import s1.n3;
import s1.o3;
import s1.y3;
import u2.t0;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public abstract class v extends c0 {

    /* renamed from: c  reason: collision with root package name */
    private a f14258c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f14259a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f14260b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f14261c;

        /* renamed from: d  reason: collision with root package name */
        private final v0[] f14262d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f14263e;

        /* renamed from: f  reason: collision with root package name */
        private final int[][][] f14264f;

        /* renamed from: g  reason: collision with root package name */
        private final v0 f14265g;

        a(String[] strArr, int[] iArr, v0[] v0VarArr, int[] iArr2, int[][][] iArr3, v0 v0Var) {
            this.f14260b = strArr;
            this.f14261c = iArr;
            this.f14262d = v0VarArr;
            this.f14264f = iArr3;
            this.f14263e = iArr2;
            this.f14265g = v0Var;
            this.f14259a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f14262d[i10].b(i11).f18978j;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            int i14 = 16;
            while (i12 < iArr.length) {
                String str2 = this.f14262d[i10].b(i11).b(iArr[i12]).f17419u;
                int i15 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !n0.c(str, str2);
                }
                i14 = Math.min(i14, m3.d(this.f14264f[i10][i11][i12]));
                i12++;
                i13 = i15;
            }
            return z10 ? Math.min(i14, this.f14263e[i10]) : i14;
        }

        public int c(int i10, int i11, int i12) {
            return this.f14264f[i10][i11][i12];
        }

        public int d() {
            return this.f14259a;
        }

        public int e(int i10) {
            return this.f14261c[i10];
        }

        public v0 f(int i10) {
            return this.f14262d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return m3.f(c(i10, i11, i12));
        }

        public v0 h() {
            return this.f14265g;
        }
    }

    private static int i(n3[] n3VarArr, t0 t0Var, int[] iArr, boolean z10) {
        int length = n3VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < n3VarArr.length; i11++) {
            n3 n3Var = n3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < t0Var.f18978j; i13++) {
                i12 = Math.max(i12, m3.f(n3Var.a(t0Var.b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(n3 n3Var, t0 t0Var) {
        int[] iArr = new int[t0Var.f18978j];
        for (int i10 = 0; i10 < t0Var.f18978j; i10++) {
            iArr[i10] = n3Var.a(t0Var.b(i10));
        }
        return iArr;
    }

    private static int[] k(n3[] n3VarArr) {
        int length = n3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = n3VarArr[i10].k();
        }
        return iArr;
    }

    @Override // n3.c0
    public final void e(Object obj) {
        this.f14258c = (a) obj;
    }

    @Override // n3.c0
    public final d0 g(n3[] n3VarArr, v0 v0Var, u.b bVar, y3 y3Var) {
        int[] iArr = new int[n3VarArr.length + 1];
        int length = n3VarArr.length + 1;
        t0[][] t0VarArr = new t0[length];
        int[][][] iArr2 = new int[n3VarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = v0Var.f18991j;
            t0VarArr[i10] = new t0[i11];
            iArr2[i10] = new int[i11];
        }
        int[] k10 = k(n3VarArr);
        for (int i12 = 0; i12 < v0Var.f18991j; i12++) {
            t0 b10 = v0Var.b(i12);
            int i13 = i(n3VarArr, b10, iArr, b10.f18980l == 5);
            int[] j10 = i13 == n3VarArr.length ? new int[b10.f18978j] : j(n3VarArr[i13], b10);
            int i14 = iArr[i13];
            t0VarArr[i13][i14] = b10;
            iArr2[i13][i14] = j10;
            iArr[i13] = iArr[i13] + 1;
        }
        v0[] v0VarArr = new v0[n3VarArr.length];
        String[] strArr = new String[n3VarArr.length];
        int[] iArr3 = new int[n3VarArr.length];
        for (int i15 = 0; i15 < n3VarArr.length; i15++) {
            int i16 = iArr[i15];
            v0VarArr[i15] = new v0((t0[]) n0.G0(t0VarArr[i15], i16));
            iArr2[i15] = (int[][]) n0.G0(iArr2[i15], i16);
            strArr[i15] = n3VarArr[i15].f();
            iArr3[i15] = n3VarArr[i15].h();
        }
        a aVar = new a(strArr, iArr3, v0VarArr, k10, iArr2, new v0((t0[]) n0.G0(t0VarArr[n3VarArr.length], iArr[n3VarArr.length])));
        Pair<o3[], t[]> l10 = l(aVar, iArr2, k10, bVar, y3Var);
        return new d0((o3[]) l10.first, (t[]) l10.second, b0.b(aVar, (w[]) l10.second), aVar);
    }

    protected abstract Pair<o3[], t[]> l(a aVar, int[][][] iArr, int[] iArr2, u.b bVar, y3 y3Var);
}
