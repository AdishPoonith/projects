package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    static final int f6326a = c(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f6327b = c(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f6328c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f6329d = c(3, 2);

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
        public static final b f6330l;

        /* renamed from: m  reason: collision with root package name */
        public static final b f6331m;

        /* renamed from: n  reason: collision with root package name */
        public static final b f6332n;

        /* renamed from: o  reason: collision with root package name */
        public static final b f6333o;

        /* renamed from: p  reason: collision with root package name */
        public static final b f6334p;

        /* renamed from: q  reason: collision with root package name */
        public static final b f6335q;

        /* renamed from: r  reason: collision with root package name */
        public static final b f6336r;

        /* renamed from: s  reason: collision with root package name */
        public static final b f6337s;

        /* renamed from: t  reason: collision with root package name */
        public static final b f6338t;

        /* renamed from: u  reason: collision with root package name */
        public static final b f6339u;

        /* renamed from: v  reason: collision with root package name */
        public static final b f6340v;

        /* renamed from: w  reason: collision with root package name */
        public static final b f6341w;

        /* renamed from: x  reason: collision with root package name */
        public static final b f6342x;

        /* renamed from: y  reason: collision with root package name */
        public static final b f6343y;

        /* renamed from: z  reason: collision with root package name */
        public static final b f6344z;

        /* renamed from: j  reason: collision with root package name */
        private final c f6345j;

        /* renamed from: k  reason: collision with root package name */
        private final int f6346k;

        /* loaded from: classes.dex */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.u1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0101b extends b {
            C0101b(String str, int i10, c cVar, int i11) {
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
            f6330l = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f6331m = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f6332n = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f6333o = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f6334p = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f6335q = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f6336r = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f6337s = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f6338t = aVar;
            c cVar3 = c.MESSAGE;
            C0101b c0101b = new C0101b("GROUP", 9, cVar3, 3);
            f6339u = c0101b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f6340v = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f6341w = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f6342x = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f6343y = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f6344z = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            A = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            B = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            C = bVar14;
            D = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0101b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f6345j = cVar;
            this.f6346k = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }

        public c b() {
            return this.f6345j;
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
        BYTE_STRING(i.f6190k),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: j  reason: collision with root package name */
        private final Object f6357j;

        c(Object obj) {
            this.f6357j = obj;
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
