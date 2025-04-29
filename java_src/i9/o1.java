package i9;

import i9.r;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class o1 extends r.c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f10007a = Logger.getLogger(o1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static final ThreadLocal<r> f10008b = new ThreadLocal<>();

    @Override // i9.r.c
    public r b() {
        r rVar = f10008b.get();
        return rVar == null ? r.f10022d : rVar;
    }

    @Override // i9.r.c
    public void c(r rVar, r rVar2) {
        ThreadLocal<r> threadLocal;
        if (b() != rVar) {
            f10007a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f10022d) {
            threadLocal = f10008b;
        } else {
            threadLocal = f10008b;
            rVar2 = null;
        }
        threadLocal.set(rVar2);
    }

    @Override // i9.r.c
    public r d(r rVar) {
        r b10 = b();
        f10008b.set(rVar);
        return b10;
    }
}
