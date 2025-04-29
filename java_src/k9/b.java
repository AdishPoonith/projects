package k9;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k9.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements m9.c {

    /* renamed from: m  reason: collision with root package name */
    private static final Logger f12644m = Logger.getLogger(i.class.getName());

    /* renamed from: j  reason: collision with root package name */
    private final a f12645j;

    /* renamed from: k  reason: collision with root package name */
    private final m9.c f12646k;

    /* renamed from: l  reason: collision with root package name */
    private final j f12647l = new j(Level.FINE, i.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void e(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, m9.c cVar) {
        this.f12645j = (a) b5.n.o(aVar, "transportExceptionHandler");
        this.f12646k = (m9.c) b5.n.o(cVar, "frameWriter");
    }

    static Level a(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // m9.c
    public void E() {
        try {
            this.f12646k.E();
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void F(m9.i iVar) {
        this.f12647l.j(j.a.OUTBOUND);
        try {
            this.f12646k.F(iVar);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void I(m9.i iVar) {
        this.f12647l.i(j.a.OUTBOUND, iVar);
        try {
            this.f12646k.I(iVar);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void K(boolean z10, int i10, okio.c cVar, int i11) {
        this.f12647l.b(j.a.OUTBOUND, i10, cVar.a(), i11, z10);
        try {
            this.f12646k.K(z10, i10, cVar, i11);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void R(int i10, m9.a aVar, byte[] bArr) {
        this.f12647l.c(j.a.OUTBOUND, i10, aVar, okio.f.n(bArr));
        try {
            this.f12646k.R(i10, aVar, bArr);
            this.f12646k.flush();
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public int V() {
        return this.f12646k.V();
    }

    @Override // m9.c
    public void X(boolean z10, boolean z11, int i10, int i11, List<m9.d> list) {
        try {
            this.f12646k.X(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f12646k.close();
        } catch (IOException e10) {
            f12644m.log(a(e10), "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // m9.c
    public void d(int i10, m9.a aVar) {
        this.f12647l.h(j.a.OUTBOUND, i10, aVar);
        try {
            this.f12646k.d(i10, aVar);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void f(boolean z10, int i10, int i11) {
        j jVar = this.f12647l;
        j.a aVar = j.a.OUTBOUND;
        long j10 = (4294967295L & i11) | (i10 << 32);
        if (z10) {
            jVar.f(aVar, j10);
        } else {
            jVar.e(aVar, j10);
        }
        try {
            this.f12646k.f(z10, i10, i11);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void flush() {
        try {
            this.f12646k.flush();
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }

    @Override // m9.c
    public void g(int i10, long j10) {
        this.f12647l.k(j.a.OUTBOUND, i10, j10);
        try {
            this.f12646k.g(i10, j10);
        } catch (IOException e10) {
            this.f12645j.e(e10);
        }
    }
}
