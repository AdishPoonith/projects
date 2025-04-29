package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bu  reason: invalid package */
/* loaded from: classes.dex */
public final class bu {
    public static int a(EllipticCurve ellipticCurve) {
        return (ui.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) {
        BigInteger a10 = ui.a(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(a10);
        if (a10.signum() == 1) {
            BigInteger mod2 = mod.mod(a10);
            BigInteger bigInteger2 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger2)) {
                if (a10.testBit(0) && a10.testBit(1)) {
                    bigInteger2 = mod2.modPow(a10.add(BigInteger.ONE).shiftRight(2), a10);
                } else if (a10.testBit(0) && !a10.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = a10.subtract(bigInteger2).shiftRight(1);
                    int i10 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(a10);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, a10);
                        BigInteger bigInteger3 = BigInteger.ONE;
                        if (modPow.add(bigInteger3).equals(a10)) {
                            BigInteger shiftRight2 = a10.add(bigInteger3).shiftRight(1);
                            BigInteger bigInteger4 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(a10).multiply(mod3)).mod(a10);
                                BigInteger mod4 = multiply.add(multiply).mod(a10);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(a10);
                                    bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(a10);
                                    bigInteger4 = mod5;
                                } else {
                                    bigInteger3 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger4;
                        } else if (!modPow.equals(bigInteger3)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        } else {
                            bigInteger2 = bigInteger2.add(bigInteger3);
                            i10++;
                            if (i10 == 128 && !a10.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                } else {
                    bigInteger2 = null;
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(a10).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z10 != bigInteger2.testBit(0) ? a10.subtract(bigInteger2).mod(a10) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static KeyPair c(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) lu.f4968g.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void d(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        e(eCPublicKey, eCPrivateKey);
        ui.b(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void e(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            ECParameterSpec eCParameterSpec = ui.f5456a;
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                return;
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static byte[] f(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        e(eCPublicKey, eCPrivateKey);
        ECPoint w10 = eCPublicKey.getW();
        ui.b(w10, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) lu.f4969h.a("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) lu.f4967f.a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(ui.a(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            b(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPrivateKey g(int i10, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) lu.f4969h.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), i(i10)));
    }

    public static ECPublicKey h(ECParameterSpec eCParameterSpec, int i10, byte[] bArr) {
        ECPoint eCPoint;
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a10 = a(curve);
        int i11 = i10 - 1;
        boolean z10 = false;
        if (i11 == 0) {
            int length = bArr.length;
            if (length != a10 + a10 + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i12 = a10 + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i12)), new BigInteger(1, Arrays.copyOfRange(bArr, i12, length)));
        } else if (i11 != 2) {
            BigInteger a11 = ui.a(curve);
            int length2 = bArr.length;
            if (length2 == a10 + 1) {
                byte b10 = bArr[0];
                if (b10 != 2) {
                    if (b10 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z10 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(a11) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, b(bigInteger, z10, curve));
                return (ECPublicKey) ((KeyFactory) lu.f4969h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
            }
            throw new GeneralSecurityException("compressed point has wrong length");
        } else {
            int length3 = bArr.length;
            if (length3 != a10 + a10) {
                throw new GeneralSecurityException("invalid point size");
            }
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a10)), new BigInteger(1, Arrays.copyOfRange(bArr, a10, length3)));
        }
        ui.b(eCPoint, curve);
        return (ECPublicKey) ((KeyFactory) lu.f4969h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    public static ECParameterSpec i(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? ui.f5458c : ui.f5457b : ui.f5456a;
    }
}
