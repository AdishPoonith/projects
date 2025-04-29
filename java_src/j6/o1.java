package j6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import q6.g;
/* loaded from: classes.dex */
public class o1<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private q6.g f12269a;

    /* renamed from: b  reason: collision with root package name */
    private p6.p0 f12270b;

    /* renamed from: c  reason: collision with root package name */
    private q6.t<k1, Task<TResult>> f12271c;

    /* renamed from: d  reason: collision with root package name */
    private int f12272d;

    /* renamed from: e  reason: collision with root package name */
    private q6.r f12273e;

    /* renamed from: f  reason: collision with root package name */
    private TaskCompletionSource<TResult> f12274f = new TaskCompletionSource<>();

    public o1(q6.g gVar, p6.p0 p0Var, com.google.firebase.firestore.e1 e1Var, q6.t<k1, Task<TResult>> tVar) {
        this.f12269a = gVar;
        this.f12270b = p0Var;
        this.f12271c = tVar;
        this.f12272d = e1Var.a();
        this.f12273e = new q6.r(gVar, g.d.RETRY_TRANSACTION);
    }

    private void d(Task task) {
        if (this.f12272d <= 0 || !e(task.getException())) {
            this.f12274f.setException(task.getException());
        } else {
            j();
        }
    }

    private static boolean e(Exception exc) {
        if (exc instanceof com.google.firebase.firestore.z) {
            com.google.firebase.firestore.z zVar = (com.google.firebase.firestore.z) exc;
            z.a a10 = zVar.a();
            return a10 == z.a.ABORTED || a10 == z.a.ALREADY_EXISTS || a10 == z.a.FAILED_PRECONDITION || !p6.o.j(zVar.a());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void f(Task task, Task task2) {
        if (task2.isSuccessful()) {
            this.f12274f.setResult(task.getResult());
        } else {
            d(task2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(k1 k1Var, final Task task) {
        if (task.isSuccessful()) {
            k1Var.c().addOnCompleteListener(this.f12269a.o(), new OnCompleteListener() { // from class: j6.l1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    o1.this.f(task, task2);
                }
            });
        } else {
            d(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        final k1 p10 = this.f12270b.p();
        this.f12271c.apply(p10).addOnCompleteListener(this.f12269a.o(), new OnCompleteListener() { // from class: j6.m1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                o1.this.g(p10, task);
            }
        });
    }

    private void j() {
        this.f12272d--;
        this.f12273e.b(new Runnable() { // from class: j6.n1
            @Override // java.lang.Runnable
            public final void run() {
                o1.this.h();
            }
        });
    }

    public Task<TResult> i() {
        j();
        return this.f12274f.getTask();
    }
}
