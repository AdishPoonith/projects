package io.grpc.internal;
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: l  reason: collision with root package name */
    private static final b f11495l = new b(l2.f11442a);

    /* renamed from: a  reason: collision with root package name */
    private final l2 f11496a;

    /* renamed from: b  reason: collision with root package name */
    private long f11497b;

    /* renamed from: c  reason: collision with root package name */
    private long f11498c;

    /* renamed from: d  reason: collision with root package name */
    private long f11499d;

    /* renamed from: e  reason: collision with root package name */
    private long f11500e;

    /* renamed from: f  reason: collision with root package name */
    private long f11501f;

    /* renamed from: g  reason: collision with root package name */
    private c f11502g;

    /* renamed from: h  reason: collision with root package name */
    private long f11503h;

    /* renamed from: i  reason: collision with root package name */
    private long f11504i;

    /* renamed from: j  reason: collision with root package name */
    private final e1 f11505j;

    /* renamed from: k  reason: collision with root package name */
    private volatile long f11506k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final l2 f11507a;

        public b(l2 l2Var) {
            this.f11507a = l2Var;
        }

        public o2 a() {
            return new o2(this.f11507a);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public o2() {
        this.f11505j = f1.a();
        this.f11496a = l2.f11442a;
    }

    private o2(l2 l2Var) {
        this.f11505j = f1.a();
        this.f11496a = l2Var;
    }

    public static b a() {
        return f11495l;
    }

    public void b() {
        this.f11501f++;
    }

    public void c() {
        this.f11497b++;
        this.f11498c = this.f11496a.a();
    }

    public void d() {
        this.f11505j.a(1L);
        this.f11506k = this.f11496a.a();
    }

    public void e(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f11503h += i10;
        this.f11504i = this.f11496a.a();
    }

    public void f(boolean z10) {
        if (z10) {
            this.f11499d++;
        } else {
            this.f11500e++;
        }
    }

    public void g(c cVar) {
        this.f11502g = (c) b5.n.n(cVar);
    }
}
