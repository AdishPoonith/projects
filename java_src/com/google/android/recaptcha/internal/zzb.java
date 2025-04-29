package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import la.r0;
/* loaded from: classes.dex */
public final class zzb {
    public static final Task zza(r0 r0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        r0Var.b0(new zza(taskCompletionSource, r0Var));
        return taskCompletionSource.getTask();
    }
}
