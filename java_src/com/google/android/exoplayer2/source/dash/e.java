package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o3.i;
import p3.a0;
import p3.n0;
import s1.n1;
import s1.o1;
import s1.u2;
import u2.m0;
import w2.f;
import x1.d0;
import x1.e0;
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: j  reason: collision with root package name */
    private final o3.b f3590j;

    /* renamed from: k  reason: collision with root package name */
    private final b f3591k;

    /* renamed from: o  reason: collision with root package name */
    private y2.c f3595o;

    /* renamed from: p  reason: collision with root package name */
    private long f3596p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3597q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3598r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3599s;

    /* renamed from: n  reason: collision with root package name */
    private final TreeMap<Long, Long> f3594n = new TreeMap<>();

    /* renamed from: m  reason: collision with root package name */
    private final Handler f3593m = n0.x(this);

    /* renamed from: l  reason: collision with root package name */
    private final m2.b f3592l = new m2.b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f3600a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3601b;

        public a(long j10, long j11) {
            this.f3600a = j10;
            this.f3601b = j11;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(long j10);
    }

    /* loaded from: classes.dex */
    public final class c implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final m0 f3602a;

        /* renamed from: b  reason: collision with root package name */
        private final o1 f3603b = new o1();

        /* renamed from: c  reason: collision with root package name */
        private final k2.e f3604c = new k2.e();

        /* renamed from: d  reason: collision with root package name */
        private long f3605d = -9223372036854775807L;

        c(o3.b bVar) {
            this.f3602a = m0.l(bVar);
        }

        private k2.e g() {
            this.f3604c.l();
            if (this.f3602a.S(this.f3603b, this.f3604c, 0, false) == -4) {
                this.f3604c.y();
                return this.f3604c;
            }
            return null;
        }

        private void k(long j10, long j11) {
            e.this.f3593m.sendMessage(e.this.f3593m.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f3602a.K(false)) {
                k2.e g10 = g();
                if (g10 != null) {
                    long j10 = g10.f19366n;
                    k2.a a10 = e.this.f3592l.a(g10);
                    if (a10 != null) {
                        m2.a aVar = (m2.a) a10.d(0);
                        if (e.h(aVar.f13709j, aVar.f13710k)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f3602a.s();
        }

        private void m(long j10, m2.a aVar) {
            long f10 = e.f(aVar);
            if (f10 == -9223372036854775807L) {
                return;
            }
            k(j10, f10);
        }

        @Override // x1.e0
        public int a(i iVar, int i10, boolean z10, int i11) {
            return this.f3602a.f(iVar, i10, z10);
        }

        @Override // x1.e0
        public void b(a0 a0Var, int i10, int i11) {
            this.f3602a.d(a0Var, i10);
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            this.f3602a.c(j10, i10, i11, i12, aVar);
            l();
        }

        @Override // x1.e0
        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(n1 n1Var) {
            this.f3602a.e(n1Var);
        }

        @Override // x1.e0
        public /* synthetic */ int f(i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f3605d;
            if (j10 == -9223372036854775807L || fVar.f19799h > j10) {
                this.f3605d = fVar.f19799h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f3605d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f19798g);
        }

        public void n() {
            this.f3602a.T();
        }
    }

    public e(y2.c cVar, b bVar, o3.b bVar2) {
        this.f3595o = cVar;
        this.f3591k = bVar;
        this.f3590j = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f3594n.ceilingEntry(Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(m2.a aVar) {
        try {
            return n0.I0(n0.D(aVar.f13713n));
        } catch (u2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f3594n.get(Long.valueOf(j11));
        if (l10 != null && l10.longValue() <= j10) {
            return;
        }
        this.f3594n.put(Long.valueOf(j11), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f3597q) {
            this.f3598r = true;
            this.f3597q = false;
            this.f3591k.a();
        }
    }

    private void l() {
        this.f3591k.b(this.f3596p);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f3594n.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f3595o.f20389h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f3599s) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f3600a, aVar.f3601b);
        return true;
    }

    boolean j(long j10) {
        y2.c cVar = this.f3595o;
        boolean z10 = false;
        if (cVar.f20385d) {
            if (this.f3598r) {
                return true;
            }
            Map.Entry<Long, Long> e10 = e(cVar.f20389h);
            if (e10 != null && e10.getValue().longValue() < j10) {
                this.f3596p = e10.getKey().longValue();
                l();
                z10 = true;
            }
            if (z10) {
                i();
            }
            return z10;
        }
        return false;
    }

    public c k() {
        return new c(this.f3590j);
    }

    void m(f fVar) {
        this.f3597q = true;
    }

    boolean n(boolean z10) {
        if (this.f3595o.f20385d) {
            if (this.f3598r) {
                return true;
            }
            if (z10) {
                i();
                return true;
            }
            return false;
        }
        return false;
    }

    public void o() {
        this.f3599s = true;
        this.f3593m.removeCallbacksAndMessages(null);
    }

    public void q(y2.c cVar) {
        this.f3598r = false;
        this.f3596p = -9223372036854775807L;
        this.f3595o = cVar;
        p();
    }
}
