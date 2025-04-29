package c7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.x;
/* loaded from: classes.dex */
public final class a extends z<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0078a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3447a;

        static {
            int[] iArr = new int[z.f.values().length];
            f3447a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3447a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3447a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3447a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3447a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3447a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3447a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0078a c0078a) {
            this();
        }

        public b H(c cVar) {
            z();
            ((a) this.f7405k).n0(cVar);
            return this;
        }

        public b I(String str) {
            z();
            ((a) this.f7405k).o0(str);
            return this;
        }

        public b J(x xVar) {
            z();
            ((a) this.f7405k).p0(xVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements d0.c {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: n  reason: collision with root package name */
        private static final d0.d<c> f3451n = new C0079a();

        /* renamed from: j  reason: collision with root package name */
        private final int f3453j;

        /* renamed from: c7.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0079a implements d0.d<c> {
            C0079a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        c(int i10) {
            this.f3453j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return LAST;
            }
            return FIRST;
        }

        @Override // com.google.protobuf.d0.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f3453j;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        z.b0(a.class, aVar);
    }

    private a() {
    }

    public static b l0() {
        return DEFAULT_INSTANCE.B();
    }

    public static a m0(byte[] bArr) {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(c cVar) {
        this.limitType_ = cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(x xVar) {
        xVar.getClass();
        this.queryType_ = xVar;
        this.queryTypeCase_ = 2;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (C0078a.f3447a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", x.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c i0() {
        c b10 = c.b(this.limitType_);
        return b10 == null ? c.UNRECOGNIZED : b10;
    }

    public String j0() {
        return this.parent_;
    }

    public x k0() {
        return this.queryTypeCase_ == 2 ? (x) this.queryType_ : x.p0();
    }
}
