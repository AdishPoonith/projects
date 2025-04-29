package kotlin.coroutines.jvm.internal;

import v9.g;
/* loaded from: classes.dex */
public abstract class d extends a {
    private final v9.g _context;
    private transient v9.d<Object> intercepted;

    public d(v9.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(v9.d<Object> dVar, v9.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // v9.d
    public v9.g getContext() {
        v9.g gVar = this._context;
        kotlin.jvm.internal.l.b(gVar);
        return gVar;
    }

    public final v9.d<Object> intercepted() {
        v9.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            v9.e eVar = (v9.e) getContext().b(v9.e.f19534h);
            if (eVar == null || (dVar = eVar.g0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        v9.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b b10 = getContext().b(v9.e.f19534h);
            kotlin.jvm.internal.l.b(b10);
            ((v9.e) b10).e(dVar);
        }
        this.intercepted = c.f12833j;
    }
}
