package i9;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class t implements Comparable<t> {

    /* renamed from: m  reason: collision with root package name */
    private static final b f10046m = new b();

    /* renamed from: n  reason: collision with root package name */
    private static final long f10047n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f10048o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f10049p;

    /* renamed from: j  reason: collision with root package name */
    private final c f10050j;

    /* renamed from: k  reason: collision with root package name */
    private final long f10051k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f10052l;

    /* loaded from: classes.dex */
    private static class b extends c {
        private b() {
        }

        @Override // i9.t.c
        public long a() {
            return System.nanoTime();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f10047n = nanos;
        f10048o = -nanos;
        f10049p = TimeUnit.SECONDS.toNanos(1L);
    }

    private t(c cVar, long j10, long j11, boolean z10) {
        this.f10050j = cVar;
        long min = Math.min(f10047n, Math.max(f10048o, j11));
        this.f10051k = j10 + min;
        this.f10052l = z10 && min <= 0;
    }

    private t(c cVar, long j10, boolean z10) {
        this(cVar, cVar.a(), j10, z10);
    }

    public static t b(long j10, TimeUnit timeUnit) {
        return g(j10, timeUnit, f10046m);
    }

    public static t g(long j10, TimeUnit timeUnit, c cVar) {
        h(timeUnit, "units");
        return new t(cVar, timeUnit.toNanos(j10), true);
    }

    private static <T> T h(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void i(t tVar) {
        if (this.f10050j == tVar.f10050j) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f10050j + " and " + tVar.f10050j + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            c cVar = this.f10050j;
            if (cVar != null ? cVar == tVar.f10050j : tVar.f10050j == null) {
                return this.f10051k == tVar.f10051k;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f10050j, Long.valueOf(this.f10051k)).hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: k */
    public int compareTo(t tVar) {
        i(tVar);
        int i10 = ((this.f10051k - tVar.f10051k) > 0L ? 1 : ((this.f10051k - tVar.f10051k) == 0L ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public boolean l(t tVar) {
        i(tVar);
        return this.f10051k - tVar.f10051k < 0;
    }

    public boolean n() {
        if (!this.f10052l) {
            if (this.f10051k - this.f10050j.a() > 0) {
                return false;
            }
            this.f10052l = true;
        }
        return true;
    }

    public t o(t tVar) {
        i(tVar);
        return l(tVar) ? this : tVar;
    }

    public long p(TimeUnit timeUnit) {
        long a10 = this.f10050j.a();
        if (!this.f10052l && this.f10051k - a10 <= 0) {
            this.f10052l = true;
        }
        return timeUnit.convert(this.f10051k - a10, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long p10 = p(TimeUnit.NANOSECONDS);
        long abs = Math.abs(p10);
        long j10 = f10049p;
        long j11 = abs / j10;
        long abs2 = Math.abs(p10) % j10;
        StringBuilder sb = new StringBuilder();
        if (p10 < 0) {
            sb.append('-');
        }
        sb.append(j11);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f10050j != f10046m) {
            sb.append(" (ticker=" + this.f10050j + ")");
        }
        return sb.toString();
    }
}
