package o6;

import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.y;
/* loaded from: classes.dex */
public final class c extends z<c, b> implements w0 {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile f1<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private t1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private t1 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private i resumeToken_ = i.f7143k;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14686a;

        static {
            int[] iArr = new int[z.f.values().length];
            f14686a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14686a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14686a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14686a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14686a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14686a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14686a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<c, b> implements w0 {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H() {
            z();
            ((c) this.f7405k).n0();
            return this;
        }

        public b I(y.c cVar) {
            z();
            ((c) this.f7405k).y0(cVar);
            return this;
        }

        public b J(t1 t1Var) {
            z();
            ((c) this.f7405k).z0(t1Var);
            return this;
        }

        public b K(long j10) {
            z();
            ((c) this.f7405k).A0(j10);
            return this;
        }

        public b L(y.d dVar) {
            z();
            ((c) this.f7405k).B0(dVar);
            return this;
        }

        public b M(i iVar) {
            z();
            ((c) this.f7405k).C0(iVar);
            return this;
        }

        public b N(t1 t1Var) {
            z();
            ((c) this.f7405k).D0(t1Var);
            return this;
        }

        public b O(int i10) {
            z();
            ((c) this.f7405k).E0(i10);
            return this;
        }
    }

    /* renamed from: o6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0218c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f14691j;

        EnumC0218c(int i10) {
            this.f14691j = i10;
        }

        public static EnumC0218c b(int i10) {
            if (i10 != 0) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        return null;
                    }
                    return DOCUMENTS;
                }
                return QUERY;
            }
            return TARGETTYPE_NOT_SET;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.b0(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(long j10) {
        this.lastListenSequenceNumber_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(y.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(i iVar) {
        iVar.getClass();
        this.resumeToken_ = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(t1 t1Var) {
        t1Var.getClass();
        this.snapshotVersion_ = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(int i10) {
        this.targetId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    public static b w0() {
        return DEFAULT_INSTANCE.B();
    }

    public static c x0(byte[] bArr) {
        return (c) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(y.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(t1 t1Var) {
        t1Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = t1Var;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f14686a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", y.d.class, y.c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c.class) {
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

    public y.c o0() {
        return this.targetTypeCase_ == 6 ? (y.c) this.targetType_ : y.c.i0();
    }

    public t1 p0() {
        t1 t1Var = this.lastLimboFreeSnapshotVersion_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public long q0() {
        return this.lastListenSequenceNumber_;
    }

    public y.d r0() {
        return this.targetTypeCase_ == 5 ? (y.d) this.targetType_ : y.d.h0();
    }

    public i s0() {
        return this.resumeToken_;
    }

    public t1 t0() {
        t1 t1Var = this.snapshotVersion_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public int u0() {
        return this.targetId_;
    }

    public EnumC0218c v0() {
        return EnumC0218c.b(this.targetTypeCase_);
    }
}
