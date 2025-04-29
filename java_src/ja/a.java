package ja;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<b<T>> f12412a;

    public a(b<? extends T> sequence) {
        l.e(sequence, "sequence");
        this.f12412a = new AtomicReference<>(sequence);
    }

    @Override // ja.b
    public Iterator<T> iterator() {
        b<T> andSet = this.f12412a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
