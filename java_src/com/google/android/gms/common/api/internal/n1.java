package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class n1 extends k1 {

    /* renamed from: c  reason: collision with root package name */
    public final y0 f3892c;

    public n1(y0 y0Var, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f3892c = y0Var;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final /* bridge */ /* synthetic */ void d(z zVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final boolean f(j0 j0Var) {
        return this.f3892c.f3959a.f();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final b4.d[] g(j0 j0Var) {
        return this.f3892c.f3959a.c();
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void h(j0 j0Var) {
        this.f3892c.f3959a.d(j0Var.t(), this.f3867b);
        j.a b10 = this.f3892c.f3959a.b();
        if (b10 != null) {
            j0Var.v().put(b10, this.f3892c);
        }
    }
}
