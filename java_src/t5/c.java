package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class c extends com.google.crypto.tink.shaded.protobuf.z<c, b> implements t0 {
    private static final c DEFAULT_INSTANCE;
    private static volatile a1<c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18257a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18257a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18257a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18257a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18257a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18257a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18257a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18257a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<c, b> implements t0 {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(int i10) {
            v();
            ((c) this.f6436k).S(i10);
            return this;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.crypto.tink.shaded.protobuf.z.L(c.class, cVar);
    }

    private c() {
    }

    public static c P() {
        return DEFAULT_INSTANCE;
    }

    public static b R() {
        return DEFAULT_INSTANCE.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10) {
        this.tagSize_ = i10;
    }

    public int Q() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f18257a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<c> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (c.class) {
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
