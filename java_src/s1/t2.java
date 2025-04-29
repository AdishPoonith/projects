package s1;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s1.t2;
import u2.p0;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    private final t1.t1 f17556a;

    /* renamed from: e  reason: collision with root package name */
    private final d f17560e;

    /* renamed from: h  reason: collision with root package name */
    private final t1.a f17563h;

    /* renamed from: i  reason: collision with root package name */
    private final p3.n f17564i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17566k;

    /* renamed from: l  reason: collision with root package name */
    private o3.p0 f17567l;

    /* renamed from: j  reason: collision with root package name */
    private u2.p0 f17565j = new p0.a(0);

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<u2.r, c> f17558c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, c> f17559d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f17557b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<c, b> f17561f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private final Set<c> f17562g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements u2.b0, w1.w {

        /* renamed from: a  reason: collision with root package name */
        private final c f17568a;

        public a(c cVar) {
            this.f17568a = cVar;
        }

        private Pair<Integer, u.b> K(int i10, u.b bVar) {
            u.b bVar2 = null;
            if (bVar != null) {
                u.b n10 = t2.n(this.f17568a, bVar);
                if (n10 == null) {
                    return null;
                }
                bVar2 = n10;
            }
            return Pair.create(Integer.valueOf(t2.r(this.f17568a, i10)), bVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void L(Pair pair, u2.q qVar) {
            t2.this.f17563h.T(((Integer) pair.first).intValue(), (u.b) pair.second, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void M(Pair pair) {
            t2.this.f17563h.a0(((Integer) pair.first).intValue(), (u.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            t2.this.f17563h.f0(((Integer) pair.first).intValue(), (u.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void O(Pair pair) {
            t2.this.f17563h.P(((Integer) pair.first).intValue(), (u.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(Pair pair, int i10) {
            t2.this.f17563h.C(((Integer) pair.first).intValue(), (u.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(Pair pair, Exception exc) {
            t2.this.f17563h.I(((Integer) pair.first).intValue(), (u.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair) {
            t2.this.f17563h.G(((Integer) pair.first).intValue(), (u.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, u2.n nVar, u2.q qVar) {
            t2.this.f17563h.Y(((Integer) pair.first).intValue(), (u.b) pair.second, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b0(Pair pair, u2.n nVar, u2.q qVar) {
            t2.this.f17563h.V(((Integer) pair.first).intValue(), (u.b) pair.second, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c0(Pair pair, u2.n nVar, u2.q qVar, IOException iOException, boolean z10) {
            t2.this.f17563h.m0(((Integer) pair.first).intValue(), (u.b) pair.second, nVar, qVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d0(Pair pair, u2.n nVar, u2.q qVar) {
            t2.this.f17563h.U(((Integer) pair.first).intValue(), (u.b) pair.second, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g0(Pair pair, u2.q qVar) {
            t2.this.f17563h.Q(((Integer) pair.first).intValue(), (u.b) p3.a.e((u.b) pair.second), qVar);
        }

        @Override // w1.w
        public void C(int i10, u.b bVar, final int i11) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.R(K, i11);
                    }
                });
            }
        }

        @Override // w1.w
        public void G(int i10, u.b bVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.h2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.W(K);
                    }
                });
            }
        }

        @Override // w1.w
        public void I(int i10, u.b bVar, final Exception exc) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.S(K, exc);
                    }
                });
            }
        }

        @Override // w1.w
        public void P(int i10, u.b bVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.O(K);
                    }
                });
            }
        }

        @Override // u2.b0
        public void Q(int i10, u.b bVar, final u2.q qVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.g0(K, qVar);
                    }
                });
            }
        }

        @Override // u2.b0
        public void T(int i10, u.b bVar, final u2.q qVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.L(K, qVar);
                    }
                });
            }
        }

        @Override // u2.b0
        public void U(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.d0(K, nVar, qVar);
                    }
                });
            }
        }

        @Override // u2.b0
        public void V(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.b0(K, nVar, qVar);
                    }
                });
            }
        }

        @Override // u2.b0
        public void Y(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.X(K, nVar, qVar);
                    }
                });
            }
        }

        @Override // w1.w
        public void a0(int i10, u.b bVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.M(K);
                    }
                });
            }
        }

        @Override // w1.w
        public void f0(int i10, u.b bVar) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.N(K);
                    }
                });
            }
        }

        @Override // w1.w
        public /* synthetic */ void k0(int i10, u.b bVar) {
            w1.p.a(this, i10, bVar);
        }

        @Override // u2.b0
        public void m0(int i10, u.b bVar, final u2.n nVar, final u2.q qVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, u.b> K = K(i10, bVar);
            if (K != null) {
                t2.this.f17564i.k(new Runnable() { // from class: s1.s2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t2.a.this.c0(K, nVar, qVar, iOException, z10);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final u2.u f17570a;

        /* renamed from: b  reason: collision with root package name */
        public final u.c f17571b;

        /* renamed from: c  reason: collision with root package name */
        public final a f17572c;

        public b(u2.u uVar, u.c cVar, a aVar) {
            this.f17570a = uVar;
            this.f17571b = cVar;
            this.f17572c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c implements f2 {

        /* renamed from: a  reason: collision with root package name */
        public final u2.p f17573a;

        /* renamed from: d  reason: collision with root package name */
        public int f17576d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17577e;

        /* renamed from: c  reason: collision with root package name */
        public final List<u.b> f17575c = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f17574b = new Object();

        public c(u2.u uVar, boolean z10) {
            this.f17573a = new u2.p(uVar, z10);
        }

        @Override // s1.f2
        public Object a() {
            return this.f17574b;
        }

        @Override // s1.f2
        public y3 b() {
            return this.f17573a.Z();
        }

        public void c(int i10) {
            this.f17576d = i10;
            this.f17577e = false;
            this.f17575c.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void c();
    }

    public t2(d dVar, t1.a aVar, p3.n nVar, t1.t1 t1Var) {
        this.f17556a = t1Var;
        this.f17560e = dVar;
        this.f17563h = aVar;
        this.f17564i = nVar;
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f17557b.remove(i12);
            this.f17559d.remove(remove.f17574b);
            g(i12, -remove.f17573a.Z().t());
            remove.f17577e = true;
            if (this.f17566k) {
                u(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f17557b.size()) {
            this.f17557b.get(i10).f17576d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f17561f.get(cVar);
        if (bVar != null) {
            bVar.f17570a.k(bVar.f17571b);
        }
    }

    private void k() {
        Iterator<c> it = this.f17562g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f17575c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f17562g.add(cVar);
        b bVar = this.f17561f.get(cVar);
        if (bVar != null) {
            bVar.f17570a.d(bVar.f17571b);
        }
    }

    private static Object m(Object obj) {
        return s1.a.z(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u.b n(c cVar, u.b bVar) {
        for (int i10 = 0; i10 < cVar.f17575c.size(); i10++) {
            if (cVar.f17575c.get(i10).f18972d == bVar.f18972d) {
                return bVar.c(p(cVar, bVar.f18969a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return s1.a.A(obj);
    }

    private static Object p(c cVar, Object obj) {
        return s1.a.C(cVar.f17574b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(c cVar, int i10) {
        return i10 + cVar.f17576d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(u2.u uVar, y3 y3Var) {
        this.f17560e.c();
    }

    private void u(c cVar) {
        if (cVar.f17577e && cVar.f17575c.isEmpty()) {
            b bVar = (b) p3.a.e(this.f17561f.remove(cVar));
            bVar.f17570a.c(bVar.f17571b);
            bVar.f17570a.e(bVar.f17572c);
            bVar.f17570a.q(bVar.f17572c);
            this.f17562g.remove(cVar);
        }
    }

    private void x(c cVar) {
        u2.p pVar = cVar.f17573a;
        u.c cVar2 = new u.c() { // from class: s1.g2
            @Override // u2.u.c
            public final void a(u2.u uVar, y3 y3Var) {
                t2.this.t(uVar, y3Var);
            }
        };
        a aVar = new a(cVar);
        this.f17561f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.l(p3.n0.y(), aVar);
        pVar.p(p3.n0.y(), aVar);
        pVar.h(cVar2, this.f17567l, this.f17556a);
    }

    public y3 A(int i10, int i11, u2.p0 p0Var) {
        p3.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f17565j = p0Var;
        B(i10, i11);
        return i();
    }

    public y3 C(List<c> list, u2.p0 p0Var) {
        B(0, this.f17557b.size());
        return f(this.f17557b.size(), list, p0Var);
    }

    public y3 D(u2.p0 p0Var) {
        int q10 = q();
        if (p0Var.a() != q10) {
            p0Var = p0Var.h().d(0, q10);
        }
        this.f17565j = p0Var;
        return i();
    }

    public y3 f(int i10, List<c> list, u2.p0 p0Var) {
        int i11;
        if (!list.isEmpty()) {
            this.f17565j = p0Var;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f17557b.get(i12 - 1);
                    i11 = cVar2.f17576d + cVar2.f17573a.Z().t();
                } else {
                    i11 = 0;
                }
                cVar.c(i11);
                g(i12, cVar.f17573a.Z().t());
                this.f17557b.add(i12, cVar);
                this.f17559d.put(cVar.f17574b, cVar);
                if (this.f17566k) {
                    x(cVar);
                    if (this.f17558c.isEmpty()) {
                        this.f17562g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public u2.r h(u.b bVar, o3.b bVar2, long j10) {
        Object o10 = o(bVar.f18969a);
        u.b c10 = bVar.c(m(bVar.f18969a));
        c cVar = (c) p3.a.e(this.f17559d.get(o10));
        l(cVar);
        cVar.f17575c.add(c10);
        u2.o n10 = cVar.f17573a.n(c10, bVar2, j10);
        this.f17558c.put(n10, cVar);
        k();
        return n10;
    }

    public y3 i() {
        if (this.f17557b.isEmpty()) {
            return y3.f17792j;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f17557b.size(); i11++) {
            c cVar = this.f17557b.get(i11);
            cVar.f17576d = i10;
            i10 += cVar.f17573a.Z().t();
        }
        return new h3(this.f17557b, this.f17565j);
    }

    public int q() {
        return this.f17557b.size();
    }

    public boolean s() {
        return this.f17566k;
    }

    public y3 v(int i10, int i11, int i12, u2.p0 p0Var) {
        p3.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f17565j = p0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f17557b.get(min).f17576d;
        p3.n0.A0(this.f17557b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f17557b.get(min);
            cVar.f17576d = i13;
            i13 += cVar.f17573a.Z().t();
            min++;
        }
        return i();
    }

    public void w(o3.p0 p0Var) {
        p3.a.f(!this.f17566k);
        this.f17567l = p0Var;
        for (int i10 = 0; i10 < this.f17557b.size(); i10++) {
            c cVar = this.f17557b.get(i10);
            x(cVar);
            this.f17562g.add(cVar);
        }
        this.f17566k = true;
    }

    public void y() {
        for (b bVar : this.f17561f.values()) {
            try {
                bVar.f17570a.c(bVar.f17571b);
            } catch (RuntimeException e10) {
                p3.r.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f17570a.e(bVar.f17572c);
            bVar.f17570a.q(bVar.f17572c);
        }
        this.f17561f.clear();
        this.f17562g.clear();
        this.f17566k = false;
    }

    public void z(u2.r rVar) {
        c cVar = (c) p3.a.e(this.f17558c.remove(rVar));
        cVar.f17573a.b(rVar);
        cVar.f17575c.remove(((u2.o) rVar).f18926j);
        if (!this.f17558c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
