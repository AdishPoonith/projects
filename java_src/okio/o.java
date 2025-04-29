package okio;

import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    public static final o f14781d = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f14782a;

    /* renamed from: b  reason: collision with root package name */
    private long f14783b;

    /* renamed from: c  reason: collision with root package name */
    private long f14784c;

    /* loaded from: classes.dex */
    final class a extends o {
        a() {
        }

        @Override // okio.o
        public void c() {
        }
    }

    public long a() {
        if (this.f14782a) {
            return this.f14783b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean b() {
        return this.f14782a;
    }

    public void c() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f14782a && this.f14783b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long d() {
        return this.f14784c;
    }
}
