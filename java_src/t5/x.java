package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class x extends com.google.crypto.tink.shaded.protobuf.z<x, b> implements t0 {
    private static final x DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile a1<x> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18305a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18305a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18305a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18305a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18305a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18305a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18305a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18305a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<x, b> implements t0 {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(u uVar) {
            v();
            ((x) this.f6436k).U(uVar);
            return this;
        }

        public b C(int i10) {
            v();
            ((x) this.f6436k).V(i10);
            return this;
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.z.L(x.class, xVar);
    }

    private x() {
    }

    public static x Q() {
        return DEFAULT_INSTANCE;
    }

    public static b T() {
        return DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(u uVar) {
        this.hash_ = uVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        this.tagSize_ = i10;
    }

    public u R() {
        u b10 = u.b(this.hash_);
        return b10 == null ? u.UNRECOGNIZED : b10;
    }

    public int S() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f18305a[fVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<x> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (x.class) {
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
