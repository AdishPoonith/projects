package c4;

import c4.r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o0 implements h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.h f3358a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3359b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r.a f3360c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q0 f3361d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(com.google.android.gms.common.api.h hVar, TaskCompletionSource taskCompletionSource, r.a aVar, q0 q0Var) {
        this.f3358a = hVar;
        this.f3359b = taskCompletionSource;
        this.f3360c = aVar;
        this.f3361d = q0Var;
    }

    @Override // com.google.android.gms.common.api.h.a
    public final void a(Status status) {
        if (!status.G()) {
            this.f3359b.setException(b.a(status));
            return;
        }
        this.f3359b.setResult(this.f3360c.a(this.f3358a.b(0L, TimeUnit.MILLISECONDS)));
    }
}
