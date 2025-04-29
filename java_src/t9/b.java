package t9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class b<T> implements Iterator<T>, ea.a {

    /* renamed from: j  reason: collision with root package name */
    private p0 f18366j = p0.f18402k;

    /* renamed from: k  reason: collision with root package name */
    private T f18367k;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18368a;

        static {
            int[] iArr = new int[p0.values().length];
            try {
                iArr[p0.f18403l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p0.f18401j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18368a = iArr;
        }
    }

    private final boolean e() {
        this.f18366j = p0.f18404m;
        a();
        return this.f18366j == p0.f18401j;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f18366j = p0.f18403l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(T t10) {
        this.f18367k = t10;
        this.f18366j = p0.f18401j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        p0 p0Var = this.f18366j;
        if (p0Var != p0.f18404m) {
            int i10 = a.f18368a[p0Var.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return e();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f18366j = p0.f18402k;
            return this.f18367k;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
