package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public final class o1 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    private final u f3898b;

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f3899c;

    /* renamed from: d  reason: collision with root package name */
    private final s f3900d;

    public o1(int i10, u uVar, TaskCompletionSource taskCompletionSource, s sVar) {
        super(i10);
        this.f3899c = taskCompletionSource;
        this.f3898b = uVar;
        this.f3900d = sVar;
        if (i10 == 2 && uVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(Status status) {
        this.f3899c.trySetException(this.f3900d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void b(Exception exc) {
        this.f3899c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void c(j0 j0Var) {
        try {
            this.f3898b.b(j0Var.t(), this.f3899c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(q1.e(e11));
        } catch (RuntimeException e12) {
            this.f3899c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void d(z zVar, boolean z10) {
        zVar.d(this.f3899c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final boolean f(j0 j0Var) {
        return this.f3898b.c();
    }

    @Override // com.google.android.gms.common.api.internal.r0
    public final b4.d[] g(j0 j0Var) {
        return this.f3898b.e();
    }
}
