package h7;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
/* loaded from: classes.dex */
public final class a extends z<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile f1<a> PARSER;
    private double latitude_;
    private double longitude_;

    /* renamed from: h7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0153a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9530a;

        static {
            int[] iArr = new int[z.f.values().length];
            f9530a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9530a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9530a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9530a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9530a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9530a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9530a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0153a c0153a) {
            this();
        }

        public b H(double d10) {
            z();
            ((a) this.f7405k).l0(d10);
            return this;
        }

        public b I(double d10) {
            z();
            ((a) this.f7405k).m0(d10);
            return this;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        z.b0(a.class, aVar);
    }

    private a() {
    }

    public static a h0() {
        return DEFAULT_INSTANCE;
    }

    public static b k0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(double d10) {
        this.latitude_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(double d10) {
        this.longitude_ = d10;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (C0153a.f9530a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
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

    public double i0() {
        return this.latitude_;
    }

    public double j0() {
        return this.longitude_;
    }
}
