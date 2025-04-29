package s1;

import java.util.List;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: s  reason: collision with root package name */
    private static final u.b f17835s = new u.b(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final y3 f17836a;

    /* renamed from: b  reason: collision with root package name */
    public final u.b f17837b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17838c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17839d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17840e;

    /* renamed from: f  reason: collision with root package name */
    public final q f17841f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17842g;

    /* renamed from: h  reason: collision with root package name */
    public final u2.v0 f17843h;

    /* renamed from: i  reason: collision with root package name */
    public final n3.d0 f17844i;

    /* renamed from: j  reason: collision with root package name */
    public final List<k2.a> f17845j;

    /* renamed from: k  reason: collision with root package name */
    public final u.b f17846k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f17847l;

    /* renamed from: m  reason: collision with root package name */
    public final int f17848m;

    /* renamed from: n  reason: collision with root package name */
    public final b3 f17849n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f17850o;

    /* renamed from: p  reason: collision with root package name */
    public volatile long f17851p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f17852q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f17853r;

    public z2(y3 y3Var, u.b bVar, long j10, long j11, int i10, q qVar, boolean z10, u2.v0 v0Var, n3.d0 d0Var, List<k2.a> list, u.b bVar2, boolean z11, int i11, b3 b3Var, long j12, long j13, long j14, boolean z12) {
        this.f17836a = y3Var;
        this.f17837b = bVar;
        this.f17838c = j10;
        this.f17839d = j11;
        this.f17840e = i10;
        this.f17841f = qVar;
        this.f17842g = z10;
        this.f17843h = v0Var;
        this.f17844i = d0Var;
        this.f17845j = list;
        this.f17846k = bVar2;
        this.f17847l = z11;
        this.f17848m = i11;
        this.f17849n = b3Var;
        this.f17851p = j12;
        this.f17852q = j13;
        this.f17853r = j14;
        this.f17850o = z12;
    }

    public static z2 j(n3.d0 d0Var) {
        y3 y3Var = y3.f17792j;
        u.b bVar = f17835s;
        return new z2(y3Var, bVar, -9223372036854775807L, 0L, 1, null, false, u2.v0.f18988m, d0Var, com.google.common.collect.q.z(), bVar, false, 0, b3.f17104m, 0L, 0L, 0L, false);
    }

    public static u.b k() {
        return f17835s;
    }

    public z2 a(boolean z10) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, z10, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 b(u.b bVar) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, bVar, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 c(u.b bVar, long j10, long j11, long j12, long j13, u2.v0 v0Var, n3.d0 d0Var, List<k2.a> list) {
        return new z2(this.f17836a, bVar, j11, j12, this.f17840e, this.f17841f, this.f17842g, v0Var, d0Var, list, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, j13, j10, this.f17850o);
    }

    public z2 d(boolean z10, int i10) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, z10, i10, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 e(q qVar) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, qVar, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 f(b3 b3Var) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, b3Var, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 g(int i10) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, i10, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }

    public z2 h(boolean z10) {
        return new z2(this.f17836a, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, z10);
    }

    public z2 i(y3 y3Var) {
        return new z2(y3Var, this.f17837b, this.f17838c, this.f17839d, this.f17840e, this.f17841f, this.f17842g, this.f17843h, this.f17844i, this.f17845j, this.f17846k, this.f17847l, this.f17848m, this.f17849n, this.f17851p, this.f17852q, this.f17853r, this.f17850o);
    }
}
