package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class o extends com.google.crypto.tink.shaded.protobuf.z<o, b> implements t0 {
    private static final o DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile a1<o> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18287a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18287a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18287a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18287a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18287a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18287a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18287a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18287a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<o, b> implements t0 {
        private b() {
            super(o.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(int i10) {
            v();
            ((o) this.f6436k).S(i10);
            return this;
        }
    }

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.crypto.tink.shaded.protobuf.z.L(o.class, oVar);
    }

    private o() {
    }

    public static b Q() {
        return DEFAULT_INSTANCE.t();
    }

    public static o R(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (o) com.google.crypto.tink.shaded.protobuf.z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10) {
        this.keySize_ = i10;
    }

    public int P() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f18287a[fVar.ordinal()]) {
            case 1:
                return new o();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<o> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (o.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
