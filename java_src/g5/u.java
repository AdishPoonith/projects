package g5;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import t5.c0;
import t5.i0;
import t5.z;
/* loaded from: classes.dex */
public final class u<P> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<d, List<c<P>>> f8994a;

    /* renamed from: b  reason: collision with root package name */
    private c<P> f8995b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<P> f8996c;

    /* renamed from: d  reason: collision with root package name */
    private final r5.a f8997d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8998e;

    /* loaded from: classes.dex */
    public static class b<P> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<P> f8999a;

        /* renamed from: b  reason: collision with root package name */
        private ConcurrentMap<d, List<c<P>>> f9000b;

        /* renamed from: c  reason: collision with root package name */
        private c<P> f9001c;

        /* renamed from: d  reason: collision with root package name */
        private r5.a f9002d;

        private b(Class<P> cls) {
            this.f9000b = new ConcurrentHashMap();
            this.f8999a = cls;
            this.f9002d = r5.a.f16691b;
        }

        private b<P> c(P p10, c0.c cVar, boolean z10) {
            if (this.f9000b != null) {
                if (cVar.V() == z.ENABLED) {
                    c<P> b10 = u.b(p10, cVar, this.f9000b);
                    if (z10) {
                        if (this.f9001c != null) {
                            throw new IllegalStateException("you cannot set two primary primitives");
                        }
                        this.f9001c = b10;
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }

        public b<P> a(P p10, c0.c cVar) {
            return c(p10, cVar, true);
        }

        public b<P> b(P p10, c0.c cVar) {
            return c(p10, cVar, false);
        }

        public u<P> d() {
            ConcurrentMap<d, List<c<P>>> concurrentMap = this.f9000b;
            if (concurrentMap != null) {
                u<P> uVar = new u<>(concurrentMap, this.f9001c, this.f9002d, this.f8999a);
                this.f9000b = null;
                return uVar;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        public b<P> e(r5.a aVar) {
            if (this.f9000b != null) {
                this.f9002d = aVar;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
    }

    /* loaded from: classes.dex */
    public static final class c<P> {

        /* renamed from: a  reason: collision with root package name */
        private final P f9003a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f9004b;

        /* renamed from: c  reason: collision with root package name */
        private final z f9005c;

        /* renamed from: d  reason: collision with root package name */
        private final i0 f9006d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9007e;

        /* renamed from: f  reason: collision with root package name */
        private final f f9008f;

        c(P p10, byte[] bArr, z zVar, i0 i0Var, int i10, f fVar) {
            this.f9003a = p10;
            this.f9004b = Arrays.copyOf(bArr, bArr.length);
            this.f9005c = zVar;
            this.f9006d = i0Var;
            this.f9007e = i10;
            this.f9008f = fVar;
        }

        public final byte[] a() {
            byte[] bArr = this.f9004b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public f b() {
            return this.f9008f;
        }

        public int c() {
            return this.f9007e;
        }

        public i0 d() {
            return this.f9006d;
        }

        public t e() {
            return this.f9008f.a();
        }

        public P f() {
            return this.f9003a;
        }

        public z g() {
            return this.f9005c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Comparable<d> {

        /* renamed from: j  reason: collision with root package name */
        private final byte[] f9009j;

        private d(byte[] bArr) {
            this.f9009j = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            int i10;
            int i11;
            byte[] bArr = this.f9009j;
            int length = bArr.length;
            byte[] bArr2 = dVar.f9009j;
            if (length != bArr2.length) {
                i10 = bArr.length;
                i11 = bArr2.length;
            } else {
                int i12 = 0;
                while (true) {
                    byte[] bArr3 = this.f9009j;
                    if (i12 >= bArr3.length) {
                        return 0;
                    }
                    char c10 = bArr3[i12];
                    byte[] bArr4 = dVar.f9009j;
                    if (c10 != bArr4[i12]) {
                        i10 = bArr3[i12];
                        i11 = bArr4[i12];
                        break;
                    }
                    i12++;
                }
            }
            return i10 - i11;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f9009j, ((d) obj).f9009j);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f9009j);
        }

        public String toString() {
            return u5.k.b(this.f9009j);
        }
    }

    private u(ConcurrentMap<d, List<c<P>>> concurrentMap, c<P> cVar, r5.a aVar, Class<P> cls) {
        this.f8994a = concurrentMap;
        this.f8995b = cVar;
        this.f8996c = cls;
        this.f8997d = aVar;
        this.f8998e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <P> c<P> b(P p10, c0.c cVar, ConcurrentMap<d, List<c<P>>> concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.T());
        if (cVar.U() == i0.RAW) {
            valueOf = null;
        }
        c<P> cVar2 = new c<>(p10, g5.c.a(cVar), cVar.V(), cVar.U(), cVar.T(), o5.h.a().c(o5.l.b(cVar.S().T(), cVar.S().U(), cVar.S().S(), cVar.U(), valueOf), e.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.a());
        List<c<P>> put = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static <P> b<P> j(Class<P> cls) {
        return new b<>(cls);
    }

    public Collection<List<c<P>>> c() {
        return this.f8994a.values();
    }

    public r5.a d() {
        return this.f8997d;
    }

    public c<P> e() {
        return this.f8995b;
    }

    public List<c<P>> f(byte[] bArr) {
        List<c<P>> list = this.f8994a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> g() {
        return this.f8996c;
    }

    public List<c<P>> h() {
        return f(g5.c.f8970a);
    }

    public boolean i() {
        return !this.f8997d.b().isEmpty();
    }
}
