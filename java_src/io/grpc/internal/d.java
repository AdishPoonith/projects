package io.grpc.internal;

import i9.l;
import io.grpc.internal.f;
import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class d implements j2 {

    /* loaded from: classes.dex */
    public static abstract class a implements f.h, l1.b {

        /* renamed from: a  reason: collision with root package name */
        private y f11124a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f11125b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final i2 f11126c;

        /* renamed from: d  reason: collision with root package name */
        private final o2 f11127d;

        /* renamed from: e  reason: collision with root package name */
        private final l1 f11128e;

        /* renamed from: f  reason: collision with root package name */
        private int f11129f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f11130g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f11131h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0172a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ r9.b f11132j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f11133k;

            RunnableC0172a(r9.b bVar, int i10) {
                this.f11132j = bVar;
                this.f11133k = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                r9.c.f("AbstractStream.request");
                r9.c.d(this.f11132j);
                try {
                    a.this.f11124a.b(this.f11133k);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i10, i2 i2Var, o2 o2Var) {
            this.f11126c = (i2) b5.n.o(i2Var, "statsTraceCtx");
            this.f11127d = (o2) b5.n.o(o2Var, "transportTracer");
            l1 l1Var = new l1(this, l.b.f9973a, i10, i2Var, o2Var);
            this.f11128e = l1Var;
            this.f11124a = l1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n() {
            boolean z10;
            synchronized (this.f11125b) {
                z10 = this.f11130g && this.f11129f < 32768 && !this.f11131h;
            }
            return z10;
        }

        private void p() {
            boolean n10;
            synchronized (this.f11125b) {
                n10 = n();
            }
            if (n10) {
                o().b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(int i10) {
            synchronized (this.f11125b) {
                this.f11129f += i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i10) {
            c(new RunnableC0172a(r9.c.e(), i10));
        }

        @Override // io.grpc.internal.l1.b
        public void a(k2.a aVar) {
            o().a(aVar);
        }

        public final void d(int i10) {
            boolean z10;
            synchronized (this.f11125b) {
                b5.n.u(this.f11130g, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f11129f;
                z10 = true;
                boolean z11 = i11 < 32768;
                int i12 = i11 - i10;
                this.f11129f = i12;
                boolean z12 = i12 < 32768;
                if (z11 || !z12) {
                    z10 = false;
                }
            }
            if (z10) {
                p();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void k(boolean z10) {
            if (z10) {
                this.f11124a.close();
            } else {
                this.f11124a.i();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void l(v1 v1Var) {
            try {
                this.f11124a.k(v1Var);
            } catch (Throwable th) {
                b(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o2 m() {
            return this.f11127d;
        }

        protected abstract k2 o();

        /* JADX INFO: Access modifiers changed from: protected */
        public void r() {
            b5.n.t(o() != null);
            synchronized (this.f11125b) {
                b5.n.u(this.f11130g ? false : true, "Already allocated");
                this.f11130g = true;
            }
            p();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            synchronized (this.f11125b) {
                this.f11131h = true;
            }
        }

        final void t() {
            this.f11128e.z(this);
            this.f11124a = this.f11128e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void v(i9.u uVar) {
            this.f11124a.h(uVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void w(s0 s0Var) {
            this.f11128e.y(s0Var);
            this.f11124a = new f(this, this, this.f11128e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void x(int i10) {
            this.f11124a.e(i10);
        }
    }

    @Override // io.grpc.internal.j2
    public final void b(int i10) {
        u().u(i10);
    }

    @Override // io.grpc.internal.j2
    public final void c(i9.n nVar) {
        s().c((i9.n) b5.n.o(nVar, "compressor"));
    }

    @Override // io.grpc.internal.j2
    public boolean d() {
        return u().n();
    }

    @Override // io.grpc.internal.j2
    public final void flush() {
        if (s().d()) {
            return;
        }
        s().flush();
    }

    @Override // io.grpc.internal.j2
    public final void j(InputStream inputStream) {
        b5.n.o(inputStream, "message");
        try {
            if (!s().d()) {
                s().e(inputStream);
            }
        } finally {
            r0.e(inputStream);
        }
    }

    @Override // io.grpc.internal.j2
    public void m() {
        u().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        s().close();
    }

    protected abstract p0 s();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(int i10) {
        u().q(i10);
    }

    protected abstract a u();
}
