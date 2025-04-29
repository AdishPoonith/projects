package p0;
/* loaded from: classes.dex */
public final class h0 extends s {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14907l = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private final v f14908k;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v requestError, String str) {
        super(str);
        kotlin.jvm.internal.l.e(requestError, "requestError");
        this.f14908k = requestError;
    }

    public final v c() {
        return this.f14908k;
    }

    @Override // p0.s, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f14908k.f() + ", facebookErrorCode: " + this.f14908k.b() + ", facebookErrorType: " + this.f14908k.d() + ", message: " + this.f14908k.c() + "}";
        kotlin.jvm.internal.l.d(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
