package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.md  reason: invalid package */
/* loaded from: classes.dex */
public final class md {

    /* renamed from: a  reason: collision with root package name */
    private Integer f5002a = null;

    /* renamed from: b  reason: collision with root package name */
    private Integer f5003b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5004c = null;

    /* renamed from: d  reason: collision with root package name */
    private nd f5005d = nd.f5067d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ md(ld ldVar) {
    }

    public final md a(int i10) {
        this.f5003b = 12;
        return this;
    }

    public final md b(int i10) {
        if (i10 == 16 || i10 == 24 || i10 == 32) {
            this.f5002a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
    }

    public final md c(int i10) {
        this.f5004c = 16;
        return this;
    }

    public final md d(nd ndVar) {
        this.f5005d = ndVar;
        return this;
    }

    public final pd e() {
        Integer num = this.f5002a;
        if (num != null) {
            if (this.f5005d != null) {
                if (this.f5003b != null) {
                    if (this.f5004c != null) {
                        int intValue = num.intValue();
                        this.f5003b.intValue();
                        this.f5004c.intValue();
                        return new pd(intValue, 12, 16, this.f5005d, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }
}
