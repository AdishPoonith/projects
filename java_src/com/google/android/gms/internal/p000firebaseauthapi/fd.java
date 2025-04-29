package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fd  reason: invalid package */
/* loaded from: classes.dex */
public final class fd {

    /* renamed from: a  reason: collision with root package name */
    private pd f4576a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f4577b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f4578c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ fd(ed edVar) {
    }

    public final fd a(Integer num) {
        this.f4578c = num;
        return this;
    }

    public final fd b(hv hvVar) {
        this.f4577b = hvVar;
        return this;
    }

    public final fd c(pd pdVar) {
        this.f4576a = pdVar;
        return this;
    }

    public final hd d() {
        hv hvVar;
        gv b10;
        pd pdVar = this.f4576a;
        if (pdVar == null || (hvVar = this.f4577b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (pdVar.a() == hvVar.a()) {
            if (pdVar.c() && this.f4578c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f4576a.c() || this.f4578c == null) {
                if (this.f4576a.b() == nd.f5067d) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f4576a.b() == nd.f5066c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4578c.intValue()).array());
                } else if (this.f4576a.b() != nd.f5065b) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f4576a.b())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4578c.intValue()).array());
                }
                return new hd(this.f4576a, this.f4577b, b10, this.f4578c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
