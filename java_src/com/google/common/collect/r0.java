package com.google.common.collect;

import java.util.Iterator;
/* loaded from: classes.dex */
abstract class r0<F, T> implements Iterator<T> {

    /* renamed from: j  reason: collision with root package name */
    final Iterator<? extends F> f6059j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Iterator<? extends F> it) {
        this.f6059j = (Iterator) b5.n.n(it);
    }

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6059j.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f6059j.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6059j.remove();
    }
}
