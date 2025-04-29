package w0;

import android.content.Context;
import w0.h;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f19564a = new f();

    private f() {
    }

    private final void c() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            j jVar = j.f19601a;
            h.b bVar = h.f19567s;
            j.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final void d(Context context) {
        h.b bVar;
        h c10;
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            m mVar = m.f19616a;
            if (m.a("com.android.billingclient.api.Purchase") == null || (c10 = (bVar = h.f19567s).c(context)) == null || !bVar.f().get()) {
                return;
            }
            j jVar = j.f19601a;
            if (j.d()) {
                c10.p("inapp", new Runnable() { // from class: w0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.e();
                    }
                });
            } else {
                c10.o("inapp", new Runnable() { // from class: w0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f();
                    }
                });
            }
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            f19564a.c();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        if (k1.a.d(f.class)) {
            return;
        }
        try {
            f19564a.c();
        } catch (Throwable th) {
            k1.a.b(th, f.class);
        }
    }
}
