package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class w<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f3949a;

    /* JADX INFO: Access modifiers changed from: protected */
    public w(j.a<L> aVar) {
        this.f3949a = aVar;
    }

    public j.a<L> a() {
        return this.f3949a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a10, TaskCompletionSource<Boolean> taskCompletionSource);
}
