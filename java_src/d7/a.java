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
public final class a extends com.google.protobuf.z<a, c> implements w0 {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final a DEFAULT_INSTANCE;
    private static volatile f1<a> PARSER;
    private p0<String, b0> aggregateFields_ = p0.f();

    /* renamed from: d7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0120a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7782a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7782a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7782a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7782a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7782a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7782a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7782a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7782a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final o0<String, b0> f7783a = o0.d(b2.b.f7059t, "", b2.b.f7061v, b0.t0());
    }

    /* loaded from: classes.dex */
    public static final class c extends z.a<a, c> implements w0 {
        private c() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(C0120a c0120a) {
            this();
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.protobuf.z.b0(a.class, aVar);
    }

    private a() {
    }

    public static a g0() {
        return DEFAULT_INSTANCE;
    }

    private p0<String, b0> h0() {
        return this.aggregateFields_;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (C0120a.f7782a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new c(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", b.f7783a});
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

    public Map<String, b0> f0() {
        return Collections.unmodifiableMap(h0());
    }
}
