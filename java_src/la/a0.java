package la;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13574a;

    /* renamed from: b  reason: collision with root package name */
    public final da.l<Throwable, s9.u> f13575b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Object obj, da.l<? super Throwable, s9.u> lVar) {
        this.f13574a = obj;
        this.f13575b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.l.a(this.f13574a, a0Var.f13574a) && kotlin.jvm.internal.l.a(this.f13575b, a0Var.f13575b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f13574a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f13575b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f13574a + ", onCancellation=" + this.f13575b + ')';
    }
}
