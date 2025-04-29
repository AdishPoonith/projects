package la;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
final class t1 extends x1 {

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13667o = AtomicIntegerFieldUpdater.newUpdater(t1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: n  reason: collision with root package name */
    private final da.l<Throwable, s9.u> f13668n;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(da.l<? super Throwable, s9.u> lVar) {
        this.f13668n = lVar;
    }

    @Override // la.b0
    public void A(Throwable th) {
        if (f13667o.compareAndSet(this, 0, 1)) {
            this.f13668n.invoke(th);
        }
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        A(th);
        return s9.u.f17878a;
    }
}
