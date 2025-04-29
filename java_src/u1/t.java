package u1;

import android.os.Handler;
import s1.n1;
import u1.t;
/* loaded from: classes.dex */
public interface t {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f18696a;

        /* renamed from: b  reason: collision with root package name */
        private final t f18697b;

        public a(Handler handler, t tVar) {
            this.f18696a = tVar != null ? (Handler) p3.a.e(handler) : null;
            this.f18697b = tVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((t) p3.n0.j(this.f18697b)).u(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((t) p3.n0.j(this.f18697b)).k(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((t) p3.n0.j(this.f18697b)).c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((t) p3.n0.j(this.f18697b)).r(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((t) p3.n0.j(this.f18697b)).q(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(v1.e eVar) {
            eVar.c();
            ((t) p3.n0.j(this.f18697b)).n(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(v1.e eVar) {
            ((t) p3.n0.j(this.f18697b)).h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(n1 n1Var, v1.i iVar) {
            ((t) p3.n0.j(this.f18697b)).p(n1Var);
            ((t) p3.n0.j(this.f18697b)).s(n1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((t) p3.n0.j(this.f18697b)).j(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((t) p3.n0.j(this.f18697b)).b(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.u(str);
                    }
                });
            }
        }

        public void o(final v1.e eVar) {
            eVar.c();
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final v1.e eVar) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final n1 n1Var, final v1.i iVar) {
            Handler handler = this.f18696a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.x(n1Var, iVar);
                    }
                });
            }
        }
    }

    void b(boolean z10);

    void c(Exception exc);

    void h(v1.e eVar);

    void j(long j10);

    void k(Exception exc);

    void n(v1.e eVar);

    @Deprecated
    void p(n1 n1Var);

    void q(String str);

    void r(String str, long j10, long j11);

    void s(n1 n1Var, v1.i iVar);

    void u(int i10, long j10, long j11);
}
