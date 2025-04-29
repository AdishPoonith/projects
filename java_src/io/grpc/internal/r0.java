package io.grpc.internal;

import i9.c;
import i9.j1;
import i9.k;
import i9.m0;
import i9.r0;
import i9.y0;
import io.grpc.internal.f2;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f11571a = Logger.getLogger(r0.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Set<j1.b> f11572b = Collections.unmodifiableSet(EnumSet.of(j1.b.OK, j1.b.INVALID_ARGUMENT, j1.b.NOT_FOUND, j1.b.ALREADY_EXISTS, j1.b.FAILED_PRECONDITION, j1.b.ABORTED, j1.b.OUT_OF_RANGE, j1.b.DATA_LOSS));

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f11573c = Charset.forName("US-ASCII");

    /* renamed from: d  reason: collision with root package name */
    public static final y0.g<Long> f11574d = y0.g.e("grpc-timeout", new i());

    /* renamed from: e  reason: collision with root package name */
    public static final y0.g<String> f11575e;

    /* renamed from: f  reason: collision with root package name */
    public static final y0.g<byte[]> f11576f;

    /* renamed from: g  reason: collision with root package name */
    public static final y0.g<String> f11577g;

    /* renamed from: h  reason: collision with root package name */
    public static final y0.g<byte[]> f11578h;

    /* renamed from: i  reason: collision with root package name */
    static final y0.g<String> f11579i;

    /* renamed from: j  reason: collision with root package name */
    public static final y0.g<String> f11580j;

    /* renamed from: k  reason: collision with root package name */
    public static final y0.g<String> f11581k;

    /* renamed from: l  reason: collision with root package name */
    public static final y0.g<String> f11582l;

    /* renamed from: m  reason: collision with root package name */
    public static final b5.q f11583m;

    /* renamed from: n  reason: collision with root package name */
    public static final long f11584n;

    /* renamed from: o  reason: collision with root package name */
    public static final long f11585o;

    /* renamed from: p  reason: collision with root package name */
    public static final long f11586p;

    /* renamed from: q  reason: collision with root package name */
    public static final i9.g1 f11587q;

    /* renamed from: r  reason: collision with root package name */
    public static final i9.g1 f11588r;

    /* renamed from: s  reason: collision with root package name */
    public static final c.C0162c<Boolean> f11589s;

    /* renamed from: t  reason: collision with root package name */
    private static final i9.k f11590t;

    /* renamed from: u  reason: collision with root package name */
    public static final f2.d<Executor> f11591u;

    /* renamed from: v  reason: collision with root package name */
    public static final f2.d<ScheduledExecutorService> f11592v;

    /* renamed from: w  reason: collision with root package name */
    public static final b5.t<b5.r> f11593w;

    /* loaded from: classes.dex */
    class a implements i9.g1 {
        a() {
        }

        @Override // i9.g1
        public i9.f1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b extends i9.k {
        b() {
        }
    }

    /* loaded from: classes.dex */
    class c implements f2.d<Executor> {
        c() {
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: c */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: d */
        public Executor a() {
            return Executors.newCachedThreadPool(r0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* loaded from: classes.dex */
    class d implements f2.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: c */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.f2.d
        /* renamed from: d */
        public ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, r0.i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* loaded from: classes.dex */
    class e implements b5.t<b5.r> {
        e() {
        }

        @Override // b5.t
        /* renamed from: a */
        public b5.r get() {
            return b5.r.c();
        }
    }

    /* loaded from: classes.dex */
    class f implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.a f11594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s f11595b;

        f(k.a aVar, s sVar) {
            this.f11594a = aVar;
            this.f11595b = sVar;
        }

        @Override // io.grpc.internal.s
        public q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
            i9.k a10 = this.f11594a.a(k.b.a().b(cVar).a(), y0Var);
            b5.n.u(kVarArr[kVarArr.length - 1] == r0.f11590t, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a10;
            return this.f11595b.a(z0Var, y0Var, cVar, kVarArr);
        }

        @Override // i9.p0
        public i9.j0 f() {
            return this.f11595b.f();
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements m0.a<byte[]> {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // i9.y0.j
        /* renamed from: c */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // i9.y0.j
        /* renamed from: d */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum l uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static final class h {
        private static final /* synthetic */ h[] A;

        /* renamed from: l  reason: collision with root package name */
        public static final h f11596l;

        /* renamed from: m  reason: collision with root package name */
        public static final h f11597m;

        /* renamed from: n  reason: collision with root package name */
        public static final h f11598n;

        /* renamed from: o  reason: collision with root package name */
        public static final h f11599o;

        /* renamed from: p  reason: collision with root package name */
        public static final h f11600p;

        /* renamed from: q  reason: collision with root package name */
        public static final h f11601q;

        /* renamed from: r  reason: collision with root package name */
        public static final h f11602r;

        /* renamed from: s  reason: collision with root package name */
        public static final h f11603s;

        /* renamed from: t  reason: collision with root package name */
        public static final h f11604t;

        /* renamed from: u  reason: collision with root package name */
        public static final h f11605u;

        /* renamed from: v  reason: collision with root package name */
        public static final h f11606v;

        /* renamed from: w  reason: collision with root package name */
        public static final h f11607w;

        /* renamed from: x  reason: collision with root package name */
        public static final h f11608x;

        /* renamed from: y  reason: collision with root package name */
        public static final h f11609y;

        /* renamed from: z  reason: collision with root package name */
        private static final h[] f11610z;

        /* renamed from: j  reason: collision with root package name */
        private final int f11611j;

        /* renamed from: k  reason: collision with root package name */
        private final i9.j1 f11612k;

        static {
            i9.j1 j1Var = i9.j1.f9938u;
            h hVar = new h("NO_ERROR", 0, 0, j1Var);
            f11596l = hVar;
            i9.j1 j1Var2 = i9.j1.f9937t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, j1Var2);
            f11597m = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, j1Var2);
            f11598n = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, j1Var2);
            f11599o = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, j1Var2);
            f11600p = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, j1Var2);
            f11601q = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, j1Var2);
            f11602r = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, j1Var);
            f11603s = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, i9.j1.f9924g);
            f11604t = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, j1Var2);
            f11605u = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, j1Var2);
            f11606v = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, i9.j1.f9932o.q("Bandwidth exhausted"));
            f11607w = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, i9.j1.f9930m.q("Permission denied as protocol is not secure enough to call"));
            f11608x = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, i9.j1.f9925h);
            f11609y = hVar14;
            A = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f11610z = b();
        }

        private h(String str, int i10, int i11, i9.j1 j1Var) {
            this.f11611j = i11;
            String str2 = "HTTP/2 error code: " + name();
            if (j1Var.n() != null) {
                str2 = str2 + " (" + j1Var.n() + ")";
            }
            this.f11612k = j1Var.q(str2);
        }

        private static h[] b() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].g()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.g()] = hVar;
            }
            return hVarArr;
        }

        public static h h(long j10) {
            h[] hVarArr = f11610z;
            if (j10 >= hVarArr.length || j10 < 0) {
                return null;
            }
            return hVarArr[(int) j10];
        }

        public static i9.j1 k(long j10) {
            h h10 = h(j10);
            if (h10 == null) {
                i9.j1 h11 = i9.j1.h(f11598n.i().m().h());
                return h11.q("Unrecognized HTTP/2 error code: " + j10);
            }
            return h10.i();
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) A.clone();
        }

        public long g() {
            return this.f11611j;
        }

        public i9.j1 i() {
            return this.f11612k;
        }
    }

    /* loaded from: classes.dex */
    static class i implements y0.d<Long> {
        i() {
        }

        @Override // i9.y0.d
        /* renamed from: c */
        public Long b(String str) {
            TimeUnit timeUnit;
            b5.n.e(str.length() > 0, "empty timeout");
            b5.n.e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                timeUnit = TimeUnit.HOURS;
            } else if (charAt == 'M') {
                timeUnit = TimeUnit.MINUTES;
            } else if (charAt == 'S') {
                timeUnit = TimeUnit.SECONDS;
            } else if (charAt == 'u') {
                timeUnit = TimeUnit.MICROSECONDS;
            } else if (charAt != 'm') {
                if (charAt == 'n') {
                    return Long.valueOf(parseLong);
                }
                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
            } else {
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return Long.valueOf(timeUnit.toNanos(parseLong));
        }

        @Override // i9.y0.d
        /* renamed from: d */
        public String a(Long l10) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l10.longValue() >= 0) {
                if (l10.longValue() < 100000000) {
                    return l10 + "n";
                } else if (l10.longValue() < 100000000000L) {
                    return timeUnit.toMicros(l10.longValue()) + "u";
                } else if (l10.longValue() < 100000000000000L) {
                    return timeUnit.toMillis(l10.longValue()) + "m";
                } else if (l10.longValue() < 100000000000000000L) {
                    return timeUnit.toSeconds(l10.longValue()) + "S";
                } else if (l10.longValue() < 6000000000000000000L) {
                    return timeUnit.toMinutes(l10.longValue()) + "M";
                } else {
                    return timeUnit.toHours(l10.longValue()) + "H";
                }
            }
            throw new IllegalArgumentException("Timeout too small");
        }
    }

    static {
        y0.d<String> dVar = i9.y0.f10075e;
        f11575e = y0.g.e("grpc-encoding", dVar);
        f11576f = i9.m0.b("grpc-accept-encoding", new g(null));
        f11577g = y0.g.e("content-encoding", dVar);
        f11578h = i9.m0.b("accept-encoding", new g(null));
        f11579i = y0.g.e("content-length", dVar);
        f11580j = y0.g.e("content-type", dVar);
        f11581k = y0.g.e("te", dVar);
        f11582l = y0.g.e("user-agent", dVar);
        f11583m = b5.q.d(',').h();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11584n = timeUnit.toNanos(20L);
        f11585o = TimeUnit.HOURS.toNanos(2L);
        f11586p = timeUnit.toNanos(20L);
        f11587q = new u1();
        f11588r = new a();
        f11589s = c.C0162c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f11590t = new b();
        f11591u = new c();
        f11592v = new d();
        f11593w = new e();
    }

    private r0() {
    }

    public static URI b(String str) {
        b5.n.o(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: " + str, e10);
        }
    }

    public static String c(String str) {
        URI b10 = b(str);
        b5.n.j(b10.getHost() != null, "No host in authority '%s'", str);
        b5.n.j(b10.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(k2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            }
            e(next);
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f11571a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static i9.k[] f(i9.c cVar, i9.y0 y0Var, int i10, boolean z10) {
        List<k.a> i11 = cVar.i();
        int size = i11.size() + 1;
        i9.k[] kVarArr = new i9.k[size];
        k.b a10 = k.b.a().b(cVar).d(i10).c(z10).a();
        for (int i12 = 0; i12 < i11.size(); i12++) {
            kVarArr[i12] = i11.get(i12).a(a10, y0Var);
        }
        kVarArr[size - 1] = f11590t;
        return kVarArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.52.1");
        return sb.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z10) {
        return new com.google.common.util.concurrent.i().e(z10).f(str).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s j(r0.e eVar, boolean z10) {
        r0.h c10 = eVar.c();
        s b10 = c10 != null ? ((n2) c10.d()).b() : null;
        if (b10 != null) {
            k.a b11 = eVar.b();
            return b11 == null ? b10 : new f(b11, b10);
        }
        if (!eVar.a().o()) {
            if (eVar.d()) {
                return new g0(n(eVar.a()), r.a.DROPPED);
            }
            if (!z10) {
                return new g0(n(eVar.a()), r.a.PROCESSED);
            }
        }
        return null;
    }

    private static j1.b k(int i10) {
        if (i10 < 100 || i10 >= 200) {
            if (i10 != 400) {
                if (i10 != 401) {
                    if (i10 != 403) {
                        if (i10 != 404) {
                            if (i10 != 429) {
                                if (i10 != 431) {
                                    switch (i10) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            return j1.b.UNKNOWN;
                                    }
                                }
                            }
                            return j1.b.UNAVAILABLE;
                        }
                        return j1.b.UNIMPLEMENTED;
                    }
                    return j1.b.PERMISSION_DENIED;
                }
                return j1.b.UNAUTHENTICATED;
            }
            return j1.b.INTERNAL;
        }
        return j1.b.INTERNAL;
    }

    public static i9.j1 l(int i10) {
        i9.j1 g10 = k(i10).g();
        return g10.q("HTTP status code " + i10);
    }

    public static boolean m(String str) {
        char charAt;
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("application/grpc")) {
                return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
            }
            return false;
        }
        return false;
    }

    public static i9.j1 n(i9.j1 j1Var) {
        b5.n.d(j1Var != null);
        if (f11572b.contains(j1Var.m())) {
            i9.j1 j1Var2 = i9.j1.f9937t;
            return j1Var2.q("Inappropriate status code from control plane: " + j1Var.m() + " " + j1Var.n()).p(j1Var.l());
        }
        return j1Var;
    }

    public static boolean o(i9.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f11589s));
    }
}
