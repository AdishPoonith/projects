package s9;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class n<T> implements Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final a f17870k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private final Object f17871j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: j  reason: collision with root package name */
        public final Throwable f17872j;

        public b(Throwable exception) {
            kotlin.jvm.internal.l.e(exception, "exception");
            this.f17872j = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.l.a(this.f17872j, ((b) obj).f17872j);
        }

        public int hashCode() {
            return this.f17872j.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f17872j + ')';
        }
    }

    private /* synthetic */ n(Object obj) {
        this.f17871j = obj;
    }

    public static final /* synthetic */ n a(Object obj) {
        return new n(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof n) && kotlin.jvm.internal.l.a(obj, ((n) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f17872j;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f17871j, obj);
    }

    public int hashCode() {
        return e(this.f17871j);
    }

    public final /* synthetic */ Object i() {
        return this.f17871j;
    }

    public String toString() {
        return h(this.f17871j);
    }
}
