package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f283a = taskCompletionSource;
        this.f284b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f283a.setException(exc);
        a0.e(this.f284b);
    }
}
