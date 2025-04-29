package v9;

import da.p;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import v9.g;
/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: j  reason: collision with root package name */
    public static final h f19537j = new h();

    private h() {
    }

    private final Object readResolve() {
        return f19537j;
    }

    @Override // v9.g
    public <R> R N(R r10, p<? super R, ? super g.b, ? extends R> operation) {
        l.e(operation, "operation");
        return r10;
    }

    @Override // v9.g
    public <E extends g.b> E b(g.c<E> key) {
        l.e(key, "key");
        return null;
    }

    @Override // v9.g
    public g f0(g.c<?> key) {
        l.e(key, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    @Override // v9.g
    public g r(g context) {
        l.e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
