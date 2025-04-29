package b6;

import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f3011a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f3012b;

    /* loaded from: classes.dex */
    private @interface a {
    }

    public f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f3011a = cls;
        this.f3012b = cls2;
    }

    public static <T> f0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new f0<>(cls, cls2);
    }

    public static <T> f0<T> b(Class<T> cls) {
        return new f0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f3012b.equals(f0Var.f3012b)) {
            return this.f3011a.equals(f0Var.f3011a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f3012b.hashCode() * 31) + this.f3011a.hashCode();
    }

    public String toString() {
        if (this.f3011a == a.class) {
            return this.f3012b.getName();
        }
        return "@" + this.f3011a.getName() + " " + this.f3012b.getName();
    }
}
