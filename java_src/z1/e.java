package z1;

import java.util.Arrays;
import p3.n0;
import x1.b0;
import x1.c0;
import x1.e0;
import x1.m;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    protected final e0 f20704a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20705b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20706c;

    /* renamed from: d  reason: collision with root package name */
    private final long f20707d;

    /* renamed from: e  reason: collision with root package name */
    private final int f20708e;

    /* renamed from: f  reason: collision with root package name */
    private int f20709f;

    /* renamed from: g  reason: collision with root package name */
    private int f20710g;

    /* renamed from: h  reason: collision with root package name */
    private int f20711h;

    /* renamed from: i  reason: collision with root package name */
    private int f20712i;

    /* renamed from: j  reason: collision with root package name */
    private int f20713j;

    /* renamed from: k  reason: collision with root package name */
    private long[] f20714k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f20715l;

    public e(int i10, int i11, long j10, int i12, e0 e0Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        p3.a.a(z10);
        this.f20707d = j10;
        this.f20708e = i12;
        this.f20704a = e0Var;
        this.f20705b = d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f20706c = i11 == 2 ? d(i10, 1650720768) : -1;
        this.f20714k = new long[512];
        this.f20715l = new int[512];
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f20707d * i10) / this.f20708e;
    }

    private c0 h(int i10) {
        return new c0(this.f20715l[i10] * g(), this.f20714k[i10]);
    }

    public void a() {
        this.f20711h++;
    }

    public void b(long j10) {
        if (this.f20713j == this.f20715l.length) {
            long[] jArr = this.f20714k;
            this.f20714k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f20715l;
            this.f20715l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f20714k;
        int i10 = this.f20713j;
        jArr2[i10] = j10;
        this.f20715l[i10] = this.f20712i;
        this.f20713j = i10 + 1;
    }

    public void c() {
        this.f20714k = Arrays.copyOf(this.f20714k, this.f20713j);
        this.f20715l = Arrays.copyOf(this.f20715l, this.f20713j);
    }

    public long f() {
        return e(this.f20711h);
    }

    public long g() {
        return e(1);
    }

    public b0.a i(long j10) {
        int g10 = (int) (j10 / g());
        int h10 = n0.h(this.f20715l, g10, true, true);
        if (this.f20715l[h10] == g10) {
            return new b0.a(h(h10));
        }
        c0 h11 = h(h10);
        int i10 = h10 + 1;
        return i10 < this.f20714k.length ? new b0.a(h11, h(i10)) : new b0.a(h11);
    }

    public boolean j(int i10) {
        return this.f20705b == i10 || this.f20706c == i10;
    }

    public void k() {
        this.f20712i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f20715l, this.f20711h) >= 0;
    }

    public boolean m(m mVar) {
        int i10 = this.f20710g;
        int f10 = i10 - this.f20704a.f(mVar, i10, false);
        this.f20710g = f10;
        boolean z10 = f10 == 0;
        if (z10) {
            if (this.f20709f > 0) {
                this.f20704a.c(f(), l() ? 1 : 0, this.f20709f, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f20709f = i10;
        this.f20710g = i10;
    }

    public void o(long j10) {
        int i10;
        if (this.f20713j == 0) {
            i10 = 0;
        } else {
            i10 = this.f20715l[n0.i(this.f20714k, j10, true, true)];
        }
        this.f20711h = i10;
    }
}
