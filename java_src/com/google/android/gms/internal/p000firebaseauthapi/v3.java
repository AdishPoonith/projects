package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.u3;
import com.google.android.gms.internal.p000firebaseauthapi.v3;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v3  reason: invalid package */
/* loaded from: classes.dex */
public abstract class v3<MessageType extends v3<MessageType, BuilderType>, BuilderType extends u3<MessageType, BuilderType>> implements w6 {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w6
    public final byte[] a() {
        try {
            int zzs = zzs();
            byte[] bArr = new byte[zzs];
            z4 d10 = z4.d(bArr, 0, zzs);
            d(d10);
            d10.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(j7 j7Var) {
        throw null;
    }

    public final void e(OutputStream outputStream) {
        int zzs = zzs();
        int i10 = z4.f5752d;
        if (zzs > 4096) {
            zzs = 4096;
        }
        x4 x4Var = new x4(outputStream, zzs);
        d(x4Var);
        x4Var.h();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.w6
    public final m4 zzo() {
        try {
            int zzs = zzs();
            m4 m4Var = m4.f4993k;
            byte[] bArr = new byte[zzs];
            z4 d10 = z4.d(bArr, 0, zzs);
            d(d10);
            d10.e();
            return new j4(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
