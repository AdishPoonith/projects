package a6;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f334a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f335b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseAuth f336c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.auth.a0 f337d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a0 f338e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(a0 a0Var, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, com.google.firebase.auth.a0 a0Var2) {
        this.f338e = a0Var;
        this.f334a = new WeakReference(activity);
        this.f335b = taskCompletionSource;
        this.f336c = firebaseAuth;
        this.f337d = a0Var2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f334a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f335b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            a0.e(context);
        } else if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (z0.c(intent)) {
                this.f335b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(z0.a(intent)));
                a0.e(context);
            } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                this.f335b.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(l.a("WEB_CONTEXT_CANCELED")));
                a0.e(context);
            }
        } else {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f336c.y(a0.i(intent)).addOnSuccessListener(new t(r0, r1, context)).addOnFailureListener(new s(this.f338e, this.f335b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f337d.I(a0.i(intent)).addOnSuccessListener(new v(r0, r1, context)).addOnFailureListener(new u(this.f338e, this.f335b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f337d.J(a0.i(intent)).addOnSuccessListener(new x(r0, r1, context)).addOnFailureListener(new w(this.f338e, this.f335b, context));
            } else {
                TaskCompletionSource taskCompletionSource = this.f335b;
                taskCompletionSource.setException(com.google.android.gms.internal.p000firebaseauthapi.i.a(l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
        }
    }
}
