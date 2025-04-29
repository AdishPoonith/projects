package j6;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.z;
import i9.j1;
import j6.u0;
import j6.w1;
import j6.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l6.h4;
import p6.p0;
/* loaded from: classes.dex */
public class f1 implements p0.c {

    /* renamed from: o  reason: collision with root package name */
    private static final String f12168o = "f1";

    /* renamed from: a  reason: collision with root package name */
    private final l6.i0 f12169a;

    /* renamed from: b  reason: collision with root package name */
    private final p6.p0 f12170b;

    /* renamed from: e  reason: collision with root package name */
    private final int f12173e;

    /* renamed from: m  reason: collision with root package name */
    private h6.j f12181m;

    /* renamed from: n  reason: collision with root package name */
    private c f12182n;

    /* renamed from: c  reason: collision with root package name */
    private final Map<b1, d1> f12171c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, List<b1>> f12172d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet<m6.l> f12174f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final Map<m6.l, Integer> f12175g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, b> f12176h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final l6.j1 f12177i = new l6.j1();

    /* renamed from: j  reason: collision with root package name */
    private final Map<h6.j, Map<Integer, TaskCompletionSource<Void>>> f12178j = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private final h1 f12180l = h1.a();

    /* renamed from: k  reason: collision with root package name */
    private final Map<Integer, List<TaskCompletionSource<Void>>> f12179k = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12183a;

