package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ y f5921j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(y yVar) {
        this.f5921j = yVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        IInterface iInterface;
        n nVar;
        Context context;
        ServiceConnection serviceConnection;
        y yVar = this.f5921j;
        iInterface = yVar.f5939m;
        if (iInterface != null) {
            nVar = yVar.f5928b;
            nVar.d("Unbind from service.", new Object[0]);
            y yVar2 = this.f5921j;
            context = yVar2.f5927a;
            serviceConnection = yVar2.f5938l;
            context.unbindService(serviceConnection);
            this.f5921j.f5933g = false;
            this.f5921j.f5939m = null;
            this.f5921j.f5938l = null;
        }
        this.f5921j.t();
    }
}
