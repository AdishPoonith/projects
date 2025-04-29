package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
final class h0 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ i0 f3838j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(i0 i0Var) {
        this.f3838j = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        j0 j0Var = this.f3838j.f3847a;
        fVar = j0Var.f3855b;
        fVar2 = j0Var.f3855b;
        fVar.f(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
