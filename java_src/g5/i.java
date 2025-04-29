package g5;

import com.google.crypto.tink.shaded.protobuf.s0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f8975b = Logger.getLogger(i.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, b> f8976a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o5.d f8977a;

        a(o5.d dVar) {
            this.f8977a = dVar;
        }

        @Override // g5.i.b
        public <Q> g<Q> a(Class<Q> cls) {
            try {
                return new h(this.f8977a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // g5.i.b
        public g<?> b() {
            o5.d dVar = this.f8977a;
            return new h(dVar, dVar.b());
        }

        @Override // g5.i.b
        public Class<?> c() {
            return this.f8977a.getClass();
        }

        @Override // g5.i.b
        public Set<Class<?>> d() {
            return this.f8977a.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        <P> g<P> a(Class<P> cls);

        g<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        this.f8976a = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(i iVar) {
        this.f8976a = new ConcurrentHashMap(iVar.f8976a);
    }

    private static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private static <KeyProtoT extends s0> b b(o5.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f8976a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f8976a.get(str);
    }

    private <P> g<P> e(String str, Class<P> cls) {
        b d10 = d(str);
        if (cls == null) {
            return (g<P>) d10.b();
        }
        if (d10.d().contains(cls)) {
            return d10.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d10.c() + ", supported primitives: " + i(d10.d()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
        r5.f8976a.putIfAbsent(r0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized <P> void h(g5.i.b r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            g5.g r0 = r6.b()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.d()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.ConcurrentMap<java.lang.String, g5.i$b> r1 = r5.f8976a     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6f
            g5.i$b r1 = (g5.i.b) r1     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L60
            java.lang.Class r2 = r1.c()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r3 = r6.c()     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L22
            goto L60
        L22:
            java.util.logging.Logger r7 = g5.i.f8975b     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6f
            r2.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            r7.warning(r2)     // Catch: java.lang.Throwable -> L6f
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6f
            r4 = 0
            r3[r4] = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 1
            java.lang.Class r1 = r1.c()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6f
            r3[r0] = r1     // Catch: java.lang.Throwable -> L6f
            r0 = 2
            java.lang.Class r6 = r6.c()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L6f
            r3[r0] = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            throw r7     // Catch: java.lang.Throwable -> L6f
        L60:
            if (r7 != 0) goto L68
            java.util.concurrent.ConcurrentMap<java.lang.String, g5.i$b> r7 = r5.f8976a     // Catch: java.lang.Throwable -> L6f
            r7.putIfAbsent(r0, r6)     // Catch: java.lang.Throwable -> L6f
            goto L6d
        L68:
            java.util.concurrent.ConcurrentMap<java.lang.String, g5.i$b> r7 = r5.f8976a     // Catch: java.lang.Throwable -> L6f
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r5)
            return
        L6f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.i.h(g5.i$b, boolean):void");
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls : set) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <P> g<P> c(String str, Class<P> cls) {
        return e(str, (Class) a(cls));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g<?> f(String str) {
        return d(str).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <KeyProtoT extends s0> void g(o5.d<KeyProtoT> dVar) {
        if (!dVar.a().b()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(String str) {
        return this.f8976a.containsKey(str);
    }
}
