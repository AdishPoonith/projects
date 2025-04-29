package io.grpc.internal;

import i9.k;
import i9.y0;
import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class z1<ReqT> implements io.grpc.internal.q {
    static final y0.g<String> A;
    static final y0.g<String> B;
    private static final i9.j1 C;
    private static Random D;

    /* renamed from: a  reason: collision with root package name */
    private final i9.z0<ReqT, ?> f11824a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11825b;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f11827d;

    /* renamed from: e  reason: collision with root package name */
    private final i9.y0 f11828e;

    /* renamed from: f  reason: collision with root package name */
    private final a2 f11829f;

    /* renamed from: g  reason: collision with root package name */
    private final t0 f11830g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11831h;

    /* renamed from: j  reason: collision with root package name */
    private final t f11833j;

    /* renamed from: k  reason: collision with root package name */
    private final long f11834k;

    /* renamed from: l  reason: collision with root package name */
    private final long f11835l;

    /* renamed from: m  reason: collision with root package name */
    private final c0 f11836m;

    /* renamed from: s  reason: collision with root package name */
    private i9.j1 f11842s;

    /* renamed from: t  reason: collision with root package name */
    private long f11843t;

    /* renamed from: u  reason: collision with root package name */
    private io.grpc.internal.r f11844u;

    /* renamed from: v  reason: collision with root package name */
    private u f11845v;

    /* renamed from: w  reason: collision with root package name */
    private u f11846w;

    /* renamed from: x  reason: collision with root package name */
    private long f11847x;

    /* renamed from: y  reason: collision with root package name */
    private i9.j1 f11848y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11849z;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11826c = new i9.n1(new a());

    /* renamed from: i  reason: collision with root package name */
    private final Object f11832i = new Object();

    /* renamed from: n  reason: collision with root package name */
    private final x0 f11837n = new x0();

    /* renamed from: o  reason: collision with root package name */
    private volatile z f11838o = new z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f11839p = new AtomicBoolean();

    /* renamed from: q  reason: collision with root package name */
    private final AtomicInteger f11840q = new AtomicInteger();

    /* renamed from: r  reason: collision with root package name */
    private final AtomicInteger f11841r = new AtomicInteger();

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw i9.j1.k(th).q("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    /* loaded from: classes.dex */
    private final class a0 implements io.grpc.internal.r {

        /* renamed from: a  reason: collision with root package name */
        final b0 f11851a;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11853j;

            a(i9.y0 y0Var) {
                this.f11853j = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                z1.this.f11844u.d(this.f11853j);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ b0 f11855j;

            /* loaded from: classes.dex */
            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    z1.this.g0(bVar.f11855j);
                }
            }

            b(b0 b0Var) {
                this.f11855j = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                z1.this.f11825b.execute(new a());
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ b0 f11858j;

            c(b0 b0Var) {
                this.f11858j = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                z1.this.g0(this.f11858j);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ k2.a f11860j;

            d(k2.a aVar) {
                this.f11860j = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                z1.this.f11844u.a(this.f11860j);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (z1.this.f11849z) {
                    return;
                }
                z1.this.f11844u.b();
            }
        }

        a0(b0 b0Var) {
            this.f11851a = b0Var;
        }

        private Integer e(i9.y0 y0Var) {
            String str = (String) y0Var.g(z1.B);
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }
            return null;
        }

        private v f(i9.j1 j1Var, i9.y0 y0Var) {
            Integer e10 = e(y0Var);
            boolean z10 = true;
            boolean z11 = !z1.this.f11830g.f11658c.contains(j1Var.m());
            return new v((z11 || ((z1.this.f11836m == null || (z11 && (e10 == null || e10.intValue() >= 0))) ? false : z1.this.f11836m.b() ^ true)) ? false : false, e10);
        }

        private x g(i9.j1 j1Var, i9.y0 y0Var) {
            z1 z1Var;
            long j10;
            long j11 = 0;
            boolean z10 = false;
            if (z1.this.f11829f == null) {
                return new x(false, 0L);
            }
            boolean contains = z1.this.f11829f.f11009f.contains(j1Var.m());
            Integer e10 = e(y0Var);
            boolean z11 = (z1.this.f11836m == null || (!contains && (e10 == null || e10.intValue() >= 0))) ? false : !z1.this.f11836m.b();
            if (z1.this.f11829f.f11004a > this.f11851a.f11868d + 1 && !z11) {
                if (e10 == null) {
                    if (contains) {
                        j11 = (long) (z1.this.f11847x * z1.D.nextDouble());
                        z1Var = z1.this;
                        j10 = Math.min((long) (z1Var.f11847x * z1.this.f11829f.f11007d), z1.this.f11829f.f11006c);
                        z1Var.f11847x = j10;
                        z10 = true;
                    }
                } else if (e10.intValue() >= 0) {
                    j11 = TimeUnit.MILLISECONDS.toNanos(e10.intValue());
                    z1Var = z1.this;
                    j10 = z1Var.f11829f.f11005b;
                    z1Var.f11847x = j10;
                    z10 = true;
                }
            }
            return new x(z10, j11);
        }

        @Override // io.grpc.internal.k2
        public void a(k2.a aVar) {
            z zVar = z1.this.f11838o;
            b5.n.u(zVar.f11925f != null, "Headers should be received prior to messages.");
            if (zVar.f11925f != this.f11851a) {
                return;
            }
            z1.this.f11826c.execute(new d(aVar));
        }

        @Override // io.grpc.internal.k2
        public void b() {
            if (z1.this.d()) {
                z1.this.f11826c.execute(new e());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
            if (r5.f11852b.f11829f.f11004a != 1) goto L94;
         */
        @Override // io.grpc.internal.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(i9.j1 r6, io.grpc.internal.r.a r7, i9.y0 r8) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.a0.c(i9.j1, io.grpc.internal.r$a, i9.y0):void");
        }

        @Override // io.grpc.internal.r
        public void d(i9.y0 y0Var) {
            z1.this.d0(this.f11851a);
            if (z1.this.f11838o.f11925f == this.f11851a) {
                if (z1.this.f11836m != null) {
                    z1.this.f11836m.c();
                }
                z1.this.f11826c.execute(new a(y0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f11863a;

        b(String str) {
            this.f11863a = str;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.k(this.f11863a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b0 {

        /* renamed from: a  reason: collision with root package name */
        io.grpc.internal.q f11865a;

        /* renamed from: b  reason: collision with root package name */
        boolean f11866b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11867c;

        /* renamed from: d  reason: collision with root package name */
        final int f11868d;

        b0(int i10) {
            this.f11868d = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Collection f11869j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ b0 f11870k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Future f11871l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Future f11872m;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f11869j = collection;
            this.f11870k = b0Var;
            this.f11871l = future;
            this.f11872m = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b0 b0Var : this.f11869j) {
                if (b0Var != this.f11870k) {
                    b0Var.f11865a.a(z1.C);
                }
            }
            Future future = this.f11871l;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f11872m;
            if (future2 != null) {
                future2.cancel(false);
            }
            z1.this.k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c0 {

        /* renamed from: a  reason: collision with root package name */
        final int f11874a;

        /* renamed from: b  reason: collision with root package name */
        final int f11875b;

        /* renamed from: c  reason: collision with root package name */
        final int f11876c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicInteger f11877d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f11877d = atomicInteger;
            this.f11876c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f11874a = i10;
            this.f11875b = i10 / 2;
            atomicInteger.set(i10);
        }

        boolean a() {
            return this.f11877d.get() > this.f11875b;
        }

        boolean b() {
            int i10;
            int i11;
            do {
                i10 = this.f11877d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f11877d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f11875b;
        }

        void c() {
            int i10;
            int i11;
            do {
                i10 = this.f11877d.get();
                i11 = this.f11874a;
                if (i10 == i11) {
                    return;
                }
            } while (!this.f11877d.compareAndSet(i10, Math.min(this.f11876c + i10, i11)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return this.f11874a == c0Var.f11874a && this.f11876c == c0Var.f11876c;
            }
            return false;
        }

        public int hashCode() {
            return b5.j.b(Integer.valueOf(this.f11874a), Integer.valueOf(this.f11876c));
        }
    }

    /* loaded from: classes.dex */
    class d implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i9.n f11878a;

        d(i9.n nVar) {
            this.f11878a = nVar;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.c(this.f11878a);
        }
    }

    /* loaded from: classes.dex */
    class e implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i9.t f11880a;

        e(i9.t tVar) {
            this.f11880a = tVar;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.h(this.f11880a);
        }
    }

    /* loaded from: classes.dex */
    class f implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i9.v f11882a;

        f(i9.v vVar) {
            this.f11882a = vVar;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.i(this.f11882a);
        }
    }

    /* loaded from: classes.dex */
    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.flush();
        }
    }

    /* loaded from: classes.dex */
    class h implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11885a;

        h(boolean z10) {
            this.f11885a = z10;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.q(this.f11885a);
        }
    }

    /* loaded from: classes.dex */
    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.n();
        }
    }

    /* loaded from: classes.dex */
    class j implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11888a;

        j(int i10) {
            this.f11888a = i10;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.e(this.f11888a);
        }
    }

    /* loaded from: classes.dex */
    class k implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11890a;

        k(int i10) {
            this.f11890a = i10;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.f(this.f11890a);
        }
    }

    /* loaded from: classes.dex */
    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.m();
        }
    }

    /* loaded from: classes.dex */
    class m implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11893a;

        m(int i10) {
            this.f11893a = i10;
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.b(this.f11893a);
        }
    }

    /* loaded from: classes.dex */
    class n implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f11895a;

        n(Object obj) {
            this.f11895a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.j(z1.this.f11824a.j(this.f11895a));
            b0Var.f11865a.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i9.k f11897a;

        o(i9.k kVar) {
            this.f11897a = kVar;
        }

        @Override // i9.k.a
        public i9.k a(k.b bVar, i9.y0 y0Var) {
            return this.f11897a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z1.this.f11849z) {
                return;
            }
            z1.this.f11844u.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f11900j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ r.a f11901k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ i9.y0 f11902l;

        q(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
            this.f11900j = j1Var;
            this.f11901k = aVar;
            this.f11902l = y0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z1.this.f11849z = true;
            z1.this.f11844u.c(this.f11900j, this.f11901k, this.f11902l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface r {
        void a(b0 b0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class s extends i9.k {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f11904a;

        /* renamed from: b  reason: collision with root package name */
        long f11905b;

        s(b0 b0Var) {
            this.f11904a = b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:7:0x0013, B:9:0x001d, B:12:0x0024, B:14:0x0033, B:16:0x0035, B:18:0x0042, B:19:0x0044, B:23:0x006e, B:25:0x0074, B:26:0x007a, B:20:0x0047, B:22:0x006b, B:30:0x0081), top: B:35:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        @Override // i9.m1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(long r8) {
            /*
                r7 = this;
                io.grpc.internal.z1 r0 = io.grpc.internal.z1.this
                io.grpc.internal.z1$z r0 = io.grpc.internal.z1.Q(r0)
                io.grpc.internal.z1$b0 r0 = r0.f11925f
                if (r0 == 0) goto Lb
                return
            Lb:
                r0 = 0
                io.grpc.internal.z1 r1 = io.grpc.internal.z1.this
                java.lang.Object r1 = io.grpc.internal.z1.X(r1)
                monitor-enter(r1)
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1$z r2 = io.grpc.internal.z1.Q(r2)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1$b0 r2 = r2.f11925f     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L81
                io.grpc.internal.z1$b0 r2 = r7.f11904a     // Catch: java.lang.Throwable -> L83
                boolean r2 = r2.f11866b     // Catch: java.lang.Throwable -> L83
                if (r2 == 0) goto L24
                goto L81
            L24:
                long r2 = r7.f11905b     // Catch: java.lang.Throwable -> L83
                long r2 = r2 + r8
                r7.f11905b = r2     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                long r8 = io.grpc.internal.z1.O(r8)     // Catch: java.lang.Throwable -> L83
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L35
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                return
            L35:
                long r8 = r7.f11905b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                long r2 = io.grpc.internal.z1.R(r2)     // Catch: java.lang.Throwable -> L83
                r4 = 1
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L47
                io.grpc.internal.z1$b0 r8 = r7.f11904a     // Catch: java.lang.Throwable -> L83
            L44:
                r8.f11867c = r4     // Catch: java.lang.Throwable -> L83
                goto L6e
            L47:
                io.grpc.internal.z1 r8 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1$t r8 = io.grpc.internal.z1.T(r8)     // Catch: java.lang.Throwable -> L83
                long r2 = r7.f11905b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1 r9 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                long r5 = io.grpc.internal.z1.O(r9)     // Catch: java.lang.Throwable -> L83
                long r2 = r2 - r5
                long r8 = r8.a(r2)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                long r5 = r7.f11905b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1.P(r2, r5)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.z1 r2 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                long r2 = io.grpc.internal.z1.U(r2)     // Catch: java.lang.Throwable -> L83
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L6e
                io.grpc.internal.z1$b0 r8 = r7.f11904a     // Catch: java.lang.Throwable -> L83
                goto L44
            L6e:
                io.grpc.internal.z1$b0 r8 = r7.f11904a     // Catch: java.lang.Throwable -> L83
                boolean r9 = r8.f11867c     // Catch: java.lang.Throwable -> L83
                if (r9 == 0) goto L7a
                io.grpc.internal.z1 r9 = io.grpc.internal.z1.this     // Catch: java.lang.Throwable -> L83
                java.lang.Runnable r0 = io.grpc.internal.z1.V(r9, r8)     // Catch: java.lang.Throwable -> L83
            L7a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                if (r0 == 0) goto L80
                r0.run()
            L80:
                return
            L81:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                return
            L83:
                r8 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.s.h(long):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class t {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicLong f11907a = new AtomicLong();

        long a(long j10) {
            return this.f11907a.addAndGet(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        final Object f11908a;

        /* renamed from: b  reason: collision with root package name */
        Future<?> f11909b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11910c;

        u(Object obj) {
            this.f11908a = obj;
        }

        boolean a() {
            return this.f11910c;
        }

        Future<?> b() {
            this.f11910c = true;
            return this.f11909b;
        }

        void c(Future<?> future) {
            synchronized (this.f11908a) {
                if (!this.f11910c) {
                    this.f11909b = future;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        final boolean f11911a;

        /* renamed from: b  reason: collision with root package name */
        final Integer f11912b;

        public v(boolean z10, Integer num) {
            this.f11911a = z10;
            this.f11912b = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class w implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final u f11913j;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ b0 f11915j;

            a(b0 b0Var) {
                this.f11915j = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                boolean z10;
                z1 z1Var;
                synchronized (z1.this.f11832i) {
                    uVar = null;
                    z10 = false;
                    if (w.this.f11913j.a()) {
                        z10 = true;
                    } else {
                        z1 z1Var2 = z1.this;
                        z1Var2.f11838o = z1Var2.f11838o.a(this.f11915j);
                        z1 z1Var3 = z1.this;
                        if (z1Var3.i0(z1Var3.f11838o) && (z1.this.f11836m == null || z1.this.f11836m.a())) {
                            z1Var = z1.this;
                            uVar = new u(z1Var.f11832i);
                        } else {
                            z1 z1Var4 = z1.this;
                            z1Var4.f11838o = z1Var4.f11838o.d();
                            z1Var = z1.this;
                        }
                        z1Var.f11846w = uVar;
                    }
                }
                if (z10) {
                    this.f11915j.f11865a.a(i9.j1.f9924g.q("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.c(z1.this.f11827d.schedule(new w(uVar), z1.this.f11830g.f11657b, TimeUnit.NANOSECONDS));
                }
                z1.this.g0(this.f11915j);
            }
        }

        w(u uVar) {
            this.f11913j = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z1 z1Var = z1.this;
            b0 e02 = z1Var.e0(z1Var.f11838o.f11924e, false);
            if (e02 == null) {
                return;
            }
            z1.this.f11825b.execute(new a(e02));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class x {

        /* renamed from: a  reason: collision with root package name */
        final boolean f11917a;

        /* renamed from: b  reason: collision with root package name */
        final long f11918b;

        x(boolean z10, long j10) {
            this.f11917a = z10;
            this.f11918b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class y implements r {
        y() {
        }

        @Override // io.grpc.internal.z1.r
        public void a(b0 b0Var) {
            b0Var.f11865a.g(new a0(b0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class z {

        /* renamed from: a  reason: collision with root package name */
        final boolean f11920a;

        /* renamed from: b  reason: collision with root package name */
        final List<r> f11921b;

        /* renamed from: c  reason: collision with root package name */
        final Collection<b0> f11922c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<b0> f11923d;

        /* renamed from: e  reason: collision with root package name */
        final int f11924e;

        /* renamed from: f  reason: collision with root package name */
        final b0 f11925f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f11926g;

        /* renamed from: h  reason: collision with root package name */
        final boolean f11927h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f11921b = list;
            this.f11922c = (Collection) b5.n.o(collection, "drainedSubstreams");
            this.f11925f = b0Var;
            this.f11923d = collection2;
            this.f11926g = z10;
            this.f11920a = z11;
            this.f11927h = z12;
            this.f11924e = i10;
            boolean z13 = false;
            b5.n.u(!z11 || list == null, "passThrough should imply buffer is null");
            b5.n.u((z11 && b0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            b5.n.u(!z11 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f11866b), "passThrough should imply winningSubstream is drained");
            b5.n.u((z10 && b0Var == null) ? true : true, "cancelled should imply committed");
        }

        z a(b0 b0Var) {
            Collection unmodifiableCollection;
            b5.n.u(!this.f11927h, "hedging frozen");
            b5.n.u(this.f11925f == null, "already committed");
            if (this.f11923d == null) {
                unmodifiableCollection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f11923d);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f11921b, this.f11922c, unmodifiableCollection, this.f11925f, this.f11926g, this.f11920a, this.f11927h, this.f11924e + 1);
        }

        z b() {
            return new z(this.f11921b, this.f11922c, this.f11923d, this.f11925f, true, this.f11920a, this.f11927h, this.f11924e);
        }

        z c(b0 b0Var) {
            List<r> list;
            Collection emptyList;
            boolean z10;
            b5.n.u(this.f11925f == null, "Already committed");
            List<r> list2 = this.f11921b;
            if (this.f11922c.contains(b0Var)) {
                list = null;
                emptyList = Collections.singleton(b0Var);
                z10 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z10 = false;
            }
            return new z(list, emptyList, this.f11923d, b0Var, this.f11926g, z10, this.f11927h, this.f11924e);
        }

        z d() {
            return this.f11927h ? this : new z(this.f11921b, this.f11922c, this.f11923d, this.f11925f, this.f11926g, this.f11920a, true, this.f11924e);
        }

        z e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f11923d);
            arrayList.remove(b0Var);
            return new z(this.f11921b, this.f11922c, Collections.unmodifiableCollection(arrayList), this.f11925f, this.f11926g, this.f11920a, this.f11927h, this.f11924e);
        }

        z f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f11923d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f11921b, this.f11922c, Collections.unmodifiableCollection(arrayList), this.f11925f, this.f11926g, this.f11920a, this.f11927h, this.f11924e);
        }

        z g(b0 b0Var) {
            b0Var.f11866b = true;
            if (this.f11922c.contains(b0Var)) {
                ArrayList arrayList = new ArrayList(this.f11922c);
                arrayList.remove(b0Var);
                return new z(this.f11921b, Collections.unmodifiableCollection(arrayList), this.f11923d, this.f11925f, this.f11926g, this.f11920a, this.f11927h, this.f11924e);
            }
            return this;
        }

        z h(b0 b0Var) {
            Collection unmodifiableCollection;
            b5.n.u(!this.f11920a, "Already passThrough");
            if (b0Var.f11866b) {
                unmodifiableCollection = this.f11922c;
            } else if (this.f11922c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f11922c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f11925f;
            boolean z10 = b0Var2 != null;
            List<r> list = this.f11921b;
            if (z10) {
                b5.n.u(b0Var2 == b0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f11923d, this.f11925f, this.f11926g, z10, this.f11927h, this.f11924e);
        }
    }

    static {
        y0.d<String> dVar = i9.y0.f10075e;
        A = y0.g.e("grpc-previous-rpc-attempts", dVar);
        B = y0.g.e("grpc-retry-pushback-ms", dVar);
        C = i9.j1.f9924g.q("Stream thrown away because RetriableStream committed");
        D = new Random();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(i9.z0<ReqT, ?> z0Var, i9.y0 y0Var, t tVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, a2 a2Var, t0 t0Var, c0 c0Var) {
        this.f11824a = z0Var;
        this.f11833j = tVar;
        this.f11834k = j10;
        this.f11835l = j11;
        this.f11825b = executor;
        this.f11827d = scheduledExecutorService;
        this.f11828e = y0Var;
        this.f11829f = a2Var;
        if (a2Var != null) {
            this.f11847x = a2Var.f11005b;
        }
        this.f11830g = t0Var;
        b5.n.e(a2Var == null || t0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f11831h = t0Var != null;
        this.f11836m = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable c0(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f11832i) {
            if (this.f11838o.f11925f != null) {
                return null;
            }
            Collection<b0> collection = this.f11838o.f11922c;
            this.f11838o = this.f11838o.c(b0Var);
            this.f11833j.a(-this.f11843t);
            u uVar = this.f11845v;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f11845v = null;
                future = b10;
            } else {
                future = null;
            }
            u uVar2 = this.f11846w;
            if (uVar2 != null) {
                Future<?> b11 = uVar2.b();
                this.f11846w = null;
                future2 = b11;
            } else {
                future2 = null;
            }
            return new c(collection, b0Var, future, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(b0 b0Var) {
        Runnable c02 = c0(b0Var);
        if (c02 != null) {
            c02.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 e0(int i10, boolean z10) {
        int i11;
        do {
            i11 = this.f11841r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f11841r.compareAndSet(i11, i11 + 1));
        b0 b0Var = new b0(i10);
        b0Var.f11865a = j0(p0(this.f11828e, i10), new o(new s(b0Var)), i10, z10);
        return b0Var;
    }

    private void f0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f11832i) {
            if (!this.f11838o.f11920a) {
                this.f11838o.f11921b.add(rVar);
            }
            collection = this.f11838o.f11922c;
        }
        for (b0 b0Var : collection) {
            rVar.a(b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
        r8.f11826c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
        r0 = r9.f11865a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r8.f11838o.f11925f != r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        r9 = r8.f11848y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
        r9 = io.grpc.internal.z1.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        r0.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        if (r2.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
        r4 = (io.grpc.internal.z1.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
        if ((r4 instanceof io.grpc.internal.z1.y) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
        if (r1 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0094, code lost:
        r4 = r8.f11838o;
        r5 = r4.f11925f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
        if (r5 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (r5 == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
        if (r4.f11926g == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g0(io.grpc.internal.z1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L4:
            java.lang.Object r4 = r8.f11832i
            monitor-enter(r4)
            io.grpc.internal.z1$z r5 = r8.f11838o     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L18
            io.grpc.internal.z1$b0 r6 = r5.f11925f     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
        L11:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            goto L34
        L13:
            boolean r6 = r5.f11926g     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L18
            goto L11
        L18:
            java.util.List<io.grpc.internal.z1$r> r6 = r5.f11921b     // Catch: java.lang.Throwable -> La4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r6) goto L4d
            io.grpc.internal.z1$z r0 = r5.h(r9)     // Catch: java.lang.Throwable -> La4
            r8.f11838o = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r8.d()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            io.grpc.internal.z1$p r0 = new io.grpc.internal.z1$p     // Catch: java.lang.Throwable -> La4
            r0.<init>()     // Catch: java.lang.Throwable -> La4
            goto L11
        L34:
            if (r0 == 0) goto L3c
            java.util.concurrent.Executor r9 = r8.f11826c
            r9.execute(r0)
            return
        L3c:
            io.grpc.internal.q r0 = r9.f11865a
            io.grpc.internal.z1$z r1 = r8.f11838o
            io.grpc.internal.z1$b0 r1 = r1.f11925f
            if (r1 != r9) goto L47
            i9.j1 r9 = r8.f11848y
            goto L49
        L47:
            i9.j1 r9 = io.grpc.internal.z1.C
        L49:
            r0.a(r9)
            return
        L4d:
            boolean r6 = r9.f11866b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L53:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.z1$r> r7 = r5.f11921b     // Catch: java.lang.Throwable -> La4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f11921b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L79
        L6d:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.z1$r> r5 = r5.f11921b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L79:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r2 = r3.iterator()
        L7e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            io.grpc.internal.z1$r r4 = (io.grpc.internal.z1.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.z1.y
            if (r4 == 0) goto L92
            r1 = 1
        L92:
            if (r1 == 0) goto L7e
            io.grpc.internal.z1$z r4 = r8.f11838o
            io.grpc.internal.z1$b0 r5 = r4.f11925f
            if (r5 == 0) goto L9d
            if (r5 == r9) goto L9d
            goto La1
        L9d:
            boolean r4 = r4.f11926g
            if (r4 == 0) goto L7e
        La1:
            r2 = r6
            goto L4
        La4:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z1.g0(io.grpc.internal.z1$b0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Future<?> future;
        synchronized (this.f11832i) {
            u uVar = this.f11846w;
            future = null;
            if (uVar != null) {
                Future<?> b10 = uVar.b();
                this.f11846w = null;
                future = b10;
            }
            this.f11838o = this.f11838o.d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i0(z zVar) {
        return zVar.f11925f == null && zVar.f11924e < this.f11830g.f11656a && !zVar.f11927h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            h0();
            return;
        }
        synchronized (this.f11832i) {
            u uVar = this.f11846w;
            if (uVar == null) {
                return;
            }
            Future<?> b10 = uVar.b();
            u uVar2 = new u(this.f11832i);
            this.f11846w = uVar2;
            if (b10 != null) {
                b10.cancel(false);
            }
            uVar2.c(this.f11827d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
        this.f11826c.execute(new q(j1Var, aVar, y0Var));
    }

    @Override // io.grpc.internal.q
    public final void a(i9.j1 j1Var) {
        b0 b0Var = new b0(0);
        b0Var.f11865a = new o1();
        Runnable c02 = c0(b0Var);
        if (c02 != null) {
            this.f11842s = j1Var;
            c02.run();
            if (this.f11841r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                n0(j1Var, r.a.PROCESSED, new i9.y0());
                return;
            }
            return;
        }
        b0 b0Var2 = null;
        synchronized (this.f11832i) {
            if (this.f11838o.f11922c.contains(this.f11838o.f11925f)) {
                b0Var2 = this.f11838o.f11925f;
            } else {
                this.f11848y = j1Var;
            }
            this.f11838o = this.f11838o.b();
        }
        if (b0Var2 != null) {
            b0Var2.f11865a.a(j1Var);
        }
    }

    @Override // io.grpc.internal.j2
    public final void b(int i10) {
        z zVar = this.f11838o;
        if (zVar.f11920a) {
            zVar.f11925f.f11865a.b(i10);
        } else {
            f0(new m(i10));
        }
    }

    @Override // io.grpc.internal.j2
    public final void c(i9.n nVar) {
        f0(new d(nVar));
    }

    @Override // io.grpc.internal.j2
    public final boolean d() {
        for (b0 b0Var : this.f11838o.f11922c) {
            if (b0Var.f11865a.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public final void e(int i10) {
        f0(new j(i10));
    }

    @Override // io.grpc.internal.q
    public final void f(int i10) {
        f0(new k(i10));
    }

    @Override // io.grpc.internal.j2
    public final void flush() {
        z zVar = this.f11838o;
        if (zVar.f11920a) {
            zVar.f11925f.f11865a.flush();
        } else {
            f0(new g());
        }
    }

    @Override // io.grpc.internal.q
    public final void g(io.grpc.internal.r rVar) {
        c0 c0Var;
        this.f11844u = rVar;
        i9.j1 l02 = l0();
        if (l02 != null) {
            a(l02);
            return;
        }
        synchronized (this.f11832i) {
            this.f11838o.f11921b.add(new y());
        }
        b0 e02 = e0(0, false);
        if (e02 == null) {
            return;
        }
        if (this.f11831h) {
            u uVar = null;
            synchronized (this.f11832i) {
                this.f11838o = this.f11838o.a(e02);
                if (i0(this.f11838o) && ((c0Var = this.f11836m) == null || c0Var.a())) {
                    uVar = new u(this.f11832i);
                    this.f11846w = uVar;
                }
            }
            if (uVar != null) {
                uVar.c(this.f11827d.schedule(new w(uVar), this.f11830g.f11657b, TimeUnit.NANOSECONDS));
            }
        }
        g0(e02);
    }

    @Override // io.grpc.internal.q
    public final void h(i9.t tVar) {
        f0(new e(tVar));
    }

    @Override // io.grpc.internal.q
    public final void i(i9.v vVar) {
        f0(new f(vVar));
    }

    @Override // io.grpc.internal.j2
    public final void j(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    abstract io.grpc.internal.q j0(i9.y0 y0Var, k.a aVar, int i10, boolean z10);

    @Override // io.grpc.internal.q
    public final void k(String str) {
        f0(new b(str));
    }

    abstract void k0();

    @Override // io.grpc.internal.q
    public void l(x0 x0Var) {
        z zVar;
        x0 x0Var2;
        String str;
        synchronized (this.f11832i) {
            x0Var.b("closed", this.f11837n);
            zVar = this.f11838o;
        }
        if (zVar.f11925f != null) {
            x0Var2 = new x0();
            zVar.f11925f.f11865a.l(x0Var2);
            str = "committed";
        } else {
            x0Var2 = new x0();
            for (b0 b0Var : zVar.f11922c) {
                x0 x0Var3 = new x0();
                b0Var.f11865a.l(x0Var3);
                x0Var2.a(x0Var3);
            }
            str = "open";
        }
        x0Var.b(str, x0Var2);
    }

    abstract i9.j1 l0();

    @Override // io.grpc.internal.j2
    public void m() {
        f0(new l());
    }

    @Override // io.grpc.internal.q
    public final void n() {
        f0(new i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o0(ReqT reqt) {
        z zVar = this.f11838o;
        if (zVar.f11920a) {
            zVar.f11925f.f11865a.j(this.f11824a.j(reqt));
        } else {
            f0(new n(reqt));
        }
    }

    final i9.y0 p0(i9.y0 y0Var, int i10) {
        i9.y0 y0Var2 = new i9.y0();
        y0Var2.m(y0Var);
        if (i10 > 0) {
            y0Var2.p(A, String.valueOf(i10));
        }
        return y0Var2;
    }

    @Override // io.grpc.internal.q
    public final void q(boolean z10) {
        f0(new h(z10));
    }
}
