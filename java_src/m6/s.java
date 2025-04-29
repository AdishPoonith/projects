package m6;

import d7.b0;
/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: b  reason: collision with root package name */
    private final l f13824b;

    /* renamed from: c  reason: collision with root package name */
    private b f13825c;

    /* renamed from: d  reason: collision with root package name */
    private w f13826d;

    /* renamed from: e  reason: collision with root package name */
    private w f13827e;

    /* renamed from: f  reason: collision with root package name */
    private t f13828f;

    /* renamed from: g  reason: collision with root package name */
    private a f13829g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private s(l lVar) {
        this.f13824b = lVar;
        this.f13827e = w.f13842k;
    }

    private s(l lVar, b bVar, w wVar, w wVar2, t tVar, a aVar) {
        this.f13824b = lVar;
        this.f13826d = wVar;
        this.f13827e = wVar2;
        this.f13825c = bVar;
        this.f13829g = aVar;
        this.f13828f = tVar;
    }

    public static s p(l lVar, w wVar, t tVar) {
        return new s(lVar).l(wVar, tVar);
    }

    public static s q(l lVar) {
        b bVar = b.INVALID;
        w wVar = w.f13842k;
        return new s(lVar, bVar, wVar, wVar, new t(), a.SYNCED);
    }

    public static s r(l lVar, w wVar) {
        return new s(lVar).m(wVar);
    }

    public static s s(l lVar, w wVar) {
        return new s(lVar).n(wVar);
    }

    @Override // m6.i
    public s a() {
        return new s(this.f13824b, this.f13825c, this.f13826d, this.f13827e, this.f13828f.clone(), this.f13829g);
    }

    @Override // m6.i
    public b0 b(r rVar) {
        return k().j(rVar);
    }

    @Override // m6.i
    public boolean c() {
        return this.f13825c.equals(b.FOUND_DOCUMENT);
    }

    @Override // m6.i
    public boolean d() {
        return this.f13829g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // m6.i
    public boolean e() {
        return this.f13829g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f13824b.equals(sVar.f13824b) && this.f13826d.equals(sVar.f13826d) && this.f13825c.equals(sVar.f13825c) && this.f13829g.equals(sVar.f13829g)) {
            return this.f13828f.equals(sVar.f13828f);
        }
        return false;
    }

    @Override // m6.i
    public boolean f() {
        return e() || d();
    }

    @Override // m6.i
    public w g() {
        return this.f13827e;
    }

    @Override // m6.i
    public l getKey() {
        return this.f13824b;
    }

    @Override // m6.i
    public boolean h() {
        return this.f13825c.equals(b.NO_DOCUMENT);
    }

    public int hashCode() {
        return this.f13824b.hashCode();
    }

    @Override // m6.i
    public boolean i() {
        return this.f13825c.equals(b.UNKNOWN_DOCUMENT);
    }

    @Override // m6.i
    public w j() {
        return this.f13826d;
    }

    @Override // m6.i
    public t k() {
        return this.f13828f;
    }

    public s l(w wVar, t tVar) {
        this.f13826d = wVar;
        this.f13825c = b.FOUND_DOCUMENT;
        this.f13828f = tVar;
        this.f13829g = a.SYNCED;
        return this;
    }

    public s m(w wVar) {
        this.f13826d = wVar;
        this.f13825c = b.NO_DOCUMENT;
        this.f13828f = new t();
        this.f13829g = a.SYNCED;
        return this;
    }

    public s n(w wVar) {
        this.f13826d = wVar;
        this.f13825c = b.UNKNOWN_DOCUMENT;
        this.f13828f = new t();
        this.f13829g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean o() {
        return !this.f13825c.equals(b.INVALID);
    }

    public s t() {
        this.f13829g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f13824b + ", version=" + this.f13826d + ", readTime=" + this.f13827e + ", type=" + this.f13825c + ", documentState=" + this.f13829g + ", value=" + this.f13828f + '}';
    }

    public s u() {
        this.f13829g = a.HAS_LOCAL_MUTATIONS;
        this.f13826d = w.f13842k;
        return this;
    }

    public s v(w wVar) {
        this.f13827e = wVar;
        return this;
    }
}
