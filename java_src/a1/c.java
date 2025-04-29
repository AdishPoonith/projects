package a1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;
import p0.f0;
import t9.m0;
import t9.o;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f22a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f23b;

    static {
        Set<String> f10;
        f10 = m0.f("fb_mobile_purchase", "StartTrial", "Subscribe");
        f23b = f10;
    }

    private c() {
    }

    private final boolean c(q0.d dVar) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return (dVar.h() ^ true) || (dVar.h() && f23b.contains(dVar.f()));
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:5:0x000a, B:7:0x0017, B:12:0x0024), top: B:19:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d() {
        /*
            java.lang.Class<a1.c> r0 = a1.c.class
            boolean r1 = k1.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            p0.f0 r1 = p0.f0.f14852a     // Catch: java.lang.Throwable -> L2e
            android.content.Context r1 = p0.f0.l()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = p0.f0.z(r1)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            if (r1 != 0) goto L21
            f1.l0 r1 = f1.l0.f8470a     // Catch: java.lang.Throwable -> L2e
            boolean r1 = f1.l0.U()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L2d
            a1.e r1 = a1.e.f26a     // Catch: java.lang.Throwable -> L2e
            boolean r0 = a1.e.b()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2d
            r2 = 1
        L2d:
            return r2
        L2e:
            r1 = move-exception
            k1.a.b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.c.d():boolean");
    }

    public static final void e(final String applicationId, final q0.d event) {
        if (k1.a.d(c.class)) {
            return;
        }
        try {
            l.e(applicationId, "applicationId");
            l.e(event, "event");
            if (f22a.c(event)) {
                f0 f0Var = f0.f14852a;
                f0.t().execute(new Runnable() { // from class: a1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            k1.a.b(th, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String applicationId, q0.d event) {
        List b10;
        if (k1.a.d(c.class)) {
            return;
        }
        try {
            l.e(applicationId, "$applicationId");
            l.e(event, "$event");
            e eVar = e.f26a;
            b10 = o.b(event);
            e.c(applicationId, b10);
        } catch (Throwable th) {
            k1.a.b(th, c.class);
        }
    }

    public static final void g(final String str, final String str2) {
        if (k1.a.d(c.class)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            final Context l10 = f0.l();
            if (l10 == null || str == null || str2 == null) {
                return;
            }
            f0.t().execute(new Runnable() { // from class: a1.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.h(l10, str2, str);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        if (k1.a.d(c.class)) {
            return;
        }
        try {
            l.e(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String k10 = l.k(str2, "pingForOnDevice");
            if (sharedPreferences.getLong(k10, 0L) == 0) {
                e eVar = e.f26a;
                e.e(str2);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(k10, System.currentTimeMillis());
                edit.apply();
            }
        } catch (Throwable th) {
            k1.a.b(th, c.class);
        }
    }
}
