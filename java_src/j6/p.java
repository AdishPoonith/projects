package j6;

import j6.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class p implements f1.c {

    /* renamed from: a  reason: collision with root package name */
    private final f1 f12275a;

    /* renamed from: c  reason: collision with root package name */
    private final Set<com.google.firebase.firestore.o<Void>> f12277c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private z0 f12278d = z0.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b1, b> f12276b = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12279a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12280b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12281c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<c1> f12282a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private y1 f12283b;

        /* renamed from: c  reason: collision with root package name */
        private int f12284c;

        b() {
        }
    }

    public p(f1 f1Var) {
        this.f12275a = f1Var;
        f1Var.x(this);
    }

    private void f() {
        for (com.google.firebase.firestore.o<Void> oVar : this.f12277c) {
            oVar.a(null, null);
        }
    }

    @Override // j6.f1.c
    public void a(z0 z0Var) {
        this.f12278d = z0Var;
        boolean z10 = false;
        for (b bVar : this.f12276b.values()) {
            for (c1 c1Var : bVar.f12282a) {
                if (c1Var.c(z0Var)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            f();
        }
    }

    @Override // j6.f1.c
    public void b(b1 b1Var, i9.j1 j1Var) {
        b bVar = this.f12276b.get(b1Var);
        if (bVar != null) {
            for (c1 c1Var : bVar.f12282a) {
                c1Var.b(q6.g0.t(j1Var));
            }
        }
        this.f12276b.remove(b1Var);
    }

    @Override // j6.f1.c
    public void c(List<y1> list) {
        boolean z10 = false;
        for (y1 y1Var : list) {
            b bVar = this.f12276b.get(y1Var.h());
            if (bVar != null) {
                for (c1 c1Var : bVar.f12282a) {
                    if (c1Var.d(y1Var)) {
                        z10 = true;
                    }
                }
                bVar.f12283b = y1Var;
            }
        }
        if (z10) {
            f();
        }
    }

    public int d(c1 c1Var) {
        b1 a10 = c1Var.a();
        b bVar = this.f12276b.get(a10);
        boolean z10 = bVar == null;
        if (z10) {
            bVar = new b();
            this.f12276b.put(a10, bVar);
        }
        bVar.f12282a.add(c1Var);
        q6.b.d(true ^ c1Var.c(this.f12278d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (bVar.f12283b != null && c1Var.d(bVar.f12283b)) {
            f();
        }
        if (z10) {
            bVar.f12284c = this.f12275a.n(a10);
        }
        return bVar.f12284c;
    }

    public void e(com.google.firebase.firestore.o<Void> oVar) {
        this.f12277c.add(oVar);
        oVar.a(null, null);
    }

    public void g(c1 c1Var) {
        boolean z10;
        b1 a10 = c1Var.a();
        b bVar = this.f12276b.get(a10);
        if (bVar != null) {
            bVar.f12282a.remove(c1Var);
            z10 = bVar.f12282a.isEmpty();
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12276b.remove(a10);
            this.f12275a.y(a10);
        }
    }

    public void h(com.google.firebase.firestore.o<Void> oVar) {
        this.f12277c.remove(oVar);
    }
}
