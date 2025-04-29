package w2;

import s1.n1;
/* loaded from: classes.dex */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f19764k;

    /* renamed from: l  reason: collision with root package name */
    public final long f19765l;

    /* renamed from: m  reason: collision with root package name */
    private c f19766m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f19767n;

    public a(o3.l lVar, o3.p pVar, n1 n1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, pVar, n1Var, i10, obj, j10, j11, j14);
        this.f19764k = j12;
        this.f19765l = j13;
    }

    public final int i(int i10) {
        return ((int[]) p3.a.h(this.f19767n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return (c) p3.a.h(this.f19766m);
    }

    public void k(c cVar) {
        this.f19766m = cVar;
        this.f19767n = cVar.a();
    }
}
