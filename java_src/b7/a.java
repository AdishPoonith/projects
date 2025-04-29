package b7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends z<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private d0.i<c> fields_ = z.H();

    /* renamed from: b7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0062a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3066a;

        static {
            int[] iArr = new int[z.f.values().length];
            f3066a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3066a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3066a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3066a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3066a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3066a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3066a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0062a c0062a) {
            this();
        }

        public b H(c.b bVar) {
            z();
            ((a) this.f7405k).h0(bVar.b());
            return this;
        }

        public b I(d dVar) {
            z();
            ((a) this.f7405k).m0(dVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends z<c, b> implements w0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* renamed from: b7.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0063a implements d0.c {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);
            

            /* renamed from: n  reason: collision with root package name */
            private static final d0.d<EnumC0063a> f3070n = new C0064a();

            /* renamed from: j  reason: collision with root package name */
            private final int f3072j;

            /* renamed from: b7.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0064a implements d0.d<EnumC0063a> {
                C0064a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public EnumC0063a a(int i10) {
                    return EnumC0063a.b(i10);
                }
            }

            EnumC0063a(int i10) {
                this.f3072j = i10;
            }

            public static EnumC0063a b(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return CONTAINS;
                }
                return ARRAY_CONFIG_UNSPECIFIED;
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f3072j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends z.a<c, b> implements w0 {
            private b() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ b(C0062a c0062a) {
                this();
            }

            public b H(EnumC0063a enumC0063a) {
                z();
                ((c) this.f7405k).m0(enumC0063a);
                return this;
            }

            public b I(String str) {
                z();
                ((c) this.f7405k).n0(str);
                return this;
            }

            public b J(EnumC0065c enumC0065c) {
                z();
                ((c) this.f7405k).o0(enumC0065c);
                return this;
            }
        }

        /* renamed from: b7.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0065c implements d0.c {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: o  reason: collision with root package name */
            private static final d0.d<EnumC0065c> f3077o = new C0066a();

            /* renamed from: j  reason: collision with root package name */
            private final int f3079j;

            /* renamed from: b7.a$c$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0066a implements d0.d<EnumC0065c> {
                C0066a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public EnumC0065c a(int i10) {
                    return EnumC0065c.b(i10);
                }
            }

            EnumC0065c(int i10) {
                this.f3079j = i10;
            }

            public static EnumC0065c b(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return DESCENDING;
                    }
                    return ASCENDING;
                }
                return ORDER_UNSPECIFIED;
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f3079j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* loaded from: classes.dex */
        public enum d {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);
            

            /* renamed from: j  reason: collision with root package name */
            private final int f3084j;

            d(int i10) {
                this.f3084j = i10;
            }

            public static d b(int i10) {
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return ARRAY_CONFIG;
                    }
                    return ORDER;
                }
                return VALUEMODE_NOT_SET;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            z.b0(c.class, cVar);
        }

        private c() {
        }

        public static b l0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(EnumC0063a enumC0063a) {
            this.valueMode_ = Integer.valueOf(enumC0063a.a());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o0(EnumC0065c enumC0065c) {
            this.valueMode_ = Integer.valueOf(enumC0065c.a());
            this.valueModeCase_ = 2;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (C0062a.f3066a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new b(null);
                case 3:
                    return z.T(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
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

        public String i0() {
            return this.fieldPath_;
        }

        public EnumC0065c j0() {
            if (this.valueModeCase_ == 2) {
                EnumC0065c b10 = EnumC0065c.b(((Integer) this.valueMode_).intValue());
                return b10 == null ? EnumC0065c.UNRECOGNIZED : b10;
            }
            return EnumC0065c.ORDER_UNSPECIFIED;
        }

        public d k0() {
            return d.b(this.valueModeCase_);
        }
    }

    /* loaded from: classes.dex */
    public enum d implements d0.c {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: o  reason: collision with root package name */
        private static final d0.d<d> f3089o = new C0067a();

        /* renamed from: j  reason: collision with root package name */
        private final int f3091j;

        /* renamed from: b7.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0067a implements d0.d<d> {
            C0067a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        d(int i10) {
            this.f3091j = i10;
        }

        public static d b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return COLLECTION_GROUP;
                }
                return COLLECTION;
            }
            return QUERY_SCOPE_UNSPECIFIED;
        }

        @Override // com.google.protobuf.d0.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f3091j;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(c cVar) {
        cVar.getClass();
        i0();
        this.fields_.add(cVar);
    }

    private void i0() {
        d0.i<c> iVar = this.fields_;
        if (iVar.h()) {
            return;
        }
        this.fields_ = z.R(iVar);
    }

    public static b k0() {
        return DEFAULT_INSTANCE.B();
    }

    public static a l0(byte[] bArr) {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(d dVar) {
        this.queryScope_ = dVar.a();
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (C0062a.f3066a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
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

    public List<c> j0() {
        return this.fields_;
    }
}
