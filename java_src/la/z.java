package la;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class z {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13688b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f13689a;

    public z(Throwable th, boolean z10) {
        this.f13689a = th;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ z(Throwable th, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f13688b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return o0.a(this) + '[' + this.f13689a + ']';
    }
}
