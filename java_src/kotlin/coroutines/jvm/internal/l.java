package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.t;
/* loaded from: classes.dex */
public abstract class l extends d implements kotlin.jvm.internal.h<Object> {
    private final int arity;

    public l(int i10) {
        this(i10, null);
    }

    public l(int i10, v9.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String e10 = t.e(this);
            kotlin.jvm.internal.l.d(e10, "renderLambdaToString(this)");
            return e10;
        }
        return super.toString();
    }
}
