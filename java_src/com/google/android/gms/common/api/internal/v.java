package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public class v {
    public static void a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    public static <ResultT> void b(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.G()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(c4.b.a(status));
        }
    }

    public static <ResultT> boolean c(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.G() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(c4.b.a(status));
    }
}
