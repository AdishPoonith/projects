package com.google.android.exoplayer2.source.smoothstreaming;

import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.util.ArrayList;
import n3.t;
import o3.g0;
import o3.i0;
import o3.p0;
import s1.n1;
import s1.q3;
import u2.b0;
import u2.h;
import u2.n0;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import w2.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements r, o0.a<i<b>> {

    /* renamed from: j  reason: collision with root package name */
    private final b.a f3659j;

    /* renamed from: k  reason: collision with root package name */
    private final p0 f3660k;

    /* renamed from: l  reason: collision with root package name */
    private final i0 f3661l;

    /* renamed from: m  reason: collision with root package name */
    private final y f3662m;

    /* renamed from: n  reason: collision with root package name */
    private final w.a f3663n;

    /* renamed from: o  reason: collision with root package name */
    private final g0 f3664o;

    /* renamed from: p  reason: collision with root package name */
    private final b0.a f3665p;

    /* renamed from: q  reason: collision with root package name */
    private final o3.b f3666q;

    /* renamed from: r  reason: collision with root package name */
    private final v0 f3667r;

    /* renamed from: s  reason: collision with root package name */
    private final h f3668s;

    /* renamed from: t  reason: collision with root package name */
    private r.a f3669t;

    /* renamed from: u  reason: collision with root package name */
    private c3.a f3670u;

    /* renamed from: v  reason: collision with root package name */
    private i<b>[] f3671v;

    /* renamed from: w  reason: collision with root package name */
    private o0 f3672w;

    public c(c3.a aVar, b.a aVar2, p0 p0Var, h hVar, y yVar, w.a aVar3, g0 g0Var, b0.a aVar4, i0 i0Var, o3.b bVar) {
        this.f3670u = aVar;
        this.f3659j = aVar2;
        this.f3660k = p0Var;
        this.f3661l = i0Var;
        this.f3662m = yVar;
        this.f3663n = aVar3;
        this.f3664o = g0Var;
        this.f3665p = aVar4;
        this.f3666q = bVar;
        this.f3668s = hVar;
        this.f3667r = o(aVar, yVar);
        i<b>[] t10 = t(0);
        this.f3671v = t10;
        this.f3672w = hVar.a(t10);
    }

    private i<b> d(t tVar, long j10) {
        int c10 = this.f3667r.c(tVar.c());
        return new i<>(this.f3670u.f3197f[c10].f3203a, null, null, this.f3659j.a(this.f3661l, this.f3670u, c10, tVar, this.f3660k), this, this.f3666q, j10, this.f3662m, this.f3663n, this.f3664o, this.f3665p);
    }

    private static v0 o(c3.a aVar, y yVar) {
        t0[] t0VarArr = new t0[aVar.f3197f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f3197f;
            if (i10 >= bVarArr.length) {
                return new v0(t0VarArr);
            }
            n1[] n1VarArr = bVarArr[i10].f3212j;
            n1[] n1VarArr2 = new n1[n1VarArr.length];
            for (int i11 = 0; i11 < n1VarArr.length; i11++) {
                n1 n1Var = n1VarArr[i11];
                n1VarArr2[i11] = n1Var.c(yVar.f(n1Var));
            }
            t0VarArr[i10] = new t0(Integer.toString(i10), n1VarArr2);
            i10++;
        }
    }

    private static i<b>[] t(int i10) {
        return new i[i10];
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.f3672w.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.f3672w.c();
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        i<b>[] iVarArr;
        for (i<b> iVar : this.f3671v) {
            if (iVar.f19803j == 2) {
                return iVar.e(j10, q3Var);
            }
        }
        return j10;
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.f3672w.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.f3672w.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.f3672w.h(j10);
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.f3669t = aVar;
        aVar.i(this);
    }

    @Override // u2.r
    public long m(t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (n0VarArr[i10] != null) {
                i iVar = (i) n0VarArr[i10];
                if (tVarArr[i10] == null || !zArr[i10]) {
                    iVar.P();
                    n0VarArr[i10] = null;
                } else {
                    ((b) iVar.E()).c(tVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (n0VarArr[i10] == null && tVarArr[i10] != null) {
                i<b> d10 = d(tVarArr[i10], j10);
                arrayList.add(d10);
                n0VarArr[i10] = d10;
                zArr2[i10] = true;
            }
        }
        i<b>[] t10 = t(arrayList.size());
        this.f3671v = t10;
        arrayList.toArray(t10);
        this.f3672w = this.f3668s.a(this.f3671v);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return this.f3667r;
    }

    @Override // u2.r
    public void q() {
        this.f3661l.b();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (i<b> iVar : this.f3671v) {
            iVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        for (i<b> iVar : this.f3671v) {
            iVar.S(j10);
        }
        return j10;
    }

    @Override // u2.o0.a
    /* renamed from: u */
    public void l(i<b> iVar) {
        this.f3669t.l(this);
    }

    public void v() {
        for (i<b> iVar : this.f3671v) {
            iVar.P();
        }
        this.f3669t = null;
    }

    public void w(c3.a aVar) {
        this.f3670u = aVar;
        for (i<b> iVar : this.f3671v) {
            iVar.E().f(aVar);
        }
        this.f3669t.l(this);
    }
}
