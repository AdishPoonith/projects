package p0;
/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: m  reason: collision with root package name */
    public static final a f15000m = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private final int f15001k;

    /* renamed from: l  reason: collision with root package name */
    private final String f15002l;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public q(String str, int i10, String str2) {
        super(str);
        this.f15001k = i10;
        this.f15002l = str2;
    }

    @Override // p0.s, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f15001k + ", message: " + getMessage() + ", url: " + this.f15002l + "}";
        kotlin.jvm.internal.l.d(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
