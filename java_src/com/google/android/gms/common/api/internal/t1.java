package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* loaded from: classes.dex */
final class t1 extends p0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f3929a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u1 f3930b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(u1 u1Var, Dialog dialog) {
        this.f3930b = u1Var;
        this.f3929a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.p0
    public final void a() {
        this.f3930b.f3943k.d();
        if (this.f3929a.isShowing()) {
            this.f3929a.dismiss();
        }
    }
}
