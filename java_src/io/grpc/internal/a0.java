package io.grpc.internal;

import i9.r0;
import io.grpc.internal.k1;
import io.grpc.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 implements k1 {

    /* renamed from: c  reason: collision with root package name */
    private final Executor f10980c;

    /* renamed from: d  reason: collision with root package name */
    private final i9.n1 f10981d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f10982e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f10983f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f10984g;

    /* renamed from: h  reason: collision with root package name */
    private k1.a f10985h;

    /* renamed from: j  reason: collision with root package name */
    private i9.j1 f10987j;

    /* renamed from: k  reason: collision with root package name */
    private r0.i f10988k;

    /* renamed from: l  reason: collision with root package name */
    private long f10989l;

    /* renamed from: a  reason: collision with root package name */
    private final i9.j0 f10978a = i9.j0.a(a0.class, null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f10979b = new Object();

    /* renamed from: i  reason: collision with root package name */
    private Collection<e> f10986i = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k1.a f10990j;

        a(k1.a aVar) {
            this.f10990j = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10990j.c(true);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k1.a f10992j;

        b(k1.a aVar) {
            this.f10992j = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10992j.c(false);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ k1.a f10994j;

        c(k1.a aVar) {
            this.f10994j = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10994j.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f10996j;

        d(i9.j1 j1Var) {
            this.f10996j = j1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.f10985h.b(this.f10996j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends b0 {

        /* renamed from: j  reason: collision with root package name */
        private final r0.f f10998j;

        /* renamed from: k  reason: collision with root package name */
        private final i9.r f10999k;

        /* renamed from: l  reason: collision with root package name */
        private final i9.k[] f11000l;

        private e(r0.f fVar, i9.k[] kVarArr) {
            this.f10999k = i9.r.e();
            this.f10998j = fVar;
            this.f11000l = kVarArr;
        }

        /* synthetic */ e(a0 a0Var, r0.f fVar, i9.k[] kVarArr, a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable B(s sVar) {
            i9.r b10 = this.f10999k.b();
            try {
                q a10 = sVar.a(this.f10998j.c(), this.f10998j.b(), this.f10998j.a(), this.f11000l);
                this.f10999k.f(b10);
                return x(a10);
            } catch (Throwable th) {
                this.f10999k.f(b10);
                throw th;
            }
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void a(i9.j1 j1Var) {
            super.a(j1Var);
            synchronized (a0.this.f10979b) {
                if (a0.this.f10984g != null) {
                    boolean remove = a0.this.f10986i.remove(this);
                    if (!a0.this.q() && remove) {
                        a0.this.f10981d.b(a0.this.f10983f);
                        if (a0.this.f10987j != null) {
                            a0.this.f10981d.b(a0.this.f10984g);
                            a0.this.f10984g = null;
                        }
                    }
                }
            }
            a0.this.f10981d.a();
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void l(x0 x0Var) {
            if (this.f10998j.a().j()) {
                x0Var.a("wait_for_ready");
            }
            super.l(x0Var);
        }

        @Override // io.grpc.internal.b0
        protected void v(i9.j1 j1Var) {
            for (i9.k kVar : this.f11000l) {
                kVar.i(j1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(Executor executor, i9.n1 n1Var) {
        this.f10980c = executor;
        this.f10981d = n1Var;
    }

    private e o(r0.f fVar, i9.k[] kVarArr) {
        e eVar = new e(this, fVar, kVarArr, null);
        this.f10986i.add(eVar);
        if (p() == 1) {
            this.f10981d.b(this.f10982e);
        }
        return eVar;
    }

    @Override // io.grpc.internal.s
    public final q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
        q f0Var;
        try {
            t1 t1Var = new t1(z0Var, y0Var, cVar);
            r0.i iVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f10979b) {
                    if (this.f10987j == null) {
                        r0.i iVar2 = this.f10988k;
                        if (iVar2 != null) {
                            if (iVar != null && j10 == this.f10989l) {
                                f0Var = o(t1Var, kVarArr);
                                break;
                            }
                            j10 = this.f10989l;
                            s j11 = r0.j(iVar2.a(t1Var), cVar.j());
                            if (j11 != null) {
                                f0Var = j11.a(t1Var.c(), t1Var.b(), t1Var.a(), kVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = o(t1Var, kVarArr);
                            break;
                        }
                    } else {
                        f0Var = new f0(this.f10987j, kVarArr);
                        break;
                    }
                }
            }
            return f0Var;
        } finally {
            this.f10981d.a();
        }
    }

    @Override // io.grpc.internal.k1
    public final void c(i9.j1 j1Var) {
        Runnable runnable;
        synchronized (this.f10979b) {
            if (this.f10987j != null) {
                return;
            }
            this.f10987j = j1Var;
            this.f10981d.b(new d(j1Var));
            if (!q() && (runnable = this.f10984g) != null) {
                this.f10981d.b(runnable);
                this.f10984g = null;
            }
            this.f10981d.a();
        }
    }

    @Override // io.grpc.internal.k1
    public final Runnable d(k1.a aVar) {
        this.f10985h = aVar;
        this.f10982e = new a(aVar);
        this.f10983f = new b(aVar);
        this.f10984g = new c(aVar);
        return null;
    }

    @Override // i9.p0
    public i9.j0 f() {
        return this.f10978a;
    }

    @Override // io.grpc.internal.k1
    public final void g(i9.j1 j1Var) {
        Collection<e> collection;
        Runnable runnable;
        c(j1Var);
        synchronized (this.f10979b) {
            collection = this.f10986i;
            runnable = this.f10984g;
            this.f10984g = null;
            if (!collection.isEmpty()) {
                this.f10986i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable x10 = eVar.x(new f0(j1Var, r.a.REFUSED, eVar.f11000l));
                if (x10 != null) {
                    x10.run();
                }
            }
            this.f10981d.execute(runnable);
        }
    }

    final int p() {
        int size;
        synchronized (this.f10979b) {
            size = this.f10986i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f10979b) {
            z10 = !this.f10986i.isEmpty();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(r0.i iVar) {
        Runnable runnable;
        synchronized (this.f10979b) {
            this.f10988k = iVar;
            this.f10989l++;
            if (iVar != null && q()) {
                ArrayList arrayList = new ArrayList(this.f10986i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    r0.e a10 = iVar.a(eVar.f10998j);
                    i9.c a11 = eVar.f10998j.a();
                    s j10 = r0.j(a10, a11.j());
                    if (j10 != null) {
                        Executor executor = this.f10980c;
                        if (a11.e() != null) {
                            executor = a11.e();
                        }
                        Runnable B = eVar.B(j10);
                        if (B != null) {
                            executor.execute(B);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f10979b) {
                    if (q()) {
                        this.f10986i.removeAll(arrayList2);
                        if (this.f10986i.isEmpty()) {
                            this.f10986i = new LinkedHashSet();
                        }
                        if (!q()) {
                            this.f10981d.b(this.f10983f);
                            if (this.f10987j != null && (runnable = this.f10984g) != null) {
                                this.f10981d.b(runnable);
                                this.f10984g = null;
                            }
                        }
                        this.f10981d.a();
                    }
                }
            }
        }
    }
}
