package com.google.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n0 implements o1 {

    /* renamed from: b  reason: collision with root package name */
    private static final u0 f7263b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final u0 f7264a;

    /* loaded from: classes.dex */
    static class a implements u0 {
        a() {
        }

        @Override // com.google.protobuf.u0
        public t0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.u0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements u0 {

        /* renamed from: a  reason: collision with root package name */
        private u0[] f7265a;

        b(u0... u0VarArr) {
            this.f7265a = u0VarArr;
        }

        @Override // com.google.protobuf.u0
        public t0 a(Class<?> cls) {
            u0[] u0VarArr;
            for (u0 u0Var : this.f7265a) {
                if (u0Var.b(cls)) {
                    return u0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.u0
        public boolean b(Class<?> cls) {
            for (u0 u0Var : this.f7265a) {
                if (u0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public n0() {
        this(b());
    }

    private n0(u0 u0Var) {
        this.f7264a = (u0) d0.b(u0Var, "messageInfoFactory");
    }

    private static u0 b() {
        return new b(y.c(), c());
    }

    private static u0 c() {
        try {
            return (u0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f7263b;
        }
    }

    private static boolean d(t0 t0Var) {
        return t0Var.b() == h1.PROTO2;
    }

    private static <T> n1<T> e(Class<T> cls, t0 t0Var) {
        return z.class.isAssignableFrom(cls) ? d(t0Var) ? y0.V(cls, t0Var, c1.b(), l0.b(), p1.M(), t.b(), s0.b()) : y0.V(cls, t0Var, c1.b(), l0.b(), p1.M(), null, s0.b()) : d(t0Var) ? y0.V(cls, t0Var, c1.a(), l0.a(), p1.H(), t.a(), s0.a()) : y0.V(cls, t0Var, c1.a(), l0.a(), p1.I(), null, s0.a());
    }

    @Override // com.google.protobuf.o1
    public <T> n1<T> a(Class<T> cls) {
        v1<?, ?> H;
        r<?> a10;
        p1.J(cls);
        t0 a11 = this.f7264a.a(cls);
        if (a11.a()) {
            if (z.class.isAssignableFrom(cls)) {
                H = p1.M();
                a10 = t.b();
            } else {
                H = p1.H();
                a10 = t.a();
            }
            return z0.m(H, a10, a11.c());
        }
        return e(cls, a11);
    }
}
