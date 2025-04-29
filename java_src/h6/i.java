package h6;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.c0;
import q6.p;
import q6.u;
import q6.v;
import s6.a;
/* loaded from: classes.dex */
public final class i extends a<j> {

    /* renamed from: a  reason: collision with root package name */
    private final a6.a f9523a = new a6.a() { // from class: h6.f
        @Override // a6.a
        public final void a(t6.b bVar) {
            i.this.j(bVar);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private a6.b f9524b;

    /* renamed from: c  reason: collision with root package name */
    private u<j> f9525c;

    /* renamed from: d  reason: collision with root package name */
    private int f9526d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9527e;

    public i(s6.a<a6.b> aVar) {
        aVar.a(new a.InterfaceC0257a() { // from class: h6.h
            @Override // s6.a.InterfaceC0257a
            public final void a(s6.b bVar) {
                i.this.k(bVar);
            }
        });
    }

    private synchronized j h() {
        String a10;
        a6.b bVar = this.f9524b;
        a10 = bVar == null ? null : bVar.a();
        return a10 != null ? new j(a10) : j.f9528b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(int i10, Task task) {
        synchronized (this) {
            if (i10 != this.f9526d) {
                v.a("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                return a();
            } else if (task.isSuccessful()) {
                return Tasks.forResult(((c0) task.getResult()).g());
            } else {
                return Tasks.forException(task.getException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(t6.b bVar) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(s6.b bVar) {
        synchronized (this) {
            this.f9524b = (a6.b) bVar.get();
            l();
            this.f9524b.c(this.f9523a);
        }
    }

    private synchronized void l() {
        this.f9526d++;
        u<j> uVar = this.f9525c;
        if (uVar != null) {
            uVar.a(h());
        }
    }

    @Override // h6.a
    public synchronized Task<String> a() {
        a6.b bVar = this.f9524b;
        if (bVar == null) {
            return Tasks.forException(new w5.c("auth is not available"));
        }
        Task<c0> d10 = bVar.d(this.f9527e);
        this.f9527e = false;
        final int i10 = this.f9526d;
        return d10.continueWithTask(p.f16300b, new Continuation() { // from class: h6.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task i11;
                i11 = i.this.i(i10, task);
                return i11;
            }
        });
    }

    @Override // h6.a
    public synchronized void b() {
        this.f9527e = true;
    }

    @Override // h6.a
    public synchronized void c() {
        this.f9525c = null;
        a6.b bVar = this.f9524b;
        if (bVar != null) {
            bVar.b(this.f9523a);
        }
    }

    @Override // h6.a
    public synchronized void d(u<j> uVar) {
        this.f9525c = uVar;
        uVar.a(h());
    }
}
