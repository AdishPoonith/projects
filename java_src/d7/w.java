package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.x;
/* loaded from: classes.dex */
public final class w extends com.google.protobuf.z<w, c> implements w0 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final w DEFAULT_INSTANCE;
    private static volatile f1<w> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private d0.i<b> aggregations_ = com.google.protobuf.z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7872a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7872a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7872a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7872a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7872a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7872a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7872a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7872a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.google.protobuf.z<b, C0124b> implements w0 {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        private static volatile f1<b> PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        /* loaded from: classes.dex */
        public static final class a extends com.google.protobuf.z<a, C0123a> implements w0 {
            private static final a DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f1<a> PARSER;
            private x.g field_;

            /* renamed from: d7.w$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0123a extends z.a<a, C0123a> implements w0 {
                private C0123a() {
                    super(a.DEFAULT_INSTANCE);
                }

                /* synthetic */ C0123a(a aVar) {
                    this();
                }
            }

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                com.google.protobuf.z.b0(a.class, aVar);
            }

            private a() {
            }

            @Override // com.google.protobuf.z
            protected final Object F(z.f fVar, Object obj, Object obj2) {
                switch (a.f7872a[fVar.ordinal()]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0123a(null);
                    case 3:
                        return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"field_"});
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
        }

        /* renamed from: d7.w$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0124b extends z.a<b, C0124b> implements w0 {
            private C0124b() {
                super(b.DEFAULT_INSTANCE);
            }

            /* synthetic */ C0124b(a aVar) {
                this();
            }

            public C0124b H(String str) {
                z();
                ((b) this.f7405k).i0(str);
                return this;
            }

            public C0124b I(c cVar) {
                z();
                ((b) this.f7405k).j0(cVar);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.google.protobuf.z<c, a> implements w0 {
            private static final c DEFAULT_INSTANCE;
            private static volatile f1<c> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private com.google.protobuf.b0 upTo_;

            /* loaded from: classes.dex */
            public static final class a extends z.a<c, a> implements w0 {
                private a() {
                    super(c.DEFAULT_INSTANCE);
                }

                /* synthetic */ a(a aVar) {
                    this();
                }
            }

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                com.google.protobuf.z.b0(c.class, cVar);
            }

            private c() {
            }

            public static c f0() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.z
            protected final Object F(z.f fVar, Object obj, Object obj2) {
                switch (a.f7872a[fVar.ordinal()]) {
                    case 1:
                        return new c();
                    case 2:
                        return new a(null);
                    case 3:
                        return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"upTo_"});
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
        }

        /* loaded from: classes.dex */
        public static final class d extends com.google.protobuf.z<d, a> implements w0 {
            private static final d DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile f1<d> PARSER;
            private x.g field_;

            /* loaded from: classes.dex */
            public static final class a extends z.a<d, a> implements w0 {
                private a() {
                    super(d.DEFAULT_INSTANCE);
                }

                /* synthetic */ a(a aVar) {
                    this();
                }
            }

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                com.google.protobuf.z.b0(d.class, dVar);
            }

            private d() {
            }

            @Override // com.google.protobuf.z
            protected final Object F(z.f fVar, Object obj, Object obj2) {
                switch (a.f7872a[fVar.ordinal()]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(null);
                    case 3:
                        return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        f1<d> f1Var = PARSER;
                        if (f1Var == null) {
                            synchronized (d.class) {
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
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            com.google.protobuf.z.b0(b.class, bVar);
        }

        private b() {
        }

        public static C0124b h0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(c cVar) {
            cVar.getClass();
            this.operator_ = cVar;
            this.operatorCase_ = 1;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7872a[fVar.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new C0124b(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", c.class, d.class, a.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<b> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (b.class) {
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
    }

    /* loaded from: classes.dex */
    public static final class c extends z.a<w, c> implements w0 {
        private c() {
            super(w.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public c H(Iterable<? extends b> iterable) {
            z();
            ((w) this.f7405k).h0(iterable);
            return this;
        }

        public c I(x xVar) {
            z();
            ((w) this.f7405k).k0(xVar);
            return this;
        }
    }

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.protobuf.z.b0(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(Iterable<? extends b> iterable) {
        i0();
        com.google.protobuf.a.k(iterable, this.aggregations_);
    }

    private void i0() {
        d0.i<b> iVar = this.aggregations_;
        if (iVar.h()) {
            return;
        }
        this.aggregations_ = com.google.protobuf.z.R(iVar);
    }

    public static c j0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(x xVar) {
        xVar.getClass();
        this.queryType_ = xVar;
        this.queryTypeCase_ = 1;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7872a[fVar.ordinal()]) {
            case 1:
                return new w();
            case 2:
                return new c(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", x.class, "aggregations_", b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<w> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (w.class) {
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
}
