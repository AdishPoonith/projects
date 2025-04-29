package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ee  reason: invalid package */
/* loaded from: classes.dex */
public final class ee {

    /* renamed from: a  reason: collision with root package name */
    private Integer f4545a = null;

    /* renamed from: b  reason: collision with root package name */
    private fe f4546b = fe.f4581d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ee(de deVar) {
    }

    public final ee a(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.f4545a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
    }

    public final ee b(fe feVar) {
        this.f4546b = feVar;
        return this;
    }

    public final he c() {
        Integer num = this.f4545a;
        if (num != null) {
            if (this.f4546b != null) {
                return new he(num.intValue(), this.f4546b, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
