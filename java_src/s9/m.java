package s9;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class m<A, B> implements Serializable {

    /* renamed from: j  reason: collision with root package name */
    private final A f17868j;

    /* renamed from: k  reason: collision with root package name */
    private final B f17869k;

    public m(A a10, B b10) {
        this.f17868j = a10;
        this.f17869k = b10;
    }

    public final A a() {
        return this.f17868j;
    }

    public final B b() {
        return this.f17869k;
    }

    public final A c() {
        return this.f17868j;
    }

    public final B d() {
        return this.f17869k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.l.a(this.f17868j, mVar.f17868j) && kotlin.jvm.internal.l.a(this.f17869k, mVar.f17869k);
        }
        return false;
    }

    public int hashCode() {
        A a10 = this.f17868j;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f17869k;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f17868j + ", " + this.f17869k + ')';
    }
}
