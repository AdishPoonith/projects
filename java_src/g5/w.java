package g5;

import com.google.crypto.tink.shaded.protobuf.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import o5.d;
import t5.a0;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9010a = Logger.getLogger(w.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<i> f9011b = new AtomicReference<>(new i());

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, b> f9012c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f9013d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f9014e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, v<?, ?>> f9015f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentMap<String, k> f9016g = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o5.d f9017a;

        a(o5.d dVar) {
            this.f9017a = dVar;
        }
    }

    /* loaded from: classes.dex */
    private interface b {
    }

    private w() {
    }

    private static <KeyProtoT extends s0> b a(o5.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (g5.w.f9011b.get().j(r3) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (g5.w.f9016g.containsKey(r5.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r5.getKey() + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (g5.w.f9016g.containsKey(r4.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.s0, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.s0> void b(java.lang.String r3, java.util.Map<java.lang.String, o5.d.a.C0215a<KeyFormatProtoT>> r4, boolean r5) {
        /*
            java.lang.Class<g5.w> r0 = g5.w.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = g5.w.f9013d     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference<g5.i> r5 = g5.w.f9011b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            g5.i r5 = (g5.i) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, g5.k> r1 = g5.w.f9016g     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, g5.k> r5 = g5.w.f9016g     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.w.b(java.lang.String, java.util.Map, boolean):void");
    }

    public static Class<?> c(Class<?> cls) {
        v<?, ?> vVar = f9015f.get(cls);
        if (vVar == null) {
            return null;
        }
        return vVar.a();
    }

    public static <P> P d(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class<P> cls) {
        return f9011b.get().c(str, cls).a(iVar);
    }

    public static <P> P e(String str, byte[] bArr, Class<P> cls) {
        return (P) d(str, com.google.crypto.tink.shaded.protobuf.i.m(bArr), cls);
    }

    public static <P> P f(t5.y yVar, Class<P> cls) {
        return (P) d(yVar.T(), yVar.U(), cls);
    }

    public static g<?> g(String str) {
        return f9011b.get().f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map<String, k> h() {
        Map<String, k> unmodifiableMap;
        synchronized (w.class) {
            unmodifiableMap = Collections.unmodifiableMap(f9016g);
        }
        return unmodifiableMap;
    }

    public static synchronized s0 i(a0 a0Var) {
        s0 b10;
        synchronized (w.class) {
            g<?> g10 = g(a0Var.T());
            if (!f9013d.get(a0Var.T()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
            b10 = g10.b(a0Var.U());
        }
        return b10;
    }

    public static synchronized t5.y j(a0 a0Var) {
        t5.y c10;
        synchronized (w.class) {
            g<?> g10 = g(a0Var.T());
            if (!f9013d.get(a0Var.T()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
            c10 = g10.c(a0Var.U());
        }
        return c10;
    }

    public static synchronized <KeyProtoT extends s0> void k(o5.d<KeyProtoT> dVar, boolean z10) {
        synchronized (w.class) {
            if (dVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<i> atomicReference = f9011b;
            i iVar = new i(atomicReference.get());
            iVar.g(dVar);
            String d10 = dVar.d();
            b(d10, z10 ? dVar.f().c() : Collections.emptyMap(), z10);
            if (!atomicReference.get().j(d10)) {
                f9012c.put(d10, a(dVar));
                if (z10) {
                    l(d10, dVar.f().c());
                }
            }
            f9013d.put(d10, Boolean.valueOf(z10));
            atomicReference.set(iVar);
        }
    }

    private static <KeyFormatProtoT extends s0> void l(String str, Map<String, d.a.C0215a<KeyFormatProtoT>> map) {
        for (Map.Entry<String, d.a.C0215a<KeyFormatProtoT>> entry : map.entrySet()) {
            f9016g.put(entry.getKey(), k.a(str, entry.getValue().f14638a.f(), entry.getValue().f14639b));
        }
    }

    public static synchronized <B, P> void m(v<B, P> vVar) {
        synchronized (w.class) {
            if (vVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> c10 = vVar.c();
            ConcurrentMap<Class<?>, v<?, ?>> concurrentMap = f9015f;
            if (concurrentMap.containsKey(c10)) {
                v<?, ?> vVar2 = concurrentMap.get(c10);
                if (!vVar.getClass().getName().equals(vVar2.getClass().getName())) {
                    Logger logger = f9010a;
                    logger.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + c10);
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", c10.getName(), vVar2.getClass().getName(), vVar.getClass().getName()));
                }
            }
            concurrentMap.put(c10, vVar);
        }
    }

    public static <B, P> P n(u<B> uVar, Class<P> cls) {
        v<?, ?> vVar = f9015f.get(cls);
        if (vVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + uVar.g().getName());
        } else if (vVar.a().equals(uVar.g())) {
            return (P) vVar.b(uVar);
        } else {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + vVar.a() + ", got " + uVar.g());
        }
    }
}
