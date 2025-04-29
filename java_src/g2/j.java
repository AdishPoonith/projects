package g2;

import com.google.common.collect.q;
import g2.i;
import java.util.ArrayList;
import java.util.Arrays;
import p3.a0;
import s1.n1;
import s1.u2;
import x1.h0;
/* loaded from: classes.dex */
final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f8943n;

    /* renamed from: o  reason: collision with root package name */
    private int f8944o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8945p;

    /* renamed from: q  reason: collision with root package name */
    private h0.d f8946q;

    /* renamed from: r  reason: collision with root package name */
    private h0.b f8947r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h0.d f8948a;

        /* renamed from: b  reason: collision with root package name */
        public final h0.b f8949b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f8950c;

        /* renamed from: d  reason: collision with root package name */
        public final h0.c[] f8951d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8952e;

        public a(h0.d dVar, h0.b bVar, byte[] bArr, h0.c[] cVarArr, int i10) {
            this.f8948a = dVar;
            this.f8949b = bVar;
            this.f8950c = bArr;
            this.f8951d = cVarArr;
            this.f8952e = i10;
        }
    }

    static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.g() + 4) {
            a0Var.Q(Arrays.copyOf(a0Var.e(), a0Var.g() + 4));
        } else {
            a0Var.S(a0Var.g() + 4);
        }
        byte[] e10 = a0Var.e();
        e10[a0Var.g() - 4] = (byte) (j10 & 255);
        e10[a0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        e10[a0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        e10[a0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f8951d[p(b10, aVar.f8952e, 1)].f20155a ? aVar.f8948a.f20165g : aVar.f8948a.f20166h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return h0.m(1, a0Var, true);
        } catch (u2 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void e(long j10) {
        super.e(j10);
        this.f8945p = j10 != 0;
        h0.d dVar = this.f8946q;
        this.f8944o = dVar != null ? dVar.f20165g : 0;
    }

    @Override // g2.i
    protected long f(a0 a0Var) {
        if ((a0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(a0Var.e()[0], (a) p3.a.h(this.f8943n));
        long j10 = this.f8945p ? (this.f8944o + o10) / 4 : 0;
        n(a0Var, j10);
        this.f8945p = true;
        this.f8944o = o10;
        return j10;
    }

    @Override // g2.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        if (this.f8943n != null) {
            p3.a.e(bVar.f8941a);
            return false;
        }
        a q10 = q(a0Var);
        this.f8943n = q10;
        if (q10 == null) {
            return true;
        }
        h0.d dVar = q10.f8948a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f20168j);
        arrayList.add(q10.f8950c);
        bVar.f8941a = new n1.b().g0("audio/vorbis").I(dVar.f20163e).b0(dVar.f20162d).J(dVar.f20160b).h0(dVar.f20161c).V(arrayList).Z(h0.c(q.w(q10.f8949b.f20153b))).G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f8943n = null;
            this.f8946q = null;
            this.f8947r = null;
        }
        this.f8944o = 0;
        this.f8945p = false;
    }

    a q(a0 a0Var) {
        h0.d dVar = this.f8946q;
        if (dVar == null) {
            this.f8946q = h0.k(a0Var);
            return null;
        }
        h0.b bVar = this.f8947r;
        if (bVar == null) {
            this.f8947r = h0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.g()];
        System.arraycopy(a0Var.e(), 0, bArr, 0, a0Var.g());
        h0.c[] l10 = h0.l(a0Var, dVar.f20160b);
        return new a(dVar, bVar, bArr, l10, h0.a(l10.length - 1));
    }
}
