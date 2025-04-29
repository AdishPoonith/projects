package k3;

import android.text.Layout;
/* loaded from: classes.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f12550a;

    /* renamed from: b  reason: collision with root package name */
    private int f12551b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12552c;

    /* renamed from: d  reason: collision with root package name */
    private int f12553d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12554e;

    /* renamed from: k  reason: collision with root package name */
    private float f12560k;

    /* renamed from: l  reason: collision with root package name */
    private String f12561l;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f12564o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f12565p;

    /* renamed from: r  reason: collision with root package name */
    private b f12567r;

    /* renamed from: f  reason: collision with root package name */
    private int f12555f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f12556g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f12557h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f12558i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f12559j = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f12562m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f12563n = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f12566q = -1;

    /* renamed from: s  reason: collision with root package name */
    private float f12568s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f12552c && gVar.f12552c) {
                w(gVar.f12551b);
            }
            if (this.f12557h == -1) {
                this.f12557h = gVar.f12557h;
            }
            if (this.f12558i == -1) {
                this.f12558i = gVar.f12558i;
            }
            if (this.f12550a == null && (str = gVar.f12550a) != null) {
                this.f12550a = str;
            }
            if (this.f12555f == -1) {
                this.f12555f = gVar.f12555f;
            }
            if (this.f12556g == -1) {
                this.f12556g = gVar.f12556g;
            }
            if (this.f12563n == -1) {
                this.f12563n = gVar.f12563n;
            }
            if (this.f12564o == null && (alignment2 = gVar.f12564o) != null) {
                this.f12564o = alignment2;
            }
            if (this.f12565p == null && (alignment = gVar.f12565p) != null) {
                this.f12565p = alignment;
            }
            if (this.f12566q == -1) {
                this.f12566q = gVar.f12566q;
            }
            if (this.f12559j == -1) {
                this.f12559j = gVar.f12559j;
                this.f12560k = gVar.f12560k;
            }
            if (this.f12567r == null) {
                this.f12567r = gVar.f12567r;
            }
            if (this.f12568s == Float.MAX_VALUE) {
                this.f12568s = gVar.f12568s;
            }
            if (z10 && !this.f12554e && gVar.f12554e) {
                u(gVar.f12553d);
            }
            if (z10 && this.f12562m == -1 && (i10 = gVar.f12562m) != -1) {
                this.f12562m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f12561l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f12558i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f12555f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f12565p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f12563n = i10;
        return this;
    }

    public g F(int i10) {
        this.f12562m = i10;
        return this;
    }

    public g G(float f10) {
        this.f12568s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f12564o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f12566q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f12567r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f12556g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f12554e) {
            return this.f12553d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f12552c) {
            return this.f12551b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f12550a;
    }

    public float e() {
        return this.f12560k;
    }

    public int f() {
        return this.f12559j;
    }

    public String g() {
        return this.f12561l;
    }

    public Layout.Alignment h() {
        return this.f12565p;
    }

    public int i() {
        return this.f12563n;
    }

    public int j() {
        return this.f12562m;
    }

    public float k() {
        return this.f12568s;
    }

    public int l() {
        int i10 = this.f12557h;
        if (i10 == -1 && this.f12558i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f12558i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f12564o;
    }

    public boolean n() {
        return this.f12566q == 1;
    }

    public b o() {
        return this.f12567r;
    }

    public boolean p() {
        return this.f12554e;
    }

    public boolean q() {
        return this.f12552c;
    }

    public boolean s() {
        return this.f12555f == 1;
    }

    public boolean t() {
        return this.f12556g == 1;
    }

    public g u(int i10) {
        this.f12553d = i10;
        this.f12554e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f12557h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f12551b = i10;
        this.f12552c = true;
        return this;
    }

    public g x(String str) {
        this.f12550a = str;
        return this;
    }

    public g y(float f10) {
        this.f12560k = f10;
        return this;
    }

    public g z(int i10) {
        this.f12559j = i10;
        return this;
    }
}
