package o3;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import o3.l;
import o3.u;
/* loaded from: classes.dex */
public class u extends g {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14591e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14592f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14593g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14594h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f14595i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f14596j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f14597k;

    /* renamed from: l  reason: collision with root package name */
    private b5.o<String> f14598l;

    /* renamed from: m  reason: collision with root package name */
    private p f14599m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f14600n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f14601o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14602p;

    /* renamed from: q  reason: collision with root package name */
    private int f14603q;

    /* renamed from: r  reason: collision with root package name */
    private long f14604r;

    /* renamed from: s  reason: collision with root package name */
    private long f14605s;

    /* loaded from: classes.dex */
    public static final class b implements l.a {

        /* renamed from: b  reason: collision with root package name */
        private p0 f14607b;

        /* renamed from: c  reason: collision with root package name */
        private b5.o<String> f14608c;

        /* renamed from: d  reason: collision with root package name */
        private String f14609d;

        /* renamed from: g  reason: collision with root package name */
        private boolean f14612g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f14613h;

        /* renamed from: a  reason: collision with root package name */
        private final d0 f14606a = new d0();

        /* renamed from: e  reason: collision with root package name */
        private int f14610e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f14611f = 8000;

        @Override // o3.l.a
        /* renamed from: b */
        public u a() {
            u uVar = new u(this.f14609d, this.f14610e, this.f14611f, this.f14612g, this.f14606a, this.f14608c, this.f14613h);
            p0 p0Var = this.f14607b;
            if (p0Var != null) {
                uVar.h(p0Var);
            }
            return uVar;
        }

        public b c(boolean z10) {
            this.f14612g = z10;
            return this;
        }

        public final b d(Map<String, String> map) {
            this.f14606a.a(map);
            return this;
        }

        public b e(String str) {
            this.f14609d = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends com.google.common.collect.l<String, List<String>> {

        /* renamed from: j  reason: collision with root package name */
        private final Map<String, List<String>> f14614j;

        public c(Map<String, List<String>> map) {
            this.f14614j = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.m
        /* renamed from: b */
        public Map<String, List<String>> a() {
            return this.f14614j;
        }

        @Override // com.google.common.collect.l, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.l, java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // com.google.common.collect.l, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return com.google.common.collect.p0.b(super.entrySet(), new b5.o() { // from class: o3.w
                @Override // b5.o
                public final boolean apply(Object obj) {
                    boolean i10;
                    i10 = u.c.i((Map.Entry) obj);
                    return i10;
                }
            });
        }

        @Override // com.google.common.collect.l, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // com.google.common.collect.l, java.util.Map
        /* renamed from: h */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.l, java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // com.google.common.collect.l, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.l, java.util.Map
        public Set<String> keySet() {
            return com.google.common.collect.p0.b(super.keySet(), new b5.o() { // from class: o3.v
                @Override // b5.o
                public final boolean apply(Object obj) {
                    boolean j10;
                    j10 = u.c.j((String) obj);
                    return j10;
                }
            });
        }

        @Override // com.google.common.collect.l, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private u(String str, int i10, int i11, boolean z10, d0 d0Var, b5.o<String> oVar, boolean z11) {
        super(true);
        this.f14594h = str;
        this.f14592f = i10;
        this.f14593g = i11;
        this.f14591e = z10;
        this.f14595i = d0Var;
        this.f14598l = oVar;
        this.f14596j = new d0();
        this.f14597k = z11;
    }

    private int B(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14604r;
        if (j10 != -1) {
            long j11 = j10 - this.f14605s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) p3.n0.j(this.f14601o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f14605s += read;
        q(read);
        return read;
    }

    private void C(long j10, p pVar) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) p3.n0.j(this.f14601o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new a0(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (read == -1) {
                throw new a0(pVar, 2008, 1);
            }
            j10 -= read;
            q(read);
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.f14600n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p3.r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f14600n = null;
        }
    }

