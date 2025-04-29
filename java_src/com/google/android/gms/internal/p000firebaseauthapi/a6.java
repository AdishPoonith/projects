package com.google.android.gms.internal.p000firebaseauthapi;
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
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a6  reason: invalid package */
/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: m  reason: collision with root package name */
    public static final a6 f4322m;

    /* renamed from: n  reason: collision with root package name */
    public static final a6 f4323n;

    /* renamed from: o  reason: collision with root package name */
    public static final a6 f4324o;

    /* renamed from: p  reason: collision with root package name */
    public static final a6 f4325p;

    /* renamed from: q  reason: collision with root package name */
    public static final a6 f4326q;

    /* renamed from: r  reason: collision with root package name */
    public static final a6 f4327r;

    /* renamed from: s  reason: collision with root package name */
    public static final a6 f4328s;

    /* renamed from: t  reason: collision with root package name */
    public static final a6 f4329t;

    /* renamed from: u  reason: collision with root package name */
    public static final a6 f4330u;

    /* renamed from: v  reason: collision with root package name */
    public static final a6 f4331v;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a6[] f4332w;

    /* renamed from: j  reason: collision with root package name */
    private final Class f4333j;

    /* renamed from: k  reason: collision with root package name */
    private final Class f4334k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f4335l;

    static {
        a6 a6Var = new a6("VOID", 0, Void.class, Void.class, null);
        f4322m = a6Var;
        Class cls = Integer.TYPE;
        a6 a6Var2 = new a6("INT", 1, cls, Integer.class, 0);
        f4323n = a6Var2;
        a6 a6Var3 = new a6("LONG", 2, Long.TYPE, Long.class, 0L);
        f4324o = a6Var3;
        a6 a6Var4 = new a6("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f4325p = a6Var4;
        a6 a6Var5 = new a6("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f4326q = a6Var5;
        a6 a6Var6 = new a6("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f4327r = a6Var6;
        a6 a6Var7 = new a6("STRING", 6, String.class, String.class, "");
        f4328s = a6Var7;
        a6 a6Var8 = new a6("BYTE_STRING", 7, m4.class, m4.class, m4.f4993k);
        f4329t = a6Var8;
        a6 a6Var9 = new a6("ENUM", 8, cls, Integer.class, null);
        f4330u = a6Var9;
        a6 a6Var10 = new a6("MESSAGE", 9, Object.class, Object.class, null);
        f4331v = a6Var10;
        f4332w = new a6[]{a6Var, a6Var2, a6Var3, a6Var4, a6Var5, a6Var6, a6Var7, a6Var8, a6Var9, a6Var10};
    }

    private a6(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f4333j = cls;
        this.f4334k = cls2;
        this.f4335l = obj;
    }

    public static a6[] values() {
        return (a6[]) f4332w.clone();
    }

    public final Class b() {
        return this.f4334k;
    }
}
