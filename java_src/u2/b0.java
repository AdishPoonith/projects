package u2;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.n1;
import u2.b0;
import u2.u;
/* loaded from: classes.dex */
public interface b0 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f18764a;

        /* renamed from: b  reason: collision with root package name */
        public final u.b f18765b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0269a> f18766c;

        /* renamed from: d  reason: collision with root package name */
        private final long f18767d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u2.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0269a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f18768a;

            /* renamed from: b  reason: collision with root package name */
            public b0 f18769b;

            public C0269a(Handler handler, b0 b0Var) {
                this.f18768a = handler;
                this.f18769b = b0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0269a> copyOnWriteArrayList, int i10, u.b bVar, long j10) {
            this.f18766c = copyOnWriteArrayList;
            this.f18764a = i10;
            this.f18765b = bVar;
            this.f18767d = j10;
        }

        private long h(long j10) {
            long Y0 = p3.n0.Y0(j10);
            if (Y0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f18767d + Y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(b0 b0Var, q qVar) {
            b0Var.T(this.f18764a, this.f18765b, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(b0 b0Var, n nVar, q qVar) {
            b0Var.Y(this.f18764a, this.f18765b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(b0 b0Var, n nVar, q qVar) {
            b0Var.V(this.f18764a, this.f18765b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(b0 b0Var, n nVar, q qVar, IOException iOException, boolean z10) {
            b0Var.m0(this.f18764a, this.f18765b, nVar, qVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(b0 b0Var, n nVar, q qVar) {
            b0Var.U(this.f18764a, this.f18765b, nVar, qVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(b0 b0Var, u.b bVar, q qVar) {
            b0Var.Q(this.f18764a, bVar, qVar);
        }

        public void A(n nVar, int i10, int i11, n1 n1Var, int i12, Object obj, long j10, long j11) {
            B(nVar, new q(i10, i11, n1Var, i12, obj, h(j10), h(j11)));
        }

        public void B(final n nVar, final q qVar) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.o(b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void C(b0 b0Var) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                if (next.f18769b == b0Var) {
                    this.f18766c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            E(new q(1, i10, null, 3, null, h(j10), h(j11)));
        }

        public void E(final q qVar) {
            final u.b bVar = (u.b) p3.a.e(this.f18765b);
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.p(b0Var, bVar, qVar);
                    }
                });
            }
        }

        public a F(int i10, u.b bVar, long j10) {
            return new a(this.f18766c, i10, bVar, j10);
        }

        public void g(Handler handler, b0 b0Var) {
            p3.a.e(handler);
            p3.a.e(b0Var);
            this.f18766c.add(new C0269a(handler, b0Var));
        }

        public void i(int i10, n1 n1Var, int i11, Object obj, long j10) {
            j(new q(1, i10, n1Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(final q qVar) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.k(b0Var, qVar);
                    }
                });
            }
        }

        public void q(n nVar, int i10) {
            r(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(n nVar, int i10, int i11, n1 n1Var, int i12, Object obj, long j10, long j11) {
            s(nVar, new q(i10, i11, n1Var, i12, obj, h(j10), h(j11)));
        }

        public void s(final n nVar, final q qVar) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.l(b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void t(n nVar, int i10) {
            u(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(n nVar, int i10, int i11, n1 n1Var, int i12, Object obj, long j10, long j11) {
            v(nVar, new q(i10, i11, n1Var, i12, obj, h(j10), h(j11)));
        }

        public void v(final n nVar, final q qVar) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.m(b0Var, nVar, qVar);
                    }
                });
            }
        }

        public void w(n nVar, int i10, int i11, n1 n1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            y(nVar, new q(i10, i11, n1Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(n nVar, int i10, IOException iOException, boolean z10) {
            w(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(final n nVar, final q qVar, final IOException iOException, final boolean z10) {
            Iterator<C0269a> it = this.f18766c.iterator();
            while (it.hasNext()) {
                C0269a next = it.next();
                final b0 b0Var = next.f18769b;
                p3.n0.K0(next.f18768a, new Runnable() { // from class: u2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.this.n(b0Var, nVar, qVar, iOException, z10);
                    }
                });
            }
        }

        public void z(n nVar, int i10) {
            A(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    void Q(int i10, u.b bVar, q qVar);

    void T(int i10, u.b bVar, q qVar);

    void U(int i10, u.b bVar, n nVar, q qVar);

    void V(int i10, u.b bVar, n nVar, q qVar);

    void Y(int i10, u.b bVar, n nVar, q qVar);

    void m0(int i10, u.b bVar, n nVar, q qVar, IOException iOException, boolean z10);
}
