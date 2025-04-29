package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.b;
import java.util.List;
/* loaded from: classes.dex */
public final class n extends com.google.protobuf.z<n, b> implements w0 {
    private static final n DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile f1<n> PARSER;
    private String document_ = "";
    private d0.i<c> fieldTransforms_ = com.google.protobuf.z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7829a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7829a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7829a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7829a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7829a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7829a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7829a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7829a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<n, b> implements w0 {
        private b() {
            super(n.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.z<c, a> implements w0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile f1<c> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(b.C0121b c0121b) {
                z();
                ((c) this.f7405k).r0(c0121b.b());
                return this;
            }

            public a I(String str) {
                z();
                ((c) this.f7405k).s0(str);
                return this;
            }

            public a J(b0 b0Var) {
                z();
                ((c) this.f7405k).t0(b0Var);
                return this;
            }

            public a K(b.C0121b c0121b) {
                z();
                ((c) this.f7405k).u0(c0121b.b());
                return this;
            }

            public a L(b bVar) {
                z();
                ((c) this.f7405k).v0(bVar);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b implements d0.c {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: n  reason: collision with root package name */
            private static final d0.d<b> f7833n = new a();

            /* renamed from: j  reason: collision with root package name */
            private final int f7835j;

            /* loaded from: classes.dex */
            class a implements d0.d<b> {
                a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public b a(int i10) {
                    return b.b(i10);
                }
            }

            b(int i10) {
                this.f7835j = i10;
            }

            public static b b(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return REQUEST_TIME;
                }
                return SERVER_VALUE_UNSPECIFIED;
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7835j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: d7.n$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0122c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);
            

            /* renamed from: j  reason: collision with root package name */
            private final int f7844j;

            EnumC0122c(int i10) {
                this.f7844j = i10;
            }

            public static EnumC0122c b(int i10) {
                if (i10 != 0) {
                    switch (i10) {
                        case 2:
                            return SET_TO_SERVER_VALUE;
                        case 3:
                            return INCREMENT;
                        case 4:
                            return MAXIMUM;
                        case 5:
                            return MINIMUM;
                        case 6:
                            return APPEND_MISSING_ELEMENTS;
                        case 7:
                            return REMOVE_ALL_FROM_ARRAY;
                        default:
                            return null;
                    }
                }
                return TRANSFORMTYPE_NOT_SET;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.z.b0(c.class, cVar);
        }

        private c() {
        }

        public static a q0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r0(d7.b bVar) {
            bVar.getClass();
            this.transformType_ = bVar;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t0(b0 b0Var) {
            b0Var.getClass();
            this.transformType_ = b0Var;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u0(d7.b bVar) {
            bVar.getClass();
            this.transformType_ = bVar;
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.a());
            this.transformTypeCase_ = 2;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7829a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", b0.class, b0.class, b0.class, d7.b.class, d7.b.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<c> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (c.class) {
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

        public d7.b k0() {
            return this.transformTypeCase_ == 6 ? (d7.b) this.transformType_ : d7.b.l0();
        }

        public String l0() {
            return this.fieldPath_;
        }

        public b0 m0() {
            return this.transformTypeCase_ == 3 ? (b0) this.transformType_ : b0.t0();
        }

        public d7.b n0() {
            return this.transformTypeCase_ == 7 ? (d7.b) this.transformType_ : d7.b.l0();
        }

        public b o0() {
            if (this.transformTypeCase_ == 2) {
                b b10 = b.b(((Integer) this.transformType_).intValue());
                return b10 == null ? b.UNRECOGNIZED : b10;
            }
            return b.SERVER_VALUE_UNSPECIFIED;
        }

        public EnumC0122c p0() {
            return EnumC0122c.b(this.transformTypeCase_);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.protobuf.z.b0(n.class, nVar);
    }

    private n() {
    }

    public static n f0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7829a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<n> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (n.class) {
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

    public List<c> g0() {
        return this.fieldTransforms_;
    }
}
