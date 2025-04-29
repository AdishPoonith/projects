package q9;

import b5.n;
import com.google.common.collect.l;
import i9.a;
import i9.j1;
import i9.k;
import i9.n1;
import i9.p;
import i9.q;
import i9.r0;
import i9.x;
import i9.y0;
import io.grpc.internal.e2;
import io.grpc.internal.l2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class e extends r0 {

    /* renamed from: k  reason: collision with root package name */
    private static final a.c<b> f16520k = a.c.a("addressTrackerKey");

    /* renamed from: c  reason: collision with root package name */
    final c f16521c;

    /* renamed from: d  reason: collision with root package name */
    private final n1 f16522d;

    /* renamed from: e  reason: collision with root package name */
    private final r0.d f16523e;

    /* renamed from: f  reason: collision with root package name */
    private final q9.d f16524f;

    /* renamed from: g  reason: collision with root package name */
    private l2 f16525g;

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f16526h;

    /* renamed from: i  reason: collision with root package name */
    private n1.d f16527i;

    /* renamed from: j  reason: collision with root package name */
    private Long f16528j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g f16529a;

        /* renamed from: d  reason: collision with root package name */
        private Long f16532d;

        /* renamed from: e  reason: collision with root package name */
        private int f16533e;

        /* renamed from: b  reason: collision with root package name */
        private volatile a f16530b = new a();

        /* renamed from: c  reason: collision with root package name */
        private a f16531c = new a();

        /* renamed from: f  reason: collision with root package name */
        private final Set<i> f16534f = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            AtomicLong f16535a;

            /* renamed from: b  reason: collision with root package name */
            AtomicLong f16536b;

            private a() {
                this.f16535a = new AtomicLong();
                this.f16536b = new AtomicLong();
            }

            void a() {
                this.f16535a.set(0L);
                this.f16536b.set(0L);
            }
        }

        b(g gVar) {
            this.f16529a = gVar;
        }

        boolean b(i iVar) {
            if (m() && !iVar.n()) {
                iVar.m();
            } else if (!m() && iVar.n()) {
                iVar.p();
            }
            iVar.o(this);
            return this.f16534f.add(iVar);
        }

        void c() {
            int i10 = this.f16533e;
            this.f16533e = i10 == 0 ? 0 : i10 - 1;
        }

        void d(long j10) {
            this.f16532d = Long.valueOf(j10);
            this.f16533e++;
            for (i iVar : this.f16534f) {
                iVar.m();
            }
        }

        double e() {
            return this.f16531c.f16536b.get() / f();
        }

        long f() {
            return this.f16531c.f16535a.get() + this.f16531c.f16536b.get();
        }

        void g(boolean z10) {
            g gVar = this.f16529a;
            if (gVar.f16547e == null && gVar.f16548f == null) {
                return;
            }
            (z10 ? this.f16530b.f16535a : this.f16530b.f16536b).getAndIncrement();
        }

        public boolean h(long j10) {
            return j10 > this.f16532d.longValue() + Math.min(this.f16529a.f16544b.longValue() * ((long) this.f16533e), Math.max(this.f16529a.f16544b.longValue(), this.f16529a.f16545c.longValue()));
        }

        boolean i(i iVar) {
            iVar.l();
            return this.f16534f.remove(iVar);
        }

        void j() {
            this.f16530b.a();
            this.f16531c.a();
        }

        void k() {
            this.f16533e = 0;
        }

        void l(g gVar) {
            this.f16529a = gVar;
        }

        boolean m() {
            return this.f16532d != null;
        }

        double n() {
            return this.f16531c.f16535a.get() / f();
        }

        void o() {
            this.f16531c.a();
            a aVar = this.f16530b;
            this.f16530b = this.f16531c;
            this.f16531c = aVar;
        }

        void p() {
            n.u(this.f16532d != null, "not currently ejected");
            this.f16532d = null;
            for (i iVar : this.f16534f) {
                iVar.p();
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends l<SocketAddress, b> {

        /* renamed from: j  reason: collision with root package name */
        private final Map<SocketAddress, b> f16537j = new HashMap();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.m
        /* renamed from: b */
        public Map<SocketAddress, b> a() {
            return this.f16537j;
        }

        void f() {
            for (b bVar : this.f16537j.values()) {
                if (bVar.m()) {
                    bVar.p();
                }
                bVar.k();
            }
        }

        double g() {
            if (this.f16537j.isEmpty()) {
                return 0.0d;
            }
            int i10 = 0;
            int i11 = 0;
            for (b bVar : this.f16537j.values()) {
                i11++;
                if (bVar.m()) {
                    i10++;
                }
            }
            return (i10 / i11) * 100.0d;
        }

        void h(Long l10) {
            for (b bVar : this.f16537j.values()) {
                if (!bVar.m()) {
                    bVar.c();
                }
                if (bVar.m() && bVar.h(l10.longValue())) {
                    bVar.p();
                }
            }
        }

        void i(g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress socketAddress : collection) {
                if (!this.f16537j.containsKey(socketAddress)) {
                    this.f16537j.put(socketAddress, new b(gVar));
                }
            }
        }

        void j() {
            for (b bVar : this.f16537j.values()) {
                bVar.j();
            }
        }

        void k() {
            for (b bVar : this.f16537j.values()) {
                bVar.o();
            }
        }

        void l(g gVar) {
            for (b bVar : this.f16537j.values()) {
                bVar.l(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends q9.b {

        /* renamed from: a  reason: collision with root package name */
        private r0.d f16538a;

        d(r0.d dVar) {
            this.f16538a = dVar;
        }

        @Override // q9.b, i9.r0.d
        public r0.h a(r0.b bVar) {
            i iVar = new i(this.f16538a.a(bVar));
            List<x> a10 = bVar.a();
            if (e.m(a10) && e.this.f16521c.containsKey(a10.get(0).a().get(0))) {
                b bVar2 = e.this.f16521c.get(a10.get(0).a().get(0));
                bVar2.b(iVar);
                if (bVar2.f16532d != null) {
                    iVar.m();
                }
            }
            return iVar;
        }

        @Override // i9.r0.d
        public void f(p pVar, r0.i iVar) {
            this.f16538a.f(pVar, new h(iVar));
        }

        @Override // q9.b
        protected r0.d g() {
            return this.f16538a;
        }
    }

    /* renamed from: q9.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0240e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        g f16540j;

        RunnableC0240e(g gVar) {
            this.f16540j = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f16528j = Long.valueOf(eVar.f16525g.a());
            e.this.f16521c.k();
            for (j jVar : q9.f.a(this.f16540j)) {
                e eVar2 = e.this;
                jVar.a(eVar2.f16521c, eVar2.f16528j.longValue());
            }
            e eVar3 = e.this;
            eVar3.f16521c.h(eVar3.f16528j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements j {

        /* renamed from: a  reason: collision with root package name */
        private final g f16542a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(g gVar) {
            this.f16542a = gVar;
        }

        @Override // q9.e.j
        public void a(c cVar, long j10) {
            List<b> n10 = e.n(cVar, this.f16542a.f16548f.f16560d.intValue());
            if (n10.size() < this.f16542a.f16548f.f16559c.intValue() || n10.size() == 0) {
                return;
            }
            for (b bVar : n10) {
                if (cVar.g() >= this.f16542a.f16546d.intValue()) {
                    return;
                }
                if (bVar.f() >= this.f16542a.f16548f.f16560d.intValue()) {
                    if (bVar.e() > this.f16542a.f16548f.f16557a.intValue() / 100.0d && new Random().nextInt(100) < this.f16542a.f16548f.f16558b.intValue()) {
                        bVar.d(j10);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Long f16543a;

        /* renamed from: b  reason: collision with root package name */
        public final Long f16544b;

        /* renamed from: c  reason: collision with root package name */
        public final Long f16545c;

        /* renamed from: d  reason: collision with root package name */
        public final Integer f16546d;

        /* renamed from: e  reason: collision with root package name */
        public final c f16547e;

        /* renamed from: f  reason: collision with root package name */
        public final b f16548f;

        /* renamed from: g  reason: collision with root package name */
        public final e2.b f16549g;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Long f16550a = 10000000000L;

            /* renamed from: b  reason: collision with root package name */
            Long f16551b = 30000000000L;

            /* renamed from: c  reason: collision with root package name */
            Long f16552c = 30000000000L;

            /* renamed from: d  reason: collision with root package name */
            Integer f16553d = 10;

            /* renamed from: e  reason: collision with root package name */
            c f16554e;

            /* renamed from: f  reason: collision with root package name */
            b f16555f;

            /* renamed from: g  reason: collision with root package name */
            e2.b f16556g;

            public g a() {
                n.t(this.f16556g != null);
                return new g(this.f16550a, this.f16551b, this.f16552c, this.f16553d, this.f16554e, this.f16555f, this.f16556g);
            }

            public a b(Long l10) {
                n.d(l10 != null);
                this.f16551b = l10;
                return this;
            }

            public a c(e2.b bVar) {
                n.t(bVar != null);
                this.f16556g = bVar;
                return this;
            }

            public a d(b bVar) {
                this.f16555f = bVar;
                return this;
            }

            public a e(Long l10) {
                n.d(l10 != null);
                this.f16550a = l10;
                return this;
            }

            public a f(Integer num) {
                n.d(num != null);
                this.f16553d = num;
                return this;
            }

            public a g(Long l10) {
                n.d(l10 != null);
                this.f16552c = l10;
                return this;
            }

            public a h(c cVar) {
                this.f16554e = cVar;
                return this;
            }
        }

        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f16557a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f16558b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f16559c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f16560d;

            /* loaded from: classes.dex */
            public static class a {

                /* renamed from: a  reason: collision with root package name */
                Integer f16561a = 85;

                /* renamed from: b  reason: collision with root package name */
                Integer f16562b = 100;

                /* renamed from: c  reason: collision with root package name */
                Integer f16563c = 5;

                /* renamed from: d  reason: collision with root package name */
                Integer f16564d = 50;

                public b a() {
                    return new b(this.f16561a, this.f16562b, this.f16563c, this.f16564d);
                }

                public a b(Integer num) {
                    boolean z10 = true;
                    n.d(num != null);
                    n.d((num.intValue() < 0 || num.intValue() > 100) ? false : false);
                    this.f16562b = num;
                    return this;
                }

                public a c(Integer num) {
                    n.d(num != null);
                    n.d(num.intValue() >= 0);
                    this.f16563c = num;
                    return this;
                }

                public a d(Integer num) {
                    n.d(num != null);
                    n.d(num.intValue() >= 0);
                    this.f16564d = num;
                    return this;
                }

                public a e(Integer num) {
                    boolean z10 = true;
                    n.d(num != null);
                    n.d((num.intValue() < 0 || num.intValue() > 100) ? false : false);
                    this.f16561a = num;
                    return this;
                }
            }

            b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f16557a = num;
                this.f16558b = num2;
                this.f16559c = num3;
                this.f16560d = num4;
            }
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f16565a;

            /* renamed from: b  reason: collision with root package name */
            public final Integer f16566b;

            /* renamed from: c  reason: collision with root package name */
            public final Integer f16567c;

            /* renamed from: d  reason: collision with root package name */
            public final Integer f16568d;

            /* loaded from: classes.dex */
            public static final class a {

                /* renamed from: a  reason: collision with root package name */
                Integer f16569a = 1900;

                /* renamed from: b  reason: collision with root package name */
                Integer f16570b = 100;

                /* renamed from: c  reason: collision with root package name */
                Integer f16571c = 5;

                /* renamed from: d  reason: collision with root package name */
                Integer f16572d = 100;

                public c a() {
                    return new c(this.f16569a, this.f16570b, this.f16571c, this.f16572d);
                }

                public a b(Integer num) {
                    boolean z10 = true;
                    n.d(num != null);
                    n.d((num.intValue() < 0 || num.intValue() > 100) ? false : false);
                    this.f16570b = num;
                    return this;
                }

                public a c(Integer num) {
                    n.d(num != null);
                    n.d(num.intValue() >= 0);
                    this.f16571c = num;
                    return this;
                }

                public a d(Integer num) {
                    n.d(num != null);
                    n.d(num.intValue() >= 0);
                    this.f16572d = num;
                    return this;
                }

                public a e(Integer num) {
                    n.d(num != null);
                    this.f16569a = num;
                    return this;
                }
            }

            c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f16565a = num;
                this.f16566b = num2;
                this.f16567c = num3;
                this.f16568d = num4;
            }
        }

        private g(Long l10, Long l11, Long l12, Integer num, c cVar, b bVar, e2.b bVar2) {
            this.f16543a = l10;
            this.f16544b = l11;
            this.f16545c = l12;
            this.f16546d = num;
            this.f16547e = cVar;
            this.f16548f = bVar;
            this.f16549g = bVar2;
        }

        boolean a() {
            return (this.f16547e == null && this.f16548f == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    class h extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.i f16573a;

        /* loaded from: classes.dex */
        class a extends i9.k {

            /* renamed from: a  reason: collision with root package name */
            b f16575a;

            public a(b bVar) {
                this.f16575a = bVar;
            }

            @Override // i9.m1
            public void i(j1 j1Var) {
                this.f16575a.g(j1Var.o());
            }
        }

        /* loaded from: classes.dex */
        class b extends k.a {

            /* renamed from: a  reason: collision with root package name */
            private final b f16577a;

            b(b bVar) {
                this.f16577a = bVar;
            }

            @Override // i9.k.a
            public i9.k a(k.b bVar, y0 y0Var) {
                return new a(this.f16577a);
            }
        }

        h(r0.i iVar) {
            this.f16573a = iVar;
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            r0.e a10 = this.f16573a.a(fVar);
            r0.h c10 = a10.c();
            return c10 != null ? r0.e.i(c10, new b((b) c10.c().b(e.f16520k))) : a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i extends q9.c {

        /* renamed from: a  reason: collision with root package name */
        private final r0.h f16579a;

        /* renamed from: b  reason: collision with root package name */
        private b f16580b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16581c;

        /* renamed from: d  reason: collision with root package name */
        private q f16582d;

        /* renamed from: e  reason: collision with root package name */
        private r0.j f16583e;

        /* loaded from: classes.dex */
        class a implements r0.j {

            /* renamed from: a  reason: collision with root package name */
            private final r0.j f16585a;

            a(r0.j jVar) {
                this.f16585a = jVar;
            }

            @Override // i9.r0.j
            public void a(q qVar) {
                i.this.f16582d = qVar;
                if (i.this.f16581c) {
                    return;
                }
                this.f16585a.a(qVar);
            }
        }

        i(r0.h hVar) {
            this.f16579a = hVar;
        }

        @Override // i9.r0.h
        public i9.a c() {
            return this.f16580b != null ? this.f16579a.c().d().d(e.f16520k, this.f16580b).a() : this.f16579a.c();
        }

        @Override // q9.c, i9.r0.h
        public void g(r0.j jVar) {
            this.f16583e = jVar;
            super.g(new a(jVar));
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
            if (r3.f16584f.f16521c.containsKey(r0) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
            if (r3.f16584f.f16521c.containsKey(r0) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
            r3.f16584f.f16521c.get(r0).b(r3);
         */
        @Override // i9.r0.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(java.util.List<i9.x> r4) {
            /*
                r3 = this;
                java.util.List r0 = r3.b()
                boolean r0 = q9.e.j(r0)
                r1 = 0
                if (r0 == 0) goto L3d
                boolean r0 = q9.e.j(r4)
                if (r0 == 0) goto L3d
                q9.e r0 = q9.e.this
                q9.e$c r0 = r0.f16521c
                q9.e$b r2 = r3.f16580b
                boolean r0 = r0.containsValue(r2)
                if (r0 == 0) goto L22
                q9.e$b r0 = r3.f16580b
                r0.i(r3)
            L22:
                java.lang.Object r0 = r4.get(r1)
                i9.x r0 = (i9.x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                q9.e r1 = q9.e.this
                q9.e$c r1 = r1.f16521c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
                goto Laa
            L3d:
                java.util.List r0 = r3.b()
                boolean r0 = q9.e.j(r0)
                if (r0 == 0) goto L80
                boolean r0 = q9.e.j(r4)
                if (r0 != 0) goto L80
                q9.e r0 = q9.e.this
                q9.e$c r0 = r0.f16521c
                i9.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r2 = r2.get(r1)
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto Lb7
                q9.e r0 = q9.e.this
                q9.e$c r0 = r0.f16521c
                i9.x r2 = r3.a()
                java.util.List r2 = r2.a()
                java.lang.Object r1 = r2.get(r1)
                java.lang.Object r0 = r0.get(r1)
                q9.e$b r0 = (q9.e.b) r0
                r0.i(r3)
                r0.j()
                goto Lb7
            L80:
                java.util.List r0 = r3.b()
                boolean r0 = q9.e.j(r0)
                if (r0 != 0) goto Lb7
                boolean r0 = q9.e.j(r4)
                if (r0 == 0) goto Lb7
                java.lang.Object r0 = r4.get(r1)
                i9.x r0 = (i9.x) r0
                java.util.List r0 = r0.a()
                java.lang.Object r0 = r0.get(r1)
                java.net.SocketAddress r0 = (java.net.SocketAddress) r0
                q9.e r1 = q9.e.this
                q9.e$c r1 = r1.f16521c
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto Lb7
            Laa:
                q9.e r1 = q9.e.this
                q9.e$c r1 = r1.f16521c
                java.lang.Object r0 = r1.get(r0)
                q9.e$b r0 = (q9.e.b) r0
                r0.b(r3)
            Lb7:
                i9.r0$h r0 = r3.f16579a
                r0.h(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q9.e.i.h(java.util.List):void");
        }

        @Override // q9.c
        protected r0.h i() {
            return this.f16579a;
        }

        void l() {
            this.f16580b = null;
        }

        void m() {
            this.f16581c = true;
            this.f16583e.a(q.b(j1.f9938u));
        }

        boolean n() {
            return this.f16581c;
        }

        void o(b bVar) {
            this.f16580b = bVar;
        }

        void p() {
            this.f16581c = false;
            q qVar = this.f16582d;
            if (qVar != null) {
                this.f16583e.a(qVar);
            }
        }
    }

    /* loaded from: classes.dex */
    interface j {
        void a(c cVar, long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k implements j {

        /* renamed from: a  reason: collision with root package name */
        private final g f16587a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(g gVar) {
            n.e(gVar.f16547e != null, "success rate ejection config is null");
            this.f16587a = gVar;
        }

        static double b(Collection<Double> collection) {
            double d10 = 0.0d;
            for (Double d11 : collection) {
                d10 += d11.doubleValue();
            }
            return d10 / collection.size();
        }

        static double c(Collection<Double> collection, double d10) {
            double d11 = 0.0d;
            for (Double d12 : collection) {
                double doubleValue = d12.doubleValue() - d10;
                d11 += doubleValue * doubleValue;
            }
            return Math.sqrt(d11 / collection.size());
        }

        @Override // q9.e.j
        public void a(c cVar, long j10) {
            List<b> n10 = e.n(cVar, this.f16587a.f16547e.f16568d.intValue());
            if (n10.size() < this.f16587a.f16547e.f16567c.intValue() || n10.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : n10) {
                arrayList.add(Double.valueOf(bVar.n()));
            }
            double b10 = b(arrayList);
            double c10 = b10 - (c(arrayList, b10) * (this.f16587a.f16547e.f16565a.intValue() / 1000.0f));
            for (b bVar2 : n10) {
                if (cVar.g() >= this.f16587a.f16546d.intValue()) {
                    return;
                }
                if (bVar2.n() < c10 && new Random().nextInt(100) < this.f16587a.f16547e.f16566b.intValue()) {
                    bVar2.d(j10);
                }
            }
        }
    }

    public e(r0.d dVar, l2 l2Var) {
        d dVar2 = new d((r0.d) n.o(dVar, "helper"));
        this.f16523e = dVar2;
        this.f16524f = new q9.d(dVar2);
        this.f16521c = new c();
        this.f16522d = (n1) n.o(dVar.d(), "syncContext");
        this.f16526h = (ScheduledExecutorService) n.o(dVar.c(), "timeService");
        this.f16525g = l2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(List<x> list) {
        int i10 = 0;
        for (x xVar : list) {
            i10 += xVar.a().size();
            if (i10 > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<b> n(c cVar, int i10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : cVar.values()) {
            if (bVar.f() >= i10) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // i9.r0
    public boolean a(r0.g gVar) {
        g gVar2 = (g) gVar.c();
        ArrayList arrayList = new ArrayList();
        for (x xVar : gVar.a()) {
            arrayList.addAll(xVar.a());
        }
        this.f16521c.keySet().retainAll(arrayList);
        this.f16521c.l(gVar2);
        this.f16521c.i(gVar2, arrayList);
        this.f16524f.r(gVar2.f16549g.b());
        if (gVar2.a()) {
            Long valueOf = this.f16528j == null ? gVar2.f16543a : Long.valueOf(Math.max(0L, gVar2.f16543a.longValue() - (this.f16525g.a() - this.f16528j.longValue())));
            n1.d dVar = this.f16527i;
            if (dVar != null) {
                dVar.a();
                this.f16521c.j();
            }
            this.f16527i = this.f16522d.d(new RunnableC0240e(gVar2), valueOf.longValue(), gVar2.f16543a.longValue(), TimeUnit.NANOSECONDS, this.f16526h);
        } else {
            n1.d dVar2 = this.f16527i;
            if (dVar2 != null) {
                dVar2.a();
                this.f16528j = null;
                this.f16521c.f();
            }
        }
        this.f16524f.d(gVar.e().d(gVar2.f16549g.a()).a());
        return true;
    }

    @Override // i9.r0
    public void c(j1 j1Var) {
        this.f16524f.c(j1Var);
    }

    @Override // i9.r0
    public void f() {
        this.f16524f.f();
    }
}
