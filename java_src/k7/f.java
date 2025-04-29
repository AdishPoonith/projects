package k7;

import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    static final f f12617e = new f(g.f12622b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f12618a;

    /* renamed from: b  reason: collision with root package name */
    private final g f12619b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12620c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12621d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f12619b = gVar;
        this.f12618a = i10;
        this.f12620c = i11;
        this.f12621d = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f a(int i10) {
        g gVar = this.f12619b;
        int i11 = this.f12618a;
        int i12 = this.f12621d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f12610c[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f12620c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f12620c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f b(int i10) {
        int i11 = this.f12620c;
        return i11 == 0 ? this : new f(this.f12619b.b(i10 - i11, i11), this.f12618a, 0, this.f12621d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f12620c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f12621d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f12618a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(f fVar) {
        int i10;
        int i11 = this.f12621d + (d.f12610c[this.f12618a][fVar.f12618a] >> 16);
        int i12 = fVar.f12620c;
        if (i12 > 0 && ((i10 = this.f12620c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f12621d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f g(int i10, int i11) {
        int i12 = this.f12621d;
        g gVar = this.f12619b;
        int i13 = this.f12618a;
        if (i10 != i13) {
            int i14 = d.f12610c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f h(int i10, int i11) {
        g gVar = this.f12619b;
        int i12 = this.f12618a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f12612e[i12][i10], i13).a(i11, 5), this.f12618a, 0, this.f12621d + i13 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l7.a i(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList();
        for (g gVar = b(bArr.length).f12619b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        l7.a aVar = new l7.a();
        for (g gVar2 : linkedList) {
            gVar2.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f12609b[this.f12618a], Integer.valueOf(this.f12621d), Integer.valueOf(this.f12620c));
    }
}
