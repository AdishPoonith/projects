package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class r4 extends t4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(j(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(i(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final void c(Object obj, long j10, boolean z10) {
        if (u4.f4256g) {
            u4.i(obj, j10, z10);
        } else {
            u4.j(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final void d(Object obj, long j10, double d10) {
        n(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final void e(Object obj, long j10, float f10) {
        m(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.t4
    public final boolean f(Object obj, long j10) {
        return u4.f4256g ? u4.q(obj, j10) : u4.r(obj, j10);
    }
}
