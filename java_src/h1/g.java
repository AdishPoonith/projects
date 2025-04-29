package h1;

import f1.n;
import p0.f0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f9087a = new g();

    private g() {
    }

    public static final void d() {
        f0 f0Var = f0.f14852a;
        if (f0.p()) {
            n nVar = n.f8481a;
            n.a(n.b.CrashReport, new n.a() { // from class: h1.d
                @Override // f1.n.a
                public final void a(boolean z10) {
                    g.e(z10);
                }
            });
            n.a(n.b.ErrorReport, new n.a() { // from class: h1.f
                @Override // f1.n.a
                public final void a(boolean z10) {
                    g.f(z10);
                }
            });
            n.a(n.b.AnrReport, new n.a() { // from class: h1.e
                @Override // f1.n.a
                public final void a(boolean z10) {
                    g.g(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z10) {
        if (z10) {
            j1.c.f11964b.c();
            n nVar = n.f8481a;
            if (n.g(n.b.CrashShield)) {
                b bVar = b.f9064a;
                b.b();
                k1.a aVar = k1.a.f12490a;
                k1.a.a();
            }
            if (n.g(n.b.ThreadCheck)) {
                m1.a aVar2 = m1.a.f13704a;
                m1.a.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(boolean z10) {
        if (z10) {
            l1.e eVar = l1.e.f13048a;
            l1.e.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z10) {
        if (z10) {
            i1.e eVar = i1.e.f9625a;
            i1.e.c();
        }
    }
}
