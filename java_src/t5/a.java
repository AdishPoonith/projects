package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class a extends com.google.crypto.tink.shaded.protobuf.z<a, b> implements t0 {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile a1<a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.f6190k;
    private c params_;
    private int version_;

    /* renamed from: t5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0260a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18253a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18253a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18253a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18253a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18253a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18253a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18253a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18253a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<a, b> implements t0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0260a c0260a) {
            this();
        }

        public b B(com.google.crypto.tink.shaded.protobuf.i iVar) {
            v();
            ((a) this.f6436k).W(iVar);
            return this;
        }

        public b C(c cVar) {
            v();
            ((a) this.f6436k).X(cVar);
            return this;
        }

        public b D(int i10) {
            v();
            ((a) this.f6436k).Y(i10);
            return this;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.crypto.tink.shaded.protobuf.z.L(a.class, aVar);
    }

    private a() {
    }

    public static b U() {
        return DEFAULT_INSTANCE.t();
    }

    public static a V(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (a) com.google.crypto.tink.shaded.protobuf.z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(com.google.crypto.tink.shaded.protobuf.i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(c cVar) {
        cVar.getClass();
        this.params_ = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i10) {
        this.version_ = i10;
    }

    public com.google.crypto.tink.shaded.protobuf.i R() {
        return this.keyValue_;
    }

    public c S() {
        c cVar = this.params_;
        return cVar == null ? c.P() : cVar;
    }

    public int T() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (C0260a.f18253a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<a> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (a.class) {
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
