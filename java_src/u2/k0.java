package u2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o3.b;
import u2.m0;
import x1.e0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final o3.b f18869a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18870b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f18871c;

    /* renamed from: d  reason: collision with root package name */
    private a f18872d;

    /* renamed from: e  reason: collision with root package name */
    private a f18873e;

    /* renamed from: f  reason: collision with root package name */
    private a f18874f;

    /* renamed from: g  reason: collision with root package name */
    private long f18875g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f18876a;

        /* renamed from: b  reason: collision with root package name */
        public long f18877b;

        /* renamed from: c  reason: collision with root package name */
        public o3.a f18878c;

        /* renamed from: d  reason: collision with root package name */
        public a f18879d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // o3.b.a
        public o3.a a() {
            return (o3.a) p3.a.e(this.f18878c);
        }

        public a b() {
            this.f18878c = null;
            a aVar = this.f18879d;
            this.f18879d = null;
            return aVar;
        }

        public void c(o3.a aVar, a aVar2) {
            this.f18878c = aVar;
            this.f18879d = aVar2;
        }

        public void d(long j10, int i10) {
            p3.a.f(this.f18878c == null);
            this.f18876a = j10;
            this.f18877b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f18876a)) + this.f18878c.f14405b;
        }

        @Override // o3.b.a
        public b.a next() {
            a aVar = this.f18879d;
            if (aVar == null || aVar.f18878c == null) {
                return null;
            }
            return aVar;
        }
    }

    public k0(o3.b bVar) {
        this.f18869a = bVar;
        int e10 = bVar.e();
        this.f18870b = e10;
        this.f18871c = new p3.a0(32);
        a aVar = new a(0L, e10);
        this.f18872d = aVar;
        this.f18873e = aVar;
        this.f18874f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f18878c == null) {
            return;
        }
        this.f18869a.a(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f18877b) {
            aVar = aVar.f18879d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f18875g + i10;
        this.f18875g = j10;
        a aVar = this.f18874f;
        if (j10 == aVar.f18877b) {
            this.f18874f = aVar.f18879d;
        }
    }

    private int h(int i10) {
        a aVar = this.f18874f;
        if (aVar.f18878c == null) {
            aVar.c(this.f18869a.d(), new a(this.f18874f.f18877b, this.f18870b));
        }
        return Math.min(i10, (int) (this.f18874f.f18877b - this.f18875g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f18877b - j10));
            byteBuffer.put(d10.f18878c.f14404a, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f18877b) {
                d10 = d10.f18879d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f18877b - j10));
            System.arraycopy(d10.f18878c.f14404a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f18877b) {
                d10 = d10.f18879d;
            }
        }
        return d10;
    }

    private static a k(a aVar, v1.g gVar, m0.b bVar, p3.a0 a0Var) {
        int i10;
        long j10 = bVar.f18914b;
        a0Var.P(1);
        a j11 = j(aVar, j10, a0Var.e(), 1);
        long j12 = j10 + 1;
        byte b10 = a0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        v1.c cVar = gVar.f19363k;
        byte[] bArr = cVar.f19339a;
        if (bArr == null) {
            cVar.f19339a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f19339a, i11);
        long j14 = j12 + i11;
        if (z10) {
            a0Var.P(2);
            j13 = j(j13, j14, a0Var.e(), 2);
            j14 += 2;
            i10 = a0Var.M();
        } else {
            i10 = 1;
        }
        int[] iArr = cVar.f19342d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f19343e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i10 * 6;
            a0Var.P(i12);
            j13 = j(j13, j14, a0Var.e(), i12);
            j14 += i12;
            a0Var.T(0);
            for (int i13 = 0; i13 < i10; i13++) {
                iArr2[i13] = a0Var.M();
                iArr4[i13] = a0Var.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f18913a - ((int) (j14 - bVar.f18914b));
        }
        e0.a aVar2 = (e0.a) p3.n0.j(bVar.f18915c);
        cVar.c(i10, iArr2, iArr4, aVar2.f20124b, cVar.f19339a, aVar2.f20123a, aVar2.f20125c, aVar2.f20126d);
        long j15 = bVar.f18914b;
        int i14 = (int) (j14 - j15);
        bVar.f18914b = j15 + i14;
        bVar.f18913a -= i14;
        return j13;
    }

    private static a l(a aVar, v1.g gVar, m0.b bVar, p3.a0 a0Var) {
        long j10;
        ByteBuffer byteBuffer;
        if (gVar.z()) {
            aVar = k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.p()) {
            a0Var.P(4);
            a j11 = j(aVar, bVar.f18914b, a0Var.e(), 4);
            int K = a0Var.K();
            bVar.f18914b += 4;
            bVar.f18913a -= 4;
            gVar.x(K);
            aVar = i(j11, bVar.f18914b, gVar.f19364l, K);
            bVar.f18914b += K;
            int i10 = bVar.f18913a - K;
            bVar.f18913a = i10;
            gVar.B(i10);
            j10 = bVar.f18914b;
            byteBuffer = gVar.f19367o;
        } else {
            gVar.x(bVar.f18913a);
            j10 = bVar.f18914b;
            byteBuffer = gVar.f19364l;
        }
        return i(aVar, j10, byteBuffer, bVar.f18913a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f18872d;
            if (j10 < aVar.f18877b) {
                break;
            }
            this.f18869a.c(aVar.f18878c);
            this.f18872d = this.f18872d.b();
        }
        if (this.f18873e.f18876a < aVar.f18876a) {
            this.f18873e = aVar;
        }
    }

    public void c(long j10) {
        p3.a.a(j10 <= this.f18875g);
        this.f18875g = j10;
        if (j10 != 0) {
            a aVar = this.f18872d;
            if (j10 != aVar.f18876a) {
                while (this.f18875g > aVar.f18877b) {
                    aVar = aVar.f18879d;
                }
                a aVar2 = (a) p3.a.e(aVar.f18879d);
                a(aVar2);
                a aVar3 = new a(aVar.f18877b, this.f18870b);
                aVar.f18879d = aVar3;
                if (this.f18875g == aVar.f18877b) {
                    aVar = aVar3;
                }
                this.f18874f = aVar;
                if (this.f18873e == aVar2) {
                    this.f18873e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f18872d);
        a aVar4 = new a(this.f18875g, this.f18870b);
        this.f18872d = aVar4;
        this.f18873e = aVar4;
        this.f18874f = aVar4;
    }

    public long e() {
        return this.f18875g;
    }

    public void f(v1.g gVar, m0.b bVar) {
        l(this.f18873e, gVar, bVar, this.f18871c);
    }

    public void m(v1.g gVar, m0.b bVar) {
        this.f18873e = l(this.f18873e, gVar, bVar, this.f18871c);
    }

    public void n() {
        a(this.f18872d);
        this.f18872d.d(0L, this.f18870b);
        a aVar = this.f18872d;
        this.f18873e = aVar;
        this.f18874f = aVar;
        this.f18875g = 0L;
        this.f18869a.b();
    }

    public void o() {
        this.f18873e = this.f18872d;
    }

    public int p(o3.i iVar, int i10, boolean z10) {
        int h10 = h(i10);
        a aVar = this.f18874f;
        int read = iVar.read(aVar.f18878c.f14404a, aVar.e(this.f18875g), h10);
        if (read != -1) {
            g(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(p3.a0 a0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f18874f;
            a0Var.l(aVar.f18878c.f14404a, aVar.e(this.f18875g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
