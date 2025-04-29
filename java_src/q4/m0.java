package q4;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class m0 extends t0 {

    /* renamed from: j  reason: collision with root package name */
    private final int f16198j;

    /* renamed from: k  reason: collision with root package name */
    private int f16199k;

    /* JADX INFO: Access modifiers changed from: protected */
    public m0(int i10, int i11) {
        k0.b(i11, i10, "index");
        this.f16198j = i10;
        this.f16199k = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16199k < this.f16198j;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16199k > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f16199k;
            this.f16199k = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16199k;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f16199k - 1;
            this.f16199k = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16199k - 1;
    }
}
