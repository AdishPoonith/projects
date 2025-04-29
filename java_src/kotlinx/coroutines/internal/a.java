package kotlinx.coroutines.internal;

import java.util.Objects;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f12861a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f12862b;

    /* renamed from: c  reason: collision with root package name */
    private int f12863c;

    private final void b() {
        Object[] objArr = this.f12861a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        t9.j.d(objArr, objArr2, 0, this.f12862b, 0, 10, null);
        Object[] objArr3 = this.f12861a;
        int length2 = objArr3.length;
        int i10 = this.f12862b;
        t9.j.d(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f12861a = objArr2;
        this.f12862b = 0;
        this.f12863c = length;
    }

    public final void a(T t10) {
        Object[] objArr = this.f12861a;
        int i10 = this.f12863c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f12863c = length;
        if (length == this.f12862b) {
            b();
        }
    }

    public final boolean c() {
        return this.f12862b == this.f12863c;
    }

    public final T d() {
        int i10 = this.f12862b;
        if (i10 == this.f12863c) {
            return null;
        }
        Object[] objArr = this.f12861a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f12862b = (i10 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t10, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t10;
    }
}
