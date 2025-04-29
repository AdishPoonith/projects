package t1;

import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b  reason: collision with root package name */
    public static final t1 f18160b;

    /* renamed from: a  reason: collision with root package name */
    private final a f18161a;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18162b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f18163a;

        public a(LogSessionId logSessionId) {
            this.f18163a = logSessionId;
        }
    }

    static {
        f18160b = p3.n0.f15397a < 31 ? new t1() : new t1(a.f18162b);
    }

    public t1() {
        this((a) null);
        p3.a.f(p3.n0.f15397a < 31);
    }

    public t1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private t1(a aVar) {
        this.f18161a = aVar;
    }

    public LogSessionId a() {
        return ((a) p3.a.e(this.f18161a)).f18163a;
    }
}
