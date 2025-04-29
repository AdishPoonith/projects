package okio;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: o  reason: collision with root package name */
    final transient byte[][] f14779o;

    /* renamed from: p  reason: collision with root package name */
    final transient int[] f14780p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(c cVar, int i10) {
        super(null);
        p.b(cVar.f14751k, 0L, i10);
        j jVar = cVar.f14750j;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = jVar.f14772c;
            int i15 = jVar.f14771b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            jVar = jVar.f14775f;
        }
        this.f14779o = new byte[i13];
        this.f14780p = new int[i13 * 2];
        j jVar2 = cVar.f14750j;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f14779o;
            bArr[i16] = jVar2.f14770a;
            int i17 = jVar2.f14772c;
            int i18 = jVar2.f14771b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f14780p;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            jVar2.f14773d = true;
            i16++;
            jVar2 = jVar2.f14775f;
        }
    }

    private Object writeReplace() {
        return z();
    }

    private int y(int i10) {
        int binarySearch = Arrays.binarySearch(this.f14780p, 0, this.f14779o.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f z() {
        return new f(v());
    }

    @Override // okio.f
    public String b() {
        return z().b();
    }

    @Override // okio.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.r() == r() && o(0, fVar, 0, r())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.f
    public int hashCode() {
        int i10 = this.f14756k;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f14779o.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr = this.f14779o[i11];
            int[] iArr = this.f14780p;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f14756k = i13;
        return i13;
    }

    @Override // okio.f
    public byte k(int i10) {
        p.b(this.f14780p[this.f14779o.length - 1], i10, 1L);
        int y10 = y(i10);
        int i11 = y10 == 0 ? 0 : this.f14780p[y10 - 1];
        int[] iArr = this.f14780p;
        byte[][] bArr = this.f14779o;
        return bArr[y10][(i10 - i11) + iArr[bArr.length + y10]];
    }

    @Override // okio.f
    public String l() {
        return z().l();
    }

    @Override // okio.f
    public boolean o(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12) {
            return false;
        }
        int y10 = y(i10);
        while (i12 > 0) {
            int i13 = y10 == 0 ? 0 : this.f14780p[y10 - 1];
            int min = Math.min(i12, ((this.f14780p[y10] - i13) + i13) - i10);
            int[] iArr = this.f14780p;
            byte[][] bArr = this.f14779o;
            if (!fVar.p(i11, bArr[y10], (i10 - i13) + iArr[bArr.length + y10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            y10++;
        }
        return true;
    }

    @Override // okio.f
    public boolean p(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > r() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int y10 = y(i10);
        while (i12 > 0) {
            int i13 = y10 == 0 ? 0 : this.f14780p[y10 - 1];
            int min = Math.min(i12, ((this.f14780p[y10] - i13) + i13) - i10);
            int[] iArr = this.f14780p;
            byte[][] bArr2 = this.f14779o;
            if (!p.a(bArr2[y10], (i10 - i13) + iArr[bArr2.length + y10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            y10++;
        }
        return true;
    }

    @Override // okio.f
    public int r() {
        return this.f14780p[this.f14779o.length - 1];
    }

    @Override // okio.f
    public f t(int i10, int i11) {
        return z().t(i10, i11);
    }

    @Override // okio.f
    public String toString() {
        return z().toString();
    }

    @Override // okio.f
    public f u() {
        return z().u();
    }

    @Override // okio.f
    public byte[] v() {
        int[] iArr = this.f14780p;
        byte[][] bArr = this.f14779o;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f14780p;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f14779o[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // okio.f
    public String w() {
        return z().w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // okio.f
    public void x(c cVar) {
        int length = this.f14779o.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f14780p;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            j jVar = new j(this.f14779o[i10], i12, (i12 + i13) - i11, true, false);
            j jVar2 = cVar.f14750j;
            if (jVar2 == null) {
                jVar.f14776g = jVar;
                jVar.f14775f = jVar;
                cVar.f14750j = jVar;
            } else {
                jVar2.f14776g.c(jVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f14751k += i11;
    }
}
