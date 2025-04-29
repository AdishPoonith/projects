package w1;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.u;
import w1.w;
/* loaded from: classes.dex */
public interface w {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19755a;

        /* renamed from: b  reason: collision with root package name */
        public final u.b f19756b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0284a> f19757c;

        /* renamed from: w1.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static final class C0284a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f19758a;

            /* renamed from: b  reason: collision with root package name */
            public w f19759b;

            public C0284a(Handler handler, w wVar) {
                this.f19758a = handler;
                this.f19759b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0284a> copyOnWriteArrayList, int i10, u.b bVar) {
            this.f19757c = copyOnWriteArrayList;
            this.f19755a = i10;
            this.f19756b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(w wVar) {
            wVar.a0(this.f19755a, this.f19756b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(w wVar) {
            wVar.f0(this.f19755a, this.f19756b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(w wVar) {
            wVar.P(this.f19755a, this.f19756b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(w wVar, int i10) {
            wVar.k0(this.f19755a, this.f19756b);
            wVar.C(this.f19755a, this.f19756b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(w wVar, Exception exc) {
            wVar.I(this.f19755a, this.f19756b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(w wVar) {
            wVar.G(this.f19755a, this.f19756b);
        }

        public void g(Handler handler, w wVar) {
            p3.a.e(handler);
            p3.a.e(wVar);
            this.f19757c.add(new C0284a(handler, wVar));
        }

        public void h() {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.n(wVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.o(wVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.p(wVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.q(wVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.r(wVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                final w wVar = next.f19759b;
                p3.n0.K0(next.f19758a, new Runnable() { // from class: w1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.s(wVar);
                    }
                });
            }
        }

        public void t(w wVar) {
            Iterator<C0284a> it = this.f19757c.iterator();
            while (it.hasNext()) {
                C0284a next = it.next();
                if (next.f19759b == wVar) {
                    this.f19757c.remove(next);
                }
            }
        }

        public a u(int i10, u.b bVar) {
            return new a(this.f19757c, i10, bVar);
        }
    }

    void C(int i10, u.b bVar, int i11);

    void G(int i10, u.b bVar);

    void I(int i10, u.b bVar, Exception exc);

    void P(int i10, u.b bVar);

    void a0(int i10, u.b bVar);

    void f0(int i10, u.b bVar);

    @Deprecated
    void k0(int i10, u.b bVar);
}
