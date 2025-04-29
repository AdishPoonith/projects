package d7;

import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
/* loaded from: classes.dex */
public final class d0 extends com.google.protobuf.z<d0, b> implements w0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final d0 DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile f1<d0> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private p0<String, String> labels_ = p0.f();
    private String database_ = "";
    private String streamId_ = "";
    private d0.i<c0> writes_ = com.google.protobuf.z.H();
    private com.google.protobuf.i streamToken_ = com.google.protobuf.i.f7143k;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7810a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7810a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7810a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7810a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7810a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7810a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7810a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7810a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<d0, b> implements w0 {
        private b() {
            super(d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(c0 c0Var) {
            z();
            ((d0) this.f7405k).i0(c0Var);
            return this;
        }

        public b I(String str) {
            z();
            ((d0) this.f7405k).m0(str);
            return this;
        }

        public b J(com.google.protobuf.i iVar) {
            z();
            ((d0) this.f7405k).n0(iVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, String> f7811a;

        static {
            b2.b bVar = b2.b.f7059t;
            f7811a = o0.d(bVar, "", bVar, "");
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.protobuf.z.b0(d0.class, d0Var);
    }

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(c0 c0Var) {
        c0Var.getClass();
        j0();
        this.writes_.add(c0Var);
    }

    private void j0() {
        d0.i<c0> iVar = this.writes_;
        if (iVar.h()) {
            return;
        }
        this.writes_ = com.google.protobuf.z.R(iVar);
    }

    public static d0 k0() {
        return DEFAULT_INSTANCE;
    }

    public static b l0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(com.google.protobuf.i iVar) {
        iVar.getClass();
        this.streamToken_ = iVar;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7810a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", c0.class, "streamToken_", "labels_", c.f7811a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d0.class) {
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
}
