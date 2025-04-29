package l6;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class q0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, i6.e> f13296a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, i6.j> f13297b = new HashMap();

    @Override // l6.a
    public void a(i6.j jVar) {
        this.f13297b.put(jVar.b(), jVar);
    }

    @Override // l6.a
    public i6.e b(String str) {
        return this.f13296a.get(str);
    }

    @Override // l6.a
    public i6.j c(String str) {
        return this.f13297b.get(str);
    }

    @Override // l6.a
    public void d(i6.e eVar) {
        this.f13296a.put(eVar.a(), eVar);
    }
}
