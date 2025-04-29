package io.grpc.internal;

import i9.r0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
final class r1 extends i9.r0 {

    /* renamed from: c  reason: collision with root package name */
    private final r0.d f11613c;

    /* renamed from: d  reason: collision with root package name */
    private r0.h f11614d;

    /* loaded from: classes.dex */
    class a implements r0.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0.h f11615a;

        a(r0.h hVar) {
            this.f11615a = hVar;
        }

        @Override // i9.r0.j
        public void a(i9.q qVar) {
            r1.this.i(this.f11615a, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11617a;

        static {
            int[] iArr = new int[i9.p.values().length];
            f11617a = iArr;
            try {
                iArr[i9.p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11617a[i9.p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11617a[i9.p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11617a[i9.p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.e f11618a;

        c(r0.e eVar) {
            this.f11618a = (r0.e) b5.n.o(eVar, "result");
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return this.f11618a;
        }

        public String toString() {
            return b5.h.b(c.class).d("result", this.f11618a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.h f11619a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f11620b = new AtomicBoolean(false);

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f11619a.e();
            }
        }

        d(r0.h hVar) {
            this.f11619a = (r0.h) b5.n.o(hVar, "subchannel");
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            if (this.f11620b.compareAndSet(false, true)) {
                r1.this.f11613c.d().execute(new a());
            }
            return r0.e.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(r0.d dVar) {
        this.f11613c = (r0.d) b5.n.o(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(r0.h hVar, i9.q qVar) {
        r0.i dVar;
        r0.i iVar;
        i9.p c10 = qVar.c();
        if (c10 == i9.p.SHUTDOWN) {
            return;
        }
        if (qVar.c() == i9.p.TRANSIENT_FAILURE || qVar.c() == i9.p.IDLE) {
            this.f11613c.e();
        }
        int i10 = b.f11617a[c10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iVar = new c(r0.e.g());
            } else if (i10 == 3) {
                dVar = new c(r0.e.h(hVar));
            } else if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported state:" + c10);
            } else {
                iVar = new c(r0.e.f(qVar.d()));
            }
            this.f11613c.f(c10, iVar);
        }
        dVar = new d(hVar);
        iVar = dVar;
        this.f11613c.f(c10, iVar);
    }

    @Override // i9.r0
    public boolean a(r0.g gVar) {
        List<i9.x> a10 = gVar.a();
        if (a10.isEmpty()) {
            i9.j1 j1Var = i9.j1.f9938u;
            c(j1Var.q("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        r0.h hVar = this.f11614d;
        if (hVar != null) {
            hVar.h(a10);
            return true;
        }
        r0.h a11 = this.f11613c.a(r0.b.c().e(a10).b());
        a11.g(new a(a11));
        this.f11614d = a11;
        this.f11613c.f(i9.p.CONNECTING, new c(r0.e.h(a11)));
        a11.e();
        return true;
    }

    @Override // i9.r0
    public void c(i9.j1 j1Var) {
        r0.h hVar = this.f11614d;
        if (hVar != null) {
            hVar.f();
            this.f11614d = null;
        }
        this.f11613c.f(i9.p.TRANSIENT_FAILURE, new c(r0.e.f(j1Var)));
    }

    @Override // i9.r0
    public void e() {
        r0.h hVar = this.f11614d;
        if (hVar != null) {
            hVar.e();
        }
    }

    @Override // i9.r0
    public void f() {
        r0.h hVar = this.f11614d;
        if (hVar != null) {
            hVar.f();
        }
    }
}
