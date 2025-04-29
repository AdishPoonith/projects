package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b1 extends w {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p.a f3796b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(p.a aVar, j.a aVar2) {
        super(aVar2);
        this.f3796b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.w
    public final void b(a.b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        q qVar;
        qVar = this.f3796b.f3905b;
        qVar.b(bVar, taskCompletionSource);
    }
}
