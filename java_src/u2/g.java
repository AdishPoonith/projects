package u2;
/* loaded from: classes.dex */
public class g implements o0 {

    /* renamed from: j  reason: collision with root package name */
    protected final o0[] f18797j;

    public g(o0[] o0VarArr) {
        this.f18797j = o0VarArr;
    }

    @Override // u2.o0
    public boolean a() {
        for (o0 o0Var : this.f18797j) {
            if (o0Var.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // u2.o0
    public final long c() {
        long j10 = Long.MAX_VALUE;
        for (o0 o0Var : this.f18797j) {
            long c10 = o0Var.c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // u2.o0
    public final long f() {
        long j10 = Long.MAX_VALUE;
        for (o0 o0Var : this.f18797j) {
            long f10 = o0Var.f();
            if (f10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, f10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // u2.o0
    public boolean g(long j10) {
        o0[] o0VarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (o0 o0Var : this.f18797j) {
                long c11 = o0Var.c();
                boolean z12 = c11 != Long.MIN_VALUE && c11 <= j10;
                if (c11 == c10 || z12) {
                    z10 |= o0Var.g(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // u2.o0
    public final void h(long j10) {
        for (o0 o0Var : this.f18797j) {
            o0Var.h(j10);
        }
    }
}
