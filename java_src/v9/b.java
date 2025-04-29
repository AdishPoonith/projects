package v9;

import da.l;
import v9.g;
import v9.g.b;
/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: j  reason: collision with root package name */
    private final l<g.b, E> f19525j;

    /* renamed from: k  reason: collision with root package name */
    private final g.c<?> f19526k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [da.l<v9.g$b, E extends B>, java.lang.Object, da.l<? super v9.g$b, ? extends E extends B>] */
    public b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        kotlin.jvm.internal.l.e(baseKey, "baseKey");
        kotlin.jvm.internal.l.e(safeCast, "safeCast");
        this.f19525j = safeCast;
        this.f19526k = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f19526k : baseKey;
    }

    public final boolean a(g.c<?> key) {
        kotlin.jvm.internal.l.e(key, "key");
        return key == this || this.f19526k == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lv9/g$b;)TE; */
    public final g.b b(g.b element) {
        kotlin.jvm.internal.l.e(element, "element");
        return (g.b) this.f19525j.invoke(element);
    }
}
