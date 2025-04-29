package i9;

import i9.g;
/* loaded from: classes.dex */
public abstract class z<ReqT, RespT> extends d1<ReqT, RespT> {
    @Override // i9.d1, i9.g
    public /* bridge */ /* synthetic */ void a(String str, Throwable th) {
        super.a(str, th);
    }

    @Override // i9.d1, i9.g
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // i9.d1, i9.g
    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    @Override // i9.g
    public void d(ReqT reqt) {
        f().d(reqt);
    }

    @Override // i9.g
    public void e(g.a<RespT> aVar, y0 y0Var) {
        f().e(aVar, y0Var);
    }

    @Override // i9.d1
    protected abstract g<ReqT, RespT> f();

    @Override // i9.d1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
