package ha;
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: n  reason: collision with root package name */
    public static final a f9562n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static final f f9563o = new f(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a() {
            return f.f9563o;
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // ha.d
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (b() != fVar.b() || e() != fVar.e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ha.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + e();
    }

    @Override // ha.d
    public boolean isEmpty() {
        return b() > e();
    }

    public boolean p(int i10) {
        return b() <= i10 && i10 <= e();
    }

    public Integer q() {
        return Integer.valueOf(e());
    }

    public Integer r() {
        return Integer.valueOf(b());
    }

    @Override // ha.d
    public String toString() {
        return b() + ".." + e();
    }
}