    private URL v(URL url, String str, p pVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new a0("Unsupported protocol redirect: " + protocol, pVar, 2001, 1);
                } else if (this.f14591e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new a0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new a0(e10, pVar, 2001, 1);
            }
        }
        throw new a0("Null location redirect", pVar, 2001, 1);
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.f14592f);
        A.setReadTimeout(this.f14593g);
        HashMap hashMap = new HashMap();
        d0 d0Var = this.f14595i;
        if (d0Var != null) {
            hashMap.putAll(d0Var.b());
        }
        hashMap.putAll(this.f14596j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = e0.a(j10, j11);
        if (a10 != null) {
            A.setRequestProperty("Range", a10);
        }
        String str = this.f14594h;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z11);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(p.c(i10));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection y(o3.p r27) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.u.y(o3.p):java.net.HttpURLConnection");
    }

    private static void z(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = p3.n0.f15397a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) p3.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    HttpURLConnection A(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // o3.l
    public void close() {
        try {
            InputStream inputStream = this.f14601o;
            if (inputStream != null) {
                long j10 = this.f14604r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f14605s;
                }
                z(this.f14600n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new a0(e10, (p) p3.n0.j(this.f14599m), 2000, 3);
                }
            }
        } finally {
            this.f14601o = null;
            u();
            if (this.f14602p) {
                this.f14602p = false;
                r();
            }
        }
    }

    @Override // o3.g, o3.l
    public Map<String, List<String>> e() {
        HttpURLConnection httpURLConnection = this.f14600n;
        return httpURLConnection == null ? com.google.common.collect.r.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // o3.l
    public Uri j() {
        HttpURLConnection httpURLConnection = this.f14600n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // o3.l
    public long m(p pVar) {
        byte[] bArr;
        this.f14599m = pVar;
        long j10 = 0;
        this.f14605s = 0L;
        this.f14604r = 0L;
        s(pVar);
        try {
            HttpURLConnection y10 = y(pVar);
            this.f14600n = y10;
            this.f14603q = y10.getResponseCode();
            String responseMessage = y10.getResponseMessage();
            int i10 = this.f14603q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = y10.getHeaderFields();
                if (this.f14603q == 416) {
                    if (pVar.f14518g == e0.c(y10.getHeaderField("Content-Range"))) {
                        this.f14602p = true;
                        t(pVar);
                        long j11 = pVar.f14519h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = y10.getErrorStream();
                try {
                    bArr = errorStream != null ? p3.n0.U0(errorStream) : p3.n0.f15402f;
                } catch (IOException unused) {
                    bArr = p3.n0.f15402f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new c0(this.f14603q, responseMessage, this.f14603q == 416 ? new m(2008) : null, headerFields, pVar, bArr2);
            }
            String contentType = y10.getContentType();
            b5.o<String> oVar = this.f14598l;
            if (oVar != null && !oVar.apply(contentType)) {
                u();
                throw new b0(contentType, pVar);
            }
            if (this.f14603q == 200) {
                long j12 = pVar.f14518g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean w10 = w(y10);
            if (w10) {
                this.f14604r = pVar.f14519h;
            } else {
                long j13 = pVar.f14519h;
                if (j13 != -1) {
                    this.f14604r = j13;
                } else {
                    long b10 = e0.b(y10.getHeaderField("Content-Length"), y10.getHeaderField("Content-Range"));
                    this.f14604r = b10 != -1 ? b10 - j10 : -1L;
                }
            }
            try {
                this.f14601o = y10.getInputStream();
                if (w10) {
                    this.f14601o = new GZIPInputStream(this.f14601o);
                }
                this.f14602p = true;
                t(pVar);
                try {
                    C(j10, pVar);
                    return this.f14604r;
                } catch (IOException e10) {
                    u();
                    if (e10 instanceof a0) {
                        throw ((a0) e10);
                    }
                    throw new a0(e10, pVar, 2000, 1);
                }
            } catch (IOException e11) {
                u();
                throw new a0(e11, pVar, 2000, 1);
            }
        } catch (IOException e12) {
            u();
            throw a0.c(e12, pVar, 1);
        }
    }

    @Override // o3.i
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return B(bArr, i10, i11);
        } catch (IOException e10) {
            throw a0.c(e10, (p) p3.n0.j(this.f14599m), 2);
        }
    }
}
