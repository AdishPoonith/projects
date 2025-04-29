package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f7426a = H();

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f7427b = com.google.protobuf.d.b();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f7428c = q(Long.TYPE);

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f7429d = q(Integer.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final e f7430e = F();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f7431f = X();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f7432g = W();

    /* renamed from: h  reason: collision with root package name */
    static final long f7433h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f7434i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f7435j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f7436k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f7437l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f7438m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f7439n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f7440o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f7441p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f7442q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f7443r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f7444s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f7445t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f7446u;

    /* renamed from: v  reason: collision with root package name */
    private static final int f7447v;

    /* renamed from: w  reason: collision with root package name */
    static final boolean f7448w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j10) {
            return z1.f7448w ? z1.u(obj, j10) : z1.v(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j10) {
            return z1.f7448w ? z1.y(obj, j10) : z1.z(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j10, boolean z10) {
            if (z1.f7448w) {
                z1.M(obj, j10, z10);
            } else {
                z1.N(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j10, byte b10) {
            if (z1.f7448w) {
                z1.P(obj, j10, b10);
            } else {
                z1.Q(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j10) {
            return z1.f7448w ? z1.u(obj, j10) : z1.v(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j10) {
            return z1.f7448w ? z1.y(obj, j10) : z1.z(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j10) {
            return Double.longBitsToDouble(k(obj, j10));
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j10) {
            return Float.intBitsToFloat(i(obj, j10));
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j10, boolean z10) {
            if (z1.f7448w) {
                z1.M(obj, j10, z10);
            } else {
                z1.N(obj, j10, z10);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j10, byte b10) {
            if (z1.f7448w) {
                z1.P(obj, j10, b10);
            } else {
                z1.Q(obj, j10, b10);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j10, double d10) {
            s(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j10, float f10) {
            r(obj, j10, Float.floatToIntBits(f10));
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j10, byte[] bArr, long j11, long j12) {
            this.f7449a.copyMemory((Object) null, j10, bArr, z1.f7433h + j11, j12);
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j10) {
            return this.f7449a.getBoolean(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j10) {
            return this.f7449a.getByte(j10);
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j10) {
            return this.f7449a.getByte(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j10) {
            return this.f7449a.getDouble(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j10) {
            return this.f7449a.getFloat(obj, j10);
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j10) {
            return this.f7449a.getLong(j10);
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j10, boolean z10) {
            this.f7449a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j10, byte b10) {
            this.f7449a.putByte(obj, j10, b10);
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j10, double d10) {
            this.f7449a.putDouble(obj, j10, d10);
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j10, float f10) {
            this.f7449a.putFloat(obj, j10, f10);
        }

        @Override // com.google.protobuf.z1.e
        public boolean u() {
            if (super.u()) {
                try {
                    Class<?> cls = this.f7449a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    z1.K(th);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            if (super.v()) {
                try {
                    Class<?> cls = this.f7449a.getClass();
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, Integer.TYPE);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                    return true;
                } catch (Throwable th) {
                    z1.K(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f7449a;

        e(Unsafe unsafe) {
            this.f7449a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f7449a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f7449a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract boolean d(Object obj, long j10);

        public abstract byte e(long j10);

        public abstract byte f(Object obj, long j10);

        public abstract double g(Object obj, long j10);

        public abstract float h(Object obj, long j10);

        public final int i(Object obj, long j10) {
            return this.f7449a.getInt(obj, j10);
        }

        public abstract long j(long j10);

        public final long k(Object obj, long j10) {
            return this.f7449a.getLong(obj, j10);
        }

        public final Object l(Object obj, long j10) {
            return this.f7449a.getObject(obj, j10);
        }

        public final long m(Field field) {
            return this.f7449a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j10, boolean z10);

        public abstract void o(Object obj, long j10, byte b10);

        public abstract void p(Object obj, long j10, double d10);

        public abstract void q(Object obj, long j10, float f10);

        public final void r(Object obj, long j10, int i10) {
            this.f7449a.putInt(obj, j10, i10);
        }

        public final void s(Object obj, long j10, long j11) {
            this.f7449a.putLong(obj, j10, j11);
        }

        public final void t(Object obj, long j10, Object obj2) {
            this.f7449a.putObject(obj, j10, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f7449a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f7449a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z1.b() != null;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }
    }

    static {
        long m10 = m(byte[].class);
        f7433h = m10;
        f7434i = m(boolean[].class);
        f7435j = n(boolean[].class);
        f7436k = m(int[].class);
        f7437l = n(int[].class);
        f7438m = m(long[].class);
        f7439n = n(long[].class);
        f7440o = m(float[].class);
        f7441p = n(float[].class);
        f7442q = m(double[].class);
        f7443r = n(double[].class);
        f7444s = m(Object[].class);
        f7445t = n(Object[].class);
        f7446u = s(o());
        f7447v = (int) (7 & m10);
        f7448w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private z1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double A(Object obj, long j10) {
        return f7430e.g(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float B(Object obj, long j10) {
        return f7430e.h(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(Object obj, long j10) {
        return f7430e.i(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long D(long j10) {
        return f7430e.j(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long E(Object obj, long j10) {
        return f7430e.k(obj, j10);
    }

    private static e F() {
        Unsafe unsafe = f7426a;
        if (unsafe == null) {
            return null;
        }
        if (com.google.protobuf.d.c()) {
            if (f7428c) {
                return new c(unsafe);
            }
            if (f7429d) {
                return new b(unsafe);
            }
            return null;
        }
        return new d(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object G(Object obj, long j10) {
        return f7430e.l(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean I() {
        return f7432g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J() {
        return f7431f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Throwable th) {
        Logger logger = Logger.getLogger(z1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L(Object obj, long j10, boolean z10) {
        f7430e.n(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j10, boolean z10) {
        P(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j10, boolean z10) {
        Q(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(byte[] bArr, long j10, byte b10) {
        f7430e.o(bArr, f7433h + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int C = C(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (C & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        T(obj, j11, ((255 & b10) << i10) | (C(obj, j11) & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(Object obj, long j10, double d10) {
        f7430e.p(obj, j10, d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void S(Object obj, long j10, float f10) {
        f7430e.q(obj, j10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(Object obj, long j10, int i10) {
        f7430e.r(obj, j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void U(Object obj, long j10, long j11) {
        f7430e.s(obj, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void V(Object obj, long j10, Object obj2) {
        f7430e.t(obj, j10, obj2);
    }

    private static boolean W() {
        e eVar = f7430e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    private static boolean X() {
        e eVar = f7430e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    static /* synthetic */ Field b() {
        return o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long k(ByteBuffer byteBuffer) {
        return f7430e.k(byteBuffer, f7446u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T l(Class<T> cls) {
        try {
            return (T) f7426a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int m(Class<?> cls) {
        if (f7432g) {
            return f7430e.a(cls);
        }
        return -1;
    }

    private static int n(Class<?> cls) {
        if (f7432g) {
            return f7430e.b(cls);
        }
        return -1;
    }

    private static Field o() {
        Field r10;
        if (!com.google.protobuf.d.c() || (r10 = r(Buffer.class, "effectiveDirectAddress")) == null) {
            Field r11 = r(Buffer.class, "address");
            if (r11 == null || r11.getType() != Long.TYPE) {
                return null;
            }
            return r11;
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(long j10, byte[] bArr, long j11, long j12) {
        f7430e.c(j10, bArr, j11, j12);
    }

    static boolean q(Class<?> cls) {
        if (com.google.protobuf.d.c()) {
            try {
                Class<?> cls2 = f7427b;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f7430e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(Object obj, long j10) {
        return f7430e.d(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j10) {
        return y(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j10) {
        return z(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte w(long j10) {
        return f7430e.e(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte x(byte[] bArr, long j10) {
        return f7430e.f(bArr, f7433h + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j10) {
        return (byte) ((C(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }
}
