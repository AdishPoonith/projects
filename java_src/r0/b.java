package r0;

import android.app.Activity;
import f1.l0;
import f1.r;
import f1.v;
import kotlin.jvm.internal.l;
import p0.f0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16618a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f16619b = b.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f16620c;

    private b() {
    }

    public static final void b() {
        try {
            if (k1.a.d(b.class)) {
                return;
            }
            try {
                f0 f0Var = f0.f14852a;
                f0.t().execute(new Runnable() { // from class: r0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                l0 l0Var = l0.f8470a;
                l0.d0(f16619b, e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            if (f1.a.f8366f.h(f0.l())) {
                return;
            }
            f16618a.e();
            f16620c = true;
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            l.e(activity, "activity");
            try {
                if (f16620c && !d.f16622d.c().isEmpty()) {
                    f.f16629n.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    private final void e() {
        String f10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f8582a;
            f0 f0Var = f0.f14852a;
            r n10 = v.n(f0.m(), false);
            if (n10 == null || (f10 = n10.f()) == null) {
                return;
            }
            d.f16622d.d(f10);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
