package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f302a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f303b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f302a = taskCompletionSource;
        this.f303b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f302a.setException(exc);
        a0.e(this.f303b);
    }
}
