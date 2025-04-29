package a6;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
/* loaded from: classes.dex */
final class m0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t0 f255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RecaptchaAction f256c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Continuation f257d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(String str, t0 t0Var, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f254a = str;
        this.f255b = t0Var;
        this.f256c = recaptchaAction;
        this.f257d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exc = (Exception) c4.s.j(task.getException());
        int i10 = com.google.android.gms.internal.p000firebaseauthapi.i.f4708b;
        if ((exc instanceof com.google.firebase.auth.q) && ((com.google.firebase.auth.q) exc).a().endsWith("INVALID_RECAPTCHA_TOKEN")) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ".concat(String.valueOf(this.f254a)));
            }
            return this.f255b.a(this.f254a, Boolean.TRUE, this.f256c).continueWithTask(this.f257d);
        }
        return task;
    }
}
