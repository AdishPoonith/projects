package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class o<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    private final j f3893a;

    /* renamed from: b  reason: collision with root package name */
    private final b4.d[] f3894b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3895c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3896d;

    /* JADX INFO: Access modifiers changed from: protected */
    public o(j<L> jVar, b4.d[] dVarArr, boolean z10, int i10) {
        this.f3893a = jVar;
        this.f3894b = dVarArr;
        this.f3895c = z10;
        this.f3896d = i10;
    }

    public void a() {
        this.f3893a.a();
    }

    public j.a<L> b() {
        return this.f3893a.b();
    }

    public b4.d[] c() {
        return this.f3894b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d(A a10, TaskCompletionSource<Void> taskCompletionSource);

    public final int e() {
        return this.f3896d;
    }

    public final boolean f() {
        return this.f3895c;
    }
}
