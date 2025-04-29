package n6;

import m6.r;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final r f14311a;

    /* renamed from: b  reason: collision with root package name */
    private final p f14312b;

    public e(r rVar, p pVar) {
        this.f14311a = rVar;
        this.f14312b = pVar;
    }

    public r a() {
        return this.f14311a;
    }

    public p b() {
        return this.f14312b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14311a.equals(eVar.f14311a)) {
            return this.f14312b.equals(eVar.f14312b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f14311a.hashCode() * 31) + this.f14312b.hashCode();
    }
}
