package p3;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private long f15386a;

    /* renamed from: b  reason: collision with root package name */
    private long f15387b;

    /* renamed from: c  reason: collision with root package name */
    private long f15388c;

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Long> f15389d = new ThreadLocal<>();

    public j0(long j10) {
        g(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long j(long j10) {
        return i(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f15387b == -9223372036854775807L) {
            long j11 = this.f15386a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) a.e(this.f15389d.get())).longValue();
            }
            this.f15387b = j11 - j10;
            notifyAll();
        }
        this.f15388c = j10;
        return j10 + this.f15387b;
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f15388c;
        if (j11 != -9223372036854775807L) {
            long i10 = i(j11);
            long j12 = (4294967296L + i10) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - i10) < Math.abs(j10 - i10)) {
                j10 = j13;
            }
        }
        return a(f(j10));
    }

    public synchronized long c() {
        long j10;
        j10 = this.f15386a;
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public synchronized long d() {
        long j10;
        j10 = this.f15388c;
        return j10 != -9223372036854775807L ? j10 + this.f15387b : c();
    }

    public synchronized long e() {
        return this.f15387b;
    }

    public synchronized void g(long j10) {
        this.f15386a = j10;
        this.f15387b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f15388c = -9223372036854775807L;
    }

    public synchronized void h(boolean z10, long j10) {
        a.f(this.f15386a == 9223372036854775806L);
        if (this.f15387b != -9223372036854775807L) {
            return;
        }
        if (z10) {
            this.f15389d.set(Long.valueOf(j10));
        } else {
            while (this.f15387b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
