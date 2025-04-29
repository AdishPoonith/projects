package com.google.firebase.firestore;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.k1;
import j6.t1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final k1 f6743a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseFirestore f6744b;

    /* loaded from: classes.dex */
    public interface a<TResult> {
        TResult a(d1 d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(k1 k1Var, FirebaseFirestore firebaseFirestore) {
        this.f6743a = (k1) q6.x.b(k1Var);
        this.f6744b = (FirebaseFirestore) q6.x.b(firebaseFirestore);
    }

    private Task<n> d(m mVar) {
        return this.f6743a.j(Collections.singletonList(mVar.l())).continueWith(q6.p.f16300b, new Continuation() { // from class: com.google.firebase.firestore.c1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                n e10;
                e10 = d1.this.e(task);
                return e10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n e(Task task) {
        if (task.isSuccessful()) {
            List list = (List) task.getResult();
            if (list.size() == 1) {
                m6.s sVar = (m6.s) list.get(0);
                if (sVar.c()) {
                    return n.b(this.f6744b, sVar, false, false);
                }
                if (sVar.h()) {
                    return n.c(this.f6744b, sVar.getKey(), false);
                }
                throw q6.b.a("BatchGetDocumentsRequest returned unexpected document type: " + m6.s.class.getCanonicalName(), new Object[0]);
            }
            throw q6.b.a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        throw task.getException();
    }

    private d1 h(m mVar, t1 t1Var) {
        this.f6744b.O(mVar);
        this.f6743a.o(mVar.l(), t1Var);
        return this;
    }

    public d1 b(m mVar) {
        this.f6744b.O(mVar);
        this.f6743a.e(mVar.l());
        return this;
    }

    public n c(m mVar) {
        this.f6744b.O(mVar);
        try {
            return (n) Tasks.await(d(mVar));
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            if (e11.getCause() instanceof z) {
                throw ((z) e11.getCause());
            }
            throw new RuntimeException(e11.getCause());
        }
    }

    public d1 f(m mVar, Object obj) {
        return g(mVar, obj, y0.f6855c);
    }

    public d1 g(m mVar, Object obj, y0 y0Var) {
        this.f6744b.O(mVar);
        q6.x.c(obj, "Provided data must not be null.");
        q6.x.c(y0Var, "Provided options must not be null.");
        this.f6743a.n(mVar.l(), y0Var.b() ? this.f6744b.x().g(obj, y0Var.a()) : this.f6744b.x().l(obj));
        return this;
    }

    public d1 i(m mVar, Map<String, Object> map) {
        return h(mVar, this.f6744b.x().o(map));
    }
}
