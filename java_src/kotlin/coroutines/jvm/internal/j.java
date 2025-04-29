package kotlin.coroutines.jvm.internal;
/* loaded from: classes.dex */
public abstract class j extends a {
    public j(v9.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == v9.h.f19537j)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // v9.d
    public v9.g getContext() {
        return v9.h.f19537j;
    }
}
