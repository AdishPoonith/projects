package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.t1;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f6773a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<n6.f> f6774b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f6775c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(FirebaseFirestore firebaseFirestore) {
        this.f6773a = (FirebaseFirestore) q6.x.b(firebaseFirestore);
    }

    private h1 e(m mVar, t1 t1Var) {
        this.f6773a.O(mVar);
        g();
        this.f6774b.add(t1Var.a(mVar.l(), n6.m.a(true)));
        return this;
    }

    private void g() {
        if (this.f6775c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    public Task<Void> a() {
        g();
        this.f6775c = true;
        return this.f6774b.size() > 0 ? this.f6773a.s().m0(this.f6774b) : Tasks.forResult(null);
    }

    public h1 b(m mVar) {
        this.f6773a.O(mVar);
        g();
        this.f6774b.add(new n6.c(mVar.l(), n6.m.f14330c));
        return this;
    }

    public h1 c(m mVar, Object obj) {
        return d(mVar, obj, y0.f6855c);
    }

    public h1 d(m mVar, Object obj, y0 y0Var) {
        this.f6773a.O(mVar);
        q6.x.c(obj, "Provided data must not be null.");
        q6.x.c(y0Var, "Provided options must not be null.");
        g();
        this.f6774b.add((y0Var.b() ? this.f6773a.x().g(obj, y0Var.a()) : this.f6773a.x().l(obj)).a(mVar.l(), n6.m.f14330c));
        return this;
    }

    public h1 f(m mVar, Map<String, Object> map) {
        return e(mVar, this.f6773a.x().o(map));
    }
}
