package k9;

import java.util.List;
/* loaded from: classes.dex */
abstract class c implements m9.c {

    /* renamed from: j  reason: collision with root package name */
    private final m9.c f12648j;

    public c(m9.c cVar) {
        this.f12648j = (m9.c) b5.n.o(cVar, "delegate");
    }

    @Override // m9.c
    public void E() {
        this.f12648j.E();
    }

    @Override // m9.c
    public void F(m9.i iVar) {
        this.f12648j.F(iVar);
    }

    @Override // m9.c
    public void I(m9.i iVar) {
        this.f12648j.I(iVar);
    }

    @Override // m9.c
    public void K(boolean z10, int i10, okio.c cVar, int i11) {
        this.f12648j.K(z10, i10, cVar, i11);
    }

    @Override // m9.c
    public void R(int i10, m9.a aVar, byte[] bArr) {
        this.f12648j.R(i10, aVar, bArr);
    }

    @Override // m9.c
    public int V() {
        return this.f12648j.V();
    }

    @Override // m9.c
    public void X(boolean z10, boolean z11, int i10, int i11, List<m9.d> list) {
        this.f12648j.X(z10, z11, i10, i11, list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12648j.close();
    }

    @Override // m9.c
    public void d(int i10, m9.a aVar) {
        this.f12648j.d(i10, aVar);
    }

    @Override // m9.c
    public void f(boolean z10, int i10, int i11) {
        this.f12648j.f(z10, i10, i11);
    }

    @Override // m9.c
    public void flush() {
        this.f12648j.flush();
    }

    @Override // m9.c
    public void g(int i10, long j10) {
        this.f12648j.g(i10, j10);
    }
}
