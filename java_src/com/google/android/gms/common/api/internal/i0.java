package com.google.android.gms.common.api.internal;

import android.os.Handler;
import c4.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 implements c.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j0 f3847a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(j0 j0Var) {
        this.f3847a = j0Var;
    }

    @Override // c4.c.e
    public final void a() {
        Handler handler;
        handler = this.f3847a.f3866o.f3830y;
        handler.post(new h0(this));
    }
}
