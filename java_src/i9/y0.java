package i9;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f10073c = Logger.getLogger(y0.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final e<byte[]> f10074d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final d<String> f10075e = new b();

    /* renamed from: f  reason: collision with root package name */
    static final c5.a f10076f = c5.a.a().k();

    /* renamed from: a  reason: collision with root package name */
    private Object[] f10077a;

    /* renamed from: b  reason: collision with root package name */
    private int f10078b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e<byte[]> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    class b implements d<String> {
        b() {
        }

        @Override // i9.y0.d
        /* renamed from: c */
        public String b(String str) {
            return str;
        }

        @Override // i9.y0.d
        /* renamed from: d */
        public String a(String str) {
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<T> extends g<T> {

        /* renamed from: f  reason: collision with root package name */
        private final d<T> f10079f;

        private c(String str, boolean z10, d<T> dVar) {
            super(str, z10, dVar, null);
            b5.n.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f10079f = (d) b5.n.o(dVar, "marshaller");
        }

        /* synthetic */ c(String str, boolean z10, d dVar, a aVar) {
            this(str, z10, dVar);
        }

        @Override // i9.y0.g
        T h(byte[] bArr) {
            return this.f10079f.b(new String(bArr, b5.d.f2948a));
        }

        @Override // i9.y0.g
        byte[] j(T t10) {
            return this.f10079f.a(t10).getBytes(b5.d.f2948a);
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        String a(T t10);

        T b(String str);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
    }

    /* loaded from: classes.dex */
    public interface f<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    /* loaded from: classes.dex */
    public static abstract class g<T> {

        /* renamed from: e  reason: collision with root package name */
        private static final BitSet f10080e = b();

        /* renamed from: a  reason: collision with root package name */
        private final String f10081a;

        /* renamed from: b  reason: collision with root package name */
        private final String f10082b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f10083c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f10084d;

        private g(String str, boolean z10, Object obj) {
            String str2 = (String) b5.n.o(str, "name");
            this.f10081a = str2;
            String k10 = k(str2.toLowerCase(Locale.ROOT), z10);
            this.f10082b = k10;
            this.f10083c = k10.getBytes(b5.d.f2948a);
            this.f10084d = obj;
        }

        /* synthetic */ g(String str, boolean z10, Object obj, a aVar) {
            this(str, z10, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            return bitSet;
        }

        public static <T> g<T> e(String str, d<T> dVar) {
            return f(str, false, dVar);
        }

        static <T> g<T> f(String str, boolean z10, d<T> dVar) {
            return new c(str, z10, dVar, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static <T> g<T> g(String str, boolean z10, j<T> jVar) {
            return new i(str, z10, jVar, null);
        }

        private static String k(String str, boolean z10) {
            b5.n.o(str, "name");
            b5.n.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                y0.f10073c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!z10 || charAt != ':' || i10 != 0) {
                    b5.n.g(f10080e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f10083c;
        }

        final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f10084d)) {
                return cls.cast(this.f10084d);
            }
            return null;
        }

        public final String d() {
            return this.f10082b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f10082b.equals(((g) obj).f10082b);
        }

        abstract T h(byte[] bArr);

        public final int hashCode() {
            return this.f10082b.hashCode();
        }

        boolean i() {
            return false;
        }

        abstract byte[] j(T t10);

        public String toString() {
            return "Key{name='" + this.f10082b + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f<T> f10085a;

        /* renamed from: b  reason: collision with root package name */
        private final T f10086b;

        /* renamed from: c  reason: collision with root package name */
        private volatile byte[] f10087c;

        h(f<T> fVar, T t10) {
            this.f10085a = fVar;
            this.f10086b = t10;
        }

        static <T> h<T> a(g<T> gVar, T t10) {
            return new h<>((f) b5.n.n(b(gVar)), t10);
        }

        private static <T> f<T> b(g<T> gVar) {
            return (f) gVar.c(f.class);
        }

        byte[] c() {
            if (this.f10087c == null) {
                synchronized (this) {
                    if (this.f10087c == null) {
                        this.f10087c = y0.r(e());
                    }
                }
            }
            return this.f10087c;
        }

        <T2> T2 d(g<T2> gVar) {
            f b10;
            return (!gVar.i() || (b10 = b(gVar)) == null) ? gVar.h(c()) : (T2) b10.b(e());
        }

        InputStream e() {
            return this.f10085a.a(this.f10086b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i<T> extends g<T> {

        /* renamed from: f  reason: collision with root package name */
        private final j<T> f10088f;

        private i(String str, boolean z10, j<T> jVar) {
            super(str, z10, jVar, null);
            b5.n.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f10088f = (j) b5.n.o(jVar, "marshaller");
        }

        /* synthetic */ i(String str, boolean z10, j jVar, a aVar) {
            this(str, z10, jVar);
        }

        @Override // i9.y0.g
        T h(byte[] bArr) {
            return this.f10088f.b(bArr);
        }

        @Override // i9.y0.g
        byte[] j(T t10) {
            return this.f10088f.a(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j<T> {
        byte[] a(T t10);

        T b(byte[] bArr);
    }

    public y0() {
    }

    y0(int i10, Object[] objArr) {
        this.f10078b = i10;
        this.f10077a = objArr;
    }

    y0(int i10, byte[]... bArr) {
        this(i10, (Object[]) bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f10077a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i10) {
        Object[] objArr = new Object[i10];
        if (!i()) {
            System.arraycopy(this.f10077a, 0, objArr, 0, k());
        }
        this.f10077a = objArr;
    }

    private boolean i() {
        return this.f10078b == 0;
    }

    private int k() {
        return this.f10078b * 2;
    }

    private void l() {
        if (k() == 0 || k() == d()) {
            f(Math.max(k() * 2, 8));
        }
    }

    private void n(int i10, byte[] bArr) {
        this.f10077a[i10 * 2] = bArr;
    }

    private byte[] o(int i10) {
        return (byte[]) this.f10077a[i10 * 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(InputStream inputStream) {
        try {
            return c5.b.d(inputStream);
        } catch (IOException e10) {
            throw new RuntimeException("failure reading serialized stream", e10);
        }
    }

    private Object s(int i10) {
        return this.f10077a[(i10 * 2) + 1];
    }

    private void t(int i10, Object obj) {
        if (this.f10077a instanceof byte[][]) {
            f(d());
        }
        this.f10077a[(i10 * 2) + 1] = obj;
    }

    private void u(int i10, byte[] bArr) {
        this.f10077a[(i10 * 2) + 1] = bArr;
    }

    private byte[] v(int i10) {
        Object s10 = s(i10);
        return s10 instanceof byte[] ? (byte[]) s10 : ((h) s10).c();
    }

    private <T> T w(int i10, g<T> gVar) {
        Object s10 = s(i10);
        return s10 instanceof byte[] ? gVar.h((byte[]) s10) : (T) ((h) s10).d(gVar);
    }

    public <T> void e(g<T> gVar) {
        if (i()) {
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10078b; i11++) {
            if (!c(gVar.a(), o(i11))) {
                n(i10, o(i11));
                t(i10, s(i11));
                i10++;
            }
        }
        Arrays.fill(this.f10077a, i10 * 2, k(), (Object) null);
        this.f10078b = i10;
    }

    public <T> T g(g<T> gVar) {
        for (int i10 = this.f10078b - 1; i10 >= 0; i10--) {
            if (c(gVar.a(), o(i10))) {
                return (T) w(i10, gVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f10078b;
    }

    public Set<String> j() {
        if (i()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f10078b);
        for (int i10 = 0; i10 < this.f10078b; i10++) {
            hashSet.add(new String(o(i10), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void m(y0 y0Var) {
        if (y0Var.i()) {
            return;
        }
        int d10 = d() - k();
        if (i() || d10 < y0Var.k()) {
            f(k() + y0Var.k());
        }
        System.arraycopy(y0Var.f10077a, 0, this.f10077a, k(), y0Var.k());
        this.f10078b += y0Var.f10078b;
    }

    public <T> void p(g<T> gVar, T t10) {
        b5.n.o(gVar, "key");
        b5.n.o(t10, "value");
        l();
        n(this.f10078b, gVar.a());
        if (gVar.i()) {
            t(this.f10078b, h.a(gVar, t10));
        } else {
            u(this.f10078b, gVar.j(t10));
        }
        this.f10078b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[][] q() {
        byte[][] bArr = new byte[k()];
        Object[] objArr = this.f10077a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, k());
        } else {
            for (int i10 = 0; i10 < this.f10078b; i10++) {
                int i11 = i10 * 2;
                bArr[i11] = o(i10);
                bArr[i11 + 1] = v(i10);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f10078b; i10++) {
            if (i10 != 0) {
                sb.append(',');
            }
            byte[] o10 = o(i10);
            Charset charset = b5.d.f2948a;
            String str = new String(o10, charset);
            sb.append(str);
            sb.append('=');
            sb.append(str.endsWith("-bin") ? f10076f.e(v(i10)) : new String(v(i10), charset));
        }
        sb.append(')');
        return sb.toString();
    }
}
