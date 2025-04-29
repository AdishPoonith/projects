package s9;

import java.io.Serializable;
/* loaded from: classes.dex */
final class p<T> implements h<T>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    private da.a<? extends T> f17873j;

    /* renamed from: k  reason: collision with root package name */
    private volatile Object f17874k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f17875l;

    public p(da.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f17873j = initializer;
        this.f17874k = s.f17877a;
        this.f17875l = obj == null ? this : obj;
    }

    public /* synthetic */ p(da.a aVar, Object obj, int i10, kotlin.jvm.internal.g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    public boolean a() {
        return this.f17874k != s.f17877a;
    }

    @Override // s9.h
    public T getValue() {
        T t10;
        T t11 = (T) this.f17874k;
        s sVar = s.f17877a;
        if (t11 != sVar) {
            return t11;
        }
        synchronized (this.f17875l) {
            t10 = (T) this.f17874k;
            if (t10 == sVar) {
                da.a<? extends T> aVar = this.f17873j;
                kotlin.jvm.internal.l.b(aVar);
                t10 = aVar.invoke();
                this.f17874k = t10;
                this.f17873j = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
