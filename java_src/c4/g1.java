package c4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import c4.c;
/* loaded from: classes.dex */
public final class g1 extends v0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f3322g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f3323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f3323h = cVar;
        this.f3322g = iBinder;
    }

    @Override // c4.v0
    protected final void f(b4.b bVar) {
        if (this.f3323h.E != null) {
            this.f3323h.E.x(bVar);
        }
        this.f3323h.K(bVar);
    }

    @Override // c4.v0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f3322g;
            s.j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f3323h.D().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f3323h.D() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface r10 = this.f3323h.r(this.f3322g);
        if (r10 == null || !(c.e0(this.f3323h, 2, 4, r10) || c.e0(this.f3323h, 3, 4, r10))) {
            return false;
        }
        this.f3323h.I = null;
        Bundle w10 = this.f3323h.w();
        c cVar = this.f3323h;
        aVar = cVar.D;
        if (aVar != null) {
            aVar2 = cVar.D;
            aVar2.M(w10);
            return true;
        }
        return true;
    }
}
