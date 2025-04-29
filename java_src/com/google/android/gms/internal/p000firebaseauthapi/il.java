package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.il  reason: invalid package */
/* loaded from: classes.dex */
public final class il {

    /* renamed from: a  reason: collision with root package name */
    private Integer f4760a = null;

    /* renamed from: b  reason: collision with root package name */
    private Integer f4761b = null;

    /* renamed from: c  reason: collision with root package name */
    private jl f4762c = jl.f4826e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ il(hl hlVar) {
    }

    public final il a(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.f4760a = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
    }

    public final il b(int i10) {
        if (i10 >= 10 && i10 <= 16) {
            this.f4761b = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
    }

    public final il c(jl jlVar) {
        this.f4762c = jlVar;
        return this;
    }

    public final ll d() {
        Integer num = this.f4760a;
        if (num != null) {
            if (this.f4761b != null) {
                if (this.f4762c != null) {
                    return new ll(num.intValue(), this.f4761b.intValue(), this.f4762c, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }
}
