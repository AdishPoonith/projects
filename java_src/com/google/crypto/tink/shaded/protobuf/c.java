package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
abstract class c<E> extends AbstractList<E> implements b0.i<E> {

    /* renamed from: j  reason: collision with root package name */
    private boolean f6131j = true;

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    public final void a() {
        this.f6131j = false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        b();
        return super.add(e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        b();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (!this.f6131j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (obj instanceof RandomAccess) {
                List list = (List) obj;
                int size = size();
                if (size != list.size()) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (!get(i10).equals(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0.i
    public boolean h() {
        return this.f6131j;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }
}
