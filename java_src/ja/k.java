package ja;

import da.l;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class k<T, R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f12420a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, R> f12421b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R>, ea.a {

        /* renamed from: j  reason: collision with root package name */
        private final Iterator<T> f12422j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k<T, R> f12423k;

        a(k<T, R> kVar) {
            this.f12423k = kVar;
            this.f12422j = ((k) kVar).f12420a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12422j.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((k) this.f12423k).f12421b.invoke(this.f12422j.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(b<? extends T> sequence, l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.l.e(sequence, "sequence");
        kotlin.jvm.internal.l.e(transformer, "transformer");
        this.f12420a = sequence;
        this.f12421b = transformer;
    }

    @Override // ja.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
