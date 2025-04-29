package la;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class w1 extends CancellationException {

    /* renamed from: j  reason: collision with root package name */
    public final transient v1 f13678j;

    public w1(String str, Throwable th, v1 v1Var) {
        super(str);
        this.f13678j = v1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof w1) {
                w1 w1Var = (w1) obj;
                if (!kotlin.jvm.internal.l.a(w1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.l.a(w1Var.f13678j, this.f13678j) || !kotlin.jvm.internal.l.a(w1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f13678j.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f13678j;
    }
}
