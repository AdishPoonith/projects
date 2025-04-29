package d7;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
/* loaded from: classes.dex */
public final class r extends com.google.protobuf.z<r, b> implements w0 {
    private static final r DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile f1<r> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7853a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7853a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7853a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7853a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7853a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7853a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7853a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7853a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<r, b> implements w0 {
        private b() {
            super(r.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f7861j;

        c(int i10) {
            this.f7861j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    return null;
                                }
                                return DOCUMENT_REMOVE;
                            }
                            return FILTER;
                        }
                        return DOCUMENT_DELETE;
                    }
                    return DOCUMENT_CHANGE;
                }
                return TARGET_CHANGE;
            }
            return RESPONSETYPE_NOT_SET;
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.protobuf.z.b0(r.class, rVar);
    }

    private r() {
    }

    public static r f0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7853a[fVar.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", z.class, j.class, k.class, o.class, m.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<r> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (r.class) {
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

    public j g0() {
        return this.responseTypeCase_ == 3 ? (j) this.responseType_ : j.f0();
    }

    public k h0() {
        return this.responseTypeCase_ == 4 ? (k) this.responseType_ : k.f0();
    }

    public m i0() {
        return this.responseTypeCase_ == 6 ? (m) this.responseType_ : m.f0();
    }

    public o j0() {
        return this.responseTypeCase_ == 5 ? (o) this.responseType_ : o.g0();
    }

    public c k0() {
        return c.b(this.responseTypeCase_);
    }

    public z l0() {
        return this.responseTypeCase_ == 2 ? (z) this.responseType_ : z.g0();
    }
}
