package j6;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import j6.j;
import j6.p;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.f4;
import l6.k;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final m f12285a;

    /* renamed from: b  reason: collision with root package name */
    private final h6.a<h6.j> f12286b;

    /* renamed from: c  reason: collision with root package name */
    private final h6.a<String> f12287c;

    /* renamed from: d  reason: collision with root package name */
    private final q6.g f12288d;

    /* renamed from: e  reason: collision with root package name */
    private final i6.g f12289e;

    /* renamed from: f  reason: collision with root package name */
    private final p6.g0 f12290f;

    /* renamed from: g  reason: collision with root package name */
    private l6.e1 f12291g;

    /* renamed from: h  reason: collision with root package name */
    private l6.i0 f12292h;

    /* renamed from: i  reason: collision with root package name */
    private p6.p0 f12293i;

    /* renamed from: j  reason: collision with root package name */
    private f1 f12294j;

    /* renamed from: k  reason: collision with root package name */
    private p f12295k;

    /* renamed from: l  reason: collision with root package name */
    private f4 f12296l;

    /* renamed from: m  reason: collision with root package name */
    private f4 f12297m;

    public p0(final Context context, m mVar, final com.google.firebase.firestore.a0 a0Var, h6.a<h6.j> aVar, h6.a<String> aVar2, final q6.g gVar, p6.g0 g0Var) {
        this.f12285a = mVar;
        this.f12286b = aVar;
        this.f12287c = aVar2;
        this.f12288d = gVar;
        this.f12290f = g0Var;
        this.f12289e = new i6.g(new p6.l0(mVar.a()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gVar.l(new Runnable() { // from class: j6.m0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.Q(taskCompletionSource, context, a0Var);
            }
        });
        aVar.d(new q6.u() { // from class: j6.f0
            @Override // q6.u
            public final void a(Object obj) {
                p0.this.S(atomicBoolean, taskCompletionSource, gVar, (h6.j) obj);
            }
        });
        aVar2.d(new q6.u() { // from class: j6.g0
            @Override // q6.u
            public final void a(Object obj) {
                p0.T((String) obj);
            }
        });
    }

    private void E(Context context, h6.j jVar, com.google.firebase.firestore.a0 a0Var) {
        q6.v.a("FirestoreClient", "Initializing. user=%s", jVar.a());
        j.a aVar = new j.a(context, this.f12288d, this.f12285a, new p6.o(this.f12285a, this.f12288d, this.f12286b, this.f12287c, context, this.f12290f), jVar, 100, a0Var);
        j e1Var = a0Var.i() ? new e1() : new x0();
        e1Var.q(aVar);
        this.f12291g = e1Var.n();
        this.f12297m = e1Var.k();
        this.f12292h = e1Var.m();
        this.f12293i = e1Var.o();
        this.f12294j = e1Var.p();
        this.f12295k = e1Var.j();
        l6.k l10 = e1Var.l();
        f4 f4Var = this.f12297m;
        if (f4Var != null) {
            f4Var.start();
        }
        if (l10 != null) {
            k.a f10 = l10.f();
            this.f12296l = f10;
            f10.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(com.google.firebase.firestore.o oVar) {
        this.f12295k.e(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(List list) {
        this.f12292h.z(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        this.f12293i.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        this.f12293i.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m6.i K(Task task) {
        m6.i iVar = (m6.i) task.getResult();
        if (iVar.c()) {
            return iVar;
        }
        if (iVar.h()) {
            return null;
        }
        throw new com.google.firebase.firestore.z("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", z.a.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m6.i L(m6.l lVar) {
        return this.f12292h.h0(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y1 M(b1 b1Var) {
        l6.h1 A = this.f12292h.A(b1Var, true);
        w1 w1Var = new w1(b1Var, A.b());
        return w1Var.b(w1Var.g(A.a())).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(String str, TaskCompletionSource taskCompletionSource) {
        i6.j H = this.f12292h.H(str);
        if (H == null) {
            taskCompletionSource.setResult(null);
            return;
        }
        g1 b10 = H.a().b();
        taskCompletionSource.setResult(new b1(b10.n(), b10.d(), b10.h(), b10.m(), b10.j(), H.a().a(), b10.p(), b10.f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(c1 c1Var) {
        this.f12295k.d(c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(i6.f fVar, com.google.firebase.firestore.h0 h0Var) {
        this.f12294j.o(fVar, h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(TaskCompletionSource taskCompletionSource, Context context, com.google.firebase.firestore.a0 a0Var) {
        try {
            E(context, (h6.j) Tasks.await(taskCompletionSource.getTask()), a0Var);
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(h6.j jVar) {
        q6.b.d(this.f12294j != null, "SyncEngine not yet initialized", new Object[0]);
        q6.v.a("FirestoreClient", "Credential changed. Current user: %s", jVar.a());
        this.f12294j.l(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, q6.g gVar, final h6.j jVar) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            gVar.l(new Runnable() { // from class: j6.t
                @Override // java.lang.Runnable
                public final void run() {
                    p0.this.R(jVar);
                }
            });
            return;
        }
        q6.b.d(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
        taskCompletionSource.setResult(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(com.google.firebase.firestore.o oVar) {
        this.f12295k.h(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(b1 b1Var, List list, final TaskCompletionSource taskCompletionSource) {
        this.f12294j.w(b1Var, list).addOnSuccessListener(new OnSuccessListener() { // from class: j6.h0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TaskCompletionSource.this.setResult((Map) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: j6.d0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                TaskCompletionSource.this.setException(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(c1 c1Var) {
        this.f12295k.g(c1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        this.f12293i.O();
        this.f12291g.l();
        f4 f4Var = this.f12297m;
        if (f4Var != null) {
            f4Var.stop();
        }
        f4 f4Var2 = this.f12296l;
        if (f4Var2 != null) {
            f4Var2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task a0(com.google.firebase.firestore.e1 e1Var, q6.t tVar) {
        return this.f12294j.A(this.f12288d, e1Var, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(TaskCompletionSource taskCompletionSource) {
        this.f12294j.s(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(List list, TaskCompletionSource taskCompletionSource) {
        this.f12294j.C(list, taskCompletionSource);
    }

    private void k0() {
        if (F()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public Task<Void> A() {
        k0();
        return this.f12288d.i(new Runnable() { // from class: j6.k0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.J();
            }
        });
    }

    public Task<m6.i> B(final m6.l lVar) {
        k0();
        return this.f12288d.j(new Callable() { // from class: j6.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m6.i L;
                L = p0.this.L(lVar);
                return L;
            }
        }).continueWith(new Continuation() { // from class: j6.s
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                m6.i K;
                K = p0.K(task);
                return K;
            }
        });
    }

    public Task<y1> C(final b1 b1Var) {
        k0();
        return this.f12288d.j(new Callable() { // from class: j6.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y1 M;
                M = p0.this.M(b1Var);
                return M;
            }
        });
    }

    public Task<b1> D(final String str) {
        k0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12288d.l(new Runnable() { // from class: j6.y
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.N(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean F() {
        return this.f12288d.p();
    }

    public c1 d0(b1 b1Var, p.a aVar, com.google.firebase.firestore.o<y1> oVar) {
        k0();
        final c1 c1Var = new c1(b1Var, aVar, oVar);
        this.f12288d.l(new Runnable() { // from class: j6.x
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.O(c1Var);
            }
        });
        return c1Var;
    }

    public void e0(InputStream inputStream, final com.google.firebase.firestore.h0 h0Var) {
        k0();
        final i6.f fVar = new i6.f(this.f12289e, inputStream);
        this.f12288d.l(new Runnable() { // from class: j6.u
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.P(fVar, h0Var);
            }
        });
    }

    public void f0(final com.google.firebase.firestore.o<Void> oVar) {
        if (F()) {
            return;
        }
        this.f12288d.l(new Runnable() { // from class: j6.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.U(oVar);
            }
        });
    }

    public Task<Map<String, d7.b0>> g0(final b1 b1Var, final List<com.google.firebase.firestore.a> list) {
        k0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12288d.l(new Runnable() { // from class: j6.v
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.X(b1Var, list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void h0(final c1 c1Var) {
        if (F()) {
            return;
        }
        this.f12288d.l(new Runnable() { // from class: j6.w
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.Y(c1Var);
            }
        });
    }

    public Task<Void> i0() {
        this.f12286b.c();
        this.f12287c.c();
        return this.f12288d.n(new Runnable() { // from class: j6.i0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.Z();
            }
        });
    }

    public <TResult> Task<TResult> j0(final com.google.firebase.firestore.e1 e1Var, final q6.t<k1, Task<TResult>> tVar) {
        k0();
        return q6.g.g(this.f12288d.o(), new Callable() { // from class: j6.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Task a02;
                a02 = p0.this.a0(e1Var, tVar);
                return a02;
            }
        });
    }

    public Task<Void> l0() {
        k0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12288d.l(new Runnable() { // from class: j6.l0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.b0(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Void> m0(final List<n6.f> list) {
        k0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f12288d.l(new Runnable() { // from class: j6.a0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.c0(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void x(final com.google.firebase.firestore.o<Void> oVar) {
        k0();
        this.f12288d.l(new Runnable() { // from class: j6.n0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.G(oVar);
            }
        });
    }

    public Task<Void> y(final List<m6.q> list) {
        k0();
        return this.f12288d.i(new Runnable() { // from class: j6.z
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.H(list);
            }
        });
    }

    public Task<Void> z() {
        k0();
        return this.f12288d.i(new Runnable() { // from class: j6.j0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.I();
            }
        });
    }
}
