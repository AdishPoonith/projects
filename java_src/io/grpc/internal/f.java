package io.grpc.internal;

import io.grpc.internal.g;
import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.Closeable;
import java.io.InputStream;
/* loaded from: classes.dex */
public class f implements y {

    /* renamed from: j  reason: collision with root package name */
    private final l1.b f11153j;

    /* renamed from: k  reason: collision with root package name */
    private final io.grpc.internal.g f11154k;

    /* renamed from: l  reason: collision with root package name */
    private final l1 f11155l;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11156j;

        a(int i10) {
            this.f11156j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f11155l.q()) {
                return;
            }
            try {
                f.this.f11155l.b(this.f11156j);
            } catch (Throwable th) {
                f.this.f11154k.b(th);
                f.this.f11155l.close();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v1 f11158j;

        b(v1 v1Var) {
            this.f11158j = v1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f11155l.k(this.f11158j);
            } catch (Throwable th) {
                f.this.f11154k.b(th);
                f.this.f11155l.close();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Closeable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v1 f11160j;

        c(v1 v1Var) {
            this.f11160j = v1Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11160j.close();
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f11155l.i();
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f11155l.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0173f extends g implements Closeable {

        /* renamed from: m  reason: collision with root package name */
        private final Closeable f11164m;

        public C0173f(Runnable runnable, Closeable closeable) {
            super(f.this, runnable, null);
            this.f11164m = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11164m.close();
        }
    }

    /* loaded from: classes.dex */
    private class g implements k2.a {

        /* renamed from: j  reason: collision with root package name */
        private final Runnable f11166j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f11167k;

        private g(Runnable runnable) {
            this.f11167k = false;
            this.f11166j = runnable;
        }

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f11167k) {
                return;
            }
            this.f11166j.run();
            this.f11167k = true;
        }

        @Override // io.grpc.internal.k2.a
        public InputStream next() {
            a();
            return f.this.f11154k.d();
        }
    }

    /* loaded from: classes.dex */
    interface h extends g.d {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l1.b bVar, h hVar, l1 l1Var) {
        h2 h2Var = new h2((l1.b) b5.n.o(bVar, "listener"));
        this.f11153j = h2Var;
        io.grpc.internal.g gVar = new io.grpc.internal.g(h2Var, hVar);
        this.f11154k = gVar;
        l1Var.z(gVar);
        this.f11155l = l1Var;
    }

    @Override // io.grpc.internal.y
    public void b(int i10) {
        this.f11153j.a(new g(this, new a(i10), null));
    }

    @Override // io.grpc.internal.y
    public void close() {
        this.f11155l.C();
        this.f11153j.a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.y
    public void e(int i10) {
        this.f11155l.e(i10);
    }

    @Override // io.grpc.internal.y
    public void h(i9.u uVar) {
        this.f11155l.h(uVar);
    }

    @Override // io.grpc.internal.y
    public void i() {
        this.f11153j.a(new g(this, new d(), null));
    }

    @Override // io.grpc.internal.y
    public void k(v1 v1Var) {
        this.f11153j.a(new C0173f(new b(v1Var), new c(v1Var)));
    }
}
