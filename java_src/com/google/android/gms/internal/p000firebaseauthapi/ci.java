package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ci  reason: invalid package */
/* loaded from: classes.dex */
final class ci extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ di f4452b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(di diVar, Class cls) {
        super(cls);
        this.f4452b = diVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        byte[] a10;
        byte[] b10;
        hr hrVar = (hr) w6Var;
        int H = hrVar.F().H() - 2;
        if (H == 1) {
            a10 = bv.a(32);
            a10[0] = (byte) (a10[0] | 7);
            int i10 = a10[31] & 63;
            a10[31] = (byte) i10;
            a10[31] = (byte) (i10 | 128);
            b10 = ev.b(a10);
        } else if (H != 2 && H != 3 && H != 4) {
            throw new GeneralSecurityException("Invalid KEM");
        } else {
            int g10 = gi.g(hrVar.F().H());
            KeyPair c10 = bu.c(bu.i(g10));
            ECPoint w10 = ((ECPublicKey) c10.getPublic()).getW();
            EllipticCurve curve = bu.i(g10).getCurve();
            ui.b(w10, curve);
            int a11 = bu.a(curve);
            int i11 = a11 + a11 + 1;
            b10 = new byte[i11];
            byte[] a12 = si.a(w10.getAffineX());
            byte[] a13 = si.a(w10.getAffineY());
            int length = a13.length;
            System.arraycopy(a13, 0, b10, i11 - length, length);
            int length2 = a12.length;
            System.arraycopy(a12, 0, b10, (a11 + 1) - length2, length2);
            b10[0] = 4;
            a10 = ((ECPrivateKey) c10.getPrivate()).getS().toByteArray();
        }
        pr E = qr.E();
        E.t(0);
        E.r(hrVar.F());
        E.s(m4.w(b10, 0, b10.length));
        mr D = nr.D();
        D.t(0);
        D.s((qr) E.j());
        D.r(m4.w(a10, 0, a10.length));
        return (nr) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return hr.E(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", di.l(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", di.l(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", di.l(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", di.l(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", di.l(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", di.l(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", di.l(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", di.l(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", di.l(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", di.l(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", di.l(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", di.l(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", di.l(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", di.l(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", di.l(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", di.l(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", di.l(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", di.l(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ void d(w6 w6Var) {
        gi.a(((hr) w6Var).F());
    }
}
