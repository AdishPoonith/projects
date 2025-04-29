package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b4.j;
import c4.r;
import com.google.android.gms.common.api.e;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import z3.q;
/* loaded from: classes.dex */
public class b extends com.google.android.gms.common.api.e<GoogleSignInOptions> {

    /* renamed from: k  reason: collision with root package name */
    private static final f f3724k = new f(null);

    /* renamed from: l  reason: collision with root package name */
    static int f3725l = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, u3.a.f19016c, googleSignInOptions, new com.google.android.gms.common.api.internal.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, u3.a.f19016c, googleSignInOptions, new e.a.C0087a().c(new com.google.android.gms.common.api.internal.a()).a());
    }

    private final synchronized int D() {
        int i10;
        i10 = f3725l;
        if (i10 == 1) {
            Context r10 = r();
            b4.e m10 = b4.e.m();
            int g10 = m10.g(r10, j.f2913a);
            if (g10 == 0) {
                f3725l = 4;
                i10 = 4;
            } else if (m10.a(r10, g10, null) != null || DynamiteModule.a(r10, "com.google.android.gms.auth.api.fallback") == 0) {
                f3725l = 2;
                i10 = 2;
            } else {
                f3725l = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    public Task<Void> A() {
        return r.b(q.f(g(), r(), D() == 3));
    }

    public Task<Void> B() {
        return r.b(q.g(g(), r(), D() == 3));
    }

    public Task<GoogleSignInAccount> C() {
        return r.a(q.e(g(), r(), q(), D() == 3), f3724k);
    }

    public Intent z() {
        Context r10 = r();
        int D = D();
        int i10 = D - 1;
        if (D != 0) {
            return i10 != 2 ? i10 != 3 ? q.b(r10, q()) : q.c(r10, q()) : q.a(r10, q());
        }
        throw null;
    }
}
