package a6;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes.dex */
final class c1 implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f206a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(e1 e1Var, TaskCompletionSource taskCompletionSource) {
        this.f206a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f206a.setResult(new d1((String) obj, null));
    }
}
