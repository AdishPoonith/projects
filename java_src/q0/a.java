package q0;

import f1.l0;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final C0230a f15886l = new C0230a(null);

    /* renamed from: j  reason: collision with root package name */
    private final String f15887j;

    /* renamed from: k  reason: collision with root package name */
    private final String f15888k;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0230a {
        private C0230a() {
        }

        public /* synthetic */ C0230a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: l  reason: collision with root package name */
        public static final C0231a f15889l = new C0231a(null);

        /* renamed from: j  reason: collision with root package name */
        private final String f15890j;

        /* renamed from: k  reason: collision with root package name */
        private final String f15891k;

        /* renamed from: q0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0231a {
            private C0231a() {
            }

            public /* synthetic */ C0231a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String str, String appId) {
            kotlin.jvm.internal.l.e(appId, "appId");
            this.f15890j = str;
            this.f15891k = appId;
        }

        private final Object readResolve() {
            return new a(this.f15890j, this.f15891k);
        }
    }

    public a(String str, String applicationId) {
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        this.f15887j = applicationId;
        l0 l0Var = l0.f8470a;
        this.f15888k = l0.X(str) ? null : str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(p0.a r2) {
        /*
            r1 = this;
            java.lang.String r0 = "accessToken"
            kotlin.jvm.internal.l.e(r2, r0)
            java.lang.String r2 = r2.s()
            p0.f0 r0 = p0.f0.f14852a
            java.lang.String r0 = p0.f0.m()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.<init>(p0.a):void");
    }

    private final Object writeReplace() {
        return new b(this.f15888k, this.f15887j);
    }

    public final String a() {
        return this.f15888k;
    }

    public final String b() {
        return this.f15887j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            l0 l0Var = l0.f8470a;
            a aVar = (a) obj;
            return l0.e(aVar.f15888k, this.f15888k) && l0.e(aVar.f15887j, this.f15887j);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15888k;
        return (str == null ? 0 : str.hashCode()) ^ this.f15887j.hashCode();
    }
}
