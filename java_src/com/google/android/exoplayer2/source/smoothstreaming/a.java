package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import f2.o;
import f2.p;
import java.io.IOException;
import java.util.List;
import n3.b0;
import n3.t;
import o3.g0;
import o3.i0;
import o3.l;
import o3.p0;
import s1.n1;
import s1.q3;
import w2.e;
import w2.f;
import w2.g;
import w2.h;
import w2.k;
import w2.n;
/* loaded from: classes.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f3648a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3649b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f3650c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3651d;

    /* renamed from: e  reason: collision with root package name */
    private t f3652e;

    /* renamed from: f  reason: collision with root package name */
    private c3.a f3653f;

    /* renamed from: g  reason: collision with root package name */
    private int f3654g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f3655h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0084a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f3656a;

        public C0084a(l.a aVar) {
            this.f3656a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(i0 i0Var, c3.a aVar, int i10, t tVar, p0 p0Var) {
            l a10 = this.f3656a.a();
            if (p0Var != null) {
                a10.h(p0Var);
            }
            return new a(i0Var, aVar, i10, tVar, a10);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f3657e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3658f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f3213k - 1);
            this.f3657e = bVar;
            this.f3658f = i10;
        }

        @Override // w2.o
        public long a() {
            return b() + this.f3657e.c((int) d());
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f3657e.e((int) d());
        }
    }

    public a(i0 i0Var, c3.a aVar, int i10, t tVar, l lVar) {
        this.f3648a = i0Var;
        this.f3653f = aVar;
        this.f3649b = i10;
        this.f3652e = tVar;
        this.f3651d = lVar;
        a.b bVar = aVar.f3197f[i10];
        this.f3650c = new g[tVar.length()];
        int i11 = 0;
        while (i11 < this.f3650c.length) {
            int b10 = tVar.b(i11);
            n1 n1Var = bVar.f3212j[b10];
            p[] pVarArr = n1Var.f17422x != null ? ((a.C0074a) p3.a.e(aVar.f3196e)).f3202c : null;
            int i12 = bVar.f3203a;
            int i13 = i11;
            this.f3650c[i13] = new e(new f2.g(3, null, new o(b10, i12, bVar.f3205c, -9223372036854775807L, aVar.f3198g, n1Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f3203a, n1Var);
            i11 = i13 + 1;
        }
    }

    private static n l(n1 n1Var, l lVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        return new k(lVar, new o3.p(uri), n1Var, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, gVar);
    }

    private long m(long j10) {
        c3.a aVar = this.f3653f;
        if (aVar.f3195d) {
            a.b bVar = aVar.f3197f[this.f3649b];
            int i10 = bVar.f3213k - 1;
            return (bVar.e(i10) + bVar.c(i10)) - j10;
        }
        return -9223372036854775807L;
    }

    @Override // w2.j
    public void a() {
        for (g gVar : this.f3650c) {
            gVar.a();
        }
    }

    @Override // w2.j
    public void b() {
        IOException iOException = this.f3655h;
        if (iOException != null) {
            throw iOException;
        }
        this.f3648a.b();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(t tVar) {
        this.f3652e = tVar;
    }

    @Override // w2.j
    public boolean d(long j10, f fVar, List<? extends n> list) {
        if (this.f3655h != null) {
            return false;
        }
        return this.f3652e.l(j10, fVar, list);
    }

    @Override // w2.j
    public long e(long j10, q3 q3Var) {
        a.b bVar = this.f3653f.f3197f[this.f3649b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return q3Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f3213k + (-1)) ? e10 : bVar.e(d10 + 1));
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void f(c3.a aVar) {
        a.b[] bVarArr = this.f3653f.f3197f;
        int i10 = this.f3649b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f3213k;
        a.b bVar2 = aVar.f3197f[i10];
        if (i11 != 0 && bVar2.f3213k != 0) {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 > e11) {
                this.f3654g += bVar.d(e11);
                this.f3653f = aVar;
            }
        }
        this.f3654g += i11;
        this.f3653f = aVar;
    }

    @Override // w2.j
    public int g(long j10, List<? extends n> list) {
        return (this.f3655h != null || this.f3652e.length() < 2) ? list.size() : this.f3652e.j(j10, list);
    }

    @Override // w2.j
    public final void i(long j10, long j11, List<? extends n> list, h hVar) {
        int g10;
        long j12 = j11;
        if (this.f3655h != null) {
            return;
        }
        c3.a aVar = this.f3653f;
        a.b bVar = aVar.f3197f[this.f3649b];
        if (bVar.f3213k == 0) {
            hVar.f19802b = !aVar.f3195d;
            return;
        }
        if (list.isEmpty()) {
            g10 = bVar.d(j12);
        } else {
            g10 = (int) (list.get(list.size() - 1).g() - this.f3654g);
            if (g10 < 0) {
                this.f3655h = new u2.b();
                return;
            }
        }
        if (g10 >= bVar.f3213k) {
            hVar.f19802b = !this.f3653f.f3195d;
            return;
        }
        long j13 = j12 - j10;
        long m10 = m(j10);
        int length = this.f3652e.length();
        w2.o[] oVarArr = new w2.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = new b(bVar, this.f3652e.b(i10), g10);
        }
        this.f3652e.p(j10, j13, m10, list, oVarArr);
        long e10 = bVar.e(g10);
        long c10 = e10 + bVar.c(g10);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = g10 + this.f3654g;
        int o10 = this.f3652e.o();
        g gVar = this.f3650c[o10];
        hVar.f19801a = l(this.f3652e.m(), this.f3651d, bVar.a(this.f3652e.b(o10), g10), i11, e10, c10, j14, this.f3652e.n(), this.f3652e.r(), gVar);
    }

    @Override // w2.j
    public boolean j(f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b c10 = g0Var.c(b0.c(this.f3652e), cVar);
        if (z10 && c10 != null && c10.f14438a == 2) {
            t tVar = this.f3652e;
            if (tVar.f(tVar.d(fVar.f19795d), c10.f14439b)) {
                return true;
            }
        }
        return false;
    }

    @Override // w2.j
    public void k(f fVar) {
    }
}
