package i9;

import i9.y;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class y<T extends y<T>> extends v0<T> {
    protected abstract v0<?> e();

    @Override // i9.v0
    /* renamed from: f */
    public T c(long j10, TimeUnit timeUnit) {
        e().c(j10, timeUnit);
        return g();
    }

    protected final T g() {
        return this;
    }

    @Override // i9.v0
    /* renamed from: h */
    public T d() {
        e().d();
        return g();
    }

    public String toString() {
        return b5.h.c(this).d("delegate", e()).toString();
    }
}
