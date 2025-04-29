package h2;

import android.net.Uri;
import h2.i0;
import java.util.Map;
import x1.b0;
/* loaded from: classes.dex */
public final class e implements x1.l {

    /* renamed from: d  reason: collision with root package name */
    public static final x1.r f9138d = new x1.r() { // from class: h2.d
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] e10;
            e10 = e.e();
            return e10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final f f9139a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9140b = new p3.a0(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f9141c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] e() {
        return new x1.l[]{new e()};
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f9141c = false;
        this.f9139a.b();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f9139a.c(nVar, new i0.d(0, 1));
        nVar.k();
        nVar.t(new b0.b(-9223372036854775807L));
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        int read = mVar.read(this.f9140b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f9140b.T(0);
        this.f9140b.S(read);
        if (!this.f9141c) {
            this.f9139a.e(0L, 4);
            this.f9141c = true;
        }
        this.f9139a.a(this.f9140b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        r9.f();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        return false;
     */
    @Override // x1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(x1.m r9) {
        /*
            r8 = this;
            p3.a0 r0 = new p3.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.e()
            r9.n(r4, r2, r1)
            r0.T(r2)
            int r4 = r0.J()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.f()
            r9.o(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.e()
            r6 = 7
            r9.n(r5, r2, r6)
            r0.T(r2)
            int r5 = r0.M()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.o(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.e()
            int r5 = u1.c.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.o(r5)
            goto L24
        L65:
            r4 = 3
            r0.U(r4)
            int r4 = r0.F()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.o(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.e.j(x1.m):boolean");
    }
}
