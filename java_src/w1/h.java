package w1;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.collect.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import s1.n1;
import t1.t1;
import w1.g;
import w1.g0;
import w1.h;
import w1.m;
import w1.o;
import w1.w;
import w1.y;
/* loaded from: classes.dex */
public class h implements y {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f19661c;

    /* renamed from: d  reason: collision with root package name */
    private final g0.c f19662d;

    /* renamed from: e  reason: collision with root package name */
    private final n0 f19663e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, String> f19664f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f19665g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f19666h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f19667i;

    /* renamed from: j  reason: collision with root package name */
    private final g f19668j;

    /* renamed from: k  reason: collision with root package name */
    private final o3.g0 f19669k;

    /* renamed from: l  reason: collision with root package name */
    private final C0283h f19670l;

    /* renamed from: m  reason: collision with root package name */
    private final long f19671m;

    /* renamed from: n  reason: collision with root package name */
    private final List<w1.g> f19672n;

    /* renamed from: o  reason: collision with root package name */
    private final Set<f> f19673o;

    /* renamed from: p  reason: collision with root package name */
    private final Set<w1.g> f19674p;

    /* renamed from: q  reason: collision with root package name */
    private int f19675q;

    /* renamed from: r  reason: collision with root package name */
    private g0 f19676r;

    /* renamed from: s  reason: collision with root package name */
    private w1.g f19677s;

    /* renamed from: t  reason: collision with root package name */
    private w1.g f19678t;

    /* renamed from: u  reason: collision with root package name */
    private Looper f19679u;

    /* renamed from: v  reason: collision with root package name */
    private Handler f19680v;

    /* renamed from: w  reason: collision with root package name */
    private int f19681w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f19682x;

    /* renamed from: y  reason: collision with root package name */
    private t1 f19683y;

    /* renamed from: z  reason: collision with root package name */
    volatile d f19684z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        private boolean f19688d;

        /* renamed from: f  reason: collision with root package name */
        private boolean f19690f;

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f19685a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f19686b = s1.i.f17254d;

        /* renamed from: c  reason: collision with root package name */
        private g0.c f19687c = k0.f19713d;

        /* renamed from: g  reason: collision with root package name */
        private o3.g0 f19691g = new o3.x();

        /* renamed from: e  reason: collision with root package name */
        private int[] f19689e = new int[0];

