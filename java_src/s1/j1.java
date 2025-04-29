package s1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.a;
import n3.c0;
import s1.g3;
import s1.l;
import s1.l3;
import s1.t2;
import s1.v1;
import s1.y3;
import u2.r;
import u2.u;
import w1.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 implements Handler.Callback, r.a, c0.a, t2.d, l.a, g3.a {
    private final f A;
    private final e2 B;
    private final t2 C;
    private final s1 D;
    private final long E;
    private q3 F;
    private z2 G;
    private e H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private h T;
    private long U;
    private int V;
    private boolean W;
    private q X;
    private long Y;
    private long Z = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private final l3[] f17291j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<l3> f17292k;

    /* renamed from: l  reason: collision with root package name */
    private final n3[] f17293l;

    /* renamed from: m  reason: collision with root package name */
    private final n3.c0 f17294m;

    /* renamed from: n  reason: collision with root package name */
    private final n3.d0 f17295n;

    /* renamed from: o  reason: collision with root package name */
    private final t1 f17296o;

    /* renamed from: p  reason: collision with root package name */
    private final o3.f f17297p;

    /* renamed from: q  reason: collision with root package name */
    private final p3.n f17298q;

    /* renamed from: r  reason: collision with root package name */
    private final HandlerThread f17299r;

    /* renamed from: s  reason: collision with root package name */
    private final Looper f17300s;

    /* renamed from: t  reason: collision with root package name */
    private final y3.d f17301t;

    /* renamed from: u  reason: collision with root package name */
    private final y3.b f17302u;

    /* renamed from: v  reason: collision with root package name */
    private final long f17303v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f17304w;

    /* renamed from: x  reason: collision with root package name */
    private final l f17305x;

    /* renamed from: y  reason: collision with root package name */
    private final ArrayList<d> f17306y;

    /* renamed from: z  reason: collision with root package name */
    private final p3.d f17307z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l3.a {
        a() {
        }

        @Override // s1.l3.a
        public void a() {
            j1.this.Q = true;
        }

        @Override // s1.l3.a
        public void b() {
            j1.this.f17298q.d(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<t2.c> f17309a;

        /* renamed from: b  reason: collision with root package name */
        private final u2.p0 f17310b;

        /* renamed from: c  reason: collision with root package name */
        private final int f17311c;

        /* renamed from: d  reason: collision with root package name */
        private final long f17312d;

        private b(List<t2.c> list, u2.p0 p0Var, int i10, long j10) {
            this.f17309a = list;
            this.f17310b = p0Var;
            this.f17311c = i10;
            this.f17312d = j10;
        }

        /* synthetic */ b(List list, u2.p0 p0Var, int i10, long j10, a aVar) {
            this(list, p0Var, i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f17313a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17314b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17315c;

        /* renamed from: d  reason: collision with root package name */
        public final u2.p0 f17316d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: j  reason: collision with root package name */
        public final g3 f17317j;

        /* renamed from: k  reason: collision with root package name */
        public int f17318k;

        /* renamed from: l  reason: collision with root package name */
        public long f17319l;

        /* renamed from: m  reason: collision with root package name */
        public Object f17320m;

        public d(g3 g3Var) {
            this.f17317j = g3Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            Object obj = this.f17320m;
            if ((obj == null) != (dVar.f17320m == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.f17318k - dVar.f17318k;
                return i10 != 0 ? i10 : p3.n0.o(this.f17319l, dVar.f17319l);
            }
        }

        public void g(int i10, long j10, Object obj) {
            this.f17318k = i10;
            this.f17319l = j10;
            this.f17320m = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private boolean f17321a;

        /* renamed from: b  reason: collision with root package name */
        public z2 f17322b;

        /* renamed from: c  reason: collision with root package name */
        public int f17323c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17324d;

        /* renamed from: e  reason: collision with root package name */
        public int f17325e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f17326f;

        /* renamed from: g  reason: collision with root package name */
        public int f17327g;

        public e(z2 z2Var) {
            this.f17322b = z2Var;
        }

        public void b(int i10) {
            this.f17321a |= i10 > 0;
            this.f17323c += i10;
        }

        public void c(int i10) {
            this.f17321a = true;
            this.f17326f = true;
            this.f17327g = i10;
        }

        public void d(z2 z2Var) {
            this.f17321a |= this.f17322b != z2Var;
            this.f17322b = z2Var;
        }

        public void e(int i10) {
            if (this.f17324d && this.f17325e != 5) {
                p3.a.a(i10 == 5);
                return;
            }
            this.f17321a = true;
            this.f17324d = true;
            this.f17325e = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final u.b f17328a;

        /* renamed from: b  reason: collision with root package name */
        public final long f17329b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17330c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17331d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f17332e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f17333f;

        public g(u.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f17328a = bVar;
            this.f17329b = j10;
            this.f17330c = j11;
            this.f17331d = z10;
            this.f17332e = z11;
            this.f17333f = z12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final y3 f17334a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17335b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17336c;

        public h(y3 y3Var, int i10, long j10) {
            this.f17334a = y3Var;
            this.f17335b = i10;
            this.f17336c = j10;
        }
    }

    public j1(l3[] l3VarArr, n3.c0 c0Var, n3.d0 d0Var, t1 t1Var, o3.f fVar, int i10, boolean z10, t1.a aVar, q3 q3Var, s1 s1Var, long j10, boolean z11, Looper looper, p3.d dVar, f fVar2, t1.t1 t1Var2, Looper looper2) {
        this.A = fVar2;
        this.f17291j = l3VarArr;
        this.f17294m = c0Var;
        this.f17295n = d0Var;
        this.f17296o = t1Var;
        this.f17297p = fVar;
        this.N = i10;
        this.O = z10;
        this.F = q3Var;
        this.D = s1Var;
        this.E = j10;
        this.Y = j10;
        this.J = z11;
        this.f17307z = dVar;
        this.f17303v = t1Var.j();
        this.f17304w = t1Var.c();
        z2 j11 = z2.j(d0Var);
        this.G = j11;
        this.H = new e(j11);
        this.f17293l = new n3[l3VarArr.length];
        for (int i11 = 0; i11 < l3VarArr.length; i11++) {
            l3VarArr[i11].u(i11, t1Var2);
            this.f17293l[i11] = l3VarArr[i11].w();
        }
        this.f17305x = new l(this, dVar);
        this.f17306y = new ArrayList<>();
        this.f17292k = com.google.common.collect.p0.h();
        this.f17301t = new y3.d();
        this.f17302u = new y3.b();
        c0Var.b(this, fVar);
        this.W = true;
        p3.n c10 = dVar.c(looper, null);
        this.B = new e2(aVar, c10);
        this.C = new t2(this, aVar, c10, t1Var2);
        if (looper2 != null) {
            this.f17299r = null;
            this.f17300s = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.f17299r = handlerThread;
            handlerThread.start();
            this.f17300s = handlerThread.getLooper();
        }
        this.f17298q = dVar.c(this.f17300s, this);
    }

    private long A() {
        b2 q10 = this.B.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f17092d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.f17291j;
            if (i10 >= l3VarArr.length) {
                return l10;
            }
            if (R(l3VarArr[i10]) && this.f17291j[i10].n() == q10.f17091c[i10]) {
                long r10 = this.f17291j[i10].r();
                if (r10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(r10, l10);
            }
            i10++;
        }
    }

    private void A0(long j10, long j11) {
        this.f17298q.f(2, j10 + j11);
    }

    private Pair<u.b, Long> B(y3 y3Var) {
        if (y3Var.u()) {
            return Pair.create(z2.k(), 0L);
        }
        Pair<Object, Long> n10 = y3Var.n(this.f17301t, this.f17302u, y3Var.e(this.O), -9223372036854775807L);
        u.b B = this.B.B(y3Var, n10.first, 0L);
        long longValue = ((Long) n10.second).longValue();
        if (B.b()) {
            y3Var.l(B.f18969a, this.f17302u);
            longValue = B.f18971c == this.f17302u.n(B.f18970b) ? this.f17302u.j() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    private void C0(boolean z10) {
        u.b bVar = this.B.p().f17094f.f17116a;
        long F0 = F0(bVar, this.G.f17853r, true, false);
        if (F0 != this.G.f17853r) {
            z2 z2Var = this.G;
            this.G = M(bVar, F0, z2Var.f17838c, z2Var.f17839d, z10, 5);
        }
    }

    private long D() {
        return E(this.G.f17851p);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x0146, TryCatch #1 {all -> 0x0146, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D0(s1.j1.h r20) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j1.D0(s1.j1$h):void");
    }

    private long E(long j10) {
        b2 j11 = this.B.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.U));
    }

    private long E0(u.b bVar, long j10, boolean z10) {
        return F0(bVar, j10, this.B.p() != this.B.q(), z10);
    }

    private void F(u2.r rVar) {
        if (this.B.v(rVar)) {
            this.B.y(this.U);
            W();
        }
    }

    private long F0(u.b bVar, long j10, boolean z10, boolean z11) {
        j1();
        this.L = false;
        if (z11 || this.G.f17840e == 3) {
            a1(2);
        }
        b2 p10 = this.B.p();
        b2 b2Var = p10;
        while (b2Var != null && !bVar.equals(b2Var.f17094f.f17116a)) {
            b2Var = b2Var.j();
        }
        if (z10 || p10 != b2Var || (b2Var != null && b2Var.z(j10) < 0)) {
            for (l3 l3Var : this.f17291j) {
                o(l3Var);
            }
            if (b2Var != null) {
                while (this.B.p() != b2Var) {
                    this.B.b();
                }
                this.B.z(b2Var);
                b2Var.x(1000000000000L);
                s();
            }
        }
        e2 e2Var = this.B;
        if (b2Var != null) {
            e2Var.z(b2Var);
            if (!b2Var.f17092d) {
                b2Var.f17094f = b2Var.f17094f.b(j10);
            } else if (b2Var.f17093e) {
                long s10 = b2Var.f17089a.s(j10);
                b2Var.f17089a.r(s10 - this.f17303v, this.f17304w);
                j10 = s10;
            }
            t0(j10);
            W();
        } else {
            e2Var.f();
            t0(j10);
        }
        H(false);
        this.f17298q.d(2);
        return j10;
    }

    private void G(IOException iOException, int i10) {
        q g10 = q.g(iOException, i10);
        b2 p10 = this.B.p();
        if (p10 != null) {
            g10 = g10.e(p10.f17094f.f17116a);
        }
        p3.r.d("ExoPlayerImplInternal", "Playback error", g10);
        i1(false, false);
        this.G = this.G.e(g10);
    }

    private void G0(g3 g3Var) {
        if (g3Var.f() == -9223372036854775807L) {
            H0(g3Var);
        } else if (this.G.f17836a.u()) {
            this.f17306y.add(new d(g3Var));
        } else {
            d dVar = new d(g3Var);
            y3 y3Var = this.G.f17836a;
            if (!v0(dVar, y3Var, y3Var, this.N, this.O, this.f17301t, this.f17302u)) {
                g3Var.k(false);
                return;
            }
            this.f17306y.add(dVar);
            Collections.sort(this.f17306y);
        }
    }

    private void H(boolean z10) {
        b2 j10 = this.B.j();
        u.b bVar = j10 == null ? this.G.f17837b : j10.f17094f.f17116a;
        boolean z11 = !this.G.f17846k.equals(bVar);
        if (z11) {
            this.G = this.G.b(bVar);
        }
        z2 z2Var = this.G;
        z2Var.f17851p = j10 == null ? z2Var.f17853r : j10.i();
        this.G.f17852q = D();
        if ((z11 || z10) && j10 != null && j10.f17092d) {
            l1(j10.n(), j10.o());
        }
    }

    private void H0(g3 g3Var) {
        if (g3Var.c() != this.f17300s) {
            this.f17298q.h(15, g3Var).a();
            return;
        }
        n(g3Var);
        int i10 = this.G.f17840e;
        if (i10 == 3 || i10 == 2) {
            this.f17298q.d(2);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x013a: MOVE  (r5 I:??[long, double]) = (r25 I:??[long, double]), block:B:70:0x0139 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I(s1.y3 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j1.I(s1.y3, boolean):void");
    }

    private void I0(final g3 g3Var) {
        Looper c10 = g3Var.c();
        if (c10.getThread().isAlive()) {
            this.f17307z.c(c10, null).k(new Runnable() { // from class: s1.i1
                @Override // java.lang.Runnable
                public final void run() {
                    j1.this.V(g3Var);
                }
            });
            return;
        }
        p3.r.i("TAG", "Trying to send message on a dead thread.");
        g3Var.k(false);
    }

    private void J(u2.r rVar) {
        if (this.B.v(rVar)) {
            b2 j10 = this.B.j();
            j10.p(this.f17305x.g().f17108j, this.G.f17836a);
            l1(j10.n(), j10.o());
            if (j10 == this.B.p()) {
                t0(j10.f17094f.f17117b);
                s();
                z2 z2Var = this.G;
                u.b bVar = z2Var.f17837b;
                long j11 = j10.f17094f.f17117b;
                this.G = M(bVar, j11, z2Var.f17838c, j11, false, 5);
            }
            W();
        }
    }

    private void J0(long j10) {
        l3[] l3VarArr;
        for (l3 l3Var : this.f17291j) {
            if (l3Var.n() != null) {
                K0(l3Var, j10);
            }
        }
    }

    private void K(b3 b3Var, float f10, boolean z10, boolean z11) {
        l3[] l3VarArr;
        if (z10) {
            if (z11) {
                this.H.b(1);
            }
            this.G = this.G.f(b3Var);
        }
        p1(b3Var.f17108j);
        for (l3 l3Var : this.f17291j) {
            if (l3Var != null) {
                l3Var.y(f10, b3Var.f17108j);
            }
        }
    }

    private void K0(l3 l3Var, long j10) {
        l3Var.o();
        if (l3Var instanceof d3.o) {
            ((d3.o) l3Var).b0(j10);
        }
    }

    private void L(b3 b3Var, boolean z10) {
        K(b3Var, b3Var.f17108j, true, z10);
    }

    private void L0(boolean z10, AtomicBoolean atomicBoolean) {
        l3[] l3VarArr;
        if (this.P != z10) {
            this.P = z10;
            if (!z10) {
                for (l3 l3Var : this.f17291j) {
                    if (!R(l3Var) && this.f17292k.remove(l3Var)) {
                        l3Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z2 M(u.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        u2.v0 v0Var;
        n3.d0 d0Var;
        this.W = (!this.W && j10 == this.G.f17853r && bVar.equals(this.G.f17837b)) ? false : true;
        s0();
        z2 z2Var = this.G;
        u2.v0 v0Var2 = z2Var.f17843h;
        n3.d0 d0Var2 = z2Var.f17844i;
        List list2 = z2Var.f17845j;
        if (this.C.s()) {
            b2 p10 = this.B.p();
            u2.v0 n10 = p10 == null ? u2.v0.f18988m : p10.n();
            n3.d0 o10 = p10 == null ? this.f17295n : p10.o();
            List w10 = w(o10.f14156c);
            if (p10 != null) {
                c2 c2Var = p10.f17094f;
                if (c2Var.f17118c != j11) {
                    p10.f17094f = c2Var.a(j11);
                }
            }
            v0Var = n10;
            d0Var = o10;
            list = w10;
        } else if (bVar.equals(this.G.f17837b)) {
            list = list2;
            v0Var = v0Var2;
            d0Var = d0Var2;
        } else {
            v0Var = u2.v0.f18988m;
            d0Var = this.f17295n;
            list = com.google.common.collect.q.z();
        }
        if (z10) {
            this.H.e(i10);
        }
        return this.G.c(bVar, j10, j11, j12, D(), v0Var, d0Var, list);
    }

    private void M0(b3 b3Var) {
        this.f17298q.g(16);
        this.f17305x.c(b3Var);
    }

    private boolean N(l3 l3Var, b2 b2Var) {
        b2 j10 = b2Var.j();
        return b2Var.f17094f.f17121f && j10.f17092d && ((l3Var instanceof d3.o) || (l3Var instanceof k2.g) || l3Var.r() >= j10.m());
    }

    private void N0(b bVar) {
        this.H.b(1);
        if (bVar.f17311c != -1) {
            this.T = new h(new h3(bVar.f17309a, bVar.f17310b), bVar.f17311c, bVar.f17312d);
        }
        I(this.C.C(bVar.f17309a, bVar.f17310b), false);
    }

    private boolean O() {
        b2 q10 = this.B.q();
        if (q10.f17092d) {
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = this.f17291j;
                if (i10 >= l3VarArr.length) {
                    return true;
                }
                l3 l3Var = l3VarArr[i10];
                u2.n0 n0Var = q10.f17091c[i10];
                if (l3Var.n() != n0Var || (n0Var != null && !l3Var.j() && !N(l3Var, q10))) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return false;
    }

    private static boolean P(boolean z10, u.b bVar, long j10, u.b bVar2, y3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f18969a.equals(bVar2.f18969a)) {
            return (bVar.b() && bVar3.t(bVar.f18970b)) ? (bVar3.k(bVar.f18970b, bVar.f18971c) == 4 || bVar3.k(bVar.f18970b, bVar.f18971c) == 2) ? false : true : bVar2.b() && bVar3.t(bVar2.f18970b);
        }
        return false;
    }

    private void P0(boolean z10) {
        if (z10 == this.R) {
            return;
        }
        this.R = z10;
        if (z10 || !this.G.f17850o) {
            return;
        }
        this.f17298q.d(2);
    }

    private boolean Q() {
        b2 j10 = this.B.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    private void Q0(boolean z10) {
        this.J = z10;
        s0();
        if (!this.K || this.B.q() == this.B.p()) {
            return;
        }
        C0(true);
        H(false);
    }

    private static boolean R(l3 l3Var) {
        return l3Var.getState() != 0;
    }

    private boolean S() {
        b2 p10 = this.B.p();
        long j10 = p10.f17094f.f17120e;
        return p10.f17092d && (j10 == -9223372036854775807L || this.G.f17853r < j10 || !d1());
    }

    private void S0(boolean z10, int i10, boolean z11, int i11) {
        this.H.b(z11 ? 1 : 0);
        this.H.c(i11);
        this.G = this.G.d(z10, i10);
        this.L = false;
        g0(z10);
        if (!d1()) {
            j1();
            n1();
            return;
        }
        int i12 = this.G.f17840e;
        if (i12 == 3) {
            g1();
        } else if (i12 != 2) {
            return;
        }
        this.f17298q.d(2);
    }

    private static boolean T(z2 z2Var, y3.b bVar) {
        u.b bVar2 = z2Var.f17837b;
        y3 y3Var = z2Var.f17836a;
        return y3Var.u() || y3Var.l(bVar2.f18969a, bVar).f17808o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U() {
        return Boolean.valueOf(this.I);
    }

    private void U0(b3 b3Var) {
        M0(b3Var);
        L(this.f17305x.g(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(g3 g3Var) {
        try {
            n(g3Var);
        } catch (q e10) {
            p3.r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void W() {
        boolean c12 = c1();
        this.M = c12;
        if (c12) {
            this.B.j().d(this.U);
        }
        k1();
    }

    private void W0(int i10) {
        this.N = i10;
        if (!this.B.G(this.G.f17836a, i10)) {
            C0(true);
        }
        H(false);
    }

    private void X() {
        this.H.d(this.G);
        if (this.H.f17321a) {
            this.A.a(this.H);
            this.H = new e(this.G);
        }
    }

    private void X0(q3 q3Var) {
        this.F = q3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r1 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        r3 = r7.f17306y.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        r4 = r3.f17318k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r4 > r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r4 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r3.f17319l <= r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1 <= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r1 >= r7.f17306y.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        r3 = r7.f17306y.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r3.f17320m == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r4 = r3.f17318k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r4 < r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r4 != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r3.f17319l > r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
        if (r1 >= r7.f17306y.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r3 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
        if (r3.f17320m == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r3.f17318k != r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r4 = r3.f17319l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        if (r4 <= r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
        if (r4 > r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
        H0(r3.f17317j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
        if (r3.f17317j.b() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r3.f17317j.j() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
        r7.f17306y.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
        if (r1 >= r7.f17306y.size()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r3 = r7.f17306y.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        if (r3.f17317j.b() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
        r7.f17306y.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        r7.V = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
        return;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0055 -> B:12:0x0039). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0069 -> B:27:0x006a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:25:0x0060). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j1.Y(long, long):void");
    }

    private void Y0(boolean z10) {
        this.O = z10;
        if (!this.B.H(this.G.f17836a, z10)) {
            C0(true);
        }
        H(false);
    }

    private void Z() {
        c2 o10;
        this.B.y(this.U);
        if (this.B.D() && (o10 = this.B.o(this.U, this.G)) != null) {
            b2 g10 = this.B.g(this.f17293l, this.f17294m, this.f17296o.g(), this.C, o10, this.f17295n);
            g10.f17089a.j(this, o10.f17117b);
            if (this.B.p() == g10) {
                t0(o10.f17117b);
            }
            H(false);
        }
        if (!this.M) {
            W();
            return;
        }
        this.M = Q();
        k1();
    }

    private void Z0(u2.p0 p0Var) {
        this.H.b(1);
        I(this.C.D(p0Var), false);
    }

    private void a0() {
        boolean z10;
        boolean z11 = false;
        while (b1()) {
            if (z11) {
                X();
            }
            b2 b2Var = (b2) p3.a.e(this.B.b());
            if (this.G.f17837b.f18969a.equals(b2Var.f17094f.f17116a.f18969a)) {
                u.b bVar = this.G.f17837b;
                if (bVar.f18970b == -1) {
                    u.b bVar2 = b2Var.f17094f.f17116a;
                    if (bVar2.f18970b == -1 && bVar.f18973e != bVar2.f18973e) {
                        z10 = true;
                        c2 c2Var = b2Var.f17094f;
                        u.b bVar3 = c2Var.f17116a;
                        long j10 = c2Var.f17117b;
                        this.G = M(bVar3, j10, c2Var.f17118c, j10, !z10, 0);
                        s0();
                        n1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            c2 c2Var2 = b2Var.f17094f;
            u.b bVar32 = c2Var2.f17116a;
            long j102 = c2Var2.f17117b;
            this.G = M(bVar32, j102, c2Var2.f17118c, j102, !z10, 0);
            s0();
            n1();
            z11 = true;
        }
    }

    private void a1(int i10) {
        z2 z2Var = this.G;
        if (z2Var.f17840e != i10) {
            if (i10 != 2) {
                this.Z = -9223372036854775807L;
            }
            this.G = z2Var.g(i10);
        }
    }

    private void b0() {
        b2 q10 = this.B.q();
        if (q10 == null) {
            return;
        }
        int i10 = 0;
        if (q10.j() != null && !this.K) {
            if (O()) {
                if (q10.j().f17092d || this.U >= q10.j().m()) {
                    n3.d0 o10 = q10.o();
                    b2 c10 = this.B.c();
                    n3.d0 o11 = c10.o();
                    y3 y3Var = this.G.f17836a;
                    o1(y3Var, c10.f17094f.f17116a, y3Var, q10.f17094f.f17116a, -9223372036854775807L, false);
                    if (c10.f17092d && c10.f17089a.n() != -9223372036854775807L) {
                        J0(c10.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f17291j.length; i11++) {
                        boolean c11 = o10.c(i11);
                        boolean c12 = o11.c(i11);
                        if (c11 && !this.f17291j[i11].t()) {
                            boolean z10 = this.f17293l[i11].h() == -2;
                            o3 o3Var = o10.f14155b[i11];
                            o3 o3Var2 = o11.f14155b[i11];
                            if (!c12 || !o3Var2.equals(o3Var) || z10) {
                                K0(this.f17291j[i11], c10.m());
                            }
                        }
                    }
                }
            }
        } else if (q10.f17094f.f17124i || this.K) {
            while (true) {
                l3[] l3VarArr = this.f17291j;
                if (i10 >= l3VarArr.length) {
                    return;
                }
                l3 l3Var = l3VarArr[i10];
                u2.n0 n0Var = q10.f17091c[i10];
                if (n0Var != null && l3Var.n() == n0Var && l3Var.j()) {
                    long j10 = q10.f17094f.f17120e;
                    K0(l3Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f17094f.f17120e);
                }
                i10++;
            }
        }
    }

    private boolean b1() {
        b2 p10;
        b2 j10;
        return d1() && !this.K && (p10 = this.B.p()) != null && (j10 = p10.j()) != null && this.U >= j10.m() && j10.f17095g;
    }

    private void c0() {
        b2 q10 = this.B.q();
        if (q10 == null || this.B.p() == q10 || q10.f17095g || !p0()) {
            return;
        }
        s();
    }

    private boolean c1() {
        if (Q()) {
            b2 j10 = this.B.j();
            long E = E(j10.k());
            long y10 = j10 == this.B.p() ? j10.y(this.U) : j10.y(this.U) - j10.f17094f.f17117b;
            boolean f10 = this.f17296o.f(y10, E, this.f17305x.g().f17108j);
            if (f10 || E >= 500000) {
                return f10;
            }
            if (this.f17303v > 0 || this.f17304w) {
                this.B.p().f17089a.r(this.G.f17853r, false);
                return this.f17296o.f(y10, E, this.f17305x.g().f17108j);
            }
            return f10;
        }
        return false;
    }

    private void d0() {
        I(this.C.i(), true);
    }

    private boolean d1() {
        z2 z2Var = this.G;
        return z2Var.f17847l && z2Var.f17848m == 0;
    }

    private void e0(c cVar) {
        this.H.b(1);
        I(this.C.v(cVar.f17313a, cVar.f17314b, cVar.f17315c, cVar.f17316d), false);
    }

    private boolean e1(boolean z10) {
        if (this.S == 0) {
            return S();
        }
        if (z10) {
            z2 z2Var = this.G;
            if (z2Var.f17842g) {
                long e10 = f1(z2Var.f17836a, this.B.p().f17094f.f17116a) ? this.D.e() : -9223372036854775807L;
                b2 j10 = this.B.j();
                return (j10.q() && j10.f17094f.f17124i) || (j10.f17094f.f17116a.b() && !j10.f17092d) || this.f17296o.e(D(), this.f17305x.g().f17108j, this.L, e10);
            }
            return true;
        }
        return false;
    }

    private void f0() {
        n3.t[] tVarArr;
        for (b2 p10 = this.B.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f14156c) {
                if (tVar != null) {
                    tVar.s();
                }
            }
        }
    }

    private boolean f1(y3 y3Var, u.b bVar) {
        if (bVar.b() || y3Var.u()) {
            return false;
        }
        y3Var.r(y3Var.l(bVar.f18969a, this.f17302u).f17805l, this.f17301t);
        if (this.f17301t.g()) {
            y3.d dVar = this.f17301t;
            return dVar.f17822r && dVar.f17819o != -9223372036854775807L;
        }
        return false;
    }

    private void g0(boolean z10) {
        n3.t[] tVarArr;
        for (b2 p10 = this.B.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f14156c) {
                if (tVar != null) {
                    tVar.h(z10);
                }
            }
        }
    }

    private void g1() {
        l3[] l3VarArr;
        this.L = false;
        this.f17305x.f();
        for (l3 l3Var : this.f17291j) {
            if (R(l3Var)) {
                l3Var.start();
            }
        }
    }

    private void h0() {
        n3.t[] tVarArr;
        for (b2 p10 = this.B.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f14156c) {
                if (tVar != null) {
                    tVar.t();
                }
            }
        }
    }

    private void i1(boolean z10, boolean z11) {
        r0(z10 || !this.P, false, true, false);
        this.H.b(z11 ? 1 : 0);
        this.f17296o.h();
        a1(1);
    }

    private void j(b bVar, int i10) {
        this.H.b(1);
        t2 t2Var = this.C;
        if (i10 == -1) {
            i10 = t2Var.q();
        }
        I(t2Var.f(i10, bVar.f17309a, bVar.f17310b), false);
    }

    private void j1() {
        l3[] l3VarArr;
        this.f17305x.h();
        for (l3 l3Var : this.f17291j) {
            if (R(l3Var)) {
                u(l3Var);
            }
        }
    }

    private void k0() {
        this.H.b(1);
        r0(false, false, false, true);
        this.f17296o.b();
        a1(this.G.f17836a.u() ? 4 : 2);
        this.C.w(this.f17297p.a());
        this.f17298q.d(2);
    }

    private void k1() {
        b2 j10 = this.B.j();
        boolean z10 = this.M || (j10 != null && j10.f17089a.a());
        z2 z2Var = this.G;
        if (z10 != z2Var.f17842g) {
            this.G = z2Var.a(z10);
        }
    }

    private void l1(u2.v0 v0Var, n3.d0 d0Var) {
        this.f17296o.i(this.f17291j, v0Var, d0Var.f14156c);
    }

    private void m() {
        C0(true);
    }

    private void m0() {
        r0(true, false, true, false);
        this.f17296o.d();
        a1(1);
        HandlerThread handlerThread = this.f17299r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.I = true;
            notifyAll();
        }
    }

    private void m1() {
        if (this.G.f17836a.u() || !this.C.s()) {
            return;
        }
        Z();
        b0();
        c0();
        a0();
    }

    private void n(g3 g3Var) {
        if (g3Var.j()) {
            return;
        }
        try {
            g3Var.g().m(g3Var.i(), g3Var.e());
        } finally {
            g3Var.k(true);
        }
    }

    private void n0(int i10, int i11, u2.p0 p0Var) {
        this.H.b(1);
        I(this.C.A(i10, i11, p0Var), false);
    }

    private void n1() {
        b2 p10 = this.B.p();
        if (p10 == null) {
            return;
        }
        long n10 = p10.f17092d ? p10.f17089a.n() : -9223372036854775807L;
        if (n10 != -9223372036854775807L) {
            t0(n10);
            if (n10 != this.G.f17853r) {
                z2 z2Var = this.G;
                this.G = M(z2Var.f17837b, n10, z2Var.f17838c, n10, true, 5);
            }
        } else {
            long i10 = this.f17305x.i(p10 != this.B.q());
            this.U = i10;
            long y10 = p10.y(i10);
            Y(this.G.f17853r, y10);
            this.G.f17853r = y10;
        }
        this.G.f17851p = this.B.j().i();
        this.G.f17852q = D();
        z2 z2Var2 = this.G;
        if (z2Var2.f17847l && z2Var2.f17840e == 3 && f1(z2Var2.f17836a, z2Var2.f17837b) && this.G.f17849n.f17108j == 1.0f) {
            float c10 = this.D.c(x(), D());
            if (this.f17305x.g().f17108j != c10) {
                M0(this.G.f17849n.d(c10));
                K(this.G.f17849n, this.f17305x.g().f17108j, false, false);
            }
        }
    }

    private void o(l3 l3Var) {
        if (R(l3Var)) {
            this.f17305x.a(l3Var);
            u(l3Var);
            l3Var.e();
            this.S--;
        }
    }

    private void o1(y3 y3Var, u.b bVar, y3 y3Var2, u.b bVar2, long j10, boolean z10) {
        if (!f1(y3Var, bVar)) {
            b3 b3Var = bVar.b() ? b3.f17104m : this.G.f17849n;
            if (this.f17305x.g().equals(b3Var)) {
                return;
            }
            M0(b3Var);
            K(this.G.f17849n, b3Var.f17108j, false, false);
            return;
        }
        y3Var.r(y3Var.l(bVar.f18969a, this.f17302u).f17805l, this.f17301t);
        this.D.b((v1.g) p3.n0.j(this.f17301t.f17824t));
        if (j10 != -9223372036854775807L) {
            this.D.d(z(y3Var, bVar.f18969a, j10));
            return;
        }
        if (!p3.n0.c(y3Var2.u() ? null : y3Var2.r(y3Var2.l(bVar2.f18969a, this.f17302u).f17805l, this.f17301t).f17814j, this.f17301t.f17814j) || z10) {
            this.D.d(-9223372036854775807L);
        }
    }

    private boolean p0() {
        b2 q10 = this.B.q();
        n3.d0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            l3[] l3VarArr = this.f17291j;
            if (i10 >= l3VarArr.length) {
                return !z10;
            }
            l3 l3Var = l3VarArr[i10];
            if (R(l3Var)) {
                boolean z11 = l3Var.n() != q10.f17091c[i10];
                if (!o10.c(i10) || z11) {
                    if (!l3Var.t()) {
                        l3Var.i(y(o10.f14156c[i10]), q10.f17091c[i10], q10.m(), q10.l());
                    } else if (l3Var.b()) {
                        o(l3Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void p1(float f10) {
        n3.t[] tVarArr;
        for (b2 p10 = this.B.p(); p10 != null; p10 = p10.j()) {
            for (n3.t tVar : p10.o().f14156c) {
                if (tVar != null) {
                    tVar.q(f10);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j1.q():void");
    }

    private void q0() {
        float f10 = this.f17305x.g().f17108j;
        b2 q10 = this.B.q();
        boolean z10 = true;
        for (b2 p10 = this.B.p(); p10 != null && p10.f17092d; p10 = p10.j()) {
            n3.d0 v10 = p10.v(f10, this.G.f17836a);
            if (!v10.a(p10.o())) {
                e2 e2Var = this.B;
                if (z10) {
                    b2 p11 = e2Var.p();
                    boolean z11 = this.B.z(p11);
                    boolean[] zArr = new boolean[this.f17291j.length];
                    long b10 = p11.b(v10, this.G.f17853r, z11, zArr);
                    z2 z2Var = this.G;
                    boolean z12 = (z2Var.f17840e == 4 || b10 == z2Var.f17853r) ? false : true;
                    z2 z2Var2 = this.G;
                    this.G = M(z2Var2.f17837b, b10, z2Var2.f17838c, z2Var2.f17839d, z12, 5);
                    if (z12) {
                        t0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f17291j.length];
                    int i10 = 0;
                    while (true) {
                        l3[] l3VarArr = this.f17291j;
                        if (i10 >= l3VarArr.length) {
                            break;
                        }
                        l3 l3Var = l3VarArr[i10];
                        zArr2[i10] = R(l3Var);
                        u2.n0 n0Var = p11.f17091c[i10];
                        if (zArr2[i10]) {
                            if (n0Var != l3Var.n()) {
                                o(l3Var);
                            } else if (zArr[i10]) {
                                l3Var.s(this.U);
                            }
                        }
                        i10++;
                    }
                    t(zArr2);
                } else {
                    e2Var.z(p10);
                    if (p10.f17092d) {
                        p10.a(v10, Math.max(p10.f17094f.f17117b, p10.y(this.U)), false);
                    }
                }
                H(true);
                if (this.G.f17840e != 4) {
                    W();
                    n1();
                    this.f17298q.d(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    private synchronized void q1(b5.t<Boolean> tVar, long j10) {
        long a10 = this.f17307z.a() + j10;
        boolean z10 = false;
        while (!tVar.get().booleanValue() && j10 > 0) {
            try {
                this.f17307z.d();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = a10 - this.f17307z.a();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void r(int i10, boolean z10) {
        l3 l3Var = this.f17291j[i10];
        if (R(l3Var)) {
            return;
        }
        b2 q10 = this.B.q();
        boolean z11 = q10 == this.B.p();
        n3.d0 o10 = q10.o();
        o3 o3Var = o10.f14155b[i10];
        n1[] y10 = y(o10.f14156c[i10]);
        boolean z12 = d1() && this.G.f17840e == 3;
        boolean z13 = !z10 && z12;
        this.S++;
        this.f17292k.add(l3Var);
        l3Var.p(o3Var, y10, q10.f17091c[i10], this.U, z13, z11, q10.m(), q10.l());
        l3Var.m(11, new a());
        this.f17305x.b(l3Var);
        if (z12) {
            l3Var.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j1.r0(boolean, boolean, boolean, boolean):void");
    }

    private void s() {
        t(new boolean[this.f17291j.length]);
    }

    private void s0() {
        b2 p10 = this.B.p();
        this.K = p10 != null && p10.f17094f.f17123h && this.J;
    }

    private void t(boolean[] zArr) {
        b2 q10 = this.B.q();
        n3.d0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f17291j.length; i10++) {
            if (!o10.c(i10) && this.f17292k.remove(this.f17291j[i10])) {
                this.f17291j[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f17291j.length; i11++) {
            if (o10.c(i11)) {
                r(i11, zArr[i11]);
            }
        }
        q10.f17095g = true;
    }

    private void t0(long j10) {
        l3[] l3VarArr;
        b2 p10 = this.B.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.U = z10;
        this.f17305x.d(z10);
        for (l3 l3Var : this.f17291j) {
            if (R(l3Var)) {
                l3Var.s(this.U);
            }
        }
        f0();
    }

    private void u(l3 l3Var) {
        if (l3Var.getState() == 2) {
            l3Var.stop();
        }
    }

    private static void u0(y3 y3Var, d dVar, y3.d dVar2, y3.b bVar) {
        int i10 = y3Var.r(y3Var.l(dVar.f17320m, bVar).f17805l, dVar2).f17829y;
        Object obj = y3Var.k(i10, bVar, true).f17804k;
        long j10 = bVar.f17806m;
        dVar.g(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean v0(d dVar, y3 y3Var, y3 y3Var2, int i10, boolean z10, y3.d dVar2, y3.b bVar) {
        Object obj = dVar.f17320m;
        if (obj == null) {
            Pair<Object, Long> y02 = y0(y3Var, new h(dVar.f17317j.h(), dVar.f17317j.d(), dVar.f17317j.f() == Long.MIN_VALUE ? -9223372036854775807L : p3.n0.B0(dVar.f17317j.f())), false, i10, z10, dVar2, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.g(y3Var.f(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar.f17317j.f() == Long.MIN_VALUE) {
                u0(y3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f10 = y3Var.f(obj);
        if (f10 == -1) {
            return false;
        }
        if (dVar.f17317j.f() == Long.MIN_VALUE) {
            u0(y3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f17318k = f10;
        y3Var2.l(dVar.f17320m, bVar);
        if (bVar.f17808o && y3Var2.r(bVar.f17805l, dVar2).f17828x == y3Var2.f(dVar.f17320m)) {
            Pair<Object, Long> n10 = y3Var.n(dVar2, bVar, y3Var.l(dVar.f17320m, bVar).f17805l, dVar.f17319l + bVar.q());
            dVar.g(y3Var.f(n10.first), ((Long) n10.second).longValue(), n10.first);
        }
        return true;
    }

    private com.google.common.collect.q<k2.a> w(n3.t[] tVarArr) {
        q.a aVar = new q.a();
        boolean z10 = false;
        for (n3.t tVar : tVarArr) {
            if (tVar != null) {
                k2.a aVar2 = tVar.a(0).f17417s;
                if (aVar2 == null) {
                    aVar.a(new k2.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : com.google.common.collect.q.z();
    }

    private void w0(y3 y3Var, y3 y3Var2) {
        if (y3Var.u() && y3Var2.u()) {
            return;
        }
        for (int size = this.f17306y.size() - 1; size >= 0; size--) {
            if (!v0(this.f17306y.get(size), y3Var, y3Var2, this.N, this.O, this.f17301t, this.f17302u)) {
                this.f17306y.get(size).f17317j.k(false);
                this.f17306y.remove(size);
            }
        }
        Collections.sort(this.f17306y);
    }

    private long x() {
        z2 z2Var = this.G;
        return z(z2Var.f17836a, z2Var.f17837b.f18969a, z2Var.f17853r);
    }

    private static g x0(y3 y3Var, z2 z2Var, h hVar, e2 e2Var, int i10, boolean z10, y3.d dVar, y3.b bVar) {
        int i11;
        u.b bVar2;
        long j10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        e2 e2Var2;
        long j11;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        if (y3Var.u()) {
            return new g(z2.k(), 0L, -9223372036854775807L, false, true, false);
        }
        u.b bVar3 = z2Var.f17837b;
        Object obj = bVar3.f18969a;
        boolean T = T(z2Var, bVar);
        long j12 = (z2Var.f17837b.b() || T) ? z2Var.f17838c : z2Var.f17853r;
        boolean z18 = true;
        if (hVar != null) {
            i11 = -1;
            Pair<Object, Long> y02 = y0(y3Var, hVar, true, i10, z10, dVar, bVar);
            if (y02 == null) {
                i16 = y3Var.e(z10);
                j10 = j12;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f17336c == -9223372036854775807L) {
                    i16 = y3Var.l(y02.first, bVar).f17805l;
                    j10 = j12;
                    z15 = false;
                } else {
                    obj = y02.first;
                    j10 = ((Long) y02.second).longValue();
                    z15 = true;
                    i16 = -1;
                }
                z16 = z2Var.f17840e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
            i12 = i16;
            bVar2 = bVar3;
        } else {
            i11 = -1;
            if (z2Var.f17836a.u()) {
                i13 = y3Var.e(z10);
            } else if (y3Var.f(obj) == -1) {
                Object z02 = z0(dVar, bVar, i10, z10, obj, z2Var.f17836a, y3Var);
                if (z02 == null) {
                    i14 = y3Var.e(z10);
                    z14 = true;
                } else {
                    i14 = y3Var.l(z02, bVar).f17805l;
                    z14 = false;
                }
                i12 = i14;
                z12 = z14;
                j10 = j12;
                bVar2 = bVar3;
                z11 = false;
                z13 = false;
            } else if (j12 == -9223372036854775807L) {
                i13 = y3Var.l(obj, bVar).f17805l;
            } else if (T) {
                bVar2 = bVar3;
                z2Var.f17836a.l(bVar2.f18969a, bVar);
                if (z2Var.f17836a.r(bVar.f17805l, dVar).f17828x == z2Var.f17836a.f(bVar2.f18969a)) {
                    Pair<Object, Long> n10 = y3Var.n(dVar, bVar, y3Var.l(obj, bVar).f17805l, j12 + bVar.q());
                    obj = n10.first;
                    j10 = ((Long) n10.second).longValue();
                } else {
                    j10 = j12;
                }
                i12 = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                bVar2 = bVar3;
                j10 = j12;
                i12 = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            i12 = i13;
            j10 = j12;
            bVar2 = bVar3;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (i12 != i11) {
            Pair<Object, Long> n11 = y3Var.n(dVar, bVar, i12, -9223372036854775807L);
            obj = n11.first;
            j10 = ((Long) n11.second).longValue();
            e2Var2 = e2Var;
            j11 = -9223372036854775807L;
        } else {
            e2Var2 = e2Var;
            j11 = j10;
        }
        u.b B = e2Var2.B(y3Var, obj, j10);
        int i17 = B.f18973e;
        z18 = (!bVar2.f18969a.equals(obj) || bVar2.b() || B.b() || !(i17 == i11 || ((i15 = bVar2.f18973e) != i11 && i17 >= i15))) ? false : false;
        Object obj2 = bVar2;
        boolean P = P(T, bVar2, j12, B, y3Var.l(obj, bVar), j11);
        if (z18 || P) {
            B = obj2;
        }
        if (B.b()) {
            if (B.equals(obj2)) {
                j10 = z2Var.f17853r;
            } else {
                y3Var.l(B.f18969a, bVar);
                j10 = B.f18971c == bVar.n(B.f18970b) ? bVar.j() : 0L;
            }
        }
        return new g(B, j10, j11, z11, z12, z13);
    }

    private static n1[] y(n3.t tVar) {
        int length = tVar != null ? tVar.length() : 0;
        n1[] n1VarArr = new n1[length];
        for (int i10 = 0; i10 < length; i10++) {
            n1VarArr[i10] = tVar.a(i10);
        }
        return n1VarArr;
    }

    private static Pair<Object, Long> y0(y3 y3Var, h hVar, boolean z10, int i10, boolean z11, y3.d dVar, y3.b bVar) {
        Pair<Object, Long> n10;
        Object z02;
        y3 y3Var2 = hVar.f17334a;
        if (y3Var.u()) {
            return null;
        }
        y3 y3Var3 = y3Var2.u() ? y3Var : y3Var2;
        try {
            n10 = y3Var3.n(dVar, bVar, hVar.f17335b, hVar.f17336c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (y3Var.equals(y3Var3)) {
            return n10;
        }
        if (y3Var.f(n10.first) != -1) {
            return (y3Var3.l(n10.first, bVar).f17808o && y3Var3.r(bVar.f17805l, dVar).f17828x == y3Var3.f(n10.first)) ? y3Var.n(dVar, bVar, y3Var.l(n10.first, bVar).f17805l, hVar.f17336c) : n10;
        }
        if (z10 && (z02 = z0(dVar, bVar, i10, z11, n10.first, y3Var3, y3Var)) != null) {
            return y3Var.n(dVar, bVar, y3Var.l(z02, bVar).f17805l, -9223372036854775807L);
        }
        return null;
    }

    private long z(y3 y3Var, Object obj, long j10) {
        y3Var.r(y3Var.l(obj, this.f17302u).f17805l, this.f17301t);
        y3.d dVar = this.f17301t;
        if (dVar.f17819o != -9223372036854775807L && dVar.g()) {
            y3.d dVar2 = this.f17301t;
            if (dVar2.f17822r) {
                return p3.n0.B0(dVar2.c() - this.f17301t.f17819o) - (j10 + this.f17302u.q());
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object z0(y3.d dVar, y3.b bVar, int i10, boolean z10, Object obj, y3 y3Var, y3 y3Var2) {
        int f10 = y3Var.f(obj);
        int m10 = y3Var.m();
        int i11 = f10;
        int i12 = -1;
        for (int i13 = 0; i13 < m10 && i12 == -1; i13++) {
            i11 = y3Var.h(i11, bVar, dVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = y3Var2.f(y3Var.q(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return y3Var2.q(i12);
    }

    public void B0(y3 y3Var, int i10, long j10) {
        this.f17298q.h(3, new h(y3Var, i10, j10)).a();
    }

    public Looper C() {
        return this.f17300s;
    }

    public void O0(List<t2.c> list, int i10, long j10, u2.p0 p0Var) {
        this.f17298q.h(17, new b(list, p0Var, i10, j10, null)).a();
    }

    public void R0(boolean z10, int i10) {
        this.f17298q.c(1, z10 ? 1 : 0, i10).a();
    }

    public void T0(b3 b3Var) {
        this.f17298q.h(4, b3Var).a();
    }

    public void V0(int i10) {
        this.f17298q.c(11, i10, 0).a();
    }

    @Override // s1.g3.a
    public synchronized void a(g3 g3Var) {
        if (!this.I && this.f17300s.getThread().isAlive()) {
            this.f17298q.h(14, g3Var).a();
            return;
        }
        p3.r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        g3Var.k(false);
    }

    @Override // s1.t2.d
    public void c() {
        this.f17298q.d(22);
    }

    @Override // n3.c0.a
    public void d() {
        this.f17298q.d(10);
    }

    public void h1() {
        this.f17298q.l(6).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10;
        b2 q10;
        IOException iOException;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    S0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    U0((b3) message.obj);
                    break;
                case 5:
                    X0((q3) message.obj);
                    break;
                case 6:
                    i1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    J((u2.r) message.obj);
                    break;
                case 9:
                    F((u2.r) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    W0(message.arg1);
                    break;
                case 12:
                    Y0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((g3) message.obj);
                    break;
                case 15:
                    I0((g3) message.obj);
                    break;
                case 16:
                    L((b3) message.obj, false);
                    break;
                case 17:
                    N0((b) message.obj);
                    break;
                case 18:
                    j((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (u2.p0) message.obj);
                    break;
                case 21:
                    Z0((u2.p0) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case f.j.f8330t3 /* 23 */:
                    Q0(message.arg1 != 0);
                    break;
                case f.j.f8335u3 /* 24 */:
                    P0(message.arg1 == 1);
                    break;
                case 25:
                    m();
                    break;
                default:
                    return false;
            }
        } catch (RuntimeException e10) {
            e = q.i(e10, ((e10 instanceof IllegalStateException) || (e10 instanceof IllegalArgumentException)) ? 1004 : 1004);
            p3.r.d("ExoPlayerImplInternal", "Playback error", e);
            i1(true, false);
            this.G = this.G.e(e);
        } catch (o3.m e11) {
            i10 = e11.f14488j;
            iOException = e11;
            G(iOException, i10);
        } catch (q e12) {
            e = e12;
            if (e.f17479r == 1 && (q10 = this.B.q()) != null) {
                e = e.e(q10.f17094f.f17116a);
            }
            if (e.f17485x && this.X == null) {
                p3.r.j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.X = e;
                p3.n nVar = this.f17298q;
                nVar.a(nVar.h(25, e));
            } else {
                q qVar = this.X;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.X;
                }
                p3.r.d("ExoPlayerImplInternal", "Playback error", e);
                i1(true, false);
                this.G = this.G.e(e);
            }
        } catch (u2 e13) {
            int i12 = e13.f17591k;
            if (i12 == 1) {
                i11 = e13.f17590j ? 3001 : 3003;
            } else if (i12 == 4) {
                i11 = e13.f17590j ? 3002 : 3004;
            }
            G(e13, i11);
        } catch (u2.b e14) {
            i10 = 1002;
            iOException = e14;
            G(iOException, i10);
        } catch (o.a e15) {
            i10 = e15.f19735j;
            iOException = e15;
            G(iOException, i10);
        } catch (IOException e16) {
            i10 = 2000;
            iOException = e16;
            G(iOException, i10);
        }
        X();
        return true;
    }

    @Override // u2.r.a
    public void i(u2.r rVar) {
        this.f17298q.h(8, rVar).a();
    }

    @Override // u2.o0.a
    /* renamed from: i0 */
    public void l(u2.r rVar) {
        this.f17298q.h(9, rVar).a();
    }

    public void j0() {
        this.f17298q.l(0).a();
    }

    public synchronized boolean l0() {
        if (!this.I && this.f17300s.getThread().isAlive()) {
            this.f17298q.d(7);
            q1(new b5.t() { // from class: s1.h1
                @Override // b5.t
                public final Object get() {
                    Boolean U;
                    U = j1.this.U();
                    return U;
                }
            }, this.E);
            return this.I;
        }
        return true;
    }

    public void o0(int i10, int i11, u2.p0 p0Var) {
        this.f17298q.e(20, i10, i11, p0Var).a();
    }

    @Override // s1.l.a
    public void p(b3 b3Var) {
        this.f17298q.h(16, b3Var).a();
    }

    public void v(long j10) {
        this.Y = j10;
    }
}
