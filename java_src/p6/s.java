package p6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i9.b;
import i9.j1;
import i9.y0;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends i9.b {

    /* renamed from: c  reason: collision with root package name */
    private static final y0.g<String> f15670c;

    /* renamed from: d  reason: collision with root package name */
    private static final y0.g<String> f15671d;

    /* renamed from: a  reason: collision with root package name */
    private final h6.a<h6.j> f15672a;

    /* renamed from: b  reason: collision with root package name */
    private final h6.a<String> f15673b;

    static {
        y0.d<String> dVar = i9.y0.f10075e;
        f15670c = y0.g.e("Authorization", dVar);
        f15671d = y0.g.e("x-firebase-appcheck", dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(h6.a<h6.j> aVar, h6.a<String> aVar2) {
        this.f15672a = aVar;
        this.f15673b = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Task task, b.a aVar, Task task2, Task task3) {
        Exception exception;
        i9.y0 y0Var = new i9.y0();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            q6.v.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                y0.g<String> gVar = f15670c;
                y0Var.p(gVar, "Bearer " + str);
            }
        } else {
            exception = task.getException();
            if (exception instanceof w5.c) {
                q6.v.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else if (!(exception instanceof u6.a)) {
                q6.v.e("FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                aVar.b(j1.f9931n.p(exception));
                return;
            } else {
                q6.v.a("FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                q6.v.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                y0Var.p(f15671d, str2);
            }
        } else {
            exception = task2.getException();
            if (!(exception instanceof w5.c)) {
                q6.v.e("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception);
                aVar.b(j1.f9931n.p(exception));
                return;
            }
            q6.v.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.a(y0Var);
    }

    @Override // i9.b
    public void a(b.AbstractC0161b abstractC0161b, Executor executor, final b.a aVar) {
        final Task<String> a10 = this.f15672a.a();
        final Task<String> a11 = this.f15673b.a();
        Tasks.whenAll(a10, a11).addOnCompleteListener(q6.p.f16300b, new OnCompleteListener() { // from class: p6.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                s.c(Task.this, aVar, a11, task);
            }
        });
    }
}
