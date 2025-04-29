package p0;

import android.os.Handler;
import p0.j0;
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14813a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f14814b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14815c;

    /* renamed from: d  reason: collision with root package name */
    private long f14816d;

    /* renamed from: e  reason: collision with root package name */
    private long f14817e;

    /* renamed from: f  reason: collision with root package name */
    private long f14818f;

    public b1(Handler handler, j0 request) {
        kotlin.jvm.internal.l.e(request, "request");
        this.f14813a = handler;
        this.f14814b = request;
        f0 f0Var = f0.f14852a;
        this.f14815c = f0.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j0.b bVar, long j10, long j11) {
        ((j0.f) bVar).a(j10, j11);
    }

    public final void b(long j10) {
        long j11 = this.f14816d + j10;
        this.f14816d = j11;
        if (j11 >= this.f14817e + this.f14815c || j11 >= this.f14818f) {
            d();
        }
    }

    public final void c(long j10) {
        this.f14818f += j10;
    }

    public final void d() {
        if (this.f14816d > this.f14817e) {
            final j0.b o10 = this.f14814b.o();
            final long j10 = this.f14818f;
            if (j10 <= 0 || !(o10 instanceof j0.f)) {
                return;
            }
            final long j11 = this.f14816d;
            Handler handler = this.f14813a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: p0.a1
                @Override // java.lang.Runnable
                public final void run() {
                    b1.e(j0.b.this, j11, j10);
                }
            }))) == null) {
                ((j0.f) o10).a(j11, j10);
            }
            this.f14817e = this.f14816d;
        }
    }
}
