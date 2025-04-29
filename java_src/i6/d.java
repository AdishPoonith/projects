package i6;

import com.google.firebase.firestore.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m6.l;
import m6.s;
import q6.x;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f9724a;

    /* renamed from: b  reason: collision with root package name */
    private final e f9725b;

    /* renamed from: f  reason: collision with root package name */
    private long f9729f;

    /* renamed from: g  reason: collision with root package name */
    private h f9730g;

    /* renamed from: c  reason: collision with root package name */
    private final List<j> f9726c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private d6.c<l, s> f9728e = m6.j.b();

    /* renamed from: d  reason: collision with root package name */
    private final Map<l, h> f9727d = new HashMap();

    public d(a aVar, e eVar) {
        this.f9724a = aVar;
        this.f9725b = eVar;
    }

    private Map<String, d6.e<l>> c() {
        HashMap hashMap = new HashMap();
        for (j jVar : this.f9726c) {
            hashMap.put(jVar.b(), l.i());
        }
        for (h hVar : this.f9727d.values()) {
            for (String str : hVar.c()) {
                hashMap.put(str, ((d6.e) hashMap.get(str)).k(hVar.b()));
            }
        }
        return hashMap;
    }

    public i0 a(c cVar, long j10) {
        d6.c<l, s> cVar2;
        l b10;
        s v10;
        x.a(!(cVar instanceof e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f9728e.size();
        if (cVar instanceof j) {
            this.f9726c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            this.f9727d.put(hVar.b(), hVar);
            this.f9730g = hVar;
            if (!hVar.a()) {
                cVar2 = this.f9728e;
                b10 = hVar.b();
                v10 = s.r(hVar.b(), hVar.d()).v(hVar.d());
                this.f9728e = cVar2.p(b10, v10);
                this.f9730g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f9730g == null || !bVar.b().equals(this.f9730g.b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            cVar2 = this.f9728e;
            b10 = bVar.b();
            v10 = bVar.a().v(this.f9730g.d());
            this.f9728e = cVar2.p(b10, v10);
            this.f9730g = null;
        }
        this.f9729f += j10;
        if (size != this.f9728e.size()) {
            return new i0(this.f9728e.size(), this.f9725b.e(), this.f9729f, this.f9725b.d(), null, i0.a.RUNNING);
        }
        return null;
    }

    public d6.c<l, m6.i> b() {
        x.a(this.f9730g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        x.a(this.f9725b.a() != null, "Bundle ID must be set", new Object[0]);
        x.a(this.f9728e.size() == this.f9725b.e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f9725b.e()), Integer.valueOf(this.f9728e.size()));
        d6.c<l, m6.i> a10 = this.f9724a.a(this.f9728e, this.f9725b.a());
        Map<String, d6.e<l>> c10 = c();
        for (j jVar : this.f9726c) {
            this.f9724a.c(jVar, c10.get(jVar.b()));
        }
        this.f9724a.b(this.f9725b);
        return a10;
    }
}
