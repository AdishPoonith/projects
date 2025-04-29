package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a extends o {

    /* renamed from: h  reason: collision with root package name */
    private static final long f14737h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f14738i;

    /* renamed from: j  reason: collision with root package name */
    static a f14739j;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14740e;

    /* renamed from: f  reason: collision with root package name */
    private a f14741f;

    /* renamed from: g  reason: collision with root package name */
    private long f14742g;

    /* renamed from: okio.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0220a implements m {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ m f14743j;

        C0220a(m mVar) {
            this.f14743j = mVar;
        }

        @Override // okio.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.g();
            try {
                try {
                    this.f14743j.close();
                    a.this.i(true);
                } catch (IOException e10) {
                    throw a.this.h(e10);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        @Override // okio.m, java.io.Flushable
        public void flush() {
            a.this.g();
            try {
                try {
                    this.f14743j.flush();
                    a.this.i(true);
                } catch (IOException e10) {
                    throw a.this.h(e10);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        @Override // okio.m
        public void j(okio.c cVar, long j10) {
            p.b(cVar.f14751k, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                j jVar = cVar.f14750j;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += jVar.f14772c - jVar.f14771b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    jVar = jVar.f14775f;
                }
                a.this.g();
                try {
                    try {
                        this.f14743j.j(cVar, j11);
                        j10 -= j11;
                        a.this.i(true);
                    } catch (IOException e10) {
                        throw a.this.h(e10);
                    }
                } catch (Throwable th) {
                    a.this.i(false);
                    throw th;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f14743j + ")";
        }
    }

    /* loaded from: classes.dex */
    class b implements n {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ n f14745j;

        b(n nVar) {
            this.f14745j = nVar;
        }

        @Override // okio.n
        public long Q(okio.c cVar, long j10) {
            a.this.g();
            try {
                try {
                    long Q = this.f14745j.Q(cVar, j10);
                    a.this.i(true);
                    return Q;
                } catch (IOException e10) {
                    throw a.this.h(e10);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        @Override // okio.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.g();
            try {
                try {
                    this.f14745j.close();
                    a.this.i(true);
                } catch (IOException e10) {
                    throw a.this.h(e10);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f14745j + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.p();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<okio.a> r0 = okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.a r1 = okio.a.e()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.a r2 = okio.a.f14739j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                okio.a.f14739j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.p()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f14737h = millis;
        f14738i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a e() {
        a aVar = f14739j.f14741f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(f14737h);
            if (f14739j.f14741f != null || System.nanoTime() - nanoTime < f14738i) {
                return null;
            }
            return f14739j;
        }
        long l10 = aVar.l(nanoTime);
        if (l10 > 0) {
            long j10 = l10 / 1000000;
            a.class.wait(j10, (int) (l10 - (1000000 * j10)));
            return null;
        }
        f14739j.f14741f = aVar.f14741f;
        aVar.f14741f = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1.f14741f = r3.f14741f;
        r3.f14741f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean f(okio.a r3) {
        /*
            java.lang.Class<okio.a> r0 = okio.a.class
            monitor-enter(r0)
            okio.a r1 = okio.a.f14739j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            okio.a r2 = r1.f14741f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            okio.a r2 = r3.f14741f     // Catch: java.lang.Throwable -> L19
            r1.f14741f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f14741f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.a.f(okio.a):boolean");
    }

    private long l(long j10) {
        return this.f14742g - j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:16:0x003a, B:17:0x0040, B:19:0x0044, B:22:0x004d, B:23:0x0050, B:25:0x005a, B:15:0x0034, B:28:0x005f, B:29:0x0064), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void m(okio.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<okio.a> r0 = okio.a.class
            monitor-enter(r0)
            okio.a r1 = okio.a.f14739j     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            okio.a r1 = new okio.a     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            okio.a.f14739j = r1     // Catch: java.lang.Throwable -> L65
            okio.a$c r1 = new okio.a$c     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.a()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r7 = r7 + r1
            r6.f14742g = r7     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r9 == 0) goto L5f
            long r7 = r6.a()     // Catch: java.lang.Throwable -> L65
            r6.f14742g = r7     // Catch: java.lang.Throwable -> L65
        L3a:
            long r7 = r6.l(r1)     // Catch: java.lang.Throwable -> L65
            okio.a r9 = okio.a.f14739j     // Catch: java.lang.Throwable -> L65
        L40:
            okio.a r3 = r9.f14741f     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.l(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L50
        L4d:
            okio.a r9 = r9.f14741f     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            okio.a r7 = r9.f14741f     // Catch: java.lang.Throwable -> L65
            r6.f14741f = r7     // Catch: java.lang.Throwable -> L65
            r9.f14741f = r6     // Catch: java.lang.Throwable -> L65
            okio.a r6 = okio.a.f14739j     // Catch: java.lang.Throwable -> L65
            if (r9 != r6) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.a.m(okio.a, long, boolean):void");
    }

    public final void g() {
        if (this.f14740e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long d10 = d();
        boolean b10 = b();
        if (d10 != 0 || b10) {
            this.f14740e = true;
            m(this, d10, b10);
        }
    }

    final IOException h(IOException iOException) {
        return !j() ? iOException : k(iOException);
    }

    final void i(boolean z10) {
        if (j() && z10) {
            throw k(null);
        }
    }

    public final boolean j() {
        if (this.f14740e) {
            this.f14740e = false;
            return f(this);
        }
        return false;
    }

    protected IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final m n(m mVar) {
        return new C0220a(mVar);
    }

    public final n o(n nVar) {
        return new b(nVar);
    }

    protected void p() {
    }
}
