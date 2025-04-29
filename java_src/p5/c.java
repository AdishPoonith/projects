package p5;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a  reason: collision with root package name */
    private final int f15499a;

    /* renamed from: b  reason: collision with root package name */
    private final a f15500b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f15501b = new a("TINK");

        /* renamed from: c  reason: collision with root package name */
        public static final a f15502c = new a("CRUNCHY");

        /* renamed from: d  reason: collision with root package name */
        public static final a f15503d = new a("LEGACY");

        /* renamed from: e  reason: collision with root package name */
        public static final a f15504e = new a("NO_PREFIX");

        /* renamed from: a  reason: collision with root package name */
        private final String f15505a;

        private a(String str) {
            this.f15505a = str;
        }

        public String toString() {
            return this.f15505a;
        }
    }

    private c(int i10, a aVar) {
        this.f15499a = i10;
        this.f15500b = aVar;
    }

    public static c a(int i10, a aVar) {
        if (i10 < 10 || 16 < i10) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }
        return new c(i10, aVar);
    }

    public int b() {
        return this.f15499a;
    }

    public int c() {
        a aVar = this.f15500b;
        if (aVar == a.f15504e) {
            return b();
        }
        if (aVar == a.f15501b || aVar == a.f15502c || aVar == a.f15503d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public a d() {
        return this.f15500b;
    }

    public boolean e() {
        return this.f15500b != a.f15504e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return cVar.c() == c() && cVar.d() == d();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15499a), this.f15500b);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f15500b + ", " + this.f15499a + "-byte tags)";
    }
}
