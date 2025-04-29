package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.m;
/* loaded from: classes.dex */
public abstract class d<R extends com.google.android.gms.common.api.m, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: q  reason: collision with root package name */
    private final a.c<A> f3810q;

    /* renamed from: r  reason: collision with root package name */
    private final com.google.android.gms.common.api.a<?> f3811r;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.f fVar) {
        super((com.google.android.gms.common.api.f) c4.s.k(fVar, "GoogleApiClient must not be null"));
        c4.s.k(aVar, "Api must not be null");
        this.f3810q = aVar.b();
        this.f3811r = aVar;
    }

    private void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void l(A a10);

    protected void m(R r10) {
    }

    public final void n(A a10) {
        try {
            l(a10);
        } catch (DeadObjectException e10) {
            o(e10);
            throw e10;
        } catch (RemoteException e11) {
            o(e11);
        }
    }

    public final void p(Status status) {
        c4.s.b(!status.G(), "Failed result must not be success");
        R c10 = c(status);
        f(c10);
        m(c10);
    }
}
