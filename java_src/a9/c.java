package a9;

import a9.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f357a;

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(Future<T> future);
    }

    public c(int i10) {
        this.f357a = new ThreadPoolExecutor(i10, i10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.google.common.util.concurrent.h hVar, Callable callable) {
        if (hVar.isCancelled()) {
            return;
        }
        try {
            hVar.B(callable.call());
        } catch (Throwable th) {
            hVar.C(th);
        }
    }

    public <T> com.google.common.util.concurrent.d<T> e(final Callable<T> callable) {
        final com.google.common.util.concurrent.h D = com.google.common.util.concurrent.h.D();
        this.f357a.execute(new Runnable() { // from class: a9.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(com.google.common.util.concurrent.h.this, callable);
            }
        });
        return D;
    }

    public <T> void f(Callable<T> callable, final a<T> aVar) {
        final com.google.common.util.concurrent.d<T> e10 = e(callable);
        e10.b(new Runnable() { // from class: a9.a
            @Override // java.lang.Runnable
            public final void run() {
                c.a.this.a(e10);
            }
        }, d.a());
    }
}
