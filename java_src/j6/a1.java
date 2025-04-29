package j6;
/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f12119a;

    /* renamed from: b  reason: collision with root package name */
    final m6.r f12120b;

    /* loaded from: classes.dex */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f12124j;

        a(int i10) {
            this.f12124j = i10;
        }

        int b() {
            return this.f12124j;
        }
    }

    private a1(a aVar, m6.r rVar) {
        this.f12119a = aVar;
        this.f12120b = rVar;
    }

    public static a1 d(a aVar, m6.r rVar) {
        return new a1(aVar, rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(m6.i iVar, m6.i iVar2) {
        int b10;
        int i10;
        if (this.f12120b.equals(m6.r.f13822k)) {
            b10 = this.f12119a.b();
            i10 = iVar.getKey().compareTo(iVar2.getKey());
        } else {
            d7.b0 b11 = iVar.b(this.f12120b);
            d7.b0 b12 = iVar2.b(this.f12120b);
            q6.b.d((b11 == null || b12 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            b10 = this.f12119a.b();
            i10 = m6.y.i(b11, b12);
        }
        return b10 * i10;
    }

    public a b() {
        return this.f12119a;
    }

    public m6.r c() {
        return this.f12120b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f12119a == a1Var.f12119a && this.f12120b.equals(a1Var.f12120b);
    }

    public int hashCode() {
        return ((899 + this.f12119a.hashCode()) * 31) + this.f12120b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12119a == a.ASCENDING ? "" : "-");
        sb.append(this.f12120b.h());
        return sb.toString();
    }
}
