package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wf  reason: invalid package */
/* loaded from: classes.dex */
abstract class wf {

    /* renamed from: a  reason: collision with root package name */
    int[] f5597a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5598b;

    public wf(byte[] bArr, int i10) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5597a = rf.d(bArr);
        this.f5598b = i10;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer c(byte[] bArr, int i10) {
        int[] b10 = b(rf.d(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        rf.c(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            int a10 = a();
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a10);
        }
        int remaining = byteBuffer.remaining();
        int i10 = remaining / 64;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i11 >= i12) {
                return allocate.array();
            }
            ByteBuffer c10 = c(bArr, this.f5598b + i11);
            if (i11 == i12 - 1) {
                ut.a(allocate, byteBuffer, c10, remaining % 64);
            } else {
                ut.a(allocate, byteBuffer, c10, 64);
            }
            i11++;
        }
    }
}
