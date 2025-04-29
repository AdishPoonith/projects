package a6;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.a2;
/* loaded from: classes.dex */
final class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f219a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar) {
        this.f219a = hVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        a2 a2Var;
        a2 a2Var2;
        a2 a2Var3;
        a2Var = this.f219a.f223m;
        if (a2Var != null) {
            if (task.isSuccessful()) {
                com.google.firebase.auth.i iVar = (com.google.firebase.auth.i) task.getResult();
                a2Var3 = this.f219a.f223m;
                return Tasks.forResult(new q1((w1) iVar.r(), (o1) iVar.A(), a2Var3));
            }
            Exception exception = task.getException();
            if (exception instanceof com.google.firebase.auth.x) {
                a2Var2 = this.f219a.f223m;
                ((com.google.firebase.auth.x) exception).d(a2Var2);
            }
            return Tasks.forException(exception);
        }
        return task;
    }
}
