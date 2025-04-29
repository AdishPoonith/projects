package i3;

import d3.h;
import java.util.Collections;
import java.util.List;
import p3.n0;
/* loaded from: classes.dex */
final class d implements h {

    /* renamed from: j  reason: collision with root package name */
    private final List<List<d3.b>> f9710j;

    /* renamed from: k  reason: collision with root package name */
    private final List<Long> f9711k;

    public d(List<List<d3.b>> list, List<Long> list2) {
        this.f9710j = list;
        this.f9711k = list2;
    }

    @Override // d3.h
    public int b(long j10) {
        int d10 = n0.d(this.f9711k, Long.valueOf(j10), false, false);
        if (d10 < this.f9711k.size()) {
            return d10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f9711k.size());
        return this.f9711k.get(i10).longValue();
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        int f10 = n0.f(this.f9711k, Long.valueOf(j10), true, false);
        return f10 == -1 ? Collections.emptyList() : this.f9710j.get(f10);
    }

    @Override // d3.h
    public int i() {
        return this.f9711k.size();
    }
}
