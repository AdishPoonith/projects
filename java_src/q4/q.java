package q4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class q extends g.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f16206a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16207b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(a0 a0Var, Object obj, TaskCompletionSource taskCompletionSource) {
        this.f16206a = obj;
        this.f16207b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void p1(Status status) {
        com.google.android.gms.common.api.internal.v.b(status, this.f16206a, this.f16207b);
    }
}
