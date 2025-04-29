package o5;

import g5.t;
import g5.x;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o5.o;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    private static final h f14650b = new h();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<o> f14651a = new AtomicReference<>(new o.b().e());

    public static h a() {
        return f14650b;
    }

    public <SerializationT extends n> g5.f b(SerializationT serializationt, x xVar) {
        return this.f14651a.get().e(serializationt, xVar);
    }

    public g5.f c(l lVar, x xVar) {
        Objects.requireNonNull(xVar, "access cannot be null");
        try {
            try {
                return b(lVar, xVar);
            } catch (GeneralSecurityException e10) {
                throw new p("Creating a LegacyProtoKey failed", e10);
            }
        } catch (GeneralSecurityException unused) {
            return new e(lVar, xVar);
        }
    }

    public synchronized <SerializationT extends n> void d(b<SerializationT> bVar) {
        this.f14651a.set(new o.b(this.f14651a.get()).f(bVar).e());
    }

    public synchronized <KeyT extends g5.f, SerializationT extends n> void e(c<KeyT, SerializationT> cVar) {
        this.f14651a.set(new o.b(this.f14651a.get()).g(cVar).e());
    }

    public synchronized <SerializationT extends n> void f(i<SerializationT> iVar) {
        this.f14651a.set(new o.b(this.f14651a.get()).h(iVar).e());
    }

    public synchronized <ParametersT extends t, SerializationT extends n> void g(j<ParametersT, SerializationT> jVar) {
        this.f14651a.set(new o.b(this.f14651a.get()).i(jVar).e());
    }
}
