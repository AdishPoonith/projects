package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import java.util.Set;
/* loaded from: classes.dex */
public final class h1 extends z4.d implements f.a, f.b {

    /* renamed from: j  reason: collision with root package name */
    private static final a.AbstractC0085a f3839j = y4.e.f20489c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3840a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3841b;

    /* renamed from: c  reason: collision with root package name */
    private final a.AbstractC0085a f3842c;

    /* renamed from: f  reason: collision with root package name */
    private final Set f3843f;

    /* renamed from: g  reason: collision with root package name */
    private final c4.e f3844g;

    /* renamed from: h  reason: collision with root package name */
    private y4.f f3845h;

    /* renamed from: i  reason: collision with root package name */
    private g1 f3846i;

    public h1(Context context, Handler handler, c4.e eVar) {
        a.AbstractC0085a abstractC0085a = f3839j;
        this.f3840a = context;
        this.f3841b = handler;
        this.f3844g = (c4.e) c4.s.k(eVar, "ClientSettings must not be null");
        this.f3843f = eVar.g();
        this.f3842c = abstractC0085a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void J2(h1 h1Var, z4.l lVar) {
        b4.b B = lVar.B();
        if (B.F()) {
            c4.t0 t0Var = (c4.t0) c4.s.j(lVar.C());
            B = t0Var.B();
            if (B.F()) {
                h1Var.f3846i.b(t0Var.C(), h1Var.f3843f);
                h1Var.f3845h.n();
            }
            String valueOf = String.valueOf(B);
            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
        }
        h1Var.f3846i.c(B);
        h1Var.f3845h.n();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, y4.f] */
    public final void K2(g1 g1Var) {
        y4.f fVar = this.f3845h;
        if (fVar != null) {
            fVar.n();
        }
        this.f3844g.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0085a abstractC0085a = this.f3842c;
        Context context = this.f3840a;
        Looper looper = this.f3841b.getLooper();
        c4.e eVar = this.f3844g;
        this.f3845h = abstractC0085a.a(context, looper, eVar, eVar.h(), this, this);
        this.f3846i = g1Var;
        Set set = this.f3843f;
        if (set == null || set.isEmpty()) {
            this.f3841b.post(new e1(this));
        } else {
            this.f3845h.p();
        }
    }

    public final void L2() {
        y4.f fVar = this.f3845h;
        if (fVar != null) {
            fVar.n();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void M(Bundle bundle) {
        this.f3845h.l(this);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void p(int i10) {
        this.f3845h.n();
    }

    @Override // z4.f
    public final void w1(z4.l lVar) {
        this.f3841b.post(new f1(this, lVar));
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void x(b4.b bVar) {
        this.f3846i.c(bVar);
    }
}
