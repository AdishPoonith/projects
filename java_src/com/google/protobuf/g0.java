package com.google.protobuf;
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
public final class g0 {

    /* renamed from: m  reason: collision with root package name */
    public static final g0 f7123m;

    /* renamed from: n  reason: collision with root package name */
    public static final g0 f7124n;

    /* renamed from: o  reason: collision with root package name */
    public static final g0 f7125o;

    /* renamed from: p  reason: collision with root package name */
    public static final g0 f7126p;

    /* renamed from: q  reason: collision with root package name */
    public static final g0 f7127q;

    /* renamed from: r  reason: collision with root package name */
    public static final g0 f7128r;

    /* renamed from: s  reason: collision with root package name */
    public static final g0 f7129s;

    /* renamed from: t  reason: collision with root package name */
    public static final g0 f7130t;

    /* renamed from: u  reason: collision with root package name */
    public static final g0 f7131u;

    /* renamed from: v  reason: collision with root package name */
    public static final g0 f7132v;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ g0[] f7133w;

    /* renamed from: j  reason: collision with root package name */
    private final Class<?> f7134j;

    /* renamed from: k  reason: collision with root package name */
    private final Class<?> f7135k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f7136l;

    static {
        g0 g0Var = new g0("VOID", 0, Void.class, Void.class, null);
        f7123m = g0Var;
        Class cls = Integer.TYPE;
        g0 g0Var2 = new g0("INT", 1, cls, Integer.class, 0);
        f7124n = g0Var2;
        g0 g0Var3 = new g0("LONG", 2, Long.TYPE, Long.class, 0L);
        f7125o = g0Var3;
        g0 g0Var4 = new g0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7126p = g0Var4;
        g0 g0Var5 = new g0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7127q = g0Var5;
        g0 g0Var6 = new g0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7128r = g0Var6;
        g0 g0Var7 = new g0("STRING", 6, String.class, String.class, "");
        f7129s = g0Var7;
        g0 g0Var8 = new g0("BYTE_STRING", 7, i.class, i.class, i.f7143k);
        f7130t = g0Var8;
        g0 g0Var9 = new g0("ENUM", 8, cls, Integer.class, null);
        f7131u = g0Var9;
        g0 g0Var10 = new g0("MESSAGE", 9, Object.class, Object.class, null);
        f7132v = g0Var10;
        f7133w = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10};
    }

    private g0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f7134j = cls;
        this.f7135k = cls2;
        this.f7136l = obj;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f7133w.clone();
    }

    public Class<?> b() {
        return this.f7135k;
    }
}
