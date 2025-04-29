package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3957a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f3958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, TaskCompletionSource taskCompletionSource) {
        this.f3958b = zVar;
        this.f3957a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f3958b.f3964b;
        map.remove(this.f3957a);
    }
}
