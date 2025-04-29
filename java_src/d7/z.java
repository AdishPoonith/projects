package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.List;
/* loaded from: classes.dex */
public final class z extends com.google.protobuf.z<z, b> implements w0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final z DEFAULT_INSTANCE;
    private static volatile f1<z> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private g7.a cause_;
    private t1 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private d0.g targetIds_ = com.google.protobuf.z.G();
    private com.google.protobuf.i resumeToken_ = com.google.protobuf.i.f7143k;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7919a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7919a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7919a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7919a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7919a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7919a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7919a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7919a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<z, b> implements w0 {
        private b() {
            super(z.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum c implements d0.c {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: q  reason: collision with root package name */
        private static final d0.d<c> f7926q = new a();

        /* renamed from: j  reason: collision with root package name */
        private final int f7928j;

        /* loaded from: classes.dex */
        class a implements d0.d<c> {
            a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        c(int i10) {
            this.f7928j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return null;
                            }
                            return RESET;
                        }
                        return CURRENT;
                    }
                    return REMOVE;
                }
                return ADD;
            }
            return NO_CHANGE;
        }

        @Override // com.google.protobuf.d0.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f7928j;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.protobuf.z.b0(z.class, zVar);
    }

    private z() {
    }

    public static z g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7919a[fVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<z> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (z.class) {
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

    public g7.a f0() {
        g7.a aVar = this.cause_;
        return aVar == null ? g7.a.g0() : aVar;
    }

    public t1 h0() {
        t1 t1Var = this.readTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public com.google.protobuf.i i0() {
        return this.resumeToken_;
    }

    public c j0() {
        c b10 = c.b(this.targetChangeType_);
        return b10 == null ? c.UNRECOGNIZED : b10;
    }

    public int k0() {
        return this.targetIds_.size();
    }

    public List<Integer> l0() {
        return this.targetIds_;
    }
}
