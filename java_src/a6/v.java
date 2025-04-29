package a6;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f305b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(a0 a0Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f304a = taskCompletionSource;
        this.f305b = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f304a.setResult((com.google.firebase.auth.i) obj);
        a0.e(this.f305b);
    }
}
