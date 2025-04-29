package s9;
/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: n  reason: collision with root package name */
    public static final a f17861n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final f f17862o = g.a();

    /* renamed from: j  reason: collision with root package name */
    private final int f17863j;

    /* renamed from: k  reason: collision with root package name */
    private final int f17864k;

    /* renamed from: l  reason: collision with root package name */
    private final int f17865l;

    /* renamed from: m  reason: collision with root package name */
    private final int f17866m;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f(int i10, int i11, int i12) {
        this.f17863j = i10;
        this.f17864k = i11;
        this.f17865l = i12;
        this.f17866m = g(i10, i11, i12);
    }

    private final int g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new ha.f(0, 255).p(i10) && new ha.f(0, 255).p(i11) && new ha.f(0, 255).p(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(f other) {
        kotlin.jvm.internal.l.e(other, "other");
        return this.f17866m - other.f17866m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f17866m == fVar.f17866m;
    }

    public int hashCode() {
        return this.f17866m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17863j);
        sb.append('.');
        sb.append(this.f17864k);
        sb.append('.');
        sb.append(this.f17865l);
        return sb.toString();
    }
}
