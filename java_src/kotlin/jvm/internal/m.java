package kotlin.jvm.internal;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String f10 = t.f(this);
        l.d(f10, "renderLambdaToString(this)");
        return f10;
    }
}
