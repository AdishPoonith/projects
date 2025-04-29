package com.lyokone.location;

import android.util.Log;
import r8.d;
/* loaded from: classes.dex */
class d implements d.InterfaceC0247d {

    /* renamed from: a  reason: collision with root package name */
    private a f7486a;

    /* renamed from: b  reason: collision with root package name */
    private r8.d f7487b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f7486a = aVar;
    }

    @Override // r8.d.InterfaceC0247d
    public void b(Object obj, d.b bVar) {
        a aVar = this.f7486a;
        aVar.f7470v = bVar;
        if (aVar.f7458j == null) {
            bVar.b("NO_ACTIVITY", null, null);
        } else if (aVar.i()) {
            this.f7486a.w();
        } else {
            this.f7486a.r();
        }
    }

    @Override // r8.d.InterfaceC0247d
    public void c(Object obj) {
        a aVar = this.f7486a;
        aVar.f7459k.e(aVar.f7463o);
        this.f7486a.f7470v = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(r8.c cVar) {
        if (this.f7487b != null) {
            Log.wtf("StreamHandlerImpl", "Setting a method call handler before the last was disposed.");
            e();
        }
        r8.d dVar = new r8.d(cVar, "lyokone/locationstream");
        this.f7487b = dVar;
        dVar.d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        r8.d dVar = this.f7487b;
        if (dVar == null) {
            Log.d("StreamHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        dVar.d(null);
        this.f7487b = null;
    }
}
