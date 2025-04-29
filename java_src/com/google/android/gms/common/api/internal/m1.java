package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class m1 extends q1 {

    /* renamed from: b  reason: collision with root package name */
    protected final d f3884b;

    public m1(int i10, d dVar) {
        super(i10);
        this.f3884b = (d) c4.s.k(dVar, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a(Status status) {
        try {
            this.f3884b.p(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f3884b.p(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void c(j0 j0Var) {
        try {
            this.f3884b.n(j0Var.t());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void d(z zVar, boolean z10) {
        zVar.c(this.f3884b, z10);
    }
}
