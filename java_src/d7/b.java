package d7;

import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.z;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class b extends com.google.protobuf.z<b, C0121b> implements c {
    private static final b DEFAULT_INSTANCE;
    private static volatile f1<b> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private d0.i<b0> values_ = com.google.protobuf.z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7785a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7785a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7785a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7785a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7785a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7785a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7785a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7785a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: d7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0121b extends z.a<b, C0121b> implements c {
        private C0121b() {
            super(b.DEFAULT_INSTANCE);
        }

        /* synthetic */ C0121b(a aVar) {
            this();
        }

        public C0121b H(Iterable<? extends b0> iterable) {
            z();
            ((b) this.f7405k).i0(iterable);
            return this;
        }

        public C0121b I(b0 b0Var) {
            z();
            ((b) this.f7405k).j0(b0Var);
            return this;
        }

        public b0 J(int i10) {
            return ((b) this.f7405k).m0(i10);
        }

        public int K() {
            return ((b) this.f7405k).n0();
        }

        public C0121b L(int i10) {
            z();
            ((b) this.f7405k).p0(i10);
            return this;
        }

        @Override // d7.c
        public List<b0> o() {
            return Collections.unmodifiableList(((b) this.f7405k).o());
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.protobuf.z.b0(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(Iterable<? extends b0> iterable) {
        k0();
        com.google.protobuf.a.k(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(b0 b0Var) {
        b0Var.getClass();
        k0();
        this.values_.add(b0Var);
    }

    private void k0() {
        d0.i<b0> iVar = this.values_;
        if (iVar.h()) {
            return;
        }
        this.values_ = com.google.protobuf.z.R(iVar);
    }

    public static b l0() {
        return DEFAULT_INSTANCE;
    }

    public static C0121b o0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(int i10) {
        k0();
        this.values_.remove(i10);
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7785a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0121b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", b0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<b> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (b.class) {
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

    public b0 m0(int i10) {
        return this.values_.get(i10);
    }

    public int n0() {
        return this.values_.size();
    }

    @Override // d7.c
    public List<b0> o() {
        return this.values_;
    }
}
