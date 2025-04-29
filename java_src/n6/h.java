package n6;

import java.util.List;
import m6.w;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f14320a;

    /* renamed from: b  reason: collision with root package name */
    private final w f14321b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i> f14322c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.protobuf.i f14323d;

    /* renamed from: e  reason: collision with root package name */
    private final d6.c<m6.l, w> f14324e;

    private h(g gVar, w wVar, List<i> list, com.google.protobuf.i iVar, d6.c<m6.l, w> cVar) {
        this.f14320a = gVar;
        this.f14321b = wVar;
        this.f14322c = list;
        this.f14323d = iVar;
        this.f14324e = cVar;
    }

    public static h a(g gVar, w wVar, List<i> list, com.google.protobuf.i iVar) {
        q6.b.d(gVar.h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(gVar.h().size()), Integer.valueOf(list.size()));
        d6.c<m6.l, w> c10 = m6.j.c();
        List<f> h10 = gVar.h();
        d6.c<m6.l, w> cVar = c10;
        for (int i10 = 0; i10 < h10.size(); i10++) {
            cVar = cVar.p(h10.get(i10).g(), list.get(i10).b());
        }
        return new h(gVar, wVar, list, iVar, cVar);
    }

    public g b() {
        return this.f14320a;
    }

    public w c() {
        return this.f14321b;
    }

    public d6.c<m6.l, w> d() {
        return this.f14324e;
    }

    public List<i> e() {
        return this.f14322c;
    }

    public com.google.protobuf.i f() {
        return this.f14323d;
    }
}
