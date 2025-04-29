package o6;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.c0;
/* loaded from: classes.dex */
public final class e extends z<e, b> implements w0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile f1<e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private t1 localWriteTime_;
    private d0.i<c0> writes_ = z.H();
    private d0.i<c0> baseWrites_ = z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14693a;

        static {
            int[] iArr = new int[z.f.values().length];
            f14693a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14693a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14693a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14693a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14693a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14693a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14693a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<e, b> implements w0 {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(c0 c0Var) {
            z();
            ((e) this.f7405k).j0(c0Var);
            return this;
        }

        public b I(c0 c0Var) {
            z();
            ((e) this.f7405k).k0(c0Var);
            return this;
        }

        public b J(int i10) {
            z();
            ((e) this.f7405k).w0(i10);
            return this;
        }

        public b K(t1 t1Var) {
            z();
            ((e) this.f7405k).x0(t1Var);
            return this;
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.b0(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(c0 c0Var) {
        c0Var.getClass();
        l0();
        this.baseWrites_.add(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(c0 c0Var) {
        c0Var.getClass();
        m0();
        this.writes_.add(c0Var);
    }

    private void l0() {
        d0.i<c0> iVar = this.baseWrites_;
        if (iVar.h()) {
            return;
        }
        this.baseWrites_ = z.R(iVar);
    }

    private void m0() {
        d0.i<c0> iVar = this.writes_;
        if (iVar.h()) {
            return;
        }
        this.writes_ = z.R(iVar);
    }

    public static b t0() {
        return DEFAULT_INSTANCE.B();
    }

    public static e u0(i iVar) {
        return (e) z.V(DEFAULT_INSTANCE, iVar);
    }

    public static e v0(byte[] bArr) {
        return (e) z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(int i10) {
        this.batchId_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(t1 t1Var) {
        t1Var.getClass();
        this.localWriteTime_ = t1Var;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f14693a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(null);
            case 3:
                return z.T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", c0.class, "localWriteTime_", "baseWrites_", c0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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

    public c0 n0(int i10) {
        return this.baseWrites_.get(i10);
    }

    public int o0() {
        return this.baseWrites_.size();
    }

    public int p0() {
        return this.batchId_;
    }

    public t1 q0() {
        t1 t1Var = this.localWriteTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }

    public c0 r0(int i10) {
        return this.writes_.get(i10);
    }

    public int s0() {
        return this.writes_.size();
    }
}
