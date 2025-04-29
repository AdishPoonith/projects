package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.h0;
/* loaded from: classes.dex */
public class g0<T extends h0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private T[] f12887a;

    private final T[] f() {
        T[] tArr = this.f12887a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new h0[4];
            this.f12887a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((h0[]) copyOf);
            this.f12887a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i10) {
        this._size = i10;
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f12887a;
            kotlin.jvm.internal.l.b(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                kotlin.jvm.internal.l.b(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.l.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.l.b(t12);
            T t13 = tArr[i11];
            kotlin.jvm.internal.l.b(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f12887a;
            kotlin.jvm.internal.l.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.l.b(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.l.b(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f12887a;
        kotlin.jvm.internal.l.b(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.l.b(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.l.b(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.g(i10);
        t11.g(i11);
    }

    public final void a(T t10) {
        t10.h(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.g(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f12887a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.l() == null) {
                z10 = false;
            } else {
                h(t10.i());
                z10 = true;
            }
        }
        return z10;
    }

    public final T h(int i10) {
        T[] tArr = this.f12887a;
        kotlin.jvm.internal.l.b(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                kotlin.jvm.internal.l.b(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.l.b(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        kotlin.jvm.internal.l.b(t12);
        t12.h(null);
        t12.g(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
