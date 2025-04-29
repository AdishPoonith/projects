package kotlinx.coroutines.internal;

import la.v1;
/* loaded from: classes.dex */
public class z<T> extends la.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: l  reason: collision with root package name */
    public final v9.d<T> f12926l;

    /* JADX WARN: Multi-variable type inference failed */
    public z(v9.g gVar, v9.d<? super T> dVar) {
        super(gVar, true, true);
        this.f12926l = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // la.c2
    public void B(Object obj) {
        v9.d b10;
        b10 = w9.c.b(this.f12926l);
        g.c(b10, la.d0.a(obj, this.f12926l), null, 2, null);
    }

    @Override // la.a
    protected void P0(Object obj) {
        v9.d<T> dVar = this.f12926l;
        dVar.resumeWith(la.d0.a(obj, dVar));
    }

    public final v1 T0() {
        la.r h02 = h0();
        if (h02 != null) {
            return h02.getParent();
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        v9.d<T> dVar = this.f12926l;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // la.c2
    protected final boolean n0() {
        return true;
    }
}
