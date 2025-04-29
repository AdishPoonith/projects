package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.al  reason: invalid package */
/* loaded from: classes.dex */
public final class al {

    /* renamed from: a  reason: collision with root package name */
    private ll f4354a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f4355b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f4356c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ al(yk ykVar) {
    }

    public final al a(hv hvVar) {
        this.f4355b = hvVar;
        return this;
    }

    public final al b(Integer num) {
        this.f4356c = num;
        return this;
    }

    public final al c(ll llVar) {
        this.f4354a = llVar;
        return this;
    }

    public final cl d() {
        hv hvVar;
        gv b10;
        ll llVar = this.f4354a;
        if (llVar == null || (hvVar = this.f4355b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (llVar.a() == hvVar.a()) {
            if (llVar.d() && this.f4356c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f4354a.d() || this.f4356c == null) {
                if (this.f4354a.c() == jl.f4826e) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f4354a.c() == jl.f4825d || this.f4354a.c() == jl.f4824c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f4356c.intValue()).array());
                } else if (this.f4354a.c() != jl.f4823b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f4354a.c())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f4356c.intValue()).array());
                }
                return new cl(this.f4354a, this.f4355b, b10, this.f4356c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
