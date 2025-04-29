package k3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3.n0;
/* loaded from: classes.dex */
final class h implements d3.h {

    /* renamed from: j  reason: collision with root package name */
    private final d f12569j;

    /* renamed from: k  reason: collision with root package name */
    private final long[] f12570k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, g> f12571l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, e> f12572m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, String> f12573n;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f12569j = dVar;
        this.f12572m = map2;
        this.f12573n = map3;
        this.f12571l = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f12570k = dVar.j();
    }

    @Override // d3.h
    public int b(long j10) {
        int e10 = n0.e(this.f12570k, j10, false, false);
        if (e10 < this.f12570k.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        return this.f12570k[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        return this.f12569j.h(j10, this.f12571l, this.f12572m, this.f12573n);
    }

    @Override // d3.h
    public int i() {
        return this.f12570k.length;
    }
}
