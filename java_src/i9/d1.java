package i9;
/* loaded from: classes.dex */
abstract class d1<ReqT, RespT> extends g<ReqT, RespT> {
    @Override // i9.g
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // i9.g
    public void b() {
        f().b();
    }

    @Override // i9.g
    public void c(int i10) {
        f().c(i10);
    }

    protected abstract g<?, ?> f();

    public String toString() {
        return b5.h.c(this).d("delegate", f()).toString();
    }
}
