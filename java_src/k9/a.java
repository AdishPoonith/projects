package k9;

import io.grpc.internal.d2;
import java.io.IOException;
import java.net.Socket;
import k9.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements okio.m {

    /* renamed from: l  reason: collision with root package name */
    private final d2 f12626l;

    /* renamed from: m  reason: collision with root package name */
    private final b.a f12627m;

    /* renamed from: n  reason: collision with root package name */
    private final int f12628n;

    /* renamed from: r  reason: collision with root package name */
    private okio.m f12632r;

    /* renamed from: s  reason: collision with root package name */
    private Socket f12633s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f12634t;

    /* renamed from: u  reason: collision with root package name */
    private int f12635u;

    /* renamed from: v  reason: collision with root package name */
    private int f12636v;

    /* renamed from: j  reason: collision with root package name */
    private final Object f12624j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private final okio.c f12625k = new okio.c();

    /* renamed from: o  reason: collision with root package name */
    private boolean f12629o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12630p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12631q = false;

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0187a extends e {

        /* renamed from: k  reason: collision with root package name */
        final r9.b f12637k;

        C0187a() {
            super(a.this, null);
            this.f12637k = r9.c.e();
        }

        @Override // k9.a.e
        public void a() {
            int i10;
            r9.c.f("WriteRunnable.runWrite");
            r9.c.d(this.f12637k);
            okio.c cVar = new okio.c();
            try {
                synchronized (a.this.f12624j) {
                    cVar.j(a.this.f12625k, a.this.f12625k.r());
                    a.this.f12629o = false;
                    i10 = a.this.f12636v;
                }
                a.this.f12632r.j(cVar, cVar.b0());
                synchronized (a.this.f12624j) {
                    a.i(a.this, i10);
                }
            } finally {
                r9.c.h("WriteRunnable.runWrite");
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: k  reason: collision with root package name */
        final r9.b f12639k;

        b() {
            super(a.this, null);
            this.f12639k = r9.c.e();
        }

        @Override // k9.a.e
        public void a() {
            r9.c.f("WriteRunnable.runFlush");
            r9.c.d(this.f12639k);
            okio.c cVar = new okio.c();
            try {
                synchronized (a.this.f12624j) {
                    cVar.j(a.this.f12625k, a.this.f12625k.b0());
                    a.this.f12630p = false;
                }
                a.this.f12632r.j(cVar, cVar.b0());
                a.this.f12632r.flush();
            } finally {
                r9.c.h("WriteRunnable.runFlush");
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f12632r != null && a.this.f12625k.b0() > 0) {
                    a.this.f12632r.j(a.this.f12625k, a.this.f12625k.b0());
                }
            } catch (IOException e10) {
                a.this.f12627m.e(e10);
            }
            a.this.f12625k.close();
            try {
                if (a.this.f12632r != null) {
                    a.this.f12632r.close();
                }
            } catch (IOException e11) {
                a.this.f12627m.e(e11);
            }
            try {
                if (a.this.f12633s != null) {
                    a.this.f12633s.close();
                }
            } catch (IOException e12) {
                a.this.f12627m.e(e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends k9.c {
        public d(m9.c cVar) {
            super(cVar);
        }

        @Override // k9.c, m9.c
        public void F(m9.i iVar) {
            a.r(a.this);
            super.F(iVar);
        }

        @Override // k9.c, m9.c
        public void d(int i10, m9.a aVar) {
            a.r(a.this);
            super.d(i10, aVar);
        }

        @Override // k9.c, m9.c
        public void f(boolean z10, int i10, int i11) {
            if (z10) {
                a.r(a.this);
            }
            super.f(z10, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    private abstract class e implements Runnable {
        private e() {
        }

        /* synthetic */ e(a aVar, C0187a c0187a) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f12632r == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                a.this.f12627m.e(e10);
            }
        }
    }

    private a(d2 d2Var, b.a aVar, int i10) {
        this.f12626l = (d2) b5.n.o(d2Var, "executor");
        this.f12627m = (b.a) b5.n.o(aVar, "exceptionHandler");
        this.f12628n = i10;
    }

    static /* synthetic */ int i(a aVar, int i10) {
        int i11 = aVar.f12636v - i10;
        aVar.f12636v = i11;
        return i11;
    }

    static /* synthetic */ int r(a aVar) {
        int i10 = aVar.f12635u;
        aVar.f12635u = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a w(d2 d2Var, b.a aVar, int i10) {
        return new a(d2Var, aVar, i10);
    }

    @Override // okio.m, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12631q) {
            return;
        }
        this.f12631q = true;
        this.f12626l.execute(new c());
    }

    @Override // okio.m, java.io.Flushable
    public void flush() {
        if (this.f12631q) {
            throw new IOException("closed");
        }
        r9.c.f("AsyncSink.flush");
        try {
            synchronized (this.f12624j) {
                if (this.f12630p) {
                    return;
                }
                this.f12630p = true;
                this.f12626l.execute(new b());
            }
        } finally {
            r9.c.h("AsyncSink.flush");
        }
    }

    @Override // okio.m
    public void j(okio.c cVar, long j10) {
        b5.n.o(cVar, "source");
        if (this.f12631q) {
            throw new IOException("closed");
        }
        r9.c.f("AsyncSink.write");
        try {
            synchronized (this.f12624j) {
                this.f12625k.j(cVar, j10);
                int i10 = this.f12636v + this.f12635u;
                this.f12636v = i10;
                boolean z10 = false;
                this.f12635u = 0;
                if (this.f12634t || i10 <= this.f12628n) {
                    if (!this.f12629o && !this.f12630p && this.f12625k.r() > 0) {
                        this.f12629o = true;
                    }
                }
                this.f12634t = true;
                z10 = true;
                if (!z10) {
                    this.f12626l.execute(new C0187a());
                    return;
                }
                try {
                    this.f12633s.close();
                } catch (IOException e10) {
                    this.f12627m.e(e10);
                }
            }
        } finally {
            r9.c.h("AsyncSink.write");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(okio.m mVar, Socket socket) {
        b5.n.u(this.f12632r == null, "AsyncSink's becomeConnected should only be called once.");
        this.f12632r = (okio.m) b5.n.o(mVar, "sink");
        this.f12633s = (Socket) b5.n.o(socket, "socket");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9.c v(m9.c cVar) {
        return new d(cVar);
    }
}
