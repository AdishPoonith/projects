package l9;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static final l9.a[] f13504e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f13505f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f13506g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f13507h;

    /* renamed from: a  reason: collision with root package name */
    final boolean f13508a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f13509b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f13510c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f13511d;

    /* renamed from: l9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0197b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f13512a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f13513b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f13514c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13515d;

        public C0197b(b bVar) {
            this.f13512a = bVar.f13508a;
            this.f13513b = bVar.f13509b;
            this.f13514c = bVar.f13510c;
            this.f13515d = bVar.f13511d;
        }

        public C0197b(boolean z10) {
            this.f13512a = z10;
        }

        public b e() {
            return new b(this);
        }

        public C0197b f(String... strArr) {
            if (this.f13512a) {
                if (strArr == null) {
                    this.f13513b = null;
                } else {
                    this.f13513b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0197b g(l9.a... aVarArr) {
            if (this.f13512a) {
                String[] strArr = new String[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    strArr[i10] = aVarArr[i10].f13503j;
                }
                this.f13513b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0197b h(boolean z10) {
            if (this.f13512a) {
                this.f13515d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public C0197b i(String... strArr) {
            if (this.f13512a) {
                if (strArr == null) {
                    this.f13514c = null;
                } else {
                    this.f13514c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C0197b j(k... kVarArr) {
            if (this.f13512a) {
                if (kVarArr.length != 0) {
                    String[] strArr = new String[kVarArr.length];
                    for (int i10 = 0; i10 < kVarArr.length; i10++) {
                        strArr[i10] = kVarArr[i10].f13570j;
                    }
                    this.f13514c = strArr;
                    return this;
                }
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        l9.a[] aVarArr = {l9.a.TLS_AES_128_GCM_SHA256, l9.a.TLS_AES_256_GCM_SHA384, l9.a.TLS_CHACHA20_POLY1305_SHA256, l9.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, l9.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, l9.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, l9.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, l9.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, l9.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, l9.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, l9.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, l9.a.TLS_RSA_WITH_AES_128_GCM_SHA256, l9.a.TLS_RSA_WITH_AES_256_GCM_SHA384, l9.a.TLS_RSA_WITH_AES_128_CBC_SHA, l9.a.TLS_RSA_WITH_AES_256_CBC_SHA, l9.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f13504e = aVarArr;
        C0197b g10 = new C0197b(true).g(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b e10 = g10.j(kVar, kVar2).h(true).e();
        f13505f = e10;
        f13506g = new C0197b(e10).j(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        f13507h = new C0197b(false).e();
    }

    private b(C0197b c0197b) {
        this.f13508a = c0197b.f13512a;
        this.f13509b = c0197b.f13513b;
        this.f13510c = c0197b.f13514c;
        this.f13511d = c0197b.f13515d;
    }

    private b e(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        if (this.f13509b != null) {
            strArr = (String[]) l.c(String.class, this.f13509b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C0197b(this).f(strArr).i((String[]) l.c(String.class, this.f13510c, enabledProtocols)).e();
    }

    public void c(SSLSocket sSLSocket, boolean z10) {
        b e10 = e(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(e10.f13510c);
        String[] strArr = e10.f13509b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<l9.a> d() {
        String[] strArr = this.f13509b;
        if (strArr == null) {
            return null;
        }
        l9.a[] aVarArr = new l9.a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f13509b;
            if (i10 >= strArr2.length) {
                return l.a(aVarArr);
            }
            aVarArr[i10] = l9.a.b(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            boolean z10 = this.f13508a;
            if (z10 != bVar.f13508a) {
                return false;
            }
            return !z10 || (Arrays.equals(this.f13509b, bVar.f13509b) && Arrays.equals(this.f13510c, bVar.f13510c) && this.f13511d == bVar.f13511d);
        }
        return false;
    }

    public boolean f() {
        return this.f13511d;
    }

    public List<k> g() {
        k[] kVarArr = new k[this.f13510c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f13510c;
            if (i10 >= strArr.length) {
                return l.a(kVarArr);
            }
            kVarArr[i10] = k.b(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f13508a) {
            return ((((527 + Arrays.hashCode(this.f13509b)) * 31) + Arrays.hashCode(this.f13510c)) * 31) + (!this.f13511d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f13508a) {
            List<l9.a> d10 = d();
            String obj = d10 == null ? "[use default]" : d10.toString();
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f13511d + ")";
        }
        return "ConnectionSpec()";
    }
}
