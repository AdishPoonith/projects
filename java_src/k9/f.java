package k9;

import i9.v0;
import io.grpc.internal.c1;
import io.grpc.internal.f2;
import io.grpc.internal.g2;
import io.grpc.internal.h;
import io.grpc.internal.h0;
import io.grpc.internal.h1;
import io.grpc.internal.o2;
import io.grpc.internal.p1;
import io.grpc.internal.r0;
import io.grpc.internal.t;
import io.grpc.internal.v;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import l9.b;
/* loaded from: classes.dex */
public final class f extends io.grpc.internal.b<f> {

    /* renamed from: r  reason: collision with root package name */
    private static final Logger f12658r = Logger.getLogger(f.class.getName());

    /* renamed from: s  reason: collision with root package name */
    static final l9.b f12659s = new b.C0197b(l9.b.f13505f).g(l9.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, l9.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, l9.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, l9.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, l9.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, l9.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).j(l9.k.TLS_1_2).h(true).e();

    /* renamed from: t  reason: collision with root package name */
    private static final long f12660t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u  reason: collision with root package name */
    private static final f2.d<Executor> f12661u;

    /* renamed from: v  reason: collision with root package name */
    static final p1<Executor> f12662v;

    /* renamed from: w  reason: collision with root package name */
    private static final EnumSet<i9.p1> f12663w;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f12664b;

    /* renamed from: f  reason: collision with root package name */
    private SocketFactory f12668f;

    /* renamed from: g  reason: collision with root package name */
    private SSLSocketFactory f12669g;

    /* renamed from: i  reason: collision with root package name */
    private HostnameVerifier f12671i;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12677o;

    /* renamed from: c  reason: collision with root package name */
    private o2.b f12665c = o2.a();

    /* renamed from: d  reason: collision with root package name */
    private p1<Executor> f12666d = f12662v;

    /* renamed from: e  reason: collision with root package name */
    private p1<ScheduledExecutorService> f12667e = g2.c(r0.f11592v);

    /* renamed from: j  reason: collision with root package name */
    private l9.b f12672j = f12659s;

    /* renamed from: k  reason: collision with root package name */
    private c f12673k = c.TLS;

    /* renamed from: l  reason: collision with root package name */
    private long f12674l = Long.MAX_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private long f12675m = r0.f11584n;

    /* renamed from: n  reason: collision with root package name */
    private int f12676n = 65535;

