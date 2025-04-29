package p0;
/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: k  reason: collision with root package name */
    private final o0 f15018k;

    public t(o0 o0Var, String str) {
        super(str);
        this.f15018k = o0Var;
    }

    @Override // p0.s, java.lang.Throwable
    public String toString() {
        o0 o0Var = this.f15018k;
        v b10 = o0Var == null ? null : o0Var.b();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (b10 != null) {
            sb.append("httpResponseCode: ");
            sb.append(b10.f());
            sb.append(", facebookErrorCode: ");
            sb.append(b10.b());
            sb.append(", facebookErrorType: ");
            sb.append(b10.d());
            sb.append(", message: ");
            sb.append(b10.c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.d(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
