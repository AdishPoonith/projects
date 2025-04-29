package d7;

import com.google.protobuf.e1;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.b;
import d7.s;
import h7.a;
/* loaded from: classes.dex */
public final class b0 extends com.google.protobuf.z<b0, b> implements w0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final b0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile f1<b0> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7786a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7786a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7786a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7786a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7786a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7786a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7786a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7786a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<b0, b> implements w0 {
        private b() {
            super(b0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public s H() {
            return ((b0) this.f7405k).x0();
        }

        public b I(b.C0121b c0121b) {
            z();
            ((b0) this.f7405k).D0(c0121b.b());
            return this;
        }

        public b J(d7.b bVar) {
            z();
            ((b0) this.f7405k).D0(bVar);
            return this;
        }

        public b K(boolean z10) {
            z();
            ((b0) this.f7405k).E0(z10);
            return this;
        }

        public b L(com.google.protobuf.i iVar) {
            z();
            ((b0) this.f7405k).F0(iVar);
            return this;
        }

        public b M(double d10) {
            z();
            ((b0) this.f7405k).G0(d10);
            return this;
        }

        public b N(a.b bVar) {
            z();
            ((b0) this.f7405k).H0(bVar.b());
            return this;
        }

        public b O(long j10) {
            z();
            ((b0) this.f7405k).I0(j10);
            return this;
        }

        public b P(s.b bVar) {
            z();
            ((b0) this.f7405k).J0(bVar.b());
            return this;
        }

        public b Q(s sVar) {
            z();
            ((b0) this.f7405k).J0(sVar);
            return this;
        }

        public b R(e1 e1Var) {
            z();
            ((b0) this.f7405k).K0(e1Var);
            return this;
        }

        public b S(String str) {
            z();
            ((b0) this.f7405k).L0(str);
            return this;
        }

        public b T(String str) {
            z();
            ((b0) this.f7405k).M0(str);
            return this;
        }

        public b U(t1.b bVar) {
            z();
            ((b0) this.f7405k).N0(bVar.b());
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f7800j;

        c(int i10) {
            this.f7800j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    if (i10 != 17) {
                                        if (i10 != 18) {
                                            switch (i10) {
                                                case 8:
                                                    return GEO_POINT_VALUE;
                                                case 9:
                                                    return ARRAY_VALUE;
                                                case 10:
                                                    return TIMESTAMP_VALUE;
                                                case 11:
                                                    return NULL_VALUE;
                                                default:
                                                    return null;
                                            }
                                        }
                                        return BYTES_VALUE;
                                    }
                                    return STRING_VALUE;
                                }
                                return MAP_VALUE;
                            }
                            return REFERENCE_VALUE;
                        }
                        return DOUBLE_VALUE;
                    }
                    return INTEGER_VALUE;
                }
                return BOOLEAN_VALUE;
            }
            return VALUETYPE_NOT_SET;
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        com.google.protobuf.z.b0(b0.class, b0Var);
    }

    private b0() {
    }

    public static b C0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(d7.b bVar) {
        bVar.getClass();
        this.valueType_ = bVar;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(boolean z10) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(com.google.protobuf.i iVar) {
        iVar.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(double d10) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(h7.a aVar) {
        aVar.getClass();
        this.valueType_ = aVar;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(long j10) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(s sVar) {
        sVar.getClass();
        this.valueType_ = sVar;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(e1 e1Var) {
        this.valueType_ = Integer.valueOf(e1Var.a());
        this.valueTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(t1 t1Var) {
        t1Var.getClass();
        this.valueType_ = t1Var;
        this.valueTypeCase_ = 10;
    }

    public static b0 t0() {
        return DEFAULT_INSTANCE;
    }

    public t1 A0() {
        return this.valueTypeCase_ == 10 ? (t1) this.valueType_ : t1.h0();
    }

    public c B0() {
        return c.b(this.valueTypeCase_);
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7786a[fVar.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", s.class, h7.a.class, d7.b.class, t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b0.class) {
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

    public d7.b q0() {
        return this.valueTypeCase_ == 9 ? (d7.b) this.valueType_ : d7.b.l0();
    }

    public boolean r0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public com.google.protobuf.i s0() {
        return this.valueTypeCase_ == 18 ? (com.google.protobuf.i) this.valueType_ : com.google.protobuf.i.f7143k;
    }

    public double u0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public h7.a v0() {
        return this.valueTypeCase_ == 8 ? (h7.a) this.valueType_ : h7.a.h0();
    }

    public long w0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public s x0() {
        return this.valueTypeCase_ == 6 ? (s) this.valueType_ : s.g0();
    }

    public String y0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public String z0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }
}
