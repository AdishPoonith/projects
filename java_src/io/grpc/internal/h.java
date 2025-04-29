package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f11330c = Logger.getLogger(h.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final String f11331a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f11332b;

    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f11333a;

        private b(long j10) {
            this.f11333a = j10;
        }

        public void a() {
            long j10 = this.f11333a;
            long max = Math.max(2 * j10, j10);
            if (h.this.f11332b.compareAndSet(this.f11333a, max)) {
                h.f11330c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f11331a, Long.valueOf(max)});
            }
        }

        public long b() {
            return this.f11333a;
        }
    }

    public h(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f11332b = atomicLong;
        b5.n.e(j10 > 0, "value must be positive");
        this.f11331a = str;
        atomicLong.set(j10);
    }

    public b d() {
        return new b(this.f11332b.get());
    }
}
