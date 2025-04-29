package p1;

import java.util.Collection;
import java.util.Set;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15266d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f15267a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15268b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15269c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Collection<String> collection, String nonce) {
        this(collection, nonce, m0.c());
        kotlin.jvm.internal.l.e(nonce, "nonce");
        m0 m0Var = m0.f15174a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ v(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L11
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.l.d(r2, r3)
        L11:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.v.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(java.util.Collection<java.lang.String> r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "nonce"
            kotlin.jvm.internal.l.e(r3, r0)
            java.lang.String r0 = "codeVerifier"
            kotlin.jvm.internal.l.e(r4, r0)
            r1.<init>()
            p1.l0 r0 = p1.l0.f15162a
            boolean r0 = p1.l0.a(r3)
            if (r0 == 0) goto L1f
            p1.m0 r0 = p1.m0.f15174a
            boolean r0 = p1.m0.d(r4)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L42
            java.util.HashSet r0 = new java.util.HashSet
            if (r2 == 0) goto L2a
            r0.<init>(r2)
            goto L2d
        L2a:
            r0.<init>()
        L2d:
            java.lang.String r2 = "openid"
            r0.add(r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(permissions)"
            kotlin.jvm.internal.l.d(r2, r0)
            r1.f15267a = r2
            r1.f15268b = r3
            r1.f15269c = r4
            return
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.v.<init>(java.util.Collection, java.lang.String, java.lang.String):void");
    }

    public final String a() {
        return this.f15269c;
    }

    public final String b() {
        return this.f15268b;
    }

    public final Set<String> c() {
        return this.f15267a;
    }
}
