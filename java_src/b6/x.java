package b6;
/* loaded from: classes.dex */
public class x<T> implements s6.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f3061c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f3062a = f3061c;

    /* renamed from: b  reason: collision with root package name */
    private volatile s6.b<T> f3063b;

    public x(s6.b<T> bVar) {
        this.f3063b = bVar;
    }

    @Override // s6.b
    public T get() {
        T t10 = (T) this.f3062a;
        Object obj = f3061c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f3062a;
                if (t10 == obj) {
                    t10 = this.f3063b.get();
                    this.f3062a = t10;
                    this.f3063b = null;
                }
            }
        }
        return t10;
    }
}
