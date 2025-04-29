package com.google.android.gms.internal.p000firebaseauthapi;
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
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u8  reason: invalid package */
/* loaded from: classes.dex */
public final class u8 {
    public static final u8 A;
    public static final u8 B;
    private static final /* synthetic */ u8[] C;

    /* renamed from: k  reason: collision with root package name */
    public static final u8 f5422k;

    /* renamed from: l  reason: collision with root package name */
    public static final u8 f5423l;

    /* renamed from: m  reason: collision with root package name */
    public static final u8 f5424m;

    /* renamed from: n  reason: collision with root package name */
    public static final u8 f5425n;

    /* renamed from: o  reason: collision with root package name */
    public static final u8 f5426o;

    /* renamed from: p  reason: collision with root package name */
    public static final u8 f5427p;

    /* renamed from: q  reason: collision with root package name */
    public static final u8 f5428q;

    /* renamed from: r  reason: collision with root package name */
    public static final u8 f5429r;

    /* renamed from: s  reason: collision with root package name */
    public static final u8 f5430s;

    /* renamed from: t  reason: collision with root package name */
    public static final u8 f5431t;

    /* renamed from: u  reason: collision with root package name */
    public static final u8 f5432u;

    /* renamed from: v  reason: collision with root package name */
    public static final u8 f5433v;

    /* renamed from: w  reason: collision with root package name */
    public static final u8 f5434w;

    /* renamed from: x  reason: collision with root package name */
    public static final u8 f5435x;

    /* renamed from: y  reason: collision with root package name */
    public static final u8 f5436y;

    /* renamed from: z  reason: collision with root package name */
    public static final u8 f5437z;

    /* renamed from: j  reason: collision with root package name */
    private final v8 f5438j;

    static {
        u8 u8Var = new u8("DOUBLE", 0, v8.DOUBLE, 1);
        f5422k = u8Var;
        u8 u8Var2 = new u8("FLOAT", 1, v8.FLOAT, 5);
        f5423l = u8Var2;
        v8 v8Var = v8.LONG;
        u8 u8Var3 = new u8("INT64", 2, v8Var, 0);
        f5424m = u8Var3;
        u8 u8Var4 = new u8("UINT64", 3, v8Var, 0);
        f5425n = u8Var4;
        v8 v8Var2 = v8.INT;
        u8 u8Var5 = new u8("INT32", 4, v8Var2, 0);
        f5426o = u8Var5;
        u8 u8Var6 = new u8("FIXED64", 5, v8Var, 1);
        f5427p = u8Var6;
        u8 u8Var7 = new u8("FIXED32", 6, v8Var2, 5);
        f5428q = u8Var7;
        u8 u8Var8 = new u8("BOOL", 7, v8.BOOLEAN, 0);
        f5429r = u8Var8;
        u8 u8Var9 = new u8("STRING", 8, v8.STRING, 2);
        f5430s = u8Var9;
        v8 v8Var3 = v8.MESSAGE;
        u8 u8Var10 = new u8("GROUP", 9, v8Var3, 3);
        f5431t = u8Var10;
        u8 u8Var11 = new u8("MESSAGE", 10, v8Var3, 2);
        f5432u = u8Var11;
        u8 u8Var12 = new u8("BYTES", 11, v8.BYTE_STRING, 2);
        f5433v = u8Var12;
        u8 u8Var13 = new u8("UINT32", 12, v8Var2, 0);
        f5434w = u8Var13;
        u8 u8Var14 = new u8("ENUM", 13, v8.ENUM, 0);
        f5435x = u8Var14;
        u8 u8Var15 = new u8("SFIXED32", 14, v8Var2, 5);
        f5436y = u8Var15;
        u8 u8Var16 = new u8("SFIXED64", 15, v8Var, 1);
        f5437z = u8Var16;
        u8 u8Var17 = new u8("SINT32", 16, v8Var2, 0);
        A = u8Var17;
        u8 u8Var18 = new u8("SINT64", 17, v8Var, 0);
        B = u8Var18;
        C = new u8[]{u8Var, u8Var2, u8Var3, u8Var4, u8Var5, u8Var6, u8Var7, u8Var8, u8Var9, u8Var10, u8Var11, u8Var12, u8Var13, u8Var14, u8Var15, u8Var16, u8Var17, u8Var18};
    }

    private u8(String str, int i10, v8 v8Var, int i11) {
        this.f5438j = v8Var;
    }

    public static u8[] values() {
        return (u8[]) C.clone();
    }

    public final v8 b() {
        return this.f5438j;
    }
}
