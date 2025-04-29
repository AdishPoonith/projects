package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f329a = taskCompletionSource;
        this.f330b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f329a.setResult((com.google.firebase.auth.i) obj);
        a0.e(this.f330b);
    }
}
