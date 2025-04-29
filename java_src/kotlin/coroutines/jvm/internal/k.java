package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.t;
/* loaded from: classes.dex */
public abstract class k extends j implements kotlin.jvm.internal.h<Object> {

    /* renamed from: j  reason: collision with root package name */
    private final int f12840j;

    public k(int i10, v9.d<Object> dVar) {
        super(dVar);
        this.f12840j = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.f12840j;
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
