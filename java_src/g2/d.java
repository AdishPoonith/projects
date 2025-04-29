package g2;

import android.net.Uri;
import java.util.Map;
import p3.a0;
import s1.u2;
import x1.e0;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
/* loaded from: classes.dex */
public class d implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final r f8905d = new r() { // from class: g2.c
        @Override // x1.r
        public final l[] a() {
            l[] e10;
            e10 = d.e();
            return e10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private n f8906a;

    /* renamed from: b  reason: collision with root package name */
    private i f8907b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8908c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] e() {
        return new l[]{new d()};
    }

    private static a0 f(a0 a0Var) {
        a0Var.T(0);
        return a0Var;
    }

    private boolean g(m mVar) {
        i hVar;
        f fVar = new f();
        if (fVar.a(mVar, true) && (fVar.f8915b & 2) == 2) {
            int min = Math.min(fVar.f8922i, 8);
            a0 a0Var = new a0(min);
            mVar.n(a0Var.e(), 0, min);
            if (b.p(f(a0Var))) {
                hVar = new b();
            } else if (j.r(f(a0Var))) {
                hVar = new j();
            } else if (h.o(f(a0Var))) {
                hVar = new h();
            }
            this.f8907b = hVar;
            return true;
        }
        return false;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        i iVar = this.f8907b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f8906a = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        p3.a.h(this.f8906a);
        if (this.f8907b == null) {
            if (!g(mVar)) {
                throw u2.a("Failed to determine bitstream type", null);
            }
            mVar.f();
        }
        if (!this.f8908c) {
            e0 d10 = this.f8906a.d(0, 1);
            this.f8906a.k();
            this.f8907b.d(this.f8906a, d10);
            this.f8908c = true;
        }
        return this.f8907b.g(mVar, a0Var);
    }

    @Override // x1.l
    public boolean j(m mVar) {
        try {
            return g(mVar);
        } catch (u2 unused) {
            return false;
        }
    }
}
