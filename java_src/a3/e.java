package a3;

import java.util.List;
import o3.j0;
/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f90a;

    /* renamed from: b  reason: collision with root package name */
    private final List<t2.c> f91b;

    public e(k kVar, List<t2.c> list) {
        this.f90a = kVar;
        this.f91b = list;
    }

    @Override // a3.k
    public j0.a<i> a(h hVar, g gVar) {
        return new t2.b(this.f90a.a(hVar, gVar), this.f91b);
    }

    @Override // a3.k
    public j0.a<i> b() {
        return new t2.b(this.f90a.b(), this.f91b);
    }
}
