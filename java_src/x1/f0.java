package x1;

import x1.e0;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f20134a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f20135b;

    /* renamed from: c  reason: collision with root package name */
    private int f20136c;

    /* renamed from: d  reason: collision with root package name */
    private long f20137d;

    /* renamed from: e  reason: collision with root package name */
    private int f20138e;

    /* renamed from: f  reason: collision with root package name */
    private int f20139f;

    /* renamed from: g  reason: collision with root package name */
    private int f20140g;

    public void a(e0 e0Var, e0.a aVar) {
        if (this.f20136c > 0) {
            e0Var.c(this.f20137d, this.f20138e, this.f20139f, this.f20140g, aVar);
            this.f20136c = 0;
        }
    }

    public void b() {
        this.f20135b = false;
        this.f20136c = 0;
    }

    public void c(e0 e0Var, long j10, int i10, int i11, int i12, e0.a aVar) {
        p3.a.g(this.f20140g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f20135b) {
            int i13 = this.f20136c;
            int i14 = i13 + 1;
            this.f20136c = i14;
            if (i13 == 0) {
                this.f20137d = j10;
                this.f20138e = i10;
                this.f20139f = 0;
            }
            this.f20139f += i11;
            this.f20140g = i12;
            if (i14 >= 16) {
                a(e0Var, aVar);
            }
        }
    }

    public void d(m mVar) {
        if (this.f20135b) {
            return;
        }
        mVar.n(this.f20134a, 0, 10);
        mVar.f();
        if (u1.b.j(this.f20134a) == 0) {
            return;
        }
        this.f20135b = true;
    }
}
