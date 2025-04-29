package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class k1 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    protected final TaskCompletionSource f3867b;

    public k1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f3867b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(Status status) {
        this.f3867b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void b(Exception exc) {
        this.f3867b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void c(j0 j0Var) {
        try {
            h(j0Var);
        } catch (DeadObjectException e10) {
            a(q1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(q1.e(e11));
        } catch (RuntimeException e12) {
            this.f3867b.trySetException(e12);
        }
    }

    protected abstract void h(j0 j0Var);
}
