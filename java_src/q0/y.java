package q0;

import f1.n;
import f1.v;
import q0.y;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f15988a = new y();

    /* loaded from: classes.dex */
    public static final class a implements v.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(boolean z10) {
            if (z10) {
                r0.b bVar = r0.b.f16618a;
                r0.b.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(boolean z10) {
            if (z10) {
                b1.a aVar = b1.a.f2851a;
                b1.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(boolean z10) {
            if (z10) {
                z0.f fVar = z0.f.f20652a;
                z0.f.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(boolean z10) {
            if (z10) {
                v0.a aVar = v0.a.f19332a;
                v0.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(boolean z10) {
            if (z10) {
                w0.k kVar = w0.k.f19605a;
                w0.k.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(boolean z10) {
            if (z10) {
                s0.d dVar = s0.d.f16881a;
                s0.d.b();
            }
        }

        @Override // f1.v.b
        public void a() {
        }

        @Override // f1.v.b
        public void b(f1.r rVar) {
            f1.n nVar = f1.n.f8481a;
            f1.n.a(n.b.AAM, new n.a() { // from class: q0.u
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.i(z10);
                }
            });
            f1.n.a(n.b.RestrictiveDataFiltering, new n.a() { // from class: q0.x
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.j(z10);
                }
            });
            f1.n.a(n.b.PrivacyProtection, new n.a() { // from class: q0.s
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.k(z10);
                }
            });
            f1.n.a(n.b.EventDeactivation, new n.a() { // from class: q0.w
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.l(z10);
                }
            });
            f1.n.a(n.b.IapLogging, new n.a() { // from class: q0.v
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.m(z10);
                }
            });
            f1.n.a(n.b.CloudBridge, new n.a() { // from class: q0.t
                @Override // f1.n.a
                public final void a(boolean z10) {
                    y.a.n(z10);
                }
            });
        }
    }

    private y() {
    }

    public static final void a() {
        if (k1.a.d(y.class)) {
            return;
        }
        try {
            f1.v vVar = f1.v.f8582a;
            f1.v.d(new a());
        } catch (Throwable th) {
            k1.a.b(th, y.class);
        }
    }
}
