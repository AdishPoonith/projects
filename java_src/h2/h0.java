package h2;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import h2.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3.n0;
import s1.u2;
import x1.b0;
/* loaded from: classes.dex */
public final class h0 implements x1.l {

    /* renamed from: t  reason: collision with root package name */
    public static final x1.r f9183t = new x1.r() { // from class: h2.g0
        @Override // x1.r
        public final x1.l[] a() {
            x1.l[] x10;
            x10 = h0.x();
            return x10;
        }

        @Override // x1.r
        public /* synthetic */ x1.l[] b(Uri uri, Map map) {
            return x1.q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f9184a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9185b;

    /* renamed from: c  reason: collision with root package name */
    private final List<p3.j0> f9186c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.a0 f9187d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f9188e;

    /* renamed from: f  reason: collision with root package name */
    private final i0.c f9189f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<i0> f9190g;

    /* renamed from: h  reason: collision with root package name */
    private final SparseBooleanArray f9191h;

    /* renamed from: i  reason: collision with root package name */
    private final SparseBooleanArray f9192i;

    /* renamed from: j  reason: collision with root package name */
    private final f0 f9193j;

    /* renamed from: k  reason: collision with root package name */
    private e0 f9194k;

    /* renamed from: l  reason: collision with root package name */
    private x1.n f9195l;

    /* renamed from: m  reason: collision with root package name */
    private int f9196m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9197n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9198o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9199p;

    /* renamed from: q  reason: collision with root package name */
    private i0 f9200q;

    /* renamed from: r  reason: collision with root package name */
    private int f9201r;

    /* renamed from: s  reason: collision with root package name */
    private int f9202s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final p3.z f9203a = new p3.z(new byte[4]);

        public a() {
        }

        @Override // h2.b0
        public void a(p3.a0 a0Var) {
            if (a0Var.G() == 0 && (a0Var.G() & 128) != 0) {
                a0Var.U(6);
                int a10 = a0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    a0Var.k(this.f9203a, 4);
                    int h10 = this.f9203a.h(16);
                    this.f9203a.r(3);
                    if (h10 == 0) {
                        this.f9203a.r(13);
                    } else {
                        int h11 = this.f9203a.h(13);
                        if (h0.this.f9190g.get(h11) == null) {
                            h0.this.f9190g.put(h11, new c0(new b(h11)));
                            h0.l(h0.this);
                        }
                    }
                }
                if (h0.this.f9184a != 2) {
                    h0.this.f9190g.remove(0);
                }
            }
        }

        @Override // h2.b0
        public void c(p3.j0 j0Var, x1.n nVar, i0.d dVar) {
        }
    }

