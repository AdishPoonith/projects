package i9;
/* loaded from: classes.dex */
public class k1 extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private final j1 f9970j;

    /* renamed from: k  reason: collision with root package name */
    private final y0 f9971k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f9972l;

    public k1(j1 j1Var) {
        this(j1Var, null);
    }

    public k1(j1 j1Var, y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    k1(j1 j1Var, y0 y0Var, boolean z10) {
        super(j1.g(j1Var), j1Var.l());
        this.f9970j = j1Var;
        this.f9971k = y0Var;
        this.f9972l = z10;
        fillInStackTrace();
    }

    public final j1 a() {
        return this.f9970j;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f9972l ? super.fillInStackTrace() : this;
    }
}
