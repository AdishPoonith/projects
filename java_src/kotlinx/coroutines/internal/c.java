package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class c<T> extends w {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f12869a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.f12866a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.w
    public c<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.w
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == b.f12866a) {
            obj2 = e(g(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t10, Object obj);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = b.f12866a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(f12869a, this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0L;
    }

    public abstract Object g(T t10);
}
