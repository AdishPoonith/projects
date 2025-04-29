package la;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements q1 {

    /* renamed from: j  reason: collision with root package name */
    private final boolean f13617j;

    public f1(boolean z10) {
        this.f13617j = z10;
    }

    @Override // la.q1
    public boolean a() {
        return this.f13617j;
    }

    @Override // la.q1
    public h2 g() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
