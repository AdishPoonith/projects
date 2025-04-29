package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public abstract class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f5915a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o() {
        this.f5915a = null;
    }

    public o(TaskCompletionSource taskCompletionSource) {
        this.f5915a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f5915a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TaskCompletionSource c() {
        return this.f5915a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
