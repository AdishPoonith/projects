package com.google.crypto.tink.shaded.protobuf;

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
    public static final w f6386a0;

    /* renamed from: b0  reason: collision with root package name */
    public static final w f6387b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final w f6388c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final w f6389d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final w f6390e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final w f6391f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final w f6392g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final w f6393h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final w f6394i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final w f6395j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final w f6396k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final w f6397l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final w f6398m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final w[] f6399n0;

    /* renamed from: o  reason: collision with root package name */
    public static final w f6400o;

    /* renamed from: o0  reason: collision with root package name */
    private static final Type[] f6401o0;

    /* renamed from: p  reason: collision with root package name */
    public static final w f6402p;

    /* renamed from: p0  reason: collision with root package name */
    private static final /* synthetic */ w[] f6403p0;

    /* renamed from: q  reason: collision with root package name */
    public static final w f6404q;

    /* renamed from: r  reason: collision with root package name */
    public static final w f6405r;

    /* renamed from: s  reason: collision with root package name */
    public static final w f6406s;

    /* renamed from: t  reason: collision with root package name */
    public static final w f6407t;

    /* renamed from: u  reason: collision with root package name */
    public static final w f6408u;

    /* renamed from: v  reason: collision with root package name */
    public static final w f6409v;

    /* renamed from: w  reason: collision with root package name */
    public static final w f6410w;

    /* renamed from: x  reason: collision with root package name */
    public static final w f6411x;

    /* renamed from: y  reason: collision with root package name */
    public static final w f6412y;

    /* renamed from: z  reason: collision with root package name */
    public static final w f6413z;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f6414j;

    /* renamed from: k  reason: collision with root package name */
    private final int f6415k;

    /* renamed from: l  reason: collision with root package name */
    private final b f6416l;

    /* renamed from: m  reason: collision with root package name */
    private final Class<?> f6417m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f6418n;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6419a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6420b;

        static {
            int[] iArr = new int[d0.values().length];
            f6420b = iArr;
            try {
                iArr[d0.f6147t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6420b[d0.f6149v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6420b[d0.f6146s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f6419a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6419a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6419a[b.SCALAR.ordinal()] = 3;
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
        private final boolean f6426j;

        b(boolean z10) {
            this.f6426j = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        d0 d0Var = d0.f6144q;
        w wVar = new w("DOUBLE", 0, 0, bVar, d0Var);
        f6400o = wVar;
        d0 d0Var2 = d0.f6143p;
        w wVar2 = new w("FLOAT", 1, 1, bVar, d0Var2);
        f6402p = wVar2;
        d0 d0Var3 = d0.f6142o;
        w wVar3 = new w("INT64", 2, 2, bVar, d0Var3);
        f6404q = wVar3;
        w wVar4 = new w("UINT64", 3, 3, bVar, d0Var3);
        f6405r = wVar4;
        d0 d0Var4 = d0.f6141n;
        w wVar5 = new w("INT32", 4, 4, bVar, d0Var4);
        f6406s = wVar5;
        w wVar6 = new w("FIXED64", 5, 5, bVar, d0Var3);
        f6407t = wVar6;
        w wVar7 = new w("FIXED32", 6, 6, bVar, d0Var4);
        f6408u = wVar7;
        d0 d0Var5 = d0.f6145r;
        w wVar8 = new w("BOOL", 7, 7, bVar, d0Var5);
        f6409v = wVar8;
        d0 d0Var6 = d0.f6146s;
        w wVar9 = new w("STRING", 8, 8, bVar, d0Var6);
        f6410w = wVar9;
        d0 d0Var7 = d0.f6149v;
        w wVar10 = new w("MESSAGE", 9, 9, bVar, d0Var7);
        f6411x = wVar10;
        d0 d0Var8 = d0.f6147t;
        w wVar11 = new w("BYTES", 10, 10, bVar, d0Var8);
        f6412y = wVar11;
        w wVar12 = new w("UINT32", 11, 11, bVar, d0Var4);
        f6413z = wVar12;
        d0 d0Var9 = d0.f6148u;
        w wVar13 = new w("ENUM", 12, 12, bVar, d0Var9);
        A = wVar13;
        w wVar14 = new w("SFIXED32", 13, 13, bVar, d0Var4);
        B = wVar14;
        w wVar15 = new w("SFIXED64", 14, 14, bVar, d0Var3);
        C = wVar15;
        w wVar16 = new w("SINT32", 15, 15, bVar, d0Var4);
        D = wVar16;
        w wVar17 = new w("SINT64", 16, 16, bVar, d0Var3);
        E = wVar17;
        w wVar18 = new w("GROUP", 17, 17, bVar, d0Var7);
        F = wVar18;
        b bVar2 = b.VECTOR;
        w wVar19 = new w("DOUBLE_LIST", 18, 18, bVar2, d0Var);
        G = wVar19;
        w wVar20 = new w("FLOAT_LIST", 19, 19, bVar2, d0Var2);
        H = wVar20;
        w wVar21 = new w("INT64_LIST", 20, 20, bVar2, d0Var3);
        I = wVar21;
        w wVar22 = new w("UINT64_LIST", 21, 21, bVar2, d0Var3);
        J = wVar22;
        w wVar23 = new w("INT32_LIST", 22, 22, bVar2, d0Var4);
        K = wVar23;
        w wVar24 = new w("FIXED64_LIST", 23, 23, bVar2, d0Var3);
        L = wVar24;
        w wVar25 = new w("FIXED32_LIST", 24, 24, bVar2, d0Var4);
        M = wVar25;
        w wVar26 = new w("BOOL_LIST", 25, 25, bVar2, d0Var5);
        N = wVar26;
        w wVar27 = new w("STRING_LIST", 26, 26, bVar2, d0Var6);
        O = wVar27;
        w wVar28 = new w("MESSAGE_LIST", 27, 27, bVar2, d0Var7);
        P = wVar28;
        w wVar29 = new w("BYTES_LIST", 28, 28, bVar2, d0Var8);
        Q = wVar29;
        w wVar30 = new w("UINT32_LIST", 29, 29, bVar2, d0Var4);
        R = wVar30;
        w wVar31 = new w("ENUM_LIST", 30, 30, bVar2, d0Var9);
        S = wVar31;
        w wVar32 = new w("SFIXED32_LIST", 31, 31, bVar2, d0Var4);
        T = wVar32;
        w wVar33 = new w("SFIXED64_LIST", 32, 32, bVar2, d0Var3);
        U = wVar33;
        w wVar34 = new w("SINT32_LIST", 33, 33, bVar2, d0Var4);
        V = wVar34;
        w wVar35 = new w("SINT64_LIST", 34, 34, bVar2, d0Var3);
        W = wVar35;
        b bVar3 = b.PACKED_VECTOR;
        w wVar36 = new w("DOUBLE_LIST_PACKED", 35, 35, bVar3, d0Var);
        X = wVar36;
        w wVar37 = new w("FLOAT_LIST_PACKED", 36, 36, bVar3, d0Var2);
        Y = wVar37;
        w wVar38 = new w("INT64_LIST_PACKED", 37, 37, bVar3, d0Var3);
        Z = wVar38;
        w wVar39 = new w("UINT64_LIST_PACKED", 38, 38, bVar3, d0Var3);
        f6386a0 = wVar39;
        w wVar40 = new w("INT32_LIST_PACKED", 39, 39, bVar3, d0Var4);
        f6387b0 = wVar40;
        w wVar41 = new w("FIXED64_LIST_PACKED", 40, 40, bVar3, d0Var3);
        f6388c0 = wVar41;
        w wVar42 = new w("FIXED32_LIST_PACKED", 41, 41, bVar3, d0Var4);
        f6389d0 = wVar42;
        w wVar43 = new w("BOOL_LIST_PACKED", 42, 42, bVar3, d0Var5);
        f6390e0 = wVar43;
        w wVar44 = new w("UINT32_LIST_PACKED", 43, 43, bVar3, d0Var4);
        f6391f0 = wVar44;
        w wVar45 = new w("ENUM_LIST_PACKED", 44, 44, bVar3, d0Var9);
        f6392g0 = wVar45;
        w wVar46 = new w("SFIXED32_LIST_PACKED", 45, 45, bVar3, d0Var4);
        f6393h0 = wVar46;
        w wVar47 = new w("SFIXED64_LIST_PACKED", 46, 46, bVar3, d0Var3);
        f6394i0 = wVar47;
        w wVar48 = new w("SINT32_LIST_PACKED", 47, 47, bVar3, d0Var4);
        f6395j0 = wVar48;
        w wVar49 = new w("SINT64_LIST_PACKED", 48, 48, bVar3, d0Var3);
        f6396k0 = wVar49;
        w wVar50 = new w("GROUP_LIST", 49, 49, bVar2, d0Var7);
        f6397l0 = wVar50;
        w wVar51 = new w("MAP", 50, 50, b.MAP, d0.f6140m);
        f6398m0 = wVar51;
        f6403p0 = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15, wVar16, wVar17, wVar18, wVar19, wVar20, wVar21, wVar22, wVar23, wVar24, wVar25, wVar26, wVar27, wVar28, wVar29, wVar30, wVar31, wVar32, wVar33, wVar34, wVar35, wVar36, wVar37, wVar38, wVar39, wVar40, wVar41, wVar42, wVar43, wVar44, wVar45, wVar46, wVar47, wVar48, wVar49, wVar50, wVar51};
        f6401o0 = new Type[0];
        w[] values = values();
        f6399n0 = new w[values.length];
        for (w wVar52 : values) {
            f6399n0[wVar52.f6415k] = wVar52;
        }
    }

    private w(String str, int i10, int i11, b bVar, d0 d0Var) {
        int i12;
        this.f6415k = i11;
        this.f6416l = bVar;
        this.f6414j = d0Var;
        int i13 = a.f6419a[bVar.ordinal()];
        boolean z10 = true;
        this.f6417m = (i13 == 1 || i13 == 2) ? d0Var.b() : null;
        this.f6418n = (bVar != b.SCALAR || (i12 = a.f6420b[d0Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : false;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f6403p0.clone();
    }

    public int b() {
        return this.f6415k;
    }
}
