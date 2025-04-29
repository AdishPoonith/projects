package h6;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import q6.p;
import q6.u;
import s6.a;
/* loaded from: classes.dex */
public final class e extends a<String> {

    /* renamed from: a  reason: collision with root package name */
    private u<String> f9515a;

    /* renamed from: b  reason: collision with root package name */
    private z5.b f9516b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9517c;

    /* renamed from: d  reason: collision with root package name */
    private final z5.a f9518d = new z5.a() { // from class: h6.d
    };

    public e(s6.a<z5.b> aVar) {
        aVar.a(new a.InterfaceC0257a() { // from class: h6.c
            @Override // s6.a.InterfaceC0257a
            public final void a(s6.b bVar) {
                e.this.h(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task g(Task task) {
        return task.isSuccessful() ? Tasks.forResult(((y5.a) task.getResult()).b()) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(s6.b bVar) {
        synchronized (this) {
            z5.b bVar2 = (z5.b) bVar.get();
            this.f9516b = bVar2;
            if (bVar2 != null) {
                bVar2.b(this.f9518d);
            }
        }
    }

    @Override // h6.a
    public synchronized Task<String> a() {
        z5.b bVar = this.f9516b;
        if (bVar == null) {
            return Tasks.forException(new w5.c("AppCheck is not available"));
        }
        Task<y5.a> c10 = bVar.c(this.f9517c);
        this.f9517c = false;
        return c10.continueWithTask(p.f16300b, new Continuation() { // from class: h6.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task g10;
                g10 = e.g(task);
                return g10;
            }
        });
    }

    @Override // h6.a
    public synchronized void b() {
        this.f9517c = true;
    }

    @Override // h6.a
    public synchronized void c() {
        this.f9515a = null;
        z5.b bVar = this.f9516b;
        if (bVar != null) {
            bVar.a(this.f9518d);
        }
    }

    @Override // h6.a
    public synchronized void d(u<String> uVar) {
        this.f9515a = uVar;
    }
}
