package ja;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import s9.n;
import s9.o;
import s9.u;
/* loaded from: classes.dex */
final class c<T> extends d<T> implements Iterator<T>, v9.d<u>, ea.a {

    /* renamed from: j  reason: collision with root package name */
    private int f12413j;

    /* renamed from: k  reason: collision with root package name */
    private T f12414k;

    /* renamed from: l  reason: collision with root package name */
    private Iterator<? extends T> f12415l;

    /* renamed from: m  reason: collision with root package name */
    private v9.d<? super u> f12416m;

    private final Throwable e() {
        int i10 = this.f12413j;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f12413j);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // ja.d
    public Object a(T t10, v9.d<? super u> dVar) {
        this.f12414k = t10;
        this.f12413j = 3;
        this.f12416m = dVar;
        Object c10 = w9.b.c();
        if (c10 == w9.b.c()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return c10 == w9.b.c() ? c10 : u.f17878a;
    }

    @Override // v9.d
    public v9.g getContext() {
        return v9.h.f19537j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f12413j;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f12415l;
                l.b(it);
                if (it.hasNext()) {
                    this.f12413j = 2;
                    return true;
                }
                this.f12415l = null;
            }
            this.f12413j = 5;
            v9.d<? super u> dVar = this.f12416m;
            l.b(dVar);
            this.f12416m = null;
            n.a aVar = n.f17870k;
            dVar.resumeWith(n.b(u.f17878a));
        }
    }

    public final void i(v9.d<? super u> dVar) {
        this.f12416m = dVar;
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f12413j;
        if (i10 == 0 || i10 == 1) {
            return h();
        }
        if (i10 == 2) {
            this.f12413j = 1;
            Iterator<? extends T> it = this.f12415l;
            l.b(it);
            return it.next();
        } else if (i10 == 3) {
            this.f12413j = 0;
            T t10 = this.f12414k;
            this.f12414k = null;
            return t10;
        } else {
            throw e();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // v9.d
    public void resumeWith(Object obj) {
        o.b(obj);
        this.f12413j = 4;
    }
}
