package kotlinx.coroutines.internal;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12899a = new b0("CONDITION_FALSE");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f12900b = new b0("LIST_EMPTY");

    public static final Object a() {
        return f12899a;
    }

    public static final o b(Object obj) {
        o oVar;
        x xVar = obj instanceof x ? (x) obj : null;
        return (xVar == null || (oVar = xVar.f12925a) == null) ? (o) obj : oVar;
    }
}
