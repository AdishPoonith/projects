package h2;

import android.net.Uri;
import h2.i0;
import java.util.Map;
import x1.b0;
/* loaded from: classes.dex */
public final class b implements x1.l {

    /* renamed from: d  reason: collision with root package name */
    public static final x1.r f9113d = new x1.r() { // from class: h2.a
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] e10;
            e10 = b.e();
            return e10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final c f9114a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9115b = new p3.a0(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f9116c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] e() {
        return new x1.l[]{new b()};
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f9116c = false;
        this.f9114a.b();
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f9114a.c(nVar, new i0.d(0, 1));
        nVar.k();
        nVar.t(new b0.b(-9223372036854775807L));
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        int read = mVar.read(this.f9115b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f9115b.T(0);
        this.f9115b.S(read);
        if (!this.f9116c) {
            this.f9114a.e(0L, 4);
            this.f9116c = true;
        }
        this.f9114a.a(this.f9115b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        r8.f();
        r4 = r4 + 1;
     */
    @Override // x1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(x1.m r8) {
        /*
            r7 = this;
            p3.a0 r0 = new p3.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.e()
            r8.n(r4, r2, r1)
            r0.T(r2)
            int r4 = r0.J()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.f()
            r8.o(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.e()
            r6 = 6
            r8.n(r5, r2, r6)
            r0.T(r2)
            int r5 = r0.M()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.o(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.e()
            int r5 = u1.b.g(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.o(r5)
            goto L24
        L5f:
            r4 = 3
            r0.U(r4)
            int r4 = r0.F()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.o(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.b.j(x1.m):boolean");
    }
}
