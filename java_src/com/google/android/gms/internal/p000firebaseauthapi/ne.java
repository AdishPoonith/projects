package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ne  reason: invalid package */
/* loaded from: classes.dex */
public final class ne extends kb {

    /* renamed from: a  reason: collision with root package name */
    private final se f5069a;

    /* renamed from: b  reason: collision with root package name */
    private final hv f5070b;

    /* renamed from: c  reason: collision with root package name */
    private final gv f5071c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f5072d;

    private ne(se seVar, hv hvVar, gv gvVar, Integer num) {
        this.f5069a = seVar;
        this.f5070b = hvVar;
        this.f5071c = gvVar;
        this.f5072d = num;
    }

    public static ne a(re reVar, hv hvVar, Integer num) {
        gv b10;
        re reVar2 = re.f5288d;
        if (reVar != reVar2 && num == null) {
            String obj = reVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (reVar != reVar2 || num == null) {
            if (hvVar.a() != 32) {
                int a10 = hvVar.a();
                throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + a10);
            }
            se b11 = se.b(reVar);
            if (b11.a() == reVar2) {
                b10 = gv.b(new byte[0]);
            } else if (b11.a() == re.f5287c) {
                b10 = gv.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (b11.a() != re.f5286b) {
                throw new IllegalStateException("Unknown Variant: ".concat(b11.a().toString()));
            } else {
                b10 = gv.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            }
            return new ne(b11, hvVar, b10, num);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }
}
