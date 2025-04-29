package la;
/* loaded from: classes.dex */
final class v<T> extends c2 implements u<T> {
    public v(v1 v1Var) {
        super(true);
        l0(v1Var);
    }

    @Override // la.u
    public boolean C(T t10) {
        return r0(t10);
    }

    @Override // la.c2
    public boolean c0() {
        return true;
    }

    @Override // la.r0
    public Object e0(v9.d<? super T> dVar) {
        Object D = D(dVar);
        w9.d.c();
        return D;
    }

    @Override // la.r0
    public T m() {
        return (T) X();
    }

    @Override // la.u
    public boolean z(Throwable th) {
        return r0(new z(th, false, 2, null));
    }
}
