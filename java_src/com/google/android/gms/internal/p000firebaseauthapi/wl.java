package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wl  reason: invalid package */
/* loaded from: classes.dex */
public final class wl {

    /* renamed from: a  reason: collision with root package name */
    private jm f5602a = null;

    /* renamed from: b  reason: collision with root package name */
    private hv f5603b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f5604c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wl(vl vlVar) {
    }

    public final wl a(Integer num) {
        this.f5604c = num;
        return this;
    }

    public final wl b(hv hvVar) {
        this.f5603b = hvVar;
        return this;
    }

    public final wl c(jm jmVar) {
        this.f5602a = jmVar;
        return this;
    }

    public final yl d() {
        hv hvVar;
        gv b10;
        jm jmVar = this.f5602a;
        if (jmVar == null || (hvVar = this.f5603b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jmVar.a() == hvVar.a()) {
            if (jmVar.d() && this.f5604c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (this.f5602a.d() || this.f5604c == null) {
                if (this.f5602a.c() == hm.f4700e) {
                    b10 = gv.b(new byte[0]);
                } else if (this.f5602a.c() == hm.f4699d || this.f5602a.c() == hm.f4698c) {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f5604c.intValue()).array());
                } else if (this.f5602a.c() != hm.f4697b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f5602a.c())));
                } else {
                    b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f5604c.intValue()).array());
                }
                return new yl(this.f5602a, this.f5603b, b10, this.f5604c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
