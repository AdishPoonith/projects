package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class s extends com.google.android.play.integrity.internal.l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f5895a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.play.integrity.internal.n f5896b = new com.google.android.play.integrity.internal.n("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f5897c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f5895a = tVar;
        this.f5897c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.m
    public final void b(Bundle bundle) {
        this.f5895a.f5898a.r(this.f5897c);
        this.f5896b.d("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f5897c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f5897c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f5897c;
        d dVar = new d();
        dVar.a(string);
        taskCompletionSource.trySetResult(dVar.b());
    }
}
