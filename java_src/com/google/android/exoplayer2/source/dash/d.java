package com.google.android.exoplayer2.source.dash;

import s1.n1;
import s1.o1;
import u2.n0;
import v1.g;
import y2.f;
/* loaded from: classes.dex */
final class d implements n0 {

    /* renamed from: j  reason: collision with root package name */
    private final n1 f3582j;

    /* renamed from: l  reason: collision with root package name */
    private long[] f3584l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3585m;

    /* renamed from: n  reason: collision with root package name */
    private f f3586n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3587o;

    /* renamed from: p  reason: collision with root package name */
    private int f3588p;

    /* renamed from: k  reason: collision with root package name */
    private final m2.c f3583k = new m2.c();

    /* renamed from: q  reason: collision with root package name */
    private long f3589q = -9223372036854775807L;

    public d(f fVar, n1 n1Var, boolean z10) {
        this.f3582j = n1Var;
        this.f3586n = fVar;
        this.f3584l = fVar.f20413b;
        e(fVar, z10);
    }

    public String a() {
        return this.f3586n.a();
    }

    @Override // u2.n0
    public void b() {
    }

    public void c(long j10) {
        boolean z10 = true;
        int e10 = p3.n0.e(this.f3584l, j10, true, false);
        this.f3588p = e10;
        if (!((this.f3585m && e10 == this.f3584l.length) ? false : false)) {
            j10 = -9223372036854775807L;
        }
        this.f3589q = j10;
    }

    @Override // u2.n0
    public boolean d() {
        return true;
    }

    public void e(f fVar, boolean z10) {
        int i10 = this.f3588p;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f3584l[i10 - 1];
        this.f3585m = z10;
        this.f3586n = fVar;
        long[] jArr = fVar.f20413b;
        this.f3584l = jArr;
        long j11 = this.f3589q;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f3588p = p3.n0.e(jArr, j10, false, false);
        }
    }

    @Override // u2.n0
    public int k(o1 o1Var, g gVar, int i10) {
        int i11 = this.f3588p;
        boolean z10 = i11 == this.f3584l.length;
        if (z10 && !this.f3585m) {
            gVar.v(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f3587o) {
            o1Var.f17464b = this.f3582j;
            this.f3587o = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f3588p = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f3583k.a(this.f3586n.f20412a[i11]);
                gVar.x(a10.length);
                gVar.f19364l.put(a10);
            }
            gVar.f19366n = this.f3584l[i11];
            gVar.v(1);
            return -4;
        }
    }

    @Override // u2.n0
    public int t(long j10) {
        int max = Math.max(this.f3588p, p3.n0.e(this.f3584l, j10, true, false));
        int i10 = max - this.f3588p;
        this.f3588p = max;
        return i10;
    }
}
