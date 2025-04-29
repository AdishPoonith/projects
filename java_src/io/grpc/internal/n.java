package io.grpc.internal;

import i9.e0;
import i9.f;
import java.text.MessageFormat;
import java.util.logging.Level;
/* loaded from: classes.dex */
final class n extends i9.f {

    /* renamed from: a  reason: collision with root package name */
    private final o f11469a;

    /* renamed from: b  reason: collision with root package name */
    private final l2 f11470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11471a;

        static {
            int[] iArr = new int[f.a.values().length];
            f11471a = iArr;
            try {
                iArr[f.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11471a[f.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11471a[f.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, l2 l2Var) {
        this.f11469a = (o) b5.n.o(oVar, "tracer");
        this.f11470b = (l2) b5.n.o(l2Var, "time");
    }

    private boolean c(f.a aVar) {
        return aVar != f.a.DEBUG && this.f11469a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(i9.j0 j0Var, f.a aVar, String str) {
        Level f10 = f(aVar);
        if (o.f11484f.isLoggable(f10)) {
            o.d(j0Var, f10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(i9.j0 j0Var, f.a aVar, String str, Object... objArr) {
        Level f10 = f(aVar);
        if (o.f11484f.isLoggable(f10)) {
            o.d(j0Var, f10, MessageFormat.format(str, objArr));
        }
    }

    private static Level f(f.a aVar) {
        int i10 = a.f11471a[aVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? Level.FINE : i10 != 3 ? Level.FINEST : Level.FINER;
    }

    private static e0.b g(f.a aVar) {
        int i10 = a.f11471a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? e0.b.CT_INFO : e0.b.CT_WARNING : e0.b.CT_ERROR;
    }

    private void h(f.a aVar, String str) {
        if (aVar == f.a.DEBUG) {
            return;
        }
        this.f11469a.f(new e0.a().b(str).c(g(aVar)).e(this.f11470b.a()).a());
    }

    @Override // i9.f
    public void a(f.a aVar, String str) {
        d(this.f11469a.b(), aVar, str);
        if (c(aVar)) {
            h(aVar, str);
        }
    }

    @Override // i9.f
    public void b(f.a aVar, String str, Object... objArr) {
        a(aVar, (c(aVar) || o.f11484f.isLoggable(f(aVar))) ? MessageFormat.format(str, objArr) : null);
    }
}
