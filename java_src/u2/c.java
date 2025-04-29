package u2;
/* loaded from: classes.dex */
public final class c implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final x1.r f18770a;

    /* renamed from: b  reason: collision with root package name */
    private x1.l f18771b;

    /* renamed from: c  reason: collision with root package name */
    private x1.m f18772c;

    public c(x1.r rVar) {
        this.f18770a = rVar;
    }

    @Override // u2.c0
    public void a() {
        x1.l lVar = this.f18771b;
        if (lVar != null) {
            lVar.a();
            this.f18771b = null;
        }
        this.f18772c = null;
    }

    @Override // u2.c0
    public void b(long j10, long j11) {
        ((x1.l) p3.a.e(this.f18771b)).b(j10, j11);
    }

    @Override // u2.c0
    public int c(x1.a0 a0Var) {
        return ((x1.l) p3.a.e(this.f18771b)).i((x1.m) p3.a.e(this.f18772c), a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r6.p() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r6.p() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        r1 = false;
     */
    @Override // u2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(o3.i r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, x1.n r15) {
        /*
            r7 = this;
            x1.f r6 = new x1.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f18772c = r6
            x1.l r8 = r7.f18771b
            if (r8 == 0) goto L10
            return
        L10:
            x1.r r8 = r7.f18770a
            x1.l[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f18771b = r8
            goto L75
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.j(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f18771b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            p3.a.f(r14)
            r6.f()
            goto L71
        L35:
            x1.l r1 = r7.f18771b
            if (r1 != 0) goto L67
            long r1 = r6.p()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L42:
            r8 = move-exception
            x1.l r9 = r7.f18771b
            if (r9 != 0) goto L4f
            long r9 = r6.p()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L50
        L4f:
            r13 = 1
        L50:
            p3.a.f(r13)
            r6.f()
            throw r8
        L57:
            x1.l r1 = r7.f18771b
            if (r1 != 0) goto L67
            long r1 = r6.p()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L65
            goto L67
        L65:
            r1 = 0
            goto L68
        L67:
            r1 = 1
        L68:
            p3.a.f(r1)
            r6.f()
            int r0 = r0 + 1
            goto L22
        L71:
            x1.l r10 = r7.f18771b
            if (r10 == 0) goto L7b
        L75:
            x1.l r8 = r7.f18771b
            r8.c(r15)
            return
        L7b:
            u2.w0 r10 = new u2.w0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p3.n0.M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p3.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.c.d(o3.i, android.net.Uri, java.util.Map, long, long, x1.n):void");
    }

    @Override // u2.c0
    public long e() {
        x1.m mVar = this.f18772c;
        if (mVar != null) {
            return mVar.p();
        }
        return -1L;
    }

    @Override // u2.c0
    public void f() {
        x1.l lVar = this.f18771b;
        if (lVar instanceof e2.f) {
            ((e2.f) lVar).k();
        }
    }
}
