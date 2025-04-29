package com.google.firebase.storage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private l f6902j;

    /* renamed from: k  reason: collision with root package name */
    private TaskCompletionSource<Void> f6903k;

    /* renamed from: l  reason: collision with root package name */
    private x6.c f6904l;

    public b(l lVar, TaskCompletionSource<Void> taskCompletionSource) {
        c4.s.j(lVar);
        c4.s.j(taskCompletionSource);
        this.f6902j = lVar;
        this.f6903k = taskCompletionSource;
        d v10 = lVar.v();
        this.f6904l = new x6.c(v10.a().m(), v10.c(), v10.b(), v10.j());
    }

    @Override // java.lang.Runnable
    public void run() {
        y6.a aVar = new y6.a(this.f6902j.w(), this.f6902j.k());
        this.f6904l.d(aVar);
        aVar.a(this.f6903k, null);
    }
}
