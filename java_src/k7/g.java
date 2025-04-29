package k7;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b  reason: collision with root package name */
    static final g f12622b = new e(null, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final g f12623a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(g gVar) {
        this.f12623a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g a(int i10, int i11) {
        return new e(this, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g b(int i10, int i11) {
        return new b(this, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(l7.a aVar, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g d() {
        return this.f12623a;
    }
}
