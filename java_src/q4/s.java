package q4;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class s extends y0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16214a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t4.v f16215b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(TaskCompletionSource taskCompletionSource, t4.v vVar) {
        this.f16214a = taskCompletionSource;
        this.f16215b = vVar;
    }

    @Override // q4.z0
    public final void d0(v0 v0Var) {
        com.google.android.gms.common.api.internal.v.a(v0Var.p(), this.f16214a);
    }

    @Override // q4.z0
    public final void zze() {
        this.f16215b.zzf();
    }
}
