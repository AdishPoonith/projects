package na;
/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14377a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final c f14378b = new c();

    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f14379a;

        public a(Throwable th) {
            this.f14379a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.l.a(this.f14379a, ((a) obj).f14379a);
        }

        public int hashCode() {
            Throwable th = this.f14379a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // na.i.c
        public String toString() {
            return "Closed(" + this.f14379a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return i.b(new a(th));
        }

        public final <E> Object b() {
            return i.b(i.f14378b);
        }

        public final <E> Object c(E e10) {
            return i.b(e10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
