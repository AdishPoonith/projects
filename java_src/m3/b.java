package m3;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class b implements d3.h {

    /* renamed from: j  reason: collision with root package name */
    private final List<d3.b> f13718j;

    public b(List<d3.b> list) {
        this.f13718j = Collections.unmodifiableList(list);
    }

    @Override // d3.h
    public int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 == 0);
        return 0L;
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        return j10 >= 0 ? this.f13718j : Collections.emptyList();
    }

    @Override // d3.h
    public int i() {
        return 1;
    }
}
