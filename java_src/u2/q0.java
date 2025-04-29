package u2;

import android.net.Uri;
import s1.v1;
import s1.y3;
/* loaded from: classes.dex */
public final class q0 extends y3 {
    private static final Object B = new Object();
    private static final v1 C = new v1.c().c("SinglePeriodTimeline").e(Uri.EMPTY).a();
    private final v1.g A;

    /* renamed from: o  reason: collision with root package name */
    private final long f18954o;

    /* renamed from: p  reason: collision with root package name */
    private final long f18955p;

    /* renamed from: q  reason: collision with root package name */
    private final long f18956q;

    /* renamed from: r  reason: collision with root package name */
    private final long f18957r;

    /* renamed from: s  reason: collision with root package name */
    private final long f18958s;

    /* renamed from: t  reason: collision with root package name */
    private final long f18959t;

    /* renamed from: u  reason: collision with root package name */
    private final long f18960u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f18961v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f18962w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f18963x;

    /* renamed from: y  reason: collision with root package name */
    private final Object f18964y;

    /* renamed from: z  reason: collision with root package name */
    private final v1 f18965z;

    public q0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, v1 v1Var, v1.g gVar) {
        this.f18954o = j10;
        this.f18955p = j11;
        this.f18956q = j12;
        this.f18957r = j13;
        this.f18958s = j14;
        this.f18959t = j15;
        this.f18960u = j16;
        this.f18961v = z10;
        this.f18962w = z11;
        this.f18963x = z12;
        this.f18964y = obj;
        this.f18965z = (v1) p3.a.e(v1Var);
        this.A = gVar;
    }

    public q0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, v1 v1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, v1Var, z12 ? v1Var.f17605m : null);
    }

    public q0(long j10, boolean z10, boolean z11, boolean z12, Object obj, v1 v1Var) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, v1Var);
    }

    @Override // s1.y3
    public int f(Object obj) {
        return B.equals(obj) ? 0 : -1;
    }

    @Override // s1.y3
    public y3.b k(int i10, y3.b bVar, boolean z10) {
        p3.a.c(i10, 0, 1);
        return bVar.u(null, z10 ? B : null, 0, this.f18957r, -this.f18959t);
    }

    @Override // s1.y3
    public int m() {
        return 1;
    }

    @Override // s1.y3
    public Object q(int i10) {
        p3.a.c(i10, 0, 1);
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // s1.y3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1.y3.d s(int r25, s1.y3.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p3.a.c(r3, r1, r2)
            long r1 = r0.f18960u
            boolean r14 = r0.f18962w
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f18963x
            if (r5 != 0) goto L2e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r5 = r0.f18958s
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = s1.y3.d.A
            s1.v1 r5 = r0.f18965z
            java.lang.Object r6 = r0.f18964y
            long r7 = r0.f18954o
            long r9 = r0.f18955p
            long r11 = r0.f18956q
            boolean r13 = r0.f18961v
            s1.v1$g r15 = r0.A
            long r1 = r0.f18958s
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f18959t
            r22 = r1
            r3 = r26
            s1.y3$d r1 = r3.h(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.q0.s(int, s1.y3$d, long):s1.y3$d");
    }

    @Override // s1.y3
    public int t() {
        return 1;
    }
}
