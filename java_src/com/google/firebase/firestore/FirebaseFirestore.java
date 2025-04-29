package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.d1;
import com.google.firebase.firestore.z;
import j6.k1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l6.z2;
import m6.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.v;
/* loaded from: classes.dex */
public class FirebaseFirestore {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6696a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.f f6697b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6698c;

    /* renamed from: d  reason: collision with root package name */
    private final h6.a<h6.j> f6699d;

    /* renamed from: e  reason: collision with root package name */
    private final h6.a<String> f6700e;

    /* renamed from: f  reason: collision with root package name */
    private final q6.g f6701f;

    /* renamed from: g  reason: collision with root package name */
    private final w5.f f6702g;

    /* renamed from: h  reason: collision with root package name */
    private final f1 f6703h;

    /* renamed from: i  reason: collision with root package name */
    private final a f6704i;

    /* renamed from: j  reason: collision with root package name */
    private f6.a f6705j;

    /* renamed from: k  reason: collision with root package name */
    private a0 f6706k = new a0.b().f();

    /* renamed from: l  reason: collision with root package name */
    private volatile j6.p0 f6707l;

    /* renamed from: m  reason: collision with root package name */
    private final p6.g0 f6708m;

    /* loaded from: classes.dex */
    public interface a {
        void remove(String str);
    }

