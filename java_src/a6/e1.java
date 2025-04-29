package a6;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.f2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: b  reason: collision with root package name */
    private static final String f214b = "e1";

    /* renamed from: c  reason: collision with root package name */
    private static final e1 f215c = new e1();

    /* renamed from: a  reason: collision with root package name */
    private String f216a;

    private e1() {
    }

    public static e1 b() {
        return f215c;
    }

    private final void f(FirebaseAuth firebaseAuth, a1 a1Var, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        if (activity == null) {
            taskCompletionSource.setException(new com.google.firebase.auth.t());
            return;
        }
        a1Var.f(firebaseAuth.l().m(), firebaseAuth);
        c4.s.j(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (a0.a().g(activity, taskCompletionSource2)) {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            if (!TextUtils.isEmpty(firebaseAuth.p())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.p());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", com.google.android.gms.internal.p000firebaseauthapi.u.a().b());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.l().q());
            activity.startActivity(intent);
            task = taskCompletionSource2.getTask();
        } else {
            task = Tasks.forException(com.google.android.gms.internal.p000firebaseauthapi.i.a(new Status(17057, "reCAPTCHA flow already in progress")));
        }
        task.addOnSuccessListener(new c1(this, taskCompletionSource)).addOnFailureListener(new b1(this, taskCompletionSource));
    }

    public final Task a(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z10, boolean z11) {
        d1 d1Var;
        v1 v1Var = (v1) firebaseAuth.n();
        final a1 b10 = a1.b();
        if (!com.google.android.gms.internal.p000firebaseauthapi.i1.g(firebaseAuth.l()) && !v1Var.h()) {
            String str2 = f214b;
            boolean f10 = v1Var.f();
            Log.i(str2, "ForceRecaptchaFlow from phoneAuthOptions = " + z11 + ", ForceRecaptchaFlow from firebaseSettings = " + f10);
            boolean f11 = z11 | v1Var.f();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Task a10 = b10.a();
            if (a10 != null) {
                if (a10.isSuccessful()) {
                    d1Var = new d1((String) a10.getResult(), null);
                } else {
                    Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(a10.getException().getMessage())));
                    Log.e(str2, "Continuing with application verification as normal");
                }
            }
            if (!z10 || f11) {
                f(firebaseAuth, b10, activity, taskCompletionSource);
            } else {
                (!TextUtils.isEmpty(this.f216a) ? Tasks.forResult(new f2(this.f216a)) : firebaseAuth.l0()).continueWithTask(firebaseAuth.S(), new d0(this, str, IntegrityManagerFactory.create(firebaseAuth.l().m()))).addOnCompleteListener(new OnCompleteListener() { // from class: a6.c
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        e1.this.e(taskCompletionSource, firebaseAuth, b10, activity, task);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }
        d1Var = new d1(null, null);
        return Tasks.forResult(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, a1 a1Var, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new d1(null, ((IntegrityTokenResponse) task.getResult()).token()));
            return;
        }
        Log.e(f214b, "Play Integrity Token fetch failed, falling back to Recaptcha".concat(String.valueOf(task.getException() == null ? "" : task.getException().getMessage())));
        f(firebaseAuth, a1Var, activity, taskCompletionSource);
    }
}
