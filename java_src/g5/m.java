package g5;

import g5.u;
import java.security.GeneralSecurityException;
import t5.c0;
import t5.d0;
import t5.z;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f8990a;

    /* renamed from: b  reason: collision with root package name */
    private final r5.a f8991b = r5.a.f16691b;

    private m(c0 c0Var) {
        this.f8990a = c0Var;
    }

    private static void a(t5.t tVar) {
        if (tVar == null || tVar.Q().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(c0 c0Var) {
        if (c0Var == null || c0Var.T() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t5.t tVar, a aVar, byte[] bArr) {
        try {
            c0 X = c0.X(aVar.b(tVar.Q().A(), bArr), com.google.crypto.tink.shaded.protobuf.q.b());
            b(X);
            return X;
        } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t5.t d(c0 c0Var, a aVar, byte[] bArr) {
        byte[] a10 = aVar.a(c0Var.f(), bArr);
        try {
            if (c0.X(aVar.b(a10, bArr), com.google.crypto.tink.shaded.protobuf.q.b()).equals(c0Var)) {
                return t5.t.R().B(com.google.crypto.tink.shaded.protobuf.i.m(a10)).C(y.b(c0Var)).b();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final m e(c0 c0Var) {
        b(c0Var);
        return new m(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <B, P> P i(Class<P> cls, Class<B> cls2) {
        y.d(this.f8990a);
        u.b j10 = u.j(cls2);
        j10.e(this.f8991b);
        for (c0.c cVar : this.f8990a.U()) {
            if (cVar.V() == z.ENABLED) {
                Object f10 = w.f(cVar.S(), cls2);
                if (cVar.T() == this.f8990a.V()) {
                    j10.a(f10, cVar);
                } else {
                    j10.b(f10, cVar);
                }
            }
        }
        return (P) w.n(j10.d(), cls);
    }

    public static final m j(o oVar, a aVar) {
        return k(oVar, aVar, new byte[0]);
    }

    public static final m k(o oVar, a aVar, byte[] bArr) {
        t5.t a10 = oVar.a();
        a(a10);
        return new m(c(a10, aVar, bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 f() {
        return this.f8990a;
    }

    public d0 g() {
        return y.b(this.f8990a);
    }

    public <P> P h(Class<P> cls) {
        Class<?> c10 = w.c(cls);
        if (c10 != null) {
            return (P) i(cls, c10);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void l(p pVar, a aVar) {
        m(pVar, aVar, new byte[0]);
    }

    public void m(p pVar, a aVar, byte[] bArr) {
        pVar.b(d(this.f8990a, aVar, bArr));
    }

    public String toString() {
        return g().toString();
    }
}