        /* renamed from: h  reason: collision with root package name */
        private long f19692h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f19686b, this.f19687c, n0Var, this.f19685a, this.f19688d, this.f19689e, this.f19690f, this.f19691g, this.f19692h);
        }

        public b b(boolean z10) {
            this.f19688d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f19690f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                p3.a.a(z10);
            }
            this.f19689e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g0.c cVar) {
            this.f19686b = (UUID) p3.a.e(uuid);
            this.f19687c = (g0.c) p3.a.e(cVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private class c implements g0.b {
        private c() {
        }

        @Override // w1.g0.b
        public void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) p3.a.e(h.this.f19684z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (w1.g gVar : h.this.f19672n) {
                if (gVar.t(bArr)) {
                    gVar.B(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements y.b {

        /* renamed from: b  reason: collision with root package name */
        private final w.a f19695b;

        /* renamed from: c  reason: collision with root package name */
        private o f19696c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f19697d;

        public f(w.a aVar) {
            this.f19695b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(n1 n1Var) {
            if (h.this.f19675q == 0 || this.f19697d) {
                return;
            }
            h hVar = h.this;
            this.f19696c = hVar.u((Looper) p3.a.e(hVar.f19679u), this.f19695b, n1Var, false);
            h.this.f19673o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            if (this.f19697d) {
                return;
            }
            o oVar = this.f19696c;
            if (oVar != null) {
                oVar.d(this.f19695b);
            }
            h.this.f19673o.remove(this);
            this.f19697d = true;
        }

        @Override // w1.y.b
        public void a() {
            p3.n0.K0((Handler) p3.a.e(h.this.f19680v), new Runnable() { // from class: w1.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.f();
                }
            });
        }

        public void d(final n1 n1Var) {
            ((Handler) p3.a.e(h.this.f19680v)).post(new Runnable() { // from class: w1.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.this.e(n1Var);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<w1.g> f19699a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private w1.g f19700b;

        public g(h hVar) {
        }

        @Override // w1.g.a
        public void a(w1.g gVar) {
            this.f19699a.add(gVar);
            if (this.f19700b != null) {
                return;
            }
            this.f19700b = gVar;
            gVar.H();
        }

        @Override // w1.g.a
        public void b() {
            this.f19700b = null;
            com.google.common.collect.q v10 = com.google.common.collect.q.v(this.f19699a);
            this.f19699a.clear();
            s0 it = v10.iterator();
            while (it.hasNext()) {
                ((w1.g) it.next()).C();
            }
        }

        @Override // w1.g.a
        public void c(Exception exc, boolean z10) {
            this.f19700b = null;
            com.google.common.collect.q v10 = com.google.common.collect.q.v(this.f19699a);
            this.f19699a.clear();
            s0 it = v10.iterator();
            while (it.hasNext()) {
                ((w1.g) it.next()).D(exc, z10);
            }
        }

        public void d(w1.g gVar) {
            this.f19699a.remove(gVar);
            if (this.f19700b == gVar) {
                this.f19700b = null;
                if (this.f19699a.isEmpty()) {
                    return;
                }
                w1.g next = this.f19699a.iterator().next();
                this.f19700b = next;
                next.H();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0283h implements g.b {
        private C0283h() {
        }

        @Override // w1.g.b
        public void a(final w1.g gVar, int i10) {
            if (i10 == 1 && h.this.f19675q > 0 && h.this.f19671m != -9223372036854775807L) {
                h.this.f19674p.add(gVar);
                ((Handler) p3.a.e(h.this.f19680v)).postAtTime(new Runnable() { // from class: w1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.d(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f19671m);
            } else if (i10 == 0) {
                h.this.f19672n.remove(gVar);
                if (h.this.f19677s == gVar) {
                    h.this.f19677s = null;
                }
                if (h.this.f19678t == gVar) {
                    h.this.f19678t = null;
                }
                h.this.f19668j.d(gVar);
                if (h.this.f19671m != -9223372036854775807L) {
                    ((Handler) p3.a.e(h.this.f19680v)).removeCallbacksAndMessages(gVar);
                    h.this.f19674p.remove(gVar);
                }
            }
            h.this.D();
        }

        @Override // w1.g.b
        public void b(w1.g gVar, int i10) {
            if (h.this.f19671m != -9223372036854775807L) {
                h.this.f19674p.remove(gVar);
                ((Handler) p3.a.e(h.this.f19680v)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private h(UUID uuid, g0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, o3.g0 g0Var, long j10) {
        p3.a.e(uuid);
        p3.a.b(!s1.i.f17252b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f19661c = uuid;
        this.f19662d = cVar;
        this.f19663e = n0Var;
        this.f19664f = hashMap;
        this.f19665g = z10;
        this.f19666h = iArr;
        this.f19667i = z11;
        this.f19669k = g0Var;
        this.f19668j = new g(this);
        this.f19670l = new C0283h();
        this.f19681w = 0;
        this.f19672n = new ArrayList();
        this.f19673o = com.google.common.collect.p0.h();
        this.f19674p = com.google.common.collect.p0.h();
        this.f19671m = j10;
    }

    private synchronized void A(Looper looper) {
        Looper looper2 = this.f19679u;
        if (looper2 == null) {
            this.f19679u = looper;
            this.f19680v = new Handler(looper);
        } else {
            p3.a.f(looper2 == looper);
            p3.a.e(this.f19680v);
        }
    }

    private o B(int i10, boolean z10) {
        g0 g0Var = (g0) p3.a.e(this.f19676r);
        if ((g0Var.k() == 2 && h0.f19702d) || p3.n0.y0(this.f19666h, i10) == -1 || g0Var.k() == 1) {
            return null;
        }
        w1.g gVar = this.f19677s;
        if (gVar == null) {
            w1.g y10 = y(com.google.common.collect.q.z(), true, null, z10);
            this.f19672n.add(y10);
            this.f19677s = y10;
        } else {
            gVar.f(null);
        }
        return this.f19677s;
    }

    private void C(Looper looper) {
        if (this.f19684z == null) {
            this.f19684z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f19676r != null && this.f19675q == 0 && this.f19672n.isEmpty() && this.f19673o.isEmpty()) {
            ((g0) p3.a.e(this.f19676r)).a();
            this.f19676r = null;
        }
    }

    private void E() {
        s0 it = com.google.common.collect.s.t(this.f19674p).iterator();
        while (it.hasNext()) {
            ((o) it.next()).d(null);
        }
    }

    private void F() {
        s0 it = com.google.common.collect.s.t(this.f19673o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void H(o oVar, w.a aVar) {
        oVar.d(aVar);
        if (this.f19671m != -9223372036854775807L) {
            oVar.d(null);
        }
    }

    private void I(boolean z10) {
        if (z10 && this.f19679u == null) {
            p3.r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
        } else if (Thread.currentThread() != ((Looper) p3.a.e(this.f19679u)).getThread()) {
            p3.r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f19679u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o u(Looper looper, w.a aVar, n1 n1Var, boolean z10) {
        List<m.b> list;
        C(looper);
        m mVar = n1Var.f17422x;
        if (mVar == null) {
            return B(p3.v.k(n1Var.f17419u), z10);
        }
        w1.g gVar = null;
        if (this.f19682x == null) {
            list = z((m) p3.a.e(mVar), this.f19661c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f19661c);
                p3.r.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new e0(new o.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f19665g) {
            Iterator<w1.g> it = this.f19672n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w1.g next = it.next();
                if (p3.n0.c(next.f19623a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f19678t;
        }
        if (gVar == null) {
            gVar = y(list, false, aVar, z10);
            if (!this.f19665g) {
                this.f19678t = gVar;
            }
            this.f19672n.add(gVar);
        } else {
            gVar.f(aVar);
        }
        return gVar;
    }

    private static boolean v(o oVar) {
        return oVar.getState() == 1 && (p3.n0.f15397a < 19 || (((o.a) p3.a.e(oVar.a())).getCause() instanceof ResourceBusyException));
    }

    private boolean w(m mVar) {
        if (this.f19682x != null) {
            return true;
        }
        if (z(mVar, this.f19661c, true).isEmpty()) {
            if (mVar.f19729m != 1 || !mVar.e(0).d(s1.i.f17252b)) {
                return false;
            }
            p3.r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f19661c);
        }
        String str = mVar.f19728l;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? p3.n0.f15397a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private w1.g x(List<m.b> list, boolean z10, w.a aVar) {
        p3.a.e(this.f19676r);
        w1.g gVar = new w1.g(this.f19661c, this.f19676r, this.f19668j, this.f19670l, list, this.f19681w, this.f19667i | z10, z10, this.f19682x, this.f19664f, this.f19663e, (Looper) p3.a.e(this.f19679u), this.f19669k, (t1) p3.a.e(this.f19683y));
        gVar.f(aVar);
        if (this.f19671m != -9223372036854775807L) {
            gVar.f(null);
        }
        return gVar;
    }

    private w1.g y(List<m.b> list, boolean z10, w.a aVar, boolean z11) {
        w1.g x10 = x(list, z10, aVar);
        if (v(x10) && !this.f19674p.isEmpty()) {
            E();
            H(x10, aVar);
            x10 = x(list, z10, aVar);
        }
        if (v(x10) && z11 && !this.f19673o.isEmpty()) {
            F();
            if (!this.f19674p.isEmpty()) {
                E();
            }
            H(x10, aVar);
            return x(list, z10, aVar);
        }
        return x10;
    }

    private static List<m.b> z(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.f19729m);
        for (int i10 = 0; i10 < mVar.f19729m; i10++) {
            m.b e10 = mVar.e(i10);
            if ((e10.d(uuid) || (s1.i.f17253c.equals(uuid) && e10.d(s1.i.f17252b))) && (e10.f19734n != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public void G(int i10, byte[] bArr) {
        p3.a.f(this.f19672n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            p3.a.e(bArr);
        }
        this.f19681w = i10;
        this.f19682x = bArr;
    }

    @Override // w1.y
    public final void a() {
        I(true);
        int i10 = this.f19675q - 1;
        this.f19675q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f19671m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f19672n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((w1.g) arrayList.get(i11)).d(null);
            }
        }
        F();
        D();
    }

    @Override // w1.y
    public final void b() {
        I(true);
        int i10 = this.f19675q;
        this.f19675q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f19676r == null) {
            g0 a10 = this.f19662d.a(this.f19661c);
            this.f19676r = a10;
            a10.l(new c());
        } else if (this.f19671m != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f19672n.size(); i11++) {
                this.f19672n.get(i11).f(null);
            }
        }
    }

    @Override // w1.y
    public o c(w.a aVar, n1 n1Var) {
        I(false);
        p3.a.f(this.f19675q > 0);
        p3.a.h(this.f19679u);
        return u(this.f19679u, aVar, n1Var, true);
    }

    @Override // w1.y
    public y.b d(w.a aVar, n1 n1Var) {
        p3.a.f(this.f19675q > 0);
        p3.a.h(this.f19679u);
        f fVar = new f(aVar);
        fVar.d(n1Var);
        return fVar;
    }

    @Override // w1.y
    public void e(Looper looper, t1 t1Var) {
        A(looper);
        this.f19683y = t1Var;
    }

    @Override // w1.y
    public int f(n1 n1Var) {
        I(false);
        int k10 = ((g0) p3.a.e(this.f19676r)).k();
        m mVar = n1Var.f17422x;
        if (mVar != null) {
            if (w(mVar)) {
                return k10;
            }
            return 1;
        }
        if (p3.n0.y0(this.f19666h, p3.v.k(n1Var.f17419u)) != -1) {
            return k10;
        }
        return 0;
    }
}
