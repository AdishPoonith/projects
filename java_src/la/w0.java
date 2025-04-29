package la;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class w0<T> extends kotlinx.coroutines.internal.z<T> {

    /* renamed from: m  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13677m = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public w0(v9.g gVar, v9.d<? super T> dVar) {
        super(gVar, dVar);
        this._decision = 0;
    }

    private final boolean V0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f13677m.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean W0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f13677m.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.z, la.c2
    public void B(Object obj) {
        P0(obj);
    }

    @Override // kotlinx.coroutines.internal.z, la.a
    protected void P0(Object obj) {
        v9.d b10;
        if (V0()) {
            return;
        }
        b10 = w9.c.b(this.f12926l);
        kotlinx.coroutines.internal.g.c(b10, d0.a(obj, this.f12926l), null, 2, null);
    }

    public final Object U0() {
        Object c10;
        if (W0()) {
            c10 = w9.d.c();
            return c10;
        }
        Object h10 = d2.h(i0());
        if (h10 instanceof z) {
            throw ((z) h10).f13689a;
        }
        return h10;
    }
}
