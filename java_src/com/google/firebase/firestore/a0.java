package com.google.firebase.firestore;

import java.util.Objects;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6712a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6713b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6714c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6715d;

    /* renamed from: e  reason: collision with root package name */
    private j0 f6716e;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f6717a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6718b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6719c;

        /* renamed from: d  reason: collision with root package name */
        private long f6720d;

        /* renamed from: e  reason: collision with root package name */
        private j0 f6721e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6722f;

        public b() {
            this.f6722f = false;
            this.f6717a = "firestore.googleapis.com";
            this.f6718b = true;
            this.f6719c = true;
            this.f6720d = 104857600L;
        }

        public b(a0 a0Var) {
            this.f6722f = false;
            q6.x.c(a0Var, "Provided settings must not be null.");
            this.f6717a = a0Var.f6712a;
            this.f6718b = a0Var.f6713b;
            this.f6719c = a0Var.f6714c;
            long j10 = a0Var.f6715d;
            this.f6720d = j10;
            if (!this.f6719c || j10 != 104857600) {
                this.f6722f = true;
            }
            boolean z10 = this.f6722f;
            j0 j0Var = a0Var.f6716e;
            if (z10) {
                q6.b.d(j0Var == null, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
            } else {
                this.f6721e = j0Var;
            }
        }

        public a0 f() {
            if (this.f6718b || !this.f6717a.equals("firestore.googleapis.com")) {
                return new a0(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        @Deprecated
        public b g(long j10) {
            if (this.f6721e == null) {
                if (j10 == -1 || j10 >= 1048576) {
                    this.f6720d = j10;
                    this.f6722f = true;
                    return this;
                }
                throw new IllegalArgumentException("Cache size must be set to at least 1048576 bytes");
            }
            throw new IllegalStateException("New cache config API setLocalCacheSettings() is already used.");
        }

        public b h(String str) {
            this.f6717a = (String) q6.x.c(str, "Provided host must not be null.");
            return this;
        }

        @Deprecated
        public b i(boolean z10) {
            if (this.f6721e == null) {
                this.f6719c = z10;
                this.f6722f = true;
                return this;
            }
            throw new IllegalStateException("New cache config API setLocalCacheSettings() is already used.");
        }

        public b j(boolean z10) {
            this.f6718b = z10;
            return this;
        }
    }

    private a0(b bVar) {
        this.f6712a = bVar.f6717a;
        this.f6713b = bVar.f6718b;
        this.f6714c = bVar.f6719c;
        this.f6715d = bVar.f6720d;
        this.f6716e = bVar.f6721e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f6713b == a0Var.f6713b && this.f6714c == a0Var.f6714c && this.f6715d == a0Var.f6715d && this.f6712a.equals(a0Var.f6712a)) {
            return Objects.equals(this.f6716e, a0Var.f6716e);
        }
        return false;
    }

    public j0 f() {
        return this.f6716e;
    }

    @Deprecated
    public long g() {
        j0 j0Var = this.f6716e;
        if (j0Var != null) {
            if (j0Var instanceof p0) {
                return ((p0) j0Var).a();
            }
            k0 k0Var = (k0) j0Var;
            if (k0Var.a() instanceof m0) {
                return ((m0) k0Var.a()).a();
            }
            return -1L;
        }
        return this.f6715d;
    }

    public String h() {
        return this.f6712a;
    }

    public int hashCode() {
        long j10 = this.f6715d;
        int hashCode = ((((((this.f6712a.hashCode() * 31) + (this.f6713b ? 1 : 0)) * 31) + (this.f6714c ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        j0 j0Var = this.f6716e;
        return hashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }

    @Deprecated
    public boolean i() {
        j0 j0Var = this.f6716e;
        return j0Var != null ? j0Var instanceof p0 : this.f6714c;
    }

    public boolean j() {
        return this.f6713b;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f6712a + ", sslEnabled=" + this.f6713b + ", persistenceEnabled=" + this.f6714c + ", cacheSizeBytes=" + this.f6715d + ", cacheSettings=" + this.f6716e) == null) {
            return "null";
        }
        return this.f6716e.toString() + "}";
    }
}
