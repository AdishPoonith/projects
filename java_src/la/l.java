package la;
/* loaded from: classes.dex */
public interface l<T> extends v9.d<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(l lVar, Object obj, Object obj2, int i10, Object obj3) {
            if (obj3 == null) {
                if ((i10 & 2) != 0) {
                    obj2 = null;
                }
                return lVar.c(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    Object c(T t10, Object obj);

    Object d(T t10, Object obj, da.l<? super Throwable, s9.u> lVar);

    void f(T t10, da.l<? super Throwable, s9.u> lVar);

    boolean g(Throwable th);

    void j(da.l<? super Throwable, s9.u> lVar);

    Object o(Throwable th);

    void p(Object obj);
}
