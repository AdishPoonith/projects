package c4;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* loaded from: classes.dex */
public final class e1 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    private c f3291a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3292b;

    public e1(c cVar, int i10) {
        this.f3291a = cVar;
        this.f3292b = i10;
    }

    @Override // c4.m
    public final void E2(int i10, IBinder iBinder, Bundle bundle) {
        s.k(this.f3291a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f3291a.M(i10, iBinder, bundle, this.f3292b);
        this.f3291a = null;
    }

    @Override // c4.m
    public final void Z(int i10, IBinder iBinder, i1 i1Var) {
        c cVar = this.f3291a;
        s.k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.j(i1Var);
        c.a0(cVar, i1Var);
        E2(i10, iBinder, i1Var.f3332j);
    }

    @Override // c4.m
    public final void x1(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
