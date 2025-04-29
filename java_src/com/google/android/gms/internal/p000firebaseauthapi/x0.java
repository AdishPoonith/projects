package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.q0;
import h4.f;
import java.util.Map;
import java.util.concurrent.Executor;
import s.a;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x0  reason: invalid package */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f5617a = new a();

    public static q0.b a(String str, q0.b bVar, j0 j0Var) {
        e(str, j0Var);
        return new v0(bVar, str);
    }

    public static void c() {
        f5617a.clear();
    }

    public static boolean d(String str, q0.b bVar, Activity activity, Executor executor) {
        Map map = f5617a;
        if (!map.containsKey(str)) {
            e(str, null);
            return false;
        }
        w0 w0Var = (w0) map.get(str);
        if (f.c().b() - w0Var.f5565b >= 120000) {
            e(str, null);
            return false;
        }
        j0 j0Var = w0Var.f5564a;
        if (j0Var != null) {
            j0Var.g(bVar, activity, executor, str);
            return true;
        }
        return true;
    }

    private static void e(String str, j0 j0Var) {
        f5617a.put(str, new w0(j0Var, f.c().b()));
    }
}
