package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import j6.p;
import j6.t1;
import j6.y1;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final m6.l f6794a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseFirestore f6795b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(m6.l lVar, FirebaseFirestore firebaseFirestore) {
        this.f6794a = (m6.l) q6.x.b(lVar);
        this.f6795b = firebaseFirestore;
    }

    private f0 f(Executor executor, p.a aVar, Activity activity, final o<n> oVar) {
        j6.h hVar = new j6.h(executor, new o() { // from class: com.google.firebase.firestore.l
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj, z zVar) {
                m.this.p(oVar, (y1) obj, zVar);
            }
        });
        return j6.d.c(activity, new j6.w0(this.f6795b.s(), this.f6795b.s().d0(g(), aVar, hVar), hVar));
    }

    private j6.b1 g() {
        return j6.b1.b(this.f6794a.r());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m i(m6.u uVar, FirebaseFirestore firebaseFirestore) {
        if (uVar.q() % 2 == 0) {
            return new m(m6.l.l(uVar), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + uVar.h() + " has " + uVar.q());
    }

    private Task<n> n(final a1 a1Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        p.a aVar = new p.a();
        aVar.f12279a = true;
        aVar.f12280b = true;
        aVar.f12281c = true;
        taskCompletionSource2.setResult(f(q6.p.f16300b, aVar, null, new o() { // from class: com.google.firebase.firestore.k
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj, z zVar) {
                m.r(TaskCompletionSource.this, taskCompletionSource2, a1Var, (n) obj, zVar);
            }
        }));
        return taskCompletionSource.getTask();
    }

    private static p.a o(n0 n0Var) {
        p.a aVar = new p.a();
        n0 n0Var2 = n0.INCLUDE;
        aVar.f12279a = n0Var == n0Var2;
        aVar.f12280b = n0Var == n0Var2;
        aVar.f12281c = false;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(o oVar, y1 y1Var, z zVar) {
        if (zVar != null) {
            oVar.a(null, zVar);
            return;
        }
        q6.b.d(y1Var != null, "Got event without value or error set", new Object[0]);
        q6.b.d(y1Var.e().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        m6.i l10 = y1Var.e().l(this.f6794a);
        oVar.a(l10 != null ? n.b(this.f6795b, l10, y1Var.k(), y1Var.f().contains(l10.getKey())) : n.c(this.f6795b, this.f6794a, y1Var.k()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n q(Task task) {
        m6.i iVar = (m6.i) task.getResult();
        return new n(this.f6795b, this.f6794a, iVar, true, iVar != null && iVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, a1 a1Var, n nVar, z zVar) {
        z zVar2;
        if (zVar != null) {
            taskCompletionSource.setException(zVar);
            return;
        }
        try {
            ((f0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!nVar.a() && nVar.f().b()) {
                zVar2 = new z("Failed to get document because the client is offline.", z.a.UNAVAILABLE);
            } else if (!nVar.a() || !nVar.f().b() || a1Var != a1.SERVER) {
                taskCompletionSource.setResult(nVar);
                return;
            } else {
                zVar2 = new z("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", z.a.UNAVAILABLE);
            }
            taskCompletionSource.setException(zVar2);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw q6.b.b(e10, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e11) {
            throw q6.b.b(e11, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    private Task<Void> v(t1 t1Var) {
        return this.f6795b.s().m0(Collections.singletonList(t1Var.a(this.f6794a, n6.m.a(true)))).continueWith(q6.p.f16300b, q6.g0.C());
    }

    public f0 d(n0 n0Var, o<n> oVar) {
        return e(q6.p.f16299a, n0Var, oVar);
    }

    public f0 e(Executor executor, n0 n0Var, o<n> oVar) {
        q6.x.c(executor, "Provided executor must not be null.");
        q6.x.c(n0Var, "Provided MetadataChanges value must not be null.");
        q6.x.c(oVar, "Provided EventListener must not be null.");
        return f(executor, o(n0Var), null, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f6794a.equals(mVar.f6794a) && this.f6795b.equals(mVar.f6795b);
        }
        return false;
    }

    public Task<Void> h() {
        return this.f6795b.s().m0(Collections.singletonList(new n6.c(this.f6794a, n6.m.f14330c))).continueWith(q6.p.f16300b, q6.g0.C());
    }

    public int hashCode() {
        return (this.f6794a.hashCode() * 31) + this.f6795b.hashCode();
    }

    public Task<n> j(a1 a1Var) {
        return a1Var == a1.CACHE ? this.f6795b.s().B(this.f6794a).continueWith(q6.p.f16300b, new Continuation() { // from class: com.google.firebase.firestore.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                n q10;
                q10 = m.this.q(task);
                return q10;
            }
        }) : n(a1Var);
    }

    public FirebaseFirestore k() {
        return this.f6795b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.l l() {
        return this.f6794a;
    }

    public String m() {
        return this.f6794a.r().h();
    }

    public Task<Void> s(Object obj) {
        return t(obj, y0.f6855c);
    }

    public Task<Void> t(Object obj, y0 y0Var) {
        q6.x.c(obj, "Provided data must not be null.");
        q6.x.c(y0Var, "Provided options must not be null.");
        return this.f6795b.s().m0(Collections.singletonList((y0Var.b() ? this.f6795b.x().g(obj, y0Var.a()) : this.f6795b.x().l(obj)).a(this.f6794a, n6.m.f14330c))).continueWith(q6.p.f16300b, q6.g0.C());
    }

    public Task<Void> u(q qVar, Object obj, Object... objArr) {
        return v(this.f6795b.x().n(q6.g0.f(1, qVar, obj, objArr)));
    }
}
