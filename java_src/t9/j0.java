package t9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class j0<T> extends c<T> implements RandomAccess {

    /* renamed from: k  reason: collision with root package name */
    private final Object[] f18384k;

    /* renamed from: l  reason: collision with root package name */
    private final int f18385l;

    /* renamed from: m  reason: collision with root package name */
    private int f18386m;

    /* renamed from: n  reason: collision with root package name */
    private int f18387n;

    /* loaded from: classes.dex */
    public static final class a extends b<T> {

        /* renamed from: l  reason: collision with root package name */
        private int f18388l;

        /* renamed from: m  reason: collision with root package name */
        private int f18389m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ j0<T> f18390n;

        a(j0<T> j0Var) {
            this.f18390n = j0Var;
            this.f18388l = j0Var.size();
            this.f18389m = ((j0) j0Var).f18386m;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t9.b
        protected void a() {
            if (this.f18388l == 0) {
                c();
                return;
            }
            d(((j0) this.f18390n).f18384k[this.f18389m]);
            this.f18389m = (this.f18389m + 1) % ((j0) this.f18390n).f18385l;
            this.f18388l--;
        }
    }

    public j0(int i10) {
        this(new Object[i10], 0);
    }

    public j0(Object[] buffer, int i10) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        this.f18384k = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f18385l = buffer.length;
            this.f18387n = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // t9.a
    public int b() {
        return this.f18387n;
    }

    @Override // t9.c, java.util.List
    public T get(int i10) {
        c.f18370j.a(i10, size());
        return (T) this.f18384k[(this.f18386m + i10) % this.f18385l];
    }

    @Override // t9.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void m(T t10) {
        if (q()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f18384k[(this.f18386m + size()) % this.f18385l] = t10;
        this.f18387n = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0<T> p(int i10) {
        int c10;
        Object[] array;
        int i11 = this.f18385l;
        c10 = ha.i.c(i11 + (i11 >> 1) + 1, i10);
        if (this.f18386m == 0) {
            array = Arrays.copyOf(this.f18384k, c10);
            kotlin.jvm.internal.l.d(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[c10]);
        }
        return new j0<>(array, size());
    }

    public final boolean q() {
        return size() == this.f18385l;
    }

    public final void r(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        } else if (i10 > 0) {
            int i11 = this.f18386m;
            int i12 = (i11 + i10) % this.f18385l;
            if (i11 > i12) {
                j.e(this.f18384k, null, i11, this.f18385l);
                j.e(this.f18384k, null, 0, i12);
            } else {
                j.e(this.f18384k, null, i11, i12);
            }
            this.f18386m = i12;
            this.f18387n = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t9.a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.l.e(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.l.d(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f18386m; i11 < size && i12 < this.f18385l; i12++) {
            array[i11] = this.f18384k[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f18384k[i10];
            i11++;
            i10++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
