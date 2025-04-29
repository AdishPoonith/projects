package t9;

import java.util.AbstractList;
/* loaded from: classes.dex */
public abstract class d<E> extends AbstractList<E> implements ea.b {
    public abstract int b();

    public abstract E e(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return e(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
