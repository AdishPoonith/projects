package t5;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
/* loaded from: classes.dex */
public final class e extends com.google.crypto.tink.shaded.protobuf.z<e, b> implements t0 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile a1<e> PARSER;
    private g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18261a;

        static {
            int[] iArr = new int[z.f.values().length];
            f18261a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18261a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18261a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18261a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18261a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18261a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18261a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<e, b> implements t0 {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(g gVar) {
            v();
            ((e) this.f6436k).U(gVar);
            return this;
        }

        public b C(w wVar) {
            v();
            ((e) this.f6436k).V(wVar);
            return this;
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.crypto.tink.shaded.protobuf.z.L(e.class, eVar);
    }

    private e() {
    }

    public static b S() {
        return DEFAULT_INSTANCE.t();
    }

    public static e T(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (e) com.google.crypto.tink.shaded.protobuf.z.G(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(g gVar) {
        gVar.getClass();
        this.aesCtrKeyFormat_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(w wVar) {
        wVar.getClass();
        this.hmacKeyFormat_ = wVar;
    }

    public g Q() {
        g gVar = this.aesCtrKeyFormat_;
        return gVar == null ? g.Q() : gVar;
    }

    public w R() {
        w wVar = this.hmacKeyFormat_;
        return wVar == null ? w.Q() : wVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f18261a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<e> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (e.class) {
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
