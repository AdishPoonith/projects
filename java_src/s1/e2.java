package s1;

import com.google.common.collect.q;
import s1.y3;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    private final y3.b f17184a = new y3.b();

    /* renamed from: b  reason: collision with root package name */
    private final y3.d f17185b = new y3.d();

    /* renamed from: c  reason: collision with root package name */
    private final t1.a f17186c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.n f17187d;

    /* renamed from: e  reason: collision with root package name */
    private long f17188e;

    /* renamed from: f  reason: collision with root package name */
    private int f17189f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17190g;

    /* renamed from: h  reason: collision with root package name */
    private b2 f17191h;

    /* renamed from: i  reason: collision with root package name */
    private b2 f17192i;

    /* renamed from: j  reason: collision with root package name */
    private b2 f17193j;

    /* renamed from: k  reason: collision with root package name */
    private int f17194k;

    /* renamed from: l  reason: collision with root package name */
    private Object f17195l;

    /* renamed from: m  reason: collision with root package name */
    private long f17196m;

    public e2(t1.a aVar, p3.n nVar) {
        this.f17186c = aVar;
        this.f17187d = nVar;
    }

    private static u.b A(y3 y3Var, Object obj, long j10, long j11, y3.d dVar, y3.b bVar) {
        y3Var.l(obj, bVar);
        y3Var.r(bVar.f17805l, dVar);
        int f10 = y3Var.f(obj);
        Object obj2 = obj;
        while (bVar.f17806m == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0L) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.f17829y) {
                break;
            }
            y3Var.k(i10, bVar, true);
            obj2 = p3.a.e(bVar.f17804k);
            f10 = i10;
        }
        y3Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        return h10 == -1 ? new u.b(obj2, j11, bVar.g(j10)) : new u.b(obj2, h10, bVar.n(h10), j11);
    }

    private long C(y3 y3Var, Object obj) {
        int f10;
        int i10 = y3Var.l(obj, this.f17184a).f17805l;
        Object obj2 = this.f17195l;
        if (obj2 == null || (f10 = y3Var.f(obj2)) == -1 || y3Var.j(f10, this.f17184a).f17805l != i10) {
            b2 b2Var = this.f17191h;
            while (true) {
                if (b2Var == null) {
                    b2Var = this.f17191h;
                    while (b2Var != null) {
                        int f11 = y3Var.f(b2Var.f17090b);
                        if (f11 == -1 || y3Var.j(f11, this.f17184a).f17805l != i10) {
                            b2Var = b2Var.j();
                        }
                    }
                    long j10 = this.f17188e;
                    this.f17188e = 1 + j10;
                    if (this.f17191h == null) {
                        this.f17195l = obj;
                        this.f17196m = j10;
                    }
                    return j10;
                } else if (b2Var.f17090b.equals(obj)) {
                    break;
                } else {
                    b2Var = b2Var.j();
                }
            }
            return b2Var.f17094f.f17116a.f18972d;
        }
        return this.f17196m;
    }

    private boolean E(y3 y3Var) {
        b2 b2Var = this.f17191h;
        if (b2Var == null) {
            return true;
        }
        int f10 = y3Var.f(b2Var.f17090b);
        while (true) {
            f10 = y3Var.h(f10, this.f17184a, this.f17185b, this.f17189f, this.f17190g);
            while (b2Var.j() != null && !b2Var.f17094f.f17122g) {
                b2Var = b2Var.j();
            }
            b2 j10 = b2Var.j();
            if (f10 == -1 || j10 == null || y3Var.f(j10.f17090b) != f10) {
                break;
            }
            b2Var = j10;
        }
        boolean z10 = z(b2Var);
        b2Var.f17094f = r(y3Var, b2Var.f17094f);
        return !z10;
    }

    private boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(c2 c2Var, c2 c2Var2) {
        return c2Var.f17117b == c2Var2.f17117b && c2Var.f17116a.equals(c2Var2.f17116a);
    }

    private c2 h(z2 z2Var) {
        return k(z2Var.f17836a, z2Var.f17837b, z2Var.f17838c, z2Var.f17853r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (r0.t(r0.r()) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private s1.c2 i(s1.y3 r20, s1.b2 r21, long r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e2.i(s1.y3, s1.b2, long):s1.c2");
    }

    private c2 k(y3 y3Var, u.b bVar, long j10, long j11) {
        y3Var.l(bVar.f18969a, this.f17184a);
        boolean b10 = bVar.b();
        Object obj = bVar.f18969a;
        return b10 ? l(y3Var, obj, bVar.f18970b, bVar.f18971c, j10, bVar.f18972d) : m(y3Var, obj, j11, j10, bVar.f18972d);
    }

    private c2 l(y3 y3Var, Object obj, int i10, int i11, long j10, long j11) {
        u.b bVar = new u.b(obj, i10, i11, j11);
        long e10 = y3Var.l(bVar.f18969a, this.f17184a).e(bVar.f18970b, bVar.f18971c);
        long j12 = i11 == this.f17184a.n(i10) ? this.f17184a.j() : 0L;
        return new c2(bVar, (e10 == -9223372036854775807L || j12 < e10) ? j12 : Math.max(0L, e10 - 1), j10, -9223372036854775807L, e10, this.f17184a.t(bVar.f18970b), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r9.t(r9.r()) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private s1.c2 m(s1.y3 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            s1.y3$b r5 = r0.f17184a
            r1.l(r2, r5)
            s1.y3$b r5 = r0.f17184a
            int r5 = r5.g(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            s1.y3$b r9 = r0.f17184a
            if (r5 != r7) goto L2d
            int r9 = r9.f()
            if (r9 <= 0) goto L4a
            s1.y3$b r9 = r0.f17184a
            int r10 = r9.r()
            boolean r9 = r9.t(r10)
            if (r9 == 0) goto L4a
            goto L48
        L2d:
            boolean r9 = r9.t(r5)
            if (r9 == 0) goto L4a
            s1.y3$b r9 = r0.f17184a
            long r9 = r9.i(r5)
            s1.y3$b r11 = r0.f17184a
            long r12 = r11.f17806m
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L4a
            boolean r9 = r11.s(r5)
            if (r9 == 0) goto L4a
            r5 = -1
        L48:
            r9 = 1
            goto L4b
        L4a:
            r9 = 0
        L4b:
            u2.u$b r11 = new u2.u$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.s(r11)
            boolean r22 = r0.u(r1, r11)
            boolean r23 = r0.t(r1, r11, r2)
            if (r5 == r7) goto L6b
            s1.y3$b r1 = r0.f17184a
            boolean r1 = r1.t(r5)
            if (r1 == 0) goto L6b
            r20 = 1
            goto L6d
        L6b:
            r20 = 0
        L6d:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L7d
            s1.y3$b r1 = r0.f17184a
            long r14 = r1.i(r5)
        L7a:
            r16 = r14
            goto L86
        L7d:
            if (r9 == 0) goto L84
            s1.y3$b r1 = r0.f17184a
            long r14 = r1.f17806m
            goto L7a
        L84:
            r16 = r12
        L86:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L94
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L91
            goto L94
        L91:
            r18 = r16
            goto L9a
        L94:
            s1.y3$b r1 = r0.f17184a
            long r14 = r1.f17806m
            r18 = r14
        L9a:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto Lb1
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto Lb1
            if (r23 != 0) goto La8
            if (r9 != 0) goto La7
            goto La8
        La7:
            r6 = 0
        La8:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        Lb1:
            r12 = r3
            s1.c2 r1 = new s1.c2
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e2.m(s1.y3, java.lang.Object, long, long, long):s1.c2");
    }

    private long n(y3 y3Var, Object obj, int i10) {
        y3Var.l(obj, this.f17184a);
        long i11 = this.f17184a.i(i10);
        return i11 == Long.MIN_VALUE ? this.f17184a.f17806m : i11 + this.f17184a.l(i10);
    }

    private boolean s(u.b bVar) {
        return !bVar.b() && bVar.f18973e == -1;
    }

    private boolean t(y3 y3Var, u.b bVar, boolean z10) {
        int f10 = y3Var.f(bVar.f18969a);
        return !y3Var.r(y3Var.j(f10, this.f17184a).f17805l, this.f17185b).f17822r && y3Var.v(f10, this.f17184a, this.f17185b, this.f17189f, this.f17190g) && z10;
    }

    private boolean u(y3 y3Var, u.b bVar) {
        if (s(bVar)) {
            return y3Var.r(y3Var.l(bVar.f18969a, this.f17184a).f17805l, this.f17185b).f17829y == y3Var.f(bVar.f18969a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(q.a aVar, u.b bVar) {
        this.f17186c.Z(aVar.h(), bVar);
    }

    private void x() {
        final q.a t10 = com.google.common.collect.q.t();
        for (b2 b2Var = this.f17191h; b2Var != null; b2Var = b2Var.j()) {
            t10.a(b2Var.f17094f.f17116a);
        }
        b2 b2Var2 = this.f17192i;
        final u.b bVar = b2Var2 == null ? null : b2Var2.f17094f.f17116a;
        this.f17187d.k(new Runnable() { // from class: s1.d2
            @Override // java.lang.Runnable
            public final void run() {
                e2.this.w(t10, bVar);
            }
        });
    }

    public u.b B(y3 y3Var, Object obj, long j10) {
        long C = C(y3Var, obj);
        y3Var.l(obj, this.f17184a);
        y3Var.r(this.f17184a.f17805l, this.f17185b);
        boolean z10 = false;
        for (int f10 = y3Var.f(obj); f10 >= this.f17185b.f17828x; f10--) {
            y3Var.k(f10, this.f17184a, true);
            boolean z11 = this.f17184a.f() > 0;
            z10 |= z11;
            y3.b bVar = this.f17184a;
            if (bVar.h(bVar.f17806m) != -1) {
                obj = p3.a.e(this.f17184a.f17804k);
            }
            if (z10 && (!z11 || this.f17184a.f17806m != 0)) {
                break;
            }
        }
        return A(y3Var, obj, j10, C, this.f17185b, this.f17184a);
    }

    public boolean D() {
        b2 b2Var = this.f17193j;
        return b2Var == null || (!b2Var.f17094f.f17124i && b2Var.q() && this.f17193j.f17094f.f17120e != -9223372036854775807L && this.f17194k < 100);
    }

    public boolean F(y3 y3Var, long j10, long j11) {
        c2 c2Var;
        b2 b2Var = this.f17191h;
        b2 b2Var2 = null;
        while (b2Var != null) {
            c2 c2Var2 = b2Var.f17094f;
            if (b2Var2 != null) {
                c2 i10 = i(y3Var, b2Var2, j10);
                if (i10 != null && e(c2Var2, i10)) {
                    c2Var = i10;
                }
                return !z(b2Var2);
            }
            c2Var = r(y3Var, c2Var2);
            b2Var.f17094f = c2Var.a(c2Var2.f17118c);
            if (!d(c2Var2.f17120e, c2Var.f17120e)) {
                b2Var.A();
                long j12 = c2Var.f17120e;
                return (z(b2Var) || (b2Var == this.f17192i && !b2Var.f17094f.f17121f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : b2Var.z(j12)) ? 1 : (j11 == ((j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : b2Var.z(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            b2Var2 = b2Var;
            b2Var = b2Var.j();
        }
        return true;
    }

    public boolean G(y3 y3Var, int i10) {
        this.f17189f = i10;
        return E(y3Var);
    }

    public boolean H(y3 y3Var, boolean z10) {
        this.f17190g = z10;
        return E(y3Var);
    }

    public b2 b() {
        b2 b2Var = this.f17191h;
        if (b2Var == null) {
            return null;
        }
        if (b2Var == this.f17192i) {
            this.f17192i = b2Var.j();
        }
        this.f17191h.t();
        int i10 = this.f17194k - 1;
        this.f17194k = i10;
        if (i10 == 0) {
            this.f17193j = null;
            b2 b2Var2 = this.f17191h;
            this.f17195l = b2Var2.f17090b;
            this.f17196m = b2Var2.f17094f.f17116a.f18972d;
        }
        this.f17191h = this.f17191h.j();
        x();
        return this.f17191h;
    }

    public b2 c() {
        b2 b2Var = this.f17192i;
        p3.a.f((b2Var == null || b2Var.j() == null) ? false : true);
        this.f17192i = this.f17192i.j();
        x();
        return this.f17192i;
    }

    public void f() {
        if (this.f17194k == 0) {
            return;
        }
        b2 b2Var = (b2) p3.a.h(this.f17191h);
        this.f17195l = b2Var.f17090b;
        this.f17196m = b2Var.f17094f.f17116a.f18972d;
        while (b2Var != null) {
            b2Var.t();
            b2Var = b2Var.j();
        }
        this.f17191h = null;
        this.f17193j = null;
        this.f17192i = null;
        this.f17194k = 0;
        x();
    }

    public b2 g(n3[] n3VarArr, n3.c0 c0Var, o3.b bVar, t2 t2Var, c2 c2Var, n3.d0 d0Var) {
        b2 b2Var = this.f17193j;
        b2 b2Var2 = new b2(n3VarArr, b2Var == null ? 1000000000000L : (b2Var.l() + this.f17193j.f17094f.f17120e) - c2Var.f17117b, c0Var, bVar, t2Var, c2Var, d0Var);
        b2 b2Var3 = this.f17193j;
        if (b2Var3 != null) {
            b2Var3.w(b2Var2);
        } else {
            this.f17191h = b2Var2;
            this.f17192i = b2Var2;
        }
        this.f17195l = null;
        this.f17193j = b2Var2;
        this.f17194k++;
        x();
        return b2Var2;
    }

    public b2 j() {
        return this.f17193j;
    }

    public c2 o(long j10, z2 z2Var) {
        b2 b2Var = this.f17193j;
        return b2Var == null ? h(z2Var) : i(z2Var.f17836a, b2Var, j10);
    }

    public b2 p() {
        return this.f17191h;
    }

    public b2 q() {
        return this.f17192i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1.c2 r(s1.y3 r19, s1.c2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            u2.u$b r3 = r2.f17116a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            u2.u$b r4 = r2.f17116a
            java.lang.Object r4 = r4.f18969a
            s1.y3$b r5 = r0.f17184a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f18973e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            s1.y3$b r7 = r0.f17184a
            long r7 = r7.i(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            s1.y3$b r1 = r0.f17184a
            int r5 = r3.f18970b
            int r6 = r3.f18971c
            long r5 = r1.e(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            s1.y3$b r1 = r0.f17184a
            long r5 = r1.m()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            s1.y3$b r1 = r0.f17184a
            int r4 = r3.f18970b
            boolean r1 = r1.t(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.f18973e
            if (r1 == r4) goto L7b
            s1.y3$b r4 = r0.f17184a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            s1.c2 r15 = new s1.c2
            long r4 = r2.f17117b
            long r1 = r2.f17118c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.e2.r(s1.y3, s1.c2):s1.c2");
    }

    public boolean v(u2.r rVar) {
        b2 b2Var = this.f17193j;
        return b2Var != null && b2Var.f17089a == rVar;
    }

    public void y(long j10) {
        b2 b2Var = this.f17193j;
        if (b2Var != null) {
            b2Var.s(j10);
        }
    }

    public boolean z(b2 b2Var) {
        boolean z10 = false;
        p3.a.f(b2Var != null);
        if (b2Var.equals(this.f17193j)) {
            return false;
        }
        this.f17193j = b2Var;
        while (b2Var.j() != null) {
            b2Var = b2Var.j();
            if (b2Var == this.f17192i) {
                this.f17192i = this.f17191h;
                z10 = true;
            }
            b2Var.t();
            this.f17194k--;
        }
        this.f17193j.w(null);
        x();
        return z10;
    }
}
