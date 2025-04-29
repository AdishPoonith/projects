package ma;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import s9.n;
import s9.o;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13964a;
    private static volatile Choreographer choreographer;

    static {
        Object b10;
        try {
            n.a aVar = n.f17870k;
            b10 = n.b(new d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            n.a aVar2 = n.f17870k;
            b10 = n.b(o.a(th));
        }
        f13964a = n.f(b10) ? null : b10;
    }

    public static final Handler a(Looper looper, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
