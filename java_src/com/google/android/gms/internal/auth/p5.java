package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class p5 extends j5 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p5(b bVar, TaskCompletionSource taskCompletionSource) {
        this.f4212a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.k5
    public final void O1(Status status, Bundle bundle) {
        b.z(status, bundle, this.f4212a);
    }
}
