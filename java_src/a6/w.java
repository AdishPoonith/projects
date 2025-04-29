package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f314a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f315b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f314a = taskCompletionSource;
        this.f315b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f314a.setException(exc);
        a0.e(this.f315b);
    }
}
