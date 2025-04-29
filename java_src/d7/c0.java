package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.n;
import java.util.List;
/* loaded from: classes.dex */
public final class c0 extends com.google.protobuf.z<c0, b> implements w0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final c0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile f1<c0> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private t currentDocument_;
    private Object operation_;
    private l updateMask_;
    private int operationCase_ = 0;
    private d0.i<n.c> updateTransforms_ = com.google.protobuf.z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7801a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7801a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7801a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7801a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7801a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7801a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7801a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7801a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<c0, b> implements w0 {
        private b() {
            super(c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(n.c cVar) {
            z();
            ((c0) this.f7405k).l0(cVar);
            return this;
        }

        public b I(t tVar) {
            z();
            ((c0) this.f7405k).C0(tVar);
            return this;
        }

        public b J(String str) {
            z();
            ((c0) this.f7405k).D0(str);
            return this;
        }

        public b K(i iVar) {
            z();
            ((c0) this.f7405k).E0(iVar);
            return this;
        }

        public b L(l lVar) {
            z();
            ((c0) this.f7405k).F0(lVar);
            return this;
        }

        public b M(String str) {
            z();
            ((c0) this.f7405k).G0(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);
        

        /* renamed from: j  reason: collision with root package name */
        private final int f7808j;

        c(int i10) {
            this.f7808j = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return null;
                            }
                            return TRANSFORM;
                        }
                        return VERIFY;
                    }
                    return DELETE;
                }
                return UPDATE;
            }
            return OPERATION_NOT_SET;
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.protobuf.z.b0(c0.class, c0Var);
    }

    private c0() {
    }

    public static b A0(c0 c0Var) {
        return DEFAULT_INSTANCE.C(c0Var);
    }

    public static c0 B0(byte[] bArr) {
        return (c0) com.google.protobuf.z.X(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(t tVar) {
        tVar.getClass();
        this.currentDocument_ = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(i iVar) {
        iVar.getClass();
        this.operation_ = iVar;
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(l lVar) {
        lVar.getClass();
        this.updateMask_ = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(n.c cVar) {
        cVar.getClass();
        m0();
        this.updateTransforms_.add(cVar);
    }

    private void m0() {
        d0.i<n.c> iVar = this.updateTransforms_;
        if (iVar.h()) {
            return;
        }
        this.updateTransforms_ = com.google.protobuf.z.R(iVar);
    }

    public static b z0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7801a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", i.class, "updateMask_", "currentDocument_", n.class, "updateTransforms_", n.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<c0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (c0.class) {
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

    public t n0() {
        t tVar = this.currentDocument_;
        return tVar == null ? t.i0() : tVar;
    }

    public String o0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public c p0() {
        return c.b(this.operationCase_);
    }

    public n q0() {
        return this.operationCase_ == 6 ? (n) this.operation_ : n.f0();
    }

    public i r0() {
        return this.operationCase_ == 1 ? (i) this.operation_ : i.i0();
    }

    public l s0() {
        l lVar = this.updateMask_;
        return lVar == null ? l.i0() : lVar;
    }

    public List<n.c> t0() {
        return this.updateTransforms_;
    }

    public String u0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public boolean v0() {
        return this.currentDocument_ != null;
    }

    public boolean w0() {
        return this.operationCase_ == 6;
    }

    public boolean x0() {
        return this.operationCase_ == 1;
    }

    public boolean y0() {
        return this.updateMask_ != null;
    }
}
