package k1;

import android.os.Handler;
import android.os.Looper;
import h1.b;
import h1.c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import p0.f0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12490a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<Object> f12491b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f12492c;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class RunnableC0184a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Throwable f12493j;

        RunnableC0184a(Throwable th) {
            this.f12493j = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f12493j);
        }
    }

    private a() {
    }

    public static final void a() {
        f12492c = true;
    }

    public static final void b(Throwable th, Object o10) {
        l.e(o10, "o");
        if (f12492c) {
            f12491b.add(o10);
            f0 f0Var = f0.f14852a;
            if (f0.p()) {
                b bVar = b.f9064a;
                b.c(th);
                c.a aVar = c.a.f9074a;
                c.a.b(th, c.EnumC0151c.CrashShield).g();
            }
            e(th);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object o10) {
        l.e(o10, "o");
        return f12491b.contains(o10);
    }

    public static final void e(Throwable th) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0184a(th));
        }
    }
}
