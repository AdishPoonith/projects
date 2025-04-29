package n4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class k extends g {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14282a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(b bVar, TaskCompletionSource taskCompletionSource) {
        this.f14282a = taskCompletionSource;
    }

    @Override // n4.h
    public final void z(Status status) {
        v.a(status, this.f14282a);
    }
}
