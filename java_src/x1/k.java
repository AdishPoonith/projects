package x1;

import java.io.EOFException;
import s1.n1;
import x1.e0;
/* loaded from: classes.dex */
public final class k implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f20188a = new byte[4096];

    @Override // x1.e0
    public int a(o3.i iVar, int i10, boolean z10, int i11) {
        int read = iVar.read(this.f20188a, 0, Math.min(this.f20188a.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // x1.e0
    public void b(p3.a0 a0Var, int i10, int i11) {
        a0Var.U(i10);
    }

    @Override // x1.e0
    public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
    }

    @Override // x1.e0
    public /* synthetic */ void d(p3.a0 a0Var, int i10) {
        d0.b(this, a0Var, i10);
    }

    @Override // x1.e0
    public void e(n1 n1Var) {
    }

    @Override // x1.e0
    public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
        return d0.a(this, iVar, i10, z10);
    }
}
