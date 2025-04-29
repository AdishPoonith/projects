package k9;

import b5.t;
import i9.b0;
import i9.c0;
import i9.d0;
import i9.h1;
import i9.j0;
import i9.j1;
import i9.y0;
import i9.z0;
import io.grpc.internal.c1;
import io.grpc.internal.d2;
import io.grpc.internal.i2;
import io.grpc.internal.k1;
import io.grpc.internal.o2;
import io.grpc.internal.q0;
import io.grpc.internal.r;
import io.grpc.internal.r0;
import io.grpc.internal.s;
import io.grpc.internal.v;
import io.grpc.internal.v0;
import io.grpc.internal.w0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k9.b;
import k9.f;
import k9.h;
import k9.j;
import k9.q;
import m9.b;
import n9.a;
import n9.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i implements v, b.a, q.d {
    private static final Map<m9.a, j1> W = Q();
    private static final Logger X = Logger.getLogger(i.class.getName());
    private final SocketFactory A;
    private SSLSocketFactory B;
    private HostnameVerifier C;
    private Socket D;
    private int E;
    private final Deque<h> F;
    private final l9.b G;
    private c1 H;
    private boolean I;
    private long J;
    private long K;
    private boolean L;
    private final Runnable M;
    private final int N;
    private final boolean O;
    private final o2 P;
    private final w0<h> Q;
    private d0.b R;
    final c0 S;
    int T;
    Runnable U;
    com.google.common.util.concurrent.h<Void> V;

    /* renamed from: a  reason: collision with root package name */
    private final InetSocketAddress f12718a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12719b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12720c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f12721d;

    /* renamed from: e  reason: collision with root package name */
    private final t<b5.r> f12722e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12723f;

    /* renamed from: g  reason: collision with root package name */
    private final m9.j f12724g;

    /* renamed from: h  reason: collision with root package name */
    private k1.a f12725h;

    /* renamed from: i  reason: collision with root package name */
    private k9.b f12726i;

    /* renamed from: j  reason: collision with root package name */
    private q f12727j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f12728k;

    /* renamed from: l  reason: collision with root package name */
    private final j0 f12729l;

    /* renamed from: m  reason: collision with root package name */
    private int f12730m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<Integer, h> f12731n;

    /* renamed from: o  reason: collision with root package name */
    private final Executor f12732o;

    /* renamed from: p  reason: collision with root package name */
    private final d2 f12733p;

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f12734q;

    /* renamed from: r  reason: collision with root package name */
    private final int f12735r;

    /* renamed from: s  reason: collision with root package name */
    private int f12736s;

    /* renamed from: t  reason: collision with root package name */
    private e f12737t;

    /* renamed from: u  reason: collision with root package name */
    private i9.a f12738u;

    /* renamed from: v  reason: collision with root package name */
    private j1 f12739v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12740w;

    /* renamed from: x  reason: collision with root package name */
    private v0 f12741x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12742y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12743z;

    /* loaded from: classes.dex */
    class a extends w0<h> {
        a() {
        }

        @Override // io.grpc.internal.w0
        protected void b() {
            i.this.f12725h.c(true);
        }

        @Override // io.grpc.internal.w0
        protected void c() {
            i.this.f12725h.c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o2.c {
        b() {
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f12746j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k9.a f12747k;

        /* loaded from: classes.dex */
        class a implements okio.n {
            a() {
            }

            @Override // okio.n
            public long Q(okio.c cVar, long j10) {
                return -1L;
            }

            @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }

        c(CountDownLatch countDownLatch, k9.a aVar) {
            this.f12746j = countDownLatch;
            this.f12747k = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar;
            e eVar;
            Socket S;
            try {
                this.f12746j.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            okio.e b10 = okio.g.b(new a());
            SSLSession sSLSession = null;
            try {
                try {
                    i iVar2 = i.this;
                    c0 c0Var = iVar2.S;
                    if (c0Var == null) {
                        S = iVar2.A.createSocket(i.this.f12718a.getAddress(), i.this.f12718a.getPort());
                    } else if (!(c0Var.b() instanceof InetSocketAddress)) {
                        j1 j1Var = j1.f9937t;
                        throw j1Var.q("Unsupported SocketAddress implementation " + i.this.S.b().getClass()).c();
                    } else {
                        i iVar3 = i.this;
                        S = iVar3.S(iVar3.S.c(), (InetSocketAddress) i.this.S.b(), i.this.S.d(), i.this.S.a());
                    }
                    Socket socket = S;
                    SSLSocket sSLSocket = socket;
                    if (i.this.B != null) {
                        SSLSocket b11 = n.b(i.this.B, i.this.C, socket, i.this.W(), i.this.X(), i.this.G);
                        sSLSession = b11.getSession();
                        sSLSocket = b11;
                    }
                    sSLSocket.setTcpNoDelay(true);
                    okio.e b12 = okio.g.b(okio.g.g(sSLSocket));
                    this.f12747k.t(okio.g.e(sSLSocket), sSLSocket);
                    i iVar4 = i.this;
                    iVar4.f12738u = iVar4.f12738u.d().d(b0.f9831a, sSLSocket.getRemoteSocketAddress()).d(b0.f9832b, sSLSocket.getLocalSocketAddress()).d(b0.f9833c, sSLSession).d(q0.f11553a, sSLSession == null ? h1.NONE : h1.PRIVACY_AND_INTEGRITY).a();
                    i iVar5 = i.this;
                    iVar5.f12737t = new e(iVar5.f12724g.a(b12, true));
                    synchronized (i.this.f12728k) {
                        i.this.D = (Socket) b5.n.o(sSLSocket, "socket");
                        if (sSLSession != null) {
                            i.this.R = new d0.b(new d0.c(sSLSession));
                        }
                    }
                } catch (i9.k1 e10) {
                    i.this.k0(0, m9.a.INTERNAL_ERROR, e10.a());
                    iVar = i.this;
                    eVar = new e(iVar.f12724g.a(b10, true));
                    iVar.f12737t = eVar;
                } catch (Exception e11) {
                    i.this.e(e11);
                    iVar = i.this;
                    eVar = new e(iVar.f12724g.a(b10, true));
                    iVar.f12737t = eVar;
                }
            } catch (Throwable th) {
                i iVar6 = i.this;
                iVar6.f12737t = new e(iVar6.f12724g.a(b10, true));
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = i.this.U;
            if (runnable != null) {
                runnable.run();
            }
            i.this.f12732o.execute(i.this.f12737t);
            synchronized (i.this.f12728k) {
                i.this.E = Integer.MAX_VALUE;
                i.this.l0();
            }
            com.google.common.util.concurrent.h<Void> hVar = i.this.V;
            if (hVar != null) {
                hVar.B(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements b.a, Runnable {

        /* renamed from: k  reason: collision with root package name */
        m9.b f12752k;

        /* renamed from: j  reason: collision with root package name */
        private final j f12751j = new j(Level.FINE, i.class);

        /* renamed from: l  reason: collision with root package name */
        boolean f12753l = true;

        e(m9.b bVar) {
            this.f12752k = bVar;
        }

        private int a(List<m9.d> list) {
            long j10 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                m9.d dVar = list.get(i10);
                j10 += dVar.f13897a.r() + 32 + dVar.f13898b.r();
            }
            return (int) Math.min(j10, 2147483647L);
        }

        @Override // m9.b.a
        public void d(int i10, m9.a aVar) {
            this.f12751j.h(j.a.INBOUND, i10, aVar);
            j1 e10 = i.p0(aVar).e("Rst Stream");
            boolean z10 = e10.m() == j1.b.CANCELLED || e10.m() == j1.b.DEADLINE_EXCEEDED;
            synchronized (i.this.f12728k) {
                h hVar = (h) i.this.f12731n.get(Integer.valueOf(i10));
                if (hVar != null) {
                    r9.c.c("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.z().h0());
                    i.this.U(i10, e10, aVar == m9.a.REFUSED_STREAM ? r.a.REFUSED : r.a.PROCESSED, z10, null, null);
                }
            }
        }

        @Override // m9.b.a
        public void f(boolean z10, int i10, int i11) {
            v0 v0Var;
            long j10 = (i10 << 32) | (i11 & 4294967295L);
            this.f12751j.e(j.a.INBOUND, j10);
            if (!z10) {
                synchronized (i.this.f12728k) {
                    i.this.f12726i.f(true, i10, i11);
                }
                return;
            }
            synchronized (i.this.f12728k) {
                v0Var = null;
                if (i.this.f12741x == null) {
                    i.X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (i.this.f12741x.h() == j10) {
                    v0 v0Var2 = i.this.f12741x;
                    i.this.f12741x = null;
                    v0Var = v0Var2;
                } else {
                    i.X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(i.this.f12741x.h()), Long.valueOf(j10)));
                }
            }
            if (v0Var != null) {
                v0Var.d();
            }
        }

        @Override // m9.b.a
        public void g(int i10, long j10) {
            this.f12751j.k(j.a.INBOUND, i10, j10);
            if (j10 == 0) {
                if (i10 == 0) {
                    i.this.f0(m9.a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    i.this.U(i10, j1.f9937t.q("Received 0 flow control window increment."), r.a.PROCESSED, false, m9.a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            boolean z10 = false;
            synchronized (i.this.f12728k) {
                if (i10 == 0) {
                    i.this.f12727j.g(null, (int) j10);
                    return;
                }
                h hVar = (h) i.this.f12731n.get(Integer.valueOf(i10));
                if (hVar != null) {
                    i.this.f12727j.g(hVar.z().b0(), (int) j10);
                } else if (!i.this.c0(i10)) {
                    z10 = true;
                }
                if (z10) {
                    i iVar = i.this;
                    m9.a aVar = m9.a.PROTOCOL_ERROR;
                    iVar.f0(aVar, "Received window_update for unknown stream: " + i10);
                }
            }
        }

        @Override // m9.b.a
        public void h() {
        }

        @Override // m9.b.a
        public void i(boolean z10, boolean z11, int i10, int i11, List<m9.d> list, m9.e eVar) {
            j1 j1Var;
            int a10;
            this.f12751j.d(j.a.INBOUND, i10, list, z11);
            boolean z12 = true;
            if (i.this.N == Integer.MAX_VALUE || (a10 = a(list)) <= i.this.N) {
                j1Var = null;
            } else {
                j1 j1Var2 = j1.f9932o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z11 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(i.this.N);
                objArr[2] = Integer.valueOf(a10);
                j1Var = j1Var2.q(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (i.this.f12728k) {
                h hVar = (h) i.this.f12731n.get(Integer.valueOf(i10));
                if (hVar == null) {
                    if (i.this.c0(i10)) {
                        i.this.f12726i.d(i10, m9.a.STREAM_CLOSED);
                    }
                } else if (j1Var == null) {
                    r9.c.c("OkHttpClientTransport$ClientFrameHandler.headers", hVar.z().h0());
                    hVar.z().j0(list, z11);
                } else {
                    if (!z11) {
                        i.this.f12726i.d(i10, m9.a.CANCEL);
                    }
                    hVar.z().N(j1Var, false, new y0());
                }
                z12 = false;
            }
            if (z12) {
                i iVar = i.this;
                m9.a aVar = m9.a.PROTOCOL_ERROR;
                iVar.f0(aVar, "Received header for unknown stream: " + i10);
            }
        }

        @Override // m9.b.a
        public void j(boolean z10, int i10, okio.e eVar, int i11) {
            this.f12751j.b(j.a.INBOUND, i10, eVar.A(), i11, z10);
            h Z = i.this.Z(i10);
            if (Z != null) {
                long j10 = i11;
                eVar.Y(j10);
                okio.c cVar = new okio.c();
                cVar.j(eVar.A(), j10);
                r9.c.c("OkHttpClientTransport$ClientFrameHandler.data", Z.z().h0());
                synchronized (i.this.f12728k) {
                    Z.z().i0(cVar, z10);
                }
            } else if (!i.this.c0(i10)) {
                i.this.f0(m9.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i10);
                return;
            } else {
                synchronized (i.this.f12728k) {
                    i.this.f12726i.d(i10, m9.a.STREAM_CLOSED);
                }
                eVar.skip(i11);
            }
            i.D(i.this, i11);
            if (i.this.f12736s >= i.this.f12723f * 0.5f) {
                synchronized (i.this.f12728k) {
                    i.this.f12726i.g(0, i.this.f12736s);
                }
                i.this.f12736s = 0;
            }
        }

        @Override // m9.b.a
        public void k(int i10, int i11, int i12, boolean z10) {
        }

        @Override // m9.b.a
        public void l(int i10, m9.a aVar, okio.f fVar) {
            this.f12751j.c(j.a.INBOUND, i10, aVar, fVar);
            if (aVar == m9.a.ENHANCE_YOUR_CALM) {
                String w10 = fVar.w();
                i.X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, w10));
                if ("too_many_pings".equals(w10)) {
                    i.this.M.run();
                }
            }
            j1 e10 = r0.h.k(aVar.f13887j).e("Received Goaway");
            if (fVar.r() > 0) {
                e10 = e10.e(fVar.w());
            }
            i.this.k0(i10, null, e10);
        }

        @Override // m9.b.a
        public void m(boolean z10, m9.i iVar) {
            boolean z11;
            this.f12751j.i(j.a.INBOUND, iVar);
            synchronized (i.this.f12728k) {
                if (m.b(iVar, 4)) {
                    i.this.E = m.a(iVar, 4);
                }
                if (m.b(iVar, 7)) {
                    z11 = i.this.f12727j.f(m.a(iVar, 7));
                } else {
                    z11 = false;
                }
                if (this.f12753l) {
                    i.this.f12725h.d();
                    this.f12753l = false;
                }
                i.this.f12726i.F(iVar);
                if (z11) {
                    i.this.f12727j.h();
                }
                i.this.l0();
            }
        }

        @Override // m9.b.a
        public void n(int i10, int i11, List<m9.d> list) {
            this.f12751j.g(j.a.INBOUND, i10, i11, list);
            synchronized (i.this.f12728k) {
                i.this.f12726i.d(i10, m9.a.PROTOCOL_ERROR);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            j1 j1Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f12752k.M(this)) {
                try {
                    if (i.this.H != null) {
                        i.this.H.m();
                    }
                } catch (Throwable th) {
                    try {
                        i.this.k0(0, m9.a.PROTOCOL_ERROR, j1.f9937t.q("error in frame handler").p(th));
                        try {
                            this.f12752k.close();
                        } catch (IOException e10) {
                            e = e10;
                            i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            i.this.f12725h.a();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f12752k.close();
                        } catch (IOException e11) {
                            i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                        }
                        i.this.f12725h.a();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (i.this.f12728k) {
                j1Var = i.this.f12739v;
            }
            if (j1Var == null) {
                j1Var = j1.f9938u.q("End of stream or IOException");
            }
            i.this.k0(0, m9.a.INTERNAL_ERROR, j1Var);
            try {
                this.f12752k.close();
            } catch (IOException e12) {
                e = e12;
                i.X.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                i.this.f12725h.a();
                Thread.currentThread().setName(name);
            }
            i.this.f12725h.a();
            Thread.currentThread().setName(name);
        }
    }

    private i(f.C0188f c0188f, InetSocketAddress inetSocketAddress, String str, String str2, i9.a aVar, t<b5.r> tVar, m9.j jVar, c0 c0Var, Runnable runnable) {
        this.f12721d = new Random();
        this.f12728k = new Object();
        this.f12731n = new HashMap();
        this.E = 0;
        this.F = new LinkedList();
        this.Q = new a();
        this.T = 30000;
        this.f12718a = (InetSocketAddress) b5.n.o(inetSocketAddress, "address");
        this.f12719b = str;
        this.f12735r = c0188f.f12696s;
        this.f12723f = c0188f.f12701x;
        this.f12732o = (Executor) b5.n.o(c0188f.f12688k, "executor");
        this.f12733p = new d2(c0188f.f12688k);
        this.f12734q = (ScheduledExecutorService) b5.n.o(c0188f.f12690m, "scheduledExecutorService");
        this.f12730m = 3;
        SocketFactory socketFactory = c0188f.f12692o;
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = c0188f.f12693p;
        this.C = c0188f.f12694q;
        this.G = (l9.b) b5.n.o(c0188f.f12695r, "connectionSpec");
        this.f12722e = (t) b5.n.o(tVar, "stopwatchFactory");
        this.f12724g = (m9.j) b5.n.o(jVar, "variant");
        this.f12720c = r0.g("okhttp", str2);
        this.S = c0Var;
        this.M = (Runnable) b5.n.o(runnable, "tooManyPingsRunnable");
        this.N = c0188f.f12703z;
        this.P = c0188f.f12691n.a();
        this.f12729l = j0.a(getClass(), inetSocketAddress.toString());
        this.f12738u = i9.a.c().d(q0.f11554b, aVar).a();
        this.O = c0188f.A;
        a0();
    }

    public i(f.C0188f c0188f, InetSocketAddress inetSocketAddress, String str, String str2, i9.a aVar, c0 c0Var, Runnable runnable) {
        this(c0188f, inetSocketAddress, str, str2, aVar, r0.f11593w, new m9.g(), c0Var, runnable);
    }

    static /* synthetic */ int D(i iVar, int i10) {
        int i11 = iVar.f12736s + i10;
        iVar.f12736s = i11;
        return i11;
    }

    private static Map<m9.a, j1> Q() {
        EnumMap enumMap = new EnumMap(m9.a.class);
        m9.a aVar = m9.a.NO_ERROR;
        j1 j1Var = j1.f9937t;
        enumMap.put((EnumMap) aVar, (m9.a) j1Var.q("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) m9.a.PROTOCOL_ERROR, (m9.a) j1Var.q("Protocol error"));
        enumMap.put((EnumMap) m9.a.INTERNAL_ERROR, (m9.a) j1Var.q("Internal error"));
        enumMap.put((EnumMap) m9.a.FLOW_CONTROL_ERROR, (m9.a) j1Var.q("Flow control error"));
        enumMap.put((EnumMap) m9.a.STREAM_CLOSED, (m9.a) j1Var.q("Stream closed"));
        enumMap.put((EnumMap) m9.a.FRAME_TOO_LARGE, (m9.a) j1Var.q("Frame too large"));
        enumMap.put((EnumMap) m9.a.REFUSED_STREAM, (m9.a) j1.f9938u.q("Refused stream"));
        enumMap.put((EnumMap) m9.a.CANCEL, (m9.a) j1.f9924g.q("Cancelled"));
        enumMap.put((EnumMap) m9.a.COMPRESSION_ERROR, (m9.a) j1Var.q("Compression error"));
        enumMap.put((EnumMap) m9.a.CONNECT_ERROR, (m9.a) j1Var.q("Connect error"));
        enumMap.put((EnumMap) m9.a.ENHANCE_YOUR_CALM, (m9.a) j1.f9932o.q("Enhance your calm"));
        enumMap.put((EnumMap) m9.a.INADEQUATE_SECURITY, (m9.a) j1.f9930m.q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private n9.b R(InetSocketAddress inetSocketAddress, String str, String str2) {
        n9.a a10 = new a.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0210b e10 = new b.C0210b().e(a10);
        b.C0210b d10 = e10.d("Host", a10.c() + ":" + a10.f()).d("User-Agent", this.f12720c);
        if (str != null && str2 != null) {
            d10.d("Proxy-Authorization", l9.c.a(str, str2));
        }
        return d10.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket socket = null;
        try {
            socket = inetSocketAddress2.getAddress() != null ? this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(this.T);
            okio.n g10 = okio.g.g(socket);
            okio.d a10 = okio.g.a(okio.g.e(socket));
            n9.b R = R(inetSocketAddress, str, str2);
            n9.a b10 = R.b();
            a10.a0(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", b10.c(), Integer.valueOf(b10.f()))).a0("\r\n");
            int b11 = R.a().b();
            for (int i10 = 0; i10 < b11; i10++) {
                a10.a0(R.a().a(i10)).a0(": ").a0(R.a().c(i10)).a0("\r\n");
            }
            a10.a0("\r\n");
            a10.flush();
            l9.j a11 = l9.j.a(g0(g10));
            while (!g0(g10).equals("")) {
            }
            int i11 = a11.f13562b;
            if (i11 >= 200 && i11 < 300) {
                socket.setSoTimeout(0);
                return socket;
            }
            okio.c cVar = new okio.c();
            try {
                socket.shutdownOutput();
                g10.Q(cVar, 1024L);
            } catch (IOException e10) {
                cVar.a0("Unable to read body: " + e10.toString());
            }
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw j1.f9938u.q(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a11.f13562b), a11.f13563c, cVar.L())).c();
        } catch (IOException e11) {
            if (socket != null) {
                r0.e(socket);
            }
            throw j1.f9938u.q("Failed trying to connect with proxy").p(e11).c();
        }
    }

    private Throwable Y() {
        synchronized (this.f12728k) {
            j1 j1Var = this.f12739v;
            if (j1Var != null) {
                return j1Var.c();
            }
            return j1.f9938u.q("Connection closed").c();
        }
    }

    private void a0() {
        synchronized (this.f12728k) {
            this.P.g(new b());
        }
    }

    private void d0(h hVar) {
        if (this.f12743z && this.F.isEmpty() && this.f12731n.isEmpty()) {
            this.f12743z = false;
            c1 c1Var = this.H;
            if (c1Var != null) {
                c1Var.o();
            }
        }
        if (hVar.y()) {
            this.Q.e(hVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(m9.a aVar, String str) {
        k0(0, aVar, p0(aVar).e(str));
    }

    private static String g0(okio.n nVar) {
        okio.c cVar = new okio.c();
        while (nVar.Q(cVar, 1L) != -1) {
            if (cVar.v(cVar.b0() - 1) == 10) {
                return cVar.T();
            }
        }
        throw new EOFException("\\n not found: " + cVar.z().l());
    }

    private void i0() {
        synchronized (this.f12728k) {
            this.f12726i.E();
            m9.i iVar = new m9.i();
            m.c(iVar, 7, this.f12723f);
            this.f12726i.I(iVar);
            int i10 = this.f12723f;
            if (i10 > 65535) {
                this.f12726i.g(0, i10 - 65535);
            }
        }
    }

    private void j0(h hVar) {
        if (!this.f12743z) {
            this.f12743z = true;
            c1 c1Var = this.H;
            if (c1Var != null) {
                c1Var.n();
            }
        }
        if (hVar.y()) {
            this.Q.e(hVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i10, m9.a aVar, j1 j1Var) {
        synchronized (this.f12728k) {
            if (this.f12739v == null) {
                this.f12739v = j1Var;
                this.f12725h.b(j1Var);
            }
            if (aVar != null && !this.f12740w) {
                this.f12740w = true;
                this.f12726i.R(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, h>> it = this.f12731n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, h> next = it.next();
                if (next.getKey().intValue() > i10) {
                    it.remove();
                    next.getValue().z().M(j1Var, r.a.REFUSED, false, new y0());
                    d0(next.getValue());
                }
            }
            for (h hVar : this.F) {
                hVar.z().M(j1Var, r.a.MISCARRIED, true, new y0());
                d0(hVar);
            }
            this.F.clear();
            n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l0() {
        boolean z10 = false;
        while (!this.F.isEmpty() && this.f12731n.size() < this.E) {
            m0(this.F.poll());
            z10 = true;
        }
        return z10;
    }

    private void m0(h hVar) {
        b5.n.u(hVar.z().c0() == -1, "StreamId already assigned");
        this.f12731n.put(Integer.valueOf(this.f12730m), hVar);
        j0(hVar);
        hVar.z().f0(this.f12730m);
        if ((hVar.M() != z0.d.UNARY && hVar.M() != z0.d.SERVER_STREAMING) || hVar.O()) {
            this.f12726i.flush();
        }
        int i10 = this.f12730m;
        if (i10 < 2147483645) {
            this.f12730m = i10 + 2;
            return;
        }
        this.f12730m = Integer.MAX_VALUE;
        k0(Integer.MAX_VALUE, m9.a.NO_ERROR, j1.f9938u.q("Stream ids exhausted"));
    }

    private void n0() {
        if (this.f12739v == null || !this.f12731n.isEmpty() || !this.F.isEmpty() || this.f12742y) {
            return;
        }
        this.f12742y = true;
        c1 c1Var = this.H;
        if (c1Var != null) {
            c1Var.q();
        }
        v0 v0Var = this.f12741x;
        if (v0Var != null) {
            v0Var.f(Y());
            this.f12741x = null;
        }
        if (!this.f12740w) {
            this.f12740w = true;
            this.f12726i.R(0, m9.a.NO_ERROR, new byte[0]);
        }
        this.f12726i.close();
    }

    static j1 p0(m9.a aVar) {
        j1 j1Var = W.get(aVar);
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1Var2 = j1.f9925h;
        return j1Var2.q("Unknown http2 error code: " + aVar.f13887j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(boolean z10, long j10, long j11, boolean z11) {
        this.I = z10;
        this.J = j10;
        this.K = j11;
        this.L = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(int i10, j1 j1Var, r.a aVar, boolean z10, m9.a aVar2, y0 y0Var) {
        synchronized (this.f12728k) {
            h remove = this.f12731n.remove(Integer.valueOf(i10));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f12726i.d(i10, m9.a.CANCEL);
                }
                if (j1Var != null) {
                    h.b z11 = remove.z();
                    if (y0Var == null) {
                        y0Var = new y0();
                    }
                    z11.M(j1Var, aVar, z10, y0Var);
                }
                if (!l0()) {
                    n0();
                    d0(remove);
                }
            }
        }
    }

    public i9.a V() {
        return this.f12738u;
    }

    String W() {
        URI b10 = r0.b(this.f12719b);
        return b10.getHost() != null ? b10.getHost() : this.f12719b;
    }

    int X() {
        URI b10 = r0.b(this.f12719b);
        return b10.getPort() != -1 ? b10.getPort() : this.f12718a.getPort();
    }

    h Z(int i10) {
        h hVar;
        synchronized (this.f12728k) {
            hVar = this.f12731n.get(Integer.valueOf(i10));
        }
        return hVar;
    }

    @Override // k9.q.d
    public q.c[] b() {
        q.c[] cVarArr;
        synchronized (this.f12728k) {
            cVarArr = new q.c[this.f12731n.size()];
            int i10 = 0;
            for (h hVar : this.f12731n.values()) {
                cVarArr[i10] = hVar.z().b0();
                i10++;
            }
        }
        return cVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        return this.B == null;
    }

    @Override // io.grpc.internal.k1
    public void c(j1 j1Var) {
        synchronized (this.f12728k) {
            if (this.f12739v != null) {
                return;
            }
            this.f12739v = j1Var;
            this.f12725h.b(j1Var);
            n0();
        }
    }

    boolean c0(int i10) {
        boolean z10;
        synchronized (this.f12728k) {
            z10 = true;
            if (i10 >= this.f12730m || (i10 & 1) != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // io.grpc.internal.k1
    public Runnable d(k1.a aVar) {
        this.f12725h = (k1.a) b5.n.o(aVar, "listener");
        if (this.I) {
            c1 c1Var = new c1(new c1.c(this), this.f12734q, this.J, this.K, this.L);
            this.H = c1Var;
            c1Var.p();
        }
        k9.a w10 = k9.a.w(this.f12733p, this, 10000);
        m9.c v10 = w10.v(this.f12724g.b(okio.g.a(w10), true));
        synchronized (this.f12728k) {
            k9.b bVar = new k9.b(this, v10);
            this.f12726i = bVar;
            this.f12727j = new q(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f12733p.execute(new c(countDownLatch, w10));
        try {
            i0();
            countDownLatch.countDown();
            this.f12733p.execute(new d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // k9.b.a
    public void e(Throwable th) {
        b5.n.o(th, "failureCause");
        k0(0, m9.a.INTERNAL_ERROR, j1.f9938u.p(th));
    }

    @Override // io.grpc.internal.s
    /* renamed from: e0 */
    public h a(z0<?, ?> z0Var, y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
        b5.n.o(z0Var, "method");
        b5.n.o(y0Var, "headers");
        i2 h10 = i2.h(kVarArr, V(), y0Var);
        synchronized (this.f12728k) {
            try {
                try {
                    return new h(z0Var, y0Var, this.f12726i, this, this.f12727j, this.f12728k, this.f12735r, this.f12723f, this.f12719b, this.f12720c, h10, this.P, cVar, this.O);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // i9.p0
    public j0 f() {
        return this.f12729l;
    }

    @Override // io.grpc.internal.k1
    public void g(j1 j1Var) {
        c(j1Var);
        synchronized (this.f12728k) {
            Iterator<Map.Entry<Integer, h>> it = this.f12731n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, h> next = it.next();
                it.remove();
                next.getValue().z().N(j1Var, false, new y0());
                d0(next.getValue());
            }
            for (h hVar : this.F) {
                hVar.z().M(j1Var, r.a.MISCARRIED, true, new y0());
                d0(hVar);
            }
            this.F.clear();
            n0();
        }
    }

    @Override // io.grpc.internal.s
    public void h(s.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f12728k) {
            boolean z10 = true;
            b5.n.t(this.f12726i != null);
            if (this.f12742y) {
                v0.g(aVar, executor, Y());
                return;
            }
            v0 v0Var = this.f12741x;
            if (v0Var != null) {
                nextLong = 0;
                z10 = false;
            } else {
                nextLong = this.f12721d.nextLong();
                b5.r rVar = this.f12722e.get();
                rVar.g();
                v0 v0Var2 = new v0(nextLong, rVar);
                this.f12741x = v0Var2;
                this.P.b();
                v0Var = v0Var2;
            }
            if (z10) {
                this.f12726i.f(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            v0Var.a(aVar, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(h hVar) {
        this.F.remove(hVar);
        d0(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(h hVar) {
        if (this.f12739v != null) {
            hVar.z().M(this.f12739v, r.a.MISCARRIED, true, new y0());
        } else if (this.f12731n.size() < this.E) {
            m0(hVar);
        } else {
            this.F.add(hVar);
            j0(hVar);
        }
    }

    public String toString() {
        return b5.h.c(this).c("logId", this.f12729l.d()).d("address", this.f12718a).toString();
    }
}
