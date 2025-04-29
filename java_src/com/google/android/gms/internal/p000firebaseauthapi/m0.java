package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m0  reason: invalid package */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    h f4978a;

    /* renamed from: b  reason: collision with root package name */
    Executor f4979b;

    public final Task a(final l0 l0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4979b.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.k0
            @Override // java.lang.Runnable
            public final void run() {
                l0Var.a(taskCompletionSource, m0.this.f4978a);
            }
        });
        return taskCompletionSource.getTask();
    }
}
