package c0;

import androidx.lifecycle.w;
import da.l;
/* loaded from: classes.dex */
public final class f<T extends w> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f3131a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f3132b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class<T> clazz, l<? super a, ? extends T> initializer) {
        kotlin.jvm.internal.l.e(clazz, "clazz");
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f3131a = clazz;
        this.f3132b = initializer;
    }

    public final Class<T> a() {
        return this.f3131a;
    }

    public final l<a, T> b() {
        return this.f3132b;
    }
}
