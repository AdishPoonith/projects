package com.google.protobuf;
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    static final int f7047a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f7048b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f7049c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f7050d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum n uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static class b {
        public static final b A;
        public static final b B;
        public static final b C;
        private static final /* synthetic */ b[] D;

        /* renamed from: l  reason: collision with root package name */
        public static final b f7051l;

        /* renamed from: m  reason: collision with root package name */
        public static final b f7052m;

        /* renamed from: n  reason: collision with root package name */
        public static final b f7053n;

        /* renamed from: o  reason: collision with root package name */
        public static final b f7054o;

        /* renamed from: p  reason: collision with root package name */
        public static final b f7055p;

        /* renamed from: q  reason: collision with root package name */
        public static final b f7056q;

        /* renamed from: r  reason: collision with root package name */
        public static final b f7057r;

        /* renamed from: s  reason: collision with root package name */
        public static final b f7058s;

        /* renamed from: t  reason: collision with root package name */
        public static final b f7059t;

        /* renamed from: u  reason: collision with root package name */
        public static final b f7060u;

        /* renamed from: v  reason: collision with root package name */
        public static final b f7061v;

        /* renamed from: w  reason: collision with root package name */
        public static final b f7062w;

        /* renamed from: x  reason: collision with root package name */
        public static final b f7063x;

        /* renamed from: y  reason: collision with root package name */
        public static final b f7064y;

        /* renamed from: z  reason: collision with root package name */
        public static final b f7065z;

        /* renamed from: j  reason: collision with root package name */
        private final c f7066j;

        /* renamed from: k  reason: collision with root package name */
        private final int f7067k;

        /* loaded from: classes.dex */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.protobuf.b2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0104b extends b {
            C0104b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* loaded from: classes.dex */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* loaded from: classes.dex */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f7051l = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f7052m = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f7053n = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f7054o = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f7055p = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f7056q = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f7057r = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f7058s = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f7059t = aVar;
            c cVar3 = c.MESSAGE;
            C0104b c0104b = new C0104b("GROUP", 9, cVar3, 3);
            f7060u = c0104b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f7061v = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f7062w = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f7063x = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f7064y = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f7065z = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            A = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            B = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            C = bVar14;
            D = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0104b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f7066j = cVar;
            this.f7067k = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }

        public c b() {
            return this.f7066j;
        }

        public int g() {
            return this.f7067k;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f7143k),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: j  reason: collision with root package name */
        private final Object f7078j;

        c(Object obj) {
            this.f7078j = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
