package a6;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public abstract class n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task c(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) c4.s.j(task.getException());
        int i10 = com.google.android.gms.internal.p000firebaseauthapi.i.f4708b;
        if ((exc instanceof com.google.firebase.auth.q) && ((com.google.firebase.auth.q) exc).a().endsWith("MISSING_RECAPTCHA_TOKEN")) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
            }
            if (firebaseAuth.H() == null) {
                firebaseAuth.V(new t0(firebaseAuth.l(), firebaseAuth));
            }
            return d(firebaseAuth.H(), recaptchaAction, str, continuation);
        }
        String valueOf = String.valueOf(recaptchaAction);
        String message = exc.getMessage();
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
        return Tasks.forException(exc);
    }

    private static Task d(t0 t0Var, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task a10 = t0Var.a(str, Boolean.FALSE, recaptchaAction);
        return a10.continueWithTask(continuation).continueWithTask(new m0(str, t0Var, recaptchaAction, continuation));
    }

    public abstract Task a(String str);

    public final Task b(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction) {
        final Continuation continuation = new Continuation() { // from class: a6.k0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str2;
                n0 n0Var = n0.this;
                if (task.isSuccessful()) {
                    str2 = (String) task.getResult();
                } else {
                    String message = ((Exception) c4.s.j(task.getException())).getMessage();
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
                    str2 = "NO_RECAPTCHA";
                }
                return n0Var.a(str2);
            }
        };
        t0 H = firebaseAuth.H();
        return (H == null || !H.e()) ? a(null).continueWithTask(new Continuation() { // from class: a6.l0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n0.c(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        }) : d(H, recaptchaAction, str, continuation);
    }
}
