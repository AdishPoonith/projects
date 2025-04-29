package s9;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class d<T> implements h<T>, Serializable {

    /* renamed from: j  reason: collision with root package name */
    private final T f17860j;

    public d(T t10) {
        this.f17860j = t10;
    }

    @Override // s9.h
    public T getValue() {
        return this.f17860j;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
