package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sb  reason: invalid package */
/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a  reason: collision with root package name */
    private dc f5339a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f5340b = null;

    /* renamed from: c  reason: collision with root package name */
    private hv f5341c = null;

    /* renamed from: d  reason: collision with root package name */
    private Integer f5342d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ sb(rb rbVar) {
    }

    public final sb a(hv hvVar) {
        this.f5340b = hvVar;
        return this;
    }

    public final sb b(hv hvVar) {
        this.f5341c = hvVar;
        return this;
    }

    public final sb c(Integer num) {
        this.f5342d = num;
        return this;
    }

    public final sb d(dc dcVar) {
        this.f5339a = dcVar;
        return this;
    }

    public final ub e() {
        gv b10;
        dc dcVar = this.f5339a;
        if (dcVar != null) {
            hv hvVar = this.f5340b;
            if (hvVar == null || this.f5341c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (dcVar.a() == hvVar.a()) {
                if (dcVar.b() == this.f5341c.a()) {
                    if (this.f5339a.d() && this.f5342d == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (this.f5339a.d() || this.f5342d == null) {
                        if (this.f5339a.c() == bc.f4395d) {
                            b10 = gv.b(new byte[0]);
                        } else if (this.f5339a.c() == bc.f4394c) {
                            b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5342d.intValue()).array());
                        } else if (this.f5339a.c() != bc.f4393b) {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f5339a.c())));
                        } else {
                            b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5342d.intValue()).array());
                        }
                        return new ub(this.f5339a, this.f5340b, this.f5341c, b10, this.f5342d, null);
                    }
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }
}
