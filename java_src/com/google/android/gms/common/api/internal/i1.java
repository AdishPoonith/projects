package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 extends u {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ u.a f3848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(u.a aVar, b4.d[] dVarArr, boolean z10, int i10) {
        super(dVarArr, z10, i10);
        this.f3848d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.u
    public final void b(a.b bVar, TaskCompletionSource taskCompletionSource) {
        q qVar;
        qVar = this.f3848d.f3934a;
        qVar.b(bVar, taskCompletionSource);
    }
}
