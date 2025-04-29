package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class q5 extends g.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4231a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q5(b bVar, TaskCompletionSource taskCompletionSource) {
        this.f4231a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void p1(Status status) {
        b.z(status, null, this.f4231a);
    }
}
