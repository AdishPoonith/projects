package a6;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
final class z extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f341a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f342b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f343c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(a0 a0Var, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f343c = a0Var;
        this.f341a = new WeakReference(activity);
        this.f342b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f341a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f342b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            a0.e(context);
        } else if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (z0.c(intent)) {
                this.f342b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(z0.a(intent)));
                a0.e(context);
            } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                this.f342b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(l.a("WEB_CONTEXT_CANCELED")));
                a0.e(context);
            }
        } else {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f342b.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                a0.e(context);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.f342b;
            taskCompletionSource.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
