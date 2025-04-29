package i9;
/* loaded from: classes.dex */
public class l1 extends RuntimeException {

    /* renamed from: j  reason: collision with root package name */
    private final j1 f9974j;

    /* renamed from: k  reason: collision with root package name */
    private final y0 f9975k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f9976l;

    public l1(j1 j1Var) {
        this(j1Var, null);
    }

    public l1(j1 j1Var, y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    l1(j1 j1Var, y0 y0Var, boolean z10) {
        super(j1.g(j1Var), j1Var.l());
        this.f9974j = j1Var;
        this.f9975k = y0Var;
        this.f9976l = z10;
        fillInStackTrace();
    }

    public final j1 a() {
        return this.f9974j;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f9976l ? super.fillInStackTrace() : this;
    }
}
