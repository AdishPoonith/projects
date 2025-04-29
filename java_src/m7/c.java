package m7;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f13871a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f13872b;

    public c(a aVar) {
        this.f13871a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f13872b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i10) {
        if (i10 >= this.f13872b.size()) {
            List<b> list = this.f13872b;
            b bVar = list.get(list.size() - 1);
            for (int size = this.f13872b.size(); size <= i10; size++) {
                a aVar = this.f13871a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f13872b.add(bVar);
            }
        }
        return this.f13872b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a10 = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d10 = new b(this.f13871a, iArr2).h(i10, 1).b(a10)[1].d();
        int length2 = i10 - d10.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(d10, 0, iArr, length + length2, d10.length);
    }
}
