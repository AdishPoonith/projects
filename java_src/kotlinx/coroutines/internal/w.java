package kotlinx.coroutines.internal;

import la.o0;
/* loaded from: classes.dex */
public abstract class w {
    public abstract c<?> a();

    public final boolean b(w wVar) {
        c<?> a10;
        c<?> a11 = a();
        return (a11 == null || (a10 = wVar.a()) == null || a11.f() >= a10.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
