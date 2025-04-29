package io.grpc.internal;

import io.grpc.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f11683g = Logger.getLogger(v0.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final long f11684a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.r f11685b;

    /* renamed from: c  reason: collision with root package name */
    private Map<s.a, Executor> f11686c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f11687d;

    /* renamed from: e  reason: collision with root package name */
    private Throwable f11688e;

    /* renamed from: f  reason: collision with root package name */
    private long f11689f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s.a f11690j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f11691k;

        a(s.a aVar, long j10) {
            this.f11690j = aVar;
            this.f11691k = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11690j.b(this.f11691k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ s.a f11692j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Throwable f11693k;

        b(s.a aVar, Throwable th) {
            this.f11692j = aVar;
            this.f11693k = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11692j.a(this.f11693k);
        }
    }

    public v0(long j10, b5.r rVar) {
        this.f11684a = j10;
        this.f11685b = rVar;
    }

    private static Runnable b(s.a aVar, long j10) {
        return new a(aVar, j10);
    }

    private static Runnable c(s.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f11683g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void g(s.a aVar, Executor executor, Throwable th) {
        e(executor, c(aVar, th));
    }

    public void a(s.a aVar, Executor executor) {
        synchronized (this) {
            if (!this.f11687d) {
                this.f11686c.put(aVar, executor);
                return;
            }
            Throwable th = this.f11688e;
            e(executor, th != null ? c(aVar, th) : b(aVar, this.f11689f));
        }
    }

    public boolean d() {
        synchronized (this) {
            if (this.f11687d) {
                return false;
            }
            this.f11687d = true;
            long d10 = this.f11685b.d(TimeUnit.NANOSECONDS);
            this.f11689f = d10;
            Map<s.a, Executor> map = this.f11686c;
            this.f11686c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                e(entry.getValue(), b(entry.getKey(), d10));
            }
            return true;
        }
    }

    public void f(Throwable th) {
        synchronized (this) {
            if (this.f11687d) {
                return;
            }
            this.f11687d = true;
            this.f11688e = th;
            Map<s.a, Executor> map = this.f11686c;
            this.f11686c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                g(entry.getKey(), entry.getValue(), th);
            }
        }
    }

    public long h() {
        return this.f11684a;
    }
}
