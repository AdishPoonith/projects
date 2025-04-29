package m6;
/* loaded from: classes.dex */
public final class w implements Comparable<w> {

    /* renamed from: k  reason: collision with root package name */
    public static final w f13842k = new w(new w5.q(0, 0));

    /* renamed from: j  reason: collision with root package name */
    private final w5.q f13843j;

    public w(w5.q qVar) {
        this.f13843j = qVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(w wVar) {
        return this.f13843j.compareTo(wVar.f13843j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof w) && compareTo((w) obj) == 0;
    }

    public w5.q g() {
        return this.f13843j;
    }

    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f13843j.l() + ", nanos=" + this.f13843j.k() + ")";
    }
}