        static {
            int[] iArr = new int[u0.a.values().length];
            f12183a = iArr;
            try {
                iArr[u0.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12183a[u0.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final m6.l f12184a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12185b;

        b(m6.l lVar) {
            this.f12184a = lVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(z0 z0Var);

        void b(b1 b1Var, i9.j1 j1Var);

        void c(List<y1> list);
    }

    public f1(l6.i0 i0Var, p6.p0 p0Var, h6.j jVar, int i10) {
        this.f12169a = i0Var;
        this.f12170b = p0Var;
        this.f12173e = i10;
        this.f12181m = jVar;
    }

    private void B(List<u0> list, int i10) {
        for (u0 u0Var : list) {
            int i11 = a.f12183a[u0Var.b().ordinal()];
            if (i11 == 1) {
                this.f12177i.a(u0Var.a(), i10);
                z(u0Var);
            } else if (i11 != 2) {
                throw q6.b.a("Unknown limbo change type: %s", u0Var.b());
            } else {
                q6.v.a(f12168o, "Document no longer in limbo: %s", u0Var.a());
                m6.l a10 = u0Var.a();
                this.f12177i.f(a10, i10);
                if (!this.f12177i.c(a10)) {
                    u(a10);
                }
            }
        }
    }

    private void g(int i10, TaskCompletionSource<Void> taskCompletionSource) {
        Map<Integer, TaskCompletionSource<Void>> map = this.f12178j.get(this.f12181m);
        if (map == null) {
            map = new HashMap<>();
            this.f12178j.put(this.f12181m, map);
        }
        map.put(Integer.valueOf(i10), taskCompletionSource);
    }

    private void h(String str) {
        q6.b.d(this.f12182n != null, "Trying to call %s before setting callback", str);
    }

    private void i(d6.c<m6.l, m6.i> cVar, p6.k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<b1, d1> entry : this.f12171c.entrySet()) {
            d1 value = entry.getValue();
            w1 c10 = value.c();
            w1.b g10 = c10.g(cVar);
            if (g10.b()) {
                g10 = c10.h(this.f12169a.A(value.a(), false).a(), g10);
            }
            x1 c11 = value.c().c(g10, k0Var == null ? null : k0Var.d().get(Integer.valueOf(value.b())));
            B(c11.a(), value.b());
            if (c11.b() != null) {
                arrayList.add(c11.b());
                arrayList2.add(l6.j0.a(value.b(), c11.b()));
            }
        }
        this.f12182n.c(arrayList);
        this.f12169a.f0(arrayList2);
    }

    private boolean j(i9.j1 j1Var) {
        j1.b m10 = j1Var.m();
        return (m10 == j1.b.FAILED_PRECONDITION && (j1Var.n() != null ? j1Var.n() : "").contains("requires an index")) || m10 == j1.b.PERMISSION_DENIED;
    }

    private void k() {
        for (Map.Entry<Integer, List<TaskCompletionSource<Void>>> entry : this.f12179k.entrySet()) {
            for (TaskCompletionSource<Void> taskCompletionSource : entry.getValue()) {
                taskCompletionSource.setException(new com.google.firebase.firestore.z("'waitForPendingWrites' task is cancelled due to User change.", z.a.CANCELLED));
            }
        }
        this.f12179k.clear();
    }

    private y1 m(b1 b1Var, int i10, com.google.protobuf.i iVar) {
        l6.h1 A = this.f12169a.A(b1Var, true);
        y1.a aVar = y1.a.NONE;
        if (this.f12172d.get(Integer.valueOf(i10)) != null) {
            aVar = this.f12171c.get(this.f12172d.get(Integer.valueOf(i10)).get(0)).c().i();
        }
        p6.s0 a10 = p6.s0.a(aVar == y1.a.SYNCED, iVar);
        w1 w1Var = new w1(b1Var, A.b());
        x1 c10 = w1Var.c(w1Var.g(A.a()), a10);
        B(c10.a(), i10);
        this.f12171c.put(b1Var, new d1(b1Var, i10, w1Var));
        if (!this.f12172d.containsKey(Integer.valueOf(i10))) {
            this.f12172d.put(Integer.valueOf(i10), new ArrayList(1));
        }
        this.f12172d.get(Integer.valueOf(i10)).add(b1Var);
        return c10.b();
    }

    private void p(i9.j1 j1Var, String str, Object... objArr) {
        if (j(j1Var)) {
            q6.v.e("Firestore", "%s: %s", String.format(str, objArr), j1Var);
        }
    }

    private void q(int i10, i9.j1 j1Var) {
        Integer valueOf;
        TaskCompletionSource<Void> taskCompletionSource;
        Map<Integer, TaskCompletionSource<Void>> map = this.f12178j.get(this.f12181m);
        if (map == null || (taskCompletionSource = map.get((valueOf = Integer.valueOf(i10)))) == null) {
            return;
        }
        if (j1Var != null) {
            taskCompletionSource.setException(q6.g0.t(j1Var));
        } else {
            taskCompletionSource.setResult(null);
        }
        map.remove(valueOf);
    }

    private void r() {
        while (!this.f12174f.isEmpty() && this.f12175g.size() < this.f12173e) {
            Iterator<m6.l> it = this.f12174f.iterator();
            m6.l next = it.next();
            it.remove();
            int c10 = this.f12180l.c();
            this.f12176h.put(Integer.valueOf(c10), new b(next));
            this.f12175g.put(next, Integer.valueOf(c10));
            this.f12170b.F(new h4(b1.b(next.r()).D(), c10, -1L, l6.g1.LIMBO_RESOLUTION));
        }
    }

    private void t(int i10, i9.j1 j1Var) {
        for (b1 b1Var : this.f12172d.get(Integer.valueOf(i10))) {
            this.f12171c.remove(b1Var);
            if (!j1Var.o()) {
                this.f12182n.b(b1Var, j1Var);
                p(j1Var, "Listen for %s failed", b1Var);
            }
        }
        this.f12172d.remove(Integer.valueOf(i10));
        d6.e<m6.l> d10 = this.f12177i.d(i10);
        this.f12177i.h(i10);
        Iterator<m6.l> it = d10.iterator();
        while (it.hasNext()) {
            m6.l next = it.next();
            if (!this.f12177i.c(next)) {
                u(next);
            }
        }
    }

    private void u(m6.l lVar) {
        this.f12174f.remove(lVar);
        Integer num = this.f12175g.get(lVar);
        if (num != null) {
            this.f12170b.S(num.intValue());
            this.f12175g.remove(lVar);
            this.f12176h.remove(num);
            r();
        }
    }

    private void v(int i10) {
        if (this.f12179k.containsKey(Integer.valueOf(i10))) {
            for (TaskCompletionSource<Void> taskCompletionSource : this.f12179k.get(Integer.valueOf(i10))) {
                taskCompletionSource.setResult(null);
            }
            this.f12179k.remove(Integer.valueOf(i10));
        }
    }

    private void z(u0 u0Var) {
        m6.l a10 = u0Var.a();
        if (this.f12175g.containsKey(a10) || this.f12174f.contains(a10)) {
            return;
        }
        q6.v.a(f12168o, "New document in limbo: %s", a10);
        this.f12174f.add(a10);
        r();
    }

    public <TResult> Task<TResult> A(q6.g gVar, com.google.firebase.firestore.e1 e1Var, q6.t<k1, Task<TResult>> tVar) {
        return new o1(gVar, this.f12170b, e1Var, tVar).i();
    }

    public void C(List<n6.f> list, TaskCompletionSource<Void> taskCompletionSource) {
        h("writeMutations");
        l6.m p02 = this.f12169a.p0(list);
        g(p02.b(), taskCompletionSource);
        i(p02.c(), null);
        this.f12170b.t();
    }

    @Override // p6.p0.c
    public void a(z0 z0Var) {
        h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<b1, d1> entry : this.f12171c.entrySet()) {
            x1 d10 = entry.getValue().c().d(z0Var);
            q6.b.d(d10.a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (d10.b() != null) {
                arrayList.add(d10.b());
            }
        }
        this.f12182n.c(arrayList);
        this.f12182n.a(z0Var);
    }

    @Override // p6.p0.c
    public d6.e<m6.l> b(int i10) {
        b bVar = this.f12176h.get(Integer.valueOf(i10));
        if (bVar == null || !bVar.f12185b) {
            d6.e<m6.l> i11 = m6.l.i();
            if (this.f12172d.containsKey(Integer.valueOf(i10))) {
                for (b1 b1Var : this.f12172d.get(Integer.valueOf(i10))) {
                    if (this.f12171c.containsKey(b1Var)) {
                        i11 = i11.p(this.f12171c.get(b1Var).c().j());
                    }
                }
            }
            return i11;
        }
        return m6.l.i().k(bVar.f12184a);
    }

    @Override // p6.p0.c
    public void c(int i10, i9.j1 j1Var) {
        h("handleRejectedListen");
        b bVar = this.f12176h.get(Integer.valueOf(i10));
        m6.l lVar = bVar != null ? bVar.f12184a : null;
        if (lVar == null) {
            this.f12169a.j0(i10);
            t(i10, j1Var);
            return;
        }
        this.f12175g.remove(lVar);
        this.f12176h.remove(Integer.valueOf(i10));
        r();
        m6.w wVar = m6.w.f13842k;
        f(new p6.k0(wVar, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(lVar, m6.s.r(lVar, wVar)), Collections.singleton(lVar)));
    }

    @Override // p6.p0.c
    public void d(int i10, i9.j1 j1Var) {
        h("handleRejectedWrite");
        d6.c<m6.l, m6.i> i02 = this.f12169a.i0(i10);
        if (!i02.isEmpty()) {
            p(j1Var, "Write failed at %s", i02.m().r());
        }
        q(i10, j1Var);
        v(i10);
        i(i02, null);
    }

    @Override // p6.p0.c
    public void e(n6.h hVar) {
        h("handleSuccessfulWrite");
        q(hVar.b().e(), null);
        v(hVar.b().e());
        i(this.f12169a.u(hVar), null);
    }

    @Override // p6.p0.c
    public void f(p6.k0 k0Var) {
        h("handleRemoteEvent");
        for (Map.Entry<Integer, p6.s0> entry : k0Var.d().entrySet()) {
            p6.s0 value = entry.getValue();
            b bVar = this.f12176h.get(entry.getKey());
            if (bVar != null) {
                q6.b.d((value.b().size() + value.c().size()) + value.d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (value.b().size() > 0) {
                    bVar.f12185b = true;
                } else if (value.c().size() > 0) {
                    q6.b.d(bVar.f12185b, "Received change for limbo target document without add.", new Object[0]);
                } else if (value.d().size() > 0) {
                    q6.b.d(bVar.f12185b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.f12185b = false;
                }
            }
        }
        i(this.f12169a.w(k0Var), k0Var);
    }

    public void l(h6.j jVar) {
        boolean z10 = !this.f12181m.equals(jVar);
        this.f12181m = jVar;
        if (z10) {
            k();
            i(this.f12169a.K(jVar), null);
        }
        this.f12170b.u();
    }

    public int n(b1 b1Var) {
        h("listen");
        q6.b.d(!this.f12171c.containsKey(b1Var), "We already listen to query: %s", b1Var);
        h4 v10 = this.f12169a.v(b1Var.D());
        this.f12170b.F(v10);
        this.f12182n.c(Collections.singletonList(m(b1Var, v10.g(), v10.c())));
        return v10.g();
    }

    public void o(i6.f fVar, com.google.firebase.firestore.h0 h0Var) {
        try {
            try {
                i6.e d10 = fVar.d();
                if (this.f12169a.L(d10)) {
                    h0Var.e(com.google.firebase.firestore.i0.b(d10));
                    try {
                        fVar.b();
                        return;
                    } catch (IOException e10) {
                        q6.v.e("SyncEngine", "Exception while closing bundle", e10);
                        return;
                    }
                }
                h0Var.f(com.google.firebase.firestore.i0.a(d10));
                i6.d dVar = new i6.d(this.f12169a, d10);
                long j10 = 0;
                while (true) {
                    i6.c f10 = fVar.f();
                    if (f10 == null) {
                        i(dVar.b(), null);
                        this.f12169a.b(d10);
                        h0Var.e(com.google.firebase.firestore.i0.b(d10));
                        try {
                            fVar.b();
                            return;
                        } catch (IOException e11) {
                            q6.v.e("SyncEngine", "Exception while closing bundle", e11);
                            return;
                        }
                    }
                    long e12 = fVar.e();
                    com.google.firebase.firestore.i0 a10 = dVar.a(f10, e12 - j10);
                    if (a10 != null) {
                        h0Var.f(a10);
                    }
                    j10 = e12;
                }
            } catch (Exception e13) {
                q6.v.e("Firestore", "Loading bundle failed : %s", e13);
                h0Var.d(new com.google.firebase.firestore.z("Bundle failed to load", z.a.INVALID_ARGUMENT, e13));
                try {
                    fVar.b();
                } catch (IOException e14) {
                    q6.v.e("SyncEngine", "Exception while closing bundle", e14);
                }
            }
        } catch (Throwable th) {
            try {
                fVar.b();
            } catch (IOException e15) {
                q6.v.e("SyncEngine", "Exception while closing bundle", e15);
            }
            throw th;
        }
    }

    public void s(TaskCompletionSource<Void> taskCompletionSource) {
        if (!this.f12170b.n()) {
            q6.v.a(f12168o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int B = this.f12169a.B();
        if (B == -1) {
            taskCompletionSource.setResult(null);
            return;
        }
        if (!this.f12179k.containsKey(Integer.valueOf(B))) {
            this.f12179k.put(Integer.valueOf(B), new ArrayList());
        }
        this.f12179k.get(Integer.valueOf(B)).add(taskCompletionSource);
    }

    public Task<Map<String, d7.b0>> w(b1 b1Var, List<com.google.firebase.firestore.a> list) {
        return this.f12170b.J(b1Var, list);
    }

    public void x(c cVar) {
        this.f12182n = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(b1 b1Var) {
        h("stopListening");
        d1 d1Var = this.f12171c.get(b1Var);
        q6.b.d(d1Var != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f12171c.remove(b1Var);
        int b10 = d1Var.b();
        List<b1> list = this.f12172d.get(Integer.valueOf(b10));
        list.remove(b1Var);
        if (list.isEmpty()) {
            this.f12169a.j0(b10);
            this.f12170b.S(b10);
            t(b10, i9.j1.f9923f);
        }
    }
}
