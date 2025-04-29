package com.google.protobuf;
/* loaded from: classes.dex */
class y implements u0 {

    /* renamed from: a  reason: collision with root package name */
    private static final y f7377a = new y();

    private y() {
    }

    public static y c() {
        return f7377a;
    }

    @Override // com.google.protobuf.u0
    public t0 a(Class<?> cls) {
        if (!z.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (t0) z.I(cls.asSubclass(z.class)).v();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.u0
    public boolean b(Class<?> cls) {
        return z.class.isAssignableFrom(cls);
    }
}
