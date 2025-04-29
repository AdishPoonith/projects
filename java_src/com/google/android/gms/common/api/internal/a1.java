package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a1 extends o {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p.a f3785e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p.a aVar, j jVar, b4.d[] dVarArr, boolean z10, int i10) {
        super(jVar, dVarArr, z10, i10);
        this.f3785e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.o
    public final void d(a.b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        q qVar;
        qVar = this.f3785e.f3904a;
        qVar.b(bVar, taskCompletionSource);
    }
}
