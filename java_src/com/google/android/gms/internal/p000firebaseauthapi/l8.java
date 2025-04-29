package com.google.android.gms.internal.p000firebaseauthapi;

import sun.misc.Unsafe;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l8  reason: invalid package */
/* loaded from: classes.dex */
final class l8 extends n8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f5058a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f5058a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final void c(Object obj, long j10, boolean z10) {
        if (o8.f5125h) {
            o8.d(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            o8.e(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final void d(Object obj, long j10, byte b10) {
        if (o8.f5125h) {
            o8.d(obj, j10, b10);
        } else {
            o8.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final void e(Object obj, long j10, double d10) {
        this.f5058a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final void f(Object obj, long j10, float f10) {
        this.f5058a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n8
    public final boolean g(Object obj, long j10) {
        return o8.f5125h ? o8.y(obj, j10) : o8.z(obj, j10);
    }
}
