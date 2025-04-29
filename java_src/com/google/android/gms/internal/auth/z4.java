package com.google.android.gms.internal.auth;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum m uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class z4 {
    public static final z4 A;
    public static final z4 B;
    private static final /* synthetic */ z4[] C;

    /* renamed from: k  reason: collision with root package name */
    public static final z4 f4289k;

    /* renamed from: l  reason: collision with root package name */
    public static final z4 f4290l;

    /* renamed from: m  reason: collision with root package name */
    public static final z4 f4291m;

    /* renamed from: n  reason: collision with root package name */
    public static final z4 f4292n;

    /* renamed from: o  reason: collision with root package name */
    public static final z4 f4293o;

    /* renamed from: p  reason: collision with root package name */
    public static final z4 f4294p;

    /* renamed from: q  reason: collision with root package name */
    public static final z4 f4295q;

    /* renamed from: r  reason: collision with root package name */
    public static final z4 f4296r;

    /* renamed from: s  reason: collision with root package name */
    public static final z4 f4297s;

    /* renamed from: t  reason: collision with root package name */
    public static final z4 f4298t;

    /* renamed from: u  reason: collision with root package name */
    public static final z4 f4299u;

    /* renamed from: v  reason: collision with root package name */
    public static final z4 f4300v;

    /* renamed from: w  reason: collision with root package name */
    public static final z4 f4301w;

    /* renamed from: x  reason: collision with root package name */
    public static final z4 f4302x;

    /* renamed from: y  reason: collision with root package name */
    public static final z4 f4303y;

    /* renamed from: z  reason: collision with root package name */
    public static final z4 f4304z;

    /* renamed from: j  reason: collision with root package name */
    private final a5 f4305j;

    static {
        z4 z4Var = new z4("DOUBLE", 0, a5.DOUBLE, 1);
        f4289k = z4Var;
        z4 z4Var2 = new z4("FLOAT", 1, a5.FLOAT, 5);
        f4290l = z4Var2;
        a5 a5Var = a5.LONG;
        z4 z4Var3 = new z4("INT64", 2, a5Var, 0);
        f4291m = z4Var3;
        z4 z4Var4 = new z4("UINT64", 3, a5Var, 0);
        f4292n = z4Var4;
        a5 a5Var2 = a5.INT;
        z4 z4Var5 = new z4("INT32", 4, a5Var2, 0);
        f4293o = z4Var5;
        z4 z4Var6 = new z4("FIXED64", 5, a5Var, 1);
        f4294p = z4Var6;
        z4 z4Var7 = new z4("FIXED32", 6, a5Var2, 5);
        f4295q = z4Var7;
        z4 z4Var8 = new z4("BOOL", 7, a5.BOOLEAN, 0);
        f4296r = z4Var8;
        z4 z4Var9 = new z4("STRING", 8, a5.STRING, 2);
        f4297s = z4Var9;
        a5 a5Var3 = a5.MESSAGE;
        z4 z4Var10 = new z4("GROUP", 9, a5Var3, 3);
        f4298t = z4Var10;
        z4 z4Var11 = new z4("MESSAGE", 10, a5Var3, 2);
        f4299u = z4Var11;
        z4 z4Var12 = new z4("BYTES", 11, a5.BYTE_STRING, 2);
        f4300v = z4Var12;
        z4 z4Var13 = new z4("UINT32", 12, a5Var2, 0);
        f4301w = z4Var13;
        z4 z4Var14 = new z4("ENUM", 13, a5.ENUM, 0);
        f4302x = z4Var14;
        z4 z4Var15 = new z4("SFIXED32", 14, a5Var2, 5);
        f4303y = z4Var15;
        z4 z4Var16 = new z4("SFIXED64", 15, a5Var, 1);
        f4304z = z4Var16;
        z4 z4Var17 = new z4("SINT32", 16, a5Var2, 0);
        A = z4Var17;
        z4 z4Var18 = new z4("SINT64", 17, a5Var, 0);
        B = z4Var18;
        C = new z4[]{z4Var, z4Var2, z4Var3, z4Var4, z4Var5, z4Var6, z4Var7, z4Var8, z4Var9, z4Var10, z4Var11, z4Var12, z4Var13, z4Var14, z4Var15, z4Var16, z4Var17, z4Var18};
    }

    private z4(String str, int i10, a5 a5Var, int i11) {
        this.f4305j = a5Var;
    }

    public static z4[] values() {
        return (z4[]) C.clone();
    }

    public final a5 b() {
        return this.f4305j;
    }
}
