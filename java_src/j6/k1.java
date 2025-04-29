package j6;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class k1 {

    /* renamed from: g  reason: collision with root package name */
    private static final Executor f12228g = d();

    /* renamed from: a  reason: collision with root package name */
    private final p6.o f12229a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12232d;

    /* renamed from: e  reason: collision with root package name */
    private com.google.firebase.firestore.z f12233e;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<m6.l, m6.w> f12230b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<n6.f> f12231c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private Set<m6.l> f12234f = new HashSet();

    public k1(p6.o oVar) {
        this.f12229a = oVar;
    }

    private static Executor d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private void f() {
        q6.b.d(!this.f12232d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    public static Executor g() {
        return f12228g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task h(Task task) {
        return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(Task task) {
        if (task.isSuccessful()) {
            for (m6.s sVar : (List) task.getResult()) {
                m(sVar);
            }
        }
        return task;
    }

    private n6.m k(m6.l lVar) {
        m6.w wVar = this.f12230b.get(lVar);
        return (this.f12234f.contains(lVar) || wVar == null) ? n6.m.f14330c : wVar.equals(m6.w.f13842k) ? n6.m.a(false) : n6.m.f(wVar);
    }

    private n6.m l(m6.l lVar) {
        m6.w wVar = this.f12230b.get(lVar);
        if (this.f12234f.contains(lVar) || wVar == null) {
            return n6.m.a(true);
        }
        if (wVar.equals(m6.w.f13842k)) {
            throw new com.google.firebase.firestore.z("Can't update a document that doesn't exist.", z.a.INVALID_ARGUMENT);
        }
        return n6.m.f(wVar);
    }

    private void m(m6.s sVar) {
        m6.w wVar;
        if (sVar.c()) {
            wVar = sVar.j();
        } else if (!sVar.h()) {
            throw q6.b.a("Unexpected document type in transaction: " + sVar, new Object[0]);
        } else {
            wVar = m6.w.f13842k;
        }
        if (!this.f12230b.containsKey(sVar.getKey())) {
            this.f12230b.put(sVar.getKey(), wVar);
        } else if (!this.f12230b.get(sVar.getKey()).equals(sVar.j())) {
            throw new com.google.firebase.firestore.z("Document version changed between two reads.", z.a.ABORTED);
        }
    }

    private void p(List<n6.f> list) {
        f();
        this.f12231c.addAll(list);
    }

    public Task<Void> c() {
        f();
        com.google.firebase.firestore.z zVar = this.f12233e;
        if (zVar != null) {
            return Tasks.forException(zVar);
        }
        HashSet hashSet = new HashSet(this.f12230b.keySet());
        Iterator<n6.f> it = this.f12231c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().g());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            m6.l lVar = (m6.l) it2.next();
            this.f12231c.add(new n6.q(lVar, k(lVar)));
        }
        this.f12232d = true;
        return this.f12229a.e(this.f12231c).continueWithTask(q6.p.f16300b, new Continuation() { // from class: j6.j1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h10;
                h10 = k1.h(task);
                return h10;
            }
        });
    }

    public void e(m6.l lVar) {
        p(Collections.singletonList(new n6.c(lVar, k(lVar))));
        this.f12234f.add(lVar);
    }

    public Task<List<m6.s>> j(List<m6.l> list) {
        f();
        return this.f12231c.size() != 0 ? Tasks.forException(new com.google.firebase.firestore.z("Firestore transactions require all reads to be executed before all writes.", z.a.INVALID_ARGUMENT)) : this.f12229a.o(list).continueWithTask(q6.p.f16300b, new Continuation() { // from class: j6.i1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task i10;
                i10 = k1.this.i(task);
                return i10;
            }
        });
    }

    public void n(m6.l lVar, s1 s1Var) {
        p(Collections.singletonList(s1Var.a(lVar, k(lVar))));
        this.f12234f.add(lVar);
    }

    public void o(m6.l lVar, t1 t1Var) {
        try {
            p(Collections.singletonList(t1Var.a(lVar, l(lVar))));
        } catch (com.google.firebase.firestore.z e10) {
            this.f12233e = e10;
        }
        this.f12234f.add(lVar);
    }
}
