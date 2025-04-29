package i9;

import java.util.IdentityHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final IdentityHashMap<c<?>, Object> f9797b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f9798c;

    /* renamed from: a  reason: collision with root package name */
    private final IdentityHashMap<c<?>, Object> f9799a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private a f9800a;

        /* renamed from: b  reason: collision with root package name */
        private IdentityHashMap<c<?>, Object> f9801b;

        private b(a aVar) {
            this.f9800a = aVar;
        }

        private IdentityHashMap<c<?>, Object> b(int i10) {
            if (this.f9801b == null) {
                this.f9801b = new IdentityHashMap<>(i10);
            }
            return this.f9801b;
        }

        public a a() {
            if (this.f9801b != null) {
                for (Map.Entry entry : this.f9800a.f9799a.entrySet()) {
                    if (!this.f9801b.containsKey(entry.getKey())) {
                        this.f9801b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f9800a = new a(this.f9801b);
                this.f9801b = null;
            }
            return this.f9800a;
        }

        public <T> b c(c<T> cVar) {
            if (this.f9800a.f9799a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f9800a.f9799a);
                identityHashMap.remove(cVar);
                this.f9800a = new a(identityHashMap);
            }
            IdentityHashMap<c<?>, Object> identityHashMap2 = this.f9801b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> b d(c<T> cVar, T t10) {
            b(1).put(cVar, t10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f9802a;

        private c(String str) {
            this.f9802a = str;
        }

        public static <T> c<T> a(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f9802a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f9797b = identityHashMap;
        f9798c = new a(identityHashMap);
    }

    private a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.f9799a = identityHashMap;
    }

    public static b c() {
        return new b();
    }

    public <T> T b(c<T> cVar) {
        return (T) this.f9799a.get(cVar);
    }

    public b d() {
        return new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5a
            java.lang.Class<i9.a> r2 = i9.a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L5a
        L10:
            i9.a r7 = (i9.a) r7
            java.util.IdentityHashMap<i9.a$c<?>, java.lang.Object> r2 = r6.f9799a
            int r2 = r2.size()
            java.util.IdentityHashMap<i9.a$c<?>, java.lang.Object> r3 = r7.f9799a
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            java.util.IdentityHashMap<i9.a$c<?>, java.lang.Object> r2 = r6.f9799a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap<i9.a$c<?>, java.lang.Object> r4 = r7.f9799a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L44
            return r1
        L44:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap<i9.a$c<?>, java.lang.Object> r5 = r7.f9799a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = b5.j.a(r4, r3)
            if (r3 != 0) goto L2b
            return r1
        L59:
            return r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry<c<?>, Object> entry : this.f9799a.entrySet()) {
            i10 += b5.j.b(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public String toString() {
        return this.f9799a.toString();
    }
}
