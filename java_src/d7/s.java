package d7;

import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class s extends com.google.protobuf.z<s, b> implements w0 {
    private static final s DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile f1<s> PARSER;
    private p0<String, b0> fields_ = p0.f();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7862a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7862a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7862a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7862a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7862a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7862a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7862a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7862a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<s, b> implements w0 {
        private b() {
            super(s.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean H(String str) {
            str.getClass();
            return ((s) this.f7405k).i0().containsKey(str);
        }

        public b I(Map<String, b0> map) {
            z();
            ((s) this.f7405k).l0().putAll(map);
            return this;
        }

        public b J(String str, b0 b0Var) {
            str.getClass();
            b0Var.getClass();
            z();
            ((s) this.f7405k).l0().put(str, b0Var);
            return this;
        }

        public b K(String str) {
            str.getClass();
            z();
            ((s) this.f7405k).l0().remove(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, b0> f7863a = o0.d(b2.b.f7059t, "", b2.b.f7061v, b0.t0());
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.protobuf.z.b0(s.class, sVar);
    }

    private s() {
    }

    public static s g0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, b0> l0() {
        return n0();
    }

    private p0<String, b0> m0() {
        return this.fields_;
    }

    private p0<String, b0> n0() {
        if (!this.fields_.j()) {
            this.fields_ = this.fields_.p();
        }
        return this.fields_;
    }

    public static b o0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7862a[fVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f7863a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s.class) {
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

    public int h0() {
        return m0().size();
    }

    public Map<String, b0> i0() {
        return Collections.unmodifiableMap(m0());
    }

    public b0 j0(String str, b0 b0Var) {
        str.getClass();
        p0<String, b0> m02 = m0();
        return m02.containsKey(str) ? m02.get(str) : b0Var;
    }

    public b0 k0(String str) {
        str.getClass();
        p0<String, b0> m02 = m0();
        if (m02.containsKey(str)) {
            return m02.get(str);
        }
        throw new IllegalArgumentException();
    }
}