    /* loaded from: classes.dex */
    private class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final p3.z f9205a = new p3.z(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<i0> f9206b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f9207c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f9208d;

        public b(int i10) {
            this.f9208d = i10;
        }

        private i0.b b(p3.a0 a0Var, int i10) {
            int f10 = a0Var.f();
            int i11 = i10 + f10;
            String str = null;
            ArrayList arrayList = null;
            int i12 = -1;
            while (a0Var.f() < i11) {
                int G = a0Var.G();
                int f11 = a0Var.f() + a0Var.G();
                if (f11 > i11) {
                    break;
                }
                if (G == 5) {
                    long I = a0Var.I();
                    if (I != 1094921523) {
                        if (I != 1161904947) {
                            if (I != 1094921524) {
                                if (I == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (G != 106) {
                        if (G != 122) {
                            if (G == 127) {
                                if (a0Var.G() != 21) {
                                }
                                i12 = 172;
                            } else if (G == 123) {
                                i12 = 138;
                            } else if (G == 10) {
                                str = a0Var.D(3).trim();
                            } else if (G == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.f() < f11) {
                                    String trim = a0Var.D(3).trim();
                                    int G2 = a0Var.G();
                                    byte[] bArr = new byte[4];
                                    a0Var.l(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, G2, bArr));
                                }
                                i12 = 89;
                            } else if (G == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                a0Var.U(f11 - a0Var.f());
            }
            a0Var.T(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(a0Var.e(), f10, i11));
        }

        @Override // h2.b0
        public void a(p3.a0 a0Var) {
            p3.j0 j0Var;
            if (a0Var.G() != 2) {
                return;
            }
            if (h0.this.f9184a == 1 || h0.this.f9184a == 2 || h0.this.f9196m == 1) {
                j0Var = (p3.j0) h0.this.f9186c.get(0);
            } else {
                j0Var = new p3.j0(((p3.j0) h0.this.f9186c.get(0)).c());
                h0.this.f9186c.add(j0Var);
            }
            if ((a0Var.G() & 128) == 0) {
                return;
            }
            a0Var.U(1);
            int M = a0Var.M();
            int i10 = 3;
            a0Var.U(3);
            a0Var.k(this.f9205a, 2);
            this.f9205a.r(3);
            int i11 = 13;
            h0.this.f9202s = this.f9205a.h(13);
            a0Var.k(this.f9205a, 2);
            int i12 = 4;
            this.f9205a.r(4);
            a0Var.U(this.f9205a.h(12));
            if (h0.this.f9184a == 2 && h0.this.f9200q == null) {
                i0.b bVar = new i0.b(21, null, null, n0.f15402f);
                h0 h0Var = h0.this;
                h0Var.f9200q = h0Var.f9189f.b(21, bVar);
                if (h0.this.f9200q != null) {
                    h0.this.f9200q.c(j0Var, h0.this.f9195l, new i0.d(M, 21, 8192));
                }
            }
            this.f9206b.clear();
            this.f9207c.clear();
            int a10 = a0Var.a();
            while (a10 > 0) {
                a0Var.k(this.f9205a, 5);
                int h10 = this.f9205a.h(8);
                this.f9205a.r(i10);
                int h11 = this.f9205a.h(i11);
                this.f9205a.r(i12);
                int h12 = this.f9205a.h(12);
                i0.b b10 = b(a0Var, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = b10.f9235a;
                }
                a10 -= h12 + 5;
                int i13 = h0.this.f9184a == 2 ? h10 : h11;
                if (!h0.this.f9191h.get(i13)) {
                    i0 b11 = (h0.this.f9184a == 2 && h10 == 21) ? h0.this.f9200q : h0.this.f9189f.b(h10, b10);
                    if (h0.this.f9184a != 2 || h11 < this.f9207c.get(i13, 8192)) {
                        this.f9207c.put(i13, h11);
                        this.f9206b.put(i13, b11);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f9207c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f9207c.keyAt(i14);
                int valueAt = this.f9207c.valueAt(i14);
                h0.this.f9191h.put(keyAt, true);
                h0.this.f9192i.put(valueAt, true);
                i0 valueAt2 = this.f9206b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f9200q) {
                        valueAt2.c(j0Var, h0.this.f9195l, new i0.d(M, keyAt, 8192));
                    }
                    h0.this.f9190g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f9184a != 2) {
                h0.this.f9190g.remove(this.f9208d);
                h0 h0Var2 = h0.this;
                h0Var2.f9196m = h0Var2.f9184a == 1 ? 0 : h0.this.f9196m - 1;
                if (h0.this.f9196m != 0) {
                    return;
                }
                h0.this.f9195l.k();
            } else if (h0.this.f9197n) {
                return;
            } else {
                h0.this.f9195l.k();
                h0.this.f9196m = 0;
            }
            h0.this.f9197n = true;
        }

        @Override // h2.b0
        public void c(p3.j0 j0Var, x1.n nVar, i0.d dVar) {
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new p3.j0(0L), new j(i11), i12);
    }

    public h0(int i10, p3.j0 j0Var, i0.c cVar) {
        this(i10, j0Var, cVar, 112800);
    }

    public h0(int i10, p3.j0 j0Var, i0.c cVar, int i11) {
        this.f9189f = (i0.c) p3.a.e(cVar);
        this.f9185b = i11;
        this.f9184a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f9186c = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f9186c = arrayList;
            arrayList.add(j0Var);
        }
        this.f9187d = new p3.a0(new byte[9400], 0);
        this.f9191h = new SparseBooleanArray();
        this.f9192i = new SparseBooleanArray();
        this.f9190g = new SparseArray<>();
        this.f9188e = new SparseIntArray();
        this.f9193j = new f0(i11);
        this.f9195l = x1.n.f20189i;
        this.f9202s = -1;
        z();
    }

    private boolean A(int i10) {
        return this.f9184a == 2 || this.f9197n || !this.f9192i.get(i10, false);
    }

    static /* synthetic */ int l(h0 h0Var) {
        int i10 = h0Var.f9196m;
        h0Var.f9196m = i10 + 1;
        return i10;
    }

    private boolean v(x1.m mVar) {
        byte[] e10 = this.f9187d.e();
        if (9400 - this.f9187d.f() < 188) {
            int a10 = this.f9187d.a();
            if (a10 > 0) {
                System.arraycopy(e10, this.f9187d.f(), e10, 0, a10);
            }
            this.f9187d.R(e10, a10);
        }
        while (this.f9187d.a() < 188) {
            int g10 = this.f9187d.g();
            int read = mVar.read(e10, g10, 9400 - g10);
            if (read == -1) {
                return false;
            }
            this.f9187d.S(g10 + read);
        }
        return true;
    }

    private int w() {
        int f10 = this.f9187d.f();
        int g10 = this.f9187d.g();
        int a10 = j0.a(this.f9187d.e(), f10, g10);
        this.f9187d.T(a10);
        int i10 = a10 + 188;
        if (i10 > g10) {
            int i11 = this.f9201r + (a10 - f10);
            this.f9201r = i11;
            if (this.f9184a == 2 && i11 > 376) {
                throw u2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f9201r = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] x() {
        return new x1.l[]{new h0()};
    }

    private void y(long j10) {
        x1.n nVar;
        x1.b0 bVar;
        if (this.f9198o) {
            return;
        }
        this.f9198o = true;
        if (this.f9193j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f9193j.c(), this.f9193j.b(), j10, this.f9202s, this.f9185b);
            this.f9194k = e0Var;
            nVar = this.f9195l;
            bVar = e0Var.b();
        } else {
            nVar = this.f9195l;
            bVar = new b0.b(this.f9193j.b());
        }
        nVar.t(bVar);
    }

    private void z() {
        this.f9191h.clear();
        this.f9190g.clear();
        SparseArray<i0> a10 = this.f9189f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9190g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f9190g.put(0, new c0(new a()));
        this.f9200q = null;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        e0 e0Var;
        p3.a.f(this.f9184a != 2);
        int size = this.f9186c.size();
        for (int i10 = 0; i10 < size; i10++) {
            p3.j0 j0Var = this.f9186c.get(i10);
            boolean z10 = j0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = j0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                j0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f9194k) != null) {
            e0Var.h(j11);
        }
        this.f9187d.P(0);
        this.f9188e.clear();
        for (int i11 = 0; i11 < this.f9190g.size(); i11++) {
            this.f9190g.valueAt(i11).b();
        }
        this.f9201r = 0;
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f9195l = nVar;
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        long a10 = mVar.a();
        if (this.f9197n) {
            if (((a10 == -1 || this.f9184a == 2) ? false : true) && !this.f9193j.d()) {
                return this.f9193j.e(mVar, a0Var, this.f9202s);
            }
            y(a10);
            if (this.f9199p) {
                this.f9199p = false;
                b(0L, 0L);
                if (mVar.p() != 0) {
                    a0Var.f20102a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f9194k;
            if (e0Var != null && e0Var.d()) {
                return this.f9194k.c(mVar, a0Var);
            }
        }
        if (v(mVar)) {
            int w10 = w();
            int g10 = this.f9187d.g();
            if (w10 > g10) {
                return 0;
            }
            int p10 = this.f9187d.p();
            if ((8388608 & p10) == 0) {
                int i10 = ((4194304 & p10) != 0 ? 1 : 0) | 0;
                int i11 = (2096896 & p10) >> 8;
                boolean z10 = (p10 & 32) != 0;
                i0 i0Var = (p10 & 16) != 0 ? this.f9190g.get(i11) : null;
                if (i0Var != null) {
                    if (this.f9184a != 2) {
                        int i12 = p10 & 15;
                        int i13 = this.f9188e.get(i11, i12 - 1);
                        this.f9188e.put(i11, i12);
                        if (i13 != i12) {
                            if (i12 != ((i13 + 1) & 15)) {
                                i0Var.b();
                            }
                        }
                    }
                    if (z10) {
                        int G = this.f9187d.G();
                        i10 |= (this.f9187d.G() & 64) != 0 ? 2 : 0;
                        this.f9187d.U(G - 1);
                    }
                    boolean z11 = this.f9197n;
                    if (A(i11)) {
                        this.f9187d.S(w10);
                        i0Var.a(this.f9187d, i10);
                        this.f9187d.S(g10);
                    }
                    if (this.f9184a != 2 && !z11 && this.f9197n && a10 != -1) {
                        this.f9199p = true;
                    }
                }
            }
            this.f9187d.T(w10);
            return 0;
        }
        return -1;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        boolean z10;
        byte[] e10 = this.f9187d.e();
        mVar.n(e10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (e10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                mVar.g(i10);
                return true;
            }
        }
        return false;
    }
}
