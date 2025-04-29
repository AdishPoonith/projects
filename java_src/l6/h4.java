package l6;
/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: a  reason: collision with root package name */
    private final j6.g1 f13179a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13180b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13181c;

    /* renamed from: d  reason: collision with root package name */
    private final g1 f13182d;

    /* renamed from: e  reason: collision with root package name */
    private final m6.w f13183e;

    /* renamed from: f  reason: collision with root package name */
    private final m6.w f13184f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.protobuf.i f13185g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h4(j6.g1 r10, int r11, long r12, l6.g1 r14) {
        /*
            r9 = this;
            m6.w r7 = m6.w.f13842k
            com.google.protobuf.i r8 = p6.y0.f15744t
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h4.<init>(j6.g1, int, long, l6.g1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h4(j6.g1 g1Var, int i10, long j10, g1 g1Var2, m6.w wVar, m6.w wVar2, com.google.protobuf.i iVar) {
        this.f13179a = (j6.g1) q6.x.b(g1Var);
        this.f13180b = i10;
        this.f13181c = j10;
        this.f13184f = wVar2;
        this.f13182d = g1Var2;
        this.f13183e = (m6.w) q6.x.b(wVar);
        this.f13185g = (com.google.protobuf.i) q6.x.b(iVar);
    }

    public m6.w a() {
        return this.f13184f;
    }

    public g1 b() {
        return this.f13182d;
    }

    public com.google.protobuf.i c() {
        return this.f13185g;
    }

    public long d() {
        return this.f13181c;
    }

    public m6.w e() {
        return this.f13183e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h4.class != obj.getClass()) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return this.f13179a.equals(h4Var.f13179a) && this.f13180b == h4Var.f13180b && this.f13181c == h4Var.f13181c && this.f13182d.equals(h4Var.f13182d) && this.f13183e.equals(h4Var.f13183e) && this.f13184f.equals(h4Var.f13184f) && this.f13185g.equals(h4Var.f13185g);
    }

    public j6.g1 f() {
        return this.f13179a;
    }

    public int g() {
        return this.f13180b;
    }

    public h4 h(m6.w wVar) {
        return new h4(this.f13179a, this.f13180b, this.f13181c, this.f13182d, this.f13183e, wVar, this.f13185g);
    }

    public int hashCode() {
        return (((((((((((this.f13179a.hashCode() * 31) + this.f13180b) * 31) + ((int) this.f13181c)) * 31) + this.f13182d.hashCode()) * 31) + this.f13183e.hashCode()) * 31) + this.f13184f.hashCode()) * 31) + this.f13185g.hashCode();
    }

    public h4 i(com.google.protobuf.i iVar, m6.w wVar) {
        return new h4(this.f13179a, this.f13180b, this.f13181c, this.f13182d, wVar, this.f13184f, iVar);
    }

    public h4 j(long j10) {
        return new h4(this.f13179a, this.f13180b, j10, this.f13182d, this.f13183e, this.f13184f, this.f13185g);
    }

    public String toString() {
        return "TargetData{target=" + this.f13179a + ", targetId=" + this.f13180b + ", sequenceNumber=" + this.f13181c + ", purpose=" + this.f13182d + ", snapshotVersion=" + this.f13183e + ", lastLimboFreeSnapshotVersion=" + this.f13184f + ", resumeToken=" + this.f13185g + '}';
    }
}
