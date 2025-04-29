package d7;

import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class i extends com.google.protobuf.z<i, b> implements w0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<i> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private t1 createTime_;
    private p0<String, b0> fields_ = p0.f();
    private String name_ = "";
    private t1 updateTime_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7823a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7823a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7823a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7823a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7823a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7823a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7823a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7823a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<i, b> implements w0 {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(Map<String, b0> map) {
            z();
            ((i) this.f7405k).k0().putAll(map);
            return this;
        }

        public b I(String str) {
            z();
            ((i) this.f7405k).q0(str);
            return this;
        }

        public b J(t1 t1Var) {
            z();
            ((i) this.f7405k).r0(t1Var);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, b0> f7824a = o0.d(b2.b.f7059t, "", b2.b.f7061v, b0.t0());
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.protobuf.z.b0(i.class, iVar);
    }

    private i() {
    }

    public static i i0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, b0> k0() {
        return o0();
    }

    private p0<String, b0> n0() {
        return this.fields_;
    }

    private p0<String, b0> o0() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.p();
        }
        return this.fields_;
    }

    public static b p0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(t1 t1Var) {
        t1Var.getClass();
        this.updateTime_ = t1Var;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7823a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", c.f7824a, "createTime_", "updateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<i> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (i.class) {
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

    public Map<String, b0> j0() {
        return Collections.unmodifiableMap(n0());
    }

    public String l0() {
        return this.name_;
    }

    public t1 m0() {
        t1 t1Var = this.updateTime_;
        return t1Var == null ? t1.h0() : t1Var;
    }
}
