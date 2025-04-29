package io.grpc.internal;

import i9.g;
import i9.j1;
import i9.l;
import i9.r;
import i9.y0;
import i9.z0;
import io.grpc.internal.j1;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p<ReqT, RespT> extends i9.g<ReqT, RespT> {

    /* renamed from: t  reason: collision with root package name */
    private static final Logger f11508t = Logger.getLogger(p.class.getName());

    /* renamed from: u  reason: collision with root package name */
    private static final byte[] f11509u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v  reason: collision with root package name */
    private static final double f11510v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a  reason: collision with root package name */
    private final i9.z0<ReqT, RespT> f11511a;

    /* renamed from: b  reason: collision with root package name */
    private final r9.d f11512b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11513c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11514d;

    /* renamed from: e  reason: collision with root package name */
    private final m f11515e;

    /* renamed from: f  reason: collision with root package name */
    private final i9.r f11516f;

    /* renamed from: g  reason: collision with root package name */
    private volatile ScheduledFuture<?> f11517g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11518h;

    /* renamed from: i  reason: collision with root package name */
    private i9.c f11519i;

    /* renamed from: j  reason: collision with root package name */
    private q f11520j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f11521k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11522l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11523m;

    /* renamed from: n  reason: collision with root package name */
    private final e f11524n;

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f11526p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11527q;

    /* renamed from: o  reason: collision with root package name */
    private final p<ReqT, RespT>.f f11525o = new f();

    /* renamed from: r  reason: collision with root package name */
    private i9.v f11528r = i9.v.c();

    /* renamed from: s  reason: collision with root package name */
    private i9.o f11529s = i9.o.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends x {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.a f11530k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.a aVar) {
            super(p.this.f11516f);
            this.f11530k = aVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p pVar = p.this;
            pVar.r(this.f11530k, i9.s.a(pVar.f11516f), new i9.y0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends x {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ g.a f11532k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f11533l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g.a aVar, String str) {
            super(p.this.f11516f);
            this.f11532k = aVar;
            this.f11533l = str;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p.this.r(this.f11532k, i9.j1.f9937t.q(String.format("Unable to find compressor by name %s", this.f11533l)), new i9.y0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements r {

        /* renamed from: a  reason: collision with root package name */
        private final g.a<RespT> f11535a;

        /* renamed from: b  reason: collision with root package name */
        private i9.j1 f11536b;

        /* loaded from: classes.dex */
        final class a extends x {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r9.b f11538k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11539l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r9.b bVar, i9.y0 y0Var) {
                super(p.this.f11516f);
                this.f11538k = bVar;
                this.f11539l = y0Var;
            }

            private void b() {
                if (d.this.f11536b != null) {
                    return;
                }
                try {
                    d.this.f11535a.b(this.f11539l);
                } catch (Throwable th) {
                    d.this.i(i9.j1.f9924g.p(th).q("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                r9.c.g("ClientCall$Listener.headersRead", p.this.f11512b);
                r9.c.d(this.f11538k);
                try {
                    b();
                } finally {
                    r9.c.i("ClientCall$Listener.headersRead", p.this.f11512b);
                }
            }
        }

        /* loaded from: classes.dex */
        final class b extends x {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r9.b f11541k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ k2.a f11542l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(r9.b bVar, k2.a aVar) {
                super(p.this.f11516f);
                this.f11541k = bVar;
                this.f11542l = aVar;
            }

            private void b() {
                if (d.this.f11536b != null) {
                    r0.d(this.f11542l);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f11542l.next();
                        if (next == null) {
                            return;
                        }
                        d.this.f11535a.c(p.this.f11511a.i(next));
                        next.close();
                    } catch (Throwable th) {
                        r0.d(this.f11542l);
                        d.this.i(i9.j1.f9924g.p(th).q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                r9.c.g("ClientCall$Listener.messagesAvailable", p.this.f11512b);
                r9.c.d(this.f11541k);
                try {
                    b();
                } finally {
                    r9.c.i("ClientCall$Listener.messagesAvailable", p.this.f11512b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class c extends x {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r9.b f11544k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11545l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11546m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(r9.b bVar, i9.j1 j1Var, i9.y0 y0Var) {
                super(p.this.f11516f);
                this.f11544k = bVar;
                this.f11545l = j1Var;
                this.f11546m = y0Var;
            }

            private void b() {
                i9.j1 j1Var = this.f11545l;
                i9.y0 y0Var = this.f11546m;
                if (d.this.f11536b != null) {
                    j1Var = d.this.f11536b;
                    y0Var = new i9.y0();
                }
                p.this.f11521k = true;
                try {
                    d dVar = d.this;
                    p.this.r(dVar.f11535a, j1Var, y0Var);
                } finally {
                    p.this.y();
                    p.this.f11515e.a(j1Var.o());
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                r9.c.g("ClientCall$Listener.onClose", p.this.f11512b);
                r9.c.d(this.f11544k);
                try {
                    b();
                } finally {
                    r9.c.i("ClientCall$Listener.onClose", p.this.f11512b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        final class C0175d extends x {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r9.b f11548k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0175d(r9.b bVar) {
                super(p.this.f11516f);
                this.f11548k = bVar;
            }

            private void b() {
                if (d.this.f11536b != null) {
                    return;
                }
                try {
                    d.this.f11535a.d();
                } catch (Throwable th) {
                    d.this.i(i9.j1.f9924g.p(th).q("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                r9.c.g("ClientCall$Listener.onReady", p.this.f11512b);
                r9.c.d(this.f11548k);
                try {
                    b();
                } finally {
                    r9.c.i("ClientCall$Listener.onReady", p.this.f11512b);
                }
            }
        }

        public d(g.a<RespT> aVar) {
            this.f11535a = (g.a) b5.n.o(aVar, "observer");
        }

        private void h(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
            i9.t s10 = p.this.s();
            if (j1Var.m() == j1.b.CANCELLED && s10 != null && s10.n()) {
                x0 x0Var = new x0();
                p.this.f11520j.l(x0Var);
                i9.j1 j1Var2 = i9.j1.f9927j;
                j1Var = j1Var2.e("ClientCall was cancelled at or after deadline. " + x0Var);
                y0Var = new i9.y0();
            }
            p.this.f11513c.execute(new c(r9.c.e(), j1Var, y0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(i9.j1 j1Var) {
            this.f11536b = j1Var;
            p.this.f11520j.a(j1Var);
        }

        @Override // io.grpc.internal.k2
        public void a(k2.a aVar) {
            r9.c.g("ClientStreamListener.messagesAvailable", p.this.f11512b);
            try {
                p.this.f11513c.execute(new b(r9.c.e(), aVar));
            } finally {
                r9.c.i("ClientStreamListener.messagesAvailable", p.this.f11512b);
            }
        }

        @Override // io.grpc.internal.k2
        public void b() {
            if (p.this.f11511a.e().b()) {
                return;
            }
            r9.c.g("ClientStreamListener.onReady", p.this.f11512b);
            try {
                p.this.f11513c.execute(new C0175d(r9.c.e()));
            } finally {
                r9.c.i("ClientStreamListener.onReady", p.this.f11512b);
            }
        }

        @Override // io.grpc.internal.r
        public void c(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
            r9.c.g("ClientStreamListener.closed", p.this.f11512b);
            try {
                h(j1Var, aVar, y0Var);
            } finally {
                r9.c.i("ClientStreamListener.closed", p.this.f11512b);
            }
        }

        @Override // io.grpc.internal.r
        public void d(i9.y0 y0Var) {
            r9.c.g("ClientStreamListener.headersRead", p.this.f11512b);
            try {
                p.this.f11513c.execute(new a(r9.c.e(), y0Var));
            } finally {
                r9.c.i("ClientStreamListener.headersRead", p.this.f11512b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        q a(i9.z0<?, ?> z0Var, i9.c cVar, i9.y0 y0Var, i9.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class f implements r.a {
        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final long f11551j;

        g(long j10) {
            this.f11551j = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0 x0Var = new x0();
            p.this.f11520j.l(x0Var);
            long abs = Math.abs(this.f11551j);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f11551j) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f11551j < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            sb.append(x0Var);
            p.this.f11520j.a(i9.j1.f9927j.e(sb.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(i9.z0<ReqT, RespT> z0Var, Executor executor, i9.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, m mVar, i9.f0 f0Var) {
        this.f11511a = z0Var;
        r9.d b10 = r9.c.b(z0Var.c(), System.identityHashCode(this));
        this.f11512b = b10;
        boolean z10 = true;
        if (executor == com.google.common.util.concurrent.e.a()) {
            this.f11513c = new c2();
            this.f11514d = true;
        } else {
            this.f11513c = new d2(executor);
            this.f11514d = false;
        }
        this.f11515e = mVar;
        this.f11516f = i9.r.e();
        if (z0Var.e() != z0.d.UNARY && z0Var.e() != z0.d.SERVER_STREAMING) {
            z10 = false;
        }
        this.f11518h = z10;
        this.f11519i = cVar;
        this.f11524n = eVar;
        this.f11526p = scheduledExecutorService;
        r9.c.c("ClientCall.<init>", b10);
    }

    private ScheduledFuture<?> D(i9.t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long p10 = tVar.p(timeUnit);
        return this.f11526p.schedule(new d1(new g(p10)), p10, timeUnit);
    }

    private void E(g.a<RespT> aVar, i9.y0 y0Var) {
        i9.n nVar;
        b5.n.u(this.f11520j == null, "Already started");
        b5.n.u(!this.f11522l, "call was cancelled");
        b5.n.o(aVar, "observer");
        b5.n.o(y0Var, "headers");
        if (this.f11516f.h()) {
            this.f11520j = o1.f11494a;
            this.f11513c.execute(new b(aVar));
            return;
        }
        p();
        String b10 = this.f11519i.b();
        if (b10 != null) {
            nVar = this.f11529s.b(b10);
            if (nVar == null) {
                this.f11520j = o1.f11494a;
                this.f11513c.execute(new c(aVar, b10));
                return;
            }
        } else {
            nVar = l.b.f9973a;
        }
        x(y0Var, this.f11528r, nVar, this.f11527q);
        i9.t s10 = s();
        if (s10 != null && s10.n()) {
            this.f11520j = new f0(i9.j1.f9927j.q(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", u(this.f11519i.d(), this.f11516f.g()) ? "CallOptions" : "Context", Double.valueOf(s10.p(TimeUnit.NANOSECONDS) / f11510v))), r0.f(this.f11519i, y0Var, 0, false));
        } else {
            v(s10, this.f11516f.g(), this.f11519i.d());
            this.f11520j = this.f11524n.a(this.f11511a, this.f11519i, y0Var, this.f11516f);
        }
        if (this.f11514d) {
            this.f11520j.m();
        }
        if (this.f11519i.a() != null) {
            this.f11520j.k(this.f11519i.a());
        }
        if (this.f11519i.f() != null) {
            this.f11520j.e(this.f11519i.f().intValue());
        }
        if (this.f11519i.g() != null) {
            this.f11520j.f(this.f11519i.g().intValue());
        }
        if (s10 != null) {
            this.f11520j.h(s10);
        }
        this.f11520j.c(nVar);
        boolean z10 = this.f11527q;
        if (z10) {
            this.f11520j.q(z10);
        }
        this.f11520j.i(this.f11528r);
        this.f11515e.b();
        this.f11520j.g(new d(aVar));
        this.f11516f.a(this.f11525o, com.google.common.util.concurrent.e.a());
        if (s10 != null && !s10.equals(this.f11516f.g()) && this.f11526p != null) {
            this.f11517g = D(s10);
        }
        if (this.f11521k) {
            y();
        }
    }

    private void p() {
        j1.b bVar = (j1.b) this.f11519i.h(j1.b.f11392g);
        if (bVar == null) {
            return;
        }
        Long l10 = bVar.f11393a;
        if (l10 != null) {
            i9.t b10 = i9.t.b(l10.longValue(), TimeUnit.NANOSECONDS);
            i9.t d10 = this.f11519i.d();
            if (d10 == null || b10.compareTo(d10) < 0) {
                this.f11519i = this.f11519i.m(b10);
            }
        }
        Boolean bool = bVar.f11394b;
        if (bool != null) {
            this.f11519i = bool.booleanValue() ? this.f11519i.s() : this.f11519i.t();
        }
        if (bVar.f11395c != null) {
            Integer f10 = this.f11519i.f();
            this.f11519i = f10 != null ? this.f11519i.o(Math.min(f10.intValue(), bVar.f11395c.intValue())) : this.f11519i.o(bVar.f11395c.intValue());
        }
        if (bVar.f11396d != null) {
            Integer g10 = this.f11519i.g();
            this.f11519i = g10 != null ? this.f11519i.p(Math.min(g10.intValue(), bVar.f11396d.intValue())) : this.f11519i.p(bVar.f11396d.intValue());
        }
    }

    private void q(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f11508t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f11522l) {
            return;
        }
        this.f11522l = true;
        try {
            if (this.f11520j != null) {
                i9.j1 j1Var = i9.j1.f9924g;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                i9.j1 q10 = j1Var.q(str);
                if (th != null) {
                    q10 = q10.p(th);
                }
                this.f11520j.a(q10);
            }
        } finally {
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(g.a<RespT> aVar, i9.j1 j1Var, i9.y0 y0Var) {
        aVar.a(j1Var, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i9.t s() {
        return w(this.f11519i.d(), this.f11516f.g());
    }

    private void t() {
        b5.n.u(this.f11520j != null, "Not started");
        b5.n.u(!this.f11522l, "call was cancelled");
        b5.n.u(!this.f11523m, "call already half-closed");
        this.f11523m = true;
        this.f11520j.n();
    }

    private static boolean u(i9.t tVar, i9.t tVar2) {
        if (tVar == null) {
            return false;
        }
        if (tVar2 == null) {
            return true;
        }
        return tVar.l(tVar2);
    }

    private static void v(i9.t tVar, i9.t tVar2, i9.t tVar3) {
        Logger logger = f11508t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0L, tVar.p(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
            sb.append(tVar3 == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(tVar3.p(timeUnit))));
            logger.fine(sb.toString());
        }
    }

    private static i9.t w(i9.t tVar, i9.t tVar2) {
        return tVar == null ? tVar2 : tVar2 == null ? tVar : tVar.o(tVar2);
    }

    static void x(i9.y0 y0Var, i9.v vVar, i9.n nVar, boolean z10) {
        y0Var.e(r0.f11579i);
        y0.g<String> gVar = r0.f11575e;
        y0Var.e(gVar);
        if (nVar != l.b.f9973a) {
            y0Var.p(gVar, nVar.a());
        }
        y0.g<byte[]> gVar2 = r0.f11576f;
        y0Var.e(gVar2);
        byte[] a10 = i9.g0.a(vVar);
        if (a10.length != 0) {
            y0Var.p(gVar2, a10);
        }
        y0Var.e(r0.f11577g);
        y0.g<byte[]> gVar3 = r0.f11578h;
        y0Var.e(gVar3);
        if (z10) {
            y0Var.p(gVar3, f11509u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.f11516f.i(this.f11525o);
        ScheduledFuture<?> scheduledFuture = this.f11517g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void z(ReqT reqt) {
        b5.n.u(this.f11520j != null, "Not started");
        b5.n.u(!this.f11522l, "call was cancelled");
        b5.n.u(!this.f11523m, "call was half-closed");
        try {
            q qVar = this.f11520j;
            if (qVar instanceof z1) {
                ((z1) qVar).o0(reqt);
            } else {
                qVar.j(this.f11511a.j(reqt));
            }
            if (this.f11518h) {
                return;
            }
            this.f11520j.flush();
        } catch (Error e10) {
            this.f11520j.a(i9.j1.f9924g.q("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f11520j.a(i9.j1.f9924g.p(e11).q("Failed to stream message"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> A(i9.o oVar) {
        this.f11529s = oVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> B(i9.v vVar) {
        this.f11528r = vVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> C(boolean z10) {
        this.f11527q = z10;
        return this;
    }

    @Override // i9.g
    public void a(String str, Throwable th) {
        r9.c.g("ClientCall.cancel", this.f11512b);
        try {
            q(str, th);
        } finally {
            r9.c.i("ClientCall.cancel", this.f11512b);
        }
    }

    @Override // i9.g
    public void b() {
        r9.c.g("ClientCall.halfClose", this.f11512b);
        try {
            t();
        } finally {
            r9.c.i("ClientCall.halfClose", this.f11512b);
        }
    }

    @Override // i9.g
    public void c(int i10) {
        r9.c.g("ClientCall.request", this.f11512b);
        try {
            boolean z10 = true;
            b5.n.u(this.f11520j != null, "Not started");
            if (i10 < 0) {
                z10 = false;
            }
            b5.n.e(z10, "Number requested must be non-negative");
            this.f11520j.b(i10);
        } finally {
            r9.c.i("ClientCall.request", this.f11512b);
        }
    }

    @Override // i9.g
    public void d(ReqT reqt) {
        r9.c.g("ClientCall.sendMessage", this.f11512b);
        try {
            z(reqt);
        } finally {
            r9.c.i("ClientCall.sendMessage", this.f11512b);
        }
    }

    @Override // i9.g
    public void e(g.a<RespT> aVar, i9.y0 y0Var) {
        r9.c.g("ClientCall.start", this.f11512b);
        try {
            E(aVar, y0Var);
        } finally {
            r9.c.i("ClientCall.start", this.f11512b);
        }
    }

    public String toString() {
        return b5.h.c(this).d("method", this.f11511a).toString();
    }
}
