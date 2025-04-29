package d2;

import java.util.ArrayDeque;
import s1.u2;
import x1.m;
/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7592a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f7593b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f7594c = new g();

    /* renamed from: d  reason: collision with root package name */
    private d2.b f7595d;

    /* renamed from: e  reason: collision with root package name */
    private int f7596e;

    /* renamed from: f  reason: collision with root package name */
    private int f7597f;

    /* renamed from: g  reason: collision with root package name */
    private long f7598g;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f7599a;

        /* renamed from: b  reason: collision with root package name */
        private final long f7600b;

        private b(int i10, long j10) {
            this.f7599a = i10;
            this.f7600b = j10;
        }
    }

    private long a(m mVar) {
        mVar.f();
        while (true) {
            mVar.n(this.f7592a, 0, 4);
            int c10 = g.c(this.f7592a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f7592a, c10, false);
                if (this.f7595d.d(a10)) {
                    mVar.g(c10);
                    return a10;
                }
            }
            mVar.g(1);
        }
    }

    private double d(m mVar, int i10) {
        long e10 = e(mVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) e10) : Double.longBitsToDouble(e10);
    }

    private long e(m mVar, int i10) {
        mVar.readFully(this.f7592a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f7592a[i11] & 255);
        }
        return j10;
    }

    private static String f(m mVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        mVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // d2.c
    public boolean b(m mVar) {
        p3.a.h(this.f7595d);
        while (true) {
            b peek = this.f7593b.peek();
            if (peek != null && mVar.p() >= peek.f7600b) {
                this.f7595d.a(this.f7593b.pop().f7599a);
                return true;
            }
            if (this.f7596e == 0) {
                long d10 = this.f7594c.d(mVar, true, false, 4);
                if (d10 == -2) {
                    d10 = a(mVar);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f7597f = (int) d10;
                this.f7596e = 1;
            }
            if (this.f7596e == 1) {
                this.f7598g = this.f7594c.d(mVar, false, true, 8);
                this.f7596e = 2;
            }
            int b10 = this.f7595d.b(this.f7597f);
            if (b10 != 0) {
                if (b10 == 1) {
                    long p10 = mVar.p();
                    this.f7593b.push(new b(this.f7597f, this.f7598g + p10));
                    this.f7595d.g(this.f7597f, p10, this.f7598g);
                    this.f7596e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f7598g;
                    if (j10 <= 8) {
                        this.f7595d.h(this.f7597f, e(mVar, (int) j10));
                        this.f7596e = 0;
                        return true;
                    }
                    throw u2.a("Invalid integer size: " + this.f7598g, null);
                } else if (b10 == 3) {
                    long j11 = this.f7598g;
                    if (j11 <= 2147483647L) {
                        this.f7595d.f(this.f7597f, f(mVar, (int) j11));
                        this.f7596e = 0;
                        return true;
                    }
                    throw u2.a("String element size: " + this.f7598g, null);
                } else if (b10 == 4) {
                    this.f7595d.e(this.f7597f, (int) this.f7598g, mVar);
                    this.f7596e = 0;
                    return true;
                } else if (b10 != 5) {
                    throw u2.a("Invalid element type " + b10, null);
                } else {
                    long j12 = this.f7598g;
                    if (j12 == 4 || j12 == 8) {
                        this.f7595d.c(this.f7597f, d(mVar, (int) j12));
                        this.f7596e = 0;
                        return true;
                    }
                    throw u2.a("Invalid float size: " + this.f7598g, null);
                }
            }
            mVar.g((int) this.f7598g);
            this.f7596e = 0;
        }
    }

    @Override // d2.c
    public void c(d2.b bVar) {
        this.f7595d = bVar;
    }

    @Override // d2.c
    public void reset() {
        this.f7596e = 0;
        this.f7593b.clear();
        this.f7594c.e();
    }
}