    FirebaseFirestore(Context context, m6.f fVar, String str, h6.a<h6.j> aVar, h6.a<String> aVar2, q6.g gVar, w5.f fVar2, a aVar3, p6.g0 g0Var) {
        this.f6696a = (Context) q6.x.b(context);
        this.f6697b = (m6.f) q6.x.b((m6.f) q6.x.b(fVar));
        this.f6703h = new f1(fVar);
        this.f6698c = (String) q6.x.b(str);
        this.f6699d = (h6.a) q6.x.b(aVar);
        this.f6700e = (h6.a) q6.x.b(aVar2);
        this.f6701f = (q6.g) q6.x.b(gVar);
        this.f6702g = fVar2;
        this.f6704i = aVar3;
        this.f6708m = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(TaskCompletionSource taskCompletionSource) {
        try {
            if (this.f6707l != null && !this.f6707l.F()) {
                throw new z("Persistence cannot be cleared while the firestore instance is running.", z.a.FAILED_PRECONDITION);
            }
            z2.s(this.f6696a, this.f6697b, this.f6698c);
            taskCompletionSource.setResult(null);
        } catch (z e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u0 B(Task task) {
        j6.b1 b1Var = (j6.b1) task.getResult();
        if (b1Var != null) {
            return new u0(b1Var, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object C(d1.a aVar, k1 k1Var) {
        return aVar.a(new d1(k1Var, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task D(Executor executor, final d1.a aVar, final k1 k1Var) {
        return Tasks.call(executor, new Callable() { // from class: com.google.firebase.firestore.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object C;
                C = FirebaseFirestore.this.C(aVar, k1Var);
                return C;
            }
        });
    }

    private a0 G(a0 a0Var, f6.a aVar) {
        if (aVar == null) {
            return a0Var;
        }
        if (!"firestore.googleapis.com".equals(a0Var.h())) {
            q6.v.e("FirebaseFirestore", "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        a0.b bVar = new a0.b(a0Var);
        return bVar.h(aVar.a() + ":" + aVar.b()).j(false).f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FirebaseFirestore H(Context context, w5.f fVar, s6.a<a6.b> aVar, s6.a<z5.b> aVar2, String str, a aVar3, p6.g0 g0Var) {
        String g10 = fVar.r().g();
        if (g10 != null) {
            m6.f g11 = m6.f.g(g10, str);
            q6.g gVar = new q6.g();
            return new FirebaseFirestore(context, g11, fVar.q(), new h6.i(aVar), new h6.e(aVar2), gVar, fVar, aVar3, g0Var);
        }
        throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
    }

    private <ResultT> Task<ResultT> J(e1 e1Var, final d1.a<ResultT> aVar, final Executor executor) {
        q();
        return this.f6707l.j0(e1Var, new q6.t() { // from class: com.google.firebase.firestore.y
            @Override // q6.t
            public final Object apply(Object obj) {
                Task D;
                D = FirebaseFirestore.this.D(executor, aVar, (k1) obj);
                return D;
            }
        });
    }

    public static void M(boolean z10) {
        q6.v.d(z10 ? v.b.DEBUG : v.b.WARN);
    }

    private f0 h(Executor executor, Activity activity, final Runnable runnable) {
        q();
        final j6.h hVar = new j6.h(executor, new o() { // from class: com.google.firebase.firestore.u
            @Override // com.google.firebase.firestore.o
            public final void a(Object obj, z zVar) {
                FirebaseFirestore.y(runnable, (Void) obj, zVar);
            }
        });
        this.f6707l.x(hVar);
        return j6.d.c(activity, new f0() { // from class: com.google.firebase.firestore.v
            @Override // com.google.firebase.firestore.f0
            public final void remove() {
                FirebaseFirestore.this.z(hVar);
            }
        });
    }

    private void q() {
        if (this.f6707l != null) {
            return;
        }
        synchronized (this.f6697b) {
            if (this.f6707l != null) {
                return;
            }
            this.f6707l = new j6.p0(this.f6696a, new j6.m(this.f6697b, this.f6698c, this.f6706k.h(), this.f6706k.j()), this.f6706k, this.f6699d, this.f6700e, this.f6701f, this.f6708m);
        }
    }

    @Keep
    static void setClientLanguage(String str) {
        p6.w.p(str);
    }

    public static FirebaseFirestore u(w5.f fVar) {
        return v(fVar, "(default)");
    }

    private static FirebaseFirestore v(w5.f fVar, String str) {
        q6.x.c(fVar, "Provided FirebaseApp must not be null.");
        b0 b0Var = (b0) fVar.k(b0.class);
        q6.x.c(b0Var, "Firestore component is not present.");
        return b0Var.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Runnable runnable, Void r22, z zVar) {
        q6.b.d(zVar == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(j6.h hVar) {
        hVar.d();
        this.f6707l.f0(hVar);
    }

    public h0 E(InputStream inputStream) {
        q();
        h0 h0Var = new h0();
        this.f6707l.e0(inputStream, h0Var);
        return h0Var;
    }

    public h0 F(byte[] bArr) {
        return E(new ByteArrayInputStream(bArr));
    }

    public <TResult> Task<TResult> I(e1 e1Var, d1.a<TResult> aVar) {
        q6.x.c(aVar, "Provided transaction update function must not be null.");
        return J(e1Var, aVar, k1.g());
    }

    public void K(a0 a0Var) {
        a0 G = G(a0Var, this.f6705j);
        synchronized (this.f6697b) {
            q6.x.c(G, "Provided settings must not be null.");
            if (this.f6707l != null && !this.f6706k.equals(G)) {
                throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
            }
            this.f6706k = G;
        }
    }

    public Task<Void> L(String str) {
        q();
        q6.x.e(this.f6706k.i(), "Cannot enable indexes when persistence is disabled");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray optJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i11 = 0; optJSONArray != null && i11 < optJSONArray.length(); i11++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                        m6.r v10 = m6.r.v(jSONObject3.getString("fieldPath"));
                        arrayList2.add("CONTAINS".equals(jSONObject3.optString("arrayConfig")) ? q.c.g(v10, q.c.a.CONTAINS) : "ASCENDING".equals(jSONObject3.optString("order")) ? q.c.g(v10, q.c.a.ASCENDING) : q.c.g(v10, q.c.a.DESCENDING));
                    }
                    arrayList.add(m6.q.b(-1, string, arrayList2, m6.q.f13814a));
                }
            }
            return this.f6707l.y(arrayList);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Failed to parse index configuration", e10);
        }
    }

    public Task<Void> N() {
        this.f6704i.remove(t().i());
        q();
        return this.f6707l.i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(m mVar) {
        q6.x.c(mVar, "Provided DocumentReference must not be null.");
        if (mVar.k() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    public Task<Void> P() {
        q();
        return this.f6707l.l0();
    }

    public f0 g(Runnable runnable) {
        return i(q6.p.f16299a, runnable);
    }

    public f0 i(Executor executor, Runnable runnable) {
        return h(executor, null, runnable);
    }

    public h1 j() {
        q();
        return new h1(this);
    }

    public Task<Void> k() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6701f.m(new Runnable() { // from class: com.google.firebase.firestore.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseFirestore.this.A(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public g l(String str) {
        q6.x.c(str, "Provided collection path must not be null.");
        q();
        return new g(m6.u.v(str), this);
    }

    public u0 m(String str) {
        q6.x.c(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(String.format("Invalid collectionId '%s'. Collection IDs must not contain '/'.", str));
        }
        q();
        return new u0(new j6.b1(m6.u.f13841k, str), this);
    }

    public Task<Void> n() {
        q();
        return this.f6707l.z();
    }

    public m o(String str) {
        q6.x.c(str, "Provided document path must not be null.");
        q();
        return m.i(m6.u.v(str), this);
    }

    public Task<Void> p() {
        q();
        return this.f6707l.A();
    }

    public w5.f r() {
        return this.f6702g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j6.p0 s() {
        return this.f6707l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.f t() {
        return this.f6697b;
    }

    public Task<u0> w(String str) {
        q();
        return this.f6707l.D(str).continueWith(new Continuation() { // from class: com.google.firebase.firestore.t
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                u0 B;
                B = FirebaseFirestore.this.B(task);
                return B;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 x() {
        return this.f6703h;
    }
}
