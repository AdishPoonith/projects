package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements l1.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f11184a;

    /* renamed from: b  reason: collision with root package name */
    private final l1.b f11185b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<InputStream> f11186c = new ArrayDeque();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11187j;

        a(int i10) {
            this.f11187j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f11185b.f(this.f11187j);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f11189j;

        b(boolean z10) {
            this.f11189j = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f11185b.e(this.f11189j);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Throwable f11191j;

        c(Throwable th) {
            this.f11191j = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f11185b.b(this.f11191j);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(Runnable runnable);
    }

    public g(l1.b bVar, d dVar) {
        this.f11185b = (l1.b) b5.n.o(bVar, "listener");
        this.f11184a = (d) b5.n.o(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.l1.b
    public void a(k2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            }
            this.f11186c.add(next);
        }
    }

    @Override // io.grpc.internal.l1.b
    public void b(Throwable th) {
        this.f11184a.c(new c(th));
    }

    public InputStream d() {
        return this.f11186c.poll();
    }

    @Override // io.grpc.internal.l1.b
    public void e(boolean z10) {
        this.f11184a.c(new b(z10));
    }

    @Override // io.grpc.internal.l1.b
    public void f(int i10) {
        this.f11184a.c(new a(i10));
    }
}