    /* renamed from: p  reason: collision with root package name */
    private int f12678p = Integer.MAX_VALUE;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f12679q = false;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12670h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f2.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(r0.i("grpc-okhttp-%d", true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12680a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f12681b;

        static {
            int[] iArr = new int[c.values().length];
            f12681b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12681b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[k9.e.values().length];
            f12680a = iArr2;
            try {
                iArr2[k9.e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12680a[k9.e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum c {
        TLS,
        PLAINTEXT
    }

    /* loaded from: classes.dex */
    private final class d implements h1.b {
        private d() {
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.h1.b
        public int a() {
            return f.this.h();
        }
    }

    /* loaded from: classes.dex */
    private final class e implements h1.c {
        private e() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.h1.c
        public t a() {
            return f.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k9.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0188f implements t {
        final boolean A;
        private boolean B;

        /* renamed from: j  reason: collision with root package name */
        private final p1<Executor> f12687j;

        /* renamed from: k  reason: collision with root package name */
        final Executor f12688k;

        /* renamed from: l  reason: collision with root package name */
        private final p1<ScheduledExecutorService> f12689l;

        /* renamed from: m  reason: collision with root package name */
        final ScheduledExecutorService f12690m;

        /* renamed from: n  reason: collision with root package name */
        final o2.b f12691n;

        /* renamed from: o  reason: collision with root package name */
        final SocketFactory f12692o;

        /* renamed from: p  reason: collision with root package name */
        final SSLSocketFactory f12693p;

        /* renamed from: q  reason: collision with root package name */
        final HostnameVerifier f12694q;

        /* renamed from: r  reason: collision with root package name */
        final l9.b f12695r;

        /* renamed from: s  reason: collision with root package name */
        final int f12696s;

        /* renamed from: t  reason: collision with root package name */
        private final boolean f12697t;

        /* renamed from: u  reason: collision with root package name */
        private final long f12698u;

        /* renamed from: v  reason: collision with root package name */
        private final io.grpc.internal.h f12699v;

        /* renamed from: w  reason: collision with root package name */
        private final long f12700w;

        /* renamed from: x  reason: collision with root package name */
        final int f12701x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f12702y;

        /* renamed from: z  reason: collision with root package name */
        final int f12703z;

        /* renamed from: k9.f$f$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ h.b f12704j;

            a(h.b bVar) {
                this.f12704j = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12704j.a();
            }
        }

        private C0188f(p1<Executor> p1Var, p1<ScheduledExecutorService> p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, l9.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, o2.b bVar2, boolean z12) {
            this.f12687j = p1Var;
            this.f12688k = p1Var.a();
            this.f12689l = p1Var2;
            this.f12690m = p1Var2.a();
            this.f12692o = socketFactory;
            this.f12693p = sSLSocketFactory;
            this.f12694q = hostnameVerifier;
            this.f12695r = bVar;
            this.f12696s = i10;
            this.f12697t = z10;
            this.f12698u = j10;
            this.f12699v = new io.grpc.internal.h("keepalive time nanos", j10);
            this.f12700w = j11;
            this.f12701x = i11;
            this.f12702y = z11;
            this.f12703z = i12;
            this.A = z12;
            this.f12691n = (o2.b) b5.n.o(bVar2, "transportTracerFactory");
        }

        /* synthetic */ C0188f(p1 p1Var, p1 p1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, l9.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, o2.b bVar2, boolean z12, a aVar) {
            this(p1Var, p1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i10, z10, j10, j11, i11, z11, i12, bVar2, z12);
        }

        @Override // io.grpc.internal.t
        public ScheduledExecutorService S() {
            return this.f12690m;
        }

        @Override // io.grpc.internal.t
        public v W(SocketAddress socketAddress, t.a aVar, i9.f fVar) {
            if (this.B) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            h.b d10 = this.f12699v.d();
            i iVar = new i(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(d10));
            if (this.f12697t) {
                iVar.T(true, d10.b(), this.f12700w, this.f12702y);
            }
            return iVar;
        }

        @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.B) {
                return;
            }
            this.B = true;
            this.f12687j.b(this.f12688k);
            this.f12689l.b(this.f12690m);
        }
    }

    static {
        a aVar = new a();
        f12661u = aVar;
        f12662v = g2.c(aVar);
        f12663w = EnumSet.of(i9.p1.MTLS, i9.p1.CUSTOM_MANAGERS);
    }

    private f(String str) {
        this.f12664b = new h1(str, new e(this, null), new d(this, null));
    }

    public static f forTarget(String str) {
        return new f(str);
    }

    @Override // io.grpc.internal.b
    protected v0<?> e() {
        return this.f12664b;
    }

    C0188f f() {
        return new C0188f(this.f12666d, this.f12667e, this.f12668f, g(), this.f12671i, this.f12672j, this.f11010a, this.f12674l != Long.MAX_VALUE, this.f12674l, this.f12675m, this.f12676n, this.f12677o, this.f12678p, this.f12665c, false, null);
    }

    SSLSocketFactory g() {
        int i10 = b.f12681b[this.f12673k.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new RuntimeException("Unknown negotiation type: " + this.f12673k);
            }
            try {
                if (this.f12669g == null) {
                    this.f12669g = SSLContext.getInstance("Default", l9.h.e().g()).getSocketFactory();
                }
                return this.f12669g;
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException("TLS Provider failure", e10);
            }
        }
        return null;
    }

    int h() {
        int i10 = b.f12681b[this.f12673k.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 443;
            }
            throw new AssertionError(this.f12673k + " not handled");
        }
        return 80;
    }

    @Override // i9.v0
    /* renamed from: i */
    public f c(long j10, TimeUnit timeUnit) {
        b5.n.e(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f12674l = nanos;
        long l10 = c1.l(nanos);
        this.f12674l = l10;
        if (l10 >= f12660t) {
            this.f12674l = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // i9.v0
    /* renamed from: j */
    public f d() {
        b5.n.u(!this.f12670h, "Cannot change security when using ChannelCredentials");
        this.f12673k = c.PLAINTEXT;
        return this;
    }

    public f scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f12667e = new h0((ScheduledExecutorService) b5.n.o(scheduledExecutorService, "scheduledExecutorService"));
        return this;
    }

    public f sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        b5.n.u(!this.f12670h, "Cannot change security when using ChannelCredentials");
        this.f12669g = sSLSocketFactory;
        this.f12673k = c.TLS;
        return this;
    }

    public f transportExecutor(Executor executor) {
        if (executor == null) {
            this.f12666d = f12662v;
        } else {
            this.f12666d = new h0(executor);
        }
        return this;
    }
}
