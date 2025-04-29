package kotlin.jvm.internal;
/* loaded from: classes.dex */
public abstract class o extends q implements ia.f {
    public o(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.c
    protected ia.b computeReflected() {
        return t.d(this);
    }

    @Override // da.a
    public Object invoke() {
        return get();
    }
}
