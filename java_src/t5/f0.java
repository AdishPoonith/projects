package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class f0 extends com.google.crypto.tink.shaded.protobuf.z<f0, b> implements t0 {
    private static final f0 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile a1<f0> PARSER;
    private String keyUri_ = "";

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18264a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18264a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18264a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18264a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18264a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18264a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18264a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18264a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<f0, b> implements t0 {
        private b() {
            super(f0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.crypto.tink.shaded.protobuf.z.L(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 O() {
        return DEFAULT_INSTANCE;
    }

    public static f0 Q(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (f0) com.google.crypto.tink.shaded.protobuf.z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    public String P() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f18264a[fVar.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<f0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (f0.class) {
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
