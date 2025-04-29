package d7;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import com.google.protobuf.z;
import d7.h;
import java.util.List;
/* loaded from: classes.dex */
public final class x extends com.google.protobuf.z<x, b> implements w0 {
    private static final x DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile f1<x> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private d7.h endAt_;
    private com.google.protobuf.a0 limit_;
    private int offset_;
    private j select_;
    private d7.h startAt_;
    private h where_;
    private d0.i<c> from_ = com.google.protobuf.z.H();
    private d0.i<i> orderBy_ = com.google.protobuf.z.H();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7873a;

        static {
            int[] iArr = new int[z.f.values().length];
            f7873a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7873a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7873a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7873a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7873a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7873a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7873a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<x, b> implements w0 {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b H(c.a aVar) {
            z();
            ((x) this.f7405k).l0(aVar.b());
            return this;
        }

        public b I(i iVar) {
            z();
            ((x) this.f7405k).m0(iVar);
            return this;
        }

        public b J(h.b bVar) {
            z();
            ((x) this.f7405k).D0(bVar.b());
            return this;
        }

        public b K(a0.b bVar) {
            z();
            ((x) this.f7405k).E0(bVar.b());
            return this;
        }

        public b L(h.b bVar) {
            z();
            ((x) this.f7405k).F0(bVar.b());
            return this;
        }

        public b M(h hVar) {
            z();
            ((x) this.f7405k).G0(hVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.google.protobuf.z<c, a> implements w0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile f1<c> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(boolean z10) {
                z();
                ((c) this.f7405k).k0(z10);
                return this;
            }

            public a I(String str) {
                z();
                ((c) this.f7405k).l0(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.z.b0(c.class, cVar);
        }

        private c() {
        }

        public static a j0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(boolean z10) {
            this.allDescendants_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

        public boolean h0() {
            return this.allDescendants_;
        }

        public String i0() {
            return this.collectionId_;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.google.protobuf.z<d, a> implements w0 {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER;
        private d0.i<h> filters_ = com.google.protobuf.z.H();
        private int op_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<d, a> implements w0 {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(Iterable<? extends h> iterable) {
                z();
                ((d) this.f7405k).h0(iterable);
                return this;
            }

            public a I(b bVar) {
                z();
                ((d) this.f7405k).n0(bVar);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: o  reason: collision with root package name */
            private static final d0.d<b> f7878o = new a();

            /* renamed from: j  reason: collision with root package name */
            private final int f7880j;

            /* loaded from: classes.dex */
            class a implements d0.d<b> {
                a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public b a(int i10) {
                    return b.b(i10);
                }
            }

            b(int i10) {
                this.f7880j = i10;
            }

            public static b b(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return OR;
                    }
                    return AND;
                }
                return OPERATOR_UNSPECIFIED;
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7880j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.z.b0(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(Iterable<? extends h> iterable) {
            i0();
            com.google.protobuf.a.k(iterable, this.filters_);
        }

        private void i0() {
            d0.i<h> iVar = this.filters_;
            if (iVar.h()) {
                return;
            }
            this.filters_ = com.google.protobuf.z.R(iVar);
        }

        public static d j0() {
            return DEFAULT_INSTANCE;
        }

        public static a m0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n0(b bVar) {
            this.op_ = bVar.a();
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<d> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (d.class) {
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

        public List<h> k0() {
            return this.filters_;
        }

        public b l0() {
            b b10 = b.b(this.op_);
            return b10 == null ? b.UNRECOGNIZED : b10;
        }
    }

    /* loaded from: classes.dex */
    public enum e implements d0.c {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: o  reason: collision with root package name */
        private static final d0.d<e> f7885o = new a();

        /* renamed from: j  reason: collision with root package name */
        private final int f7887j;

        /* loaded from: classes.dex */
        class a implements d0.d<e> {
            a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b */
            public e a(int i10) {
                return e.b(i10);
            }
        }

        e(int i10) {
            this.f7887j = i10;
        }

        public static e b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return DESCENDING;
                }
                return ASCENDING;
            }
            return DIRECTION_UNSPECIFIED;
        }

        @Override // com.google.protobuf.d0.c
        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f7887j;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.google.protobuf.z<f, a> implements w0 {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile f1<f> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private g field_;
        private int op_;
        private b0 value_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<f, a> implements w0 {
            private a() {
                super(f.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(g gVar) {
                z();
                ((f) this.f7405k).n0(gVar);
                return this;
            }

            public a I(b bVar) {
                z();
                ((f) this.f7405k).o0(bVar);
                return this;
            }

            public a J(b0 b0Var) {
                z();
                ((f) this.f7405k).p0(b0Var);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);
            

            /* renamed from: w  reason: collision with root package name */
            private static final d0.d<b> f7900w = new a();

            /* renamed from: j  reason: collision with root package name */
            private final int f7902j;

            /* loaded from: classes.dex */
            class a implements d0.d<b> {
                a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public b a(int i10) {
                    return b.b(i10);
                }
            }

            b(int i10) {
                this.f7902j = i10;
            }

            public static b b(int i10) {
                switch (i10) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7902j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            com.google.protobuf.z.b0(f.class, fVar);
        }

        private f() {
        }

        public static f i0() {
            return DEFAULT_INSTANCE;
        }

        public static a m0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o0(b bVar) {
            this.op_ = bVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p0(b0 b0Var) {
            b0Var.getClass();
            this.value_ = b0Var;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<f> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (f.class) {
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

        public g j0() {
            g gVar = this.field_;
            return gVar == null ? g.g0() : gVar;
        }

        public b k0() {
            b b10 = b.b(this.op_);
            return b10 == null ? b.UNRECOGNIZED : b10;
        }

        public b0 l0() {
            b0 b0Var = this.value_;
            return b0Var == null ? b0.t0() : b0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.google.protobuf.z<g, a> implements w0 {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile f1<g> PARSER;
        private String fieldPath_ = "";

        /* loaded from: classes.dex */
        public static final class a extends z.a<g, a> implements w0 {
            private a() {
                super(g.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(String str) {
                z();
                ((g) this.f7405k).j0(str);
                return this;
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            com.google.protobuf.z.b0(g.class, gVar);
        }

        private g() {
        }

        public static g g0() {
            return DEFAULT_INSTANCE;
        }

        public static a i0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<g> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (g.class) {
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

        public String h0() {
            return this.fieldPath_;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.google.protobuf.z<h, a> implements w0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile f1<h> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<h, a> implements w0 {
            private a() {
                super(h.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(d.a aVar) {
                z();
                ((h) this.f7405k).o0(aVar.b());
                return this;
            }

            public a I(f.a aVar) {
                z();
                ((h) this.f7405k).p0(aVar.b());
                return this;
            }

            public a J(k.a aVar) {
                z();
                ((h) this.f7405k).q0(aVar.b());
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);
            

            /* renamed from: j  reason: collision with root package name */
            private final int f7908j;

            b(int i10) {
                this.f7908j = i10;
            }

            public static b b(int i10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return UNARY_FILTER;
                        }
                        return FIELD_FILTER;
                    }
                    return COMPOSITE_FILTER;
                }
                return FILTERTYPE_NOT_SET;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            com.google.protobuf.z.b0(h.class, hVar);
        }

        private h() {
        }

        public static h j0() {
            return DEFAULT_INSTANCE;
        }

        public static a n0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<h> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (h.class) {
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

        public d i0() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.j0();
        }

        public f k0() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.i0();
        }

        public b l0() {
            return b.b(this.filterTypeCase_);
        }

        public k m0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.h0();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.google.protobuf.z<i, a> implements w0 {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile f1<i> PARSER;
        private int direction_;
        private g field_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<i, a> implements w0 {
            private a() {
                super(i.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(e eVar) {
                z();
                ((i) this.f7405k).k0(eVar);
                return this;
            }

            public a I(g gVar) {
                z();
                ((i) this.f7405k).l0(gVar);
                return this;
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            com.google.protobuf.z.b0(i.class, iVar);
        }

        private i() {
        }

        public static a j0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(e eVar) {
            this.direction_ = eVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
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

        public e h0() {
            e b10 = e.b(this.direction_);
            return b10 == null ? e.UNRECOGNIZED : b10;
        }

        public g i0() {
            g gVar = this.field_;
            return gVar == null ? g.g0() : gVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.google.protobuf.z<j, a> implements w0 {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile f1<j> PARSER;
        private d0.i<g> fields_ = com.google.protobuf.z.H();

        /* loaded from: classes.dex */
        public static final class a extends z.a<j, a> implements w0 {
            private a() {
                super(j.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            com.google.protobuf.z.b0(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<j> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (j.class) {
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

    /* loaded from: classes.dex */
    public static final class k extends com.google.protobuf.z<k, a> implements w0 {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<k> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<k, a> implements w0 {
            private a() {
                super(k.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a H(g gVar) {
                z();
                ((k) this.f7405k).l0(gVar);
                return this;
            }

            public a I(b bVar) {
                z();
                ((k) this.f7405k).m0(bVar);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);
            

            /* renamed from: q  reason: collision with root package name */
            private static final d0.d<b> f7915q = new a();

            /* renamed from: j  reason: collision with root package name */
            private final int f7917j;

            /* loaded from: classes.dex */
            class a implements d0.d<b> {
                a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b */
                public b a(int i10) {
                    return b.b(i10);
                }
            }

            b(int i10) {
                this.f7917j = i10;
            }

            public static b b(int i10) {
                if (i10 != 0) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    return null;
                                }
                                return IS_NOT_NULL;
                            }
                            return IS_NOT_NAN;
                        }
                        return IS_NULL;
                    }
                    return IS_NAN;
                }
                return OPERATOR_UNSPECIFIED;
            }

            @Override // com.google.protobuf.d0.c
            public final int a() {
                if (this != UNRECOGNIZED) {
                    return this.f7917j;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            com.google.protobuf.z.b0(k.class, kVar);
        }

        private k() {
        }

        public static k h0() {
            return DEFAULT_INSTANCE;
        }

        public static a k0() {
            return DEFAULT_INSTANCE.B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m0(b bVar) {
            this.op_ = bVar.a();
        }

        @Override // com.google.protobuf.z
        protected final Object F(z.f fVar, Object obj, Object obj2) {
            switch (a.f7873a[fVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<k> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (k.class) {
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

        public g i0() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.g0();
        }

        public b j0() {
            b b10 = b.b(this.op_);
            return b10 == null ? b.UNRECOGNIZED : b10;
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.protobuf.z.b0(x.class, xVar);
    }

    private x() {
    }

    public static b C0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(d7.h hVar) {
        hVar.getClass();
        this.endAt_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(com.google.protobuf.a0 a0Var) {
        a0Var.getClass();
        this.limit_ = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(d7.h hVar) {
        hVar.getClass();
        this.startAt_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(c cVar) {
        cVar.getClass();
        n0();
        this.from_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(i iVar) {
        iVar.getClass();
        o0();
        this.orderBy_.add(iVar);
    }

    private void n0() {
        d0.i<c> iVar = this.from_;
        if (iVar.h()) {
            return;
        }
        this.from_ = com.google.protobuf.z.R(iVar);
    }

    private void o0() {
        d0.i<i> iVar = this.orderBy_;
        if (iVar.h()) {
            return;
        }
        this.orderBy_ = com.google.protobuf.z.R(iVar);
    }

    public static x p0() {
        return DEFAULT_INSTANCE;
    }

    public boolean A0() {
        return this.startAt_ != null;
    }

    public boolean B0() {
        return this.where_ != null;
    }

    @Override // com.google.protobuf.z
    protected final Object F(z.f fVar, Object obj, Object obj2) {
        switch (a.f7873a[fVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(null);
            case 3:
                return com.google.protobuf.z.T(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<x> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (x.class) {
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

    public d7.h q0() {
        d7.h hVar = this.endAt_;
        return hVar == null ? d7.h.k0() : hVar;
    }

    public c r0(int i10) {
        return this.from_.get(i10);
    }

    public int s0() {
        return this.from_.size();
    }

    public com.google.protobuf.a0 t0() {
        com.google.protobuf.a0 a0Var = this.limit_;
        return a0Var == null ? com.google.protobuf.a0.g0() : a0Var;
    }

    public i u0(int i10) {
        return this.orderBy_.get(i10);
    }

    public int v0() {
        return this.orderBy_.size();
    }

    public d7.h w0() {
        d7.h hVar = this.startAt_;
        return hVar == null ? d7.h.k0() : hVar;
    }

    public h x0() {
        h hVar = this.where_;
        return hVar == null ? h.j0() : hVar;
    }

    public boolean y0() {
        return this.endAt_ != null;
    }

    public boolean z0() {
        return this.limit_ != null;
    }
}
