package j6;

import j6.n;
import j6.p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    private final b1 f12149a;

    /* renamed from: b  reason: collision with root package name */
    private final p.a f12150b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.firestore.o<y1> f12151c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12152d = false;

    /* renamed from: e  reason: collision with root package name */
    private z0 f12153e = z0.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    private y1 f12154f;

    public c1(b1 b1Var, p.a aVar, com.google.firebase.firestore.o<y1> oVar) {
        this.f12149a = b1Var;
        this.f12151c = oVar;
        this.f12150b = aVar;
    }

    private void e(y1 y1Var) {
        q6.b.d(!this.f12152d, "Trying to raise initial event for second time", new Object[0]);
        y1 c10 = y1.c(y1Var.h(), y1Var.e(), y1Var.f(), y1Var.k(), y1Var.b(), y1Var.i());
        this.f12152d = true;
        this.f12151c.a(c10, null);
    }

    private boolean f(y1 y1Var) {
        boolean z10 = true;
        if (y1Var.d().isEmpty()) {
            y1 y1Var2 = this.f12154f;
            z10 = (y1Var2 == null || y1Var2.j() == y1Var.j()) ? false : false;
            if (y1Var.a() || z10) {
                return this.f12150b.f12280b;
            }
            return false;
        }
        return true;
    }

    private boolean g(y1 y1Var, z0 z0Var) {
        q6.b.d(!this.f12152d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (y1Var.k()) {
            z0 z0Var2 = z0.OFFLINE;
            boolean z10 = !z0Var.equals(z0Var2);
            if (!this.f12150b.f12281c || !z10) {
                return !y1Var.e().isEmpty() || y1Var.i() || z0Var.equals(z0Var2);
            }
            q6.b.d(y1Var.k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
            return false;
        }
        return true;
    }

    public b1 a() {
        return this.f12149a;
    }

    public void b(com.google.firebase.firestore.z zVar) {
        this.f12151c.a(null, zVar);
    }

    public boolean c(z0 z0Var) {
        this.f12153e = z0Var;
        y1 y1Var = this.f12154f;
        if (y1Var == null || this.f12152d || !g(y1Var, z0Var)) {
            return false;
        }
        e(this.f12154f);
        return true;
    }

    public boolean d(y1 y1Var) {
        boolean z10 = false;
        q6.b.d(!y1Var.d().isEmpty() || y1Var.a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f12150b.f12279a) {
            ArrayList arrayList = new ArrayList();
            for (n nVar : y1Var.d()) {
                if (nVar.c() != n.a.METADATA) {
                    arrayList.add(nVar);
                }
            }
            y1Var = new y1(y1Var.h(), y1Var.e(), y1Var.g(), arrayList, y1Var.k(), y1Var.f(), y1Var.a(), true, y1Var.i());
        }
        if (this.f12152d) {
            if (f(y1Var)) {
                this.f12151c.a(y1Var, null);
                z10 = true;
            }
        } else if (g(y1Var, this.f12153e)) {
            e(y1Var);
            z10 = true;
        }
        this.f12154f = y1Var;
        return z10;
    }
}
