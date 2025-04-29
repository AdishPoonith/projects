package g6;

import b6.e0;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f9020a;

    /* renamed from: b  reason: collision with root package name */
    private final T f9021b;

    public a(Class<T> cls, T t10) {
        this.f9020a = (Class) e0.b(cls);
        this.f9021b = (T) e0.b(t10);
    }

    public Class<T> a() {
        return this.f9020a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f9020a, this.f9021b);
    }
}
