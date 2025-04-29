package b5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class a<T> implements Iterator<T> {

    /* renamed from: j  reason: collision with root package name */
    private b f2935j = b.NOT_READY;

    /* renamed from: k  reason: collision with root package name */
    private T f2936k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0058a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2937a;

        static {
            int[] iArr = new int[b.values().length];
            f2937a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2937a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f2935j = b.FAILED;
        this.f2936k = a();
        if (this.f2935j != b.DONE) {
            this.f2935j = b.READY;
            return true;
        }
        return false;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f2935j = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.t(this.f2935j != b.FAILED);
        int i10 = C0058a.f2937a[this.f2935j.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f2935j = b.NOT_READY;
            T t10 = (T) i.a(this.f2936k);
            this.f2936k = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
