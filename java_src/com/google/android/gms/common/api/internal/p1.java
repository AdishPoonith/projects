package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class p1 extends k1 {

    /* renamed from: c  reason: collision with root package name */
    public final j.a f3911c;

    public p1(j.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f3911c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final /* bridge */ /* synthetic */ void d(z zVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final boolean f(j0 j0Var) {
        y0 y0Var = (y0) j0Var.v().get(this.f3911c);
        return y0Var != null && y0Var.f3959a.f();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final b4.d[] g(j0 j0Var) {
        y0 y0Var = (y0) j0Var.v().get(this.f3911c);
        if (y0Var == null) {
            return null;
        }
        return y0Var.f3959a.c();
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void h(j0 j0Var) {
        y0 y0Var = (y0) j0Var.v().remove(this.f3911c);
        if (y0Var == null) {
            this.f3867b.trySetResult(Boolean.FALSE);
            return;
        }
        y0Var.f3960b.b(j0Var.t(), this.f3867b);
        y0Var.f3959a.a();
    }
}
