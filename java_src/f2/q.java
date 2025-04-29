package f2;

import p3.a0;
/* loaded from: classes.dex */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f8753a;

    /* renamed from: b  reason: collision with root package name */
    public long f8754b;

    /* renamed from: c  reason: collision with root package name */
    public long f8755c;

    /* renamed from: d  reason: collision with root package name */
    public long f8756d;

    /* renamed from: e  reason: collision with root package name */
    public int f8757e;

    /* renamed from: f  reason: collision with root package name */
    public int f8758f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8764l;

    /* renamed from: n  reason: collision with root package name */
    public p f8766n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8768p;

    /* renamed from: q  reason: collision with root package name */
    public long f8769q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8770r;

    /* renamed from: g  reason: collision with root package name */
    public long[] f8759g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f8760h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f8761i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f8762j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f8763k = new boolean[0];

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f8765m = new boolean[0];

    /* renamed from: o  reason: collision with root package name */
    public final a0 f8767o = new a0();

    public void a(a0 a0Var) {
        a0Var.l(this.f8767o.e(), 0, this.f8767o.g());
        this.f8767o.T(0);
        this.f8768p = false;
    }

    public void b(x1.m mVar) {
        mVar.readFully(this.f8767o.e(), 0, this.f8767o.g());
        this.f8767o.T(0);
        this.f8768p = false;
    }

    public long c(int i10) {
        return this.f8762j[i10];
    }

    public void d(int i10) {
        this.f8767o.P(i10);
        this.f8764l = true;
        this.f8768p = true;
    }

    public void e(int i10, int i11) {
        this.f8757e = i10;
        this.f8758f = i11;
        if (this.f8760h.length < i10) {
            this.f8759g = new long[i10];
            this.f8760h = new int[i10];
        }
        if (this.f8761i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f8761i = new int[i12];
            this.f8762j = new long[i12];
            this.f8763k = new boolean[i12];
            this.f8765m = new boolean[i12];
        }
    }

    public void f() {
        this.f8757e = 0;
        this.f8769q = 0L;
        this.f8770r = false;
        this.f8764l = false;
        this.f8768p = false;
        this.f8766n = null;
    }

    public boolean g(int i10) {
        return this.f8764l && this.f8765m[i10];
    }
}
