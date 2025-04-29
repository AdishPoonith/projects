package com.google.crypto.tink.shaded.protobuf;
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
public final class d0 {

    /* renamed from: m  reason: collision with root package name */
    public static final d0 f6140m;

    /* renamed from: n  reason: collision with root package name */
    public static final d0 f6141n;

    /* renamed from: o  reason: collision with root package name */
    public static final d0 f6142o;

    /* renamed from: p  reason: collision with root package name */
    public static final d0 f6143p;

    /* renamed from: q  reason: collision with root package name */
    public static final d0 f6144q;

    /* renamed from: r  reason: collision with root package name */
    public static final d0 f6145r;

    /* renamed from: s  reason: collision with root package name */
    public static final d0 f6146s;

    /* renamed from: t  reason: collision with root package name */
    public static final d0 f6147t;

    /* renamed from: u  reason: collision with root package name */
    public static final d0 f6148u;

    /* renamed from: v  reason: collision with root package name */
    public static final d0 f6149v;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ d0[] f6150w;

    /* renamed from: j  reason: collision with root package name */
    private final Class<?> f6151j;

    /* renamed from: k  reason: collision with root package name */
    private final Class<?> f6152k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f6153l;

    static {
        d0 d0Var = new d0("VOID", 0, Void.class, Void.class, null);
        f6140m = d0Var;
        Class cls = Integer.TYPE;
        d0 d0Var2 = new d0("INT", 1, cls, Integer.class, 0);
        f6141n = d0Var2;
        d0 d0Var3 = new d0("LONG", 2, Long.TYPE, Long.class, 0L);
        f6142o = d0Var3;
        d0 d0Var4 = new d0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6143p = d0Var4;
        d0 d0Var5 = new d0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6144q = d0Var5;
        d0 d0Var6 = new d0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6145r = d0Var6;
        d0 d0Var7 = new d0("STRING", 6, String.class, String.class, "");
        f6146s = d0Var7;
        d0 d0Var8 = new d0("BYTE_STRING", 7, i.class, i.class, i.f6190k);
        f6147t = d0Var8;
        d0 d0Var9 = new d0("ENUM", 8, cls, Integer.class, null);
        f6148u = d0Var9;
        d0 d0Var10 = new d0("MESSAGE", 9, Object.class, Object.class, null);
        f6149v = d0Var10;
        f6150w = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9, d0Var10};
    }

    private d0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f6151j = cls;
        this.f6152k = cls2;
        this.f6153l = obj;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f6150w.clone();
    }

    public Class<?> b() {
        return this.f6152k;
    }
}
