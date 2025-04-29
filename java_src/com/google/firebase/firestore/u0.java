package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.s;
import com.google.firebase.firestore.z;
import d7.b;
import j6.a1;
import j6.b1;
import j6.p;
import j6.q;
import j6.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    final j6.b1 f6831a;

    /* renamed from: b  reason: collision with root package name */
    final FirebaseFirestore f6832b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6833a;

        static {
            int[] iArr = new int[q.b.values().length];
            f6833a = iArr;
            try {
                iArr[q.b.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6833a[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6833a[q.b.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6833a[q.b.NOT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        ASCENDING,
        DESCENDING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(j6.b1 b1Var, FirebaseFirestore firebaseFirestore) {
        this.f6831a = (j6.b1) q6.x.b(b1Var);
        this.f6832b = (FirebaseFirestore) q6.x.b(firebaseFirestore);
    }

    private j6.r A(s sVar) {
        boolean z10 = sVar instanceof s.b;
        q6.b.d(z10 || (sVar instanceof s.a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        return z10 ? z((s.b) sVar) : x((s.a) sVar);
    }

    private void D(Object obj, q.b bVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
        }
    }

    private void E() {
        if (this.f6831a.l().equals(b1.a.LIMIT_TO_LAST) && this.f6831a.h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void F(j6.b1 b1Var, j6.q qVar) {
        q.b h10 = qVar.h();
        if (qVar.j()) {
            m6.r q10 = b1Var.q();
            m6.r g10 = qVar.g();
            if (q10 != null && !q10.equals(g10)) {
                throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", q10.h(), g10.h()));
            }
            m6.r j10 = b1Var.j();
            if (j10 != null) {
                I(j10, g10);
            }
        }
        q.b l10 = l(b1Var.i(), h(h10));
        if (l10 != null) {
            if (l10 == h10) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + h10.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + h10.toString() + "' filters with '" + l10.toString() + "' filters.");
        }
    }

    private void G(j6.r rVar) {
        j6.b1 b1Var = this.f6831a;
        for (j6.q qVar : rVar.d()) {
            F(b1Var, qVar);
            b1Var = b1Var.e(qVar);
        }
    }

    private void H(m6.r rVar) {
        m6.r q10 = this.f6831a.q();
        if (this.f6831a.j() != null || q10 == null) {
            return;
        }
        I(rVar, q10);
    }

    private void I(m6.r rVar, m6.r rVar2) {
        if (rVar.equals(rVar2)) {
            return;
        }
        String h10 = rVar2.h();
        throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", h10, h10, rVar.h()));
    }

    private f0 f(Executor executor, p.a aVar, Activity activity, final o<w0> oVar) {
        E();
        j6.h hVar = new j6.h(executor, new o() { // from class: com.google.firebase.firestore.t0
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj, z zVar) {
                u0.this.q(oVar, (y1) obj, zVar);
            }
        });
        return j6.d.c(activity, new j6.w0(this.f6832b.s(), this.f6832b.s().d0(this.f6831a, aVar, hVar), hVar));
    }

    private j6.i g(String str, Object[] objArr, boolean z10) {
        d7.b0 h10;
        List<j6.a1> h11 = this.f6831a.h();
        if (objArr.length > h11.size()) {
            throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (!h11.get(i10).c().equals(m6.r.f13822k)) {
                h10 = this.f6832b.x().h(obj);
            } else if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
            } else {
                String str2 = (String) obj;
                if (!this.f6831a.r() && str2.contains("/")) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                m6.u g10 = this.f6831a.n().g(m6.u.v(str2));
                if (!m6.l.t(g10)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + g10 + "' is not because it contains an odd number of segments.");
                }
                h10 = m6.y.F(this.f6832b.t(), m6.l.l(g10));
            }
            arrayList.add(h10);
        }
        return new j6.i(arrayList, z10);
    }

    private List<q.b> h(q.b bVar) {
        int i10 = a.f6833a[bVar.ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3) ? Arrays.asList(q.b.NOT_IN) : i10 != 4 ? new ArrayList() : Arrays.asList(q.b.ARRAY_CONTAINS_ANY, q.b.IN, q.b.NOT_IN, q.b.NOT_EQUAL) : Arrays.asList(q.b.NOT_EQUAL, q.b.NOT_IN);
    }

    private q.b l(List<j6.r> list, List<q.b> list2) {
        for (j6.r rVar : list) {
            for (j6.q qVar : rVar.d()) {
                if (list2.contains(qVar.h())) {
                    return qVar.h();
                }
            }
        }
        return null;
    }

    private Task<w0> o(final a1 a1Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        p.a aVar = new p.a();
        aVar.f12279a = true;
        aVar.f12280b = true;
        aVar.f12281c = true;
        taskCompletionSource2.setResult(f(q6.p.f16300b, aVar, null, new o() { // from class: com.google.firebase.firestore.s0
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj, z zVar) {
                u0.s(TaskCompletionSource.this, taskCompletionSource2, a1Var, (w0) obj, zVar);
            }
        }));
        return taskCompletionSource.getTask();
    }

    private static p.a p(n0 n0Var) {
        p.a aVar = new p.a();
        n0 n0Var2 = n0.INCLUDE;
        aVar.f12279a = n0Var == n0Var2;
        aVar.f12280b = n0Var == n0Var2;
        aVar.f12281c = false;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(o oVar, y1 y1Var, z zVar) {
        if (zVar != null) {
            oVar.a(null, zVar);
            return;
        }
        q6.b.d(y1Var != null, "Got event without value or error set", new Object[0]);
        oVar.a(new w0(this, y1Var, this.f6832b), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w0 r(Task task) {
        return new w0(new u0(this.f6831a, this.f6832b), (y1) task.getResult(), this.f6832b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, a1 a1Var, w0 w0Var, z zVar) {
        if (zVar != null) {
            taskCompletionSource.setException(zVar);
            return;
        }
        try {
            ((f0) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (w0Var.p().b() && a1Var == a1.SERVER) {
                taskCompletionSource.setException(new z("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", z.a.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(w0Var);
            }
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw q6.b.b(e10, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e11) {
            throw q6.b.b(e11, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    private u0 w(m6.r rVar, b bVar) {
        q6.x.c(bVar, "Provided direction must not be null.");
        if (this.f6831a.o() == null) {
            if (this.f6831a.g() == null) {
                H(rVar);
                return new u0(this.f6831a.B(j6.a1.d(bVar == b.ASCENDING ? a1.a.ASCENDING : a1.a.DESCENDING, rVar)), this.f6832b);
            }
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
    }

    private j6.r x(s.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (s sVar : aVar.m()) {
            j6.r A = A(sVar);
            if (!A.b().isEmpty()) {
                arrayList.add(A);
            }
        }
        return arrayList.size() == 1 ? (j6.r) arrayList.get(0) : new j6.l(arrayList, aVar.n());
    }

    private d7.b0 y(Object obj) {
        m6.f t10;
        m6.l l10;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            }
            if (!this.f6831a.r() && str.contains("/")) {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
            m6.u g10 = this.f6831a.n().g(m6.u.v(str));
            if (!m6.l.t(g10)) {
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + g10 + "' is not because it has an odd number of segments (" + g10.q() + ").");
            }
            t10 = n().t();
            l10 = m6.l.l(g10);
        } else if (!(obj instanceof m)) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + q6.g0.B(obj));
        } else {
            t10 = n().t();
            l10 = ((m) obj).l();
        }
        return m6.y.F(t10, l10);
    }

    private j6.q z(s.b bVar) {
        d7.b0 i10;
        q m10 = bVar.m();
        q.b n10 = bVar.n();
        Object o10 = bVar.o();
        q6.x.c(m10, "Provided field path must not be null.");
        q6.x.c(n10, "Provided op must not be null.");
        if (!m10.c().x()) {
            q.b bVar2 = q.b.IN;
            if (n10 == bVar2 || n10 == q.b.NOT_IN || n10 == q.b.ARRAY_CONTAINS_ANY) {
                D(o10, n10);
            }
            i10 = this.f6832b.x().i(o10, n10 == bVar2 || n10 == q.b.NOT_IN);
        } else if (n10 == q.b.ARRAY_CONTAINS || n10 == q.b.ARRAY_CONTAINS_ANY) {
            throw new IllegalArgumentException("Invalid query. You can't perform '" + n10.toString() + "' queries on FieldPath.documentId().");
        } else if (n10 == q.b.IN || n10 == q.b.NOT_IN) {
            D(o10, n10);
            b.C0121b o02 = d7.b.o0();
            for (Object obj : (List) o10) {
                o02.I(y(obj));
            }
            i10 = d7.b0.C0().I(o02).b();
        } else {
            i10 = y(o10);
        }
        return j6.q.f(m10.c(), n10, i10);
    }

    public u0 B(Object... objArr) {
        return new u0(this.f6831a.C(g("startAfter", objArr, false)), this.f6832b);
    }

    public u0 C(Object... objArr) {
        return new u0(this.f6831a.C(g("startAt", objArr, true)), this.f6832b);
    }

    public u0 J(s sVar) {
        j6.r A = A(sVar);
        if (A.b().isEmpty()) {
            return this;
        }
        G(A);
        return new u0(this.f6831a.e(A), this.f6832b);
    }

    public u0 K(q qVar, Object obj) {
        return J(s.b(qVar, obj));
    }

    public u0 L(q qVar, List<? extends Object> list) {
        return J(s.c(qVar, list));
    }

    public u0 M(q qVar, Object obj) {
        return J(s.d(qVar, obj));
    }

    public u0 N(q qVar, Object obj) {
        return J(s.e(qVar, obj));
    }

    public u0 O(q qVar, Object obj) {
        return J(s.f(qVar, obj));
    }

    public u0 P(q qVar, List<? extends Object> list) {
        return J(s.g(qVar, list));
    }

    public u0 Q(q qVar, Object obj) {
        return J(s.h(qVar, obj));
    }

    public u0 R(q qVar, Object obj) {
        return J(s.i(qVar, obj));
    }

    public u0 S(q qVar, Object obj) {
        return J(s.j(qVar, obj));
    }

    public u0 T(q qVar, List<? extends Object> list) {
        return J(s.k(qVar, list));
    }

    public f0 d(n0 n0Var, o<w0> oVar) {
        return e(q6.p.f16299a, n0Var, oVar);
    }

    public f0 e(Executor executor, n0 n0Var, o<w0> oVar) {
        q6.x.c(executor, "Provided executor must not be null.");
        q6.x.c(n0Var, "Provided MetadataChanges value must not be null.");
        q6.x.c(oVar, "Provided EventListener must not be null.");
        return f(executor, p(n0Var), null, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return this.f6831a.equals(u0Var.f6831a) && this.f6832b.equals(u0Var.f6832b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6831a.hashCode() * 31) + this.f6832b.hashCode();
    }

    public c i() {
        return new c(this, Collections.singletonList(com.google.firebase.firestore.a.a()));
    }

    public u0 j(Object... objArr) {
        return new u0(this.f6831a.d(g("endAt", objArr, true)), this.f6832b);
    }

    public u0 k(Object... objArr) {
        return new u0(this.f6831a.d(g("endBefore", objArr, false)), this.f6832b);
    }

    public Task<w0> m(a1 a1Var) {
        E();
        return a1Var == a1.CACHE ? this.f6832b.s().C(this.f6831a).continueWith(q6.p.f16300b, new Continuation() { // from class: com.google.firebase.firestore.r0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                w0 r10;
                r10 = u0.this.r(task);
                return r10;
            }
        }) : o(a1Var);
    }

    public FirebaseFirestore n() {
        return this.f6832b;
    }

    public u0 t(long j10) {
        if (j10 > 0) {
            return new u0(this.f6831a.t(j10), this.f6832b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j10 + ") is invalid. Limit must be positive.");
    }

    public u0 u(long j10) {
        if (j10 > 0) {
            return new u0(this.f6831a.u(j10), this.f6832b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j10 + ") is invalid. Limit must be positive.");
    }

    public u0 v(q qVar, b bVar) {
        q6.x.c(qVar, "Provided field path must not be null.");
        return w(qVar.c(), bVar);
    }
}
