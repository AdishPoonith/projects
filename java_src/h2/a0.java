package h2;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;
import x1.b0;
/* loaded from: classes.dex */
public final class a0 implements x1.l {

    /* renamed from: l  reason: collision with root package name */
    public static final x1.r f9093l = new x1.r() { // from class: h2.z
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] e10;
            e10 = a0.e();
            return e10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final p3.j0 f9094a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<a> f9095b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f9096c;

    /* renamed from: d  reason: collision with root package name */
    private final y f9097d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9098e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9099f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9100g;

    /* renamed from: h  reason: collision with root package name */
    private long f9101h;

    /* renamed from: i  reason: collision with root package name */
    private x f9102i;

    /* renamed from: j  reason: collision with root package name */
    private x1.n f9103j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9104k;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m f9105a;

        /* renamed from: b  reason: collision with root package name */
        private final p3.j0 f9106b;

        /* renamed from: c  reason: collision with root package name */
        private final p3.z f9107c = new p3.z(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f9108d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9109e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9110f;

        /* renamed from: g  reason: collision with root package name */
        private int f9111g;

        /* renamed from: h  reason: collision with root package name */
        private long f9112h;

        public a(m mVar, p3.j0 j0Var) {
            this.f9105a = mVar;
            this.f9106b = j0Var;
        }

        private void b() {
            this.f9107c.r(8);
            this.f9108d = this.f9107c.g();
            this.f9109e = this.f9107c.g();
            this.f9107c.r(6);
            this.f9111g = this.f9107c.h(8);
        }

        private void c() {
            this.f9112h = 0L;
            if (this.f9108d) {
                this.f9107c.r(4);
                this.f9107c.r(1);
                this.f9107c.r(1);
                long h10 = (this.f9107c.h(3) << 30) | (this.f9107c.h(15) << 15) | this.f9107c.h(15);
                this.f9107c.r(1);
                if (!this.f9110f && this.f9109e) {
                    this.f9107c.r(4);
                    this.f9107c.r(1);
                    this.f9107c.r(1);
                    this.f9107c.r(1);
                    this.f9106b.b((this.f9107c.h(3) << 30) | (this.f9107c.h(15) << 15) | this.f9107c.h(15));
                    this.f9110f = true;
                }
                this.f9112h = this.f9106b.b(h10);
            }
        }

        public void a(p3.a0 a0Var) {
            a0Var.l(this.f9107c.f15486a, 0, 3);
            this.f9107c.p(0);
            b();
            a0Var.l(this.f9107c.f15486a, 0, this.f9111g);
            this.f9107c.p(0);
            c();
            this.f9105a.e(this.f9112h, 4);
            this.f9105a.a(a0Var);
            this.f9105a.d();
        }

        public void d() {
            this.f9110f = false;
            this.f9105a.b();
        }
    }

    public a0() {
        this(new p3.j0(0L));
    }

    public a0(p3.j0 j0Var) {
        this.f9094a = j0Var;
        this.f9096c = new p3.a0(4096);
        this.f9095b = new SparseArray<>();
        this.f9097d = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] e() {
        return new x1.l[]{new a0()};
    }

    private void f(long j10) {
        x1.n nVar;
        x1.b0 bVar;
        if (this.f9104k) {
            return;
        }
        this.f9104k = true;
        if (this.f9097d.c() != -9223372036854775807L) {
            x xVar = new x(this.f9097d.d(), this.f9097d.c(), j10);
            this.f9102i = xVar;
            nVar = this.f9103j;
            bVar = xVar.b();
        } else {
            nVar = this.f9103j;
            bVar = new b0.b(this.f9097d.c());
        }
        nVar.t(bVar);
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f9094a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f9094a.c();
            z11 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : false;
        }
        if (z11) {
            this.f9094a.g(j11);
        }
        x xVar = this.f9102i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f9095b.size(); i10++) {
            this.f9095b.valueAt(i10).d();
        }
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f9103j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    @Override // x1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i(x1.m r11, x1.a0 r12) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a0.i(x1.m, x1.a0):int");
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        byte[] bArr = new byte[14];
        mVar.n(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            mVar.o(bArr[13] & 7);
            mVar.n(bArr, 0, 3);
            return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
        }
        return false;
    }
}
