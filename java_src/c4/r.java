package c4;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final q0 f3382a = new n0();

    /* loaded from: classes.dex */
    public interface a<R extends com.google.android.gms.common.api.m, T> {
        T a(R r10);
    }

    public static <R extends com.google.android.gms.common.api.m, T> Task<T> a(com.google.android.gms.common.api.h<R> hVar, a<R, T> aVar) {
        q0 q0Var = f3382a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.a(new o0(hVar, taskCompletionSource, aVar, q0Var));
        return taskCompletionSource.getTask();
    }

    public static <R extends com.google.android.gms.common.api.m> Task<Void> b(com.google.android.gms.common.api.h<R> hVar) {
        return a(hVar, new p0());
    }
}
