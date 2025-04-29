package s1;

import u2.u;
/* loaded from: classes.dex */
final class c2 {

    /* renamed from: a  reason: collision with root package name */
    public final u.b f17116a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17117b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17118c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17119d;

    /* renamed from: e  reason: collision with root package name */
    public final long f17120e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17121f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17122g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17123h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17124i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(u.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        p3.a.a(!z13 || z11);
        p3.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        p3.a.a(z14);
        this.f17116a = bVar;
        this.f17117b = j10;
        this.f17118c = j11;
        this.f17119d = j12;
        this.f17120e = j13;
        this.f17121f = z10;
        this.f17122g = z11;
        this.f17123h = z12;
        this.f17124i = z13;
    }

    public c2 a(long j10) {
        return j10 == this.f17118c ? this : new c2(this.f17116a, this.f17117b, j10, this.f17119d, this.f17120e, this.f17121f, this.f17122g, this.f17123h, this.f17124i);
    }

    public c2 b(long j10) {
        return j10 == this.f17117b ? this : new c2(this.f17116a, j10, this.f17118c, this.f17119d, this.f17120e, this.f17121f, this.f17122g, this.f17123h, this.f17124i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2.class != obj.getClass()) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.f17117b == c2Var.f17117b && this.f17118c == c2Var.f17118c && this.f17119d == c2Var.f17119d && this.f17120e == c2Var.f17120e && this.f17121f == c2Var.f17121f && this.f17122g == c2Var.f17122g && this.f17123h == c2Var.f17123h && this.f17124i == c2Var.f17124i && p3.n0.c(this.f17116a, c2Var.f17116a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f17116a.hashCode()) * 31) + ((int) this.f17117b)) * 31) + ((int) this.f17118c)) * 31) + ((int) this.f17119d)) * 31) + ((int) this.f17120e)) * 31) + (this.f17121f ? 1 : 0)) * 31) + (this.f17122g ? 1 : 0)) * 31) + (this.f17123h ? 1 : 0)) * 31) + (this.f17124i ? 1 : 0);
    }
}
