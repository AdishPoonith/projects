package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.x;
/* loaded from: classes.dex */
public final class y extends com.google.protobuf.z<y, b> implements w0 {
    private static final y DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile f1<y> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7918a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7918a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7918a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7918a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7918a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7918a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7918a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7918a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<y, b> implements w0 {
        private b() {
            super(y.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(c cVar) {
            z();
            ((y) this.f7405k).l0(cVar);
            return this;
        }

        public b I(d dVar) {
            z();
            ((y) this.f7405k).m0(dVar);
            return this;
        }

        public b J(t1 t1Var) {
            z();
            ((y) this.f7405k).n0(t1Var);
            return this;
        }

        public b K(com.google.protobuf.i iVar) {
            z();
            ((y) this.f7405k).o0(iVar);
            return this;
        }

        public b L(int i10) {
            z();
            ((y) this.f7405k).p0(i10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.z<c, a> implements w0 {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private d0.i<String> documents_ = com.google.protobuf.z.H();

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(String str) {
                z();
                ((c) this.f7405k).g0(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.z.b0(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(String str) {
            str.getClass();
            h0();
            this.documents_.add(str);
        }

        private void h0() {
            d0.i<String> iVar = this.documents_;
            if (iVar.h()) {
                return;
            }
            this.documents_ = com.google.protobuf.z.R(iVar);
        }

        public static c i0() {
            return DEFAULT_INSTANCE;
        }

        public static a l0() {
            return DEFAULT_INSTANCE.B();
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7918a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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

        public String j0(int i10) {
            return this.documents_.get(i10);
        }

        public int k0() {
            return this.documents_.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.google.protobuf.z<d, a> implements w0 {
        private static final d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* loaded from: classes.dex */
        public static final class a extends z.a<d, a> implements w0 {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(String str) {
                z();
                ((d) this.f7405k).l0(str);
                return this;
            }

            public a I(x.b bVar) {
                z();
                ((d) this.f7405k).m0(bVar.b());
                return this;
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.z.b0(d.class, dVar);
        }

        private d() {
        }

        public static d h0() {
            return DEFAULT_INSTANCE;
        }

        public static a k0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(x xVar) {
            xVar.getClass();
            this.queryType_ = xVar;
            this.queryTypeCase_ = 2;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7918a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", x.class});
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

        public String i0() {
            return this.parent_;
        }

        public x j0() {
            return this.queryTypeCase_ == 2 ? (x) this.queryType_ : x.p0();
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.protobuf.z.b0(y.class, yVar);
    }

    private y() {
    }

    public static b k0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(t1 t1Var) {
        t1Var.getClass();
        this.resumeType_ = t1Var;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(com.google.protobuf.i iVar) {
        iVar.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(int i10) {
        this.targetId_ = i10;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7918a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", d.class, c.class, "targetId_", "once_", t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<y> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (y.class) {
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
