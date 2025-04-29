package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f295a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f296b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f295a = taskCompletionSource;
        this.f296b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f295a.setResult((com.google.firebase.auth.i) obj);
        a0.e(this.f296b);
    }
}
