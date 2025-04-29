package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.eh  reason: invalid package */
/* loaded from: classes.dex */
final class eh extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ fh f4548b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(fh fhVar, Class cls) {
        super(cls);
        this.f4548b = fhVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        yp ypVar = (yp) w6Var;
        KeyPair c10 = bu.c(bu.i(oh.c(ypVar.F().G().H())));
        ECPoint w10 = ((ECPublicKey) c10.getPublic()).getW();
        hq E = iq.E();
        E.s(0);
        E.r(ypVar.F());
        byte[] byteArray = w10.getAffineX().toByteArray();
        m4 m4Var = m4.f4993k;
        E.t(m4.w(byteArray, 0, byteArray.length));
        byte[] byteArray2 = w10.getAffineY().toByteArray();
        E.u(m4.w(byteArray2, 0, byteArray2.length));
        dq D = fq.D();
        D.t(0);
        D.s((iq) E.j());
        byte[] byteArray3 = ((ECPrivateKey) c10.getPrivate()).getS().toByteArray();
        D.r(m4.w(byteArray3, 0, byteArray3.length));
        return (fq) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return yp.E(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        ja a10 = ka.a("AES128_GCM");
        bArr = fh.f4585e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", fh.m(4, 5, 3, a10, bArr, 1));
        ja a11 = ka.a("AES128_GCM");
        bArr2 = fh.f4585e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", fh.m(4, 5, 3, a11, bArr2, 3));
        ja a12 = ka.a("AES128_GCM");
        bArr3 = fh.f4585e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", fh.m(4, 5, 4, a12, bArr3, 1));
        ja a13 = ka.a("AES128_GCM");
        bArr4 = fh.f4585e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", fh.m(4, 5, 4, a13, bArr4, 3));
        ja a14 = ka.a("AES128_GCM");
        bArr5 = fh.f4585e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", fh.m(4, 5, 4, a14, bArr5, 3));
        ja a15 = ka.a("AES128_CTR_HMAC_SHA256");
        bArr6 = fh.f4585e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", fh.m(4, 5, 3, a15, bArr6, 1));
        ja a16 = ka.a("AES128_CTR_HMAC_SHA256");
        bArr7 = fh.f4585e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", fh.m(4, 5, 3, a16, bArr7, 3));
        ja a17 = ka.a("AES128_CTR_HMAC_SHA256");
        bArr8 = fh.f4585e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", fh.m(4, 5, 4, a17, bArr8, 1));
        ja a18 = ka.a("AES128_CTR_HMAC_SHA256");
        bArr9 = fh.f4585e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", fh.m(4, 5, 4, a18, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ void d(w6 w6Var) {
        oh.a(((yp) w6Var).F());
    }
}
