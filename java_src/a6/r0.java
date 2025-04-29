package a6;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.i2;
import com.google.android.gms.internal.p000firebaseauthapi.wh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f281a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t0 f282b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(t0 t0Var, String str) {
        this.f282b = t0Var;
        this.f281a = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        Exception exc;
        if (task.isSuccessful()) {
            i2 i2Var = (i2) task.getResult();
            String a10 = i2Var.a();
            if (com.google.android.gms.internal.p000firebaseauthapi.d1.d(a10)) {
                return Tasks.forException(new q0("No Recaptcha Enterprise siteKey configured for tenant/project ".concat(String.valueOf(this.f281a))));
            }
            List d10 = com.google.android.gms.internal.p000firebaseauthapi.c0.b(wh.b('/')).d(a10);
            String str = d10.size() != 4 ? null : (String) d10.get(3);
            if (!TextUtils.isEmpty(str)) {
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Successfully obtained site key for tenant ".concat(String.valueOf(this.f281a)));
                }
                this.f282b.f298b = i2Var;
                Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient((Application) this.f282b.f299c.m(), str);
                this.f282b.f297a.put(this.f281a, tasksClient);
                return tasksClient;
            }
            exc = new Exception("Invalid siteKey format ".concat(String.valueOf(a10)));
        } else {
            exc = new q0((String) c4.s.j(((Exception) c4.s.j(task.getException())).getMessage()));
        }
        return Tasks.forException(exc);
    }
}
