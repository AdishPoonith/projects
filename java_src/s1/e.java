package s1;

import s1.y3;
/* loaded from: classes.dex */
public abstract class e implements c3 {

    /* renamed from: a  reason: collision with root package name */
    protected final y3.d f17181a = new y3.d();

    private int M() {
        int C = C();
        if (C == 1) {
            return 0;
        }
        return C;
    }

    private void O(long j10, int i10) {
        N(v(), j10, i10, false);
    }

    @Override // s1.c3
    public final boolean A() {
        y3 E = E();
        return !E.u() && E.r(v(), this.f17181a).f17822r;
    }

    @Override // s1.c3
    public final void G(long j10) {
        O(j10, 5);
    }

    @Override // s1.c3
    public final boolean I() {
        y3 E = E();
        return !E.u() && E.r(v(), this.f17181a).g();
    }

    public final long J() {
        y3 E = E();
        if (E.u()) {
            return -9223372036854775807L;
        }
        return E.r(v(), this.f17181a).f();
    }

    public final int K() {
        y3 E = E();
        if (E.u()) {
            return -1;
        }
        return E.i(v(), M(), F());
    }

    public final int L() {
        y3 E = E();
        if (E.u()) {
            return -1;
        }
        return E.p(v(), M(), F());
    }

    public abstract void N(int i10, long j10, int i11, boolean z10);

    @Override // s1.c3
    public final boolean o() {
        y3 E = E();
        return !E.u() && E.r(v(), this.f17181a).f17821q;
    }

    @Override // s1.c3
    public final boolean s() {
        return K() != -1;
    }

    @Override // s1.c3
    public final boolean x() {
        return L() != -1;
    }
}
