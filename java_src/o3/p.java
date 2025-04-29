package o3;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s1.k1;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f14512a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14513b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14514c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14515d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f14516e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f14517f;

    /* renamed from: g  reason: collision with root package name */
    public final long f14518g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14519h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14520i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14521j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f14522k;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f14523a;

        /* renamed from: b  reason: collision with root package name */
        private long f14524b;

        /* renamed from: c  reason: collision with root package name */
        private int f14525c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f14526d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f14527e;

        /* renamed from: f  reason: collision with root package name */
        private long f14528f;

        /* renamed from: g  reason: collision with root package name */
        private long f14529g;

        /* renamed from: h  reason: collision with root package name */
        private String f14530h;

        /* renamed from: i  reason: collision with root package name */
        private int f14531i;

        /* renamed from: j  reason: collision with root package name */
        private Object f14532j;

        public b() {
            this.f14525c = 1;
            this.f14527e = Collections.emptyMap();
            this.f14529g = -1L;
        }

        private b(p pVar) {
            this.f14523a = pVar.f14512a;
            this.f14524b = pVar.f14513b;
            this.f14525c = pVar.f14514c;
            this.f14526d = pVar.f14515d;
            this.f14527e = pVar.f14516e;
            this.f14528f = pVar.f14518g;
            this.f14529g = pVar.f14519h;
            this.f14530h = pVar.f14520i;
            this.f14531i = pVar.f14521j;
            this.f14532j = pVar.f14522k;
        }

        public p a() {
            p3.a.i(this.f14523a, "The uri must be set.");
            return new p(this.f14523a, this.f14524b, this.f14525c, this.f14526d, this.f14527e, this.f14528f, this.f14529g, this.f14530h, this.f14531i, this.f14532j);
        }

        public b b(int i10) {
            this.f14531i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f14526d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f14525c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f14527e = map;
            return this;
        }

        public b f(String str) {
            this.f14530h = str;
            return this;
        }

        public b g(long j10) {
            this.f14529g = j10;
            return this;
        }

        public b h(long j10) {
            this.f14528f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f14523a = uri;
            return this;
        }

        public b j(String str) {
            this.f14523a = Uri.parse(str);
            return this;
        }
    }

    static {
        k1.a("goog.exo.datasource");
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    private p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        p3.a.a(j13 >= 0);
        p3.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        p3.a.a(z10);
        this.f14512a = uri;
        this.f14513b = j10;
        this.f14514c = i10;
        this.f14515d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14516e = Collections.unmodifiableMap(new HashMap(map));
        this.f14518g = j11;
        this.f14517f = j13;
        this.f14519h = j12;
        this.f14520i = str;
        this.f14521j = i11;
        this.f14522k = obj;
    }

    public p(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f14514c);
    }

    public boolean d(int i10) {
        return (this.f14521j & i10) == i10;
    }

    public p e(long j10) {
        long j11 = this.f14519h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public p f(long j10, long j11) {
        return (j10 == 0 && this.f14519h == j11) ? this : new p(this.f14512a, this.f14513b, this.f14514c, this.f14515d, this.f14516e, this.f14518g + j10, j11, this.f14520i, this.f14521j, this.f14522k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f14512a + ", " + this.f14518g + ", " + this.f14519h + ", " + this.f14520i + ", " + this.f14521j + "]";
    }
}
