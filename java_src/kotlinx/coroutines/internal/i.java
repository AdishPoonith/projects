package kotlinx.coroutines.internal;

import s9.n;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f12889a;

    static {
        Object b10;
        try {
            n.a aVar = s9.n.f17870k;
            b10 = s9.n.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            n.a aVar2 = s9.n.f17870k;
            b10 = s9.n.b(s9.o.a(th));
        }
        f12889a = s9.n.g(b10);
    }

    public static final boolean a() {
        return f12889a;
    }
}
