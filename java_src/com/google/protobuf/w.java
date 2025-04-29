package com.google.protobuf;

import java.lang.reflect.Type;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum o uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class w {
    public static final w A;
    public static final w B;
    public static final w C;
    public static final w D;
    public static final w E;
    public static final w F;
    public static final w G;
    public static final w H;
    public static final w I;
    public static final w J;
    public static final w K;
    public static final w L;
    public static final w M;
    public static final w N;
    public static final w O;
    public static final w P;
    public static final w Q;
    public static final w R;
    public static final w S;
    public static final w T;
    public static final w U;
    public static final w V;
    public static final w W;
    public static final w X;
    public static final w Y;
    public static final w Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final w f7326a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final w f7327b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final w f7328c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final w f7329d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final w f7330e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final w f7331f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final w f7332g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final w f7333h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final w f7334i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final w f7335j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final w f7336k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final w f7337l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final w f7338m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final w[] f7339n0;

    /* renamed from: o  reason: collision with root package name */
    public static final w f7340o;

    /* renamed from: o0  reason: collision with root package name */
    private static final Type[] f7341o0;

    /* renamed from: p  reason: collision with root package name */
    public static final w f7342p;

    /* renamed from: p0  reason: collision with root package name */
    private static final /* synthetic */ w[] f7343p0;

    /* renamed from: q  reason: collision with root package name */
    public static final w f7344q;

    /* renamed from: r  reason: collision with root package name */
    public static final w f7345r;

    /* renamed from: s  reason: collision with root package name */
    public static final w f7346s;

    /* renamed from: t  reason: collision with root package name */
    public static final w f7347t;

    /* renamed from: u  reason: collision with root package name */
    public static final w f7348u;

    /* renamed from: v  reason: collision with root package name */
    public static final w f7349v;

    /* renamed from: w  reason: collision with root package name */
    public static final w f7350w;

    /* renamed from: x  reason: collision with root package name */
    public static final w f7351x;

    /* renamed from: y  reason: collision with root package name */
    public static final w f7352y;

    /* renamed from: z  reason: collision with root package name */
    public static final w f7353z;

    /* renamed from: j  reason: collision with root package name */
    private final g0 f7354j;

    /* renamed from: k  reason: collision with root package name */
    private final int f7355k;

    /* renamed from: l  reason: collision with root package name */
    private final b f7356l;

    /* renamed from: m  reason: collision with root package name */
    private final Class<?> f7357m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f7358n;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7359a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7360b;

        static {
            int[] iArr = new int[g0.values().length];
            f7360b = iArr;
            try {
                iArr[g0.f7130t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7360b[g0.f7132v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7360b[g0.f7129s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f7359a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7359a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7359a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: j  reason: collision with root package name */
        private final boolean f7366j;

        b(boolean z10) {
            this.f7366j = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        g0 g0Var = g0.f7127q;
        w wVar = new w("DOUBLE", 0, 0, bVar, g0Var);
        f7340o = wVar;
        g0 g0Var2 = g0.f7126p;
        w wVar2 = new w("FLOAT", 1, 1, bVar, g0Var2);
        f7342p = wVar2;
        g0 g0Var3 = g0.f7125o;
        w wVar3 = new w("INT64", 2, 2, bVar, g0Var3);
        f7344q = wVar3;
        w wVar4 = new w("UINT64", 3, 3, bVar, g0Var3);
        f7345r = wVar4;
        g0 g0Var4 = g0.f7124n;
        w wVar5 = new w("INT32", 4, 4, bVar, g0Var4);
        f7346s = wVar5;
        w wVar6 = new w("FIXED64", 5, 5, bVar, g0Var3);
        f7347t = wVar6;
        w wVar7 = new w("FIXED32", 6, 6, bVar, g0Var4);
        f7348u = wVar7;
        g0 g0Var5 = g0.f7128r;
        w wVar8 = new w("BOOL", 7, 7, bVar, g0Var5);
        f7349v = wVar8;
        g0 g0Var6 = g0.f7129s;
        w wVar9 = new w("STRING", 8, 8, bVar, g0Var6);
        f7350w = wVar9;
        g0 g0Var7 = g0.f7132v;
        w wVar10 = new w("MESSAGE", 9, 9, bVar, g0Var7);
        f7351x = wVar10;
        g0 g0Var8 = g0.f7130t;
        w wVar11 = new w("BYTES", 10, 10, bVar, g0Var8);
        f7352y = wVar11;
        w wVar12 = new w("UINT32", 11, 11, bVar, g0Var4);
        f7353z = wVar12;
        g0 g0Var9 = g0.f7131u;
        w wVar13 = new w("ENUM", 12, 12, bVar, g0Var9);
        A = wVar13;
        w wVar14 = new w("SFIXED32", 13, 13, bVar, g0Var4);
        B = wVar14;
        w wVar15 = new w("SFIXED64", 14, 14, bVar, g0Var3);
        C = wVar15;
        w wVar16 = new w("SINT32", 15, 15, bVar, g0Var4);
        D = wVar16;
        w wVar17 = new w("SINT64", 16, 16, bVar, g0Var3);
        E = wVar17;
        w wVar18 = new w("GROUP", 17, 17, bVar, g0Var7);
        F = wVar18;
        b bVar2 = b.VECTOR;
        w wVar19 = new w("DOUBLE_LIST", 18, 18, bVar2, g0Var);
        G = wVar19;
        w wVar20 = new w("FLOAT_LIST", 19, 19, bVar2, g0Var2);
        H = wVar20;
        w wVar21 = new w("INT64_LIST", 20, 20, bVar2, g0Var3);
        I = wVar21;
        w wVar22 = new w("UINT64_LIST", 21, 21, bVar2, g0Var3);
        J = wVar22;
        w wVar23 = new w("INT32_LIST", 22, 22, bVar2, g0Var4);
        K = wVar23;
        w wVar24 = new w("FIXED64_LIST", 23, 23, bVar2, g0Var3);
        L = wVar24;
        w wVar25 = new w("FIXED32_LIST", 24, 24, bVar2, g0Var4);
        M = wVar25;
        w wVar26 = new w("BOOL_LIST", 25, 25, bVar2, g0Var5);
        N = wVar26;
        w wVar27 = new w("STRING_LIST", 26, 26, bVar2, g0Var6);
        O = wVar27;
        w wVar28 = new w("MESSAGE_LIST", 27, 27, bVar2, g0Var7);
        P = wVar28;
        w wVar29 = new w("BYTES_LIST", 28, 28, bVar2, g0Var8);
        Q = wVar29;
        w wVar30 = new w("UINT32_LIST", 29, 29, bVar2, g0Var4);
        R = wVar30;
        w wVar31 = new w("ENUM_LIST", 30, 30, bVar2, g0Var9);
        S = wVar31;
        w wVar32 = new w("SFIXED32_LIST", 31, 31, bVar2, g0Var4);
        T = wVar32;
        w wVar33 = new w("SFIXED64_LIST", 32, 32, bVar2, g0Var3);
        U = wVar33;
        w wVar34 = new w("SINT32_LIST", 33, 33, bVar2, g0Var4);
        V = wVar34;
        w wVar35 = new w("SINT64_LIST", 34, 34, bVar2, g0Var3);
        W = wVar35;
        b bVar3 = b.PACKED_VECTOR;
        w wVar36 = new w("DOUBLE_LIST_PACKED", 35, 35, bVar3, g0Var);
        X = wVar36;
        w wVar37 = new w("FLOAT_LIST_PACKED", 36, 36, bVar3, g0Var2);
        Y = wVar37;
        w wVar38 = new w("INT64_LIST_PACKED", 37, 37, bVar3, g0Var3);
        Z = wVar38;
        w wVar39 = new w("UINT64_LIST_PACKED", 38, 38, bVar3, g0Var3);
        f7326a0 = wVar39;
        w wVar40 = new w("INT32_LIST_PACKED", 39, 39, bVar3, g0Var4);
        f7327b0 = wVar40;
        w wVar41 = new w("FIXED64_LIST_PACKED", 40, 40, bVar3, g0Var3);
        f7328c0 = wVar41;
        w wVar42 = new w("FIXED32_LIST_PACKED", 41, 41, bVar3, g0Var4);
        f7329d0 = wVar42;
        w wVar43 = new w("BOOL_LIST_PACKED", 42, 42, bVar3, g0Var5);
        f7330e0 = wVar43;
        w wVar44 = new w("UINT32_LIST_PACKED", 43, 43, bVar3, g0Var4);
        f7331f0 = wVar44;
        w wVar45 = new w("ENUM_LIST_PACKED", 44, 44, bVar3, g0Var9);
        f7332g0 = wVar45;
        w wVar46 = new w("SFIXED32_LIST_PACKED", 45, 45, bVar3, g0Var4);
        f7333h0 = wVar46;
        w wVar47 = new w("SFIXED64_LIST_PACKED", 46, 46, bVar3, g0Var3);
        f7334i0 = wVar47;
        w wVar48 = new w("SINT32_LIST_PACKED", 47, 47, bVar3, g0Var4);
        f7335j0 = wVar48;
        w wVar49 = new w("SINT64_LIST_PACKED", 48, 48, bVar3, g0Var3);
        f7336k0 = wVar49;
        w wVar50 = new w("GROUP_LIST", 49, 49, bVar2, g0Var7);
        f7337l0 = wVar50;
        w wVar51 = new w("MAP", 50, 50, b.MAP, g0.f7123m);
        f7338m0 = wVar51;
        f7343p0 = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15, wVar16, wVar17, wVar18, wVar19, wVar20, wVar21, wVar22, wVar23, wVar24, wVar25, wVar26, wVar27, wVar28, wVar29, wVar30, wVar31, wVar32, wVar33, wVar34, wVar35, wVar36, wVar37, wVar38, wVar39, wVar40, wVar41, wVar42, wVar43, wVar44, wVar45, wVar46, wVar47, wVar48, wVar49, wVar50, wVar51};
        f7341o0 = new Type[0];
        w[] values = values();
        f7339n0 = new w[values.length];
        for (w wVar52 : values) {
            f7339n0[wVar52.f7355k] = wVar52;
        }
    }

    private w(String str, int i10, int i11, b bVar, g0 g0Var) {
        int i12;
        this.f7355k = i11;
        this.f7356l = bVar;
        this.f7354j = g0Var;
        int i13 = a.f7359a[bVar.ordinal()];
        boolean z10 = true;
        this.f7357m = (i13 == 1 || i13 == 2) ? g0Var.b() : null;
        this.f7358n = (bVar != b.SCALAR || (i12 = a.f7360b[g0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : false;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f7343p0.clone();
    }

    public int b() {
        return this.f7355k;
    }
}
