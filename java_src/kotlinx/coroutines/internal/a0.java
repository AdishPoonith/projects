package kotlinx.coroutines.internal;

import s9.n;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12864a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f12865b;

    static {
        Object b10;
        Object b11;
        try {
            n.a aVar = s9.n.f17870k;
            b10 = s9.n.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            n.a aVar2 = s9.n.f17870k;
            b10 = s9.n.b(s9.o.a(th));
        }
        if (s9.n.d(b10) != null) {
            b10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f12864a = (String) b10;
        try {
            n.a aVar3 = s9.n.f17870k;
            b11 = s9.n.b(a0.class.getCanonicalName());
        } catch (Throwable th2) {
            n.a aVar4 = s9.n.f17870k;
            b11 = s9.n.b(s9.o.a(th2));
        }
        if (s9.n.d(b11) != null) {
            b11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f12865b = (String) b11;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
