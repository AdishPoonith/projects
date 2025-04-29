package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends com.google.android.play.integrity.internal.o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f5890a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f5891b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5892c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f5893d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f5894e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f5894e = tVar;
        this.f5890a = bArr;
        this.f5891b = l10;
        this.f5892c = taskCompletionSource2;
        this.f5893d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void a(Exception exc) {
        if (exc instanceof z) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.integrity.internal.k] */
    @Override // com.google.android.play.integrity.internal.o
    protected final void b() {
        com.google.android.play.integrity.internal.n nVar;
        try {
            this.f5894e.f5898a.e().i2(t.a(this.f5894e, this.f5890a, this.f5891b), new s(this.f5894e, this.f5892c));
        } catch (RemoteException e10) {
            nVar = this.f5894e.f5899b;
            nVar.c(e10, "requestIntegrityToken(%s)", this.f5893d);
            this.f5892c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
