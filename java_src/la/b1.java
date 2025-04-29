package la;

import java.util.concurrent.Future;
/* loaded from: classes.dex */
final class b1 implements c1 {

    /* renamed from: j  reason: collision with root package name */
    private final Future<?> f13581j;

    public b1(Future<?> future) {
        this.f13581j = future;
    }

    @Override // la.c1
    public void b() {
        this.f13581j.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f13581j + ']';
    }
}
