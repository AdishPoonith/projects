package a6;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* loaded from: classes.dex */
final class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar) {
        this.f212a = fVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        w1 w1Var;
        if (task.isSuccessful()) {
            String g10 = ((com.google.firebase.auth.c0) task.getResult()).g();
            w1Var = this.f212a.f217a;
            return Tasks.forResult(j.B(g10, w1Var));
        }
        return Tasks.forException(task.getException());
    }
}
