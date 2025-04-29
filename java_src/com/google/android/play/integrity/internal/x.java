package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ y f5925j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x(y yVar, w wVar) {
        this.f5925j = yVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y.f(this.f5925j).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f5925j.c().post(new u(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y.f(this.f5925j).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f5925j.c().post(new v(this));
    }
}
