package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.c;
/* loaded from: classes.dex */
final class e0 implements c.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f3813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(f fVar) {
        this.f3813a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        Handler handler;
        Handler handler2;
        f fVar = this.f3813a;
        handler = fVar.f3830y;
        handler2 = fVar.f3830y;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
