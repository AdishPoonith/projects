package m3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p3.n0;
/* loaded from: classes.dex */
final class k implements d3.h {

    /* renamed from: j  reason: collision with root package name */
    private final List<e> f13772j;

    /* renamed from: k  reason: collision with root package name */
    private final long[] f13773k;

    /* renamed from: l  reason: collision with root package name */
    private final long[] f13774l;

    public k(List<e> list) {
        this.f13772j = Collections.unmodifiableList(new ArrayList(list));
        this.f13773k = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f13773k;
            jArr[i11] = eVar.f13741b;
            jArr[i11 + 1] = eVar.f13742c;
        }
        long[] jArr2 = this.f13773k;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13774l = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(e eVar, e eVar2) {
        return Long.compare(eVar.f13741b, eVar2.f13741b);
    }

    @Override // d3.h
    public int b(long j10) {
        int e10 = n0.e(this.f13774l, j10, false, false);
        if (e10 < this.f13774l.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f13774l.length);
        return this.f13774l[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f13772j.size(); i10++) {
            long[] jArr = this.f13773k;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f13772j.get(i10);
                d3.b bVar = eVar.f13740a;
                if (bVar.f7675n == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: m3.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = k.c((e) obj, (e) obj2);
                return c10;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f13740a.b().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // d3.h
    public int i() {
        return this.f13774l.length;
    }
}
