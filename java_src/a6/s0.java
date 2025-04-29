package a6;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
/* loaded from: classes.dex */
final class s0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecaptchaAction f285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(t0 t0Var, RecaptchaAction recaptchaAction) {
        this.f285a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f285a);
        }
        Exception exc = (Exception) c4.s.j(task.getException());
        if (exc instanceof q0) {
            if (Log.isLoggable("RecaptchaHandler", 4)) {
                Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - ".concat(String.valueOf(exc.getMessage())));
            }
            return Tasks.forResult("");
        }
        return Tasks.forException(exc);
    }
}
