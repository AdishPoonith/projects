package la;
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13601a = new kotlinx.coroutines.internal.b0("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.b0 f13602b = new kotlinx.coroutines.internal.b0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13603c = new kotlinx.coroutines.internal.b0("COMPLETING_RETRY");

    /* renamed from: d  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13604d = new kotlinx.coroutines.internal.b0("TOO_LATE_TO_CANCEL");

    /* renamed from: e  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.b0 f13605e = new kotlinx.coroutines.internal.b0("SEALED");

    /* renamed from: f  reason: collision with root package name */
    private static final f1 f13606f = new f1(false);

    /* renamed from: g  reason: collision with root package name */
    private static final f1 f13607g = new f1(true);

    public static final Object g(Object obj) {
        return obj instanceof q1 ? new r1((q1) obj) : obj;
    }

    public static final Object h(Object obj) {
        q1 q1Var;
        r1 r1Var = obj instanceof r1 ? (r1) obj : null;
        return (r1Var == null || (q1Var = r1Var.f13662a) == null) ? obj : q1Var;
    }
}
