package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.e0;
import la.g0;
import la.m1;
/* loaded from: classes.dex */
public final class b extends m1 implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public static final b f12954m = new b();

    /* renamed from: n  reason: collision with root package name */
    private static final g0 f12955n;

    static {
        int a10;
        int d10;
        m mVar = m.f12974l;
        a10 = ha.i.a(64, c0.a());
        d10 = e0.d("kotlinx.coroutines.io.parallelism", a10, 0, 0, 12, null);
        f12955n = mVar.j0(d10);
    }

    private b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h0(v9.h.f19537j, runnable);
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        f12955n.h0(gVar, runnable);
    }

    @Override // la.g0
    public String toString() {
        return "Dispatchers.IO";
    }
}
