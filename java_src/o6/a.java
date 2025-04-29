package o6;

import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.i;
/* loaded from: classes.dex */
public final class a extends z<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: o6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0216a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14678a;

        static {
            int[] iArr = new int[z.f.values().length];
            f14678a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14678a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14678a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14678a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14678a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14678a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14678a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0216a c0216a) {
            this();
        }

        public b H(i iVar) {
            z();
            ((a) this.f7405k).q0(iVar);
            return this;
        }

        public b I(boolean z10) {
            z();
            ((a) this.f7405k).r0(z10);
            return this;
        }

        public b J(o6.b bVar) {
            z();
            ((a) this.f7405k).s0(bVar);
            return this;
        }

        public b K(d dVar) {
            z();
            ((a) this.f7405k).t0(dVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f14684j;

        c(int i10) {
            this.f14684j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return UNKNOWN_DOCUMENT;
                    }
                    return DOCUMENT;
                }
                return NO_DOCUMENT;
            }
            return DOCUMENTTYPE_NOT_SET;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        z.b0(a.class, aVar);
    }

    private a() {
    }

    public static b o0() {
        return DEFAULT_INSTANCE.B();
    }

    public static a p0(byte[] bArr) {
        return (a) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(i iVar) {
        iVar.getClass();
        this.documentType_ = iVar;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(boolean z10) {
        this.hasCommittedMutations_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(o6.b bVar) {
        bVar.getClass();
        this.documentType_ = bVar;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(d dVar) {
        dVar.getClass();
        this.documentType_ = dVar;
        this.documentTypeCase_ = 3;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (C0216a.f14678a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", o6.b.class, i.class, d.class, "hasCommittedMutations_"});
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

    public i j0() {
        return this.documentTypeCase_ == 2 ? (i) this.documentType_ : i.i0();
    }

    public c k0() {
        return c.b(this.documentTypeCase_);
    }

    public boolean l0() {
        return this.hasCommittedMutations_;
    }

    public o6.b m0() {
        return this.documentTypeCase_ == 1 ? (o6.b) this.documentType_ : o6.b.h0();
    }

    public d n0() {
        return this.documentTypeCase_ == 3 ? (d) this.documentType_ : d.h0();
    }
}
