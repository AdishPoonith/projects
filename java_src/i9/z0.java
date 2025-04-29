package i9;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class z0<ReqT, RespT> {

    /* renamed from: a  reason: collision with root package name */
    private final d f10089a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10090b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10091c;

    /* renamed from: d  reason: collision with root package name */
    private final c<ReqT> f10092d;

    /* renamed from: e  reason: collision with root package name */
    private final c<RespT> f10093e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f10094f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10095g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10096h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f10097i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReferenceArray<Object> f10098j;

    /* loaded from: classes.dex */
    public static final class b<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private c<ReqT> f10099a;

        /* renamed from: b  reason: collision with root package name */
        private c<RespT> f10100b;

        /* renamed from: c  reason: collision with root package name */
        private d f10101c;

        /* renamed from: d  reason: collision with root package name */
        private String f10102d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10103e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f10104f;

        /* renamed from: g  reason: collision with root package name */
        private Object f10105g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f10106h;

        private b() {
        }

        public z0<ReqT, RespT> a() {
            return new z0<>(this.f10101c, this.f10102d, this.f10099a, this.f10100b, this.f10105g, this.f10103e, this.f10104f, this.f10106h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f10102d = str;
            return this;
        }

        public b<ReqT, RespT> c(c<ReqT> cVar) {
            this.f10099a = cVar;
            return this;
        }

        public b<ReqT, RespT> d(c<RespT> cVar) {
            this.f10100b = cVar;
            return this;
        }

        public b<ReqT, RespT> e(boolean z10) {
            this.f10106h = z10;
            return this;
        }

        public b<ReqT, RespT> f(d dVar) {
            this.f10101c = dVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        InputStream a(T t10);

        T b(InputStream inputStream);
    }

    /* loaded from: classes.dex */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean b() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    private z0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f10098j = new AtomicReferenceArray<>(2);
        this.f10089a = (d) b5.n.o(dVar, "type");
        this.f10090b = (String) b5.n.o(str, "fullMethodName");
        this.f10091c = a(str);
        this.f10092d = (c) b5.n.o(cVar, "requestMarshaller");
        this.f10093e = (c) b5.n.o(cVar2, "responseMarshaller");
        this.f10094f = obj;
        this.f10095g = z10;
        this.f10096h = z11;
        this.f10097i = z12;
    }

    public static String a(String str) {
        int lastIndexOf = ((String) b5.n.o(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) b5.n.o(str, "fullServiceName")) + "/" + ((String) b5.n.o(str2, "methodName"));
    }

    public static <ReqT, RespT> b<ReqT, RespT> g() {
        return h(null, null);
    }

    public static <ReqT, RespT> b<ReqT, RespT> h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f10090b;
    }

    public String d() {
        return this.f10091c;
    }

    public d e() {
        return this.f10089a;
    }

    public boolean f() {
        return this.f10096h;
    }

    public RespT i(InputStream inputStream) {
        return this.f10093e.b(inputStream);
    }

    public InputStream j(ReqT reqt) {
        return this.f10092d.a(reqt);
    }

    public String toString() {
        return b5.h.c(this).d("fullMethodName", this.f10090b).d("type", this.f10089a).e("idempotent", this.f10095g).e("safe", this.f10096h).e("sampledToLocalTracing", this.f10097i).d("requestMarshaller", this.f10092d).d("responseMarshaller", this.f10093e).d("schemaDescriptor", this.f10094f).k().toString();
    }
}
