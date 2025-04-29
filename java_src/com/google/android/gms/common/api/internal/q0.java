package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f3912a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f3913b;

    public q0(p0 p0Var) {
        this.f3913b = p0Var;
    }

    public final void a(Context context) {
        this.f3912a = context;
    }

    public final synchronized void b() {
        Context context = this.f3912a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f3912a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f3913b.a();
            b();
        }
    }
}
