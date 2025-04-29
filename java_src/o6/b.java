package o6;

import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
/* loaded from: classes.dex */
public final class b extends z<b, C0217b> implements w0 {
    private static final b DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<b> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private String name_ = "";
    private t1 readTime_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14685a;

        static {
            int[] iArr = new int[z.f.values().length];
            f14685a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14685a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14685a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14685a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14685a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14685a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14685a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: o6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0217b extends z.a<b, C0217b> implements w0 {
        private C0217b() {
            super(b.DEFAULT_INSTANCE);
        }

        /* synthetic */ C0217b(a aVar) {
            this();
        }

        public C0217b H(String str) {
            z();
            ((b) this.f7405k).l0(str);
            return this;
        }

        public C0217b I(t1 t1Var) {
            z();
            ((b) this.f7405k).m0(t1Var);
            return this;
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        z.b0(b.class, bVar);
    }

    private b() {
    }

    public static b h0() {
        return DEFAULT_INSTANCE;
    }

    public static C0217b k0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(t1 t1Var) {
        t1Var.getClass();
        this.readTime_ = t1Var;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f14685a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0217b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "readTime_"});
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

    public String i0() {
        return this.name_;
    }

    public t1 j0() {
        t1 t1Var = this.readTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }
}
